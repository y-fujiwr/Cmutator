package jp.ac.osaka_u.ist.sel.clonedetector.analyze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import jp.ac.osaka_u.ist.sel.clonedetector.CloneDetector;
import jp.ac.osaka_u.ist.sel.clonedetector.data.Block;
import jp.ac.osaka_u.ist.sel.clonedetector.grammar.CPP14.CPP14Lexer;

public class CAnalyzer4 {

	private ArrayList<String> allWordList = new ArrayList<String>();
	int blockId = 0;
	private Block currentBlock;
	private int p;
	private static final String[] controlFlow = { "if", "else", "switch", "case", "default", "for", "while", "do",
			"continue", "break", "return" };
	private static HashSet<String> controlFlowSet;
	private ArrayList<int[]> methodSeparator;
	private ArrayList<int[]> mDLs;
	private ArrayList<int[]> mMLs;
	private ArrayList<String> mSRV;
	private ArrayList<int[]> mSRT;
	private boolean mutateFlag = true;
	private static final String mutateDirPass = "output";

	public CAnalyzer4() {
		controlFlowSet = new HashSet<String>(Arrays.asList(controlFlow));
	}

	/**
	 * <p>
	 * ディレクトリ探索
	 * </p>
	 *
	 * @param file
	 * @throws IOException
	 */
	public void searchFile(File file) throws IOException {
		if (file.isFile() && (file.getName().endsWith(".c") || file.getName().endsWith(".cpp"))) {
			try {
				methodSeparator = new ArrayList<int[]>();
				mDLs = new ArrayList<int[]>();
				mMLs = new ArrayList<int[]>();
				mSRV = new ArrayList<String>();
				mSRT = new ArrayList<int[]>();
				extractMethod(file);
				if (mutateFlag) {
					executeMDLs(file);
					executeMMLs(file);
					executeMSRI(file);
					executeMILs(file);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (file.isDirectory()) {
			// System.out.println(file.toString());
			File[] fileList = file.listFiles();
			for (File f : fileList)
				searchFile(f);
		}
	}

	/**
	 * <p>
	 * ソースファイルから関数を抽出する
	 * </p>
	 *
	 * @param file
	 * @throws IOException
	 */
	private void extractMethod(File file) throws IOException {
		String input = preProcessor(file);
		CharStream stream = CharStreams.fromString(input, file.toString());
		CPP14Lexer lexer = new CPP14Lexer(stream);
		lexer.removeErrorListeners();
		lexer.addErrorListener(DescriptiveErrorListener.INSTANCE);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		tokens.fill();

		Token token;
		Token beforeToken = null;
		String methodName = null;
		int start = 0;
		boolean flagMSRV = false;
		int[] index = new int[2];
		p = 0;
		index[0] = p;

		while ((token = tokens.get(p)).getType() != Token.EOF) {
			Block block = new Block();
			block.setTokenList(token);
			switch (token.getType()) {
			case CPP14Lexer.LeftParen:
				if (beforeToken != null && beforeToken.getType() == CPP14Lexer.Identifier) {
					methodName = beforeToken.getText();
					start = token.getLine();
					if (methodName.equals("main"))
						index[0] = p - 1;
					else
						index[0] = p - 2;
				} else {
					methodName = null;
				}
				flagMSRV = true;
				break;
			case CPP14Lexer.RightParen:
				flagMSRV = false;
				break;
			case CPP14Lexer.LeftBrace:
				if (methodName != null && beforeToken.getType() == CPP14Lexer.RightParen && !methodName.equals("for")
						&& !methodName.equals("if") && !methodName.equals("switch") && !methodName.equals("while")) {

					currentBlock = block;
					// System.out.printf("%s - %s:
					// %d\r\n",file.toString(),methodName,start);

					CloneDetector.countMethod++;
					p++;
					extractBlock(tokens, file);

					methodName = null;
					index[1] = p;
					methodSeparator.add(index);
					index = new int[2];
					index[0] = p + 1;
				}
				break;
			case CPP14Lexer.Identifier:
				if (flagMSRV && !mSRV.contains(token.getText()))
					mSRV.add(token.getText());
			}

			beforeToken = token;
			p++;
		}
		CloneDetector.countLine += token.getLine();
	}

	// プリプロセッサ
	// マクロの除去
	private String preProcessor(File file) {
		StringBuilder buf = new StringBuilder();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line;
			while ((line = reader.readLine()) != null) {
				// #から始まる行の削除
				if (line.startsWith("#")) {
					buf.append("\n");
					// 行の最後が'\'で終わる場合次の行もマクロとして削除
					while (line.matches(".*?\\\\s*")) {
						// System.out.println(file);
						// System.out.println(line);
						line += reader.readLine();
						buf.append("\n");

					}

					// else | elif を見つけたら，マクロによって中括弧の破たんがないか調査
					if (line.matches("#\\s*(else|elif).*")) {
						// if(line.contains("\\")) System.out.println(line);
						int count = 0, loc = 0, ifcnt = 0;
						StringBuilder subbuf = new StringBuilder();
						while ((line = reader.readLine()) != null) {
							// 中括弧の数を調べる
							count += line.replaceAll("\\}", "").length() - line.replaceAll("\\{", "").length();
							if (line.matches("#\\s*if.*")) {
								// ifdefのネスト関係を調べる
								ifcnt++;
							} else if (line.matches("#\\s*endif.*")) {
								if (ifcnt != 0) {
									ifcnt--;
								} else {
									// if (count != 0) {
									// // 中括弧の対応関係が破たんしていた場合，その箇所の削除
									// for (int i = 0; i <= loc; i++) {
									// buf.append("\n");
									// }
									// // System.out.println(subbuf.toString());
									// } else {
									// // 中括弧の対応関係が破たんしていない場合，その箇所は残す
									// buf.append(subbuf.toString());
									// buf.append("\n");
									// }
									for (int i = 0; i <= loc; i++) {
										buf.append("\n");
									}
									break;
								}

							}
							subbuf.append(line);
							subbuf.append("\n");
							loc++;
						}
					}
				} else {
					buf.append(line);
					buf.append("\n");
				}
			}
			reader.close();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return buf.toString();
	}

	/**
	 * <p>
	 * 関数からワードを抽出
	 * </p>
	 *
	 * @param tokenizer
	 * @param method
	 * @throws IOException
	 */
	private void extractBlock(CommonTokenStream tokens, File file) throws IOException {
		Token token;
		Token beforeToken = null;
		int indexMDL[] = new int[2];
		int indexMML[];
		int indexMSRT[];
		boolean flagMSRV = false;
		indexMDL[0] = p - 1;

		// int beforeToken = 0;
		while ((token = tokens.get(p)).getType() != Token.EOF) {
			switch (token.getType()) {
			case CPP14Lexer.LeftParen:
				if (beforeToken != null && beforeToken.getType() == CPP14Lexer.For)
					indexMDL[0] = p;
				break;

			case CPP14Lexer.LeftBrace:
				p++;
				extractBlock(tokens, file);
				indexMDL[0] = p;
				break;
			case CPP14Lexer.RightBrace:
				return;
			case CPP14Lexer.Identifier:
				if (flagMSRV && !mSRV.contains(token.getText()))
					mSRV.add(token.getText());
				break;
			// 以下defaultまでmutation関係
			case CPP14Lexer.Semi:
				indexMDL[1] = p;
				mDLs.add(indexMDL);
				indexMDL = new int[2];
				indexMDL[0] = p;
				flagMSRV = false;
				break;
			case CPP14Lexer.Plus:
			case CPP14Lexer.Minus:
			case CPP14Lexer.Star:
			case CPP14Lexer.Div:
			case CPP14Lexer.Mod:
				if (beforeToken == null)
					break;
				if (beforeToken.getType() != CPP14Lexer.Identifier && beforeToken.getType() != CPP14Lexer.Integerliteral
						&& beforeToken.getType() != CPP14Lexer.Floatingliteral
						&& beforeToken.getType() != CPP14Lexer.Characterliteral)
					break;
				for (int i = CPP14Lexer.Plus; i <= CPP14Lexer.Mod; i++) {
					if (i == token.getType())
						continue;
					indexMML = new int[2];
					indexMML[0] = p;
					indexMML[1] = i;
					mMLs.add(indexMML);
				}
				break;
			case CPP14Lexer.PlusAssign:
			case CPP14Lexer.MinusAssign:
			case CPP14Lexer.StarAssign:
			case CPP14Lexer.DivAssign:
			case CPP14Lexer.ModAssign:
				for (int i = CPP14Lexer.PlusAssign; i <= CPP14Lexer.ModAssign; i++) {
					if (i == token.getType())
						continue;
					indexMML = new int[2];
					indexMML[0] = p;
					indexMML[1] = i;
					mMLs.add(indexMML);
				}
				break;
			case CPP14Lexer.PlusPlus:
				indexMML = new int[2];
				indexMML[0] = p;
				indexMML[1] = CPP14Lexer.MinusMinus;
				mMLs.add(indexMML);
				break;
			case CPP14Lexer.MinusMinus:
				indexMML = new int[2];
				indexMML[0] = p;
				indexMML[1] = CPP14Lexer.PlusPlus;
				mMLs.add(indexMML);
				break;
			case CPP14Lexer.AndAnd:
				indexMML = new int[2];
				indexMML[0] = p;
				indexMML[1] = CPP14Lexer.OrOr;
				mMLs.add(indexMML);
				break;
			case CPP14Lexer.OrOr:
				indexMML = new int[2];
				indexMML[0] = p;
				indexMML[1] = CPP14Lexer.AndAnd;
				mMLs.add(indexMML);
				break;
			case CPP14Lexer.Less:
			case CPP14Lexer.Greater:
			case CPP14Lexer.Equal:
			case CPP14Lexer.NotEqual:
			case CPP14Lexer.LessEqual:
			case CPP14Lexer.GreaterEqual:
				for (int i = CPP14Lexer.Less; i <= CPP14Lexer.Greater; i++) {
					if (i == token.getType())
						continue;
					indexMML = new int[2];
					indexMML[0] = p;
					indexMML[1] = i;
					mMLs.add(indexMML);
				}
				for (int i = CPP14Lexer.Equal; i <= CPP14Lexer.GreaterEqual; i++) {
					if (i == token.getType())
						continue;
					indexMML = new int[2];
					indexMML[0] = p;
					indexMML[1] = i;
					mMLs.add(indexMML);
				}
				break;
			case CPP14Lexer.Int:
			case CPP14Lexer.Short:
			case CPP14Lexer.Long:
			case CPP14Lexer.Float:
			case CPP14Lexer.Double:
				int[] x = { CPP14Lexer.Int, CPP14Lexer.Short, CPP14Lexer.Long, CPP14Lexer.Float, CPP14Lexer.Double };
				for (int i : x) {
					if (i == token.getType())
						continue;
					indexMSRT = new int[2];
					indexMSRT[0] = p;
					indexMSRT[1] = i;
					mSRT.add(indexMSRT);
				}
			case CPP14Lexer.Char:
				flagMSRV = true;
			default:
				break;
			}
			beforeToken = token;
			p++;
		}
	}

	/**
	 * <p>
	 * mDLs実行
	 * </p>
	 *
	 * @param file
	 * @throws IOException
	 */
	private void executeMDLs(File file) throws IOException {
		String input = preProcessor(file);
		int i = 1;

		Token token;
		File newDirs = new File(mutateDirPass + File.separator + file.getName() + File.separator + "mDLs");
		newDirs.mkdirs();
		while (i - 1 < mDLs.size()) {

			PrintWriter mDLsWriter = new PrintWriter(
					new BufferedWriter(new FileWriter("temp.c")));
			CharStream stream = CharStreams.fromString(input, file.toString());
			CPP14Lexer lexer = new CPP14Lexer(stream);
			lexer.removeErrorListeners();
			lexer.addErrorListener(DescriptiveErrorListener.INSTANCE);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			tokens.fill();
			int a = 0;
			int[] index = mDLs.get(i - 1);

			while ((token = tokens.get(a)).getType() != Token.EOF) {
				if (!(index[0] < a && index[1] > a)) {
					mDLsWriter.print(token.getText() + " ");
					if (a == index[1])
						mDLsWriter.print("/*Deleted*/");
				}
				a++;
			}
			mDLsWriter.close();
			String cline = "cmd.exe /c \"clang-format.exe temp.c >" + newDirs.getPath() + File.separator
					+ file.getName()
					+ "MDL" + i + "." + file.getName().substring(file.getName().lastIndexOf(".") + 1) + "\"";
			Runtime.getRuntime().exec(cline);
			i++;
		}

	}

	/**
	 * <p>
	 * mMLs実行
	 * </p>
	 *
	 * @param file
	 * @throws IOException
	 */
	private void executeMMLs(File file) throws IOException {
		String input = preProcessor(file);
		int i = 1;
		Token token;
		File newDirs = new File(mutateDirPass + File.separator + file.getName() + File.separator + "mMLs");
		newDirs.mkdirs();
		while (i - 1 < mMLs.size()) {
			PrintWriter mMLsWriter = new PrintWriter(
					new BufferedWriter(new FileWriter("temp.c")));
			CharStream stream = CharStreams.fromString(input, file.toString());
			CPP14Lexer lexer = new CPP14Lexer(stream);
			lexer.removeErrorListeners();
			lexer.addErrorListener(DescriptiveErrorListener.INSTANCE);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			tokens.fill();
			int a = 0;
			int[] index = mMLs.get(i - 1);

			while ((token = tokens.get(a)).getType() != Token.EOF) {
				if (a == index[0])
					mMLsWriter.print(CPP14Lexer._LITERAL_NAMES[index[1]].substring(1,
							CPP14Lexer._LITERAL_NAMES[index[1]].length() - 1) + " ");
				else
					mMLsWriter.print(token.getText() + " ");
				a++;
			}
			mMLsWriter.close();
			String cline = "cmd.exe /c \"clang-format.exe temp.c >" + newDirs.getPath() + File.separator
					+ file.getName()
					+ "MML" + i + "." + file.getName().substring(file.getName().lastIndexOf(".") + 1) + "\"";
			Runtime.getRuntime().exec(cline);
			i++;
		}

	}

	/**
	 * <p>
	 * mSRI実行
	 * </p>
	 *
	 * @param file
	 * @throws IOException
	 */
	private void executeMSRI(File file) throws IOException {
		String input = preProcessor(file);
		int i = 1;
		Token token;
		File newDirs = new File(mutateDirPass + File.separator + file.getName() + File.separator + "mSRI");
		newDirs.mkdirs();
		while (i - 1 < mSRV.size()) {
			PrintWriter mSRIWriter = new PrintWriter(
					new BufferedWriter(new FileWriter("temp.c")));
			CharStream stream = CharStreams.fromString(input, file.toString());
			CPP14Lexer lexer = new CPP14Lexer(stream);
			lexer.removeErrorListeners();
			lexer.addErrorListener(DescriptiveErrorListener.INSTANCE);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			tokens.fill();
			int a = 0;
			String target = mSRV.get(i - 1);

			while ((token = tokens.get(a)).getType() != Token.EOF) {

				if (token.getType() == CPP14Lexer.Identifier && token.getText().equals(target)) {
					mSRIWriter.print(token.getText() + "mSRI ");
				} else
					mSRIWriter.print(token.getText() + " ");
				a++;
			}
			mSRIWriter.close();
			String cline = "cmd.exe /c \"clang-format.exe temp.c >" + newDirs.getPath() + File.separator
					+ file.getName() + "MSRI" + i + "." + file.getName().substring(file.getName().lastIndexOf(".") + 1)
					+ "\"";
			Runtime.getRuntime().exec(cline);
			i++;
			
		}
		i = 1;
		while (i - 1 < mSRT.size()) {
			int j = i + mSRV.size();
			PrintWriter mSRIWriter = new PrintWriter(
					new BufferedWriter(new FileWriter("temp.c")),
					true);
			CharStream stream = CharStreams.fromString(input, file.toString());
			CPP14Lexer lexer = new CPP14Lexer(stream);
			lexer.removeErrorListeners();
			lexer.addErrorListener(DescriptiveErrorListener.INSTANCE);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			tokens.fill();
			int a = 0;
			int[] index = mSRT.get(i - 1);
			while ((token = tokens.get(a)).getType() != Token.EOF) {

				if (a == index[0]) {
					mSRIWriter.print(CPP14Lexer._LITERAL_NAMES[index[1]].substring(1,
							CPP14Lexer._LITERAL_NAMES[index[1]].length() - 1) + " ");
				} else
					mSRIWriter.print(token.getText() + " ");

				a++;
			}
			mSRIWriter.close();
			String cline = "cmd.exe /c \"clang-format.exe temp.c >" + newDirs.getPath() + File.separator
					+ file.getName() + "MSRI" + j + "." + file.getName().substring(file.getName().lastIndexOf(".") + 1)
					+ "\"";
			Runtime.getRuntime().exec(cline);
			i++;
			
		}

	}

	/**
	 * <p>
	 * mSRI実行
	 * </p>
	 *
	 * @param file
	 * @throws IOException
	 */
	private void executeMILs(File file) throws IOException {
		String input = preProcessor(file);
		int i = 1;
		Token token;
		File newDirs = new File(mutateDirPass + File.separator + file.getName() + File.separator + "mILs");
		newDirs.mkdirs();
		while (i - 1 < methodSeparator.size() * 3) {
			PrintWriter mILsWriter = new PrintWriter(
					new BufferedWriter(new FileWriter("temp.c")));
			CharStream stream = CharStreams.fromString(input, file.toString());
			CPP14Lexer lexer = new CPP14Lexer(stream);
			lexer.removeErrorListeners();
			lexer.addErrorListener(DescriptiveErrorListener.INSTANCE);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			tokens.fill();

			int a = 0;
			int[] index = methodSeparator.get((i - 1) / 3);

			while ((token = tokens.get(a)).getType() != Token.EOF) {
				
				if (a == index[1]) {
					switch ((i - 1) % 3) {
					case 0:
						mILsWriter.print("if ( false ) { ; } else { ; } } //Insert\n");
						break;
					case 1:
						mILsWriter.print("for ( ; ; ) { break ; } } //Insert\n");
						break;
					case 2:
						mILsWriter.print("while ( 1 ) { break ; } } //Insert\n");
						break;
					}

				} else
					mILsWriter.print(token.getText() + " ");
				a++;
			}
			mILsWriter.close();
			String cline = "cmd.exe /c \"clang-format.exe temp.c >" + newDirs.getPath() + File.separator
					+ file.getName() + "MILs" + i + "." + file.getName().substring(file.getName().lastIndexOf(".") + 1)
					+ "\"";
			Runtime.getRuntime().exec(cline);
			i++;
			
		}
	}
}
