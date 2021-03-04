package jp.ac.osaka_u.ist.sel.cmutator.grammar.CPP14;

import java.util.ArrayList;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;

import jp.ac.osaka_u.ist.sel.cmutator.CMutator;
import jp.ac.osaka_u.ist.sel.cmutator.data.Method;
import jp.ac.osaka_u.ist.sel.cmutator.data.Word;

public class CPP14MyBaseListener implements CPP14MyListener {
	
	@Override
	public void visitFunction(TokenStream tokens, Token functionName, int start, int end) {
		Method method = new Method();
		ArrayList<Word> wordList = method.getWordList();
		
		System.out.printf("%s - %s: %d\r\n",tokens.getSourceName(),functionName.getText(),functionName.getLine());
		method.setId(CMutator.methodList.size());
		method.setName(functionName.getText());
		method.setClassName(tokens.getSourceName());
		tokens.seek(start);
		method.setStartLine(tokens.LT(1).getLine());
		
		do{
			tokens.consume();
			method.incNodeNum();
			separateIdentifier(tokens.LT(1).getText(), wordList);
		}while(tokens.index()<end);
		
		method.setEndLine(tokens.LT(1).getLine());
		
		CMutator.methodList.add(method);
		
	}
	
	@Override
	public void visitSelectionStatement(TokenStream tokens, Token blockName, int start, int end) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void visitIterationStatement(TokenStream tokens, Token blockName, int start, int end) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void visitUnknownBlock(TokenStream tokens, Token blockName, int start, int end) {
		// TODO 自動生成されたメソッド・スタブ
		
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
