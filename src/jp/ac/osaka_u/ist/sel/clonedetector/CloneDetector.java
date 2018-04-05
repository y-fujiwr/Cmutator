package jp.ac.osaka_u.ist.sel.clonedetector;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

import jp.ac.osaka_u.ist.sel.clonedetector.analyze.CAnalyzer4;
import jp.ac.osaka_u.ist.sel.clonedetector.data.Block;
import jp.ac.osaka_u.ist.sel.clonedetector.data.ClonePair;
import jp.ac.osaka_u.ist.sel.clonedetector.data.Method;

public class CloneDetector {
	public static final String PARAM_FILE = "dataset.txt.params";
	public static final String DATASET_FILE = "dataset.txt";
	public static final String LSH_FILE = "lsh_result.txt";
	public static final String LSH_LOG = "lsh_log.txt";
	public static final String RESULT_FILE = "result.txt";
	public static final String RESULT_CSV = "result.csv";
	public static final String BLOCKLIST_CSV = "blocklist.csv";
	public static final boolean enableBlockExtract = true;
	public static final boolean removeMethodPair = false;
	public static final boolean lda = false;
	public static boolean endStatus = false;

	public static String javaClassPath;

	public static ArrayList<Method> methodList = new ArrayList<Method>();
	public static ArrayList<Block> blockList = new ArrayList<Block>();
	public static ArrayList<ClonePair> clonePairList;
	public static HashMap<String, Integer> wordMap = new HashMap<String, Integer>();
	public static Connection connection;
	public static int countMethod, countBlock, countLine;
	private static final String version = "1.0";

