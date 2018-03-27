package jp.ac.osaka_u.ist.sel.clonedetector.data;

import java.util.ArrayList;
import java.util.HashMap;

import org.antlr.v4.runtime.Token;

import no.uib.cipr.matrix.Vector;

public class Block {
	
	private int id;
	private String className;
	private int startLine;
	private int endLine;
	private int methodStartLine;
	private int methodEndLine;
	private String name;
	private String code;
	private double len;
	private ArrayList<Word> wordList = new ArrayList<Word>();
	private ArrayList<Token> tokenList = new ArrayList<Token>();
	private int nodeNum=0;
	private Vector vector;
	private HashMap<Integer, String> stringVector;
	private boolean checkFlg = false;
	private Block parent;
	private ArrayList<Block> children;


	/**
	 * <p>メソッドIDの取得</p>
	 * @return
	 */
	public final int getId() {
		return id;
	}
	
	/**
	 * <p>メソッドIDの設定</p>
	 * @param id
	 */
	public final void setId(int id) {
		this.id = id;
	}
	
	
	
	/**
	 * <p>メソッド名の取得</p>
	 * @return
	 */
	public final String getName() {
		return name;
	}
	
	/**
	 * <p>メソッド名の設定</p>
	 * @param name
	 */
	public final void setName(String name) {
		this.name = name;
	}

	/**
	 * <p>クラス名の取得</p>
	 * @return
	 */
	public final String getClassName() {
		return className;
	}

	/**
	 * <p>クラス名の設定</p>
	 * @param className
	 */
	public final void setClassName(String className) {
		this.className = className;
	}

	/**
	 * <p>ワードリストの取得</p>
	 * @return
	 */
	public final ArrayList<Word> getWordList() {
		return wordList;
	}
	
	public final void setWordList(Word word){
		wordList.add(word);
	}
	
	public final void clearWordList(){
		wordList.clear();
	}
	
	public final ArrayList<Token> getTokenList(){
		return tokenList;
	}
	public final void setTokenList(Token token){
		tokenList.add(token);
	}

	/**
	 * <p>ソースコード取得</p>
	 * @return
	 */
	public final String getCode() {
		return code;
	}

	/**
	 * <p>ソースコード設定</p>
	 */
	public final void setCode(String code) {
		this.code = code;
	}

	/**
	 * <p>ノード数取得</p>
	 * @return
	 */
	public final int getNodeNum() {
		return nodeNum;
	}

	/**
	 * <p>ノード数設定</p>
	 * @param nodeNum
	 */
	public final void setNodeNum(int nodeNum){
		this.nodeNum = nodeNum;
	}
	
	/**
	 * <p>ノード数加算</p>
	 * @param 
	 */
	public final void incNodeNum() {
		nodeNum++;
	}

	/**
	 * <p>距離の取得</p>
	 * @return
	 */
	public final double getLen() {
		return len;
	}

	/**
	 * <p>距離の設定</p>
	 * @return
	 */
	public final void setLen(double len) {
		this.len = len;
	}

	/**
	 * <p>特徴ベクトルの取得</p>
	 * @return
	 */
	public final Vector getVector() {
		return vector;
	}

	/**
	 * <p>特徴ベクトルの設定</p>
	 * @param vector
	 */
	public final void setVector(Vector vector) {
		this.vector = vector;
	}

	/**
	 * <p>特徴ベクトルの取得</p>
	 * @return
	 */
	public final HashMap<Integer, String> getStringVector() {
		return stringVector;
	}

	/**
	 * <p>特徴ベクトルの設定</p>
	 * @param vector
	 */
	public final void setStringVector(HashMap<Integer, String> stringVector) {
		this.stringVector = stringVector;
	}
	
	public final void clearStringVector(){
		stringVector.clear();
		stringVector = null;
	}
	
	/**
	 * <p>判定</p>
	 * @return
	 */
	public final boolean isCheckFlg() {
		return checkFlg;
	}

	/**
	 * <p>判定</p>
	 * @param checkFlg
	 */
	public final void setCheckFlg(boolean checkFlg) {
		this.checkFlg = checkFlg;
	}

	
	/**
	 * <p>開始行の取得</p>
	 * @return
	 */
	public final int getStartLine() {
		return startLine;
	}

	/**
	 * <p>開始行の設定</p>
	 * @param startLine
	 */
	public final void setStartLine(int startLine) {
		this.startLine = startLine;
	}

	/**
	 * <p>終了行の取得</p>
	 * @return
	 */
	public final int getEndLine() {
		return endLine;
	}
	
	/**
	 * <p>終了行の設定</p>
	 * @param endLine
	 */
	public final void setEndLine(int endLine) {
		this.endLine = endLine;
	}

	
	/**
	 * <p>開始行の取得</p>
	 * @return
	 */
	public final int getMethodStartLine() {
		return methodStartLine;
	}

	/**
	 * <p>開始行の設定</p>
	 * @param startLine
	 */
	public final void setMethodStartLine(int startLine) {
		this.methodStartLine = startLine;
	}

	/**
	 * <p>終了行の取得</p>
	 * @return
	 */
	public final int getMethodEndLine() {
		return methodEndLine;
	}
	
	/**
	 * <p>終了行の設定</p>
	 * @param endLine
	 */
	public final void setMethodEndLine(int endLine) {
		this.methodEndLine = endLine;
	}

		/**
	 * <p>親ブロックの取得</p>
	 * @return
	 */
	public final Block getParent() {
		return parent;
	}
	
	/**
	 * <p>親ブロックの設定</p>
	 * @param parent
	 */
	public final void setParent(Block parent) {
		this.parent = parent;
	}
	
	/**
	 * <p>子ブロックリストの取得</p>
	 * @return
	 */
	public final ArrayList<Block> getChildren() {
		return children;
	}
	
	/**
	 * <p>子ブロックの追加</p>
	 * @param child
	 */
	public final void addChild(Block child) {
		if(children==null) children = new ArrayList<Block>();
		children.add(child);
	}
	
	@Override
	public boolean equals(Object obj){
		if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
		if(id == ((Block)obj).getId()) return true;
		return false;
	}
	
	public boolean match(String className, String name){
		if(this.className.equals(className) && this.name.equals(name)){
			return true;
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	

}
