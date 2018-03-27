package jp.ac.osaka_u.ist.sel.clonedetector.analyze;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

import jp.ac.osaka_u.ist.sel.clonedetector.CloneDetector;
import jp.ac.osaka_u.ist.sel.clonedetector.Config;
import jp.ac.osaka_u.ist.sel.clonedetector.data.Block;
import jp.ac.osaka_u.ist.sel.clonedetector.data.Method;
import jp.ac.osaka_u.ist.sel.clonedetector.data.Word;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.xpath.XPath;

import jp.ac.osaka_u.ist.sel.clonedetector.grammar.C.CLexer;
import jp.ac.osaka_u.ist.sel.clonedetector.grammar.C.CMyErrorListener;
import jp.ac.osaka_u.ist.sel.clonedetector.grammar.C.CMyListener;
import jp.ac.osaka_u.ist.sel.clonedetector.grammar.C.CParser;
import jp.ac.osaka_u.ist.sel.clonedetector.grammar.C.CParser.CompilationUnitContext;
import jp.ac.osaka_u.ist.sel.clonedetector.grammar.CPP14.CPP14Lexer;
import jp.ac.osaka_u.ist.sel.clonedetector.grammar.CPP14.CPP14Parser;
import jp.ac.osaka_u.ist.sel.clonedetector.grammar.CPP14.CPP14Parser.TranslationunitContext;
import jp.ac.osaka_u.ist.sel.clonedetector.grammar.SimpleC.SimpleCLexer;
import jp.ac.osaka_u.ist.sel.clonedetector.grammar.SimpleC.SimpleCParser;
public class CAnalyzer3 {

	//private ASTParser parser = ASTParser.newParser(AST.JLS4);	
	private ArrayList<String> allWordList = new ArrayList<String>();
	private Block currentBlock;
	private int blockID = 0;
	
	/**
	 * <p>コンストラクタ</p>
	 */
	public CAnalyzer3(){
		//parser.setBindingsRecovery(true);
		//parser.setStatementsRecovery(true);
		//parser.setResolveBindings(true);
	}
	
	/**
	 * <p>単語リストの取得</p>
	 * @return
	 */
	public ArrayList<String> getWordList(){
		return allWordList;
	}
		
	/**
	 * <p>ディレクトリ探索</p>
	 * @param file
	 * @throws IOException
	 */
	public void searchFile(File file) throws IOException{		
		if(file.isFile() && file.getName().endsWith(".c")){	
			
			//System.out.println(file.toString());
			CharStream stream = CharStreams.fromFileName(file.toString(), Charset.forName(Config.charset));
			CPP14Lexer lexer = new CPP14Lexer(stream);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			CPP14Parser parser = new CPP14Parser(tokens);
			//parser.addParseListener(new JavaMyListener());
			TranslationunitContext tree;
			//parser.removeErrorListeners();
			
			/*try {
			    tree = parser.compilationUnit();  // STAGE 1
			}
			catch (Exception ex) {
				System.err.println(file.toString() + tokens.LT(1).getLine());
				return;
			}*/
			
			parser.removeErrorListeners();
			parser.addErrorListener(new CMyErrorListener());
			
			parser.getInterpreter().setPredictionMode(PredictionMode.SLL);
			try {
			    tree = parser.translationunit();  // STAGE 1
			}
			catch (Exception ex) {
			    tokens.reset(); // rewind input stream
			    parser.reset();
			    //parser.getInterpreter().setPredictionMode(PredictionMode.LL);
			    try {
				    tree = parser.translationunit();  // STAGE 2
				    // if we parse ok, it's LL not SLL
			    } catch (ParseCancellationException ex2) {
					System.err.println(ex2.getMessage());
					//ANTLRFileStream stream2 = new ANTLRFileStream(file.toString());
					//SimpleCLexer lexer2 = new SimpleCLexer(stream2);
					//tokens = new CommonTokenStream(lexer2);
					//SimpleCParser parser2 = new SimpleCParser(tokens);
					//parser2.compilationUnit();
					return;
				}

			}
			
			ArrayList<Block> foo = CloneDetector.blockList;
			
			//extractMethod(tree, parser);
			
		}else if(file.isDirectory()){
			File[] fileList = file.listFiles();
			for(File f: fileList)
				searchFile(f);
		}	
	}
	
	
	/**
	 * <p>ソースコードテキスト取得</p>
	 * @param file
	 * @return
	 * @throws IOException
	 */
	private char[] getCode(File file) throws IOException{		
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String code = "";
		String line;
		while((line=reader.readLine())!=null)
			code = code + "\n" +line;
		reader.close();
		return code.toCharArray();		
	}
	