	/**
	 * <p>
	 * メイン
	 * <p>
	 *
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		System.out.println("CMutator " + version);
		setJavaClassPath();
		commandOption(args);

		long start = System.currentTimeMillis();
		long subStart = start;
		long currentTime;

		connection = DriverManager.getConnection("jdbc:sqlite::memory:");

		countMethod = 0;
		countBlock = 0;
		countLine = 0;


			CAnalyzer4 canalyzer = new CAnalyzer4();
			canalyzer.searchFile(new File(Config.target).getAbsoluteFile());

		System.out.println("The number of methods : " + countMethod + "\nThe line : " + countLine);

		// System.out.println("wordmap.size = " + wordMap.size());
		currentTime = System.currentTimeMillis();
		System.out.println("Calculate vector done : " + (currentTime - subStart) + "/" + (currentTime - start) + "\n");

	}

	private static void setJavaClassPath() {
		javaClassPath = new File(System.getProperty("java.class.path")).getParent();
		if (javaClassPath == null)
			javaClassPath = System.getProperty("user.dir");
		if (javaClassPath.contains("\\bin"))
			javaClassPath = System.getProperty("user.dir");
		javaClassPath = javaClassPath + "\\";

	}

	private static void commandOption(String[] args) {
		Options options = new Options();
		options.addOption(Option.builder("h").longOpt("help").desc("display help").build());
		options.addOption(Option.builder("d").longOpt("dir").desc("select directory for clone detection").hasArg()
				.argName("dirname").build());
		options.addOption(Option.builder("l").longOpt("lang")
				.desc("select language from following ( default: java )\r\n  * java\r\n  * c").hasArg().argName("lang")
				.build());
		// options.addOption(Option.builder("p").longOpt("param").desc("select
		// parameter file for LSH
		// execution").hasArg().argName("*.param").build());
		options.addOption(Option.builder("oc").longOpt("outputcsv")
				.desc("select csv file name for output ( default: result.csv )").hasArg().argName("*.csv").build());
		options.addOption(Option.builder("ot").longOpt("outputtxt")
				.desc("select text file name for output ( default: result.txt )").hasArg().argName("*.txt").build());
		options.addOption(Option.builder().longOpt("sim")
				.desc("set threshold of similarity for clone detection ( 0.0<=sim<=1.0 ) ( default: 0.9 )").hasArg()
				.argName("value").build());
		options.addOption(
				Option.builder().longOpt("size").desc("set threshold of size for method  ( 0<=size ) ( default: 50 )")
						.hasArg().argName("value").build());
		options.addOption(
				Option.builder().longOpt("sizeb").desc("set threshold of size for block  ( 0<=size ) ( default: 30 )")
						.hasArg().argName("value").build());
		options.addOption(Option.builder("cs").longOpt("charset")
				.desc("set the name of character encoding ( default: UTF-8 )").hasArg().argName("charset").build());
		CommandLine cl = null;
		try {
			CommandLineParser parser = new DefaultParser();
			cl = parser.parse(options, args);
		} catch (ParseException e) {
			System.err.println("Error: can't read options.");
			System.exit(1);
		}
		if (cl.hasOption("help") || args.length == 0) {
			HelpFormatter f = new HelpFormatter();
			f.printHelp("-d [dirname] -l [lang] <*options>", options);
			System.exit(0);
		}
		if (cl.hasOption("dir"))
			Config.target = cl.getOptionValue("dir");
		if (Config.target == null) {
			System.err.println("Usage Error: please select target directory for clone detection.");
			System.exit(1);
		}
		if (cl.hasOption("lang")) {
			if (cl.getOptionValue("lang").equals("java") || cl.getOptionValue("lang").equals("Java"))
				Config.lang = 0;
			if (cl.getOptionValue("lang").equals("c") || cl.getOptionValue("lang").equals("C"))
				Config.lang = 1;
		}
		/*
		 * if(cl.hasOption("param")) { Config.paramFile =
		 * cl.getOptionValue("param"); Config.paramFlg = false; }
		 */
		if (cl.hasOption("outputcsv"))
			Config.resultCSV = cl.getOptionValue("outputcsv");
		if (cl.hasOption("outputtxt"))
			Config.resultTXT = cl.getOptionValue("outputtxt");
		if (cl.hasOption("sim"))
			try {
				Config.SIM_TH = Double.parseDouble(cl.getOptionValue("sim"));
				if (0.0D > Config.SIM_TH || 1.0D < Config.SIM_TH)
					throw new NumberFormatException();
			} catch (NumberFormatException e) {
				System.err.println("Usage Error: can't set similarity threshold.");
				System.exit(1);
			}
		if (cl.hasOption("size"))
			try {
				Config.METHOD_NODE_TH = Integer.parseInt(cl.getOptionValue("size"));
				if (Config.METHOD_NODE_TH < 0)
					throw new NumberFormatException();
			} catch (NumberFormatException e) {
				System.err.println("Usage Error: can't set method size threshold.");
				System.exit(1);
			}
		if (cl.hasOption("sizeb"))
			try {
				Config.BLOCK_NODE_TH = Integer.parseInt(cl.getOptionValue("sizeb"));
				if (Config.BLOCK_NODE_TH < 0)
					throw new NumberFormatException();
			} catch (NumberFormatException e) {
				System.err.println("Usage Error: can't set block size threshold.");
				System.exit(1);
			}
		if (cl.hasOption("charset"))
			Config.charset = cl.getOptionValue("charset");

	}

	public class Shutdown extends Thread {
		public void run() {
			String msg = "test";
			try {
				String cline = "cmd.exe /c start notify_temp.bat";
				File file = new File("notify_temp.bat");
				PrintWriter p = new PrintWriter(new BufferedWriter(new FileWriter("notify_temp.bat")));
				p.println(
						"powershell.exe -Command \"curl.exe -k -X POST -H \'Authorization: Bearer htThV5RCliNCarubopToCi91nOpwuuw8iLbz5extQc9\' -F \'message="
								+ msg + "\' https://notify-api.line.me/api/notify exit\" & exit");
				p.close();
				Runtime.getRuntime().exec(cline);
				Thread.sleep(100);
				file.delete();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
