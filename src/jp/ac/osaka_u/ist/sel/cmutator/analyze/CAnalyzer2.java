package jp.ac.osaka_u.ist.sel.cmutator.analyze;

import java.io.File;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.nio.charset.Charset;
import java.util.ArrayList;

import org.antlr.v4.runtime.*;

import jp.ac.osaka_u.ist.sel.cmutator.Config;
import jp.ac.osaka_u.ist.sel.cmutator.data.Method;
import jp.ac.osaka_u.ist.sel.cmutator.data.Word;

import jp.ac.osaka_u.ist.sel.cmutator.grammar.CPP14.*;


public class  CAnalyzer2 {
	
	private ArrayList<String> allWordList = new ArrayList<String>();
	int methodId = 0;
	
	/**
	 * <p>ディレクトリ探索</p>
	 * @param file
	 * @throws IOException
	 */
	public void searchFile(File file) throws IOException{		
		if(file.isFile() && file.getName().endsWith(".c")){	
			//extractMethod(file);
			
			CharStream stream = CharStreams.fromFileName(file.toString(), Charset.forName(Config.charset));
			CPP14Lexer lexer = new CPP14Lexer(stream);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			CPP14MyParser parser = new CPP14MyParser(tokens);
			//parser.addParseListener(new CPP14MyBaseListener());
			BlockTree tree = parser.extractFunction();
			
		}else if(file.isDirectory()){
			File[] fileList = file.listFiles();
			for(File f: fileList)
				searchFile(f);
		}	
	}
	
	/**
	 * <p>単語リストの取得</p>
	 * @return
	 */
	public ArrayList<String> getWordList(){
		return allWordList;
	}
	
	

	private void ignoreComment(StreamTokenizer tokenizer) throws IOException {
		int beforeToken = 0;
		int token = 0;
		while ((token = tokenizer.nextToken()) != StreamTokenizer.TT_EOF) {
			switch (token) { 
				case '/':
					if(beforeToken=='*' || beforeToken=='/')
						return;
				case StreamTokenizer.TT_WORD:
					break;
			}		
			beforeToken = token;
		}
	}

	/**
	 * <p>関数からワードを抽出</p>
	 * @param tokenizer
	 * @param method
	 * @throws IOException 
	 */
	private void extractWordList(StreamTokenizer tokenizer, Method method) throws IOException {
		int token;
		
		
		//int beforeToken = 0;
		
		while ((token = tokenizer.nextToken()) != StreamTokenizer.TT_EOF) {
			method.incNodeNum();
			int beforeToken = 0;
			switch (token){
				case '*':
				case '/':					
					if(beforeToken=='/'){
						ignoreComment(tokenizer);						
					}
				break;	
				case StreamTokenizer.TT_EOL:
					break;
				case StreamTokenizer.TT_WORD:	
					separateIdentifier(tokenizer.sval,method.getWordList());
					break;
				case '{':
					extractWordList(tokenizer,method);
					break;
				case '}':
					return;
				default:
					//beforeToken = token;
					break;
			}
			beforeToken = token;
		}		
	}
	
	/**
	 * <p>単語リスト生成</p>
	 * @param identifier
	 * @param wordList
	 */
	private void separateIdentifier(String identifier, ArrayList<Word> wordList){
		String word = new String("");
 		for(char c: identifier.toCharArray()){
 			if( 'a'<=c && c<='z'){
 				word = word+c; 					
 			}else if('A'<=c && c<='Z'){
 				if(!word.isEmpty()){
 					if('A'<=word.charAt(word.length()-1) && word.charAt(word.length()-1)<='Z'){
 						word = word+c; 		
 					}else{
 						addWord(wordList,word.toLowerCase(),Word.WORD);
 						word = ""+c; 		 					
 					}
 				}else{
 					word=word+c; 
 				}
 			}else{
 				addWord(wordList,word.toLowerCase(),Word.WORD);		
				word="";
			} 
 		}
 		addWord(wordList,word.toLowerCase(),Word.WORD);	
	}
	
	/**
	 * <p>ワードリストへの追加</p>
	 * @param wordList
	 * @param word
	 */
	private void addWord(ArrayList<Word> wordList, String newWord, int type){
		if(!newWord.isEmpty()){
			if(newWord.length()<=1)
				newWord = "word_2";
			boolean addFlg = true;
			for(Word word: wordList){
				if(word.getName().equals(newWord)){
					addFlg = false;
					word.addCount(1);
					break;
				}					
			}			
			if(addFlg){
				wordList.add(new Word(newWord,type,1));
			}
		}
	}
	
	
	
}
