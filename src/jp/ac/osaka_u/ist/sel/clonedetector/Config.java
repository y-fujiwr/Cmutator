package jp.ac.osaka_u.ist.sel.clonedetector;


public class Config {

	public static String target = null;
    public static final String DATASET_FILE = "dataset.txt";
    public static final String LSH_FILE = "lsh_result.txt";
    public static String resultTXT = "result.txt";
    public static String resultCSV = "result.csv";
    public static String resultHTML = "result.html";
    public static final int JAVA = 0;
    public static final int CPP = 1;
    public static int lang = JAVA;
    public static String charset = "UTF-8";
    //public static boolean paramFlg = true;

	//LSHパラメータ
//    public static int LSH_PRG = LSHController.FALCONN32;
//    public static int LSH_PRG = LSHController.E2LSH;
//    public static int LSH_PRG = LSHController.NO_LSH;
    public final static double LSH_R =1.0;
	public final static double LSH_PROB = 0.9;
	public final static int LSH_L = 20; // HASH_TABLE_NUM

	//検出パラメータ
	public static int METHOD_NODE_TH =50;
	public static int BLOCK_NODE_TH = 30;
	public final static double DIS_TH = 0.2;//0.2
	public final static int DIFF_TH = 30;//30
	public static double SIM_TH = 0.9;

	//評価用
	public final static double E_DIFF=45.0;


}