	/**
	 * <p>ASTから各メソッドのASTを構築</p>
	 * @param method
	 * @param node
	 * @param parent
	 * @param className 
	 */
	@SuppressWarnings("unchecked")
	private void extractMethod(ParseTree tree, CPP14Parser parser) {
		for (ParseTree t : XPath.findAll(tree, "//functionDefinition", parser) ) {
			Block block = new Block();
			currentBlock = block;
			Token start = null;
			
			if(t.getChildCount()==0) return;
			for(ParseTree subt : ((CParser.FunctionDefinitionContext) t).children){
				if(subt instanceof TerminalNode) {
					TerminalNode token = (TerminalNode)subt;
					if(token.getSymbol().getType()==CLexer.Identifier){
				        //System.out.println(token.getText());
						start = token.getSymbol();
			        }
				} else {
					if(subt instanceof CParser.CompoundStatementContext){
						if(subt.getSourceInterval().length() <= Config.METHOD_NODE_TH ||
								start == null) break;
						
						initBlock(block, start, subt);
						start = null;
						CloneDetector.blockList.add(block);
						if(CloneDetector.enableBlockExtract) extractBlock(subt, parser);
					}
				}
			}
		}
	}
	
	private void extractBlock(ParseTree tree, CPP14Parser parser){
		for (ParseTree t : XPath.findAll(tree, "/compoundStatement/blockItem/statement", parser) ) {
			if(t.getChild(0) instanceof TerminalNode) {
				TerminalNode token = (TerminalNode)t.getChild(0);
				Integer arg = null;
				
				switch (token.getSymbol().getType()) {
				case CLexer.If:
					arg = 2;					
					break;
					
				case CLexer.For:
					arg = 2;					
					break;

				case CLexer.While:
					arg = 2;					
					break;

				case CLexer.Do:
					arg = 1;					
					break;

				case CLexer.Switch:
					
					break;

				default:
					break;
				}
				
				if(arg == null) continue;
				if(t.getChild(arg).getSourceInterval().length() <= Config.BLOCK_NODE_TH ||
						!(t.getChild(arg).getChild(0) instanceof CParser.CompoundStatementContext)) continue;
				
				Block block = new Block();
				block.setParent(currentBlock);
				currentBlock.addChild(block);
				Block save = currentBlock;
				currentBlock = block;
				
				initBlock(block, token.getSymbol(), t.getChild(arg).getChild(0));
				
				CloneDetector.blockList.add(block);
				
				extractBlock(t.getChild(arg).getChild(0), parser);
				
				currentBlock = save;
				//System.out.println(t.getChild(0).getText());
			}
			
		}
	}
	
	private void initBlock(Block block, Token token, ParseTree tree){
		if(!(tree instanceof CParser.CompoundStatementContext)) return;
		
		block.setId(blockID++);
		block.setName(token.getText());	
		block.setClassName(token.getInputStream().getSourceName());
		block.setStartLine(token.getLine());
		block.setEndLine(((CParser.CompoundStatementContext)tree).stop.getLine());
		
		ArrayList<Token> tokenList = new ArrayList<Token>();
		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(new CMyListener(tokenList), tree);
		
		for (Token t : tokenList) {
			block.incNodeNum();
			separateIdentifier(t.getText(), block.getWordList());
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
