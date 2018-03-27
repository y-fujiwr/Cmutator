package jp.ac.osaka_u.ist.sel.clonedetector.analyze;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.util.ArrayList;

import jp.ac.osaka_u.ist.sel.clonedetector.CloneDetector;
import jp.ac.osaka_u.ist.sel.clonedetector.data.Method;
import jp.ac.osaka_u.ist.sel.clonedetector.data.Word;

public class  CAnalyzer {
	
	private ArrayList<String> allWordList = new ArrayList<String>();
	int methodId = 0;
	
	/**
	 * <p>ディレクトリ探索</p>
	 * @param file
	 * @throws IOException
	 */
	public void searchFile(File file) throws IOException{		
		if(file.isFile() && file.getName().endsWith(".c")){	
			extractMethod(file);			
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
	
	/**
	 * <p>ソースファイルから関数を抽出する</p>
	 * @param file
	 * @throws IOException
	 */
	private void extractMethod(File file) throws IOException{
	
		FileReader fr = new FileReader(file.toString());
		StreamTokenizer tokenizer = new StreamTokenizer(fr);
		tokenizer.wordChars('0', '9');
		tokenizer.wordChars('a', 'z');
		tokenizer.wordChars('A', 'Z');
		tokenizer.wordChars('_', '_');
		
		
		tokenizer.ordinaryChar('/');
		tokenizer.ordinaryChar('*');
		//tokenizer.ordinaryChar('　');
		//tokenizer.eolIsSignificant(true);
		tokenizer.slashSlashComments(true);
		tokenizer.slashStarComments(true);
		
		int token;
		int beforeToken = -1;
		String beforeSval = null;
		String methodName = null;
		int start=0;
		while ((token = tokenizer.nextToken()) != StreamTokenizer.TT_EOF) {
			switch (token) { 
				case '*':
				case '/':					
					if(beforeToken=='/'){
						ignoreComment(tokenizer);						
					}
					break;					
				case '(':
					methodName = beforeSval;
					start = tokenizer.lineno();
					break;
				case StreamTokenizer.TT_WORD:
					break;
				case '{':
					if(methodName!=null && beforeToken==')' 
							&& !methodName.equals("for") && !methodName.equals("if") 
							&& !methodName.equals("switch") && !methodName.equals("while") ){
						Method method = new Method();
						System.out.printf("%s - %s: %d\r\n",file.toString(),methodName,start);
						method.setId(methodId++);
						method.setName(methodName);
						method.setClassName(file.toString());
						method.setStartLine(start);
						CloneDetector.methodList.add(method);
						extractWordList(tokenizer,method);	
						method.setEndLine(tokenizer.lineno());
					}							
					break;				
			}		
			beforeSval = tokenizer.sval;
			beforeToken = token;
		}		
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
