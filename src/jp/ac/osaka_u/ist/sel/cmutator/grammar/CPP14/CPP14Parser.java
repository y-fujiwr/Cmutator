// Generated from CPP14.g4 by ANTLR 4.5.3
package jp.ac.osaka_u.ist.sel.cmutator.grammar.CPP14;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CPP14Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MultiLineMacro=1, Directive=2, DirectiveKeyword=3, DirectiveFileName=4, 
		McroElseIf=5, LineContinue=6, Alignas=7, Alignof=8, Asm=9, Auto=10, Bool=11, 
		Break=12, Case=13, Catch=14, Char=15, Char16=16, Char32=17, Class=18, 
		Const=19, Constexpr=20, Const_cast=21, Continue=22, Decltype=23, Default=24, 
		Delete=25, Do=26, Double=27, Dynamic_cast=28, Else=29, Enum=30, Explicit=31, 
		Export=32, Extern=33, False=34, Final=35, Float=36, For=37, Friend=38, 
		Goto=39, If=40, Inline=41, Int=42, Long=43, Mutable=44, Namespace=45, 
		New=46, Noexcept=47, Nullptr=48, Operator=49, Override=50, Private=51, 
		Protected=52, Public=53, Register=54, Reinterpret_cast=55, Return=56, 
		Short=57, Signed=58, Sizeof=59, Static=60, Static_assert=61, Static_cast=62, 
		Struct=63, Switch=64, Template=65, This=66, Thread_local=67, Throw=68, 
		True=69, Try=70, Typedef=71, Typeid=72, Typename=73, Union=74, Unsigned=75, 
		Using=76, Virtual=77, Void=78, Volatile=79, Wchar=80, While=81, LeftParen=82, 
		RightParen=83, LeftBracket=84, RightBracket=85, LeftBrace=86, RightBrace=87, 
		Plus=88, Minus=89, Star=90, Div=91, Mod=92, Caret=93, And=94, Or=95, Tilde=96, 
		Not=97, Assign=98, Less=99, Greater=100, PlusAssign=101, MinusAssign=102, 
		StarAssign=103, DivAssign=104, ModAssign=105, XorAssign=106, AndAssign=107, 
		OrAssign=108, LeftShift=109, LeftShiftAssign=110, Equal=111, NotEqual=112, 
		LessEqual=113, GreaterEqual=114, AndAnd=115, OrOr=116, PlusPlus=117, MinusMinus=118, 
		Comma=119, ArrowStar=120, Arrow=121, Question=122, Colon=123, Doublecolon=124, 
		Semi=125, Dot=126, DotStar=127, Ellipsis=128, Identifier=129, Integerliteral=130, 
		Decimalliteral=131, Octalliteral=132, Hexadecimalliteral=133, Binaryliteral=134, 
		Integersuffix=135, Characterliteral=136, Floatingliteral=137, Stringliteral=138, 
		Userdefinedintegerliteral=139, Userdefinedfloatingliteral=140, Userdefinedstringliteral=141, 
		Userdefinedcharacterliteral=142, Whitespace=143, Newline=144, NonstandardTokens=145, 
		InvalidCharacter=146, BlockComment=147, LineComment=148;
	public static final int
		RULE_translationunit = 0, RULE_primaryexpression = 1, RULE_idexpression = 2, 
		RULE_unqualifiedid = 3, RULE_qualifiedid = 4, RULE_nestednamespecifier = 5, 
		RULE_lambdaexpression = 6, RULE_lambdaintroducer = 7, RULE_lambdacapture = 8, 
		RULE_capturedefault = 9, RULE_capturelist = 10, RULE_capture = 11, RULE_simplecapture = 12, 
		RULE_initcapture = 13, RULE_lambdadeclarator = 14, RULE_postfixexpression = 15, 
		RULE_expressionlist = 16, RULE_pseudodestructorname = 17, RULE_unaryexpression = 18, 
		RULE_unaryoperator = 19, RULE_newexpression = 20, RULE_newplacement = 21, 
		RULE_newtypeid = 22, RULE_newdeclarator = 23, RULE_noptrnewdeclarator = 24, 
		RULE_newinitializer = 25, RULE_deleteexpression = 26, RULE_noexceptexpression = 27, 
		RULE_castexpression = 28, RULE_pmexpression = 29, RULE_multiplicativeexpression = 30, 
		RULE_additiveexpression = 31, RULE_shiftexpression = 32, RULE_relationalexpression = 33, 
		RULE_equalityexpression = 34, RULE_andexpression = 35, RULE_exclusiveorexpression = 36, 
		RULE_inclusiveorexpression = 37, RULE_logicalandexpression = 38, RULE_logicalorexpression = 39, 
		RULE_conditionalexpression = 40, RULE_assignmentexpression = 41, RULE_assignmentoperator = 42, 
		RULE_expression = 43, RULE_constantexpression = 44, RULE_nestedParenthesesBlock = 45, 
		RULE_statement = 46, RULE_labeledstatement = 47, RULE_expressionstatement = 48, 
		RULE_compoundstatement = 49, RULE_statementseq = 50, RULE_selectionstatement = 51, 
		RULE_condition = 52, RULE_iterationstatement = 53, RULE_forinitstatement = 54, 
		RULE_forrangedeclaration = 55, RULE_forrangeinitializer = 56, RULE_jumpstatement = 57, 
		RULE_unknownstatement = 58, RULE_declarationstatement = 59, RULE_declarationseq = 60, 
		RULE_declaration = 61, RULE_blockdeclaration = 62, RULE_aliasdeclaration = 63, 
		RULE_simpledeclaration = 64, RULE_static_assertdeclaration = 65, RULE_emptydeclaration = 66, 
		RULE_attributedeclaration = 67, RULE_declspecifier = 68, RULE_declspecifierseq = 69, 
		RULE_storageclassspecifier = 70, RULE_functionspecifier = 71, RULE_typedefname = 72, 
		RULE_typespecifier = 73, RULE_trailingtypespecifier = 74, RULE_typespecifierseq = 75, 
		RULE_trailingtypespecifierseq = 76, RULE_simpletypespecifier = 77, RULE_typename = 78, 
		RULE_decltypespecifier = 79, RULE_elaboratedtypespecifier = 80, RULE_enumname = 81, 
		RULE_enumspecifier = 82, RULE_enumhead = 83, RULE_opaqueenumdeclaration = 84, 
		RULE_enumkey = 85, RULE_enumbase = 86, RULE_enumeratorlist = 87, RULE_enumeratordefinition = 88, 
		RULE_enumerator = 89, RULE_namespacename = 90, RULE_originalnamespacename = 91, 
		RULE_namespacedefinition = 92, RULE_namednamespacedefinition = 93, RULE_originalnamespacedefinition = 94, 
		RULE_extensionnamespacedefinition = 95, RULE_unnamednamespacedefinition = 96, 
		RULE_namespacebody = 97, RULE_namespacealias = 98, RULE_namespacealiasdefinition = 99, 
		RULE_qualifiednamespacespecifier = 100, RULE_usingdeclaration = 101, RULE_usingdirective = 102, 
		RULE_asmdefinition = 103, RULE_linkagespecification = 104, RULE_attributespecifierseq = 105, 
		RULE_attributespecifier = 106, RULE_alignmentspecifier = 107, RULE_attributelist = 108, 
		RULE_attribute = 109, RULE_attributetoken = 110, RULE_attributescopedtoken = 111, 
		RULE_attributenamespace = 112, RULE_attributeargumentclause = 113, RULE_balancedtokenseq = 114, 
		RULE_balancedtoken = 115, RULE_initdeclaratorlist = 116, RULE_initdeclarator = 117, 
		RULE_declarator = 118, RULE_ptrdeclarator = 119, RULE_noptrdeclarator = 120, 
		RULE_parametersandqualifiers = 121, RULE_trailingreturntype = 122, RULE_ptroperator = 123, 
		RULE_cvqualifierseq = 124, RULE_cvqualifier = 125, RULE_refqualifier = 126, 
		RULE_declaratorid = 127, RULE_typeid = 128, RULE_abstractdeclarator = 129, 
		RULE_ptrabstractdeclarator = 130, RULE_noptrabstractdeclarator = 131, 
		RULE_abstractpackdeclarator = 132, RULE_noptrabstractpackdeclarator = 133, 
		RULE_parameterdeclarationclause = 134, RULE_parameterdeclarationlist = 135, 
		RULE_parameterdeclaration = 136, RULE_functiondefinition = 137, RULE_functionbody = 138, 
		RULE_initializer = 139, RULE_braceorequalinitializer = 140, RULE_initializerclause = 141, 
		RULE_initializerlist = 142, RULE_bracedinitlist = 143, RULE_classname = 144, 
		RULE_classspecifier = 145, RULE_classhead = 146, RULE_classheadname = 147, 
		RULE_classvirtspecifier = 148, RULE_classkey = 149, RULE_memberspecification = 150, 
		RULE_memberdeclaration = 151, RULE_memberdeclaratorlist = 152, RULE_memberdeclarator = 153, 
		RULE_virtspecifierseq = 154, RULE_virtspecifier = 155, RULE_purespecifier = 156, 
		RULE_baseclause = 157, RULE_basespecifierlist = 158, RULE_basespecifier = 159, 
		RULE_classordecltype = 160, RULE_basetypespecifier = 161, RULE_accessspecifier = 162, 
		RULE_conversionfunctionid = 163, RULE_conversiontypeid = 164, RULE_conversiondeclarator = 165, 
		RULE_ctorinitializer = 166, RULE_meminitializerlist = 167, RULE_meminitializer = 168, 
		RULE_meminitializerid = 169, RULE_operatorfunctionid = 170, RULE_literaloperatorid = 171, 
		RULE_templatedeclaration = 172, RULE_templateparameterlist = 173, RULE_templateparameter = 174, 
		RULE_typeparameter = 175, RULE_simpletemplateid = 176, RULE_templateid = 177, 
		RULE_templatename = 178, RULE_templateargumentlist = 179, RULE_templateargument = 180, 
		RULE_typenamespecifier = 181, RULE_explicitinstantiation = 182, RULE_explicitspecialization = 183, 
		RULE_tryblock = 184, RULE_functiontryblock = 185, RULE_handlerseq = 186, 
		RULE_handler = 187, RULE_exceptiondeclaration = 188, RULE_throwexpression = 189, 
		RULE_exceptionspecification = 190, RULE_dynamicexceptionspecification = 191, 
		RULE_typeidlist = 192, RULE_noexceptspecification = 193, RULE_rightShift = 194, 
		RULE_rightShiftAssign = 195, RULE_operator = 196, RULE_literal = 197, 
		RULE_booleanliteral = 198, RULE_pointerliteral = 199, RULE_userdefinedliteral = 200;
	public static final String[] ruleNames = {
		"translationunit", "primaryexpression", "idexpression", "unqualifiedid", 
		"qualifiedid", "nestednamespecifier", "lambdaexpression", "lambdaintroducer", 
		"lambdacapture", "capturedefault", "capturelist", "capture", "simplecapture", 
		"initcapture", "lambdadeclarator", "postfixexpression", "expressionlist", 
		"pseudodestructorname", "unaryexpression", "unaryoperator", "newexpression", 
		"newplacement", "newtypeid", "newdeclarator", "noptrnewdeclarator", "newinitializer", 
		"deleteexpression", "noexceptexpression", "castexpression", "pmexpression", 
		"multiplicativeexpression", "additiveexpression", "shiftexpression", "relationalexpression", 
		"equalityexpression", "andexpression", "exclusiveorexpression", "inclusiveorexpression", 
		"logicalandexpression", "logicalorexpression", "conditionalexpression", 
		"assignmentexpression", "assignmentoperator", "expression", "constantexpression", 
		"nestedParenthesesBlock", "statement", "labeledstatement", "expressionstatement", 
		"compoundstatement", "statementseq", "selectionstatement", "condition", 
		"iterationstatement", "forinitstatement", "forrangedeclaration", "forrangeinitializer", 
		"jumpstatement", "unknownstatement", "declarationstatement", "declarationseq", 
		"declaration", "blockdeclaration", "aliasdeclaration", "simpledeclaration", 
		"static_assertdeclaration", "emptydeclaration", "attributedeclaration", 
		"declspecifier", "declspecifierseq", "storageclassspecifier", "functionspecifier", 
		"typedefname", "typespecifier", "trailingtypespecifier", "typespecifierseq", 
		"trailingtypespecifierseq", "simpletypespecifier", "typename", "decltypespecifier", 
		"elaboratedtypespecifier", "enumname", "enumspecifier", "enumhead", "opaqueenumdeclaration", 
		"enumkey", "enumbase", "enumeratorlist", "enumeratordefinition", "enumerator", 
		"namespacename", "originalnamespacename", "namespacedefinition", "namednamespacedefinition", 
		"originalnamespacedefinition", "extensionnamespacedefinition", "unnamednamespacedefinition", 
		"namespacebody", "namespacealias", "namespacealiasdefinition", "qualifiednamespacespecifier", 
		"usingdeclaration", "usingdirective", "asmdefinition", "linkagespecification", 
		"attributespecifierseq", "attributespecifier", "alignmentspecifier", "attributelist", 
		"attribute", "attributetoken", "attributescopedtoken", "attributenamespace", 
		"attributeargumentclause", "balancedtokenseq", "balancedtoken", "initdeclaratorlist", 
		"initdeclarator", "declarator", "ptrdeclarator", "noptrdeclarator", "parametersandqualifiers", 
		"trailingreturntype", "ptroperator", "cvqualifierseq", "cvqualifier", 
		"refqualifier", "declaratorid", "typeid", "abstractdeclarator", "ptrabstractdeclarator", 
		"noptrabstractdeclarator", "abstractpackdeclarator", "noptrabstractpackdeclarator", 
		"parameterdeclarationclause", "parameterdeclarationlist", "parameterdeclaration", 
		"functiondefinition", "functionbody", "initializer", "braceorequalinitializer", 
		"initializerclause", "initializerlist", "bracedinitlist", "classname", 
		"classspecifier", "classhead", "classheadname", "classvirtspecifier", 
		"classkey", "memberspecification", "memberdeclaration", "memberdeclaratorlist", 
		"memberdeclarator", "virtspecifierseq", "virtspecifier", "purespecifier", 
		"baseclause", "basespecifierlist", "basespecifier", "classordecltype", 
		"basetypespecifier", "accessspecifier", "conversionfunctionid", "conversiontypeid", 
		"conversiondeclarator", "ctorinitializer", "meminitializerlist", "meminitializer", 
		"meminitializerid", "operatorfunctionid", "literaloperatorid", "templatedeclaration", 
		"templateparameterlist", "templateparameter", "typeparameter", "simpletemplateid", 
		"templateid", "templatename", "templateargumentlist", "templateargument", 
		"typenamespecifier", "explicitinstantiation", "explicitspecialization", 
		"tryblock", "functiontryblock", "handlerseq", "handler", "exceptiondeclaration", 
		"throwexpression", "exceptionspecification", "dynamicexceptionspecification", 
		"typeidlist", "noexceptspecification", "rightShift", "rightShiftAssign", 
		"operator", "literal", "booleanliteral", "pointerliteral", "userdefinedliteral"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, "'alignas'", "'alignof'", "'asm'", 
		"'auto'", "'bool'", "'break'", "'case'", "'catch'", "'char'", "'char16_t'", 
		"'char32_t'", "'class'", "'const'", "'constexpr'", "'const_cast'", "'continue'", 
		"'decltype'", "'default'", "'delete'", "'do'", "'double'", "'dynamic_cast'", 
		"'else'", "'enum'", "'explicit'", "'export'", "'extern'", "'false'", "'final'", 
		"'float'", "'for'", "'friend'", "'goto'", "'if'", "'inline'", "'int'", 
		"'long'", "'mutable'", "'namespace'", "'new'", "'noexcept'", "'nullptr'", 
		"'operator'", "'override'", "'private'", "'protected'", "'public'", "'register'", 
		"'reinterpret_cast'", "'return'", "'short'", "'signed'", "'sizeof'", "'static'", 
		"'static_assert'", "'static_cast'", "'struct'", "'switch'", "'template'", 
		"'this'", "'thread_local'", "'throw'", "'true'", "'try'", "'typedef'", 
		"'typeid'", "'typename'", "'union'", "'unsigned'", "'using'", "'virtual'", 
		"'void'", "'volatile'", "'wchar_t'", "'while'", "'('", "')'", "'['", "']'", 
		"'{'", "'}'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'&'", "'|'", 
		"'~'", "'!'", "'='", "'<'", "'>'", "'+='", "'-='", "'*='", "'/='", "'%='", 
		"'^='", "'&='", "'|='", "'<<'", "'<<='", "'=='", "'!='", "'<='", "'>='", 
		"'&&'", "'||'", "'++'", "'--'", "','", "'->*'", "'->'", "'?'", "':'", 
		"'::'", "';'", "'.'", "'.*'", "'...'", null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "'$'", "'\f'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "MultiLineMacro", "Directive", "DirectiveKeyword", "DirectiveFileName", 
		"McroElseIf", "LineContinue", "Alignas", "Alignof", "Asm", "Auto", "Bool", 
		"Break", "Case", "Catch", "Char", "Char16", "Char32", "Class", "Const", 
		"Constexpr", "Const_cast", "Continue", "Decltype", "Default", "Delete", 
		"Do", "Double", "Dynamic_cast", "Else", "Enum", "Explicit", "Export", 
		"Extern", "False", "Final", "Float", "For", "Friend", "Goto", "If", "Inline", 
		"Int", "Long", "Mutable", "Namespace", "New", "Noexcept", "Nullptr", "Operator", 
		"Override", "Private", "Protected", "Public", "Register", "Reinterpret_cast", 
		"Return", "Short", "Signed", "Sizeof", "Static", "Static_assert", "Static_cast", 
		"Struct", "Switch", "Template", "This", "Thread_local", "Throw", "True", 
		"Try", "Typedef", "Typeid", "Typename", "Union", "Unsigned", "Using", 
		"Virtual", "Void", "Volatile", "Wchar", "While", "LeftParen", "RightParen", 
		"LeftBracket", "RightBracket", "LeftBrace", "RightBrace", "Plus", "Minus", 
		"Star", "Div", "Mod", "Caret", "And", "Or", "Tilde", "Not", "Assign", 
		"Less", "Greater", "PlusAssign", "MinusAssign", "StarAssign", "DivAssign", 
		"ModAssign", "XorAssign", "AndAssign", "OrAssign", "LeftShift", "LeftShiftAssign", 
		"Equal", "NotEqual", "LessEqual", "GreaterEqual", "AndAnd", "OrOr", "PlusPlus", 
		"MinusMinus", "Comma", "ArrowStar", "Arrow", "Question", "Colon", "Doublecolon", 
		"Semi", "Dot", "DotStar", "Ellipsis", "Identifier", "Integerliteral", 
		"Decimalliteral", "Octalliteral", "Hexadecimalliteral", "Binaryliteral", 
		"Integersuffix", "Characterliteral", "Floatingliteral", "Stringliteral", 
		"Userdefinedintegerliteral", "Userdefinedfloatingliteral", "Userdefinedstringliteral", 
		"Userdefinedcharacterliteral", "Whitespace", "Newline", "NonstandardTokens", 
		"InvalidCharacter", "BlockComment", "LineComment"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CPP14.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CPP14Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TranslationunitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CPP14Parser.EOF, 0); }
		public DeclarationseqContext declarationseq() {
			return getRuleContext(DeclarationseqContext.class,0);
		}
		public TranslationunitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationunit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTranslationunit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTranslationunit(this);
		}
	}

	public final TranslationunitContext translationunit() throws RecognitionException {
		TranslationunitContext _localctx = new TranslationunitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_translationunit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			_la = _input.LA(1);
			if (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & ((1L << (Alignas - 7)) | (1L << (Asm - 7)) | (1L << (Auto - 7)) | (1L << (Bool - 7)) | (1L << (Char - 7)) | (1L << (Char16 - 7)) | (1L << (Char32 - 7)) | (1L << (Class - 7)) | (1L << (Const - 7)) | (1L << (Constexpr - 7)) | (1L << (Decltype - 7)) | (1L << (Double - 7)) | (1L << (Enum - 7)) | (1L << (Explicit - 7)) | (1L << (Extern - 7)) | (1L << (Float - 7)) | (1L << (Friend - 7)) | (1L << (Inline - 7)) | (1L << (Int - 7)) | (1L << (Long - 7)) | (1L << (Mutable - 7)) | (1L << (Namespace - 7)) | (1L << (Operator - 7)) | (1L << (Register - 7)) | (1L << (Short - 7)) | (1L << (Signed - 7)) | (1L << (Static - 7)) | (1L << (Static_assert - 7)) | (1L << (Struct - 7)) | (1L << (Template - 7)) | (1L << (Thread_local - 7)))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (Typedef - 71)) | (1L << (Typename - 71)) | (1L << (Union - 71)) | (1L << (Unsigned - 71)) | (1L << (Using - 71)) | (1L << (Virtual - 71)) | (1L << (Void - 71)) | (1L << (Volatile - 71)) | (1L << (Wchar - 71)) | (1L << (LeftParen - 71)) | (1L << (LeftBracket - 71)) | (1L << (Star - 71)) | (1L << (And - 71)) | (1L << (Tilde - 71)) | (1L << (AndAnd - 71)) | (1L << (Doublecolon - 71)) | (1L << (Semi - 71)) | (1L << (Ellipsis - 71)) | (1L << (Identifier - 71)))) != 0)) {
				{
				setState(402);
				declarationseq(0);
				}
			}

			setState(405);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryexpressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode This() { return getToken(CPP14Parser.This, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdexpressionContext idexpression() {
			return getRuleContext(IdexpressionContext.class,0);
		}
		public LambdaexpressionContext lambdaexpression() {
			return getRuleContext(LambdaexpressionContext.class,0);
		}
		public PrimaryexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterPrimaryexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitPrimaryexpression(this);
		}
	}

	public final PrimaryexpressionContext primaryexpression() throws RecognitionException {
		PrimaryexpressionContext _localctx = new PrimaryexpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_primaryexpression);
		try {
			setState(415);
			switch (_input.LA(1)) {
			case False:
			case Nullptr:
			case True:
			case Integerliteral:
			case Characterliteral:
			case Floatingliteral:
			case Stringliteral:
			case Userdefinedintegerliteral:
			case Userdefinedfloatingliteral:
			case Userdefinedstringliteral:
			case Userdefinedcharacterliteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(407);
				literal();
				}
				break;
			case This:
				enterOuterAlt(_localctx, 2);
				{
				setState(408);
				match(This);
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 3);
				{
				setState(409);
				match(LeftParen);
				setState(410);
				expression(0);
				setState(411);
				match(RightParen);
				}
				break;
			case Decltype:
			case Operator:
			case Tilde:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 4);
				{
				setState(413);
				idexpression();
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 5);
				{
				setState(414);
				lambdaexpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdexpressionContext extends ParserRuleContext {
		public UnqualifiedidContext unqualifiedid() {
			return getRuleContext(UnqualifiedidContext.class,0);
		}
		public QualifiedidContext qualifiedid() {
			return getRuleContext(QualifiedidContext.class,0);
		}
		public IdexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterIdexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitIdexpression(this);
		}
	}

	public final IdexpressionContext idexpression() throws RecognitionException {
		IdexpressionContext _localctx = new IdexpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_idexpression);
		try {
			setState(419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(417);
				unqualifiedid();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(418);
				qualifiedid();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnqualifiedidContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public OperatorfunctionidContext operatorfunctionid() {
			return getRuleContext(OperatorfunctionidContext.class,0);
		}
		public ConversionfunctionidContext conversionfunctionid() {
			return getRuleContext(ConversionfunctionidContext.class,0);
		}
		public LiteraloperatoridContext literaloperatorid() {
			return getRuleContext(LiteraloperatoridContext.class,0);
		}
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public DecltypespecifierContext decltypespecifier() {
			return getRuleContext(DecltypespecifierContext.class,0);
		}
		public TemplateidContext templateid() {
			return getRuleContext(TemplateidContext.class,0);
		}
		public UnqualifiedidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unqualifiedid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterUnqualifiedid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitUnqualifiedid(this);
		}
	}

	public final UnqualifiedidContext unqualifiedid() throws RecognitionException {
		UnqualifiedidContext _localctx = new UnqualifiedidContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_unqualifiedid);
		try {
			setState(430);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(421);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(422);
				operatorfunctionid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(423);
				conversionfunctionid();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(424);
				literaloperatorid();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(425);
				match(Tilde);
				setState(426);
				classname();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(427);
				match(Tilde);
				setState(428);
				decltypespecifier();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(429);
				templateid();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedidContext extends ParserRuleContext {
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public UnqualifiedidContext unqualifiedid() {
			return getRuleContext(UnqualifiedidContext.class,0);
		}
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public QualifiedidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterQualifiedid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitQualifiedid(this);
		}
	}

	public final QualifiedidContext qualifiedid() throws RecognitionException {
		QualifiedidContext _localctx = new QualifiedidContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_qualifiedid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			nestednamespecifier(0);
			setState(434);
			_la = _input.LA(1);
			if (_la==Template) {
				{
				setState(433);
				match(Template);
				}
			}

			setState(436);
			unqualifiedid();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NestednamespecifierContext extends ParserRuleContext {
		public TypenameContext typename() {
			return getRuleContext(TypenameContext.class,0);
		}
		public NamespacenameContext namespacename() {
			return getRuleContext(NamespacenameContext.class,0);
		}
		public DecltypespecifierContext decltypespecifier() {
			return getRuleContext(DecltypespecifierContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public NestednamespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestednamespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNestednamespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNestednamespecifier(this);
		}
	}

	public final NestednamespecifierContext nestednamespecifier() throws RecognitionException {
		return nestednamespecifier(0);
	}

	private NestednamespecifierContext nestednamespecifier(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NestednamespecifierContext _localctx = new NestednamespecifierContext(_ctx, _parentState);
		NestednamespecifierContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_nestednamespecifier, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(439);
				match(Doublecolon);
				}
				break;
			case 2:
				{
				setState(440);
				typename();
				setState(441);
				match(Doublecolon);
				}
				break;
			case 3:
				{
				setState(443);
				namespacename();
				setState(444);
				match(Doublecolon);
				}
				break;
			case 4:
				{
				setState(446);
				decltypespecifier();
				setState(447);
				match(Doublecolon);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(463);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(461);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new NestednamespecifierContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nestednamespecifier);
						setState(451);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(452);
						match(Identifier);
						setState(453);
						match(Doublecolon);
						}
						break;
					case 2:
						{
						_localctx = new NestednamespecifierContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nestednamespecifier);
						setState(454);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(456);
						_la = _input.LA(1);
						if (_la==Template) {
							{
							setState(455);
							match(Template);
							}
						}

						setState(458);
						simpletemplateid();
						setState(459);
						match(Doublecolon);
						}
						break;
					}
					} 
				}
				setState(465);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LambdaexpressionContext extends ParserRuleContext {
		public LambdaintroducerContext lambdaintroducer() {
			return getRuleContext(LambdaintroducerContext.class,0);
		}
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public LambdadeclaratorContext lambdadeclarator() {
			return getRuleContext(LambdadeclaratorContext.class,0);
		}
		public LambdaexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterLambdaexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitLambdaexpression(this);
		}
	}

	public final LambdaexpressionContext lambdaexpression() throws RecognitionException {
		LambdaexpressionContext _localctx = new LambdaexpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_lambdaexpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			lambdaintroducer();
			setState(468);
			_la = _input.LA(1);
			if (_la==LeftParen) {
				{
				setState(467);
				lambdadeclarator();
				}
			}

			setState(470);
			compoundstatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaintroducerContext extends ParserRuleContext {
		public LambdacaptureContext lambdacapture() {
			return getRuleContext(LambdacaptureContext.class,0);
		}
		public LambdaintroducerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaintroducer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterLambdaintroducer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitLambdaintroducer(this);
		}
	}

	public final LambdaintroducerContext lambdaintroducer() throws RecognitionException {
		LambdaintroducerContext _localctx = new LambdaintroducerContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lambdaintroducer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			match(LeftBracket);
			setState(474);
			_la = _input.LA(1);
			if (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (This - 66)) | (1L << (And - 66)) | (1L << (Assign - 66)) | (1L << (Identifier - 66)))) != 0)) {
				{
				setState(473);
				lambdacapture();
				}
			}

			setState(476);
			match(RightBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdacaptureContext extends ParserRuleContext {
		public CapturedefaultContext capturedefault() {
			return getRuleContext(CapturedefaultContext.class,0);
		}
		public CapturelistContext capturelist() {
			return getRuleContext(CapturelistContext.class,0);
		}
		public LambdacaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdacapture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterLambdacapture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitLambdacapture(this);
		}
	}

	public final LambdacaptureContext lambdacapture() throws RecognitionException {
		LambdacaptureContext _localctx = new LambdacaptureContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_lambdacapture);
		try {
			setState(484);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(478);
				capturedefault();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(479);
				capturelist(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(480);
				capturedefault();
				setState(481);
				match(Comma);
				setState(482);
				capturelist(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CapturedefaultContext extends ParserRuleContext {
		public CapturedefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capturedefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterCapturedefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitCapturedefault(this);
		}
	}

	public final CapturedefaultContext capturedefault() throws RecognitionException {
		CapturedefaultContext _localctx = new CapturedefaultContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_capturedefault);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			_la = _input.LA(1);
			if ( !(_la==And || _la==Assign) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CapturelistContext extends ParserRuleContext {
		public CaptureContext capture() {
			return getRuleContext(CaptureContext.class,0);
		}
		public CapturelistContext capturelist() {
			return getRuleContext(CapturelistContext.class,0);
		}
		public CapturelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capturelist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterCapturelist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitCapturelist(this);
		}
	}

	public final CapturelistContext capturelist() throws RecognitionException {
		return capturelist(0);
	}

	private CapturelistContext capturelist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CapturelistContext _localctx = new CapturelistContext(_ctx, _parentState);
		CapturelistContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_capturelist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(489);
			capture();
			setState(491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(490);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(501);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CapturelistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_capturelist);
					setState(493);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(494);
					match(Comma);
					setState(495);
					capture();
					setState(497);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						setState(496);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(503);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CaptureContext extends ParserRuleContext {
		public SimplecaptureContext simplecapture() {
			return getRuleContext(SimplecaptureContext.class,0);
		}
		public InitcaptureContext initcapture() {
			return getRuleContext(InitcaptureContext.class,0);
		}
		public CaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterCapture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitCapture(this);
		}
	}

	public final CaptureContext capture() throws RecognitionException {
		CaptureContext _localctx = new CaptureContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_capture);
		try {
			setState(506);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(504);
				simplecapture();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(505);
				initcapture();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimplecaptureContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public TerminalNode This() { return getToken(CPP14Parser.This, 0); }
		public SimplecaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simplecapture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterSimplecapture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitSimplecapture(this);
		}
	}

	public final SimplecaptureContext simplecapture() throws RecognitionException {
		SimplecaptureContext _localctx = new SimplecaptureContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_simplecapture);
		try {
			setState(512);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(508);
				match(Identifier);
				}
				break;
			case And:
				enterOuterAlt(_localctx, 2);
				{
				setState(509);
				match(And);
				setState(510);
				match(Identifier);
				}
				break;
			case This:
				enterOuterAlt(_localctx, 3);
				{
				setState(511);
				match(This);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitcaptureContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public InitcaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initcapture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterInitcapture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitInitcapture(this);
		}
	}

	public final InitcaptureContext initcapture() throws RecognitionException {
		InitcaptureContext _localctx = new InitcaptureContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_initcapture);
		try {
			setState(519);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(514);
				match(Identifier);
				setState(515);
				initializer();
				}
				break;
			case And:
				enterOuterAlt(_localctx, 2);
				{
				setState(516);
				match(And);
				setState(517);
				match(Identifier);
				setState(518);
				initializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdadeclaratorContext extends ParserRuleContext {
		public ParameterdeclarationclauseContext parameterdeclarationclause() {
			return getRuleContext(ParameterdeclarationclauseContext.class,0);
		}
		public TerminalNode Mutable() { return getToken(CPP14Parser.Mutable, 0); }
		public ExceptionspecificationContext exceptionspecification() {
			return getRuleContext(ExceptionspecificationContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TrailingreturntypeContext trailingreturntype() {
			return getRuleContext(TrailingreturntypeContext.class,0);
		}
		public LambdadeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdadeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterLambdadeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitLambdadeclarator(this);
		}
	}

	public final LambdadeclaratorContext lambdadeclarator() throws RecognitionException {
		LambdadeclaratorContext _localctx = new LambdadeclaratorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_lambdadeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			match(LeftParen);
			setState(522);
			parameterdeclarationclause();
			setState(523);
			match(RightParen);
			setState(525);
			_la = _input.LA(1);
			if (_la==Mutable) {
				{
				setState(524);
				match(Mutable);
				}
			}

			setState(528);
			_la = _input.LA(1);
			if (_la==Noexcept || _la==Throw) {
				{
				setState(527);
				exceptionspecification();
				}
			}

			setState(531);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(530);
				attributespecifierseq(0);
				}
			}

			setState(534);
			_la = _input.LA(1);
			if (_la==Arrow) {
				{
				setState(533);
				trailingreturntype();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixexpressionContext extends ParserRuleContext {
		public PrimaryexpressionContext primaryexpression() {
			return getRuleContext(PrimaryexpressionContext.class,0);
		}
		public SimpletypespecifierContext simpletypespecifier() {
			return getRuleContext(SimpletypespecifierContext.class,0);
		}
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public TypenamespecifierContext typenamespecifier() {
			return getRuleContext(TypenamespecifierContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public TerminalNode Dynamic_cast() { return getToken(CPP14Parser.Dynamic_cast, 0); }
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Static_cast() { return getToken(CPP14Parser.Static_cast, 0); }
		public TerminalNode Reinterpret_cast() { return getToken(CPP14Parser.Reinterpret_cast, 0); }
		public TerminalNode Const_cast() { return getToken(CPP14Parser.Const_cast, 0); }
		public TerminalNode Typeid() { return getToken(CPP14Parser.Typeid, 0); }
		public PostfixexpressionContext postfixexpression() {
			return getRuleContext(PostfixexpressionContext.class,0);
		}
		public IdexpressionContext idexpression() {
			return getRuleContext(IdexpressionContext.class,0);
		}
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public PseudodestructornameContext pseudodestructorname() {
			return getRuleContext(PseudodestructornameContext.class,0);
		}
		public PostfixexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterPostfixexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitPostfixexpression(this);
		}
	}

	public final PostfixexpressionContext postfixexpression() throws RecognitionException {
		return postfixexpression(0);
	}

	private PostfixexpressionContext postfixexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PostfixexpressionContext _localctx = new PostfixexpressionContext(_ctx, _parentState);
		PostfixexpressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_postfixexpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(537);
				primaryexpression();
				}
				break;
			case 2:
				{
				setState(538);
				simpletypespecifier();
				setState(539);
				match(LeftParen);
				setState(541);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (This - 66)) | (1L << (Throw - 66)) | (1L << (True - 66)) | (1L << (Typeid - 66)) | (1L << (Typename - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (LeftBrace - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (Not - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)) | (1L << (Doublecolon - 66)) | (1L << (Identifier - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (Integerliteral - 130)) | (1L << (Characterliteral - 130)) | (1L << (Floatingliteral - 130)) | (1L << (Stringliteral - 130)) | (1L << (Userdefinedintegerliteral - 130)) | (1L << (Userdefinedfloatingliteral - 130)) | (1L << (Userdefinedstringliteral - 130)) | (1L << (Userdefinedcharacterliteral - 130)))) != 0)) {
					{
					setState(540);
					expressionlist();
					}
				}

				setState(543);
				match(RightParen);
				}
				break;
			case 3:
				{
				setState(545);
				typenamespecifier();
				setState(546);
				match(LeftParen);
				setState(548);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (This - 66)) | (1L << (Throw - 66)) | (1L << (True - 66)) | (1L << (Typeid - 66)) | (1L << (Typename - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (LeftBrace - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (Not - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)) | (1L << (Doublecolon - 66)) | (1L << (Identifier - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (Integerliteral - 130)) | (1L << (Characterliteral - 130)) | (1L << (Floatingliteral - 130)) | (1L << (Stringliteral - 130)) | (1L << (Userdefinedintegerliteral - 130)) | (1L << (Userdefinedfloatingliteral - 130)) | (1L << (Userdefinedstringliteral - 130)) | (1L << (Userdefinedcharacterliteral - 130)))) != 0)) {
					{
					setState(547);
					expressionlist();
					}
				}

				setState(550);
				match(RightParen);
				}
				break;
			case 4:
				{
				setState(552);
				simpletypespecifier();
				setState(553);
				bracedinitlist();
				}
				break;
			case 5:
				{
				setState(555);
				typenamespecifier();
				setState(556);
				bracedinitlist();
				}
				break;
			case 6:
				{
				setState(558);
				match(Dynamic_cast);
				setState(559);
				match(Less);
				setState(560);
				typeid();
				setState(561);
				match(Greater);
				setState(562);
				match(LeftParen);
				setState(563);
				expression(0);
				setState(564);
				match(RightParen);
				}
				break;
			case 7:
				{
				setState(566);
				match(Static_cast);
				setState(567);
				match(Less);
				setState(568);
				typeid();
				setState(569);
				match(Greater);
				setState(570);
				match(LeftParen);
				setState(571);
				expression(0);
				setState(572);
				match(RightParen);
				}
				break;
			case 8:
				{
				setState(574);
				match(Reinterpret_cast);
				setState(575);
				match(Less);
				setState(576);
				typeid();
				setState(577);
				match(Greater);
				setState(578);
				match(LeftParen);
				setState(579);
				expression(0);
				setState(580);
				match(RightParen);
				}
				break;
			case 9:
				{
				setState(582);
				match(Const_cast);
				setState(583);
				match(Less);
				setState(584);
				typeid();
				setState(585);
				match(Greater);
				setState(586);
				match(LeftParen);
				setState(587);
				expression(0);
				setState(588);
				match(RightParen);
				}
				break;
			case 10:
				{
				setState(590);
				match(Typeid);
				setState(591);
				match(LeftParen);
				setState(592);
				expression(0);
				setState(593);
				match(RightParen);
				}
				break;
			case 11:
				{
				setState(595);
				match(Typeid);
				setState(596);
				match(LeftParen);
				setState(597);
				typeid();
				setState(598);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(642);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(640);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(602);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(603);
						match(LeftBracket);
						setState(604);
						expression(0);
						setState(605);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(607);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(608);
						match(LeftBracket);
						setState(609);
						bracedinitlist();
						setState(610);
						match(RightBracket);
						}
						break;
					case 3:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(612);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(613);
						match(LeftParen);
						setState(615);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (This - 66)) | (1L << (Throw - 66)) | (1L << (True - 66)) | (1L << (Typeid - 66)) | (1L << (Typename - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (LeftBrace - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (Not - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)) | (1L << (Doublecolon - 66)) | (1L << (Identifier - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (Integerliteral - 130)) | (1L << (Characterliteral - 130)) | (1L << (Floatingliteral - 130)) | (1L << (Stringliteral - 130)) | (1L << (Userdefinedintegerliteral - 130)) | (1L << (Userdefinedfloatingliteral - 130)) | (1L << (Userdefinedstringliteral - 130)) | (1L << (Userdefinedcharacterliteral - 130)))) != 0)) {
							{
							setState(614);
							expressionlist();
							}
						}

						setState(617);
						match(RightParen);
						}
						break;
					case 4:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(618);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(619);
						match(Dot);
						setState(621);
						_la = _input.LA(1);
						if (_la==Template) {
							{
							setState(620);
							match(Template);
							}
						}

						setState(623);
						idexpression();
						}
						break;
					case 5:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(624);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(625);
						match(Arrow);
						setState(627);
						_la = _input.LA(1);
						if (_la==Template) {
							{
							setState(626);
							match(Template);
							}
						}

						setState(629);
						idexpression();
						}
						break;
					case 6:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(630);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(631);
						match(Dot);
						setState(632);
						pseudodestructorname();
						}
						break;
					case 7:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(633);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(634);
						match(Arrow);
						setState(635);
						pseudodestructorname();
						}
						break;
					case 8:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(636);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(637);
						match(PlusPlus);
						}
						break;
					case 9:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(638);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(639);
						match(MinusMinus);
						}
						break;
					}
					} 
				}
				setState(644);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionlistContext extends ParserRuleContext {
		public InitializerlistContext initializerlist() {
			return getRuleContext(InitializerlistContext.class,0);
		}
		public ExpressionlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterExpressionlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitExpressionlist(this);
		}
	}

	public final ExpressionlistContext expressionlist() throws RecognitionException {
		ExpressionlistContext _localctx = new ExpressionlistContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expressionlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			initializerlist(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PseudodestructornameContext extends ParserRuleContext {
		public List<TypenameContext> typename() {
			return getRuleContexts(TypenameContext.class);
		}
		public TypenameContext typename(int i) {
			return getRuleContext(TypenameContext.class,i);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public DecltypespecifierContext decltypespecifier() {
			return getRuleContext(DecltypespecifierContext.class,0);
		}
		public PseudodestructornameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudodestructorname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterPseudodestructorname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitPseudodestructorname(this);
		}
	}

	public final PseudodestructornameContext pseudodestructorname() throws RecognitionException {
		PseudodestructornameContext _localctx = new PseudodestructornameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_pseudodestructorname);
		int _la;
		try {
			setState(669);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(648);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(647);
					nestednamespecifier(0);
					}
					break;
				}
				setState(650);
				typename();
				setState(651);
				match(Doublecolon);
				setState(652);
				match(Tilde);
				setState(653);
				typename();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(655);
				nestednamespecifier(0);
				setState(656);
				match(Template);
				setState(657);
				simpletemplateid();
				setState(658);
				match(Doublecolon);
				setState(659);
				match(Tilde);
				setState(660);
				typename();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(663);
				_la = _input.LA(1);
				if (_la==Decltype || _la==Doublecolon || _la==Identifier) {
					{
					setState(662);
					nestednamespecifier(0);
					}
				}

				setState(665);
				match(Tilde);
				setState(666);
				typename();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(667);
				match(Tilde);
				setState(668);
				decltypespecifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryexpressionContext extends ParserRuleContext {
		public PostfixexpressionContext postfixexpression() {
			return getRuleContext(PostfixexpressionContext.class,0);
		}
		public CastexpressionContext castexpression() {
			return getRuleContext(CastexpressionContext.class,0);
		}
		public UnaryoperatorContext unaryoperator() {
			return getRuleContext(UnaryoperatorContext.class,0);
		}
		public TerminalNode Sizeof() { return getToken(CPP14Parser.Sizeof, 0); }
		public UnaryexpressionContext unaryexpression() {
			return getRuleContext(UnaryexpressionContext.class,0);
		}
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public TerminalNode Alignof() { return getToken(CPP14Parser.Alignof, 0); }
		public NoexceptexpressionContext noexceptexpression() {
			return getRuleContext(NoexceptexpressionContext.class,0);
		}
		public NewexpressionContext newexpression() {
			return getRuleContext(NewexpressionContext.class,0);
		}
		public DeleteexpressionContext deleteexpression() {
			return getRuleContext(DeleteexpressionContext.class,0);
		}
		public UnaryexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterUnaryexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitUnaryexpression(this);
		}
	}

	public final UnaryexpressionContext unaryexpression() throws RecognitionException {
		UnaryexpressionContext _localctx = new UnaryexpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_unaryexpression);
		try {
			setState(699);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(671);
				postfixexpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(672);
				match(PlusPlus);
				setState(673);
				castexpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(674);
				match(MinusMinus);
				setState(675);
				castexpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(676);
				unaryoperator();
				setState(677);
				castexpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(679);
				match(Sizeof);
				setState(680);
				unaryexpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(681);
				match(Sizeof);
				setState(682);
				match(LeftParen);
				setState(683);
				typeid();
				setState(684);
				match(RightParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(686);
				match(Sizeof);
				setState(687);
				match(Ellipsis);
				setState(688);
				match(LeftParen);
				setState(689);
				match(Identifier);
				setState(690);
				match(RightParen);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(691);
				match(Alignof);
				setState(692);
				match(LeftParen);
				setState(693);
				typeid();
				setState(694);
				match(RightParen);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(696);
				noexceptexpression();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(697);
				newexpression();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(698);
				deleteexpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryoperatorContext extends ParserRuleContext {
		public UnaryoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterUnaryoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitUnaryoperator(this);
		}
	}

	public final UnaryoperatorContext unaryoperator() throws RecognitionException {
		UnaryoperatorContext _localctx = new UnaryoperatorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_unaryoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			_la = _input.LA(1);
			if ( !(((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (Plus - 88)) | (1L << (Minus - 88)) | (1L << (Star - 88)) | (1L << (And - 88)) | (1L << (Or - 88)) | (1L << (Tilde - 88)) | (1L << (Not - 88)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewexpressionContext extends ParserRuleContext {
		public TerminalNode New() { return getToken(CPP14Parser.New, 0); }
		public NewtypeidContext newtypeid() {
			return getRuleContext(NewtypeidContext.class,0);
		}
		public NewplacementContext newplacement() {
			return getRuleContext(NewplacementContext.class,0);
		}
		public NewinitializerContext newinitializer() {
			return getRuleContext(NewinitializerContext.class,0);
		}
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public NewexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNewexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNewexpression(this);
		}
	}

	public final NewexpressionContext newexpression() throws RecognitionException {
		NewexpressionContext _localctx = new NewexpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_newexpression);
		int _la;
		try {
			setState(727);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(704);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(703);
					match(Doublecolon);
					}
				}

				setState(706);
				match(New);
				setState(708);
				_la = _input.LA(1);
				if (_la==LeftParen) {
					{
					setState(707);
					newplacement();
					}
				}

				setState(710);
				newtypeid();
				setState(712);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(711);
					newinitializer();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(715);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(714);
					match(Doublecolon);
					}
				}

				setState(717);
				match(New);
				setState(719);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(718);
					newplacement();
					}
					break;
				}
				setState(721);
				match(LeftParen);
				setState(722);
				typeid();
				setState(723);
				match(RightParen);
				setState(725);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(724);
					newinitializer();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewplacementContext extends ParserRuleContext {
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public NewplacementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newplacement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNewplacement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNewplacement(this);
		}
	}

	public final NewplacementContext newplacement() throws RecognitionException {
		NewplacementContext _localctx = new NewplacementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_newplacement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
			match(LeftParen);
			setState(730);
			expressionlist();
			setState(731);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewtypeidContext extends ParserRuleContext {
		public TypespecifierseqContext typespecifierseq() {
			return getRuleContext(TypespecifierseqContext.class,0);
		}
		public NewdeclaratorContext newdeclarator() {
			return getRuleContext(NewdeclaratorContext.class,0);
		}
		public NewtypeidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newtypeid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNewtypeid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNewtypeid(this);
		}
	}

	public final NewtypeidContext newtypeid() throws RecognitionException {
		NewtypeidContext _localctx = new NewtypeidContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_newtypeid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(733);
			typespecifierseq();
			setState(735);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(734);
				newdeclarator();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewdeclaratorContext extends ParserRuleContext {
		public PtroperatorContext ptroperator() {
			return getRuleContext(PtroperatorContext.class,0);
		}
		public NewdeclaratorContext newdeclarator() {
			return getRuleContext(NewdeclaratorContext.class,0);
		}
		public NoptrnewdeclaratorContext noptrnewdeclarator() {
			return getRuleContext(NoptrnewdeclaratorContext.class,0);
		}
		public NewdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNewdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNewdeclarator(this);
		}
	}

	public final NewdeclaratorContext newdeclarator() throws RecognitionException {
		NewdeclaratorContext _localctx = new NewdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_newdeclarator);
		try {
			setState(742);
			switch (_input.LA(1)) {
			case Decltype:
			case Star:
			case And:
			case AndAnd:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(737);
				ptroperator();
				setState(739);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(738);
					newdeclarator();
					}
					break;
				}
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(741);
				noptrnewdeclarator(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoptrnewdeclaratorContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public NoptrnewdeclaratorContext noptrnewdeclarator() {
			return getRuleContext(NoptrnewdeclaratorContext.class,0);
		}
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public NoptrnewdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noptrnewdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNoptrnewdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNoptrnewdeclarator(this);
		}
	}

	public final NoptrnewdeclaratorContext noptrnewdeclarator() throws RecognitionException {
		return noptrnewdeclarator(0);
	}

	private NoptrnewdeclaratorContext noptrnewdeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoptrnewdeclaratorContext _localctx = new NoptrnewdeclaratorContext(_ctx, _parentState);
		NoptrnewdeclaratorContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_noptrnewdeclarator, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(745);
			match(LeftBracket);
			setState(746);
			expression(0);
			setState(747);
			match(RightBracket);
			setState(749);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(748);
				attributespecifierseq(0);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(760);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NoptrnewdeclaratorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_noptrnewdeclarator);
					setState(751);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(752);
					match(LeftBracket);
					setState(753);
					constantexpression();
					setState(754);
					match(RightBracket);
					setState(756);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
					case 1:
						{
						setState(755);
						attributespecifierseq(0);
						}
						break;
					}
					}
					} 
				}
				setState(762);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class NewinitializerContext extends ParserRuleContext {
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public NewinitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newinitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNewinitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNewinitializer(this);
		}
	}

	public final NewinitializerContext newinitializer() throws RecognitionException {
		NewinitializerContext _localctx = new NewinitializerContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_newinitializer);
		int _la;
		try {
			setState(769);
			switch (_input.LA(1)) {
			case LeftParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(763);
				match(LeftParen);
				setState(765);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (This - 66)) | (1L << (Throw - 66)) | (1L << (True - 66)) | (1L << (Typeid - 66)) | (1L << (Typename - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (LeftBrace - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (Not - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)) | (1L << (Doublecolon - 66)) | (1L << (Identifier - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (Integerliteral - 130)) | (1L << (Characterliteral - 130)) | (1L << (Floatingliteral - 130)) | (1L << (Stringliteral - 130)) | (1L << (Userdefinedintegerliteral - 130)) | (1L << (Userdefinedfloatingliteral - 130)) | (1L << (Userdefinedstringliteral - 130)) | (1L << (Userdefinedcharacterliteral - 130)))) != 0)) {
					{
					setState(764);
					expressionlist();
					}
				}

				setState(767);
				match(RightParen);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(768);
				bracedinitlist();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleteexpressionContext extends ParserRuleContext {
		public TerminalNode Delete() { return getToken(CPP14Parser.Delete, 0); }
		public CastexpressionContext castexpression() {
			return getRuleContext(CastexpressionContext.class,0);
		}
		public DeleteexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterDeleteexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitDeleteexpression(this);
		}
	}

	public final DeleteexpressionContext deleteexpression() throws RecognitionException {
		DeleteexpressionContext _localctx = new DeleteexpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_deleteexpression);
		int _la;
		try {
			setState(783);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(772);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(771);
					match(Doublecolon);
					}
				}

				setState(774);
				match(Delete);
				setState(775);
				castexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(777);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(776);
					match(Doublecolon);
					}
				}

				setState(779);
				match(Delete);
				setState(780);
				match(LeftBracket);
				setState(781);
				match(RightBracket);
				setState(782);
				castexpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoexceptexpressionContext extends ParserRuleContext {
		public TerminalNode Noexcept() { return getToken(CPP14Parser.Noexcept, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NoexceptexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noexceptexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNoexceptexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNoexceptexpression(this);
		}
	}

	public final NoexceptexpressionContext noexceptexpression() throws RecognitionException {
		NoexceptexpressionContext _localctx = new NoexceptexpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_noexceptexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(785);
			match(Noexcept);
			setState(786);
			match(LeftParen);
			setState(787);
			expression(0);
			setState(788);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastexpressionContext extends ParserRuleContext {
		public UnaryexpressionContext unaryexpression() {
			return getRuleContext(UnaryexpressionContext.class,0);
		}
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public CastexpressionContext castexpression() {
			return getRuleContext(CastexpressionContext.class,0);
		}
		public CastexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterCastexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitCastexpression(this);
		}
	}

	public final CastexpressionContext castexpression() throws RecognitionException {
		CastexpressionContext _localctx = new CastexpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_castexpression);
		try {
			setState(796);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(790);
				unaryexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(791);
				match(LeftParen);
				setState(792);
				typeid();
				setState(793);
				match(RightParen);
				setState(794);
				castexpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PmexpressionContext extends ParserRuleContext {
		public CastexpressionContext castexpression() {
			return getRuleContext(CastexpressionContext.class,0);
		}
		public PmexpressionContext pmexpression() {
			return getRuleContext(PmexpressionContext.class,0);
		}
		public PmexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pmexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterPmexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitPmexpression(this);
		}
	}

	public final PmexpressionContext pmexpression() throws RecognitionException {
		return pmexpression(0);
	}

	private PmexpressionContext pmexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PmexpressionContext _localctx = new PmexpressionContext(_ctx, _parentState);
		PmexpressionContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_pmexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(799);
			castexpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(809);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(807);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
					case 1:
						{
						_localctx = new PmexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pmexpression);
						setState(801);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(802);
						match(DotStar);
						setState(803);
						castexpression();
						}
						break;
					case 2:
						{
						_localctx = new PmexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pmexpression);
						setState(804);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(805);
						match(ArrowStar);
						setState(806);
						castexpression();
						}
						break;
					}
					} 
				}
				setState(811);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MultiplicativeexpressionContext extends ParserRuleContext {
		public PmexpressionContext pmexpression() {
			return getRuleContext(PmexpressionContext.class,0);
		}
		public MultiplicativeexpressionContext multiplicativeexpression() {
			return getRuleContext(MultiplicativeexpressionContext.class,0);
		}
		public MultiplicativeexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterMultiplicativeexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitMultiplicativeexpression(this);
		}
	}

	public final MultiplicativeexpressionContext multiplicativeexpression() throws RecognitionException {
		return multiplicativeexpression(0);
	}

	private MultiplicativeexpressionContext multiplicativeexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeexpressionContext _localctx = new MultiplicativeexpressionContext(_ctx, _parentState);
		MultiplicativeexpressionContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_multiplicativeexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(813);
			pmexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(826);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(824);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeexpression);
						setState(815);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(816);
						match(Star);
						setState(817);
						pmexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeexpression);
						setState(818);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(819);
						match(Div);
						setState(820);
						pmexpression(0);
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeexpression);
						setState(821);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(822);
						match(Mod);
						setState(823);
						pmexpression(0);
						}
						break;
					}
					} 
				}
				setState(828);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AdditiveexpressionContext extends ParserRuleContext {
		public MultiplicativeexpressionContext multiplicativeexpression() {
			return getRuleContext(MultiplicativeexpressionContext.class,0);
		}
		public AdditiveexpressionContext additiveexpression() {
			return getRuleContext(AdditiveexpressionContext.class,0);
		}
		public AdditiveexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAdditiveexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAdditiveexpression(this);
		}
	}

	public final AdditiveexpressionContext additiveexpression() throws RecognitionException {
		return additiveexpression(0);
	}

	private AdditiveexpressionContext additiveexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveexpressionContext _localctx = new AdditiveexpressionContext(_ctx, _parentState);
		AdditiveexpressionContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_additiveexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(830);
			multiplicativeexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(840);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(838);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveexpression);
						setState(832);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(833);
						match(Plus);
						setState(834);
						multiplicativeexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveexpression);
						setState(835);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(836);
						match(Minus);
						setState(837);
						multiplicativeexpression(0);
						}
						break;
					}
					} 
				}
				setState(842);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ShiftexpressionContext extends ParserRuleContext {
		public AdditiveexpressionContext additiveexpression() {
			return getRuleContext(AdditiveexpressionContext.class,0);
		}
		public ShiftexpressionContext shiftexpression() {
			return getRuleContext(ShiftexpressionContext.class,0);
		}
		public RightShiftContext rightShift() {
			return getRuleContext(RightShiftContext.class,0);
		}
		public ShiftexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterShiftexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitShiftexpression(this);
		}
	}

	public final ShiftexpressionContext shiftexpression() throws RecognitionException {
		return shiftexpression(0);
	}

	private ShiftexpressionContext shiftexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ShiftexpressionContext _localctx = new ShiftexpressionContext(_ctx, _parentState);
		ShiftexpressionContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_shiftexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(844);
			additiveexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(855);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(853);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftexpression);
						setState(846);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(847);
						match(LeftShift);
						setState(848);
						additiveexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new ShiftexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftexpression);
						setState(849);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(850);
						rightShift();
						setState(851);
						additiveexpression(0);
						}
						break;
					}
					} 
				}
				setState(857);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RelationalexpressionContext extends ParserRuleContext {
		public ShiftexpressionContext shiftexpression() {
			return getRuleContext(ShiftexpressionContext.class,0);
		}
		public RelationalexpressionContext relationalexpression() {
			return getRuleContext(RelationalexpressionContext.class,0);
		}
		public RelationalexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterRelationalexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitRelationalexpression(this);
		}
	}

	public final RelationalexpressionContext relationalexpression() throws RecognitionException {
		return relationalexpression(0);
	}

	private RelationalexpressionContext relationalexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalexpressionContext _localctx = new RelationalexpressionContext(_ctx, _parentState);
		RelationalexpressionContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_relationalexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(859);
			shiftexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(875);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(873);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(861);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(862);
						match(Less);
						setState(863);
						shiftexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(864);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(865);
						match(Greater);
						setState(866);
						shiftexpression(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(867);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(868);
						match(LessEqual);
						setState(869);
						shiftexpression(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(870);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(871);
						match(GreaterEqual);
						setState(872);
						shiftexpression(0);
						}
						break;
					}
					} 
				}
				setState(877);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqualityexpressionContext extends ParserRuleContext {
		public RelationalexpressionContext relationalexpression() {
			return getRuleContext(RelationalexpressionContext.class,0);
		}
		public EqualityexpressionContext equalityexpression() {
			return getRuleContext(EqualityexpressionContext.class,0);
		}
		public EqualityexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterEqualityexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitEqualityexpression(this);
		}
	}

	public final EqualityexpressionContext equalityexpression() throws RecognitionException {
		return equalityexpression(0);
	}

	private EqualityexpressionContext equalityexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityexpressionContext _localctx = new EqualityexpressionContext(_ctx, _parentState);
		EqualityexpressionContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_equalityexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(879);
			relationalexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(889);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(887);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityexpression);
						setState(881);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(882);
						match(Equal);
						setState(883);
						relationalexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityexpression);
						setState(884);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(885);
						match(NotEqual);
						setState(886);
						relationalexpression(0);
						}
						break;
					}
					} 
				}
				setState(891);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndexpressionContext extends ParserRuleContext {
		public EqualityexpressionContext equalityexpression() {
			return getRuleContext(EqualityexpressionContext.class,0);
		}
		public AndexpressionContext andexpression() {
			return getRuleContext(AndexpressionContext.class,0);
		}
		public AndexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAndexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAndexpression(this);
		}
	}

	public final AndexpressionContext andexpression() throws RecognitionException {
		return andexpression(0);
	}

	private AndexpressionContext andexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndexpressionContext _localctx = new AndexpressionContext(_ctx, _parentState);
		AndexpressionContext _prevctx = _localctx;
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_andexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(893);
			equalityexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(900);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andexpression);
					setState(895);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(896);
					match(And);
					setState(897);
					equalityexpression(0);
					}
					} 
				}
				setState(902);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExclusiveorexpressionContext extends ParserRuleContext {
		public AndexpressionContext andexpression() {
			return getRuleContext(AndexpressionContext.class,0);
		}
		public ExclusiveorexpressionContext exclusiveorexpression() {
			return getRuleContext(ExclusiveorexpressionContext.class,0);
		}
		public ExclusiveorexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveorexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterExclusiveorexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitExclusiveorexpression(this);
		}
	}

	public final ExclusiveorexpressionContext exclusiveorexpression() throws RecognitionException {
		return exclusiveorexpression(0);
	}

	private ExclusiveorexpressionContext exclusiveorexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExclusiveorexpressionContext _localctx = new ExclusiveorexpressionContext(_ctx, _parentState);
		ExclusiveorexpressionContext _prevctx = _localctx;
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_exclusiveorexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(904);
			andexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(911);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveorexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveorexpression);
					setState(906);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(907);
					match(Caret);
					setState(908);
					andexpression(0);
					}
					} 
				}
				setState(913);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InclusiveorexpressionContext extends ParserRuleContext {
		public ExclusiveorexpressionContext exclusiveorexpression() {
			return getRuleContext(ExclusiveorexpressionContext.class,0);
		}
		public InclusiveorexpressionContext inclusiveorexpression() {
			return getRuleContext(InclusiveorexpressionContext.class,0);
		}
		public InclusiveorexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveorexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterInclusiveorexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitInclusiveorexpression(this);
		}
	}

	public final InclusiveorexpressionContext inclusiveorexpression() throws RecognitionException {
		return inclusiveorexpression(0);
	}

	private InclusiveorexpressionContext inclusiveorexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InclusiveorexpressionContext _localctx = new InclusiveorexpressionContext(_ctx, _parentState);
		InclusiveorexpressionContext _prevctx = _localctx;
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_inclusiveorexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(915);
			exclusiveorexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(922);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveorexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveorexpression);
					setState(917);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(918);
					match(Or);
					setState(919);
					exclusiveorexpression(0);
					}
					} 
				}
				setState(924);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicalandexpressionContext extends ParserRuleContext {
		public InclusiveorexpressionContext inclusiveorexpression() {
			return getRuleContext(InclusiveorexpressionContext.class,0);
		}
		public LogicalandexpressionContext logicalandexpression() {
			return getRuleContext(LogicalandexpressionContext.class,0);
		}
		public LogicalandexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalandexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterLogicalandexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitLogicalandexpression(this);
		}
	}

	public final LogicalandexpressionContext logicalandexpression() throws RecognitionException {
		return logicalandexpression(0);
	}

	private LogicalandexpressionContext logicalandexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalandexpressionContext _localctx = new LogicalandexpressionContext(_ctx, _parentState);
		LogicalandexpressionContext _prevctx = _localctx;
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_logicalandexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(926);
			inclusiveorexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(933);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalandexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalandexpression);
					setState(928);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(929);
					match(AndAnd);
					setState(930);
					inclusiveorexpression(0);
					}
					} 
				}
				setState(935);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicalorexpressionContext extends ParserRuleContext {
		public LogicalandexpressionContext logicalandexpression() {
			return getRuleContext(LogicalandexpressionContext.class,0);
		}
		public LogicalorexpressionContext logicalorexpression() {
			return getRuleContext(LogicalorexpressionContext.class,0);
		}
		public LogicalorexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalorexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterLogicalorexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitLogicalorexpression(this);
		}
	}

	public final LogicalorexpressionContext logicalorexpression() throws RecognitionException {
		return logicalorexpression(0);
	}

	private LogicalorexpressionContext logicalorexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalorexpressionContext _localctx = new LogicalorexpressionContext(_ctx, _parentState);
		LogicalorexpressionContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_logicalorexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(937);
			logicalandexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(944);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalorexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalorexpression);
					setState(939);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(940);
					match(OrOr);
					setState(941);
					logicalandexpression(0);
					}
					} 
				}
				setState(946);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConditionalexpressionContext extends ParserRuleContext {
		public LogicalorexpressionContext logicalorexpression() {
			return getRuleContext(LogicalorexpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentexpressionContext assignmentexpression() {
			return getRuleContext(AssignmentexpressionContext.class,0);
		}
		public ConditionalexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterConditionalexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitConditionalexpression(this);
		}
	}

	public final ConditionalexpressionContext conditionalexpression() throws RecognitionException {
		ConditionalexpressionContext _localctx = new ConditionalexpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_conditionalexpression);
		try {
			setState(954);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(947);
				logicalorexpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(948);
				logicalorexpression(0);
				setState(949);
				match(Question);
				setState(950);
				expression(0);
				setState(951);
				match(Colon);
				setState(952);
				assignmentexpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentexpressionContext extends ParserRuleContext {
		public ConditionalexpressionContext conditionalexpression() {
			return getRuleContext(ConditionalexpressionContext.class,0);
		}
		public LogicalorexpressionContext logicalorexpression() {
			return getRuleContext(LogicalorexpressionContext.class,0);
		}
		public AssignmentoperatorContext assignmentoperator() {
			return getRuleContext(AssignmentoperatorContext.class,0);
		}
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
		}
		public ThrowexpressionContext throwexpression() {
			return getRuleContext(ThrowexpressionContext.class,0);
		}
		public AssignmentexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAssignmentexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAssignmentexpression(this);
		}
	}

	public final AssignmentexpressionContext assignmentexpression() throws RecognitionException {
		AssignmentexpressionContext _localctx = new AssignmentexpressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_assignmentexpression);
		try {
			setState(962);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(956);
				conditionalexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(957);
				logicalorexpression(0);
				setState(958);
				assignmentoperator();
				setState(959);
				initializerclause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(961);
				throwexpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentoperatorContext extends ParserRuleContext {
		public RightShiftAssignContext rightShiftAssign() {
			return getRuleContext(RightShiftAssignContext.class,0);
		}
		public AssignmentoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAssignmentoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAssignmentoperator(this);
		}
	}

	public final AssignmentoperatorContext assignmentoperator() throws RecognitionException {
		AssignmentoperatorContext _localctx = new AssignmentoperatorContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_assignmentoperator);
		try {
			setState(975);
			switch (_input.LA(1)) {
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(964);
				match(Assign);
				}
				break;
			case StarAssign:
				enterOuterAlt(_localctx, 2);
				{
				setState(965);
				match(StarAssign);
				}
				break;
			case DivAssign:
				enterOuterAlt(_localctx, 3);
				{
				setState(966);
				match(DivAssign);
				}
				break;
			case ModAssign:
				enterOuterAlt(_localctx, 4);
				{
				setState(967);
				match(ModAssign);
				}
				break;
			case PlusAssign:
				enterOuterAlt(_localctx, 5);
				{
				setState(968);
				match(PlusAssign);
				}
				break;
			case MinusAssign:
				enterOuterAlt(_localctx, 6);
				{
				setState(969);
				match(MinusAssign);
				}
				break;
			case Greater:
				enterOuterAlt(_localctx, 7);
				{
				setState(970);
				rightShiftAssign();
				}
				break;
			case LeftShiftAssign:
				enterOuterAlt(_localctx, 8);
				{
				setState(971);
				match(LeftShiftAssign);
				}
				break;
			case AndAssign:
				enterOuterAlt(_localctx, 9);
				{
				setState(972);
				match(AndAssign);
				}
				break;
			case XorAssign:
				enterOuterAlt(_localctx, 10);
				{
				setState(973);
				match(XorAssign);
				}
				break;
			case OrAssign:
				enterOuterAlt(_localctx, 11);
				{
				setState(974);
				match(OrAssign);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public AssignmentexpressionContext assignmentexpression() {
			return getRuleContext(AssignmentexpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(978);
			assignmentexpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(985);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(980);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(981);
					match(Comma);
					setState(982);
					assignmentexpression();
					}
					} 
				}
				setState(987);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConstantexpressionContext extends ParserRuleContext {
		public ConditionalexpressionContext conditionalexpression() {
			return getRuleContext(ConditionalexpressionContext.class,0);
		}
		public ConstantexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterConstantexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitConstantexpression(this);
		}
	}

	public final ConstantexpressionContext constantexpression() throws RecognitionException {
		ConstantexpressionContext _localctx = new ConstantexpressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_constantexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(988);
			conditionalexpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NestedParenthesesBlockContext extends ParserRuleContext {
		public List<NestedParenthesesBlockContext> nestedParenthesesBlock() {
			return getRuleContexts(NestedParenthesesBlockContext.class);
		}
		public NestedParenthesesBlockContext nestedParenthesesBlock(int i) {
			return getRuleContext(NestedParenthesesBlockContext.class,i);
		}
		public NestedParenthesesBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedParenthesesBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNestedParenthesesBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNestedParenthesesBlock(this);
		}
	}

	public final NestedParenthesesBlockContext nestedParenthesesBlock() throws RecognitionException {
		NestedParenthesesBlockContext _localctx = new NestedParenthesesBlockContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_nestedParenthesesBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(997);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MultiLineMacro) | (1L << Directive) | (1L << DirectiveKeyword) | (1L << DirectiveFileName) | (1L << McroElseIf) | (1L << LineContinue) | (1L << Alignas) | (1L << Alignof) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Break) | (1L << Case) | (1L << Catch) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Continue) | (1L << Decltype) | (1L << Default) | (1L << Delete) | (1L << Do) | (1L << Double) | (1L << Dynamic_cast) | (1L << Else) | (1L << Enum) | (1L << Explicit) | (1L << Export) | (1L << Extern) | (1L << False) | (1L << Final) | (1L << Float) | (1L << For) | (1L << Friend) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Override) | (1L << Private) | (1L << Protected) | (1L << Public) | (1L << Register) | (1L << Reinterpret_cast) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Static_assert) | (1L << Static_cast) | (1L << Struct))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Switch - 64)) | (1L << (Template - 64)) | (1L << (This - 64)) | (1L << (Thread_local - 64)) | (1L << (Throw - 64)) | (1L << (True - 64)) | (1L << (Try - 64)) | (1L << (Typedef - 64)) | (1L << (Typeid - 64)) | (1L << (Typename - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (While - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (RightBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (RightBrace - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (Div - 64)) | (1L << (Mod - 64)) | (1L << (Caret - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (Assign - 64)) | (1L << (Less - 64)) | (1L << (Greater - 64)) | (1L << (PlusAssign - 64)) | (1L << (MinusAssign - 64)) | (1L << (StarAssign - 64)) | (1L << (DivAssign - 64)) | (1L << (ModAssign - 64)) | (1L << (XorAssign - 64)) | (1L << (AndAssign - 64)) | (1L << (OrAssign - 64)) | (1L << (LeftShift - 64)) | (1L << (LeftShiftAssign - 64)) | (1L << (Equal - 64)) | (1L << (NotEqual - 64)) | (1L << (LessEqual - 64)) | (1L << (GreaterEqual - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Comma - 64)) | (1L << (ArrowStar - 64)) | (1L << (Arrow - 64)) | (1L << (Question - 64)) | (1L << (Colon - 64)) | (1L << (Doublecolon - 64)) | (1L << (Semi - 64)) | (1L << (Dot - 64)) | (1L << (DotStar - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Ellipsis - 128)) | (1L << (Identifier - 128)) | (1L << (Integerliteral - 128)) | (1L << (Decimalliteral - 128)) | (1L << (Octalliteral - 128)) | (1L << (Hexadecimalliteral - 128)) | (1L << (Binaryliteral - 128)) | (1L << (Integersuffix - 128)) | (1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)) | (1L << (Whitespace - 128)) | (1L << (Newline - 128)) | (1L << (NonstandardTokens - 128)) | (1L << (InvalidCharacter - 128)) | (1L << (BlockComment - 128)) | (1L << (LineComment - 128)))) != 0)) {
				{
				setState(995);
				switch (_input.LA(1)) {
				case MultiLineMacro:
				case Directive:
				case DirectiveKeyword:
				case DirectiveFileName:
				case McroElseIf:
				case LineContinue:
				case Alignas:
				case Alignof:
				case Asm:
				case Auto:
				case Bool:
				case Break:
				case Case:
				case Catch:
				case Char:
				case Char16:
				case Char32:
				case Class:
				case Const:
				case Constexpr:
				case Const_cast:
				case Continue:
				case Decltype:
				case Default:
				case Delete:
				case Do:
				case Double:
				case Dynamic_cast:
				case Else:
				case Enum:
				case Explicit:
				case Export:
				case Extern:
				case False:
				case Final:
				case Float:
				case For:
				case Friend:
				case Goto:
				case If:
				case Inline:
				case Int:
				case Long:
				case Mutable:
				case Namespace:
				case New:
				case Noexcept:
				case Nullptr:
				case Operator:
				case Override:
				case Private:
				case Protected:
				case Public:
				case Register:
				case Reinterpret_cast:
				case Return:
				case Short:
				case Signed:
				case Sizeof:
				case Static:
				case Static_assert:
				case Static_cast:
				case Struct:
				case Switch:
				case Template:
				case This:
				case Thread_local:
				case Throw:
				case True:
				case Try:
				case Typedef:
				case Typeid:
				case Typename:
				case Union:
				case Unsigned:
				case Using:
				case Virtual:
				case Void:
				case Volatile:
				case Wchar:
				case While:
				case LeftBracket:
				case RightBracket:
				case LeftBrace:
				case RightBrace:
				case Plus:
				case Minus:
				case Star:
				case Div:
				case Mod:
				case Caret:
				case And:
				case Or:
				case Tilde:
				case Not:
				case Assign:
				case Less:
				case Greater:
				case PlusAssign:
				case MinusAssign:
				case StarAssign:
				case DivAssign:
				case ModAssign:
				case XorAssign:
				case AndAssign:
				case OrAssign:
				case LeftShift:
				case LeftShiftAssign:
				case Equal:
				case NotEqual:
				case LessEqual:
				case GreaterEqual:
				case AndAnd:
				case OrOr:
				case PlusPlus:
				case MinusMinus:
				case Comma:
				case ArrowStar:
				case Arrow:
				case Question:
				case Colon:
				case Doublecolon:
				case Semi:
				case Dot:
				case DotStar:
				case Ellipsis:
				case Identifier:
				case Integerliteral:
				case Decimalliteral:
				case Octalliteral:
				case Hexadecimalliteral:
				case Binaryliteral:
				case Integersuffix:
				case Characterliteral:
				case Floatingliteral:
				case Stringliteral:
				case Userdefinedintegerliteral:
				case Userdefinedfloatingliteral:
				case Userdefinedstringliteral:
				case Userdefinedcharacterliteral:
				case Whitespace:
				case Newline:
				case NonstandardTokens:
				case InvalidCharacter:
				case BlockComment:
				case LineComment:
					{
					setState(990);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==LeftParen || _la==RightParen) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				case LeftParen:
					{
					setState(991);
					match(LeftParen);
					setState(992);
					nestedParenthesesBlock();
					setState(993);
					match(RightParen);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(999);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public LabeledstatementContext labeledstatement() {
			return getRuleContext(LabeledstatementContext.class,0);
		}
		public ExpressionstatementContext expressionstatement() {
			return getRuleContext(ExpressionstatementContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public SelectionstatementContext selectionstatement() {
			return getRuleContext(SelectionstatementContext.class,0);
		}
		public IterationstatementContext iterationstatement() {
			return getRuleContext(IterationstatementContext.class,0);
		}
		public JumpstatementContext jumpstatement() {
			return getRuleContext(JumpstatementContext.class,0);
		}
		public UnknownstatementContext unknownstatement() {
			return getRuleContext(UnknownstatementContext.class,0);
		}
		public DeclarationstatementContext declarationstatement() {
			return getRuleContext(DeclarationstatementContext.class,0);
		}
		public TryblockContext tryblock() {
			return getRuleContext(TryblockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_statement);
		int _la;
		try {
			setState(1030);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1000);
				labeledstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1002);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(1001);
					attributespecifierseq(0);
					}
					break;
				}
				setState(1004);
				expressionstatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1006);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1005);
					attributespecifierseq(0);
					}
				}

				setState(1008);
				compoundstatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1010);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1009);
					attributespecifierseq(0);
					}
				}

				setState(1012);
				selectionstatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1014);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1013);
					attributespecifierseq(0);
					}
				}

				setState(1016);
				iterationstatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1018);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1017);
					attributespecifierseq(0);
					}
				}

				setState(1020);
				jumpstatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1022);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1021);
					attributespecifierseq(0);
					}
				}

				setState(1024);
				unknownstatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1025);
				declarationstatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1027);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1026);
					attributespecifierseq(0);
					}
				}

				setState(1029);
				tryblock();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledstatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TerminalNode Case() { return getToken(CPP14Parser.Case, 0); }
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public TerminalNode Default() { return getToken(CPP14Parser.Default, 0); }
		public LabeledstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterLabeledstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitLabeledstatement(this);
		}
	}

	public final LabeledstatementContext labeledstatement() throws RecognitionException {
		LabeledstatementContext _localctx = new LabeledstatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_labeledstatement);
		int _la;
		try {
			setState(1052);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1033);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1032);
					attributespecifierseq(0);
					}
				}

				setState(1035);
				match(Identifier);
				setState(1036);
				match(Colon);
				setState(1037);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1039);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1038);
					attributespecifierseq(0);
					}
				}

				setState(1041);
				match(Case);
				setState(1042);
				constantexpression();
				setState(1043);
				match(Colon);
				setState(1044);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1047);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1046);
					attributespecifierseq(0);
					}
				}

				setState(1049);
				match(Default);
				setState(1050);
				match(Colon);
				setState(1051);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionstatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterExpressionstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitExpressionstatement(this);
		}
	}

	public final ExpressionstatementContext expressionstatement() throws RecognitionException {
		ExpressionstatementContext _localctx = new ExpressionstatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_expressionstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1055);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (This - 66)) | (1L << (Throw - 66)) | (1L << (True - 66)) | (1L << (Typeid - 66)) | (1L << (Typename - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (Not - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)) | (1L << (Doublecolon - 66)) | (1L << (Identifier - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (Integerliteral - 130)) | (1L << (Characterliteral - 130)) | (1L << (Floatingliteral - 130)) | (1L << (Stringliteral - 130)) | (1L << (Userdefinedintegerliteral - 130)) | (1L << (Userdefinedfloatingliteral - 130)) | (1L << (Userdefinedstringliteral - 130)) | (1L << (Userdefinedcharacterliteral - 130)))) != 0)) {
				{
				setState(1054);
				expression(0);
				}
			}

			setState(1057);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompoundstatementContext extends ParserRuleContext {
		public StatementseqContext statementseq() {
			return getRuleContext(StatementseqContext.class,0);
		}
		public CompoundstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterCompoundstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitCompoundstatement(this);
		}
	}

	public final CompoundstatementContext compoundstatement() throws RecognitionException {
		CompoundstatementContext _localctx = new CompoundstatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_compoundstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1059);
			match(LeftBrace);
			setState(1061);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Alignof) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Continue) | (1L << Decltype) | (1L << Default) | (1L << Delete) | (1L << Do) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << False) | (1L << Float) | (1L << For) | (1L << Friend) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Register) | (1L << Reinterpret_cast) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Static_assert) | (1L << Static_cast) | (1L << Struct))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Switch - 64)) | (1L << (This - 64)) | (1L << (Thread_local - 64)) | (1L << (Throw - 64)) | (1L << (True - 64)) | (1L << (Try - 64)) | (1L << (Typedef - 64)) | (1L << (Typeid - 64)) | (1L << (Typename - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (While - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (AndAnd - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Doublecolon - 64)) | (1L << (Semi - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Ellipsis - 128)) | (1L << (Identifier - 128)) | (1L << (Integerliteral - 128)) | (1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)))) != 0)) {
				{
				setState(1060);
				statementseq(0);
				}
			}

			setState(1063);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementseqContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementseqContext statementseq() {
			return getRuleContext(StatementseqContext.class,0);
		}
		public StatementseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterStatementseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitStatementseq(this);
		}
	}

	public final StatementseqContext statementseq() throws RecognitionException {
		return statementseq(0);
	}

	private StatementseqContext statementseq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StatementseqContext _localctx = new StatementseqContext(_ctx, _parentState);
		StatementseqContext _prevctx = _localctx;
		int _startState = 100;
		enterRecursionRule(_localctx, 100, RULE_statementseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1066);
			statement();
			}
			_ctx.stop = _input.LT(-1);
			setState(1072);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StatementseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_statementseq);
					setState(1068);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1069);
					statement();
					}
					} 
				}
				setState(1074);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SelectionstatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(CPP14Parser.If, 0); }
		public NestedParenthesesBlockContext nestedParenthesesBlock() {
			return getRuleContext(NestedParenthesesBlockContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(CPP14Parser.Else, 0); }
		public TerminalNode Switch() { return getToken(CPP14Parser.Switch, 0); }
		public SelectionstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterSelectionstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitSelectionstatement(this);
		}
	}

	public final SelectionstatementContext selectionstatement() throws RecognitionException {
		SelectionstatementContext _localctx = new SelectionstatementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_selectionstatement);
		try {
			setState(1095);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1075);
				match(If);
				setState(1076);
				match(LeftParen);
				setState(1077);
				nestedParenthesesBlock();
				setState(1078);
				match(RightParen);
				setState(1079);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1081);
				match(If);
				setState(1082);
				match(LeftParen);
				setState(1083);
				nestedParenthesesBlock();
				setState(1084);
				match(RightParen);
				setState(1085);
				statement();
				setState(1086);
				match(Else);
				setState(1087);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1089);
				match(Switch);
				setState(1090);
				match(LeftParen);
				setState(1091);
				nestedParenthesesBlock();
				setState(1092);
				match(RightParen);
				setState(1093);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_condition);
		int _la;
		try {
			setState(1113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1097);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1099);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1098);
					attributespecifierseq(0);
					}
				}

				setState(1101);
				declspecifierseq();
				setState(1102);
				declarator();
				setState(1103);
				match(Assign);
				setState(1104);
				initializerclause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1107);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1106);
					attributespecifierseq(0);
					}
				}

				setState(1109);
				declspecifierseq();
				setState(1110);
				declarator();
				setState(1111);
				bracedinitlist();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterationstatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(CPP14Parser.While, 0); }
		public NestedParenthesesBlockContext nestedParenthesesBlock() {
			return getRuleContext(NestedParenthesesBlockContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Do() { return getToken(CPP14Parser.Do, 0); }
		public TerminalNode For() { return getToken(CPP14Parser.For, 0); }
		public IterationstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterIterationstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitIterationstatement(this);
		}
	}

	public final IterationstatementContext iterationstatement() throws RecognitionException {
		IterationstatementContext _localctx = new IterationstatementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_iterationstatement);
		try {
			setState(1135);
			switch (_input.LA(1)) {
			case While:
				enterOuterAlt(_localctx, 1);
				{
				setState(1115);
				match(While);
				setState(1116);
				match(LeftParen);
				setState(1117);
				nestedParenthesesBlock();
				setState(1118);
				match(RightParen);
				setState(1119);
				statement();
				}
				break;
			case Do:
				enterOuterAlt(_localctx, 2);
				{
				setState(1121);
				match(Do);
				setState(1122);
				statement();
				setState(1123);
				match(While);
				setState(1124);
				match(LeftParen);
				setState(1125);
				nestedParenthesesBlock();
				setState(1126);
				match(RightParen);
				setState(1127);
				match(Semi);
				}
				break;
			case For:
				enterOuterAlt(_localctx, 3);
				{
				setState(1129);
				match(For);
				setState(1130);
				match(LeftParen);
				setState(1131);
				nestedParenthesesBlock();
				setState(1132);
				match(RightParen);
				setState(1133);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForinitstatementContext extends ParserRuleContext {
		public ExpressionstatementContext expressionstatement() {
			return getRuleContext(ExpressionstatementContext.class,0);
		}
		public SimpledeclarationContext simpledeclaration() {
			return getRuleContext(SimpledeclarationContext.class,0);
		}
		public ForinitstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forinitstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterForinitstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitForinitstatement(this);
		}
	}

	public final ForinitstatementContext forinitstatement() throws RecognitionException {
		ForinitstatementContext _localctx = new ForinitstatementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_forinitstatement);
		try {
			setState(1139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1137);
				expressionstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1138);
				simpledeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForrangedeclarationContext extends ParserRuleContext {
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public ForrangedeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forrangedeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterForrangedeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitForrangedeclaration(this);
		}
	}

	public final ForrangedeclarationContext forrangedeclaration() throws RecognitionException {
		ForrangedeclarationContext _localctx = new ForrangedeclarationContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_forrangedeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1142);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1141);
				attributespecifierseq(0);
				}
			}

			setState(1144);
			declspecifierseq();
			setState(1145);
			declarator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForrangeinitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public ForrangeinitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forrangeinitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterForrangeinitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitForrangeinitializer(this);
		}
	}

	public final ForrangeinitializerContext forrangeinitializer() throws RecognitionException {
		ForrangeinitializerContext _localctx = new ForrangeinitializerContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_forrangeinitializer);
		try {
			setState(1149);
			switch (_input.LA(1)) {
			case Alignof:
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Const_cast:
			case Decltype:
			case Delete:
			case Double:
			case Dynamic_cast:
			case False:
			case Float:
			case Int:
			case Long:
			case New:
			case Noexcept:
			case Nullptr:
			case Operator:
			case Reinterpret_cast:
			case Short:
			case Signed:
			case Sizeof:
			case Static_cast:
			case This:
			case Throw:
			case True:
			case Typeid:
			case Typename:
			case Unsigned:
			case Void:
			case Wchar:
			case LeftParen:
			case LeftBracket:
			case Plus:
			case Minus:
			case Star:
			case And:
			case Or:
			case Tilde:
			case Not:
			case PlusPlus:
			case MinusMinus:
			case Doublecolon:
			case Identifier:
			case Integerliteral:
			case Characterliteral:
			case Floatingliteral:
			case Stringliteral:
			case Userdefinedintegerliteral:
			case Userdefinedfloatingliteral:
			case Userdefinedstringliteral:
			case Userdefinedcharacterliteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(1147);
				expression(0);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(1148);
				bracedinitlist();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JumpstatementContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(CPP14Parser.Break, 0); }
		public TerminalNode Continue() { return getToken(CPP14Parser.Continue, 0); }
		public TerminalNode Return() { return getToken(CPP14Parser.Return, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public TerminalNode Goto() { return getToken(CPP14Parser.Goto, 0); }
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public JumpstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterJumpstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitJumpstatement(this);
		}
	}

	public final JumpstatementContext jumpstatement() throws RecognitionException {
		JumpstatementContext _localctx = new JumpstatementContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_jumpstatement);
		int _la;
		try {
			setState(1167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1151);
				match(Break);
				setState(1152);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1153);
				match(Continue);
				setState(1154);
				match(Semi);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1155);
				match(Return);
				setState(1157);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (This - 66)) | (1L << (Throw - 66)) | (1L << (True - 66)) | (1L << (Typeid - 66)) | (1L << (Typename - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (Not - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)) | (1L << (Doublecolon - 66)) | (1L << (Identifier - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (Integerliteral - 130)) | (1L << (Characterliteral - 130)) | (1L << (Floatingliteral - 130)) | (1L << (Stringliteral - 130)) | (1L << (Userdefinedintegerliteral - 130)) | (1L << (Userdefinedfloatingliteral - 130)) | (1L << (Userdefinedstringliteral - 130)) | (1L << (Userdefinedcharacterliteral - 130)))) != 0)) {
					{
					setState(1156);
					expression(0);
					}
				}

				setState(1159);
				match(Semi);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1160);
				match(Return);
				setState(1161);
				bracedinitlist();
				setState(1162);
				match(Semi);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1164);
				match(Goto);
				setState(1165);
				match(Identifier);
				setState(1166);
				match(Semi);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnknownstatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public NestedParenthesesBlockContext nestedParenthesesBlock() {
			return getRuleContext(NestedParenthesesBlockContext.class,0);
		}
		public UnknownstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unknownstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterUnknownstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitUnknownstatement(this);
		}
	}

	public final UnknownstatementContext unknownstatement() throws RecognitionException {
		UnknownstatementContext _localctx = new UnknownstatementContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_unknownstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1169);
			match(Identifier);
			setState(1174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(1170);
				match(LeftParen);
				setState(1171);
				nestedParenthesesBlock();
				setState(1172);
				match(RightParen);
				}
				break;
			}
			setState(1176);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationstatementContext extends ParserRuleContext {
		public BlockdeclarationContext blockdeclaration() {
			return getRuleContext(BlockdeclarationContext.class,0);
		}
		public DeclarationstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterDeclarationstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitDeclarationstatement(this);
		}
	}

	public final DeclarationstatementContext declarationstatement() throws RecognitionException {
		DeclarationstatementContext _localctx = new DeclarationstatementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_declarationstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1178);
			blockdeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationseqContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationseqContext declarationseq() {
			return getRuleContext(DeclarationseqContext.class,0);
		}
		public DeclarationseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterDeclarationseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitDeclarationseq(this);
		}
	}

	public final DeclarationseqContext declarationseq() throws RecognitionException {
		return declarationseq(0);
	}

	private DeclarationseqContext declarationseq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DeclarationseqContext _localctx = new DeclarationseqContext(_ctx, _parentState);
		DeclarationseqContext _prevctx = _localctx;
		int _startState = 120;
		enterRecursionRule(_localctx, 120, RULE_declarationseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1181);
			declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DeclarationseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_declarationseq);
					setState(1183);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1184);
					declaration();
					}
					} 
				}
				setState(1189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public BlockdeclarationContext blockdeclaration() {
			return getRuleContext(BlockdeclarationContext.class,0);
		}
		public FunctiondefinitionContext functiondefinition() {
			return getRuleContext(FunctiondefinitionContext.class,0);
		}
		public TemplatedeclarationContext templatedeclaration() {
			return getRuleContext(TemplatedeclarationContext.class,0);
		}
		public ExplicitinstantiationContext explicitinstantiation() {
			return getRuleContext(ExplicitinstantiationContext.class,0);
		}
		public ExplicitspecializationContext explicitspecialization() {
			return getRuleContext(ExplicitspecializationContext.class,0);
		}
		public LinkagespecificationContext linkagespecification() {
			return getRuleContext(LinkagespecificationContext.class,0);
		}
		public NamespacedefinitionContext namespacedefinition() {
			return getRuleContext(NamespacedefinitionContext.class,0);
		}
		public EmptydeclarationContext emptydeclaration() {
			return getRuleContext(EmptydeclarationContext.class,0);
		}
		public AttributedeclarationContext attributedeclaration() {
			return getRuleContext(AttributedeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_declaration);
		try {
			setState(1199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1190);
				blockdeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1191);
				functiondefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1192);
				templatedeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1193);
				explicitinstantiation();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1194);
				explicitspecialization();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1195);
				linkagespecification();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1196);
				namespacedefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1197);
				emptydeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1198);
				attributedeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockdeclarationContext extends ParserRuleContext {
		public SimpledeclarationContext simpledeclaration() {
			return getRuleContext(SimpledeclarationContext.class,0);
		}
		public AsmdefinitionContext asmdefinition() {
			return getRuleContext(AsmdefinitionContext.class,0);
		}
		public NamespacealiasdefinitionContext namespacealiasdefinition() {
			return getRuleContext(NamespacealiasdefinitionContext.class,0);
		}
		public UsingdeclarationContext usingdeclaration() {
			return getRuleContext(UsingdeclarationContext.class,0);
		}
		public UsingdirectiveContext usingdirective() {
			return getRuleContext(UsingdirectiveContext.class,0);
		}
		public Static_assertdeclarationContext static_assertdeclaration() {
			return getRuleContext(Static_assertdeclarationContext.class,0);
		}
		public AliasdeclarationContext aliasdeclaration() {
			return getRuleContext(AliasdeclarationContext.class,0);
		}
		public OpaqueenumdeclarationContext opaqueenumdeclaration() {
			return getRuleContext(OpaqueenumdeclarationContext.class,0);
		}
		public BlockdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterBlockdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitBlockdeclaration(this);
		}
	}

	public final BlockdeclarationContext blockdeclaration() throws RecognitionException {
		BlockdeclarationContext _localctx = new BlockdeclarationContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_blockdeclaration);
		try {
			setState(1209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1201);
				simpledeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1202);
				asmdefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1203);
				namespacealiasdefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1204);
				usingdeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1205);
				usingdirective();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1206);
				static_assertdeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1207);
				aliasdeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1208);
				opaqueenumdeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AliasdeclarationContext extends ParserRuleContext {
		public TerminalNode Using() { return getToken(CPP14Parser.Using, 0); }
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public AliasdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAliasdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAliasdeclaration(this);
		}
	}

	public final AliasdeclarationContext aliasdeclaration() throws RecognitionException {
		AliasdeclarationContext _localctx = new AliasdeclarationContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_aliasdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1211);
			match(Using);
			setState(1212);
			match(Identifier);
			setState(1214);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1213);
				attributespecifierseq(0);
				}
			}

			setState(1216);
			match(Assign);
			setState(1217);
			typeid();
			setState(1218);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpledeclarationContext extends ParserRuleContext {
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public InitdeclaratorlistContext initdeclaratorlist() {
			return getRuleContext(InitdeclaratorlistContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public SimpledeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpledeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterSimpledeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitSimpledeclaration(this);
		}
	}

	public final SimpledeclarationContext simpledeclaration() throws RecognitionException {
		SimpledeclarationContext _localctx = new SimpledeclarationContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_simpledeclaration);
		int _la;
		try {
			setState(1234);
			switch (_input.LA(1)) {
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Class:
			case Const:
			case Constexpr:
			case Decltype:
			case Double:
			case Enum:
			case Explicit:
			case Extern:
			case Float:
			case Friend:
			case Inline:
			case Int:
			case Long:
			case Mutable:
			case Operator:
			case Register:
			case Short:
			case Signed:
			case Static:
			case Struct:
			case Thread_local:
			case Typedef:
			case Typename:
			case Union:
			case Unsigned:
			case Virtual:
			case Void:
			case Volatile:
			case Wchar:
			case LeftParen:
			case Star:
			case And:
			case Tilde:
			case AndAnd:
			case Doublecolon:
			case Semi:
			case Ellipsis:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1221);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(1220);
					declspecifierseq();
					}
					break;
				}
				setState(1224);
				_la = _input.LA(1);
				if (_la==Decltype || _la==Operator || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (LeftParen - 82)) | (1L << (Star - 82)) | (1L << (And - 82)) | (1L << (Tilde - 82)) | (1L << (AndAnd - 82)) | (1L << (Doublecolon - 82)) | (1L << (Ellipsis - 82)) | (1L << (Identifier - 82)))) != 0)) {
					{
					setState(1223);
					initdeclaratorlist(0);
					}
				}

				setState(1226);
				match(Semi);
				}
				break;
			case Alignas:
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1227);
				attributespecifierseq(0);
				setState(1229);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(1228);
					declspecifierseq();
					}
					break;
				}
				setState(1231);
				initdeclaratorlist(0);
				setState(1232);
				match(Semi);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Static_assertdeclarationContext extends ParserRuleContext {
		public TerminalNode Static_assert() { return getToken(CPP14Parser.Static_assert, 0); }
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public TerminalNode Stringliteral() { return getToken(CPP14Parser.Stringliteral, 0); }
		public Static_assertdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_static_assertdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterStatic_assertdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitStatic_assertdeclaration(this);
		}
	}

	public final Static_assertdeclarationContext static_assertdeclaration() throws RecognitionException {
		Static_assertdeclarationContext _localctx = new Static_assertdeclarationContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_static_assertdeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1236);
			match(Static_assert);
			setState(1237);
			match(LeftParen);
			setState(1238);
			constantexpression();
			setState(1239);
			match(Comma);
			setState(1240);
			match(Stringliteral);
			setState(1241);
			match(RightParen);
			setState(1242);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptydeclarationContext extends ParserRuleContext {
		public EmptydeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptydeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterEmptydeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitEmptydeclaration(this);
		}
	}

	public final EmptydeclarationContext emptydeclaration() throws RecognitionException {
		EmptydeclarationContext _localctx = new EmptydeclarationContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_emptydeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1244);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributedeclarationContext extends ParserRuleContext {
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public AttributedeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributedeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAttributedeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAttributedeclaration(this);
		}
	}

	public final AttributedeclarationContext attributedeclaration() throws RecognitionException {
		AttributedeclarationContext _localctx = new AttributedeclarationContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_attributedeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1246);
			attributespecifierseq(0);
			setState(1247);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclspecifierContext extends ParserRuleContext {
		public StorageclassspecifierContext storageclassspecifier() {
			return getRuleContext(StorageclassspecifierContext.class,0);
		}
		public TypespecifierContext typespecifier() {
			return getRuleContext(TypespecifierContext.class,0);
		}
		public FunctionspecifierContext functionspecifier() {
			return getRuleContext(FunctionspecifierContext.class,0);
		}
		public TerminalNode Friend() { return getToken(CPP14Parser.Friend, 0); }
		public TerminalNode Typedef() { return getToken(CPP14Parser.Typedef, 0); }
		public TerminalNode Constexpr() { return getToken(CPP14Parser.Constexpr, 0); }
		public DeclspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterDeclspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitDeclspecifier(this);
		}
	}

	public final DeclspecifierContext declspecifier() throws RecognitionException {
		DeclspecifierContext _localctx = new DeclspecifierContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_declspecifier);
		try {
			setState(1255);
			switch (_input.LA(1)) {
			case Extern:
			case Mutable:
			case Register:
			case Static:
			case Thread_local:
				enterOuterAlt(_localctx, 1);
				{
				setState(1249);
				storageclassspecifier();
				}
				break;
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Class:
			case Const:
			case Decltype:
			case Double:
			case Enum:
			case Float:
			case Int:
			case Long:
			case Short:
			case Signed:
			case Struct:
			case Typename:
			case Union:
			case Unsigned:
			case Void:
			case Volatile:
			case Wchar:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1250);
				typespecifier();
				}
				break;
			case Explicit:
			case Inline:
			case Virtual:
				enterOuterAlt(_localctx, 3);
				{
				setState(1251);
				functionspecifier();
				}
				break;
			case Friend:
				enterOuterAlt(_localctx, 4);
				{
				setState(1252);
				match(Friend);
				}
				break;
			case Typedef:
				enterOuterAlt(_localctx, 5);
				{
				setState(1253);
				match(Typedef);
				}
				break;
			case Constexpr:
				enterOuterAlt(_localctx, 6);
				{
				setState(1254);
				match(Constexpr);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclspecifierseqContext extends ParserRuleContext {
		public DeclspecifierContext declspecifier() {
			return getRuleContext(DeclspecifierContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public DeclspecifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declspecifierseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterDeclspecifierseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitDeclspecifierseq(this);
		}
	}

	public final DeclspecifierseqContext declspecifierseq() throws RecognitionException {
		DeclspecifierseqContext _localctx = new DeclspecifierseqContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_declspecifierseq);
		try {
			setState(1264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1257);
				declspecifier();
				setState(1259);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
				case 1:
					{
					setState(1258);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1261);
				declspecifier();
				setState(1262);
				declspecifierseq();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StorageclassspecifierContext extends ParserRuleContext {
		public TerminalNode Register() { return getToken(CPP14Parser.Register, 0); }
		public TerminalNode Static() { return getToken(CPP14Parser.Static, 0); }
		public TerminalNode Thread_local() { return getToken(CPP14Parser.Thread_local, 0); }
		public TerminalNode Extern() { return getToken(CPP14Parser.Extern, 0); }
		public TerminalNode Mutable() { return getToken(CPP14Parser.Mutable, 0); }
		public StorageclassspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageclassspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterStorageclassspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitStorageclassspecifier(this);
		}
	}

	public final StorageclassspecifierContext storageclassspecifier() throws RecognitionException {
		StorageclassspecifierContext _localctx = new StorageclassspecifierContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_storageclassspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1266);
			_la = _input.LA(1);
			if ( !(((((_la - 33)) & ~0x3f) == 0 && ((1L << (_la - 33)) & ((1L << (Extern - 33)) | (1L << (Mutable - 33)) | (1L << (Register - 33)) | (1L << (Static - 33)) | (1L << (Thread_local - 33)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionspecifierContext extends ParserRuleContext {
		public TerminalNode Inline() { return getToken(CPP14Parser.Inline, 0); }
		public TerminalNode Virtual() { return getToken(CPP14Parser.Virtual, 0); }
		public TerminalNode Explicit() { return getToken(CPP14Parser.Explicit, 0); }
		public FunctionspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterFunctionspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitFunctionspecifier(this);
		}
	}

	public final FunctionspecifierContext functionspecifier() throws RecognitionException {
		FunctionspecifierContext _localctx = new FunctionspecifierContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_functionspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1268);
			_la = _input.LA(1);
			if ( !(((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (Explicit - 31)) | (1L << (Inline - 31)) | (1L << (Virtual - 31)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypedefnameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public TypedefnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedefname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTypedefname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTypedefname(this);
		}
	}

	public final TypedefnameContext typedefname() throws RecognitionException {
		TypedefnameContext _localctx = new TypedefnameContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_typedefname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1270);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypespecifierContext extends ParserRuleContext {
		public TrailingtypespecifierContext trailingtypespecifier() {
			return getRuleContext(TrailingtypespecifierContext.class,0);
		}
		public ClassspecifierContext classspecifier() {
			return getRuleContext(ClassspecifierContext.class,0);
		}
		public EnumspecifierContext enumspecifier() {
			return getRuleContext(EnumspecifierContext.class,0);
		}
		public TypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTypespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTypespecifier(this);
		}
	}

	public final TypespecifierContext typespecifier() throws RecognitionException {
		TypespecifierContext _localctx = new TypespecifierContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_typespecifier);
		try {
			setState(1275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1272);
				trailingtypespecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1273);
				classspecifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1274);
				enumspecifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TrailingtypespecifierContext extends ParserRuleContext {
		public SimpletypespecifierContext simpletypespecifier() {
			return getRuleContext(SimpletypespecifierContext.class,0);
		}
		public ElaboratedtypespecifierContext elaboratedtypespecifier() {
			return getRuleContext(ElaboratedtypespecifierContext.class,0);
		}
		public TypenamespecifierContext typenamespecifier() {
			return getRuleContext(TypenamespecifierContext.class,0);
		}
		public CvqualifierContext cvqualifier() {
			return getRuleContext(CvqualifierContext.class,0);
		}
		public TrailingtypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailingtypespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTrailingtypespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTrailingtypespecifier(this);
		}
	}

	public final TrailingtypespecifierContext trailingtypespecifier() throws RecognitionException {
		TrailingtypespecifierContext _localctx = new TrailingtypespecifierContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_trailingtypespecifier);
		try {
			setState(1281);
			switch (_input.LA(1)) {
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Decltype:
			case Double:
			case Float:
			case Int:
			case Long:
			case Short:
			case Signed:
			case Unsigned:
			case Void:
			case Wchar:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1277);
				simpletypespecifier();
				}
				break;
			case Class:
			case Enum:
			case Struct:
			case Union:
				enterOuterAlt(_localctx, 2);
				{
				setState(1278);
				elaboratedtypespecifier();
				}
				break;
			case Typename:
				enterOuterAlt(_localctx, 3);
				{
				setState(1279);
				typenamespecifier();
				}
				break;
			case Const:
			case Volatile:
				enterOuterAlt(_localctx, 4);
				{
				setState(1280);
				cvqualifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypespecifierseqContext extends ParserRuleContext {
		public TypespecifierContext typespecifier() {
			return getRuleContext(TypespecifierContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TypespecifierseqContext typespecifierseq() {
			return getRuleContext(TypespecifierseqContext.class,0);
		}
		public TypespecifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typespecifierseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTypespecifierseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTypespecifierseq(this);
		}
	}

	public final TypespecifierseqContext typespecifierseq() throws RecognitionException {
		TypespecifierseqContext _localctx = new TypespecifierseqContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_typespecifierseq);
		try {
			setState(1290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1283);
				typespecifier();
				setState(1285);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
				case 1:
					{
					setState(1284);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1287);
				typespecifier();
				setState(1288);
				typespecifierseq();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TrailingtypespecifierseqContext extends ParserRuleContext {
		public TrailingtypespecifierContext trailingtypespecifier() {
			return getRuleContext(TrailingtypespecifierContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TrailingtypespecifierseqContext trailingtypespecifierseq() {
			return getRuleContext(TrailingtypespecifierseqContext.class,0);
		}
		public TrailingtypespecifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailingtypespecifierseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTrailingtypespecifierseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTrailingtypespecifierseq(this);
		}
	}

	public final TrailingtypespecifierseqContext trailingtypespecifierseq() throws RecognitionException {
		TrailingtypespecifierseqContext _localctx = new TrailingtypespecifierseqContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_trailingtypespecifierseq);
		try {
			setState(1299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1292);
				trailingtypespecifier();
				setState(1294);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
				case 1:
					{
					setState(1293);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1296);
				trailingtypespecifier();
				setState(1297);
				trailingtypespecifierseq();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpletypespecifierContext extends ParserRuleContext {
		public TypenameContext typename() {
			return getRuleContext(TypenameContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public TerminalNode Char() { return getToken(CPP14Parser.Char, 0); }
		public TerminalNode Char16() { return getToken(CPP14Parser.Char16, 0); }
		public TerminalNode Char32() { return getToken(CPP14Parser.Char32, 0); }
		public TerminalNode Wchar() { return getToken(CPP14Parser.Wchar, 0); }
		public TerminalNode Bool() { return getToken(CPP14Parser.Bool, 0); }
		public TerminalNode Short() { return getToken(CPP14Parser.Short, 0); }
		public TerminalNode Int() { return getToken(CPP14Parser.Int, 0); }
		public TerminalNode Long() { return getToken(CPP14Parser.Long, 0); }
		public TerminalNode Signed() { return getToken(CPP14Parser.Signed, 0); }
		public TerminalNode Unsigned() { return getToken(CPP14Parser.Unsigned, 0); }
		public TerminalNode Float() { return getToken(CPP14Parser.Float, 0); }
		public TerminalNode Double() { return getToken(CPP14Parser.Double, 0); }
		public TerminalNode Void() { return getToken(CPP14Parser.Void, 0); }
		public TerminalNode Auto() { return getToken(CPP14Parser.Auto, 0); }
		public DecltypespecifierContext decltypespecifier() {
			return getRuleContext(DecltypespecifierContext.class,0);
		}
		public SimpletypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpletypespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterSimpletypespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitSimpletypespecifier(this);
		}
	}

	public final SimpletypespecifierContext simpletypespecifier() throws RecognitionException {
		SimpletypespecifierContext _localctx = new SimpletypespecifierContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_simpletypespecifier);
		try {
			setState(1324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1302);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
				case 1:
					{
					setState(1301);
					nestednamespecifier(0);
					}
					break;
				}
				setState(1304);
				typename();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1305);
				nestednamespecifier(0);
				setState(1306);
				match(Template);
				setState(1307);
				simpletemplateid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1309);
				match(Char);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1310);
				match(Char16);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1311);
				match(Char32);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1312);
				match(Wchar);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1313);
				match(Bool);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1314);
				match(Short);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1315);
				match(Int);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1316);
				match(Long);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1317);
				match(Signed);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1318);
				match(Unsigned);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1319);
				match(Float);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1320);
				match(Double);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1321);
				match(Void);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1322);
				match(Auto);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1323);
				decltypespecifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypenameContext extends ParserRuleContext {
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public EnumnameContext enumname() {
			return getRuleContext(EnumnameContext.class,0);
		}
		public TypedefnameContext typedefname() {
			return getRuleContext(TypedefnameContext.class,0);
		}
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public TypenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTypename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTypename(this);
		}
	}

	public final TypenameContext typename() throws RecognitionException {
		TypenameContext _localctx = new TypenameContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_typename);
		try {
			setState(1330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1326);
				classname();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1327);
				enumname();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1328);
				typedefname();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1329);
				simpletemplateid();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecltypespecifierContext extends ParserRuleContext {
		public TerminalNode Decltype() { return getToken(CPP14Parser.Decltype, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Auto() { return getToken(CPP14Parser.Auto, 0); }
		public DecltypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decltypespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterDecltypespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitDecltypespecifier(this);
		}
	}

	public final DecltypespecifierContext decltypespecifier() throws RecognitionException {
		DecltypespecifierContext _localctx = new DecltypespecifierContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_decltypespecifier);
		try {
			setState(1341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1332);
				match(Decltype);
				setState(1333);
				match(LeftParen);
				setState(1334);
				expression(0);
				setState(1335);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1337);
				match(Decltype);
				setState(1338);
				match(LeftParen);
				setState(1339);
				match(Auto);
				setState(1340);
				match(RightParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElaboratedtypespecifierContext extends ParserRuleContext {
		public ClasskeyContext classkey() {
			return getRuleContext(ClasskeyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public TerminalNode Enum() { return getToken(CPP14Parser.Enum, 0); }
		public ElaboratedtypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elaboratedtypespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterElaboratedtypespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitElaboratedtypespecifier(this);
		}
	}

	public final ElaboratedtypespecifierContext elaboratedtypespecifier() throws RecognitionException {
		ElaboratedtypespecifierContext _localctx = new ElaboratedtypespecifierContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_elaboratedtypespecifier);
		int _la;
		try {
			setState(1367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1343);
				classkey();
				setState(1345);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1344);
					attributespecifierseq(0);
					}
				}

				setState(1348);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
				case 1:
					{
					setState(1347);
					nestednamespecifier(0);
					}
					break;
				}
				setState(1350);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1352);
				classkey();
				setState(1353);
				simpletemplateid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1355);
				classkey();
				setState(1356);
				nestednamespecifier(0);
				setState(1358);
				_la = _input.LA(1);
				if (_la==Template) {
					{
					setState(1357);
					match(Template);
					}
				}

				setState(1360);
				simpletemplateid();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1362);
				match(Enum);
				setState(1364);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
				case 1:
					{
					setState(1363);
					nestednamespecifier(0);
					}
					break;
				}
				setState(1366);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumnameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public EnumnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterEnumname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitEnumname(this);
		}
	}

	public final EnumnameContext enumname() throws RecognitionException {
		EnumnameContext _localctx = new EnumnameContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_enumname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1369);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumspecifierContext extends ParserRuleContext {
		public EnumheadContext enumhead() {
			return getRuleContext(EnumheadContext.class,0);
		}
		public EnumeratorlistContext enumeratorlist() {
			return getRuleContext(EnumeratorlistContext.class,0);
		}
		public EnumspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterEnumspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitEnumspecifier(this);
		}
	}

	public final EnumspecifierContext enumspecifier() throws RecognitionException {
		EnumspecifierContext _localctx = new EnumspecifierContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_enumspecifier);
		int _la;
		try {
			setState(1384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1371);
				enumhead();
				setState(1372);
				match(LeftBrace);
				setState(1374);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1373);
					enumeratorlist(0);
					}
				}

				setState(1376);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1378);
				enumhead();
				setState(1379);
				match(LeftBrace);
				setState(1380);
				enumeratorlist(0);
				setState(1381);
				match(Comma);
				setState(1382);
				match(RightBrace);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumheadContext extends ParserRuleContext {
		public EnumkeyContext enumkey() {
			return getRuleContext(EnumkeyContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public EnumbaseContext enumbase() {
			return getRuleContext(EnumbaseContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public EnumheadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumhead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterEnumhead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitEnumhead(this);
		}
	}

	public final EnumheadContext enumhead() throws RecognitionException {
		EnumheadContext _localctx = new EnumheadContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_enumhead);
		int _la;
		try {
			setState(1405);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1386);
				enumkey();
				setState(1388);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1387);
					attributespecifierseq(0);
					}
				}

				setState(1391);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1390);
					match(Identifier);
					}
				}

				setState(1394);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1393);
					enumbase();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1396);
				enumkey();
				setState(1398);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1397);
					attributespecifierseq(0);
					}
				}

				setState(1400);
				nestednamespecifier(0);
				setState(1401);
				match(Identifier);
				setState(1403);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1402);
					enumbase();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpaqueenumdeclarationContext extends ParserRuleContext {
		public EnumkeyContext enumkey() {
			return getRuleContext(EnumkeyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public EnumbaseContext enumbase() {
			return getRuleContext(EnumbaseContext.class,0);
		}
		public OpaqueenumdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opaqueenumdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterOpaqueenumdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitOpaqueenumdeclaration(this);
		}
	}

	public final OpaqueenumdeclarationContext opaqueenumdeclaration() throws RecognitionException {
		OpaqueenumdeclarationContext _localctx = new OpaqueenumdeclarationContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_opaqueenumdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1407);
			enumkey();
			setState(1409);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1408);
				attributespecifierseq(0);
				}
			}

			setState(1411);
			match(Identifier);
			setState(1413);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(1412);
				enumbase();
				}
			}

			setState(1415);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumkeyContext extends ParserRuleContext {
		public TerminalNode Enum() { return getToken(CPP14Parser.Enum, 0); }
		public TerminalNode Class() { return getToken(CPP14Parser.Class, 0); }
		public TerminalNode Struct() { return getToken(CPP14Parser.Struct, 0); }
		public EnumkeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumkey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterEnumkey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitEnumkey(this);
		}
	}

	public final EnumkeyContext enumkey() throws RecognitionException {
		EnumkeyContext _localctx = new EnumkeyContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_enumkey);
		try {
			setState(1422);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1417);
				match(Enum);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1418);
				match(Enum);
				setState(1419);
				match(Class);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1420);
				match(Enum);
				setState(1421);
				match(Struct);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumbaseContext extends ParserRuleContext {
		public TypespecifierseqContext typespecifierseq() {
			return getRuleContext(TypespecifierseqContext.class,0);
		}
		public EnumbaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumbase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterEnumbase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitEnumbase(this);
		}
	}

	public final EnumbaseContext enumbase() throws RecognitionException {
		EnumbaseContext _localctx = new EnumbaseContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_enumbase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1424);
			match(Colon);
			setState(1425);
			typespecifierseq();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumeratorlistContext extends ParserRuleContext {
		public EnumeratordefinitionContext enumeratordefinition() {
			return getRuleContext(EnumeratordefinitionContext.class,0);
		}
		public EnumeratorlistContext enumeratorlist() {
			return getRuleContext(EnumeratorlistContext.class,0);
		}
		public EnumeratorlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratorlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterEnumeratorlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitEnumeratorlist(this);
		}
	}

	public final EnumeratorlistContext enumeratorlist() throws RecognitionException {
		return enumeratorlist(0);
	}

	private EnumeratorlistContext enumeratorlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EnumeratorlistContext _localctx = new EnumeratorlistContext(_ctx, _parentState);
		EnumeratorlistContext _prevctx = _localctx;
		int _startState = 174;
		enterRecursionRule(_localctx, 174, RULE_enumeratorlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1428);
			enumeratordefinition();
			}
			_ctx.stop = _input.LT(-1);
			setState(1435);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EnumeratorlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_enumeratorlist);
					setState(1430);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1431);
					match(Comma);
					setState(1432);
					enumeratordefinition();
					}
					} 
				}
				setState(1437);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EnumeratordefinitionContext extends ParserRuleContext {
		public EnumeratorContext enumerator() {
			return getRuleContext(EnumeratorContext.class,0);
		}
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public EnumeratordefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratordefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterEnumeratordefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitEnumeratordefinition(this);
		}
	}

	public final EnumeratordefinitionContext enumeratordefinition() throws RecognitionException {
		EnumeratordefinitionContext _localctx = new EnumeratordefinitionContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_enumeratordefinition);
		try {
			setState(1443);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1438);
				enumerator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1439);
				enumerator();
				setState(1440);
				match(Assign);
				setState(1441);
				constantexpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumeratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public EnumeratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterEnumerator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitEnumerator(this);
		}
	}

	public final EnumeratorContext enumerator() throws RecognitionException {
		EnumeratorContext _localctx = new EnumeratorContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_enumerator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1445);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespacenameContext extends ParserRuleContext {
		public OriginalnamespacenameContext originalnamespacename() {
			return getRuleContext(OriginalnamespacenameContext.class,0);
		}
		public NamespacealiasContext namespacealias() {
			return getRuleContext(NamespacealiasContext.class,0);
		}
		public NamespacenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespacename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNamespacename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNamespacename(this);
		}
	}

	public final NamespacenameContext namespacename() throws RecognitionException {
		NamespacenameContext _localctx = new NamespacenameContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_namespacename);
		try {
			setState(1449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1447);
				originalnamespacename();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1448);
				namespacealias();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OriginalnamespacenameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public OriginalnamespacenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_originalnamespacename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterOriginalnamespacename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitOriginalnamespacename(this);
		}
	}

	public final OriginalnamespacenameContext originalnamespacename() throws RecognitionException {
		OriginalnamespacenameContext _localctx = new OriginalnamespacenameContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_originalnamespacename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1451);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespacedefinitionContext extends ParserRuleContext {
		public NamednamespacedefinitionContext namednamespacedefinition() {
			return getRuleContext(NamednamespacedefinitionContext.class,0);
		}
		public UnnamednamespacedefinitionContext unnamednamespacedefinition() {
			return getRuleContext(UnnamednamespacedefinitionContext.class,0);
		}
		public NamespacedefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespacedefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNamespacedefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNamespacedefinition(this);
		}
	}

	public final NamespacedefinitionContext namespacedefinition() throws RecognitionException {
		NamespacedefinitionContext _localctx = new NamespacedefinitionContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_namespacedefinition);
		try {
			setState(1455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1453);
				namednamespacedefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1454);
				unnamednamespacedefinition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamednamespacedefinitionContext extends ParserRuleContext {
		public OriginalnamespacedefinitionContext originalnamespacedefinition() {
			return getRuleContext(OriginalnamespacedefinitionContext.class,0);
		}
		public ExtensionnamespacedefinitionContext extensionnamespacedefinition() {
			return getRuleContext(ExtensionnamespacedefinitionContext.class,0);
		}
		public NamednamespacedefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namednamespacedefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNamednamespacedefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNamednamespacedefinition(this);
		}
	}

	public final NamednamespacedefinitionContext namednamespacedefinition() throws RecognitionException {
		NamednamespacedefinitionContext _localctx = new NamednamespacedefinitionContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_namednamespacedefinition);
		try {
			setState(1459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1457);
				originalnamespacedefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1458);
				extensionnamespacedefinition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OriginalnamespacedefinitionContext extends ParserRuleContext {
		public TerminalNode Namespace() { return getToken(CPP14Parser.Namespace, 0); }
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public NamespacebodyContext namespacebody() {
			return getRuleContext(NamespacebodyContext.class,0);
		}
		public TerminalNode Inline() { return getToken(CPP14Parser.Inline, 0); }
		public OriginalnamespacedefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_originalnamespacedefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterOriginalnamespacedefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitOriginalnamespacedefinition(this);
		}
	}

	public final OriginalnamespacedefinitionContext originalnamespacedefinition() throws RecognitionException {
		OriginalnamespacedefinitionContext _localctx = new OriginalnamespacedefinitionContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_originalnamespacedefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1462);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(1461);
				match(Inline);
				}
			}

			setState(1464);
			match(Namespace);
			setState(1465);
			match(Identifier);
			setState(1466);
			match(LeftBrace);
			setState(1467);
			namespacebody();
			setState(1468);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtensionnamespacedefinitionContext extends ParserRuleContext {
		public TerminalNode Namespace() { return getToken(CPP14Parser.Namespace, 0); }
		public OriginalnamespacenameContext originalnamespacename() {
			return getRuleContext(OriginalnamespacenameContext.class,0);
		}
		public NamespacebodyContext namespacebody() {
			return getRuleContext(NamespacebodyContext.class,0);
		}
		public TerminalNode Inline() { return getToken(CPP14Parser.Inline, 0); }
		public ExtensionnamespacedefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extensionnamespacedefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterExtensionnamespacedefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitExtensionnamespacedefinition(this);
		}
	}

	public final ExtensionnamespacedefinitionContext extensionnamespacedefinition() throws RecognitionException {
		ExtensionnamespacedefinitionContext _localctx = new ExtensionnamespacedefinitionContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_extensionnamespacedefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1471);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(1470);
				match(Inline);
				}
			}

			setState(1473);
			match(Namespace);
			setState(1474);
			originalnamespacename();
			setState(1475);
			match(LeftBrace);
			setState(1476);
			namespacebody();
			setState(1477);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnnamednamespacedefinitionContext extends ParserRuleContext {
		public TerminalNode Namespace() { return getToken(CPP14Parser.Namespace, 0); }
		public NamespacebodyContext namespacebody() {
			return getRuleContext(NamespacebodyContext.class,0);
		}
		public TerminalNode Inline() { return getToken(CPP14Parser.Inline, 0); }
		public UnnamednamespacedefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unnamednamespacedefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterUnnamednamespacedefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitUnnamednamespacedefinition(this);
		}
	}

	public final UnnamednamespacedefinitionContext unnamednamespacedefinition() throws RecognitionException {
		UnnamednamespacedefinitionContext _localctx = new UnnamednamespacedefinitionContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_unnamednamespacedefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1480);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(1479);
				match(Inline);
				}
			}

			setState(1482);
			match(Namespace);
			setState(1483);
			match(LeftBrace);
			setState(1484);
			namespacebody();
			setState(1485);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespacebodyContext extends ParserRuleContext {
		public DeclarationseqContext declarationseq() {
			return getRuleContext(DeclarationseqContext.class,0);
		}
		public NamespacebodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespacebody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNamespacebody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNamespacebody(this);
		}
	}

	public final NamespacebodyContext namespacebody() throws RecognitionException {
		NamespacebodyContext _localctx = new NamespacebodyContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_namespacebody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1488);
			_la = _input.LA(1);
			if (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & ((1L << (Alignas - 7)) | (1L << (Asm - 7)) | (1L << (Auto - 7)) | (1L << (Bool - 7)) | (1L << (Char - 7)) | (1L << (Char16 - 7)) | (1L << (Char32 - 7)) | (1L << (Class - 7)) | (1L << (Const - 7)) | (1L << (Constexpr - 7)) | (1L << (Decltype - 7)) | (1L << (Double - 7)) | (1L << (Enum - 7)) | (1L << (Explicit - 7)) | (1L << (Extern - 7)) | (1L << (Float - 7)) | (1L << (Friend - 7)) | (1L << (Inline - 7)) | (1L << (Int - 7)) | (1L << (Long - 7)) | (1L << (Mutable - 7)) | (1L << (Namespace - 7)) | (1L << (Operator - 7)) | (1L << (Register - 7)) | (1L << (Short - 7)) | (1L << (Signed - 7)) | (1L << (Static - 7)) | (1L << (Static_assert - 7)) | (1L << (Struct - 7)) | (1L << (Template - 7)) | (1L << (Thread_local - 7)))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (Typedef - 71)) | (1L << (Typename - 71)) | (1L << (Union - 71)) | (1L << (Unsigned - 71)) | (1L << (Using - 71)) | (1L << (Virtual - 71)) | (1L << (Void - 71)) | (1L << (Volatile - 71)) | (1L << (Wchar - 71)) | (1L << (LeftParen - 71)) | (1L << (LeftBracket - 71)) | (1L << (Star - 71)) | (1L << (And - 71)) | (1L << (Tilde - 71)) | (1L << (AndAnd - 71)) | (1L << (Doublecolon - 71)) | (1L << (Semi - 71)) | (1L << (Ellipsis - 71)) | (1L << (Identifier - 71)))) != 0)) {
				{
				setState(1487);
				declarationseq(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespacealiasContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public NamespacealiasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespacealias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNamespacealias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNamespacealias(this);
		}
	}

	public final NamespacealiasContext namespacealias() throws RecognitionException {
		NamespacealiasContext _localctx = new NamespacealiasContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_namespacealias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1490);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespacealiasdefinitionContext extends ParserRuleContext {
		public TerminalNode Namespace() { return getToken(CPP14Parser.Namespace, 0); }
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public QualifiednamespacespecifierContext qualifiednamespacespecifier() {
			return getRuleContext(QualifiednamespacespecifierContext.class,0);
		}
		public NamespacealiasdefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespacealiasdefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNamespacealiasdefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNamespacealiasdefinition(this);
		}
	}

	public final NamespacealiasdefinitionContext namespacealiasdefinition() throws RecognitionException {
		NamespacealiasdefinitionContext _localctx = new NamespacealiasdefinitionContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_namespacealiasdefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1492);
			match(Namespace);
			setState(1493);
			match(Identifier);
			setState(1494);
			match(Assign);
			setState(1495);
			qualifiednamespacespecifier();
			setState(1496);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiednamespacespecifierContext extends ParserRuleContext {
		public NamespacenameContext namespacename() {
			return getRuleContext(NamespacenameContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public QualifiednamespacespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiednamespacespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterQualifiednamespacespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitQualifiednamespacespecifier(this);
		}
	}

	public final QualifiednamespacespecifierContext qualifiednamespacespecifier() throws RecognitionException {
		QualifiednamespacespecifierContext _localctx = new QualifiednamespacespecifierContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_qualifiednamespacespecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				{
				setState(1498);
				nestednamespecifier(0);
				}
				break;
			}
			setState(1501);
			namespacename();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UsingdeclarationContext extends ParserRuleContext {
		public TerminalNode Using() { return getToken(CPP14Parser.Using, 0); }
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public UnqualifiedidContext unqualifiedid() {
			return getRuleContext(UnqualifiedidContext.class,0);
		}
		public TerminalNode Typename() { return getToken(CPP14Parser.Typename, 0); }
		public UsingdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterUsingdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitUsingdeclaration(this);
		}
	}

	public final UsingdeclarationContext usingdeclaration() throws RecognitionException {
		UsingdeclarationContext _localctx = new UsingdeclarationContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_usingdeclaration);
		int _la;
		try {
			setState(1516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1503);
				match(Using);
				setState(1505);
				_la = _input.LA(1);
				if (_la==Typename) {
					{
					setState(1504);
					match(Typename);
					}
				}

				setState(1507);
				nestednamespecifier(0);
				setState(1508);
				unqualifiedid();
				setState(1509);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1511);
				match(Using);
				setState(1512);
				match(Doublecolon);
				setState(1513);
				unqualifiedid();
				setState(1514);
				match(Semi);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UsingdirectiveContext extends ParserRuleContext {
		public TerminalNode Using() { return getToken(CPP14Parser.Using, 0); }
		public TerminalNode Namespace() { return getToken(CPP14Parser.Namespace, 0); }
		public NamespacenameContext namespacename() {
			return getRuleContext(NamespacenameContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public UsingdirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingdirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterUsingdirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitUsingdirective(this);
		}
	}

	public final UsingdirectiveContext usingdirective() throws RecognitionException {
		UsingdirectiveContext _localctx = new UsingdirectiveContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_usingdirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1519);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1518);
				attributespecifierseq(0);
				}
			}

			setState(1521);
			match(Using);
			setState(1522);
			match(Namespace);
			setState(1524);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				{
				setState(1523);
				nestednamespecifier(0);
				}
				break;
			}
			setState(1526);
			namespacename();
			setState(1527);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsmdefinitionContext extends ParserRuleContext {
		public TerminalNode Asm() { return getToken(CPP14Parser.Asm, 0); }
		public TerminalNode Stringliteral() { return getToken(CPP14Parser.Stringliteral, 0); }
		public AsmdefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asmdefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAsmdefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAsmdefinition(this);
		}
	}

	public final AsmdefinitionContext asmdefinition() throws RecognitionException {
		AsmdefinitionContext _localctx = new AsmdefinitionContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_asmdefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1529);
			match(Asm);
			setState(1530);
			match(LeftParen);
			setState(1531);
			match(Stringliteral);
			setState(1532);
			match(RightParen);
			setState(1533);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LinkagespecificationContext extends ParserRuleContext {
		public TerminalNode Extern() { return getToken(CPP14Parser.Extern, 0); }
		public TerminalNode Stringliteral() { return getToken(CPP14Parser.Stringliteral, 0); }
		public DeclarationseqContext declarationseq() {
			return getRuleContext(DeclarationseqContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public LinkagespecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linkagespecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterLinkagespecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitLinkagespecification(this);
		}
	}

	public final LinkagespecificationContext linkagespecification() throws RecognitionException {
		LinkagespecificationContext _localctx = new LinkagespecificationContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_linkagespecification);
		int _la;
		try {
			setState(1545);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1535);
				match(Extern);
				setState(1536);
				match(Stringliteral);
				setState(1537);
				match(LeftBrace);
				setState(1539);
				_la = _input.LA(1);
				if (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & ((1L << (Alignas - 7)) | (1L << (Asm - 7)) | (1L << (Auto - 7)) | (1L << (Bool - 7)) | (1L << (Char - 7)) | (1L << (Char16 - 7)) | (1L << (Char32 - 7)) | (1L << (Class - 7)) | (1L << (Const - 7)) | (1L << (Constexpr - 7)) | (1L << (Decltype - 7)) | (1L << (Double - 7)) | (1L << (Enum - 7)) | (1L << (Explicit - 7)) | (1L << (Extern - 7)) | (1L << (Float - 7)) | (1L << (Friend - 7)) | (1L << (Inline - 7)) | (1L << (Int - 7)) | (1L << (Long - 7)) | (1L << (Mutable - 7)) | (1L << (Namespace - 7)) | (1L << (Operator - 7)) | (1L << (Register - 7)) | (1L << (Short - 7)) | (1L << (Signed - 7)) | (1L << (Static - 7)) | (1L << (Static_assert - 7)) | (1L << (Struct - 7)) | (1L << (Template - 7)) | (1L << (Thread_local - 7)))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (Typedef - 71)) | (1L << (Typename - 71)) | (1L << (Union - 71)) | (1L << (Unsigned - 71)) | (1L << (Using - 71)) | (1L << (Virtual - 71)) | (1L << (Void - 71)) | (1L << (Volatile - 71)) | (1L << (Wchar - 71)) | (1L << (LeftParen - 71)) | (1L << (LeftBracket - 71)) | (1L << (Star - 71)) | (1L << (And - 71)) | (1L << (Tilde - 71)) | (1L << (AndAnd - 71)) | (1L << (Doublecolon - 71)) | (1L << (Semi - 71)) | (1L << (Ellipsis - 71)) | (1L << (Identifier - 71)))) != 0)) {
					{
					setState(1538);
					declarationseq(0);
					}
				}

				setState(1541);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1542);
				match(Extern);
				setState(1543);
				match(Stringliteral);
				setState(1544);
				declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributespecifierseqContext extends ParserRuleContext {
		public AttributespecifierContext attributespecifier() {
			return getRuleContext(AttributespecifierContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public AttributespecifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributespecifierseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAttributespecifierseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAttributespecifierseq(this);
		}
	}

	public final AttributespecifierseqContext attributespecifierseq() throws RecognitionException {
		return attributespecifierseq(0);
	}

	private AttributespecifierseqContext attributespecifierseq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AttributespecifierseqContext _localctx = new AttributespecifierseqContext(_ctx, _parentState);
		AttributespecifierseqContext _prevctx = _localctx;
		int _startState = 210;
		enterRecursionRule(_localctx, 210, RULE_attributespecifierseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1548);
			attributespecifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(1554);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AttributespecifierseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_attributespecifierseq);
					setState(1550);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1551);
					attributespecifier();
					}
					} 
				}
				setState(1556);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AttributespecifierContext extends ParserRuleContext {
		public AttributelistContext attributelist() {
			return getRuleContext(AttributelistContext.class,0);
		}
		public AlignmentspecifierContext alignmentspecifier() {
			return getRuleContext(AlignmentspecifierContext.class,0);
		}
		public AttributespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAttributespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAttributespecifier(this);
		}
	}

	public final AttributespecifierContext attributespecifier() throws RecognitionException {
		AttributespecifierContext _localctx = new AttributespecifierContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_attributespecifier);
		try {
			setState(1564);
			switch (_input.LA(1)) {
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1557);
				match(LeftBracket);
				setState(1558);
				match(LeftBracket);
				setState(1559);
				attributelist(0);
				setState(1560);
				match(RightBracket);
				setState(1561);
				match(RightBracket);
				}
				break;
			case Alignas:
				enterOuterAlt(_localctx, 2);
				{
				setState(1563);
				alignmentspecifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlignmentspecifierContext extends ParserRuleContext {
		public TerminalNode Alignas() { return getToken(CPP14Parser.Alignas, 0); }
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public AlignmentspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alignmentspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAlignmentspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAlignmentspecifier(this);
		}
	}

	public final AlignmentspecifierContext alignmentspecifier() throws RecognitionException {
		AlignmentspecifierContext _localctx = new AlignmentspecifierContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_alignmentspecifier);
		int _la;
		try {
			setState(1582);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1566);
				match(Alignas);
				setState(1567);
				match(LeftParen);
				setState(1568);
				typeid();
				setState(1570);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1569);
					match(Ellipsis);
					}
				}

				setState(1572);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1574);
				match(Alignas);
				setState(1575);
				match(LeftParen);
				setState(1576);
				constantexpression();
				setState(1578);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1577);
					match(Ellipsis);
					}
				}

				setState(1580);
				match(RightParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributelistContext extends ParserRuleContext {
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public AttributelistContext attributelist() {
			return getRuleContext(AttributelistContext.class,0);
		}
		public AttributelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributelist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAttributelist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAttributelist(this);
		}
	}

	public final AttributelistContext attributelist() throws RecognitionException {
		return attributelist(0);
	}

	private AttributelistContext attributelist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AttributelistContext _localctx = new AttributelistContext(_ctx, _parentState);
		AttributelistContext _prevctx = _localctx;
		int _startState = 216;
		enterRecursionRule(_localctx, 216, RULE_attributelist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1591);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				{
				setState(1586);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
				case 1:
					{
					setState(1585);
					attribute();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1588);
				attribute();
				setState(1589);
				match(Ellipsis);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1605);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1603);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
					case 1:
						{
						_localctx = new AttributelistContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_attributelist);
						setState(1593);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1594);
						match(Comma);
						setState(1596);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
						case 1:
							{
							setState(1595);
							attribute();
							}
							break;
						}
						}
						break;
					case 2:
						{
						_localctx = new AttributelistContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_attributelist);
						setState(1598);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1599);
						match(Comma);
						setState(1600);
						attribute();
						setState(1601);
						match(Ellipsis);
						}
						break;
					}
					} 
				}
				setState(1607);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AttributeContext extends ParserRuleContext {
		public AttributetokenContext attributetoken() {
			return getRuleContext(AttributetokenContext.class,0);
		}
		public AttributeargumentclauseContext attributeargumentclause() {
			return getRuleContext(AttributeargumentclauseContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAttribute(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1608);
			attributetoken();
			setState(1610);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				{
				setState(1609);
				attributeargumentclause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributetokenContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public AttributescopedtokenContext attributescopedtoken() {
			return getRuleContext(AttributescopedtokenContext.class,0);
		}
		public AttributetokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributetoken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAttributetoken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAttributetoken(this);
		}
	}

	public final AttributetokenContext attributetoken() throws RecognitionException {
		AttributetokenContext _localctx = new AttributetokenContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_attributetoken);
		try {
			setState(1614);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1612);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1613);
				attributescopedtoken();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributescopedtokenContext extends ParserRuleContext {
		public AttributenamespaceContext attributenamespace() {
			return getRuleContext(AttributenamespaceContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public AttributescopedtokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributescopedtoken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAttributescopedtoken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAttributescopedtoken(this);
		}
	}

	public final AttributescopedtokenContext attributescopedtoken() throws RecognitionException {
		AttributescopedtokenContext _localctx = new AttributescopedtokenContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_attributescopedtoken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1616);
			attributenamespace();
			setState(1617);
			match(Doublecolon);
			setState(1618);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributenamespaceContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public AttributenamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributenamespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAttributenamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAttributenamespace(this);
		}
	}

	public final AttributenamespaceContext attributenamespace() throws RecognitionException {
		AttributenamespaceContext _localctx = new AttributenamespaceContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_attributenamespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1620);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeargumentclauseContext extends ParserRuleContext {
		public BalancedtokenseqContext balancedtokenseq() {
			return getRuleContext(BalancedtokenseqContext.class,0);
		}
		public AttributeargumentclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeargumentclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAttributeargumentclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAttributeargumentclause(this);
		}
	}

	public final AttributeargumentclauseContext attributeargumentclause() throws RecognitionException {
		AttributeargumentclauseContext _localctx = new AttributeargumentclauseContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_attributeargumentclause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1622);
			match(LeftParen);
			setState(1623);
			balancedtokenseq(0);
			setState(1624);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BalancedtokenseqContext extends ParserRuleContext {
		public BalancedtokenContext balancedtoken() {
			return getRuleContext(BalancedtokenContext.class,0);
		}
		public BalancedtokenseqContext balancedtokenseq() {
			return getRuleContext(BalancedtokenseqContext.class,0);
		}
		public BalancedtokenseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balancedtokenseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterBalancedtokenseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitBalancedtokenseq(this);
		}
	}

	public final BalancedtokenseqContext balancedtokenseq() throws RecognitionException {
		return balancedtokenseq(0);
	}

	private BalancedtokenseqContext balancedtokenseq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BalancedtokenseqContext _localctx = new BalancedtokenseqContext(_ctx, _parentState);
		BalancedtokenseqContext _prevctx = _localctx;
		int _startState = 228;
		enterRecursionRule(_localctx, 228, RULE_balancedtokenseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1628);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				{
				setState(1627);
				balancedtoken();
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(1634);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BalancedtokenseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_balancedtokenseq);
					setState(1630);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1631);
					balancedtoken();
					}
					} 
				}
				setState(1636);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BalancedtokenContext extends ParserRuleContext {
		public BalancedtokenseqContext balancedtokenseq() {
			return getRuleContext(BalancedtokenseqContext.class,0);
		}
		public BalancedtokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balancedtoken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterBalancedtoken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitBalancedtoken(this);
		}
	}

	public final BalancedtokenContext balancedtoken() throws RecognitionException {
		BalancedtokenContext _localctx = new BalancedtokenContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_balancedtoken);
		try {
			setState(1649);
			switch (_input.LA(1)) {
			case LeftParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(1637);
				match(LeftParen);
				setState(1638);
				balancedtokenseq(0);
				setState(1639);
				match(RightParen);
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1641);
				match(LeftBracket);
				setState(1642);
				balancedtokenseq(0);
				setState(1643);
				match(RightBracket);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 3);
				{
				setState(1645);
				match(LeftBrace);
				setState(1646);
				balancedtokenseq(0);
				setState(1647);
				match(RightBrace);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitdeclaratorlistContext extends ParserRuleContext {
		public InitdeclaratorContext initdeclarator() {
			return getRuleContext(InitdeclaratorContext.class,0);
		}
		public InitdeclaratorlistContext initdeclaratorlist() {
			return getRuleContext(InitdeclaratorlistContext.class,0);
		}
		public InitdeclaratorlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initdeclaratorlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterInitdeclaratorlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitInitdeclaratorlist(this);
		}
	}

	public final InitdeclaratorlistContext initdeclaratorlist() throws RecognitionException {
		return initdeclaratorlist(0);
	}

	private InitdeclaratorlistContext initdeclaratorlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InitdeclaratorlistContext _localctx = new InitdeclaratorlistContext(_ctx, _parentState);
		InitdeclaratorlistContext _prevctx = _localctx;
		int _startState = 232;
		enterRecursionRule(_localctx, 232, RULE_initdeclaratorlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1652);
			initdeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(1659);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitdeclaratorlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_initdeclaratorlist);
					setState(1654);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1655);
					match(Comma);
					setState(1656);
					initdeclarator();
					}
					} 
				}
				setState(1661);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InitdeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public InitdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterInitdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitInitdeclarator(this);
		}
	}

	public final InitdeclaratorContext initdeclarator() throws RecognitionException {
		InitdeclaratorContext _localctx = new InitdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_initdeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1662);
			declarator();
			setState(1664);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				{
				setState(1663);
				initializer();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaratorContext extends ParserRuleContext {
		public PtrdeclaratorContext ptrdeclarator() {
			return getRuleContext(PtrdeclaratorContext.class,0);
		}
		public NoptrdeclaratorContext noptrdeclarator() {
			return getRuleContext(NoptrdeclaratorContext.class,0);
		}
		public ParametersandqualifiersContext parametersandqualifiers() {
			return getRuleContext(ParametersandqualifiersContext.class,0);
		}
		public TrailingreturntypeContext trailingreturntype() {
			return getRuleContext(TrailingreturntypeContext.class,0);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitDeclarator(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_declarator);
		try {
			setState(1671);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1666);
				ptrdeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1667);
				noptrdeclarator(0);
				setState(1668);
				parametersandqualifiers();
				setState(1669);
				trailingreturntype();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PtrdeclaratorContext extends ParserRuleContext {
		public NoptrdeclaratorContext noptrdeclarator() {
			return getRuleContext(NoptrdeclaratorContext.class,0);
		}
		public PtroperatorContext ptroperator() {
			return getRuleContext(PtroperatorContext.class,0);
		}
		public PtrdeclaratorContext ptrdeclarator() {
			return getRuleContext(PtrdeclaratorContext.class,0);
		}
		public PtrdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptrdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterPtrdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitPtrdeclarator(this);
		}
	}

	public final PtrdeclaratorContext ptrdeclarator() throws RecognitionException {
		PtrdeclaratorContext _localctx = new PtrdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_ptrdeclarator);
		try {
			setState(1677);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1673);
				noptrdeclarator(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1674);
				ptroperator();
				setState(1675);
				ptrdeclarator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoptrdeclaratorContext extends ParserRuleContext {
		public DeclaratoridContext declaratorid() {
			return getRuleContext(DeclaratoridContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public PtrdeclaratorContext ptrdeclarator() {
			return getRuleContext(PtrdeclaratorContext.class,0);
		}
		public NoptrdeclaratorContext noptrdeclarator() {
			return getRuleContext(NoptrdeclaratorContext.class,0);
		}
		public ParametersandqualifiersContext parametersandqualifiers() {
			return getRuleContext(ParametersandqualifiersContext.class,0);
		}
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public NoptrdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noptrdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNoptrdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNoptrdeclarator(this);
		}
	}

	public final NoptrdeclaratorContext noptrdeclarator() throws RecognitionException {
		return noptrdeclarator(0);
	}

	private NoptrdeclaratorContext noptrdeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoptrdeclaratorContext _localctx = new NoptrdeclaratorContext(_ctx, _parentState);
		NoptrdeclaratorContext _prevctx = _localctx;
		int _startState = 240;
		enterRecursionRule(_localctx, 240, RULE_noptrdeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1688);
			switch (_input.LA(1)) {
			case Decltype:
			case Operator:
			case Tilde:
			case Doublecolon:
			case Ellipsis:
			case Identifier:
				{
				setState(1680);
				declaratorid();
				setState(1682);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
				case 1:
					{
					setState(1681);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case LeftParen:
				{
				setState(1684);
				match(LeftParen);
				setState(1685);
				ptrdeclarator();
				setState(1686);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1703);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1701);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
					case 1:
						{
						_localctx = new NoptrdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrdeclarator);
						setState(1690);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1691);
						parametersandqualifiers();
						}
						break;
					case 2:
						{
						_localctx = new NoptrdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrdeclarator);
						setState(1692);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1693);
						match(LeftBracket);
						setState(1695);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (This - 66)) | (1L << (True - 66)) | (1L << (Typeid - 66)) | (1L << (Typename - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (Not - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)) | (1L << (Doublecolon - 66)) | (1L << (Identifier - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (Integerliteral - 130)) | (1L << (Characterliteral - 130)) | (1L << (Floatingliteral - 130)) | (1L << (Stringliteral - 130)) | (1L << (Userdefinedintegerliteral - 130)) | (1L << (Userdefinedfloatingliteral - 130)) | (1L << (Userdefinedstringliteral - 130)) | (1L << (Userdefinedcharacterliteral - 130)))) != 0)) {
							{
							setState(1694);
							constantexpression();
							}
						}

						setState(1697);
						match(RightBracket);
						setState(1699);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
						case 1:
							{
							setState(1698);
							attributespecifierseq(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1705);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParametersandqualifiersContext extends ParserRuleContext {
		public ParameterdeclarationclauseContext parameterdeclarationclause() {
			return getRuleContext(ParameterdeclarationclauseContext.class,0);
		}
		public CvqualifierseqContext cvqualifierseq() {
			return getRuleContext(CvqualifierseqContext.class,0);
		}
		public RefqualifierContext refqualifier() {
			return getRuleContext(RefqualifierContext.class,0);
		}
		public ExceptionspecificationContext exceptionspecification() {
			return getRuleContext(ExceptionspecificationContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public ParametersandqualifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametersandqualifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterParametersandqualifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitParametersandqualifiers(this);
		}
	}

	public final ParametersandqualifiersContext parametersandqualifiers() throws RecognitionException {
		ParametersandqualifiersContext _localctx = new ParametersandqualifiersContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_parametersandqualifiers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1706);
			match(LeftParen);
			setState(1707);
			parameterdeclarationclause();
			setState(1708);
			match(RightParen);
			setState(1710);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				{
				setState(1709);
				cvqualifierseq();
				}
				break;
			}
			setState(1713);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				{
				setState(1712);
				refqualifier();
				}
				break;
			}
			setState(1716);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				{
				setState(1715);
				exceptionspecification();
				}
				break;
			}
			setState(1719);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				{
				setState(1718);
				attributespecifierseq(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TrailingreturntypeContext extends ParserRuleContext {
		public TrailingtypespecifierseqContext trailingtypespecifierseq() {
			return getRuleContext(TrailingtypespecifierseqContext.class,0);
		}
		public AbstractdeclaratorContext abstractdeclarator() {
			return getRuleContext(AbstractdeclaratorContext.class,0);
		}
		public TrailingreturntypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailingreturntype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTrailingreturntype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTrailingreturntype(this);
		}
	}

	public final TrailingreturntypeContext trailingreturntype() throws RecognitionException {
		TrailingreturntypeContext _localctx = new TrailingreturntypeContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_trailingreturntype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1721);
			match(Arrow);
			setState(1722);
			trailingtypespecifierseq();
			setState(1724);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				{
				setState(1723);
				abstractdeclarator();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PtroperatorContext extends ParserRuleContext {
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public CvqualifierseqContext cvqualifierseq() {
			return getRuleContext(CvqualifierseqContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public PtroperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptroperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterPtroperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitPtroperator(this);
		}
	}

	public final PtroperatorContext ptroperator() throws RecognitionException {
		PtroperatorContext _localctx = new PtroperatorContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_ptroperator);
		try {
			setState(1749);
			switch (_input.LA(1)) {
			case Star:
				enterOuterAlt(_localctx, 1);
				{
				setState(1726);
				match(Star);
				setState(1728);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
				case 1:
					{
					setState(1727);
					attributespecifierseq(0);
					}
					break;
				}
				setState(1731);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
				case 1:
					{
					setState(1730);
					cvqualifierseq();
					}
					break;
				}
				}
				break;
			case And:
				enterOuterAlt(_localctx, 2);
				{
				setState(1733);
				match(And);
				setState(1735);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
				case 1:
					{
					setState(1734);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case AndAnd:
				enterOuterAlt(_localctx, 3);
				{
				setState(1737);
				match(AndAnd);
				setState(1739);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
				case 1:
					{
					setState(1738);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case Decltype:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 4);
				{
				setState(1741);
				nestednamespecifier(0);
				setState(1742);
				match(Star);
				setState(1744);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
				case 1:
					{
					setState(1743);
					attributespecifierseq(0);
					}
					break;
				}
				setState(1747);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
				case 1:
					{
					setState(1746);
					cvqualifierseq();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CvqualifierseqContext extends ParserRuleContext {
		public CvqualifierContext cvqualifier() {
			return getRuleContext(CvqualifierContext.class,0);
		}
		public CvqualifierseqContext cvqualifierseq() {
			return getRuleContext(CvqualifierseqContext.class,0);
		}
		public CvqualifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cvqualifierseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterCvqualifierseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitCvqualifierseq(this);
		}
	}

	public final CvqualifierseqContext cvqualifierseq() throws RecognitionException {
		CvqualifierseqContext _localctx = new CvqualifierseqContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_cvqualifierseq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1751);
			cvqualifier();
			setState(1753);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				{
				setState(1752);
				cvqualifierseq();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CvqualifierContext extends ParserRuleContext {
		public TerminalNode Const() { return getToken(CPP14Parser.Const, 0); }
		public TerminalNode Volatile() { return getToken(CPP14Parser.Volatile, 0); }
		public CvqualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cvqualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterCvqualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitCvqualifier(this);
		}
	}

	public final CvqualifierContext cvqualifier() throws RecognitionException {
		CvqualifierContext _localctx = new CvqualifierContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_cvqualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1755);
			_la = _input.LA(1);
			if ( !(_la==Const || _la==Volatile) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RefqualifierContext extends ParserRuleContext {
		public RefqualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refqualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterRefqualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitRefqualifier(this);
		}
	}

	public final RefqualifierContext refqualifier() throws RecognitionException {
		RefqualifierContext _localctx = new RefqualifierContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_refqualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1757);
			_la = _input.LA(1);
			if ( !(_la==And || _la==AndAnd) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaratoridContext extends ParserRuleContext {
		public IdexpressionContext idexpression() {
			return getRuleContext(IdexpressionContext.class,0);
		}
		public DeclaratoridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaratorid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterDeclaratorid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitDeclaratorid(this);
		}
	}

	public final DeclaratoridContext declaratorid() throws RecognitionException {
		DeclaratoridContext _localctx = new DeclaratoridContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_declaratorid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1760);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(1759);
				match(Ellipsis);
				}
			}

			setState(1762);
			idexpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeidContext extends ParserRuleContext {
		public TypespecifierseqContext typespecifierseq() {
			return getRuleContext(TypespecifierseqContext.class,0);
		}
		public AbstractdeclaratorContext abstractdeclarator() {
			return getRuleContext(AbstractdeclaratorContext.class,0);
		}
		public TypeidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTypeid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTypeid(this);
		}
	}

	public final TypeidContext typeid() throws RecognitionException {
		TypeidContext _localctx = new TypeidContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_typeid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1764);
			typespecifierseq();
			setState(1766);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				{
				setState(1765);
				abstractdeclarator();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbstractdeclaratorContext extends ParserRuleContext {
		public PtrabstractdeclaratorContext ptrabstractdeclarator() {
			return getRuleContext(PtrabstractdeclaratorContext.class,0);
		}
		public ParametersandqualifiersContext parametersandqualifiers() {
			return getRuleContext(ParametersandqualifiersContext.class,0);
		}
		public TrailingreturntypeContext trailingreturntype() {
			return getRuleContext(TrailingreturntypeContext.class,0);
		}
		public NoptrabstractdeclaratorContext noptrabstractdeclarator() {
			return getRuleContext(NoptrabstractdeclaratorContext.class,0);
		}
		public AbstractpackdeclaratorContext abstractpackdeclarator() {
			return getRuleContext(AbstractpackdeclaratorContext.class,0);
		}
		public AbstractdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAbstractdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAbstractdeclarator(this);
		}
	}

	public final AbstractdeclaratorContext abstractdeclarator() throws RecognitionException {
		AbstractdeclaratorContext _localctx = new AbstractdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_abstractdeclarator);
		try {
			setState(1776);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1768);
				ptrabstractdeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1770);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
				case 1:
					{
					setState(1769);
					noptrabstractdeclarator(0);
					}
					break;
				}
				setState(1772);
				parametersandqualifiers();
				setState(1773);
				trailingreturntype();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1775);
				abstractpackdeclarator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PtrabstractdeclaratorContext extends ParserRuleContext {
		public NoptrabstractdeclaratorContext noptrabstractdeclarator() {
			return getRuleContext(NoptrabstractdeclaratorContext.class,0);
		}
		public PtroperatorContext ptroperator() {
			return getRuleContext(PtroperatorContext.class,0);
		}
		public PtrabstractdeclaratorContext ptrabstractdeclarator() {
			return getRuleContext(PtrabstractdeclaratorContext.class,0);
		}
		public PtrabstractdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptrabstractdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterPtrabstractdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitPtrabstractdeclarator(this);
		}
	}

	public final PtrabstractdeclaratorContext ptrabstractdeclarator() throws RecognitionException {
		PtrabstractdeclaratorContext _localctx = new PtrabstractdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_ptrabstractdeclarator);
		try {
			setState(1783);
			switch (_input.LA(1)) {
			case LeftParen:
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1778);
				noptrabstractdeclarator(0);
				}
				break;
			case Decltype:
			case Star:
			case And:
			case AndAnd:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1779);
				ptroperator();
				setState(1781);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
				case 1:
					{
					setState(1780);
					ptrabstractdeclarator();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoptrabstractdeclaratorContext extends ParserRuleContext {
		public ParametersandqualifiersContext parametersandqualifiers() {
			return getRuleContext(ParametersandqualifiersContext.class,0);
		}
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public PtrabstractdeclaratorContext ptrabstractdeclarator() {
			return getRuleContext(PtrabstractdeclaratorContext.class,0);
		}
		public NoptrabstractdeclaratorContext noptrabstractdeclarator() {
			return getRuleContext(NoptrabstractdeclaratorContext.class,0);
		}
		public NoptrabstractdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noptrabstractdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNoptrabstractdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNoptrabstractdeclarator(this);
		}
	}

	public final NoptrabstractdeclaratorContext noptrabstractdeclarator() throws RecognitionException {
		return noptrabstractdeclarator(0);
	}

	private NoptrabstractdeclaratorContext noptrabstractdeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoptrabstractdeclaratorContext _localctx = new NoptrabstractdeclaratorContext(_ctx, _parentState);
		NoptrabstractdeclaratorContext _prevctx = _localctx;
		int _startState = 262;
		enterRecursionRule(_localctx, 262, RULE_noptrabstractdeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1799);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				{
				setState(1786);
				parametersandqualifiers();
				}
				break;
			case 2:
				{
				setState(1787);
				match(LeftBracket);
				setState(1789);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (This - 66)) | (1L << (True - 66)) | (1L << (Typeid - 66)) | (1L << (Typename - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (Not - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)) | (1L << (Doublecolon - 66)) | (1L << (Identifier - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (Integerliteral - 130)) | (1L << (Characterliteral - 130)) | (1L << (Floatingliteral - 130)) | (1L << (Stringliteral - 130)) | (1L << (Userdefinedintegerliteral - 130)) | (1L << (Userdefinedfloatingliteral - 130)) | (1L << (Userdefinedstringliteral - 130)) | (1L << (Userdefinedcharacterliteral - 130)))) != 0)) {
					{
					setState(1788);
					constantexpression();
					}
				}

				setState(1791);
				match(RightBracket);
				setState(1793);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
				case 1:
					{
					setState(1792);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(1795);
				match(LeftParen);
				setState(1796);
				ptrabstractdeclarator();
				setState(1797);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1814);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,205,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1812);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
					case 1:
						{
						_localctx = new NoptrabstractdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractdeclarator);
						setState(1801);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1802);
						parametersandqualifiers();
						}
						break;
					case 2:
						{
						_localctx = new NoptrabstractdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractdeclarator);
						setState(1803);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1804);
						match(LeftBracket);
						setState(1806);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (This - 66)) | (1L << (True - 66)) | (1L << (Typeid - 66)) | (1L << (Typename - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (Not - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)) | (1L << (Doublecolon - 66)) | (1L << (Identifier - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (Integerliteral - 130)) | (1L << (Characterliteral - 130)) | (1L << (Floatingliteral - 130)) | (1L << (Stringliteral - 130)) | (1L << (Userdefinedintegerliteral - 130)) | (1L << (Userdefinedfloatingliteral - 130)) | (1L << (Userdefinedstringliteral - 130)) | (1L << (Userdefinedcharacterliteral - 130)))) != 0)) {
							{
							setState(1805);
							constantexpression();
							}
						}

						setState(1808);
						match(RightBracket);
						setState(1810);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
						case 1:
							{
							setState(1809);
							attributespecifierseq(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1816);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,205,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AbstractpackdeclaratorContext extends ParserRuleContext {
		public NoptrabstractpackdeclaratorContext noptrabstractpackdeclarator() {
			return getRuleContext(NoptrabstractpackdeclaratorContext.class,0);
		}
		public PtroperatorContext ptroperator() {
			return getRuleContext(PtroperatorContext.class,0);
		}
		public AbstractpackdeclaratorContext abstractpackdeclarator() {
			return getRuleContext(AbstractpackdeclaratorContext.class,0);
		}
		public AbstractpackdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractpackdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAbstractpackdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAbstractpackdeclarator(this);
		}
	}

	public final AbstractpackdeclaratorContext abstractpackdeclarator() throws RecognitionException {
		AbstractpackdeclaratorContext _localctx = new AbstractpackdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_abstractpackdeclarator);
		try {
			setState(1821);
			switch (_input.LA(1)) {
			case Ellipsis:
				enterOuterAlt(_localctx, 1);
				{
				setState(1817);
				noptrabstractpackdeclarator(0);
				}
				break;
			case Decltype:
			case Star:
			case And:
			case AndAnd:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1818);
				ptroperator();
				setState(1819);
				abstractpackdeclarator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoptrabstractpackdeclaratorContext extends ParserRuleContext {
		public NoptrabstractpackdeclaratorContext noptrabstractpackdeclarator() {
			return getRuleContext(NoptrabstractpackdeclaratorContext.class,0);
		}
		public ParametersandqualifiersContext parametersandqualifiers() {
			return getRuleContext(ParametersandqualifiersContext.class,0);
		}
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public NoptrabstractpackdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noptrabstractpackdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNoptrabstractpackdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNoptrabstractpackdeclarator(this);
		}
	}

	public final NoptrabstractpackdeclaratorContext noptrabstractpackdeclarator() throws RecognitionException {
		return noptrabstractpackdeclarator(0);
	}

	private NoptrabstractpackdeclaratorContext noptrabstractpackdeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoptrabstractpackdeclaratorContext _localctx = new NoptrabstractpackdeclaratorContext(_ctx, _parentState);
		NoptrabstractpackdeclaratorContext _prevctx = _localctx;
		int _startState = 266;
		enterRecursionRule(_localctx, 266, RULE_noptrabstractpackdeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1824);
			match(Ellipsis);
			}
			_ctx.stop = _input.LT(-1);
			setState(1839);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1837);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
					case 1:
						{
						_localctx = new NoptrabstractpackdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractpackdeclarator);
						setState(1826);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1827);
						parametersandqualifiers();
						}
						break;
					case 2:
						{
						_localctx = new NoptrabstractpackdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractpackdeclarator);
						setState(1828);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1829);
						match(LeftBracket);
						setState(1831);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (This - 66)) | (1L << (True - 66)) | (1L << (Typeid - 66)) | (1L << (Typename - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (Not - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)) | (1L << (Doublecolon - 66)) | (1L << (Identifier - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (Integerliteral - 130)) | (1L << (Characterliteral - 130)) | (1L << (Floatingliteral - 130)) | (1L << (Stringliteral - 130)) | (1L << (Userdefinedintegerliteral - 130)) | (1L << (Userdefinedfloatingliteral - 130)) | (1L << (Userdefinedstringliteral - 130)) | (1L << (Userdefinedcharacterliteral - 130)))) != 0)) {
							{
							setState(1830);
							constantexpression();
							}
						}

						setState(1833);
						match(RightBracket);
						setState(1835);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
						case 1:
							{
							setState(1834);
							attributespecifierseq(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1841);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParameterdeclarationclauseContext extends ParserRuleContext {
		public ParameterdeclarationlistContext parameterdeclarationlist() {
			return getRuleContext(ParameterdeclarationlistContext.class,0);
		}
		public ParameterdeclarationclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterdeclarationclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterParameterdeclarationclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitParameterdeclarationclause(this);
		}
	}

	public final ParameterdeclarationclauseContext parameterdeclarationclause() throws RecognitionException {
		ParameterdeclarationclauseContext _localctx = new ParameterdeclarationclauseContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_parameterdeclarationclause);
		int _la;
		try {
			setState(1852);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1843);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Thread_local - 67)) | (1L << (Typedef - 67)) | (1L << (Typename - 67)) | (1L << (Union - 67)) | (1L << (Unsigned - 67)) | (1L << (Virtual - 67)) | (1L << (Void - 67)) | (1L << (Volatile - 67)) | (1L << (Wchar - 67)) | (1L << (LeftBracket - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)))) != 0)) {
					{
					setState(1842);
					parameterdeclarationlist(0);
					}
				}

				setState(1846);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1845);
					match(Ellipsis);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1848);
				parameterdeclarationlist(0);
				setState(1849);
				match(Comma);
				setState(1850);
				match(Ellipsis);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterdeclarationlistContext extends ParserRuleContext {
		public ParameterdeclarationContext parameterdeclaration() {
			return getRuleContext(ParameterdeclarationContext.class,0);
		}
		public ParameterdeclarationlistContext parameterdeclarationlist() {
			return getRuleContext(ParameterdeclarationlistContext.class,0);
		}
		public ParameterdeclarationlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterdeclarationlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterParameterdeclarationlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitParameterdeclarationlist(this);
		}
	}

	public final ParameterdeclarationlistContext parameterdeclarationlist() throws RecognitionException {
		return parameterdeclarationlist(0);
	}

	private ParameterdeclarationlistContext parameterdeclarationlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ParameterdeclarationlistContext _localctx = new ParameterdeclarationlistContext(_ctx, _parentState);
		ParameterdeclarationlistContext _prevctx = _localctx;
		int _startState = 270;
		enterRecursionRule(_localctx, 270, RULE_parameterdeclarationlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1855);
			parameterdeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1862);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParameterdeclarationlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parameterdeclarationlist);
					setState(1857);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1858);
					match(Comma);
					setState(1859);
					parameterdeclaration();
					}
					} 
				}
				setState(1864);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParameterdeclarationContext extends ParserRuleContext {
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
		}
		public AbstractdeclaratorContext abstractdeclarator() {
			return getRuleContext(AbstractdeclaratorContext.class,0);
		}
		public ParameterdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterParameterdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitParameterdeclaration(this);
		}
	}

	public final ParameterdeclarationContext parameterdeclaration() throws RecognitionException {
		ParameterdeclarationContext _localctx = new ParameterdeclarationContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_parameterdeclaration);
		int _la;
		try {
			setState(1896);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1866);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1865);
					attributespecifierseq(0);
					}
				}

				setState(1868);
				declspecifierseq();
				setState(1869);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1872);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1871);
					attributespecifierseq(0);
					}
				}

				setState(1874);
				declspecifierseq();
				setState(1875);
				declarator();
				setState(1876);
				match(Assign);
				setState(1877);
				initializerclause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1880);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1879);
					attributespecifierseq(0);
					}
				}

				setState(1882);
				declspecifierseq();
				setState(1884);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
				case 1:
					{
					setState(1883);
					abstractdeclarator();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1887);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1886);
					attributespecifierseq(0);
					}
				}

				setState(1889);
				declspecifierseq();
				setState(1891);
				_la = _input.LA(1);
				if (_la==Decltype || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (LeftParen - 82)) | (1L << (LeftBracket - 82)) | (1L << (Star - 82)) | (1L << (And - 82)) | (1L << (AndAnd - 82)) | (1L << (Doublecolon - 82)) | (1L << (Ellipsis - 82)) | (1L << (Identifier - 82)))) != 0)) {
					{
					setState(1890);
					abstractdeclarator();
					}
				}

				setState(1893);
				match(Assign);
				setState(1894);
				initializerclause();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctiondefinitionContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public FunctionbodyContext functionbody() {
			return getRuleContext(FunctionbodyContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public VirtspecifierseqContext virtspecifierseq() {
			return getRuleContext(VirtspecifierseqContext.class,0);
		}
		public FunctiondefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiondefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterFunctiondefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitFunctiondefinition(this);
		}
	}

	public final FunctiondefinitionContext functiondefinition() throws RecognitionException {
		FunctiondefinitionContext _localctx = new FunctiondefinitionContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_functiondefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1899);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1898);
				attributespecifierseq(0);
				}
			}

			setState(1903);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
			case 1:
				{
				setState(1901);
				declspecifierseq();
				}
				break;
			case 2:
				{
				setState(1902);
				match(Identifier);
				}
				break;
			}
			setState(1905);
			declarator();
			setState(1907);
			_la = _input.LA(1);
			if (_la==Final || _la==Override) {
				{
				setState(1906);
				virtspecifierseq(0);
				}
			}

			setState(1909);
			functionbody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionbodyContext extends ParserRuleContext {
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public CtorinitializerContext ctorinitializer() {
			return getRuleContext(CtorinitializerContext.class,0);
		}
		public FunctiontryblockContext functiontryblock() {
			return getRuleContext(FunctiontryblockContext.class,0);
		}
		public TerminalNode Default() { return getToken(CPP14Parser.Default, 0); }
		public TerminalNode Delete() { return getToken(CPP14Parser.Delete, 0); }
		public FunctionbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterFunctionbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitFunctionbody(this);
		}
	}

	public final FunctionbodyContext functionbody() throws RecognitionException {
		FunctionbodyContext _localctx = new FunctionbodyContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_functionbody);
		int _la;
		try {
			setState(1922);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1912);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1911);
					ctorinitializer();
					}
				}

				setState(1914);
				compoundstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1915);
				functiontryblock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1916);
				match(Assign);
				setState(1917);
				match(Default);
				setState(1918);
				match(Semi);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1919);
				match(Assign);
				setState(1920);
				match(Delete);
				setState(1921);
				match(Semi);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerContext extends ParserRuleContext {
		public BraceorequalinitializerContext braceorequalinitializer() {
			return getRuleContext(BraceorequalinitializerContext.class,0);
		}
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitInitializer(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_initializer);
		try {
			setState(1929);
			switch (_input.LA(1)) {
			case LeftBrace:
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(1924);
				braceorequalinitializer();
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(1925);
				match(LeftParen);
				setState(1926);
				expressionlist();
				setState(1927);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BraceorequalinitializerContext extends ParserRuleContext {
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public BraceorequalinitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_braceorequalinitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterBraceorequalinitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitBraceorequalinitializer(this);
		}
	}

	public final BraceorequalinitializerContext braceorequalinitializer() throws RecognitionException {
		BraceorequalinitializerContext _localctx = new BraceorequalinitializerContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_braceorequalinitializer);
		try {
			setState(1934);
			switch (_input.LA(1)) {
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(1931);
				match(Assign);
				setState(1932);
				initializerclause();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(1933);
				bracedinitlist();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerclauseContext extends ParserRuleContext {
		public AssignmentexpressionContext assignmentexpression() {
			return getRuleContext(AssignmentexpressionContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public InitializerclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterInitializerclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitInitializerclause(this);
		}
	}

	public final InitializerclauseContext initializerclause() throws RecognitionException {
		InitializerclauseContext _localctx = new InitializerclauseContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_initializerclause);
		try {
			setState(1938);
			switch (_input.LA(1)) {
			case Alignof:
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Const_cast:
			case Decltype:
			case Delete:
			case Double:
			case Dynamic_cast:
			case False:
			case Float:
			case Int:
			case Long:
			case New:
			case Noexcept:
			case Nullptr:
			case Operator:
			case Reinterpret_cast:
			case Short:
			case Signed:
			case Sizeof:
			case Static_cast:
			case This:
			case Throw:
			case True:
			case Typeid:
			case Typename:
			case Unsigned:
			case Void:
			case Wchar:
			case LeftParen:
			case LeftBracket:
			case Plus:
			case Minus:
			case Star:
			case And:
			case Or:
			case Tilde:
			case Not:
			case PlusPlus:
			case MinusMinus:
			case Doublecolon:
			case Identifier:
			case Integerliteral:
			case Characterliteral:
			case Floatingliteral:
			case Stringliteral:
			case Userdefinedintegerliteral:
			case Userdefinedfloatingliteral:
			case Userdefinedstringliteral:
			case Userdefinedcharacterliteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(1936);
				assignmentexpression();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(1937);
				bracedinitlist();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerlistContext extends ParserRuleContext {
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
		}
		public InitializerlistContext initializerlist() {
			return getRuleContext(InitializerlistContext.class,0);
		}
		public InitializerlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterInitializerlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitInitializerlist(this);
		}
	}

	public final InitializerlistContext initializerlist() throws RecognitionException {
		return initializerlist(0);
	}

	private InitializerlistContext initializerlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InitializerlistContext _localctx = new InitializerlistContext(_ctx, _parentState);
		InitializerlistContext _prevctx = _localctx;
		int _startState = 284;
		enterRecursionRule(_localctx, 284, RULE_initializerlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1941);
			initializerclause();
			setState(1943);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
			case 1:
				{
				setState(1942);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(1953);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,232,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitializerlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_initializerlist);
					setState(1945);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1946);
					match(Comma);
					setState(1947);
					initializerclause();
					setState(1949);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
					case 1:
						{
						setState(1948);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(1955);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,232,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BracedinitlistContext extends ParserRuleContext {
		public InitializerlistContext initializerlist() {
			return getRuleContext(InitializerlistContext.class,0);
		}
		public BracedinitlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracedinitlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterBracedinitlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitBracedinitlist(this);
		}
	}

	public final BracedinitlistContext bracedinitlist() throws RecognitionException {
		BracedinitlistContext _localctx = new BracedinitlistContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_bracedinitlist);
		int _la;
		try {
			setState(1965);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1956);
				match(LeftBrace);
				setState(1957);
				initializerlist(0);
				setState(1959);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(1958);
					match(Comma);
					}
				}

				setState(1961);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1963);
				match(LeftBrace);
				setState(1964);
				match(RightBrace);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassnameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public ClassnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterClassname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitClassname(this);
		}
	}

	public final ClassnameContext classname() throws RecognitionException {
		ClassnameContext _localctx = new ClassnameContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_classname);
		try {
			setState(1969);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1967);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1968);
				simpletemplateid();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassspecifierContext extends ParserRuleContext {
		public ClassheadContext classhead() {
			return getRuleContext(ClassheadContext.class,0);
		}
		public MemberspecificationContext memberspecification() {
			return getRuleContext(MemberspecificationContext.class,0);
		}
		public ClassspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterClassspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitClassspecifier(this);
		}
	}

	public final ClassspecifierContext classspecifier() throws RecognitionException {
		ClassspecifierContext _localctx = new ClassspecifierContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_classspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1971);
			classhead();
			setState(1972);
			match(LeftBrace);
			setState(1974);
			_la = _input.LA(1);
			if (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & ((1L << (Alignas - 7)) | (1L << (Auto - 7)) | (1L << (Bool - 7)) | (1L << (Char - 7)) | (1L << (Char16 - 7)) | (1L << (Char32 - 7)) | (1L << (Class - 7)) | (1L << (Const - 7)) | (1L << (Constexpr - 7)) | (1L << (Decltype - 7)) | (1L << (Double - 7)) | (1L << (Enum - 7)) | (1L << (Explicit - 7)) | (1L << (Extern - 7)) | (1L << (Float - 7)) | (1L << (Friend - 7)) | (1L << (Inline - 7)) | (1L << (Int - 7)) | (1L << (Long - 7)) | (1L << (Mutable - 7)) | (1L << (Operator - 7)) | (1L << (Private - 7)) | (1L << (Protected - 7)) | (1L << (Public - 7)) | (1L << (Register - 7)) | (1L << (Short - 7)) | (1L << (Signed - 7)) | (1L << (Static - 7)) | (1L << (Static_assert - 7)) | (1L << (Struct - 7)) | (1L << (Template - 7)) | (1L << (Thread_local - 7)))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (Typedef - 71)) | (1L << (Typename - 71)) | (1L << (Union - 71)) | (1L << (Unsigned - 71)) | (1L << (Using - 71)) | (1L << (Virtual - 71)) | (1L << (Void - 71)) | (1L << (Volatile - 71)) | (1L << (Wchar - 71)) | (1L << (LeftParen - 71)) | (1L << (LeftBracket - 71)) | (1L << (Star - 71)) | (1L << (And - 71)) | (1L << (Tilde - 71)) | (1L << (AndAnd - 71)) | (1L << (Colon - 71)) | (1L << (Doublecolon - 71)) | (1L << (Semi - 71)) | (1L << (Ellipsis - 71)) | (1L << (Identifier - 71)))) != 0)) {
				{
				setState(1973);
				memberspecification();
				}
			}

			setState(1976);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassheadContext extends ParserRuleContext {
		public ClasskeyContext classkey() {
			return getRuleContext(ClasskeyContext.class,0);
		}
		public ClassheadnameContext classheadname() {
			return getRuleContext(ClassheadnameContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public ClassvirtspecifierContext classvirtspecifier() {
			return getRuleContext(ClassvirtspecifierContext.class,0);
		}
		public BaseclauseContext baseclause() {
			return getRuleContext(BaseclauseContext.class,0);
		}
		public ClassheadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classhead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterClasshead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitClasshead(this);
		}
	}

	public final ClassheadContext classhead() throws RecognitionException {
		ClassheadContext _localctx = new ClassheadContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_classhead);
		int _la;
		try {
			setState(1996);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1978);
				classkey();
				setState(1980);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1979);
					attributespecifierseq(0);
					}
				}

				setState(1982);
				classheadname();
				setState(1984);
				_la = _input.LA(1);
				if (_la==Final) {
					{
					setState(1983);
					classvirtspecifier();
					}
				}

				setState(1987);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1986);
					baseclause();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1989);
				classkey();
				setState(1991);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1990);
					attributespecifierseq(0);
					}
				}

				setState(1994);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1993);
					baseclause();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassheadnameContext extends ParserRuleContext {
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public ClassheadnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classheadname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterClassheadname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitClassheadname(this);
		}
	}

	public final ClassheadnameContext classheadname() throws RecognitionException {
		ClassheadnameContext _localctx = new ClassheadnameContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_classheadname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1999);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
			case 1:
				{
				setState(1998);
				nestednamespecifier(0);
				}
				break;
			}
			setState(2001);
			classname();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassvirtspecifierContext extends ParserRuleContext {
		public TerminalNode Final() { return getToken(CPP14Parser.Final, 0); }
		public ClassvirtspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classvirtspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterClassvirtspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitClassvirtspecifier(this);
		}
	}

	public final ClassvirtspecifierContext classvirtspecifier() throws RecognitionException {
		ClassvirtspecifierContext _localctx = new ClassvirtspecifierContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_classvirtspecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2003);
			match(Final);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClasskeyContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(CPP14Parser.Class, 0); }
		public TerminalNode Struct() { return getToken(CPP14Parser.Struct, 0); }
		public TerminalNode Union() { return getToken(CPP14Parser.Union, 0); }
		public ClasskeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classkey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterClasskey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitClasskey(this);
		}
	}

	public final ClasskeyContext classkey() throws RecognitionException {
		ClasskeyContext _localctx = new ClasskeyContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_classkey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2005);
			_la = _input.LA(1);
			if ( !(((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (Class - 18)) | (1L << (Struct - 18)) | (1L << (Union - 18)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberspecificationContext extends ParserRuleContext {
		public MemberdeclarationContext memberdeclaration() {
			return getRuleContext(MemberdeclarationContext.class,0);
		}
		public MemberspecificationContext memberspecification() {
			return getRuleContext(MemberspecificationContext.class,0);
		}
		public AccessspecifierContext accessspecifier() {
			return getRuleContext(AccessspecifierContext.class,0);
		}
		public MemberspecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberspecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterMemberspecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitMemberspecification(this);
		}
	}

	public final MemberspecificationContext memberspecification() throws RecognitionException {
		MemberspecificationContext _localctx = new MemberspecificationContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_memberspecification);
		int _la;
		try {
			setState(2016);
			switch (_input.LA(1)) {
			case Alignas:
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Class:
			case Const:
			case Constexpr:
			case Decltype:
			case Double:
			case Enum:
			case Explicit:
			case Extern:
			case Float:
			case Friend:
			case Inline:
			case Int:
			case Long:
			case Mutable:
			case Operator:
			case Register:
			case Short:
			case Signed:
			case Static:
			case Static_assert:
			case Struct:
			case Template:
			case Thread_local:
			case Typedef:
			case Typename:
			case Union:
			case Unsigned:
			case Using:
			case Virtual:
			case Void:
			case Volatile:
			case Wchar:
			case LeftParen:
			case LeftBracket:
			case Star:
			case And:
			case Tilde:
			case AndAnd:
			case Colon:
			case Doublecolon:
			case Semi:
			case Ellipsis:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(2007);
				memberdeclaration();
				setState(2009);
				_la = _input.LA(1);
				if (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & ((1L << (Alignas - 7)) | (1L << (Auto - 7)) | (1L << (Bool - 7)) | (1L << (Char - 7)) | (1L << (Char16 - 7)) | (1L << (Char32 - 7)) | (1L << (Class - 7)) | (1L << (Const - 7)) | (1L << (Constexpr - 7)) | (1L << (Decltype - 7)) | (1L << (Double - 7)) | (1L << (Enum - 7)) | (1L << (Explicit - 7)) | (1L << (Extern - 7)) | (1L << (Float - 7)) | (1L << (Friend - 7)) | (1L << (Inline - 7)) | (1L << (Int - 7)) | (1L << (Long - 7)) | (1L << (Mutable - 7)) | (1L << (Operator - 7)) | (1L << (Private - 7)) | (1L << (Protected - 7)) | (1L << (Public - 7)) | (1L << (Register - 7)) | (1L << (Short - 7)) | (1L << (Signed - 7)) | (1L << (Static - 7)) | (1L << (Static_assert - 7)) | (1L << (Struct - 7)) | (1L << (Template - 7)) | (1L << (Thread_local - 7)))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (Typedef - 71)) | (1L << (Typename - 71)) | (1L << (Union - 71)) | (1L << (Unsigned - 71)) | (1L << (Using - 71)) | (1L << (Virtual - 71)) | (1L << (Void - 71)) | (1L << (Volatile - 71)) | (1L << (Wchar - 71)) | (1L << (LeftParen - 71)) | (1L << (LeftBracket - 71)) | (1L << (Star - 71)) | (1L << (And - 71)) | (1L << (Tilde - 71)) | (1L << (AndAnd - 71)) | (1L << (Colon - 71)) | (1L << (Doublecolon - 71)) | (1L << (Semi - 71)) | (1L << (Ellipsis - 71)) | (1L << (Identifier - 71)))) != 0)) {
					{
					setState(2008);
					memberspecification();
					}
				}

				}
				break;
			case Private:
			case Protected:
			case Public:
				enterOuterAlt(_localctx, 2);
				{
				setState(2011);
				accessspecifier();
				setState(2012);
				match(Colon);
				setState(2014);
				_la = _input.LA(1);
				if (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & ((1L << (Alignas - 7)) | (1L << (Auto - 7)) | (1L << (Bool - 7)) | (1L << (Char - 7)) | (1L << (Char16 - 7)) | (1L << (Char32 - 7)) | (1L << (Class - 7)) | (1L << (Const - 7)) | (1L << (Constexpr - 7)) | (1L << (Decltype - 7)) | (1L << (Double - 7)) | (1L << (Enum - 7)) | (1L << (Explicit - 7)) | (1L << (Extern - 7)) | (1L << (Float - 7)) | (1L << (Friend - 7)) | (1L << (Inline - 7)) | (1L << (Int - 7)) | (1L << (Long - 7)) | (1L << (Mutable - 7)) | (1L << (Operator - 7)) | (1L << (Private - 7)) | (1L << (Protected - 7)) | (1L << (Public - 7)) | (1L << (Register - 7)) | (1L << (Short - 7)) | (1L << (Signed - 7)) | (1L << (Static - 7)) | (1L << (Static_assert - 7)) | (1L << (Struct - 7)) | (1L << (Template - 7)) | (1L << (Thread_local - 7)))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (Typedef - 71)) | (1L << (Typename - 71)) | (1L << (Union - 71)) | (1L << (Unsigned - 71)) | (1L << (Using - 71)) | (1L << (Virtual - 71)) | (1L << (Void - 71)) | (1L << (Volatile - 71)) | (1L << (Wchar - 71)) | (1L << (LeftParen - 71)) | (1L << (LeftBracket - 71)) | (1L << (Star - 71)) | (1L << (And - 71)) | (1L << (Tilde - 71)) | (1L << (AndAnd - 71)) | (1L << (Colon - 71)) | (1L << (Doublecolon - 71)) | (1L << (Semi - 71)) | (1L << (Ellipsis - 71)) | (1L << (Identifier - 71)))) != 0)) {
					{
					setState(2013);
					memberspecification();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberdeclarationContext extends ParserRuleContext {
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public MemberdeclaratorlistContext memberdeclaratorlist() {
			return getRuleContext(MemberdeclaratorlistContext.class,0);
		}
		public FunctiondefinitionContext functiondefinition() {
			return getRuleContext(FunctiondefinitionContext.class,0);
		}
		public UsingdeclarationContext usingdeclaration() {
			return getRuleContext(UsingdeclarationContext.class,0);
		}
		public Static_assertdeclarationContext static_assertdeclaration() {
			return getRuleContext(Static_assertdeclarationContext.class,0);
		}
		public TemplatedeclarationContext templatedeclaration() {
			return getRuleContext(TemplatedeclarationContext.class,0);
		}
		public AliasdeclarationContext aliasdeclaration() {
			return getRuleContext(AliasdeclarationContext.class,0);
		}
		public EmptydeclarationContext emptydeclaration() {
			return getRuleContext(EmptydeclarationContext.class,0);
		}
		public MemberdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterMemberdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitMemberdeclaration(this);
		}
	}

	public final MemberdeclarationContext memberdeclaration() throws RecognitionException {
		MemberdeclarationContext _localctx = new MemberdeclarationContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_memberdeclaration);
		int _la;
		try {
			setState(2034);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2019);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
				case 1:
					{
					setState(2018);
					attributespecifierseq(0);
					}
					break;
				}
				setState(2022);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
				case 1:
					{
					setState(2021);
					declspecifierseq();
					}
					break;
				}
				setState(2025);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Decltype) | (1L << Operator))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (LeftParen - 82)) | (1L << (LeftBracket - 82)) | (1L << (Star - 82)) | (1L << (And - 82)) | (1L << (Tilde - 82)) | (1L << (AndAnd - 82)) | (1L << (Colon - 82)) | (1L << (Doublecolon - 82)) | (1L << (Ellipsis - 82)) | (1L << (Identifier - 82)))) != 0)) {
					{
					setState(2024);
					memberdeclaratorlist(0);
					}
				}

				setState(2027);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2028);
				functiondefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2029);
				usingdeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2030);
				static_assertdeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2031);
				templatedeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2032);
				aliasdeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2033);
				emptydeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberdeclaratorlistContext extends ParserRuleContext {
		public MemberdeclaratorContext memberdeclarator() {
			return getRuleContext(MemberdeclaratorContext.class,0);
		}
		public MemberdeclaratorlistContext memberdeclaratorlist() {
			return getRuleContext(MemberdeclaratorlistContext.class,0);
		}
		public MemberdeclaratorlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberdeclaratorlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterMemberdeclaratorlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitMemberdeclaratorlist(this);
		}
	}

	public final MemberdeclaratorlistContext memberdeclaratorlist() throws RecognitionException {
		return memberdeclaratorlist(0);
	}

	private MemberdeclaratorlistContext memberdeclaratorlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MemberdeclaratorlistContext _localctx = new MemberdeclaratorlistContext(_ctx, _parentState);
		MemberdeclaratorlistContext _prevctx = _localctx;
		int _startState = 304;
		enterRecursionRule(_localctx, 304, RULE_memberdeclaratorlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2037);
			memberdeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(2044);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,251,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MemberdeclaratorlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_memberdeclaratorlist);
					setState(2039);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2040);
					match(Comma);
					setState(2041);
					memberdeclarator();
					}
					} 
				}
				setState(2046);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,251,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MemberdeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public VirtspecifierseqContext virtspecifierseq() {
			return getRuleContext(VirtspecifierseqContext.class,0);
		}
		public PurespecifierContext purespecifier() {
			return getRuleContext(PurespecifierContext.class,0);
		}
		public BraceorequalinitializerContext braceorequalinitializer() {
			return getRuleContext(BraceorequalinitializerContext.class,0);
		}
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public MemberdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterMemberdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitMemberdeclarator(this);
		}
	}

	public final MemberdeclaratorContext memberdeclarator() throws RecognitionException {
		MemberdeclaratorContext _localctx = new MemberdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_memberdeclarator);
		int _la;
		try {
			setState(2066);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2047);
				declarator();
				setState(2049);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
				case 1:
					{
					setState(2048);
					virtspecifierseq(0);
					}
					break;
				}
				setState(2052);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
				case 1:
					{
					setState(2051);
					purespecifier();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2054);
				declarator();
				setState(2056);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
				case 1:
					{
					setState(2055);
					braceorequalinitializer();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2059);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2058);
					match(Identifier);
					}
				}

				setState(2062);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2061);
					attributespecifierseq(0);
					}
				}

				setState(2064);
				match(Colon);
				setState(2065);
				constantexpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VirtspecifierseqContext extends ParserRuleContext {
		public VirtspecifierContext virtspecifier() {
			return getRuleContext(VirtspecifierContext.class,0);
		}
		public VirtspecifierseqContext virtspecifierseq() {
			return getRuleContext(VirtspecifierseqContext.class,0);
		}
		public VirtspecifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_virtspecifierseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterVirtspecifierseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitVirtspecifierseq(this);
		}
	}

	public final VirtspecifierseqContext virtspecifierseq() throws RecognitionException {
		return virtspecifierseq(0);
	}

	private VirtspecifierseqContext virtspecifierseq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VirtspecifierseqContext _localctx = new VirtspecifierseqContext(_ctx, _parentState);
		VirtspecifierseqContext _prevctx = _localctx;
		int _startState = 308;
		enterRecursionRule(_localctx, 308, RULE_virtspecifierseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2069);
			virtspecifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(2075);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,258,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VirtspecifierseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_virtspecifierseq);
					setState(2071);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2072);
					virtspecifier();
					}
					} 
				}
				setState(2077);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,258,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class VirtspecifierContext extends ParserRuleContext {
		public TerminalNode Override() { return getToken(CPP14Parser.Override, 0); }
		public TerminalNode Final() { return getToken(CPP14Parser.Final, 0); }
		public VirtspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_virtspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterVirtspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitVirtspecifier(this);
		}
	}

	public final VirtspecifierContext virtspecifier() throws RecognitionException {
		VirtspecifierContext _localctx = new VirtspecifierContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_virtspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2078);
			_la = _input.LA(1);
			if ( !(_la==Final || _la==Override) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PurespecifierContext extends ParserRuleContext {
		public Token val;
		public TerminalNode Assign() { return getToken(CPP14Parser.Assign, 0); }
		public TerminalNode Octalliteral() { return getToken(CPP14Parser.Octalliteral, 0); }
		public PurespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_purespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterPurespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitPurespecifier(this);
		}
	}

	public final PurespecifierContext purespecifier() throws RecognitionException {
		PurespecifierContext _localctx = new PurespecifierContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_purespecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2080);
			match(Assign);
			setState(2081);
			((PurespecifierContext)_localctx).val = match(Octalliteral);
			if((((PurespecifierContext)_localctx).val!=null?((PurespecifierContext)_localctx).val.getText():null).compareTo("0")!=0) throw new InputMismatchException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BaseclauseContext extends ParserRuleContext {
		public BasespecifierlistContext basespecifierlist() {
			return getRuleContext(BasespecifierlistContext.class,0);
		}
		public BaseclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterBaseclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitBaseclause(this);
		}
	}

	public final BaseclauseContext baseclause() throws RecognitionException {
		BaseclauseContext _localctx = new BaseclauseContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_baseclause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2084);
			match(Colon);
			setState(2085);
			basespecifierlist(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasespecifierlistContext extends ParserRuleContext {
		public BasespecifierContext basespecifier() {
			return getRuleContext(BasespecifierContext.class,0);
		}
		public BasespecifierlistContext basespecifierlist() {
			return getRuleContext(BasespecifierlistContext.class,0);
		}
		public BasespecifierlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basespecifierlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterBasespecifierlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitBasespecifierlist(this);
		}
	}

	public final BasespecifierlistContext basespecifierlist() throws RecognitionException {
		return basespecifierlist(0);
	}

	private BasespecifierlistContext basespecifierlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BasespecifierlistContext _localctx = new BasespecifierlistContext(_ctx, _parentState);
		BasespecifierlistContext _prevctx = _localctx;
		int _startState = 316;
		enterRecursionRule(_localctx, 316, RULE_basespecifierlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2088);
			basespecifier();
			setState(2090);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
			case 1:
				{
				setState(2089);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2100);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,261,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BasespecifierlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_basespecifierlist);
					setState(2092);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2093);
					match(Comma);
					setState(2094);
					basespecifier();
					setState(2096);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
					case 1:
						{
						setState(2095);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(2102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,261,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BasespecifierContext extends ParserRuleContext {
		public BasetypespecifierContext basetypespecifier() {
			return getRuleContext(BasetypespecifierContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TerminalNode Virtual() { return getToken(CPP14Parser.Virtual, 0); }
		public AccessspecifierContext accessspecifier() {
			return getRuleContext(AccessspecifierContext.class,0);
		}
		public BasespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterBasespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitBasespecifier(this);
		}
	}

	public final BasespecifierContext basespecifier() throws RecognitionException {
		BasespecifierContext _localctx = new BasespecifierContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_basespecifier);
		int _la;
		try {
			setState(2124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2104);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2103);
					attributespecifierseq(0);
					}
				}

				setState(2106);
				basetypespecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2108);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2107);
					attributespecifierseq(0);
					}
				}

				setState(2110);
				match(Virtual);
				setState(2112);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Private) | (1L << Protected) | (1L << Public))) != 0)) {
					{
					setState(2111);
					accessspecifier();
					}
				}

				setState(2114);
				basetypespecifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2116);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2115);
					attributespecifierseq(0);
					}
				}

				setState(2118);
				accessspecifier();
				setState(2120);
				_la = _input.LA(1);
				if (_la==Virtual) {
					{
					setState(2119);
					match(Virtual);
					}
				}

				setState(2122);
				basetypespecifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassordecltypeContext extends ParserRuleContext {
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public DecltypespecifierContext decltypespecifier() {
			return getRuleContext(DecltypespecifierContext.class,0);
		}
		public ClassordecltypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classordecltype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterClassordecltype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitClassordecltype(this);
		}
	}

	public final ClassordecltypeContext classordecltype() throws RecognitionException {
		ClassordecltypeContext _localctx = new ClassordecltypeContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_classordecltype);
		try {
			setState(2131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,269,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2127);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
				case 1:
					{
					setState(2126);
					nestednamespecifier(0);
					}
					break;
				}
				setState(2129);
				classname();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2130);
				decltypespecifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasetypespecifierContext extends ParserRuleContext {
		public ClassordecltypeContext classordecltype() {
			return getRuleContext(ClassordecltypeContext.class,0);
		}
		public BasetypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basetypespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterBasetypespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitBasetypespecifier(this);
		}
	}

	public final BasetypespecifierContext basetypespecifier() throws RecognitionException {
		BasetypespecifierContext _localctx = new BasetypespecifierContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_basetypespecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2133);
			classordecltype();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccessspecifierContext extends ParserRuleContext {
		public TerminalNode Private() { return getToken(CPP14Parser.Private, 0); }
		public TerminalNode Protected() { return getToken(CPP14Parser.Protected, 0); }
		public TerminalNode Public() { return getToken(CPP14Parser.Public, 0); }
		public AccessspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAccessspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAccessspecifier(this);
		}
	}

	public final AccessspecifierContext accessspecifier() throws RecognitionException {
		AccessspecifierContext _localctx = new AccessspecifierContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_accessspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2135);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Private) | (1L << Protected) | (1L << Public))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConversionfunctionidContext extends ParserRuleContext {
		public TerminalNode Operator() { return getToken(CPP14Parser.Operator, 0); }
		public ConversiontypeidContext conversiontypeid() {
			return getRuleContext(ConversiontypeidContext.class,0);
		}
		public ConversionfunctionidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversionfunctionid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterConversionfunctionid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitConversionfunctionid(this);
		}
	}

	public final ConversionfunctionidContext conversionfunctionid() throws RecognitionException {
		ConversionfunctionidContext _localctx = new ConversionfunctionidContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_conversionfunctionid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2137);
			match(Operator);
			setState(2138);
			conversiontypeid();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConversiontypeidContext extends ParserRuleContext {
		public TypespecifierseqContext typespecifierseq() {
			return getRuleContext(TypespecifierseqContext.class,0);
		}
		public ConversiondeclaratorContext conversiondeclarator() {
			return getRuleContext(ConversiondeclaratorContext.class,0);
		}
		public ConversiontypeidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversiontypeid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterConversiontypeid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitConversiontypeid(this);
		}
	}

	public final ConversiontypeidContext conversiontypeid() throws RecognitionException {
		ConversiontypeidContext _localctx = new ConversiontypeidContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_conversiontypeid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2140);
			typespecifierseq();
			setState(2142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
			case 1:
				{
				setState(2141);
				conversiondeclarator();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConversiondeclaratorContext extends ParserRuleContext {
		public PtroperatorContext ptroperator() {
			return getRuleContext(PtroperatorContext.class,0);
		}
		public ConversiondeclaratorContext conversiondeclarator() {
			return getRuleContext(ConversiondeclaratorContext.class,0);
		}
		public ConversiondeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversiondeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterConversiondeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitConversiondeclarator(this);
		}
	}

	public final ConversiondeclaratorContext conversiondeclarator() throws RecognitionException {
		ConversiondeclaratorContext _localctx = new ConversiondeclaratorContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_conversiondeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2144);
			ptroperator();
			setState(2146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
			case 1:
				{
				setState(2145);
				conversiondeclarator();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CtorinitializerContext extends ParserRuleContext {
		public MeminitializerlistContext meminitializerlist() {
			return getRuleContext(MeminitializerlistContext.class,0);
		}
		public CtorinitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctorinitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterCtorinitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitCtorinitializer(this);
		}
	}

	public final CtorinitializerContext ctorinitializer() throws RecognitionException {
		CtorinitializerContext _localctx = new CtorinitializerContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_ctorinitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2148);
			match(Colon);
			setState(2149);
			meminitializerlist();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MeminitializerlistContext extends ParserRuleContext {
		public MeminitializerContext meminitializer() {
			return getRuleContext(MeminitializerContext.class,0);
		}
		public MeminitializerlistContext meminitializerlist() {
			return getRuleContext(MeminitializerlistContext.class,0);
		}
		public MeminitializerlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meminitializerlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterMeminitializerlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitMeminitializerlist(this);
		}
	}

	public final MeminitializerlistContext meminitializerlist() throws RecognitionException {
		MeminitializerlistContext _localctx = new MeminitializerlistContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_meminitializerlist);
		int _la;
		try {
			setState(2162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2151);
				meminitializer();
				setState(2153);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(2152);
					match(Ellipsis);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2155);
				meminitializer();
				setState(2157);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(2156);
					match(Ellipsis);
					}
				}

				setState(2159);
				match(Comma);
				setState(2160);
				meminitializerlist();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MeminitializerContext extends ParserRuleContext {
		public MeminitializeridContext meminitializerid() {
			return getRuleContext(MeminitializeridContext.class,0);
		}
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public MeminitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meminitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterMeminitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitMeminitializer(this);
		}
	}

	public final MeminitializerContext meminitializer() throws RecognitionException {
		MeminitializerContext _localctx = new MeminitializerContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_meminitializer);
		int _la;
		try {
			setState(2174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2164);
				meminitializerid();
				setState(2165);
				match(LeftParen);
				setState(2167);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (This - 66)) | (1L << (Throw - 66)) | (1L << (True - 66)) | (1L << (Typeid - 66)) | (1L << (Typename - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (LeftBrace - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (Not - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)) | (1L << (Doublecolon - 66)) | (1L << (Identifier - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (Integerliteral - 130)) | (1L << (Characterliteral - 130)) | (1L << (Floatingliteral - 130)) | (1L << (Stringliteral - 130)) | (1L << (Userdefinedintegerliteral - 130)) | (1L << (Userdefinedfloatingliteral - 130)) | (1L << (Userdefinedstringliteral - 130)) | (1L << (Userdefinedcharacterliteral - 130)))) != 0)) {
					{
					setState(2166);
					expressionlist();
					}
				}

				setState(2169);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2171);
				meminitializerid();
				setState(2172);
				bracedinitlist();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MeminitializeridContext extends ParserRuleContext {
		public ClassordecltypeContext classordecltype() {
			return getRuleContext(ClassordecltypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public MeminitializeridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meminitializerid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterMeminitializerid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitMeminitializerid(this);
		}
	}

	public final MeminitializeridContext meminitializerid() throws RecognitionException {
		MeminitializeridContext _localctx = new MeminitializeridContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_meminitializerid);
		try {
			setState(2178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,277,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2176);
				classordecltype();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2177);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorfunctionidContext extends ParserRuleContext {
		public TerminalNode Operator() { return getToken(CPP14Parser.Operator, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public OperatorfunctionidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorfunctionid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterOperatorfunctionid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitOperatorfunctionid(this);
		}
	}

	public final OperatorfunctionidContext operatorfunctionid() throws RecognitionException {
		OperatorfunctionidContext _localctx = new OperatorfunctionidContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_operatorfunctionid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2180);
			match(Operator);
			setState(2181);
			operator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteraloperatoridContext extends ParserRuleContext {
		public TerminalNode Operator() { return getToken(CPP14Parser.Operator, 0); }
		public TerminalNode Stringliteral() { return getToken(CPP14Parser.Stringliteral, 0); }
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public TerminalNode Userdefinedstringliteral() { return getToken(CPP14Parser.Userdefinedstringliteral, 0); }
		public LiteraloperatoridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literaloperatorid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterLiteraloperatorid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitLiteraloperatorid(this);
		}
	}

	public final LiteraloperatoridContext literaloperatorid() throws RecognitionException {
		LiteraloperatoridContext _localctx = new LiteraloperatoridContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_literaloperatorid);
		try {
			setState(2188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2183);
				match(Operator);
				setState(2184);
				match(Stringliteral);
				setState(2185);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2186);
				match(Operator);
				setState(2187);
				match(Userdefinedstringliteral);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplatedeclarationContext extends ParserRuleContext {
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public TemplateparameterlistContext templateparameterlist() {
			return getRuleContext(TemplateparameterlistContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TemplatedeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templatedeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTemplatedeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTemplatedeclaration(this);
		}
	}

	public final TemplatedeclarationContext templatedeclaration() throws RecognitionException {
		TemplatedeclarationContext _localctx = new TemplatedeclarationContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_templatedeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2190);
			match(Template);
			setState(2191);
			match(Less);
			setState(2192);
			templateparameterlist(0);
			setState(2193);
			match(Greater);
			setState(2194);
			declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateparameterlistContext extends ParserRuleContext {
		public TemplateparameterContext templateparameter() {
			return getRuleContext(TemplateparameterContext.class,0);
		}
		public TemplateparameterlistContext templateparameterlist() {
			return getRuleContext(TemplateparameterlistContext.class,0);
		}
		public TemplateparameterlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateparameterlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTemplateparameterlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTemplateparameterlist(this);
		}
	}

	public final TemplateparameterlistContext templateparameterlist() throws RecognitionException {
		return templateparameterlist(0);
	}

	private TemplateparameterlistContext templateparameterlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TemplateparameterlistContext _localctx = new TemplateparameterlistContext(_ctx, _parentState);
		TemplateparameterlistContext _prevctx = _localctx;
		int _startState = 346;
		enterRecursionRule(_localctx, 346, RULE_templateparameterlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2197);
			templateparameter();
			}
			_ctx.stop = _input.LT(-1);
			setState(2204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,279,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TemplateparameterlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_templateparameterlist);
					setState(2199);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2200);
					match(Comma);
					setState(2201);
					templateparameter();
					}
					} 
				}
				setState(2206);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,279,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TemplateparameterContext extends ParserRuleContext {
		public TypeparameterContext typeparameter() {
			return getRuleContext(TypeparameterContext.class,0);
		}
		public ParameterdeclarationContext parameterdeclaration() {
			return getRuleContext(ParameterdeclarationContext.class,0);
		}
		public TemplateparameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateparameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTemplateparameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTemplateparameter(this);
		}
	}

	public final TemplateparameterContext templateparameter() throws RecognitionException {
		TemplateparameterContext _localctx = new TemplateparameterContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_templateparameter);
		try {
			setState(2209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2207);
				typeparameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2208);
				parameterdeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeparameterContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(CPP14Parser.Class, 0); }
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public TerminalNode Typename() { return getToken(CPP14Parser.Typename, 0); }
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public TemplateparameterlistContext templateparameterlist() {
			return getRuleContext(TemplateparameterlistContext.class,0);
		}
		public IdexpressionContext idexpression() {
			return getRuleContext(IdexpressionContext.class,0);
		}
		public TypeparameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeparameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTypeparameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTypeparameter(this);
		}
	}

	public final TypeparameterContext typeparameter() throws RecognitionException {
		TypeparameterContext _localctx = new TypeparameterContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_typeparameter);
		int _la;
		try {
			setState(2259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2211);
				match(Class);
				setState(2213);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
				case 1:
					{
					setState(2212);
					match(Ellipsis);
					}
					break;
				}
				setState(2216);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
				case 1:
					{
					setState(2215);
					match(Identifier);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2218);
				match(Class);
				setState(2220);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2219);
					match(Identifier);
					}
				}

				setState(2222);
				match(Assign);
				setState(2223);
				typeid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2224);
				match(Typename);
				setState(2226);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
				case 1:
					{
					setState(2225);
					match(Ellipsis);
					}
					break;
				}
				setState(2229);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
				case 1:
					{
					setState(2228);
					match(Identifier);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2231);
				match(Typename);
				setState(2233);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2232);
					match(Identifier);
					}
				}

				setState(2235);
				match(Assign);
				setState(2236);
				typeid();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2237);
				match(Template);
				setState(2238);
				match(Less);
				setState(2239);
				templateparameterlist(0);
				setState(2240);
				match(Greater);
				setState(2241);
				match(Class);
				setState(2243);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
				case 1:
					{
					setState(2242);
					match(Ellipsis);
					}
					break;
				}
				setState(2246);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
				case 1:
					{
					setState(2245);
					match(Identifier);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2248);
				match(Template);
				setState(2249);
				match(Less);
				setState(2250);
				templateparameterlist(0);
				setState(2251);
				match(Greater);
				setState(2252);
				match(Class);
				setState(2254);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2253);
					match(Identifier);
					}
				}

				setState(2256);
				match(Assign);
				setState(2257);
				idexpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpletemplateidContext extends ParserRuleContext {
		public TemplatenameContext templatename() {
			return getRuleContext(TemplatenameContext.class,0);
		}
		public TemplateargumentlistContext templateargumentlist() {
			return getRuleContext(TemplateargumentlistContext.class,0);
		}
		public SimpletemplateidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpletemplateid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterSimpletemplateid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitSimpletemplateid(this);
		}
	}

	public final SimpletemplateidContext simpletemplateid() throws RecognitionException {
		SimpletemplateidContext _localctx = new SimpletemplateidContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_simpletemplateid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2261);
			templatename();
			setState(2262);
			match(Less);
			setState(2264);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << Struct))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (This - 66)) | (1L << (True - 66)) | (1L << (Typeid - 66)) | (1L << (Typename - 66)) | (1L << (Union - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (Not - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)) | (1L << (Doublecolon - 66)) | (1L << (Identifier - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (Integerliteral - 130)) | (1L << (Characterliteral - 130)) | (1L << (Floatingliteral - 130)) | (1L << (Stringliteral - 130)) | (1L << (Userdefinedintegerliteral - 130)) | (1L << (Userdefinedfloatingliteral - 130)) | (1L << (Userdefinedstringliteral - 130)) | (1L << (Userdefinedcharacterliteral - 130)))) != 0)) {
				{
				setState(2263);
				templateargumentlist(0);
				}
			}

			setState(2266);
			match(Greater);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateidContext extends ParserRuleContext {
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public OperatorfunctionidContext operatorfunctionid() {
			return getRuleContext(OperatorfunctionidContext.class,0);
		}
		public TemplateargumentlistContext templateargumentlist() {
			return getRuleContext(TemplateargumentlistContext.class,0);
		}
		public LiteraloperatoridContext literaloperatorid() {
			return getRuleContext(LiteraloperatoridContext.class,0);
		}
		public TemplateidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTemplateid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTemplateid(this);
		}
	}

	public final TemplateidContext templateid() throws RecognitionException {
		TemplateidContext _localctx = new TemplateidContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_templateid);
		int _la;
		try {
			setState(2283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2268);
				simpletemplateid();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2269);
				operatorfunctionid();
				setState(2270);
				match(Less);
				setState(2272);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << Struct))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (This - 66)) | (1L << (True - 66)) | (1L << (Typeid - 66)) | (1L << (Typename - 66)) | (1L << (Union - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (Not - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)) | (1L << (Doublecolon - 66)) | (1L << (Identifier - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (Integerliteral - 130)) | (1L << (Characterliteral - 130)) | (1L << (Floatingliteral - 130)) | (1L << (Stringliteral - 130)) | (1L << (Userdefinedintegerliteral - 130)) | (1L << (Userdefinedfloatingliteral - 130)) | (1L << (Userdefinedstringliteral - 130)) | (1L << (Userdefinedcharacterliteral - 130)))) != 0)) {
					{
					setState(2271);
					templateargumentlist(0);
					}
				}

				setState(2274);
				match(Greater);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2276);
				literaloperatorid();
				setState(2277);
				match(Less);
				setState(2279);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << Struct))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (This - 66)) | (1L << (True - 66)) | (1L << (Typeid - 66)) | (1L << (Typename - 66)) | (1L << (Union - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (Not - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)) | (1L << (Doublecolon - 66)) | (1L << (Identifier - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (Integerliteral - 130)) | (1L << (Characterliteral - 130)) | (1L << (Floatingliteral - 130)) | (1L << (Stringliteral - 130)) | (1L << (Userdefinedintegerliteral - 130)) | (1L << (Userdefinedfloatingliteral - 130)) | (1L << (Userdefinedstringliteral - 130)) | (1L << (Userdefinedcharacterliteral - 130)))) != 0)) {
					{
					setState(2278);
					templateargumentlist(0);
					}
				}

				setState(2281);
				match(Greater);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplatenameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public TemplatenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templatename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTemplatename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTemplatename(this);
		}
	}

	public final TemplatenameContext templatename() throws RecognitionException {
		TemplatenameContext _localctx = new TemplatenameContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_templatename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2285);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateargumentlistContext extends ParserRuleContext {
		public TemplateargumentContext templateargument() {
			return getRuleContext(TemplateargumentContext.class,0);
		}
		public TemplateargumentlistContext templateargumentlist() {
			return getRuleContext(TemplateargumentlistContext.class,0);
		}
		public TemplateargumentlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateargumentlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTemplateargumentlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTemplateargumentlist(this);
		}
	}

	public final TemplateargumentlistContext templateargumentlist() throws RecognitionException {
		return templateargumentlist(0);
	}

	private TemplateargumentlistContext templateargumentlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TemplateargumentlistContext _localctx = new TemplateargumentlistContext(_ctx, _parentState);
		TemplateargumentlistContext _prevctx = _localctx;
		int _startState = 358;
		enterRecursionRule(_localctx, 358, RULE_templateargumentlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2288);
			templateargument();
			setState(2290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
			case 1:
				{
				setState(2289);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2300);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,297,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TemplateargumentlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_templateargumentlist);
					setState(2292);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2293);
					match(Comma);
					setState(2294);
					templateargument();
					setState(2296);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
					case 1:
						{
						setState(2295);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(2302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,297,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TemplateargumentContext extends ParserRuleContext {
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public IdexpressionContext idexpression() {
			return getRuleContext(IdexpressionContext.class,0);
		}
		public TemplateargumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateargument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTemplateargument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTemplateargument(this);
		}
	}

	public final TemplateargumentContext templateargument() throws RecognitionException {
		TemplateargumentContext _localctx = new TemplateargumentContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_templateargument);
		try {
			setState(2306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2303);
				constantexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2304);
				typeid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2305);
				idexpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypenamespecifierContext extends ParserRuleContext {
		public TerminalNode Typename() { return getToken(CPP14Parser.Typename, 0); }
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public TypenamespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typenamespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTypenamespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTypenamespecifier(this);
		}
	}

	public final TypenamespecifierContext typenamespecifier() throws RecognitionException {
		TypenamespecifierContext _localctx = new TypenamespecifierContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_typenamespecifier);
		int _la;
		try {
			setState(2319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2308);
				match(Typename);
				setState(2309);
				nestednamespecifier(0);
				setState(2310);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2312);
				match(Typename);
				setState(2313);
				nestednamespecifier(0);
				setState(2315);
				_la = _input.LA(1);
				if (_la==Template) {
					{
					setState(2314);
					match(Template);
					}
				}

				setState(2317);
				simpletemplateid();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitinstantiationContext extends ParserRuleContext {
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode Extern() { return getToken(CPP14Parser.Extern, 0); }
		public ExplicitinstantiationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitinstantiation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterExplicitinstantiation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitExplicitinstantiation(this);
		}
	}

	public final ExplicitinstantiationContext explicitinstantiation() throws RecognitionException {
		ExplicitinstantiationContext _localctx = new ExplicitinstantiationContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_explicitinstantiation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2322);
			_la = _input.LA(1);
			if (_la==Extern) {
				{
				setState(2321);
				match(Extern);
				}
			}

			setState(2324);
			match(Template);
			setState(2325);
			declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitspecializationContext extends ParserRuleContext {
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ExplicitspecializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitspecialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterExplicitspecialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitExplicitspecialization(this);
		}
	}

	public final ExplicitspecializationContext explicitspecialization() throws RecognitionException {
		ExplicitspecializationContext _localctx = new ExplicitspecializationContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_explicitspecialization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2327);
			match(Template);
			setState(2328);
			match(Less);
			setState(2329);
			match(Greater);
			setState(2330);
			declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryblockContext extends ParserRuleContext {
		public TerminalNode Try() { return getToken(CPP14Parser.Try, 0); }
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public HandlerseqContext handlerseq() {
			return getRuleContext(HandlerseqContext.class,0);
		}
		public TryblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTryblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTryblock(this);
		}
	}

	public final TryblockContext tryblock() throws RecognitionException {
		TryblockContext _localctx = new TryblockContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_tryblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2332);
			match(Try);
			setState(2333);
			compoundstatement();
			setState(2334);
			handlerseq();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctiontryblockContext extends ParserRuleContext {
		public TerminalNode Try() { return getToken(CPP14Parser.Try, 0); }
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public HandlerseqContext handlerseq() {
			return getRuleContext(HandlerseqContext.class,0);
		}
		public CtorinitializerContext ctorinitializer() {
			return getRuleContext(CtorinitializerContext.class,0);
		}
		public FunctiontryblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiontryblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterFunctiontryblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitFunctiontryblock(this);
		}
	}

	public final FunctiontryblockContext functiontryblock() throws RecognitionException {
		FunctiontryblockContext _localctx = new FunctiontryblockContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_functiontryblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2336);
			match(Try);
			setState(2338);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(2337);
				ctorinitializer();
				}
			}

			setState(2340);
			compoundstatement();
			setState(2341);
			handlerseq();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HandlerseqContext extends ParserRuleContext {
		public HandlerContext handler() {
			return getRuleContext(HandlerContext.class,0);
		}
		public HandlerseqContext handlerseq() {
			return getRuleContext(HandlerseqContext.class,0);
		}
		public HandlerseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_handlerseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterHandlerseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitHandlerseq(this);
		}
	}

	public final HandlerseqContext handlerseq() throws RecognitionException {
		HandlerseqContext _localctx = new HandlerseqContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_handlerseq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2343);
			handler();
			setState(2345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,303,_ctx) ) {
			case 1:
				{
				setState(2344);
				handlerseq();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HandlerContext extends ParserRuleContext {
		public TerminalNode Catch() { return getToken(CPP14Parser.Catch, 0); }
		public ExceptiondeclarationContext exceptiondeclaration() {
			return getRuleContext(ExceptiondeclarationContext.class,0);
		}
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public HandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_handler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterHandler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitHandler(this);
		}
	}

	public final HandlerContext handler() throws RecognitionException {
		HandlerContext _localctx = new HandlerContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_handler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2347);
			match(Catch);
			setState(2348);
			match(LeftParen);
			setState(2349);
			exceptiondeclaration();
			setState(2350);
			match(RightParen);
			setState(2351);
			compoundstatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptiondeclarationContext extends ParserRuleContext {
		public TypespecifierseqContext typespecifierseq() {
			return getRuleContext(TypespecifierseqContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public AbstractdeclaratorContext abstractdeclarator() {
			return getRuleContext(AbstractdeclaratorContext.class,0);
		}
		public ExceptiondeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptiondeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterExceptiondeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitExceptiondeclaration(this);
		}
	}

	public final ExceptiondeclarationContext exceptiondeclaration() throws RecognitionException {
		ExceptiondeclarationContext _localctx = new ExceptiondeclarationContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_exceptiondeclaration);
		int _la;
		try {
			setState(2367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,307,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2354);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2353);
					attributespecifierseq(0);
					}
				}

				setState(2356);
				typespecifierseq();
				setState(2357);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2360);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2359);
					attributespecifierseq(0);
					}
				}

				setState(2362);
				typespecifierseq();
				setState(2364);
				_la = _input.LA(1);
				if (_la==Decltype || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (LeftParen - 82)) | (1L << (LeftBracket - 82)) | (1L << (Star - 82)) | (1L << (And - 82)) | (1L << (AndAnd - 82)) | (1L << (Doublecolon - 82)) | (1L << (Ellipsis - 82)) | (1L << (Identifier - 82)))) != 0)) {
					{
					setState(2363);
					abstractdeclarator();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2366);
				match(Ellipsis);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThrowexpressionContext extends ParserRuleContext {
		public TerminalNode Throw() { return getToken(CPP14Parser.Throw, 0); }
		public AssignmentexpressionContext assignmentexpression() {
			return getRuleContext(AssignmentexpressionContext.class,0);
		}
		public ThrowexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterThrowexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitThrowexpression(this);
		}
	}

	public final ThrowexpressionContext throwexpression() throws RecognitionException {
		ThrowexpressionContext _localctx = new ThrowexpressionContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_throwexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2369);
			match(Throw);
			setState(2371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,308,_ctx) ) {
			case 1:
				{
				setState(2370);
				assignmentexpression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptionspecificationContext extends ParserRuleContext {
		public DynamicexceptionspecificationContext dynamicexceptionspecification() {
			return getRuleContext(DynamicexceptionspecificationContext.class,0);
		}
		public NoexceptspecificationContext noexceptspecification() {
			return getRuleContext(NoexceptspecificationContext.class,0);
		}
		public ExceptionspecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionspecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterExceptionspecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitExceptionspecification(this);
		}
	}

	public final ExceptionspecificationContext exceptionspecification() throws RecognitionException {
		ExceptionspecificationContext _localctx = new ExceptionspecificationContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_exceptionspecification);
		try {
			setState(2375);
			switch (_input.LA(1)) {
			case Throw:
				enterOuterAlt(_localctx, 1);
				{
				setState(2373);
				dynamicexceptionspecification();
				}
				break;
			case Noexcept:
				enterOuterAlt(_localctx, 2);
				{
				setState(2374);
				noexceptspecification();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DynamicexceptionspecificationContext extends ParserRuleContext {
		public TerminalNode Throw() { return getToken(CPP14Parser.Throw, 0); }
		public TypeidlistContext typeidlist() {
			return getRuleContext(TypeidlistContext.class,0);
		}
		public DynamicexceptionspecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamicexceptionspecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterDynamicexceptionspecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitDynamicexceptionspecification(this);
		}
	}

	public final DynamicexceptionspecificationContext dynamicexceptionspecification() throws RecognitionException {
		DynamicexceptionspecificationContext _localctx = new DynamicexceptionspecificationContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_dynamicexceptionspecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2377);
			match(Throw);
			setState(2378);
			match(LeftParen);
			setState(2380);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << Signed) | (1L << Struct))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (Typename - 73)) | (1L << (Union - 73)) | (1L << (Unsigned - 73)) | (1L << (Void - 73)) | (1L << (Volatile - 73)) | (1L << (Wchar - 73)) | (1L << (Doublecolon - 73)) | (1L << (Identifier - 73)))) != 0)) {
				{
				setState(2379);
				typeidlist(0);
				}
			}

			setState(2382);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeidlistContext extends ParserRuleContext {
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public TypeidlistContext typeidlist() {
			return getRuleContext(TypeidlistContext.class,0);
		}
		public TypeidlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeidlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTypeidlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTypeidlist(this);
		}
	}

	public final TypeidlistContext typeidlist() throws RecognitionException {
		return typeidlist(0);
	}

	private TypeidlistContext typeidlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeidlistContext _localctx = new TypeidlistContext(_ctx, _parentState);
		TypeidlistContext _prevctx = _localctx;
		int _startState = 384;
		enterRecursionRule(_localctx, 384, RULE_typeidlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2385);
			typeid();
			setState(2387);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,311,_ctx) ) {
			case 1:
				{
				setState(2386);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2397);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,313,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeidlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeidlist);
					setState(2389);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2390);
					match(Comma);
					setState(2391);
					typeid();
					setState(2393);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,312,_ctx) ) {
					case 1:
						{
						setState(2392);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(2399);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,313,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class NoexceptspecificationContext extends ParserRuleContext {
		public TerminalNode Noexcept() { return getToken(CPP14Parser.Noexcept, 0); }
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public NoexceptspecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noexceptspecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNoexceptspecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNoexceptspecification(this);
		}
	}

	public final NoexceptspecificationContext noexceptspecification() throws RecognitionException {
		NoexceptspecificationContext _localctx = new NoexceptspecificationContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_noexceptspecification);
		try {
			setState(2406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2400);
				match(Noexcept);
				setState(2401);
				match(LeftParen);
				setState(2402);
				constantexpression();
				setState(2403);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2405);
				match(Noexcept);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RightShiftContext extends ParserRuleContext {
		public List<TerminalNode> Greater() { return getTokens(CPP14Parser.Greater); }
		public TerminalNode Greater(int i) {
			return getToken(CPP14Parser.Greater, i);
		}
		public RightShiftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightShift; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterRightShift(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitRightShift(this);
		}
	}

	public final RightShiftContext rightShift() throws RecognitionException {
		RightShiftContext _localctx = new RightShiftContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_rightShift);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2408);
			match(Greater);
			setState(2409);
			match(Greater);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RightShiftAssignContext extends ParserRuleContext {
		public List<TerminalNode> Greater() { return getTokens(CPP14Parser.Greater); }
		public TerminalNode Greater(int i) {
			return getToken(CPP14Parser.Greater, i);
		}
		public TerminalNode Assign() { return getToken(CPP14Parser.Assign, 0); }
		public RightShiftAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightShiftAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterRightShiftAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitRightShiftAssign(this);
		}
	}

	public final RightShiftAssignContext rightShiftAssign() throws RecognitionException {
		RightShiftAssignContext _localctx = new RightShiftAssignContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_rightShiftAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2411);
			match(Greater);
			setState(2412);
			match(Greater);
			setState(2413);
			match(Assign);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode New() { return getToken(CPP14Parser.New, 0); }
		public TerminalNode Delete() { return getToken(CPP14Parser.Delete, 0); }
		public RightShiftContext rightShift() {
			return getRuleContext(RightShiftContext.class,0);
		}
		public RightShiftAssignContext rightShiftAssign() {
			return getRuleContext(RightShiftAssignContext.class,0);
		}
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_operator);
		try {
			setState(2463);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,315,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2415);
				match(New);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2416);
				match(Delete);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2417);
				match(New);
				setState(2418);
				match(LeftBracket);
				setState(2419);
				match(RightBracket);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2420);
				match(Delete);
				setState(2421);
				match(LeftBracket);
				setState(2422);
				match(RightBracket);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2423);
				match(Plus);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2424);
				match(Minus);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2425);
				match(Star);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2426);
				match(Div);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2427);
				match(Mod);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2428);
				match(Caret);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2429);
				match(And);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2430);
				match(Or);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2431);
				match(Tilde);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2432);
				match(Not);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2433);
				match(Assign);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2434);
				match(Less);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2435);
				match(Greater);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2436);
				match(PlusAssign);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2437);
				match(MinusAssign);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2438);
				match(StarAssign);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(2439);
				match(DivAssign);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(2440);
				match(ModAssign);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(2441);
				match(XorAssign);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(2442);
				match(AndAssign);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(2443);
				match(OrAssign);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(2444);
				match(LeftShift);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(2445);
				rightShift();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(2446);
				rightShiftAssign();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(2447);
				match(LeftShiftAssign);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(2448);
				match(Equal);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(2449);
				match(NotEqual);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(2450);
				match(LessEqual);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(2451);
				match(GreaterEqual);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(2452);
				match(AndAnd);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(2453);
				match(OrOr);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(2454);
				match(PlusPlus);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(2455);
				match(MinusMinus);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(2456);
				match(Comma);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(2457);
				match(ArrowStar);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(2458);
				match(Arrow);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(2459);
				match(LeftParen);
				setState(2460);
				match(RightParen);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(2461);
				match(LeftBracket);
				setState(2462);
				match(RightBracket);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode Integerliteral() { return getToken(CPP14Parser.Integerliteral, 0); }
		public TerminalNode Characterliteral() { return getToken(CPP14Parser.Characterliteral, 0); }
		public TerminalNode Floatingliteral() { return getToken(CPP14Parser.Floatingliteral, 0); }
		public TerminalNode Stringliteral() { return getToken(CPP14Parser.Stringliteral, 0); }
		public BooleanliteralContext booleanliteral() {
			return getRuleContext(BooleanliteralContext.class,0);
		}
		public PointerliteralContext pointerliteral() {
			return getRuleContext(PointerliteralContext.class,0);
		}
		public UserdefinedliteralContext userdefinedliteral() {
			return getRuleContext(UserdefinedliteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_literal);
		try {
			setState(2472);
			switch (_input.LA(1)) {
			case Integerliteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(2465);
				match(Integerliteral);
				}
				break;
			case Characterliteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(2466);
				match(Characterliteral);
				}
				break;
			case Floatingliteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(2467);
				match(Floatingliteral);
				}
				break;
			case Stringliteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(2468);
				match(Stringliteral);
				}
				break;
			case False:
			case True:
				enterOuterAlt(_localctx, 5);
				{
				setState(2469);
				booleanliteral();
				}
				break;
			case Nullptr:
				enterOuterAlt(_localctx, 6);
				{
				setState(2470);
				pointerliteral();
				}
				break;
			case Userdefinedintegerliteral:
			case Userdefinedfloatingliteral:
			case Userdefinedstringliteral:
			case Userdefinedcharacterliteral:
				enterOuterAlt(_localctx, 7);
				{
				setState(2471);
				userdefinedliteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanliteralContext extends ParserRuleContext {
		public TerminalNode False() { return getToken(CPP14Parser.False, 0); }
		public TerminalNode True() { return getToken(CPP14Parser.True, 0); }
		public BooleanliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanliteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterBooleanliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitBooleanliteral(this);
		}
	}

	public final BooleanliteralContext booleanliteral() throws RecognitionException {
		BooleanliteralContext _localctx = new BooleanliteralContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_booleanliteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2474);
			_la = _input.LA(1);
			if ( !(_la==False || _la==True) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PointerliteralContext extends ParserRuleContext {
		public TerminalNode Nullptr() { return getToken(CPP14Parser.Nullptr, 0); }
		public PointerliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointerliteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterPointerliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitPointerliteral(this);
		}
	}

	public final PointerliteralContext pointerliteral() throws RecognitionException {
		PointerliteralContext _localctx = new PointerliteralContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_pointerliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2476);
			match(Nullptr);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UserdefinedliteralContext extends ParserRuleContext {
		public TerminalNode Userdefinedintegerliteral() { return getToken(CPP14Parser.Userdefinedintegerliteral, 0); }
		public TerminalNode Userdefinedfloatingliteral() { return getToken(CPP14Parser.Userdefinedfloatingliteral, 0); }
		public TerminalNode Userdefinedstringliteral() { return getToken(CPP14Parser.Userdefinedstringliteral, 0); }
		public TerminalNode Userdefinedcharacterliteral() { return getToken(CPP14Parser.Userdefinedcharacterliteral, 0); }
		public UserdefinedliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userdefinedliteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterUserdefinedliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitUserdefinedliteral(this);
		}
	}

	public final UserdefinedliteralContext userdefinedliteral() throws RecognitionException {
		UserdefinedliteralContext _localctx = new UserdefinedliteralContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_userdefinedliteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2478);
			_la = _input.LA(1);
			if ( !(((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (Userdefinedintegerliteral - 139)) | (1L << (Userdefinedfloatingliteral - 139)) | (1L << (Userdefinedstringliteral - 139)) | (1L << (Userdefinedcharacterliteral - 139)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return nestednamespecifier_sempred((NestednamespecifierContext)_localctx, predIndex);
		case 10:
			return capturelist_sempred((CapturelistContext)_localctx, predIndex);
		case 15:
			return postfixexpression_sempred((PostfixexpressionContext)_localctx, predIndex);
		case 24:
			return noptrnewdeclarator_sempred((NoptrnewdeclaratorContext)_localctx, predIndex);
		case 29:
			return pmexpression_sempred((PmexpressionContext)_localctx, predIndex);
		case 30:
			return multiplicativeexpression_sempred((MultiplicativeexpressionContext)_localctx, predIndex);
		case 31:
			return additiveexpression_sempred((AdditiveexpressionContext)_localctx, predIndex);
		case 32:
			return shiftexpression_sempred((ShiftexpressionContext)_localctx, predIndex);
		case 33:
			return relationalexpression_sempred((RelationalexpressionContext)_localctx, predIndex);
		case 34:
			return equalityexpression_sempred((EqualityexpressionContext)_localctx, predIndex);
		case 35:
			return andexpression_sempred((AndexpressionContext)_localctx, predIndex);
		case 36:
			return exclusiveorexpression_sempred((ExclusiveorexpressionContext)_localctx, predIndex);
		case 37:
			return inclusiveorexpression_sempred((InclusiveorexpressionContext)_localctx, predIndex);
		case 38:
			return logicalandexpression_sempred((LogicalandexpressionContext)_localctx, predIndex);
		case 39:
			return logicalorexpression_sempred((LogicalorexpressionContext)_localctx, predIndex);
		case 43:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 50:
			return statementseq_sempred((StatementseqContext)_localctx, predIndex);
		case 60:
			return declarationseq_sempred((DeclarationseqContext)_localctx, predIndex);
		case 87:
			return enumeratorlist_sempred((EnumeratorlistContext)_localctx, predIndex);
		case 105:
			return attributespecifierseq_sempred((AttributespecifierseqContext)_localctx, predIndex);
		case 108:
			return attributelist_sempred((AttributelistContext)_localctx, predIndex);
		case 114:
			return balancedtokenseq_sempred((BalancedtokenseqContext)_localctx, predIndex);
		case 116:
			return initdeclaratorlist_sempred((InitdeclaratorlistContext)_localctx, predIndex);
		case 120:
			return noptrdeclarator_sempred((NoptrdeclaratorContext)_localctx, predIndex);
		case 131:
			return noptrabstractdeclarator_sempred((NoptrabstractdeclaratorContext)_localctx, predIndex);
		case 133:
			return noptrabstractpackdeclarator_sempred((NoptrabstractpackdeclaratorContext)_localctx, predIndex);
		case 135:
			return parameterdeclarationlist_sempred((ParameterdeclarationlistContext)_localctx, predIndex);
		case 142:
			return initializerlist_sempred((InitializerlistContext)_localctx, predIndex);
		case 152:
			return memberdeclaratorlist_sempred((MemberdeclaratorlistContext)_localctx, predIndex);
		case 154:
			return virtspecifierseq_sempred((VirtspecifierseqContext)_localctx, predIndex);
		case 158:
			return basespecifierlist_sempred((BasespecifierlistContext)_localctx, predIndex);
		case 173:
			return templateparameterlist_sempred((TemplateparameterlistContext)_localctx, predIndex);
		case 179:
			return templateargumentlist_sempred((TemplateargumentlistContext)_localctx, predIndex);
		case 192:
			return typeidlist_sempred((TypeidlistContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean nestednamespecifier_sempred(NestednamespecifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean capturelist_sempred(CapturelistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean postfixexpression_sempred(PostfixexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 19);
		case 4:
			return precpred(_ctx, 18);
		case 5:
			return precpred(_ctx, 17);
		case 6:
			return precpred(_ctx, 12);
		case 7:
			return precpred(_ctx, 11);
		case 8:
			return precpred(_ctx, 10);
		case 9:
			return precpred(_ctx, 9);
		case 10:
			return precpred(_ctx, 8);
		case 11:
			return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean noptrnewdeclarator_sempred(NoptrnewdeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean pmexpression_sempred(PmexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 2);
		case 14:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeexpression_sempred(MultiplicativeexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 3);
		case 16:
			return precpred(_ctx, 2);
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additiveexpression_sempred(AdditiveexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 2);
		case 19:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean shiftexpression_sempred(ShiftexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return precpred(_ctx, 2);
		case 21:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalexpression_sempred(RelationalexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22:
			return precpred(_ctx, 4);
		case 23:
			return precpred(_ctx, 3);
		case 24:
			return precpred(_ctx, 2);
		case 25:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityexpression_sempred(EqualityexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 26:
			return precpred(_ctx, 2);
		case 27:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andexpression_sempred(AndexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 28:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusiveorexpression_sempred(ExclusiveorexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 29:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusiveorexpression_sempred(InclusiveorexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 30:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalandexpression_sempred(LogicalandexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 31:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalorexpression_sempred(LogicalorexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 32:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 33:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean statementseq_sempred(StatementseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 34:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean declarationseq_sempred(DeclarationseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 35:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean enumeratorlist_sempred(EnumeratorlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 36:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean attributespecifierseq_sempred(AttributespecifierseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 37:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean attributelist_sempred(AttributelistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 38:
			return precpred(_ctx, 3);
		case 39:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean balancedtokenseq_sempred(BalancedtokenseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 40:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean initdeclaratorlist_sempred(InitdeclaratorlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 41:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean noptrdeclarator_sempred(NoptrdeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 42:
			return precpred(_ctx, 3);
		case 43:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean noptrabstractdeclarator_sempred(NoptrabstractdeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 44:
			return precpred(_ctx, 5);
		case 45:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean noptrabstractpackdeclarator_sempred(NoptrabstractpackdeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 46:
			return precpred(_ctx, 3);
		case 47:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean parameterdeclarationlist_sempred(ParameterdeclarationlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 48:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean initializerlist_sempred(InitializerlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 49:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean memberdeclaratorlist_sempred(MemberdeclaratorlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 50:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean virtspecifierseq_sempred(VirtspecifierseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 51:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean basespecifierlist_sempred(BasespecifierlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 52:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean templateparameterlist_sempred(TemplateparameterlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 53:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean templateargumentlist_sempred(TemplateargumentlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 54:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean typeidlist_sempred(TypeidlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 55:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0096\u09b3\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\3\2\5\2\u0196\n\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\5\3\u01a2\n\3\3\4\3\4\5\4\u01a6\n\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5\u01b1\n\5\3\6\3\6\5\6\u01b5\n\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u01c4\n\7\3\7\3\7\3\7\3\7"+
		"\3\7\5\7\u01cb\n\7\3\7\3\7\3\7\7\7\u01d0\n\7\f\7\16\7\u01d3\13\7\3\b\3"+
		"\b\5\b\u01d7\n\b\3\b\3\b\3\t\3\t\5\t\u01dd\n\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\5\n\u01e7\n\n\3\13\3\13\3\f\3\f\3\f\5\f\u01ee\n\f\3\f\3\f\3\f"+
		"\3\f\5\f\u01f4\n\f\7\f\u01f6\n\f\f\f\16\f\u01f9\13\f\3\r\3\r\5\r\u01fd"+
		"\n\r\3\16\3\16\3\16\3\16\5\16\u0203\n\16\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u020a\n\17\3\20\3\20\3\20\3\20\5\20\u0210\n\20\3\20\5\20\u0213\n\20\3"+
		"\20\5\20\u0216\n\20\3\20\5\20\u0219\n\20\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u0220\n\21\3\21\3\21\3\21\3\21\3\21\5\21\u0227\n\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\5\21\u025b\n\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u026a\n\21\3\21\3\21\3\21\3\21"+
		"\5\21\u0270\n\21\3\21\3\21\3\21\3\21\5\21\u0276\n\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0283\n\21\f\21\16\21\u0286"+
		"\13\21\3\22\3\22\3\23\5\23\u028b\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u029a\n\23\3\23\3\23\3\23\3\23"+
		"\5\23\u02a0\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\5\24\u02be\n\24\3\25\3\25\3\26\5\26\u02c3\n\26\3\26\3"+
		"\26\5\26\u02c7\n\26\3\26\3\26\5\26\u02cb\n\26\3\26\5\26\u02ce\n\26\3\26"+
		"\3\26\5\26\u02d2\n\26\3\26\3\26\3\26\3\26\5\26\u02d8\n\26\5\26\u02da\n"+
		"\26\3\27\3\27\3\27\3\27\3\30\3\30\5\30\u02e2\n\30\3\31\3\31\5\31\u02e6"+
		"\n\31\3\31\5\31\u02e9\n\31\3\32\3\32\3\32\3\32\3\32\5\32\u02f0\n\32\3"+
		"\32\3\32\3\32\3\32\3\32\5\32\u02f7\n\32\7\32\u02f9\n\32\f\32\16\32\u02fc"+
		"\13\32\3\33\3\33\5\33\u0300\n\33\3\33\3\33\5\33\u0304\n\33\3\34\5\34\u0307"+
		"\n\34\3\34\3\34\3\34\5\34\u030c\n\34\3\34\3\34\3\34\3\34\5\34\u0312\n"+
		"\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u031f"+
		"\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u032a\n\37\f\37"+
		"\16\37\u032d\13\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \7 \u033b\n \f "+
		"\16 \u033e\13 \3!\3!\3!\3!\3!\3!\3!\3!\3!\7!\u0349\n!\f!\16!\u034c\13"+
		"!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u0358\n\"\f\"\16\"\u035b"+
		"\13\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\7#\u036c\n#\f#\16#"+
		"\u036f\13#\3$\3$\3$\3$\3$\3$\3$\3$\3$\7$\u037a\n$\f$\16$\u037d\13$\3%"+
		"\3%\3%\3%\3%\3%\7%\u0385\n%\f%\16%\u0388\13%\3&\3&\3&\3&\3&\3&\7&\u0390"+
		"\n&\f&\16&\u0393\13&\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u039b\n\'\f\'\16\'\u039e"+
		"\13\'\3(\3(\3(\3(\3(\3(\7(\u03a6\n(\f(\16(\u03a9\13(\3)\3)\3)\3)\3)\3"+
		")\7)\u03b1\n)\f)\16)\u03b4\13)\3*\3*\3*\3*\3*\3*\3*\5*\u03bd\n*\3+\3+"+
		"\3+\3+\3+\3+\5+\u03c5\n+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u03d2\n,"+
		"\3-\3-\3-\3-\3-\3-\7-\u03da\n-\f-\16-\u03dd\13-\3.\3.\3/\3/\3/\3/\3/\7"+
		"/\u03e6\n/\f/\16/\u03e9\13/\3\60\3\60\5\60\u03ed\n\60\3\60\3\60\5\60\u03f1"+
		"\n\60\3\60\3\60\5\60\u03f5\n\60\3\60\3\60\5\60\u03f9\n\60\3\60\3\60\5"+
		"\60\u03fd\n\60\3\60\3\60\5\60\u0401\n\60\3\60\3\60\3\60\5\60\u0406\n\60"+
		"\3\60\5\60\u0409\n\60\3\61\5\61\u040c\n\61\3\61\3\61\3\61\3\61\5\61\u0412"+
		"\n\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u041a\n\61\3\61\3\61\3\61\5\61"+
		"\u041f\n\61\3\62\5\62\u0422\n\62\3\62\3\62\3\63\3\63\5\63\u0428\n\63\3"+
		"\63\3\63\3\64\3\64\3\64\3\64\3\64\7\64\u0431\n\64\f\64\16\64\u0434\13"+
		"\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3"+
		"\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u044a\n\65\3\66\3\66\5\66\u044e"+
		"\n\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u0456\n\66\3\66\3\66\3\66\3\66"+
		"\5\66\u045c\n\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u0472\n\67\38\38\5"+
		"8\u0476\n8\39\59\u0479\n9\39\39\39\3:\3:\5:\u0480\n:\3;\3;\3;\3;\3;\3"+
		";\5;\u0488\n;\3;\3;\3;\3;\3;\3;\3;\3;\5;\u0492\n;\3<\3<\3<\3<\3<\5<\u0499"+
		"\n<\3<\3<\3=\3=\3>\3>\3>\3>\3>\7>\u04a4\n>\f>\16>\u04a7\13>\3?\3?\3?\3"+
		"?\3?\3?\3?\3?\3?\5?\u04b2\n?\3@\3@\3@\3@\3@\3@\3@\3@\5@\u04bc\n@\3A\3"+
		"A\3A\5A\u04c1\nA\3A\3A\3A\3A\3B\5B\u04c8\nB\3B\5B\u04cb\nB\3B\3B\3B\5"+
		"B\u04d0\nB\3B\3B\3B\5B\u04d5\nB\3C\3C\3C\3C\3C\3C\3C\3C\3D\3D\3E\3E\3"+
		"E\3F\3F\3F\3F\3F\3F\5F\u04ea\nF\3G\3G\5G\u04ee\nG\3G\3G\3G\5G\u04f3\n"+
		"G\3H\3H\3I\3I\3J\3J\3K\3K\3K\5K\u04fe\nK\3L\3L\3L\3L\5L\u0504\nL\3M\3"+
		"M\5M\u0508\nM\3M\3M\3M\5M\u050d\nM\3N\3N\5N\u0511\nN\3N\3N\3N\5N\u0516"+
		"\nN\3O\5O\u0519\nO\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O"+
		"\3O\3O\3O\5O\u052f\nO\3P\3P\3P\3P\5P\u0535\nP\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q"+
		"\3Q\5Q\u0540\nQ\3R\3R\5R\u0544\nR\3R\5R\u0547\nR\3R\3R\3R\3R\3R\3R\3R"+
		"\3R\5R\u0551\nR\3R\3R\3R\3R\5R\u0557\nR\3R\5R\u055a\nR\3S\3S\3T\3T\3T"+
		"\5T\u0561\nT\3T\3T\3T\3T\3T\3T\3T\3T\5T\u056b\nT\3U\3U\5U\u056f\nU\3U"+
		"\5U\u0572\nU\3U\5U\u0575\nU\3U\3U\5U\u0579\nU\3U\3U\3U\5U\u057e\nU\5U"+
		"\u0580\nU\3V\3V\5V\u0584\nV\3V\3V\5V\u0588\nV\3V\3V\3W\3W\3W\3W\3W\5W"+
		"\u0591\nW\3X\3X\3X\3Y\3Y\3Y\3Y\3Y\3Y\7Y\u059c\nY\fY\16Y\u059f\13Y\3Z\3"+
		"Z\3Z\3Z\3Z\5Z\u05a6\nZ\3[\3[\3\\\3\\\5\\\u05ac\n\\\3]\3]\3^\3^\5^\u05b2"+
		"\n^\3_\3_\5_\u05b6\n_\3`\5`\u05b9\n`\3`\3`\3`\3`\3`\3`\3a\5a\u05c2\na"+
		"\3a\3a\3a\3a\3a\3a\3b\5b\u05cb\nb\3b\3b\3b\3b\3b\3c\5c\u05d3\nc\3d\3d"+
		"\3e\3e\3e\3e\3e\3e\3f\5f\u05de\nf\3f\3f\3g\3g\5g\u05e4\ng\3g\3g\3g\3g"+
		"\3g\3g\3g\3g\3g\5g\u05ef\ng\3h\5h\u05f2\nh\3h\3h\3h\5h\u05f7\nh\3h\3h"+
		"\3h\3i\3i\3i\3i\3i\3i\3j\3j\3j\3j\5j\u0606\nj\3j\3j\3j\3j\5j\u060c\nj"+
		"\3k\3k\3k\3k\3k\7k\u0613\nk\fk\16k\u0616\13k\3l\3l\3l\3l\3l\3l\3l\5l\u061f"+
		"\nl\3m\3m\3m\3m\5m\u0625\nm\3m\3m\3m\3m\3m\3m\5m\u062d\nm\3m\3m\5m\u0631"+
		"\nm\3n\3n\5n\u0635\nn\3n\3n\3n\5n\u063a\nn\3n\3n\3n\5n\u063f\nn\3n\3n"+
		"\3n\3n\3n\7n\u0646\nn\fn\16n\u0649\13n\3o\3o\5o\u064d\no\3p\3p\5p\u0651"+
		"\np\3q\3q\3q\3q\3r\3r\3s\3s\3s\3s\3t\3t\5t\u065f\nt\3t\3t\7t\u0663\nt"+
		"\ft\16t\u0666\13t\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\5u\u0674\nu\3v\3"+
		"v\3v\3v\3v\3v\7v\u067c\nv\fv\16v\u067f\13v\3w\3w\5w\u0683\nw\3x\3x\3x"+
		"\3x\3x\5x\u068a\nx\3y\3y\3y\3y\5y\u0690\ny\3z\3z\3z\5z\u0695\nz\3z\3z"+
		"\3z\3z\5z\u069b\nz\3z\3z\3z\3z\3z\5z\u06a2\nz\3z\3z\5z\u06a6\nz\7z\u06a8"+
		"\nz\fz\16z\u06ab\13z\3{\3{\3{\3{\5{\u06b1\n{\3{\5{\u06b4\n{\3{\5{\u06b7"+
		"\n{\3{\5{\u06ba\n{\3|\3|\3|\5|\u06bf\n|\3}\3}\5}\u06c3\n}\3}\5}\u06c6"+
		"\n}\3}\3}\5}\u06ca\n}\3}\3}\5}\u06ce\n}\3}\3}\3}\5}\u06d3\n}\3}\5}\u06d6"+
		"\n}\5}\u06d8\n}\3~\3~\5~\u06dc\n~\3\177\3\177\3\u0080\3\u0080\3\u0081"+
		"\5\u0081\u06e3\n\u0081\3\u0081\3\u0081\3\u0082\3\u0082\5\u0082\u06e9\n"+
		"\u0082\3\u0083\3\u0083\5\u0083\u06ed\n\u0083\3\u0083\3\u0083\3\u0083\3"+
		"\u0083\5\u0083\u06f3\n\u0083\3\u0084\3\u0084\3\u0084\5\u0084\u06f8\n\u0084"+
		"\5\u0084\u06fa\n\u0084\3\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u0700\n"+
		"\u0085\3\u0085\3\u0085\5\u0085\u0704\n\u0085\3\u0085\3\u0085\3\u0085\3"+
		"\u0085\5\u0085\u070a\n\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\5"+
		"\u0085\u0711\n\u0085\3\u0085\3\u0085\5\u0085\u0715\n\u0085\7\u0085\u0717"+
		"\n\u0085\f\u0085\16\u0085\u071a\13\u0085\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\5\u0086\u0720\n\u0086\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\3\u0087\5\u0087\u072a\n\u0087\3\u0087\3\u0087\5\u0087\u072e\n"+
		"\u0087\7\u0087\u0730\n\u0087\f\u0087\16\u0087\u0733\13\u0087\3\u0088\5"+
		"\u0088\u0736\n\u0088\3\u0088\5\u0088\u0739\n\u0088\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\5\u0088\u073f\n\u0088\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089"+
		"\3\u0089\7\u0089\u0747\n\u0089\f\u0089\16\u0089\u074a\13\u0089\3\u008a"+
		"\5\u008a\u074d\n\u008a\3\u008a\3\u008a\3\u008a\3\u008a\5\u008a\u0753\n"+
		"\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\5\u008a\u075b\n"+
		"\u008a\3\u008a\3\u008a\5\u008a\u075f\n\u008a\3\u008a\5\u008a\u0762\n\u008a"+
		"\3\u008a\3\u008a\5\u008a\u0766\n\u008a\3\u008a\3\u008a\3\u008a\5\u008a"+
		"\u076b\n\u008a\3\u008b\5\u008b\u076e\n\u008b\3\u008b\3\u008b\5\u008b\u0772"+
		"\n\u008b\3\u008b\3\u008b\5\u008b\u0776\n\u008b\3\u008b\3\u008b\3\u008c"+
		"\5\u008c\u077b\n\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\5\u008c\u0785\n\u008c\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\5\u008d\u078c\n\u008d\3\u008e\3\u008e\3\u008e\5\u008e\u0791\n"+
		"\u008e\3\u008f\3\u008f\5\u008f\u0795\n\u008f\3\u0090\3\u0090\3\u0090\5"+
		"\u0090\u079a\n\u0090\3\u0090\3\u0090\3\u0090\3\u0090\5\u0090\u07a0\n\u0090"+
		"\7\u0090\u07a2\n\u0090\f\u0090\16\u0090\u07a5\13\u0090\3\u0091\3\u0091"+
		"\3\u0091\5\u0091\u07aa\n\u0091\3\u0091\3\u0091\3\u0091\3\u0091\5\u0091"+
		"\u07b0\n\u0091\3\u0092\3\u0092\5\u0092\u07b4\n\u0092\3\u0093\3\u0093\3"+
		"\u0093\5\u0093\u07b9\n\u0093\3\u0093\3\u0093\3\u0094\3\u0094\5\u0094\u07bf"+
		"\n\u0094\3\u0094\3\u0094\5\u0094\u07c3\n\u0094\3\u0094\5\u0094\u07c6\n"+
		"\u0094\3\u0094\3\u0094\5\u0094\u07ca\n\u0094\3\u0094\5\u0094\u07cd\n\u0094"+
		"\5\u0094\u07cf\n\u0094\3\u0095\5\u0095\u07d2\n\u0095\3\u0095\3\u0095\3"+
		"\u0096\3\u0096\3\u0097\3\u0097\3\u0098\3\u0098\5\u0098\u07dc\n\u0098\3"+
		"\u0098\3\u0098\3\u0098\5\u0098\u07e1\n\u0098\5\u0098\u07e3\n\u0098\3\u0099"+
		"\5\u0099\u07e6\n\u0099\3\u0099\5\u0099\u07e9\n\u0099\3\u0099\5\u0099\u07ec"+
		"\n\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\5\u0099"+
		"\u07f5\n\u0099\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\7\u009a"+
		"\u07fd\n\u009a\f\u009a\16\u009a\u0800\13\u009a\3\u009b\3\u009b\5\u009b"+
		"\u0804\n\u009b\3\u009b\5\u009b\u0807\n\u009b\3\u009b\3\u009b\5\u009b\u080b"+
		"\n\u009b\3\u009b\5\u009b\u080e\n\u009b\3\u009b\5\u009b\u0811\n\u009b\3"+
		"\u009b\3\u009b\5\u009b\u0815\n\u009b\3\u009c\3\u009c\3\u009c\3\u009c\3"+
		"\u009c\7\u009c\u081c\n\u009c\f\u009c\16\u009c\u081f\13\u009c\3\u009d\3"+
		"\u009d\3\u009e\3\u009e\3\u009e\3\u009e\3\u009f\3\u009f\3\u009f\3\u00a0"+
		"\3\u00a0\3\u00a0\5\u00a0\u082d\n\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0"+
		"\5\u00a0\u0833\n\u00a0\7\u00a0\u0835\n\u00a0\f\u00a0\16\u00a0\u0838\13"+
		"\u00a0\3\u00a1\5\u00a1\u083b\n\u00a1\3\u00a1\3\u00a1\5\u00a1\u083f\n\u00a1"+
		"\3\u00a1\3\u00a1\5\u00a1\u0843\n\u00a1\3\u00a1\3\u00a1\5\u00a1\u0847\n"+
		"\u00a1\3\u00a1\3\u00a1\5\u00a1\u084b\n\u00a1\3\u00a1\3\u00a1\5\u00a1\u084f"+
		"\n\u00a1\3\u00a2\5\u00a2\u0852\n\u00a2\3\u00a2\3\u00a2\5\u00a2\u0856\n"+
		"\u00a2\3\u00a3\3\u00a3\3\u00a4\3\u00a4\3\u00a5\3\u00a5\3\u00a5\3\u00a6"+
		"\3\u00a6\5\u00a6\u0861\n\u00a6\3\u00a7\3\u00a7\5\u00a7\u0865\n\u00a7\3"+
		"\u00a8\3\u00a8\3\u00a8\3\u00a9\3\u00a9\5\u00a9\u086c\n\u00a9\3\u00a9\3"+
		"\u00a9\5\u00a9\u0870\n\u00a9\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u0875\n\u00a9"+
		"\3\u00aa\3\u00aa\3\u00aa\5\u00aa\u087a\n\u00aa\3\u00aa\3\u00aa\3\u00aa"+
		"\3\u00aa\3\u00aa\5\u00aa\u0881\n\u00aa\3\u00ab\3\u00ab\5\u00ab\u0885\n"+
		"\u00ab\3\u00ac\3\u00ac\3\u00ac\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad"+
		"\5\u00ad\u088f\n\u00ad\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae"+
		"\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\7\u00af\u089d\n\u00af"+
		"\f\u00af\16\u00af\u08a0\13\u00af\3\u00b0\3\u00b0\5\u00b0\u08a4\n\u00b0"+
		"\3\u00b1\3\u00b1\5\u00b1\u08a8\n\u00b1\3\u00b1\5\u00b1\u08ab\n\u00b1\3"+
		"\u00b1\3\u00b1\5\u00b1\u08af\n\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\5"+
		"\u00b1\u08b5\n\u00b1\3\u00b1\5\u00b1\u08b8\n\u00b1\3\u00b1\3\u00b1\5\u00b1"+
		"\u08bc\n\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1"+
		"\3\u00b1\5\u00b1\u08c6\n\u00b1\3\u00b1\5\u00b1\u08c9\n\u00b1\3\u00b1\3"+
		"\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\5\u00b1\u08d1\n\u00b1\3\u00b1\3"+
		"\u00b1\3\u00b1\5\u00b1\u08d6\n\u00b1\3\u00b2\3\u00b2\3\u00b2\5\u00b2\u08db"+
		"\n\u00b2\3\u00b2\3\u00b2\3\u00b3\3\u00b3\3\u00b3\3\u00b3\5\u00b3\u08e3"+
		"\n\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\5\u00b3\u08ea\n\u00b3"+
		"\3\u00b3\3\u00b3\5\u00b3\u08ee\n\u00b3\3\u00b4\3\u00b4\3\u00b5\3\u00b5"+
		"\3\u00b5\5\u00b5\u08f5\n\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\5\u00b5"+
		"\u08fb\n\u00b5\7\u00b5\u08fd\n\u00b5\f\u00b5\16\u00b5\u0900\13\u00b5\3"+
		"\u00b6\3\u00b6\3\u00b6\5\u00b6\u0905\n\u00b6\3\u00b7\3\u00b7\3\u00b7\3"+
		"\u00b7\3\u00b7\3\u00b7\3\u00b7\5\u00b7\u090e\n\u00b7\3\u00b7\3\u00b7\5"+
		"\u00b7\u0912\n\u00b7\3\u00b8\5\u00b8\u0915\n\u00b8\3\u00b8\3\u00b8\3\u00b8"+
		"\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00ba\3\u00ba\3\u00ba\3\u00ba"+
		"\3\u00bb\3\u00bb\5\u00bb\u0925\n\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bc"+
		"\3\u00bc\5\u00bc\u092c\n\u00bc\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd"+
		"\3\u00bd\3\u00be\5\u00be\u0935\n\u00be\3\u00be\3\u00be\3\u00be\3\u00be"+
		"\5\u00be\u093b\n\u00be\3\u00be\3\u00be\5\u00be\u093f\n\u00be\3\u00be\5"+
		"\u00be\u0942\n\u00be\3\u00bf\3\u00bf\5\u00bf\u0946\n\u00bf\3\u00c0\3\u00c0"+
		"\5\u00c0\u094a\n\u00c0\3\u00c1\3\u00c1\3\u00c1\5\u00c1\u094f\n\u00c1\3"+
		"\u00c1\3\u00c1\3\u00c2\3\u00c2\3\u00c2\5\u00c2\u0956\n\u00c2\3\u00c2\3"+
		"\u00c2\3\u00c2\3\u00c2\5\u00c2\u095c\n\u00c2\7\u00c2\u095e\n\u00c2\f\u00c2"+
		"\16\u00c2\u0961\13\u00c2\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3"+
		"\5\u00c3\u0969\n\u00c3\3\u00c4\3\u00c4\3\u00c4\3\u00c5\3\u00c5\3\u00c5"+
		"\3\u00c5\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6"+
		"\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6"+
		"\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6"+
		"\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6"+
		"\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6"+
		"\3\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u09a2\n\u00c6\3\u00c7\3\u00c7"+
		"\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\5\u00c7\u09ab\n\u00c7\3\u00c8"+
		"\3\u00c8\3\u00c9\3\u00c9\3\u00ca\3\u00ca\3\u00ca\2$\f\26 \62<>@BDFHJL"+
		"NPXfz\u00b0\u00d4\u00da\u00e6\u00ea\u00f2\u0108\u010c\u0110\u011e\u0132"+
		"\u0136\u013e\u015c\u0168\u0182\u00cb\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8"+
		"\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0"+
		"\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8"+
		"\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110"+
		"\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128"+
		"\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140"+
		"\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158"+
		"\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170"+
		"\u0172\u0174\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188"+
		"\u018a\u018c\u018e\u0190\u0192\2\16\4\2``dd\4\2Z\\`c\3\2TU\7\2##..88>"+
		">EE\5\2!!++OO\4\2\25\25QQ\4\2``uu\5\2\24\24AALL\4\2%%\64\64\3\2\65\67"+
		"\4\2$$GG\3\2\u008d\u0090\u0ad5\2\u0195\3\2\2\2\4\u01a1\3\2\2\2\6\u01a5"+
		"\3\2\2\2\b\u01b0\3\2\2\2\n\u01b2\3\2\2\2\f\u01c3\3\2\2\2\16\u01d4\3\2"+
		"\2\2\20\u01da\3\2\2\2\22\u01e6\3\2\2\2\24\u01e8\3\2\2\2\26\u01ea\3\2\2"+
		"\2\30\u01fc\3\2\2\2\32\u0202\3\2\2\2\34\u0209\3\2\2\2\36\u020b\3\2\2\2"+
		" \u025a\3\2\2\2\"\u0287\3\2\2\2$\u029f\3\2\2\2&\u02bd\3\2\2\2(\u02bf\3"+
		"\2\2\2*\u02d9\3\2\2\2,\u02db\3\2\2\2.\u02df\3\2\2\2\60\u02e8\3\2\2\2\62"+
		"\u02ea\3\2\2\2\64\u0303\3\2\2\2\66\u0311\3\2\2\28\u0313\3\2\2\2:\u031e"+
		"\3\2\2\2<\u0320\3\2\2\2>\u032e\3\2\2\2@\u033f\3\2\2\2B\u034d\3\2\2\2D"+
		"\u035c\3\2\2\2F\u0370\3\2\2\2H\u037e\3\2\2\2J\u0389\3\2\2\2L\u0394\3\2"+
		"\2\2N\u039f\3\2\2\2P\u03aa\3\2\2\2R\u03bc\3\2\2\2T\u03c4\3\2\2\2V\u03d1"+
		"\3\2\2\2X\u03d3\3\2\2\2Z\u03de\3\2\2\2\\\u03e7\3\2\2\2^\u0408\3\2\2\2"+
		"`\u041e\3\2\2\2b\u0421\3\2\2\2d\u0425\3\2\2\2f\u042b\3\2\2\2h\u0449\3"+
		"\2\2\2j\u045b\3\2\2\2l\u0471\3\2\2\2n\u0475\3\2\2\2p\u0478\3\2\2\2r\u047f"+
		"\3\2\2\2t\u0491\3\2\2\2v\u0493\3\2\2\2x\u049c\3\2\2\2z\u049e\3\2\2\2|"+
		"\u04b1\3\2\2\2~\u04bb\3\2\2\2\u0080\u04bd\3\2\2\2\u0082\u04d4\3\2\2\2"+
		"\u0084\u04d6\3\2\2\2\u0086\u04de\3\2\2\2\u0088\u04e0\3\2\2\2\u008a\u04e9"+
		"\3\2\2\2\u008c\u04f2\3\2\2\2\u008e\u04f4\3\2\2\2\u0090\u04f6\3\2\2\2\u0092"+
		"\u04f8\3\2\2\2\u0094\u04fd\3\2\2\2\u0096\u0503\3\2\2\2\u0098\u050c\3\2"+
		"\2\2\u009a\u0515\3\2\2\2\u009c\u052e\3\2\2\2\u009e\u0534\3\2\2\2\u00a0"+
		"\u053f\3\2\2\2\u00a2\u0559\3\2\2\2\u00a4\u055b\3\2\2\2\u00a6\u056a\3\2"+
		"\2\2\u00a8\u057f\3\2\2\2\u00aa\u0581\3\2\2\2\u00ac\u0590\3\2\2\2\u00ae"+
		"\u0592\3\2\2\2\u00b0\u0595\3\2\2\2\u00b2\u05a5\3\2\2\2\u00b4\u05a7\3\2"+
		"\2\2\u00b6\u05ab\3\2\2\2\u00b8\u05ad\3\2\2\2\u00ba\u05b1\3\2\2\2\u00bc"+
		"\u05b5\3\2\2\2\u00be\u05b8\3\2\2\2\u00c0\u05c1\3\2\2\2\u00c2\u05ca\3\2"+
		"\2\2\u00c4\u05d2\3\2\2\2\u00c6\u05d4\3\2\2\2\u00c8\u05d6\3\2\2\2\u00ca"+
		"\u05dd\3\2\2\2\u00cc\u05ee\3\2\2\2\u00ce\u05f1\3\2\2\2\u00d0\u05fb\3\2"+
		"\2\2\u00d2\u060b\3\2\2\2\u00d4\u060d\3\2\2\2\u00d6\u061e\3\2\2\2\u00d8"+
		"\u0630\3\2\2\2\u00da\u0639\3\2\2\2\u00dc\u064a\3\2\2\2\u00de\u0650\3\2"+
		"\2\2\u00e0\u0652\3\2\2\2\u00e2\u0656\3\2\2\2\u00e4\u0658\3\2\2\2\u00e6"+
		"\u065c\3\2\2\2\u00e8\u0673\3\2\2\2\u00ea\u0675\3\2\2\2\u00ec\u0680\3\2"+
		"\2\2\u00ee\u0689\3\2\2\2\u00f0\u068f\3\2\2\2\u00f2\u069a\3\2\2\2\u00f4"+
		"\u06ac\3\2\2\2\u00f6\u06bb\3\2\2\2\u00f8\u06d7\3\2\2\2\u00fa\u06d9\3\2"+
		"\2\2\u00fc\u06dd\3\2\2\2\u00fe\u06df\3\2\2\2\u0100\u06e2\3\2\2\2\u0102"+
		"\u06e6\3\2\2\2\u0104\u06f2\3\2\2\2\u0106\u06f9\3\2\2\2\u0108\u0709\3\2"+
		"\2\2\u010a\u071f\3\2\2\2\u010c\u0721\3\2\2\2\u010e\u073e\3\2\2\2\u0110"+
		"\u0740\3\2\2\2\u0112\u076a\3\2\2\2\u0114\u076d\3\2\2\2\u0116\u0784\3\2"+
		"\2\2\u0118\u078b\3\2\2\2\u011a\u0790\3\2\2\2\u011c\u0794\3\2\2\2\u011e"+
		"\u0796\3\2\2\2\u0120\u07af\3\2\2\2\u0122\u07b3\3\2\2\2\u0124\u07b5\3\2"+
		"\2\2\u0126\u07ce\3\2\2\2\u0128\u07d1\3\2\2\2\u012a\u07d5\3\2\2\2\u012c"+
		"\u07d7\3\2\2\2\u012e\u07e2\3\2\2\2\u0130\u07f4\3\2\2\2\u0132\u07f6\3\2"+
		"\2\2\u0134\u0814\3\2\2\2\u0136\u0816\3\2\2\2\u0138\u0820\3\2\2\2\u013a"+
		"\u0822\3\2\2\2\u013c\u0826\3\2\2\2\u013e\u0829\3\2\2\2\u0140\u084e\3\2"+
		"\2\2\u0142\u0855\3\2\2\2\u0144\u0857\3\2\2\2\u0146\u0859\3\2\2\2\u0148"+
		"\u085b\3\2\2\2\u014a\u085e\3\2\2\2\u014c\u0862\3\2\2\2\u014e\u0866\3\2"+
		"\2\2\u0150\u0874\3\2\2\2\u0152\u0880\3\2\2\2\u0154\u0884\3\2\2\2\u0156"+
		"\u0886\3\2\2\2\u0158\u088e\3\2\2\2\u015a\u0890\3\2\2\2\u015c\u0896\3\2"+
		"\2\2\u015e\u08a3\3\2\2\2\u0160\u08d5\3\2\2\2\u0162\u08d7\3\2\2\2\u0164"+
		"\u08ed\3\2\2\2\u0166\u08ef\3\2\2\2\u0168\u08f1\3\2\2\2\u016a\u0904\3\2"+
		"\2\2\u016c\u0911\3\2\2\2\u016e\u0914\3\2\2\2\u0170\u0919\3\2\2\2\u0172"+
		"\u091e\3\2\2\2\u0174\u0922\3\2\2\2\u0176\u0929\3\2\2\2\u0178\u092d\3\2"+
		"\2\2\u017a\u0941\3\2\2\2\u017c\u0943\3\2\2\2\u017e\u0949\3\2\2\2\u0180"+
		"\u094b\3\2\2\2\u0182\u0952\3\2\2\2\u0184\u0968\3\2\2\2\u0186\u096a\3\2"+
		"\2\2\u0188\u096d\3\2\2\2\u018a\u09a1\3\2\2\2\u018c\u09aa\3\2\2\2\u018e"+
		"\u09ac\3\2\2\2\u0190\u09ae\3\2\2\2\u0192\u09b0\3\2\2\2\u0194\u0196\5z"+
		">\2\u0195\u0194\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0197\3\2\2\2\u0197"+
		"\u0198\7\2\2\3\u0198\3\3\2\2\2\u0199\u01a2\5\u018c\u00c7\2\u019a\u01a2"+
		"\7D\2\2\u019b\u019c\7T\2\2\u019c\u019d\5X-\2\u019d\u019e\7U\2\2\u019e"+
		"\u01a2\3\2\2\2\u019f\u01a2\5\6\4\2\u01a0\u01a2\5\16\b\2\u01a1\u0199\3"+
		"\2\2\2\u01a1\u019a\3\2\2\2\u01a1\u019b\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1"+
		"\u01a0\3\2\2\2\u01a2\5\3\2\2\2\u01a3\u01a6\5\b\5\2\u01a4\u01a6\5\n\6\2"+
		"\u01a5\u01a3\3\2\2\2\u01a5\u01a4\3\2\2\2\u01a6\7\3\2\2\2\u01a7\u01b1\7"+
		"\u0083\2\2\u01a8\u01b1\5\u0156\u00ac\2\u01a9\u01b1\5\u0148\u00a5\2\u01aa"+
		"\u01b1\5\u0158\u00ad\2\u01ab\u01ac\7b\2\2\u01ac\u01b1\5\u0122\u0092\2"+
		"\u01ad\u01ae\7b\2\2\u01ae\u01b1\5\u00a0Q\2\u01af\u01b1\5\u0164\u00b3\2"+
		"\u01b0\u01a7\3\2\2\2\u01b0\u01a8\3\2\2\2\u01b0\u01a9\3\2\2\2\u01b0\u01aa"+
		"\3\2\2\2\u01b0\u01ab\3\2\2\2\u01b0\u01ad\3\2\2\2\u01b0\u01af\3\2\2\2\u01b1"+
		"\t\3\2\2\2\u01b2\u01b4\5\f\7\2\u01b3\u01b5\7C\2\2\u01b4\u01b3\3\2\2\2"+
		"\u01b4\u01b5\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\5\b\5\2\u01b7\13"+
		"\3\2\2\2\u01b8\u01b9\b\7\1\2\u01b9\u01c4\7~\2\2\u01ba\u01bb\5\u009eP\2"+
		"\u01bb\u01bc\7~\2\2\u01bc\u01c4\3\2\2\2\u01bd\u01be\5\u00b6\\\2\u01be"+
		"\u01bf\7~\2\2\u01bf\u01c4\3\2\2\2\u01c0\u01c1\5\u00a0Q\2\u01c1\u01c2\7"+
		"~\2\2\u01c2\u01c4\3\2\2\2\u01c3\u01b8\3\2\2\2\u01c3\u01ba\3\2\2\2\u01c3"+
		"\u01bd\3\2\2\2\u01c3\u01c0\3\2\2\2\u01c4\u01d1\3\2\2\2\u01c5\u01c6\f\4"+
		"\2\2\u01c6\u01c7\7\u0083\2\2\u01c7\u01d0\7~\2\2\u01c8\u01ca\f\3\2\2\u01c9"+
		"\u01cb\7C\2\2\u01ca\u01c9\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cc\3\2"+
		"\2\2\u01cc\u01cd\5\u0162\u00b2\2\u01cd\u01ce\7~\2\2\u01ce\u01d0\3\2\2"+
		"\2\u01cf\u01c5\3\2\2\2\u01cf\u01c8\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1\u01cf"+
		"\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\r\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d4"+
		"\u01d6\5\20\t\2\u01d5\u01d7\5\36\20\2\u01d6\u01d5\3\2\2\2\u01d6\u01d7"+
		"\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9\5d\63\2\u01d9\17\3\2\2\2\u01da"+
		"\u01dc\7V\2\2\u01db\u01dd\5\22\n\2\u01dc\u01db\3\2\2\2\u01dc\u01dd\3\2"+
		"\2\2\u01dd\u01de\3\2\2\2\u01de\u01df\7W\2\2\u01df\21\3\2\2\2\u01e0\u01e7"+
		"\5\24\13\2\u01e1\u01e7\5\26\f\2\u01e2\u01e3\5\24\13\2\u01e3\u01e4\7y\2"+
		"\2\u01e4\u01e5\5\26\f\2\u01e5\u01e7\3\2\2\2\u01e6\u01e0\3\2\2\2\u01e6"+
		"\u01e1\3\2\2\2\u01e6\u01e2\3\2\2\2\u01e7\23\3\2\2\2\u01e8\u01e9\t\2\2"+
		"\2\u01e9\25\3\2\2\2\u01ea\u01eb\b\f\1\2\u01eb\u01ed\5\30\r\2\u01ec\u01ee"+
		"\7\u0082\2\2\u01ed\u01ec\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01f7\3\2\2"+
		"\2\u01ef\u01f0\f\3\2\2\u01f0\u01f1\7y\2\2\u01f1\u01f3\5\30\r\2\u01f2\u01f4"+
		"\7\u0082\2\2\u01f3\u01f2\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f6\3\2\2"+
		"\2\u01f5\u01ef\3\2\2\2\u01f6\u01f9\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f7\u01f8"+
		"\3\2\2\2\u01f8\27\3\2\2\2\u01f9\u01f7\3\2\2\2\u01fa\u01fd\5\32\16\2\u01fb"+
		"\u01fd\5\34\17\2\u01fc\u01fa\3\2\2\2\u01fc\u01fb\3\2\2\2\u01fd\31\3\2"+
		"\2\2\u01fe\u0203\7\u0083\2\2\u01ff\u0200\7`\2\2\u0200\u0203\7\u0083\2"+
		"\2\u0201\u0203\7D\2\2\u0202\u01fe\3\2\2\2\u0202\u01ff\3\2\2\2\u0202\u0201"+
		"\3\2\2\2\u0203\33\3\2\2\2\u0204\u0205\7\u0083\2\2\u0205\u020a\5\u0118"+
		"\u008d\2\u0206\u0207\7`\2\2\u0207\u0208\7\u0083\2\2\u0208\u020a\5\u0118"+
		"\u008d\2\u0209\u0204\3\2\2\2\u0209\u0206\3\2\2\2\u020a\35\3\2\2\2\u020b"+
		"\u020c\7T\2\2\u020c\u020d\5\u010e\u0088\2\u020d\u020f\7U\2\2\u020e\u0210"+
		"\7.\2\2\u020f\u020e\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0212\3\2\2\2\u0211"+
		"\u0213\5\u017e\u00c0\2\u0212\u0211\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0215"+
		"\3\2\2\2\u0214\u0216\5\u00d4k\2\u0215\u0214\3\2\2\2\u0215\u0216\3\2\2"+
		"\2\u0216\u0218\3\2\2\2\u0217\u0219\5\u00f6|\2\u0218\u0217\3\2\2\2\u0218"+
		"\u0219\3\2\2\2\u0219\37\3\2\2\2\u021a\u021b\b\21\1\2\u021b\u025b\5\4\3"+
		"\2\u021c\u021d\5\u009cO\2\u021d\u021f\7T\2\2\u021e\u0220\5\"\22\2\u021f"+
		"\u021e\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0222\7U"+
		"\2\2\u0222\u025b\3\2\2\2\u0223\u0224\5\u016c\u00b7\2\u0224\u0226\7T\2"+
		"\2\u0225\u0227\5\"\22\2\u0226\u0225\3\2\2\2\u0226\u0227\3\2\2\2\u0227"+
		"\u0228\3\2\2\2\u0228\u0229\7U\2\2\u0229\u025b\3\2\2\2\u022a\u022b\5\u009c"+
		"O\2\u022b\u022c\5\u0120\u0091\2\u022c\u025b\3\2\2\2\u022d\u022e\5\u016c"+
		"\u00b7\2\u022e\u022f\5\u0120\u0091\2\u022f\u025b\3\2\2\2\u0230\u0231\7"+
		"\36\2\2\u0231\u0232\7e\2\2\u0232\u0233\5\u0102\u0082\2\u0233\u0234\7f"+
		"\2\2\u0234\u0235\7T\2\2\u0235\u0236\5X-\2\u0236\u0237\7U\2\2\u0237\u025b"+
		"\3\2\2\2\u0238\u0239\7@\2\2\u0239\u023a\7e\2\2\u023a\u023b\5\u0102\u0082"+
		"\2\u023b\u023c\7f\2\2\u023c\u023d\7T\2\2\u023d\u023e\5X-\2\u023e\u023f"+
		"\7U\2\2\u023f\u025b\3\2\2\2\u0240\u0241\79\2\2\u0241\u0242\7e\2\2\u0242"+
		"\u0243\5\u0102\u0082\2\u0243\u0244\7f\2\2\u0244\u0245\7T\2\2\u0245\u0246"+
		"\5X-\2\u0246\u0247\7U\2\2\u0247\u025b\3\2\2\2\u0248\u0249\7\27\2\2\u0249"+
		"\u024a\7e\2\2\u024a\u024b\5\u0102\u0082\2\u024b\u024c\7f\2\2\u024c\u024d"+
		"\7T\2\2\u024d\u024e\5X-\2\u024e\u024f\7U\2\2\u024f\u025b\3\2\2\2\u0250"+
		"\u0251\7J\2\2\u0251\u0252\7T\2\2\u0252\u0253\5X-\2\u0253\u0254\7U\2\2"+
		"\u0254\u025b\3\2\2\2\u0255\u0256\7J\2\2\u0256\u0257\7T\2\2\u0257\u0258"+
		"\5\u0102\u0082\2\u0258\u0259\7U\2\2\u0259\u025b\3\2\2\2\u025a\u021a\3"+
		"\2\2\2\u025a\u021c\3\2\2\2\u025a\u0223\3\2\2\2\u025a\u022a\3\2\2\2\u025a"+
		"\u022d\3\2\2\2\u025a\u0230\3\2\2\2\u025a\u0238\3\2\2\2\u025a\u0240\3\2"+
		"\2\2\u025a\u0248\3\2\2\2\u025a\u0250\3\2\2\2\u025a\u0255\3\2\2\2\u025b"+
		"\u0284\3\2\2\2\u025c\u025d\f\25\2\2\u025d\u025e\7V\2\2\u025e\u025f\5X"+
		"-\2\u025f\u0260\7W\2\2\u0260\u0283\3\2\2\2\u0261\u0262\f\24\2\2\u0262"+
		"\u0263\7V\2\2\u0263\u0264\5\u0120\u0091\2\u0264\u0265\7W\2\2\u0265\u0283"+
		"\3\2\2\2\u0266\u0267\f\23\2\2\u0267\u0269\7T\2\2\u0268\u026a\5\"\22\2"+
		"\u0269\u0268\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u0283"+
		"\7U\2\2\u026c\u026d\f\16\2\2\u026d\u026f\7\u0080\2\2\u026e\u0270\7C\2"+
		"\2\u026f\u026e\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0283"+
		"\5\6\4\2\u0272\u0273\f\r\2\2\u0273\u0275\7{\2\2\u0274\u0276\7C\2\2\u0275"+
		"\u0274\3\2\2\2\u0275\u0276\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u0283\5\6"+
		"\4\2\u0278\u0279\f\f\2\2\u0279\u027a\7\u0080\2\2\u027a\u0283\5$\23\2\u027b"+
		"\u027c\f\13\2\2\u027c\u027d\7{\2\2\u027d\u0283\5$\23\2\u027e\u027f\f\n"+
		"\2\2\u027f\u0283\7w\2\2\u0280\u0281\f\t\2\2\u0281\u0283\7x\2\2\u0282\u025c"+
		"\3\2\2\2\u0282\u0261\3\2\2\2\u0282\u0266\3\2\2\2\u0282\u026c\3\2\2\2\u0282"+
		"\u0272\3\2\2\2\u0282\u0278\3\2\2\2\u0282\u027b\3\2\2\2\u0282\u027e\3\2"+
		"\2\2\u0282\u0280\3\2\2\2\u0283\u0286\3\2\2\2\u0284\u0282\3\2\2\2\u0284"+
		"\u0285\3\2\2\2\u0285!\3\2\2\2\u0286\u0284\3\2\2\2\u0287\u0288\5\u011e"+
		"\u0090\2\u0288#\3\2\2\2\u0289\u028b\5\f\7\2\u028a\u0289\3\2\2\2\u028a"+
		"\u028b\3\2\2\2\u028b\u028c\3\2\2\2\u028c\u028d\5\u009eP\2\u028d\u028e"+
		"\7~\2\2\u028e\u028f\7b\2\2\u028f\u0290\5\u009eP\2\u0290\u02a0\3\2\2\2"+
		"\u0291\u0292\5\f\7\2\u0292\u0293\7C\2\2\u0293\u0294\5\u0162\u00b2\2\u0294"+
		"\u0295\7~\2\2\u0295\u0296\7b\2\2\u0296\u0297\5\u009eP\2\u0297\u02a0\3"+
		"\2\2\2\u0298\u029a\5\f\7\2\u0299\u0298\3\2\2\2\u0299\u029a\3\2\2\2\u029a"+
		"\u029b\3\2\2\2\u029b\u029c\7b\2\2\u029c\u02a0\5\u009eP\2\u029d\u029e\7"+
		"b\2\2\u029e\u02a0\5\u00a0Q\2\u029f\u028a\3\2\2\2\u029f\u0291\3\2\2\2\u029f"+
		"\u0299\3\2\2\2\u029f\u029d\3\2\2\2\u02a0%\3\2\2\2\u02a1\u02be\5 \21\2"+
		"\u02a2\u02a3\7w\2\2\u02a3\u02be\5:\36\2\u02a4\u02a5\7x\2\2\u02a5\u02be"+
		"\5:\36\2\u02a6\u02a7\5(\25\2\u02a7\u02a8\5:\36\2\u02a8\u02be\3\2\2\2\u02a9"+
		"\u02aa\7=\2\2\u02aa\u02be\5&\24\2\u02ab\u02ac\7=\2\2\u02ac\u02ad\7T\2"+
		"\2\u02ad\u02ae\5\u0102\u0082\2\u02ae\u02af\7U\2\2\u02af\u02be\3\2\2\2"+
		"\u02b0\u02b1\7=\2\2\u02b1\u02b2\7\u0082\2\2\u02b2\u02b3\7T\2\2\u02b3\u02b4"+
		"\7\u0083\2\2\u02b4\u02be\7U\2\2\u02b5\u02b6\7\n\2\2\u02b6\u02b7\7T\2\2"+
		"\u02b7\u02b8\5\u0102\u0082\2\u02b8\u02b9\7U\2\2\u02b9\u02be\3\2\2\2\u02ba"+
		"\u02be\58\35\2\u02bb\u02be\5*\26\2\u02bc\u02be\5\66\34\2\u02bd\u02a1\3"+
		"\2\2\2\u02bd\u02a2\3\2\2\2\u02bd\u02a4\3\2\2\2\u02bd\u02a6\3\2\2\2\u02bd"+
		"\u02a9\3\2\2\2\u02bd\u02ab\3\2\2\2\u02bd\u02b0\3\2\2\2\u02bd\u02b5\3\2"+
		"\2\2\u02bd\u02ba\3\2\2\2\u02bd\u02bb\3\2\2\2\u02bd\u02bc\3\2\2\2\u02be"+
		"\'\3\2\2\2\u02bf\u02c0\t\3\2\2\u02c0)\3\2\2\2\u02c1\u02c3\7~\2\2\u02c2"+
		"\u02c1\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4\u02c6\7\60"+
		"\2\2\u02c5\u02c7\5,\27\2\u02c6\u02c5\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7"+
		"\u02c8\3\2\2\2\u02c8\u02ca\5.\30\2\u02c9\u02cb\5\64\33\2\u02ca\u02c9\3"+
		"\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02da\3\2\2\2\u02cc\u02ce\7~\2\2\u02cd"+
		"\u02cc\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02d1\7\60"+
		"\2\2\u02d0\u02d2\5,\27\2\u02d1\u02d0\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2"+
		"\u02d3\3\2\2\2\u02d3\u02d4\7T\2\2\u02d4\u02d5\5\u0102\u0082\2\u02d5\u02d7"+
		"\7U\2\2\u02d6\u02d8\5\64\33\2\u02d7\u02d6\3\2\2\2\u02d7\u02d8\3\2\2\2"+
		"\u02d8\u02da\3\2\2\2\u02d9\u02c2\3\2\2\2\u02d9\u02cd\3\2\2\2\u02da+\3"+
		"\2\2\2\u02db\u02dc\7T\2\2\u02dc\u02dd\5\"\22\2\u02dd\u02de\7U\2\2\u02de"+
		"-\3\2\2\2\u02df\u02e1\5\u0098M\2\u02e0\u02e2\5\60\31\2\u02e1\u02e0\3\2"+
		"\2\2\u02e1\u02e2\3\2\2\2\u02e2/\3\2\2\2\u02e3\u02e5\5\u00f8}\2\u02e4\u02e6"+
		"\5\60\31\2\u02e5\u02e4\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6\u02e9\3\2\2\2"+
		"\u02e7\u02e9\5\62\32\2\u02e8\u02e3\3\2\2\2\u02e8\u02e7\3\2\2\2\u02e9\61"+
		"\3\2\2\2\u02ea\u02eb\b\32\1\2\u02eb\u02ec\7V\2\2\u02ec\u02ed\5X-\2\u02ed"+
		"\u02ef\7W\2\2\u02ee\u02f0\5\u00d4k\2\u02ef\u02ee\3\2\2\2\u02ef\u02f0\3"+
		"\2\2\2\u02f0\u02fa\3\2\2\2\u02f1\u02f2\f\3\2\2\u02f2\u02f3\7V\2\2\u02f3"+
		"\u02f4\5Z.\2\u02f4\u02f6\7W\2\2\u02f5\u02f7\5\u00d4k\2\u02f6\u02f5\3\2"+
		"\2\2\u02f6\u02f7\3\2\2\2\u02f7\u02f9\3\2\2\2\u02f8\u02f1\3\2\2\2\u02f9"+
		"\u02fc\3\2\2\2\u02fa\u02f8\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\63\3\2\2"+
		"\2\u02fc\u02fa\3\2\2\2\u02fd\u02ff\7T\2\2\u02fe\u0300\5\"\22\2\u02ff\u02fe"+
		"\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0301\3\2\2\2\u0301\u0304\7U\2\2\u0302"+
		"\u0304\5\u0120\u0091\2\u0303\u02fd\3\2\2\2\u0303\u0302\3\2\2\2\u0304\65"+
		"\3\2\2\2\u0305\u0307\7~\2\2\u0306\u0305\3\2\2\2\u0306\u0307\3\2\2\2\u0307"+
		"\u0308\3\2\2\2\u0308\u0309\7\33\2\2\u0309\u0312\5:\36\2\u030a\u030c\7"+
		"~\2\2\u030b\u030a\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u030d\3\2\2\2\u030d"+
		"\u030e\7\33\2\2\u030e\u030f\7V\2\2\u030f\u0310\7W\2\2\u0310\u0312\5:\36"+
		"\2\u0311\u0306\3\2\2\2\u0311\u030b\3\2\2\2\u0312\67\3\2\2\2\u0313\u0314"+
		"\7\61\2\2\u0314\u0315\7T\2\2\u0315\u0316\5X-\2\u0316\u0317\7U\2\2\u0317"+
		"9\3\2\2\2\u0318\u031f\5&\24\2\u0319\u031a\7T\2\2\u031a\u031b\5\u0102\u0082"+
		"\2\u031b\u031c\7U\2\2\u031c\u031d\5:\36\2\u031d\u031f\3\2\2\2\u031e\u0318"+
		"\3\2\2\2\u031e\u0319\3\2\2\2\u031f;\3\2\2\2\u0320\u0321\b\37\1\2\u0321"+
		"\u0322\5:\36\2\u0322\u032b\3\2\2\2\u0323\u0324\f\4\2\2\u0324\u0325\7\u0081"+
		"\2\2\u0325\u032a\5:\36\2\u0326\u0327\f\3\2\2\u0327\u0328\7z\2\2\u0328"+
		"\u032a\5:\36\2\u0329\u0323\3\2\2\2\u0329\u0326\3\2\2\2\u032a\u032d\3\2"+
		"\2\2\u032b\u0329\3\2\2\2\u032b\u032c\3\2\2\2\u032c=\3\2\2\2\u032d\u032b"+
		"\3\2\2\2\u032e\u032f\b \1\2\u032f\u0330\5<\37\2\u0330\u033c\3\2\2\2\u0331"+
		"\u0332\f\5\2\2\u0332\u0333\7\\\2\2\u0333\u033b\5<\37\2\u0334\u0335\f\4"+
		"\2\2\u0335\u0336\7]\2\2\u0336\u033b\5<\37\2\u0337\u0338\f\3\2\2\u0338"+
		"\u0339\7^\2\2\u0339\u033b\5<\37\2\u033a\u0331\3\2\2\2\u033a\u0334\3\2"+
		"\2\2\u033a\u0337\3\2\2\2\u033b\u033e\3\2\2\2\u033c\u033a\3\2\2\2\u033c"+
		"\u033d\3\2\2\2\u033d?\3\2\2\2\u033e\u033c\3\2\2\2\u033f\u0340\b!\1\2\u0340"+
		"\u0341\5> \2\u0341\u034a\3\2\2\2\u0342\u0343\f\4\2\2\u0343\u0344\7Z\2"+
		"\2\u0344\u0349\5> \2\u0345\u0346\f\3\2\2\u0346\u0347\7[\2\2\u0347\u0349"+
		"\5> \2\u0348\u0342\3\2\2\2\u0348\u0345\3\2\2\2\u0349\u034c\3\2\2\2\u034a"+
		"\u0348\3\2\2\2\u034a\u034b\3\2\2\2\u034bA\3\2\2\2\u034c\u034a\3\2\2\2"+
		"\u034d\u034e\b\"\1\2\u034e\u034f\5@!\2\u034f\u0359\3\2\2\2\u0350\u0351"+
		"\f\4\2\2\u0351\u0352\7o\2\2\u0352\u0358\5@!\2\u0353\u0354\f\3\2\2\u0354"+
		"\u0355\5\u0186\u00c4\2\u0355\u0356\5@!\2\u0356\u0358\3\2\2\2\u0357\u0350"+
		"\3\2\2\2\u0357\u0353\3\2\2\2\u0358\u035b\3\2\2\2\u0359\u0357\3\2\2\2\u0359"+
		"\u035a\3\2\2\2\u035aC\3\2\2\2\u035b\u0359\3\2\2\2\u035c\u035d\b#\1\2\u035d"+
		"\u035e\5B\"\2\u035e\u036d\3\2\2\2\u035f\u0360\f\6\2\2\u0360\u0361\7e\2"+
		"\2\u0361\u036c\5B\"\2\u0362\u0363\f\5\2\2\u0363\u0364\7f\2\2\u0364\u036c"+
		"\5B\"\2\u0365\u0366\f\4\2\2\u0366\u0367\7s\2\2\u0367\u036c\5B\"\2\u0368"+
		"\u0369\f\3\2\2\u0369\u036a\7t\2\2\u036a\u036c\5B\"\2\u036b\u035f\3\2\2"+
		"\2\u036b\u0362\3\2\2\2\u036b\u0365\3\2\2\2\u036b\u0368\3\2\2\2\u036c\u036f"+
		"\3\2\2\2\u036d\u036b\3\2\2\2\u036d\u036e\3\2\2\2\u036eE\3\2\2\2\u036f"+
		"\u036d\3\2\2\2\u0370\u0371\b$\1\2\u0371\u0372\5D#\2\u0372\u037b\3\2\2"+
		"\2\u0373\u0374\f\4\2\2\u0374\u0375\7q\2\2\u0375\u037a\5D#\2\u0376\u0377"+
		"\f\3\2\2\u0377\u0378\7r\2\2\u0378\u037a\5D#\2\u0379\u0373\3\2\2\2\u0379"+
		"\u0376\3\2\2\2\u037a\u037d\3\2\2\2\u037b\u0379\3\2\2\2\u037b\u037c\3\2"+
		"\2\2\u037cG\3\2\2\2\u037d\u037b\3\2\2\2\u037e\u037f\b%\1\2\u037f\u0380"+
		"\5F$\2\u0380\u0386\3\2\2\2\u0381\u0382\f\3\2\2\u0382\u0383\7`\2\2\u0383"+
		"\u0385\5F$\2\u0384\u0381\3\2\2\2\u0385\u0388\3\2\2\2\u0386\u0384\3\2\2"+
		"\2\u0386\u0387\3\2\2\2\u0387I\3\2\2\2\u0388\u0386\3\2\2\2\u0389\u038a"+
		"\b&\1\2\u038a\u038b\5H%\2\u038b\u0391\3\2\2\2\u038c\u038d\f\3\2\2\u038d"+
		"\u038e\7_\2\2\u038e\u0390\5H%\2\u038f\u038c\3\2\2\2\u0390\u0393\3\2\2"+
		"\2\u0391\u038f\3\2\2\2\u0391\u0392\3\2\2\2\u0392K\3\2\2\2\u0393\u0391"+
		"\3\2\2\2\u0394\u0395\b\'\1\2\u0395\u0396\5J&\2\u0396\u039c\3\2\2\2\u0397"+
		"\u0398\f\3\2\2\u0398\u0399\7a\2\2\u0399\u039b\5J&\2\u039a\u0397\3\2\2"+
		"\2\u039b\u039e\3\2\2\2\u039c\u039a\3\2\2\2\u039c\u039d\3\2\2\2\u039dM"+
		"\3\2\2\2\u039e\u039c\3\2\2\2\u039f\u03a0\b(\1\2\u03a0\u03a1\5L\'\2\u03a1"+
		"\u03a7\3\2\2\2\u03a2\u03a3\f\3\2\2\u03a3\u03a4\7u\2\2\u03a4\u03a6\5L\'"+
		"\2\u03a5\u03a2\3\2\2\2\u03a6\u03a9\3\2\2\2\u03a7\u03a5\3\2\2\2\u03a7\u03a8"+
		"\3\2\2\2\u03a8O\3\2\2\2\u03a9\u03a7\3\2\2\2\u03aa\u03ab\b)\1\2\u03ab\u03ac"+
		"\5N(\2\u03ac\u03b2\3\2\2\2\u03ad\u03ae\f\3\2\2\u03ae\u03af\7v\2\2\u03af"+
		"\u03b1\5N(\2\u03b0\u03ad\3\2\2\2\u03b1\u03b4\3\2\2\2\u03b2\u03b0\3\2\2"+
		"\2\u03b2\u03b3\3\2\2\2\u03b3Q\3\2\2\2\u03b4\u03b2\3\2\2\2\u03b5\u03bd"+
		"\5P)\2\u03b6\u03b7\5P)\2\u03b7\u03b8\7|\2\2\u03b8\u03b9\5X-\2\u03b9\u03ba"+
		"\7}\2\2\u03ba\u03bb\5T+\2\u03bb\u03bd\3\2\2\2\u03bc\u03b5\3\2\2\2\u03bc"+
		"\u03b6\3\2\2\2\u03bdS\3\2\2\2\u03be\u03c5\5R*\2\u03bf\u03c0\5P)\2\u03c0"+
		"\u03c1\5V,\2\u03c1\u03c2\5\u011c\u008f\2\u03c2\u03c5\3\2\2\2\u03c3\u03c5"+
		"\5\u017c\u00bf\2\u03c4\u03be\3\2\2\2\u03c4\u03bf\3\2\2\2\u03c4\u03c3\3"+
		"\2\2\2\u03c5U\3\2\2\2\u03c6\u03d2\7d\2\2\u03c7\u03d2\7i\2\2\u03c8\u03d2"+
		"\7j\2\2\u03c9\u03d2\7k\2\2\u03ca\u03d2\7g\2\2\u03cb\u03d2\7h\2\2\u03cc"+
		"\u03d2\5\u0188\u00c5\2\u03cd\u03d2\7p\2\2\u03ce\u03d2\7m\2\2\u03cf\u03d2"+
		"\7l\2\2\u03d0\u03d2\7n\2\2\u03d1\u03c6\3\2\2\2\u03d1\u03c7\3\2\2\2\u03d1"+
		"\u03c8\3\2\2\2\u03d1\u03c9\3\2\2\2\u03d1\u03ca\3\2\2\2\u03d1\u03cb\3\2"+
		"\2\2\u03d1\u03cc\3\2\2\2\u03d1\u03cd\3\2\2\2\u03d1\u03ce\3\2\2\2\u03d1"+
		"\u03cf\3\2\2\2\u03d1\u03d0\3\2\2\2\u03d2W\3\2\2\2\u03d3\u03d4\b-\1\2\u03d4"+
		"\u03d5\5T+\2\u03d5\u03db\3\2\2\2\u03d6\u03d7\f\3\2\2\u03d7\u03d8\7y\2"+
		"\2\u03d8\u03da\5T+\2\u03d9\u03d6\3\2\2\2\u03da\u03dd\3\2\2\2\u03db\u03d9"+
		"\3\2\2\2\u03db\u03dc\3\2\2\2\u03dcY\3\2\2\2\u03dd\u03db\3\2\2\2\u03de"+
		"\u03df\5R*\2\u03df[\3\2\2\2\u03e0\u03e6\n\4\2\2\u03e1\u03e2\7T\2\2\u03e2"+
		"\u03e3\5\\/\2\u03e3\u03e4\7U\2\2\u03e4\u03e6\3\2\2\2\u03e5\u03e0\3\2\2"+
		"\2\u03e5\u03e1\3\2\2\2\u03e6\u03e9\3\2\2\2\u03e7\u03e5\3\2\2\2\u03e7\u03e8"+
		"\3\2\2\2\u03e8]\3\2\2\2\u03e9\u03e7\3\2\2\2\u03ea\u0409\5`\61\2\u03eb"+
		"\u03ed\5\u00d4k\2\u03ec\u03eb\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed\u03ee"+
		"\3\2\2\2\u03ee\u0409\5b\62\2\u03ef\u03f1\5\u00d4k\2\u03f0\u03ef\3\2\2"+
		"\2\u03f0\u03f1\3\2\2\2\u03f1\u03f2\3\2\2\2\u03f2\u0409\5d\63\2\u03f3\u03f5"+
		"\5\u00d4k\2\u03f4\u03f3\3\2\2\2\u03f4\u03f5\3\2\2\2\u03f5\u03f6\3\2\2"+
		"\2\u03f6\u0409\5h\65\2\u03f7\u03f9\5\u00d4k\2\u03f8\u03f7\3\2\2\2\u03f8"+
		"\u03f9\3\2\2\2\u03f9\u03fa\3\2\2\2\u03fa\u0409\5l\67\2\u03fb\u03fd\5\u00d4"+
		"k\2\u03fc\u03fb\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd\u03fe\3\2\2\2\u03fe"+
		"\u0409\5t;\2\u03ff\u0401\5\u00d4k\2\u0400\u03ff\3\2\2\2\u0400\u0401\3"+
		"\2\2\2\u0401\u0402\3\2\2\2\u0402\u0409\5v<\2\u0403\u0409\5x=\2\u0404\u0406"+
		"\5\u00d4k\2\u0405\u0404\3\2\2\2\u0405\u0406\3\2\2\2\u0406\u0407\3\2\2"+
		"\2\u0407\u0409\5\u0172\u00ba\2\u0408\u03ea\3\2\2\2\u0408\u03ec\3\2\2\2"+
		"\u0408\u03f0\3\2\2\2\u0408\u03f4\3\2\2\2\u0408\u03f8\3\2\2\2\u0408\u03fc"+
		"\3\2\2\2\u0408\u0400\3\2\2\2\u0408\u0403\3\2\2\2\u0408\u0405\3\2\2\2\u0409"+
		"_\3\2\2\2\u040a\u040c\5\u00d4k\2\u040b\u040a\3\2\2\2\u040b\u040c\3\2\2"+
		"\2\u040c\u040d\3\2\2\2\u040d\u040e\7\u0083\2\2\u040e\u040f\7}\2\2\u040f"+
		"\u041f\5^\60\2\u0410\u0412\5\u00d4k\2\u0411\u0410\3\2\2\2\u0411\u0412"+
		"\3\2\2\2\u0412\u0413\3\2\2\2\u0413\u0414\7\17\2\2\u0414\u0415\5Z.\2\u0415"+
		"\u0416\7}\2\2\u0416\u0417\5^\60\2\u0417\u041f\3\2\2\2\u0418\u041a\5\u00d4"+
		"k\2\u0419\u0418\3\2\2\2\u0419\u041a\3\2\2\2\u041a\u041b\3\2\2\2\u041b"+
		"\u041c\7\32\2\2\u041c\u041d\7}\2\2\u041d\u041f\5^\60\2\u041e\u040b\3\2"+
		"\2\2\u041e\u0411\3\2\2\2\u041e\u0419\3\2\2\2\u041fa\3\2\2\2\u0420\u0422"+
		"\5X-\2\u0421\u0420\3\2\2\2\u0421\u0422\3\2\2\2\u0422\u0423\3\2\2\2\u0423"+
		"\u0424\7\177\2\2\u0424c\3\2\2\2\u0425\u0427\7X\2\2\u0426\u0428\5f\64\2"+
		"\u0427\u0426\3\2\2\2\u0427\u0428\3\2\2\2\u0428\u0429\3\2\2\2\u0429\u042a"+
		"\7Y\2\2\u042ae\3\2\2\2\u042b\u042c\b\64\1\2\u042c\u042d\5^\60\2\u042d"+
		"\u0432\3\2\2\2\u042e\u042f\f\3\2\2\u042f\u0431\5^\60\2\u0430\u042e\3\2"+
		"\2\2\u0431\u0434\3\2\2\2\u0432\u0430\3\2\2\2\u0432\u0433\3\2\2\2\u0433"+
		"g\3\2\2\2\u0434\u0432\3\2\2\2\u0435\u0436\7*\2\2\u0436\u0437\7T\2\2\u0437"+
		"\u0438\5\\/\2\u0438\u0439\7U\2\2\u0439\u043a\5^\60\2\u043a\u044a\3\2\2"+
		"\2\u043b\u043c\7*\2\2\u043c\u043d\7T\2\2\u043d\u043e\5\\/\2\u043e\u043f"+
		"\7U\2\2\u043f\u0440\5^\60\2\u0440\u0441\7\37\2\2\u0441\u0442\5^\60\2\u0442"+
		"\u044a\3\2\2\2\u0443\u0444\7B\2\2\u0444\u0445\7T\2\2\u0445\u0446\5\\/"+
		"\2\u0446\u0447\7U\2\2\u0447\u0448\5^\60\2\u0448\u044a\3\2\2\2\u0449\u0435"+
		"\3\2\2\2\u0449\u043b\3\2\2\2\u0449\u0443\3\2\2\2\u044ai\3\2\2\2\u044b"+
		"\u045c\5X-\2\u044c\u044e\5\u00d4k\2\u044d\u044c\3\2\2\2\u044d\u044e\3"+
		"\2\2\2\u044e\u044f\3\2\2\2\u044f\u0450\5\u008cG\2\u0450\u0451\5\u00ee"+
		"x\2\u0451\u0452\7d\2\2\u0452\u0453\5\u011c\u008f\2\u0453\u045c\3\2\2\2"+
		"\u0454\u0456\5\u00d4k\2\u0455\u0454\3\2\2\2\u0455\u0456\3\2\2\2\u0456"+
		"\u0457\3\2\2\2\u0457\u0458\5\u008cG\2\u0458\u0459\5\u00eex\2\u0459\u045a"+
		"\5\u0120\u0091\2\u045a\u045c\3\2\2\2\u045b\u044b\3\2\2\2\u045b\u044d\3"+
		"\2\2\2\u045b\u0455\3\2\2\2\u045ck\3\2\2\2\u045d\u045e\7S\2\2\u045e\u045f"+
		"\7T\2\2\u045f\u0460\5\\/\2\u0460\u0461\7U\2\2\u0461\u0462\5^\60\2\u0462"+
		"\u0472\3\2\2\2\u0463\u0464\7\34\2\2\u0464\u0465\5^\60\2\u0465\u0466\7"+
		"S\2\2\u0466\u0467\7T\2\2\u0467\u0468\5\\/\2\u0468\u0469\7U\2\2\u0469\u046a"+
		"\7\177\2\2\u046a\u0472\3\2\2\2\u046b\u046c\7\'\2\2\u046c\u046d\7T\2\2"+
		"\u046d\u046e\5\\/\2\u046e\u046f\7U\2\2\u046f\u0470\5^\60\2\u0470\u0472"+
		"\3\2\2\2\u0471\u045d\3\2\2\2\u0471\u0463\3\2\2\2\u0471\u046b\3\2\2\2\u0472"+
		"m\3\2\2\2\u0473\u0476\5b\62\2\u0474\u0476\5\u0082B\2\u0475\u0473\3\2\2"+
		"\2\u0475\u0474\3\2\2\2\u0476o\3\2\2\2\u0477\u0479\5\u00d4k\2\u0478\u0477"+
		"\3\2\2\2\u0478\u0479\3\2\2\2\u0479\u047a\3\2\2\2\u047a\u047b\5\u008cG"+
		"\2\u047b\u047c\5\u00eex\2\u047cq\3\2\2\2\u047d\u0480\5X-\2\u047e\u0480"+
		"\5\u0120\u0091\2\u047f\u047d\3\2\2\2\u047f\u047e\3\2\2\2\u0480s\3\2\2"+
		"\2\u0481\u0482\7\16\2\2\u0482\u0492\7\177\2\2\u0483\u0484\7\30\2\2\u0484"+
		"\u0492\7\177\2\2\u0485\u0487\7:\2\2\u0486\u0488\5X-\2\u0487\u0486\3\2"+
		"\2\2\u0487\u0488\3\2\2\2\u0488\u0489\3\2\2\2\u0489\u0492\7\177\2\2\u048a"+
		"\u048b\7:\2\2\u048b\u048c\5\u0120\u0091\2\u048c\u048d\7\177\2\2\u048d"+
		"\u0492\3\2\2\2\u048e\u048f\7)\2\2\u048f\u0490\7\u0083\2\2\u0490\u0492"+
		"\7\177\2\2\u0491\u0481\3\2\2\2\u0491\u0483\3\2\2\2\u0491\u0485\3\2\2\2"+
		"\u0491\u048a\3\2\2\2\u0491\u048e\3\2\2\2\u0492u\3\2\2\2\u0493\u0498\7"+
		"\u0083\2\2\u0494\u0495\7T\2\2\u0495\u0496\5\\/\2\u0496\u0497\7U\2\2\u0497"+
		"\u0499\3\2\2\2\u0498\u0494\3\2\2\2\u0498\u0499\3\2\2\2\u0499\u049a\3\2"+
		"\2\2\u049a\u049b\5^\60\2\u049bw\3\2\2\2\u049c\u049d\5~@\2\u049dy\3\2\2"+
		"\2\u049e\u049f\b>\1\2\u049f\u04a0\5|?\2\u04a0\u04a5\3\2\2\2\u04a1\u04a2"+
		"\f\3\2\2\u04a2\u04a4\5|?\2\u04a3\u04a1\3\2\2\2\u04a4\u04a7\3\2\2\2\u04a5"+
		"\u04a3\3\2\2\2\u04a5\u04a6\3\2\2\2\u04a6{\3\2\2\2\u04a7\u04a5\3\2\2\2"+
		"\u04a8\u04b2\5~@\2\u04a9\u04b2\5\u0114\u008b\2\u04aa\u04b2\5\u015a\u00ae"+
		"\2\u04ab\u04b2\5\u016e\u00b8\2\u04ac\u04b2\5\u0170\u00b9\2\u04ad\u04b2"+
		"\5\u00d2j\2\u04ae\u04b2\5\u00ba^\2\u04af\u04b2\5\u0086D\2\u04b0\u04b2"+
		"\5\u0088E\2\u04b1\u04a8\3\2\2\2\u04b1\u04a9\3\2\2\2\u04b1\u04aa\3\2\2"+
		"\2\u04b1\u04ab\3\2\2\2\u04b1\u04ac\3\2\2\2\u04b1\u04ad\3\2\2\2\u04b1\u04ae"+
		"\3\2\2\2\u04b1\u04af\3\2\2\2\u04b1\u04b0\3\2\2\2\u04b2}\3\2\2\2\u04b3"+
		"\u04bc\5\u0082B\2\u04b4\u04bc\5\u00d0i\2\u04b5\u04bc\5\u00c8e\2\u04b6"+
		"\u04bc\5\u00ccg\2\u04b7\u04bc\5\u00ceh\2\u04b8\u04bc\5\u0084C\2\u04b9"+
		"\u04bc\5\u0080A\2\u04ba\u04bc\5\u00aaV\2\u04bb\u04b3\3\2\2\2\u04bb\u04b4"+
		"\3\2\2\2\u04bb\u04b5\3\2\2\2\u04bb\u04b6\3\2\2\2\u04bb\u04b7\3\2\2\2\u04bb"+
		"\u04b8\3\2\2\2\u04bb\u04b9\3\2\2\2\u04bb\u04ba\3\2\2\2\u04bc\177\3\2\2"+
		"\2\u04bd\u04be\7N\2\2\u04be\u04c0\7\u0083\2\2\u04bf\u04c1\5\u00d4k\2\u04c0"+
		"\u04bf\3\2\2\2\u04c0\u04c1\3\2\2\2\u04c1\u04c2\3\2\2\2\u04c2\u04c3\7d"+
		"\2\2\u04c3\u04c4\5\u0102\u0082\2\u04c4\u04c5\7\177\2\2\u04c5\u0081\3\2"+
		"\2\2\u04c6\u04c8\5\u008cG\2\u04c7\u04c6\3\2\2\2\u04c7\u04c8\3\2\2\2\u04c8"+
		"\u04ca\3\2\2\2\u04c9\u04cb\5\u00eav\2\u04ca\u04c9\3\2\2\2\u04ca\u04cb"+
		"\3\2\2\2\u04cb\u04cc\3\2\2\2\u04cc\u04d5\7\177\2\2\u04cd\u04cf\5\u00d4"+
		"k\2\u04ce\u04d0\5\u008cG\2\u04cf\u04ce\3\2\2\2\u04cf\u04d0\3\2\2\2\u04d0"+
		"\u04d1\3\2\2\2\u04d1\u04d2\5\u00eav\2\u04d2\u04d3\7\177\2\2\u04d3\u04d5"+
		"\3\2\2\2\u04d4\u04c7\3\2\2\2\u04d4\u04cd\3\2\2\2\u04d5\u0083\3\2\2\2\u04d6"+
		"\u04d7\7?\2\2\u04d7\u04d8\7T\2\2\u04d8\u04d9\5Z.\2\u04d9\u04da\7y\2\2"+
		"\u04da\u04db\7\u008c\2\2\u04db\u04dc\7U\2\2\u04dc\u04dd\7\177\2\2\u04dd"+
		"\u0085\3\2\2\2\u04de\u04df\7\177\2\2\u04df\u0087\3\2\2\2\u04e0\u04e1\5"+
		"\u00d4k\2\u04e1\u04e2\7\177\2\2\u04e2\u0089\3\2\2\2\u04e3\u04ea\5\u008e"+
		"H\2\u04e4\u04ea\5\u0094K\2\u04e5\u04ea\5\u0090I\2\u04e6\u04ea\7(\2\2\u04e7"+
		"\u04ea\7I\2\2\u04e8\u04ea\7\26\2\2\u04e9\u04e3\3\2\2\2\u04e9\u04e4\3\2"+
		"\2\2\u04e9\u04e5\3\2\2\2\u04e9\u04e6\3\2\2\2\u04e9\u04e7\3\2\2\2\u04e9"+
		"\u04e8\3\2\2\2\u04ea\u008b\3\2\2\2\u04eb\u04ed\5\u008aF\2\u04ec\u04ee"+
		"\5\u00d4k\2\u04ed\u04ec\3\2\2\2\u04ed\u04ee\3\2\2\2\u04ee\u04f3\3\2\2"+
		"\2\u04ef\u04f0\5\u008aF\2\u04f0\u04f1\5\u008cG\2\u04f1\u04f3\3\2\2\2\u04f2"+
		"\u04eb\3\2\2\2\u04f2\u04ef\3\2\2\2\u04f3\u008d\3\2\2\2\u04f4\u04f5\t\5"+
		"\2\2\u04f5\u008f\3\2\2\2\u04f6\u04f7\t\6\2\2\u04f7\u0091\3\2\2\2\u04f8"+
		"\u04f9\7\u0083\2\2\u04f9\u0093\3\2\2\2\u04fa\u04fe\5\u0096L\2\u04fb\u04fe"+
		"\5\u0124\u0093\2\u04fc\u04fe\5\u00a6T\2\u04fd\u04fa\3\2\2\2\u04fd\u04fb"+
		"\3\2\2\2\u04fd\u04fc\3\2\2\2\u04fe\u0095\3\2\2\2\u04ff\u0504\5\u009cO"+
		"\2\u0500\u0504\5\u00a2R\2\u0501\u0504\5\u016c\u00b7\2\u0502\u0504\5\u00fc"+
		"\177\2\u0503\u04ff\3\2\2\2\u0503\u0500\3\2\2\2\u0503\u0501\3\2\2\2\u0503"+
		"\u0502\3\2\2\2\u0504\u0097\3\2\2\2\u0505\u0507\5\u0094K\2\u0506\u0508"+
		"\5\u00d4k\2\u0507\u0506\3\2\2\2\u0507\u0508\3\2\2\2\u0508\u050d\3\2\2"+
		"\2\u0509\u050a\5\u0094K\2\u050a\u050b\5\u0098M\2\u050b\u050d\3\2\2\2\u050c"+
		"\u0505\3\2\2\2\u050c\u0509\3\2\2\2\u050d\u0099\3\2\2\2\u050e\u0510\5\u0096"+
		"L\2\u050f\u0511\5\u00d4k\2\u0510\u050f\3\2\2\2\u0510\u0511\3\2\2\2\u0511"+
		"\u0516\3\2\2\2\u0512\u0513\5\u0096L\2\u0513\u0514\5\u009aN\2\u0514\u0516"+
		"\3\2\2\2\u0515\u050e\3\2\2\2\u0515\u0512\3\2\2\2\u0516\u009b\3\2\2\2\u0517"+
		"\u0519\5\f\7\2\u0518\u0517\3\2\2\2\u0518\u0519\3\2\2\2\u0519\u051a\3\2"+
		"\2\2\u051a\u052f\5\u009eP\2\u051b\u051c\5\f\7\2\u051c\u051d\7C\2\2\u051d"+
		"\u051e\5\u0162\u00b2\2\u051e\u052f\3\2\2\2\u051f\u052f\7\21\2\2\u0520"+
		"\u052f\7\22\2\2\u0521\u052f\7\23\2\2\u0522\u052f\7R\2\2\u0523\u052f\7"+
		"\r\2\2\u0524\u052f\7;\2\2\u0525\u052f\7,\2\2\u0526\u052f\7-\2\2\u0527"+
		"\u052f\7<\2\2\u0528\u052f\7M\2\2\u0529\u052f\7&\2\2\u052a\u052f\7\35\2"+
		"\2\u052b\u052f\7P\2\2\u052c\u052f\7\f\2\2\u052d\u052f\5\u00a0Q\2\u052e"+
		"\u0518\3\2\2\2\u052e\u051b\3\2\2\2\u052e\u051f\3\2\2\2\u052e\u0520\3\2"+
		"\2\2\u052e\u0521\3\2\2\2\u052e\u0522\3\2\2\2\u052e\u0523\3\2\2\2\u052e"+
		"\u0524\3\2\2\2\u052e\u0525\3\2\2\2\u052e\u0526\3\2\2\2\u052e\u0527\3\2"+
		"\2\2\u052e\u0528\3\2\2\2\u052e\u0529\3\2\2\2\u052e\u052a\3\2\2\2\u052e"+
		"\u052b\3\2\2\2\u052e\u052c\3\2\2\2\u052e\u052d\3\2\2\2\u052f\u009d\3\2"+
		"\2\2\u0530\u0535\5\u0122\u0092\2\u0531\u0535\5\u00a4S\2\u0532\u0535\5"+
		"\u0092J\2\u0533\u0535\5\u0162\u00b2\2\u0534\u0530\3\2\2\2\u0534\u0531"+
		"\3\2\2\2\u0534\u0532\3\2\2\2\u0534\u0533\3\2\2\2\u0535\u009f\3\2\2\2\u0536"+
		"\u0537\7\31\2\2\u0537\u0538\7T\2\2\u0538\u0539\5X-\2\u0539\u053a\7U\2"+
		"\2\u053a\u0540\3\2\2\2\u053b\u053c\7\31\2\2\u053c\u053d\7T\2\2\u053d\u053e"+
		"\7\f\2\2\u053e\u0540\7U\2\2\u053f\u0536\3\2\2\2\u053f\u053b\3\2\2\2\u0540"+
		"\u00a1\3\2\2\2\u0541\u0543\5\u012c\u0097\2\u0542\u0544\5\u00d4k\2\u0543"+
		"\u0542\3\2\2\2\u0543\u0544\3\2\2\2\u0544\u0546\3\2\2\2\u0545\u0547\5\f"+
		"\7\2\u0546\u0545\3\2\2\2\u0546\u0547\3\2\2\2\u0547\u0548\3\2\2\2\u0548"+
		"\u0549\7\u0083\2\2\u0549\u055a\3\2\2\2\u054a\u054b\5\u012c\u0097\2\u054b"+
		"\u054c\5\u0162\u00b2\2\u054c\u055a\3\2\2\2\u054d\u054e\5\u012c\u0097\2"+
		"\u054e\u0550\5\f\7\2\u054f\u0551\7C\2\2\u0550\u054f\3\2\2\2\u0550\u0551"+
		"\3\2\2\2\u0551\u0552\3\2\2\2\u0552\u0553\5\u0162\u00b2\2\u0553\u055a\3"+
		"\2\2\2\u0554\u0556\7 \2\2\u0555\u0557\5\f\7\2\u0556\u0555\3\2\2\2\u0556"+
		"\u0557\3\2\2\2\u0557\u0558\3\2\2\2\u0558\u055a\7\u0083\2\2\u0559\u0541"+
		"\3\2\2\2\u0559\u054a\3\2\2\2\u0559\u054d\3\2\2\2\u0559\u0554\3\2\2\2\u055a"+
		"\u00a3\3\2\2\2\u055b\u055c\7\u0083\2\2\u055c\u00a5\3\2\2\2\u055d\u055e"+
		"\5\u00a8U\2\u055e\u0560\7X\2\2\u055f\u0561\5\u00b0Y\2\u0560\u055f\3\2"+
		"\2\2\u0560\u0561\3\2\2\2\u0561\u0562\3\2\2\2\u0562\u0563\7Y\2\2\u0563"+
		"\u056b\3\2\2\2\u0564\u0565\5\u00a8U\2\u0565\u0566\7X\2\2\u0566\u0567\5"+
		"\u00b0Y\2\u0567\u0568\7y\2\2\u0568\u0569\7Y\2\2\u0569\u056b\3\2\2\2\u056a"+
		"\u055d\3\2\2\2\u056a\u0564\3\2\2\2\u056b\u00a7\3\2\2\2\u056c\u056e\5\u00ac"+
		"W\2\u056d\u056f\5\u00d4k\2\u056e\u056d\3\2\2\2\u056e\u056f\3\2\2\2\u056f"+
		"\u0571\3\2\2\2\u0570\u0572\7\u0083\2\2\u0571\u0570\3\2\2\2\u0571\u0572"+
		"\3\2\2\2\u0572\u0574\3\2\2\2\u0573\u0575\5\u00aeX\2\u0574\u0573\3\2\2"+
		"\2\u0574\u0575\3\2\2\2\u0575\u0580\3\2\2\2\u0576\u0578\5\u00acW\2\u0577"+
		"\u0579\5\u00d4k\2\u0578\u0577\3\2\2\2\u0578\u0579\3\2\2\2\u0579\u057a"+
		"\3\2\2\2\u057a\u057b\5\f\7\2\u057b\u057d\7\u0083\2\2\u057c\u057e\5\u00ae"+
		"X\2\u057d\u057c\3\2\2\2\u057d\u057e\3\2\2\2\u057e\u0580\3\2\2\2\u057f"+
		"\u056c\3\2\2\2\u057f\u0576\3\2\2\2\u0580\u00a9\3\2\2\2\u0581\u0583\5\u00ac"+
		"W\2\u0582\u0584\5\u00d4k\2\u0583\u0582\3\2\2\2\u0583\u0584\3\2\2\2\u0584"+
		"\u0585\3\2\2\2\u0585\u0587\7\u0083\2\2\u0586\u0588\5\u00aeX\2\u0587\u0586"+
		"\3\2\2\2\u0587\u0588\3\2\2\2\u0588\u0589\3\2\2\2\u0589\u058a\7\177\2\2"+
		"\u058a\u00ab\3\2\2\2\u058b\u0591\7 \2\2\u058c\u058d\7 \2\2\u058d\u0591"+
		"\7\24\2\2\u058e\u058f\7 \2\2\u058f\u0591\7A\2\2\u0590\u058b\3\2\2\2\u0590"+
		"\u058c\3\2\2\2\u0590\u058e\3\2\2\2\u0591\u00ad\3\2\2\2\u0592\u0593\7}"+
		"\2\2\u0593\u0594\5\u0098M\2\u0594\u00af\3\2\2\2\u0595\u0596\bY\1\2\u0596"+
		"\u0597\5\u00b2Z\2\u0597\u059d\3\2\2\2\u0598\u0599\f\3\2\2\u0599\u059a"+
		"\7y\2\2\u059a\u059c\5\u00b2Z\2\u059b\u0598\3\2\2\2\u059c\u059f\3\2\2\2"+
		"\u059d\u059b\3\2\2\2\u059d\u059e\3\2\2\2\u059e\u00b1\3\2\2\2\u059f\u059d"+
		"\3\2\2\2\u05a0\u05a6\5\u00b4[\2\u05a1\u05a2\5\u00b4[\2\u05a2\u05a3\7d"+
		"\2\2\u05a3\u05a4\5Z.\2\u05a4\u05a6\3\2\2\2\u05a5\u05a0\3\2\2\2\u05a5\u05a1"+
		"\3\2\2\2\u05a6\u00b3\3\2\2\2\u05a7\u05a8\7\u0083\2\2\u05a8\u00b5\3\2\2"+
		"\2\u05a9\u05ac\5\u00b8]\2\u05aa\u05ac\5\u00c6d\2\u05ab\u05a9\3\2\2\2\u05ab"+
		"\u05aa\3\2\2\2\u05ac\u00b7\3\2\2\2\u05ad\u05ae\7\u0083\2\2\u05ae\u00b9"+
		"\3\2\2\2\u05af\u05b2\5\u00bc_\2\u05b0\u05b2\5\u00c2b\2\u05b1\u05af\3\2"+
		"\2\2\u05b1\u05b0\3\2\2\2\u05b2\u00bb\3\2\2\2\u05b3\u05b6\5\u00be`\2\u05b4"+
		"\u05b6\5\u00c0a\2\u05b5\u05b3\3\2\2\2\u05b5\u05b4\3\2\2\2\u05b6\u00bd"+
		"\3\2\2\2\u05b7\u05b9\7+\2\2\u05b8\u05b7\3\2\2\2\u05b8\u05b9\3\2\2\2\u05b9"+
		"\u05ba\3\2\2\2\u05ba\u05bb\7/\2\2\u05bb\u05bc\7\u0083\2\2\u05bc\u05bd"+
		"\7X\2\2\u05bd\u05be\5\u00c4c\2\u05be\u05bf\7Y\2\2\u05bf\u00bf\3\2\2\2"+
		"\u05c0\u05c2\7+\2\2\u05c1\u05c0\3\2\2\2\u05c1\u05c2\3\2\2\2\u05c2\u05c3"+
		"\3\2\2\2\u05c3\u05c4\7/\2\2\u05c4\u05c5\5\u00b8]\2\u05c5\u05c6\7X\2\2"+
		"\u05c6\u05c7\5\u00c4c\2\u05c7\u05c8\7Y\2\2\u05c8\u00c1\3\2\2\2\u05c9\u05cb"+
		"\7+\2\2\u05ca\u05c9\3\2\2\2\u05ca\u05cb\3\2\2\2\u05cb\u05cc\3\2\2\2\u05cc"+
		"\u05cd\7/\2\2\u05cd\u05ce\7X\2\2\u05ce\u05cf\5\u00c4c\2\u05cf\u05d0\7"+
		"Y\2\2\u05d0\u00c3\3\2\2\2\u05d1\u05d3\5z>\2\u05d2\u05d1\3\2\2\2\u05d2"+
		"\u05d3\3\2\2\2\u05d3\u00c5\3\2\2\2\u05d4\u05d5\7\u0083\2\2\u05d5\u00c7"+
		"\3\2\2\2\u05d6\u05d7\7/\2\2\u05d7\u05d8\7\u0083\2\2\u05d8\u05d9\7d\2\2"+
		"\u05d9\u05da\5\u00caf\2\u05da\u05db\7\177\2\2\u05db\u00c9\3\2\2\2\u05dc"+
		"\u05de\5\f\7\2\u05dd\u05dc\3\2\2\2\u05dd\u05de\3\2\2\2\u05de\u05df\3\2"+
		"\2\2\u05df\u05e0\5\u00b6\\\2\u05e0\u00cb\3\2\2\2\u05e1\u05e3\7N\2\2\u05e2"+
		"\u05e4\7K\2\2\u05e3\u05e2\3\2\2\2\u05e3\u05e4\3\2\2\2\u05e4\u05e5\3\2"+
		"\2\2\u05e5\u05e6\5\f\7\2\u05e6\u05e7\5\b\5\2\u05e7\u05e8\7\177\2\2\u05e8"+
		"\u05ef\3\2\2\2\u05e9\u05ea\7N\2\2\u05ea\u05eb\7~\2\2\u05eb\u05ec\5\b\5"+
		"\2\u05ec\u05ed\7\177\2\2\u05ed\u05ef\3\2\2\2\u05ee\u05e1\3\2\2\2\u05ee"+
		"\u05e9\3\2\2\2\u05ef\u00cd\3\2\2\2\u05f0\u05f2\5\u00d4k\2\u05f1\u05f0"+
		"\3\2\2\2\u05f1\u05f2\3\2\2\2\u05f2\u05f3\3\2\2\2\u05f3\u05f4\7N\2\2\u05f4"+
		"\u05f6\7/\2\2\u05f5\u05f7\5\f\7\2\u05f6\u05f5\3\2\2\2\u05f6\u05f7\3\2"+
		"\2\2\u05f7\u05f8\3\2\2\2\u05f8\u05f9\5\u00b6\\\2\u05f9\u05fa\7\177\2\2"+
		"\u05fa\u00cf\3\2\2\2\u05fb\u05fc\7\13\2\2\u05fc\u05fd\7T\2\2\u05fd\u05fe"+
		"\7\u008c\2\2\u05fe\u05ff\7U\2\2\u05ff\u0600\7\177\2\2\u0600\u00d1\3\2"+
		"\2\2\u0601\u0602\7#\2\2\u0602\u0603\7\u008c\2\2\u0603\u0605\7X\2\2\u0604"+
		"\u0606\5z>\2\u0605\u0604\3\2\2\2\u0605\u0606\3\2\2\2\u0606\u0607\3\2\2"+
		"\2\u0607\u060c\7Y\2\2\u0608\u0609\7#\2\2\u0609\u060a\7\u008c\2\2\u060a"+
		"\u060c\5|?\2\u060b\u0601\3\2\2\2\u060b\u0608\3\2\2\2\u060c\u00d3\3\2\2"+
		"\2\u060d\u060e\bk\1\2\u060e\u060f\5\u00d6l\2\u060f\u0614\3\2\2\2\u0610"+
		"\u0611\f\3\2\2\u0611\u0613\5\u00d6l\2\u0612\u0610\3\2\2\2\u0613\u0616"+
		"\3\2\2\2\u0614\u0612\3\2\2\2\u0614\u0615\3\2\2\2\u0615\u00d5\3\2\2\2\u0616"+
		"\u0614\3\2\2\2\u0617\u0618\7V\2\2\u0618\u0619\7V\2\2\u0619\u061a\5\u00da"+
		"n\2\u061a\u061b\7W\2\2\u061b\u061c\7W\2\2\u061c\u061f\3\2\2\2\u061d\u061f"+
		"\5\u00d8m\2\u061e\u0617\3\2\2\2\u061e\u061d\3\2\2\2\u061f\u00d7\3\2\2"+
		"\2\u0620\u0621\7\t\2\2\u0621\u0622\7T\2\2\u0622\u0624\5\u0102\u0082\2"+
		"\u0623\u0625\7\u0082\2\2\u0624\u0623\3\2\2\2\u0624\u0625\3\2\2\2\u0625"+
		"\u0626\3\2\2\2\u0626\u0627\7U\2\2\u0627\u0631\3\2\2\2\u0628\u0629\7\t"+
		"\2\2\u0629\u062a\7T\2\2\u062a\u062c\5Z.\2\u062b\u062d\7\u0082\2\2\u062c"+
		"\u062b\3\2\2\2\u062c\u062d\3\2\2\2\u062d\u062e\3\2\2\2\u062e\u062f\7U"+
		"\2\2\u062f\u0631\3\2\2\2\u0630\u0620\3\2\2\2\u0630\u0628\3\2\2\2\u0631"+
		"\u00d9\3\2\2\2\u0632\u0634\bn\1\2\u0633\u0635\5\u00dco\2\u0634\u0633\3"+
		"\2\2\2\u0634\u0635\3\2\2\2\u0635\u063a\3\2\2\2\u0636\u0637\5\u00dco\2"+
		"\u0637\u0638\7\u0082\2\2\u0638\u063a\3\2\2\2\u0639\u0632\3\2\2\2\u0639"+
		"\u0636\3\2\2\2\u063a\u0647\3\2\2\2\u063b\u063c\f\5\2\2\u063c\u063e\7y"+
		"\2\2\u063d\u063f\5\u00dco\2\u063e\u063d\3\2\2\2\u063e\u063f\3\2\2\2\u063f"+
		"\u0646\3\2\2\2\u0640\u0641\f\3\2\2\u0641\u0642\7y\2\2\u0642\u0643\5\u00dc"+
		"o\2\u0643\u0644\7\u0082\2\2\u0644\u0646\3\2\2\2\u0645\u063b\3\2\2\2\u0645"+
		"\u0640\3\2\2\2\u0646\u0649\3\2\2\2\u0647\u0645\3\2\2\2\u0647\u0648\3\2"+
		"\2\2\u0648\u00db\3\2\2\2\u0649\u0647\3\2\2\2\u064a\u064c\5\u00dep\2\u064b"+
		"\u064d\5\u00e4s\2\u064c\u064b\3\2\2\2\u064c\u064d\3\2\2\2\u064d\u00dd"+
		"\3\2\2\2\u064e\u0651\7\u0083\2\2\u064f\u0651\5\u00e0q\2\u0650\u064e\3"+
		"\2\2\2\u0650\u064f\3\2\2\2\u0651\u00df\3\2\2\2\u0652\u0653\5\u00e2r\2"+
		"\u0653\u0654\7~\2\2\u0654\u0655\7\u0083\2\2\u0655\u00e1\3\2\2\2\u0656"+
		"\u0657\7\u0083\2\2\u0657\u00e3\3\2\2\2\u0658\u0659\7T\2\2\u0659\u065a"+
		"\5\u00e6t\2\u065a\u065b\7U\2\2\u065b\u00e5\3\2\2\2\u065c\u065e\bt\1\2"+
		"\u065d\u065f\5\u00e8u\2\u065e\u065d\3\2\2\2\u065e\u065f\3\2\2\2\u065f"+
		"\u0664\3\2\2\2\u0660\u0661\f\3\2\2\u0661\u0663\5\u00e8u\2\u0662\u0660"+
		"\3\2\2\2\u0663\u0666\3\2\2\2\u0664\u0662\3\2\2\2\u0664\u0665\3\2\2\2\u0665"+
		"\u00e7\3\2\2\2\u0666\u0664\3\2\2\2\u0667\u0668\7T\2\2\u0668\u0669\5\u00e6"+
		"t\2\u0669\u066a\7U\2\2\u066a\u0674\3\2\2\2\u066b\u066c\7V\2\2\u066c\u066d"+
		"\5\u00e6t\2\u066d\u066e\7W\2\2\u066e\u0674\3\2\2\2\u066f\u0670\7X\2\2"+
		"\u0670\u0671\5\u00e6t\2\u0671\u0672\7Y\2\2\u0672\u0674\3\2\2\2\u0673\u0667"+
		"\3\2\2\2\u0673\u066b\3\2\2\2\u0673\u066f\3\2\2\2\u0674\u00e9\3\2\2\2\u0675"+
		"\u0676\bv\1\2\u0676\u0677\5\u00ecw\2\u0677\u067d\3\2\2\2\u0678\u0679\f"+
		"\3\2\2\u0679\u067a\7y\2\2\u067a\u067c\5\u00ecw\2\u067b\u0678\3\2\2\2\u067c"+
		"\u067f\3\2\2\2\u067d\u067b\3\2\2\2\u067d\u067e\3\2\2\2\u067e\u00eb\3\2"+
		"\2\2\u067f\u067d\3\2\2\2\u0680\u0682\5\u00eex\2\u0681\u0683\5\u0118\u008d"+
		"\2\u0682\u0681\3\2\2\2\u0682\u0683\3\2\2\2\u0683\u00ed\3\2\2\2\u0684\u068a"+
		"\5\u00f0y\2\u0685\u0686\5\u00f2z\2\u0686\u0687\5\u00f4{\2\u0687\u0688"+
		"\5\u00f6|\2\u0688\u068a\3\2\2\2\u0689\u0684\3\2\2\2\u0689\u0685\3\2\2"+
		"\2\u068a\u00ef\3\2\2\2\u068b\u0690\5\u00f2z\2\u068c\u068d\5\u00f8}\2\u068d"+
		"\u068e\5\u00f0y\2\u068e\u0690\3\2\2\2\u068f\u068b\3\2\2\2\u068f\u068c"+
		"\3\2\2\2\u0690\u00f1\3\2\2\2\u0691\u0692\bz\1\2\u0692\u0694\5\u0100\u0081"+
		"\2\u0693\u0695\5\u00d4k\2\u0694\u0693\3\2\2\2\u0694\u0695\3\2\2\2\u0695"+
		"\u069b\3\2\2\2\u0696\u0697\7T\2\2\u0697\u0698\5\u00f0y\2\u0698\u0699\7"+
		"U\2\2\u0699\u069b\3\2\2\2\u069a\u0691\3\2\2\2\u069a\u0696\3\2\2\2\u069b"+
		"\u06a9\3\2\2\2\u069c\u069d\f\5\2\2\u069d\u06a8\5\u00f4{\2\u069e\u069f"+
		"\f\4\2\2\u069f\u06a1\7V\2\2\u06a0\u06a2\5Z.\2\u06a1\u06a0\3\2\2\2\u06a1"+
		"\u06a2\3\2\2\2\u06a2\u06a3\3\2\2\2\u06a3\u06a5\7W\2\2\u06a4\u06a6\5\u00d4"+
		"k\2\u06a5\u06a4\3\2\2\2\u06a5\u06a6\3\2\2\2\u06a6\u06a8\3\2\2\2\u06a7"+
		"\u069c\3\2\2\2\u06a7\u069e\3\2\2\2\u06a8\u06ab\3\2\2\2\u06a9\u06a7\3\2"+
		"\2\2\u06a9\u06aa\3\2\2\2\u06aa\u00f3\3\2\2\2\u06ab\u06a9\3\2\2\2\u06ac"+
		"\u06ad\7T\2\2\u06ad\u06ae\5\u010e\u0088\2\u06ae\u06b0\7U\2\2\u06af\u06b1"+
		"\5\u00fa~\2\u06b0\u06af\3\2\2\2\u06b0\u06b1\3\2\2\2\u06b1\u06b3\3\2\2"+
		"\2\u06b2\u06b4\5\u00fe\u0080\2\u06b3\u06b2\3\2\2\2\u06b3\u06b4\3\2\2\2"+
		"\u06b4\u06b6\3\2\2\2\u06b5\u06b7\5\u017e\u00c0\2\u06b6\u06b5\3\2\2\2\u06b6"+
		"\u06b7\3\2\2\2\u06b7\u06b9\3\2\2\2\u06b8\u06ba\5\u00d4k\2\u06b9\u06b8"+
		"\3\2\2\2\u06b9\u06ba\3\2\2\2\u06ba\u00f5\3\2\2\2\u06bb\u06bc\7{\2\2\u06bc"+
		"\u06be\5\u009aN\2\u06bd\u06bf\5\u0104\u0083\2\u06be\u06bd\3\2\2\2\u06be"+
		"\u06bf\3\2\2\2\u06bf\u00f7\3\2\2\2\u06c0\u06c2\7\\\2\2\u06c1\u06c3\5\u00d4"+
		"k\2\u06c2\u06c1\3\2\2\2\u06c2\u06c3\3\2\2\2\u06c3\u06c5\3\2\2\2\u06c4"+
		"\u06c6\5\u00fa~\2\u06c5\u06c4\3\2\2\2\u06c5\u06c6\3\2\2\2\u06c6\u06d8"+
		"\3\2\2\2\u06c7\u06c9\7`\2\2\u06c8\u06ca\5\u00d4k\2\u06c9\u06c8\3\2\2\2"+
		"\u06c9\u06ca\3\2\2\2\u06ca\u06d8\3\2\2\2\u06cb\u06cd\7u\2\2\u06cc\u06ce"+
		"\5\u00d4k\2\u06cd\u06cc\3\2\2\2\u06cd\u06ce\3\2\2\2\u06ce\u06d8\3\2\2"+
		"\2\u06cf\u06d0\5\f\7\2\u06d0\u06d2\7\\\2\2\u06d1\u06d3\5\u00d4k\2\u06d2"+
		"\u06d1\3\2\2\2\u06d2\u06d3\3\2\2\2\u06d3\u06d5\3\2\2\2\u06d4\u06d6\5\u00fa"+
		"~\2\u06d5\u06d4\3\2\2\2\u06d5\u06d6\3\2\2\2\u06d6\u06d8\3\2\2\2\u06d7"+
		"\u06c0\3\2\2\2\u06d7\u06c7\3\2\2\2\u06d7\u06cb\3\2\2\2\u06d7\u06cf\3\2"+
		"\2\2\u06d8\u00f9\3\2\2\2\u06d9\u06db\5\u00fc\177\2\u06da\u06dc\5\u00fa"+
		"~\2\u06db\u06da\3\2\2\2\u06db\u06dc\3\2\2\2\u06dc\u00fb\3\2\2\2\u06dd"+
		"\u06de\t\7\2\2\u06de\u00fd\3\2\2\2\u06df\u06e0\t\b\2\2\u06e0\u00ff\3\2"+
		"\2\2\u06e1\u06e3\7\u0082\2\2\u06e2\u06e1\3\2\2\2\u06e2\u06e3\3\2\2\2\u06e3"+
		"\u06e4\3\2\2\2\u06e4\u06e5\5\6\4\2\u06e5\u0101\3\2\2\2\u06e6\u06e8\5\u0098"+
		"M\2\u06e7\u06e9\5\u0104\u0083\2\u06e8\u06e7\3\2\2\2\u06e8\u06e9\3\2\2"+
		"\2\u06e9\u0103\3\2\2\2\u06ea\u06f3\5\u0106\u0084\2\u06eb\u06ed\5\u0108"+
		"\u0085\2\u06ec\u06eb\3\2\2\2\u06ec\u06ed\3\2\2\2\u06ed\u06ee\3\2\2\2\u06ee"+
		"\u06ef\5\u00f4{\2\u06ef\u06f0\5\u00f6|\2\u06f0\u06f3\3\2\2\2\u06f1\u06f3"+
		"\5\u010a\u0086\2\u06f2\u06ea\3\2\2\2\u06f2\u06ec\3\2\2\2\u06f2\u06f1\3"+
		"\2\2\2\u06f3\u0105\3\2\2\2\u06f4\u06fa\5\u0108\u0085\2\u06f5\u06f7\5\u00f8"+
		"}\2\u06f6\u06f8\5\u0106\u0084\2\u06f7\u06f6\3\2\2\2\u06f7\u06f8\3\2\2"+
		"\2\u06f8\u06fa\3\2\2\2\u06f9\u06f4\3\2\2\2\u06f9\u06f5\3\2\2\2\u06fa\u0107"+
		"\3\2\2\2\u06fb\u06fc\b\u0085\1\2\u06fc\u070a\5\u00f4{\2\u06fd\u06ff\7"+
		"V\2\2\u06fe\u0700\5Z.\2\u06ff\u06fe\3\2\2\2\u06ff\u0700\3\2\2\2\u0700"+
		"\u0701\3\2\2\2\u0701\u0703\7W\2\2\u0702\u0704\5\u00d4k\2\u0703\u0702\3"+
		"\2\2\2\u0703\u0704\3\2\2\2\u0704\u070a\3\2\2\2\u0705\u0706\7T\2\2\u0706"+
		"\u0707\5\u0106\u0084\2\u0707\u0708\7U\2\2\u0708\u070a\3\2\2\2\u0709\u06fb"+
		"\3\2\2\2\u0709\u06fd\3\2\2\2\u0709\u0705\3\2\2\2\u070a\u0718\3\2\2\2\u070b"+
		"\u070c\f\7\2\2\u070c\u0717\5\u00f4{\2\u070d\u070e\f\5\2\2\u070e\u0710"+
		"\7V\2\2\u070f\u0711\5Z.\2\u0710\u070f\3\2\2\2\u0710\u0711\3\2\2\2\u0711"+
		"\u0712\3\2\2\2\u0712\u0714\7W\2\2\u0713\u0715\5\u00d4k\2\u0714\u0713\3"+
		"\2\2\2\u0714\u0715\3\2\2\2\u0715\u0717\3\2\2\2\u0716\u070b\3\2\2\2\u0716"+
		"\u070d\3\2\2\2\u0717\u071a\3\2\2\2\u0718\u0716\3\2\2\2\u0718\u0719\3\2"+
		"\2\2\u0719\u0109\3\2\2\2\u071a\u0718\3\2\2\2\u071b\u0720\5\u010c\u0087"+
		"\2\u071c\u071d\5\u00f8}\2\u071d\u071e\5\u010a\u0086\2\u071e\u0720\3\2"+
		"\2\2\u071f\u071b\3\2\2\2\u071f\u071c\3\2\2\2\u0720\u010b\3\2\2\2\u0721"+
		"\u0722\b\u0087\1\2\u0722\u0723\7\u0082\2\2\u0723\u0731\3\2\2\2\u0724\u0725"+
		"\f\5\2\2\u0725\u0730\5\u00f4{\2\u0726\u0727\f\4\2\2\u0727\u0729\7V\2\2"+
		"\u0728\u072a\5Z.\2\u0729\u0728\3\2\2\2\u0729\u072a\3\2\2\2\u072a\u072b"+
		"\3\2\2\2\u072b\u072d\7W\2\2\u072c\u072e\5\u00d4k\2\u072d\u072c\3\2\2\2"+
		"\u072d\u072e\3\2\2\2\u072e\u0730\3\2\2\2\u072f\u0724\3\2\2\2\u072f\u0726"+
		"\3\2\2\2\u0730\u0733\3\2\2\2\u0731\u072f\3\2\2\2\u0731\u0732\3\2\2\2\u0732"+
		"\u010d\3\2\2\2\u0733\u0731\3\2\2\2\u0734\u0736\5\u0110\u0089\2\u0735\u0734"+
		"\3\2\2\2\u0735\u0736\3\2\2\2\u0736\u0738\3\2\2\2\u0737\u0739\7\u0082\2"+
		"\2\u0738\u0737\3\2\2\2\u0738\u0739\3\2\2\2\u0739\u073f\3\2\2\2\u073a\u073b"+
		"\5\u0110\u0089\2\u073b\u073c\7y\2\2\u073c\u073d\7\u0082\2\2\u073d\u073f"+
		"\3\2\2\2\u073e\u0735\3\2\2\2\u073e\u073a\3\2\2\2\u073f\u010f\3\2\2\2\u0740"+
		"\u0741\b\u0089\1\2\u0741\u0742\5\u0112\u008a\2\u0742\u0748\3\2\2\2\u0743"+
		"\u0744\f\3\2\2\u0744\u0745\7y\2\2\u0745\u0747\5\u0112\u008a\2\u0746\u0743"+
		"\3\2\2\2\u0747\u074a\3\2\2\2\u0748\u0746\3\2\2\2\u0748\u0749\3\2\2\2\u0749"+
		"\u0111\3\2\2\2\u074a\u0748\3\2\2\2\u074b\u074d\5\u00d4k\2\u074c\u074b"+
		"\3\2\2\2\u074c\u074d\3\2\2\2\u074d\u074e\3\2\2\2\u074e\u074f\5\u008cG"+
		"\2\u074f\u0750\5\u00eex\2\u0750\u076b\3\2\2\2\u0751\u0753\5\u00d4k\2\u0752"+
		"\u0751\3\2\2\2\u0752\u0753\3\2\2\2\u0753\u0754\3\2\2\2\u0754\u0755\5\u008c"+
		"G\2\u0755\u0756\5\u00eex\2\u0756\u0757\7d\2\2\u0757\u0758\5\u011c\u008f"+
		"\2\u0758\u076b\3\2\2\2\u0759\u075b\5\u00d4k\2\u075a\u0759\3\2\2\2\u075a"+
		"\u075b\3\2\2\2\u075b\u075c\3\2\2\2\u075c\u075e\5\u008cG\2\u075d\u075f"+
		"\5\u0104\u0083\2\u075e\u075d\3\2\2\2\u075e\u075f\3\2\2\2\u075f\u076b\3"+
		"\2\2\2\u0760\u0762\5\u00d4k\2\u0761\u0760\3\2\2\2\u0761\u0762\3\2\2\2"+
		"\u0762\u0763\3\2\2\2\u0763\u0765\5\u008cG\2\u0764\u0766\5\u0104\u0083"+
		"\2\u0765\u0764\3\2\2\2\u0765\u0766\3\2\2\2\u0766\u0767\3\2\2\2\u0767\u0768"+
		"\7d\2\2\u0768\u0769\5\u011c\u008f\2\u0769\u076b\3\2\2\2\u076a\u074c\3"+
		"\2\2\2\u076a\u0752\3\2\2\2\u076a\u075a\3\2\2\2\u076a\u0761\3\2\2\2\u076b"+
		"\u0113\3\2\2\2\u076c\u076e\5\u00d4k\2\u076d\u076c\3\2\2\2\u076d\u076e"+
		"\3\2\2\2\u076e\u0771\3\2\2\2\u076f\u0772\5\u008cG\2\u0770\u0772\7\u0083"+
		"\2\2\u0771\u076f\3\2\2\2\u0771\u0770\3\2\2\2\u0771\u0772\3\2\2\2\u0772"+
		"\u0773\3\2\2\2\u0773\u0775\5\u00eex\2\u0774\u0776\5\u0136\u009c\2\u0775"+
		"\u0774\3\2\2\2\u0775\u0776\3\2\2\2\u0776\u0777\3\2\2\2\u0777\u0778\5\u0116"+
		"\u008c\2\u0778\u0115\3\2\2\2\u0779\u077b\5\u014e\u00a8\2\u077a\u0779\3"+
		"\2\2\2\u077a\u077b\3\2\2\2\u077b\u077c\3\2\2\2\u077c\u0785\5d\63\2\u077d"+
		"\u0785\5\u0174\u00bb\2\u077e\u077f\7d\2\2\u077f\u0780\7\32\2\2\u0780\u0785"+
		"\7\177\2\2\u0781\u0782\7d\2\2\u0782\u0783\7\33\2\2\u0783\u0785\7\177\2"+
		"\2\u0784\u077a\3\2\2\2\u0784\u077d\3\2\2\2\u0784\u077e\3\2\2\2\u0784\u0781"+
		"\3\2\2\2\u0785\u0117\3\2\2\2\u0786\u078c\5\u011a\u008e\2\u0787\u0788\7"+
		"T\2\2\u0788\u0789\5\"\22\2\u0789\u078a\7U\2\2\u078a\u078c\3\2\2\2\u078b"+
		"\u0786\3\2\2\2\u078b\u0787\3\2\2\2\u078c\u0119\3\2\2\2\u078d\u078e\7d"+
		"\2\2\u078e\u0791\5\u011c\u008f\2\u078f\u0791\5\u0120\u0091\2\u0790\u078d"+
		"\3\2\2\2\u0790\u078f\3\2\2\2\u0791\u011b\3\2\2\2\u0792\u0795\5T+\2\u0793"+
		"\u0795\5\u0120\u0091\2\u0794\u0792\3\2\2\2\u0794\u0793\3\2\2\2\u0795\u011d"+
		"\3\2\2\2\u0796\u0797\b\u0090\1\2\u0797\u0799\5\u011c\u008f\2\u0798\u079a"+
		"\7\u0082\2\2\u0799\u0798\3\2\2\2\u0799\u079a\3\2\2\2\u079a\u07a3\3\2\2"+
		"\2\u079b\u079c\f\3\2\2\u079c\u079d\7y\2\2\u079d\u079f\5\u011c\u008f\2"+
		"\u079e\u07a0\7\u0082\2\2\u079f\u079e\3\2\2\2\u079f\u07a0\3\2\2\2\u07a0"+
		"\u07a2\3\2\2\2\u07a1\u079b\3\2\2\2\u07a2\u07a5\3\2\2\2\u07a3\u07a1\3\2"+
		"\2\2\u07a3\u07a4\3\2\2\2\u07a4\u011f\3\2\2\2\u07a5\u07a3\3\2\2\2\u07a6"+
		"\u07a7\7X\2\2\u07a7\u07a9\5\u011e\u0090\2\u07a8\u07aa\7y\2\2\u07a9\u07a8"+
		"\3\2\2\2\u07a9\u07aa\3\2\2\2\u07aa\u07ab\3\2\2\2\u07ab\u07ac\7Y\2\2\u07ac"+
		"\u07b0\3\2\2\2\u07ad\u07ae\7X\2\2\u07ae\u07b0\7Y\2\2\u07af\u07a6\3\2\2"+
		"\2\u07af\u07ad\3\2\2\2\u07b0\u0121\3\2\2\2\u07b1\u07b4\7\u0083\2\2\u07b2"+
		"\u07b4\5\u0162\u00b2\2\u07b3\u07b1\3\2\2\2\u07b3\u07b2\3\2\2\2\u07b4\u0123"+
		"\3\2\2\2\u07b5\u07b6\5\u0126\u0094\2\u07b6\u07b8\7X\2\2\u07b7\u07b9\5"+
		"\u012e\u0098\2\u07b8\u07b7\3\2\2\2\u07b8\u07b9\3\2\2\2\u07b9\u07ba\3\2"+
		"\2\2\u07ba\u07bb\7Y\2\2\u07bb\u0125\3\2\2\2\u07bc\u07be\5\u012c\u0097"+
		"\2\u07bd\u07bf\5\u00d4k\2\u07be\u07bd\3\2\2\2\u07be\u07bf\3\2\2\2\u07bf"+
		"\u07c0\3\2\2\2\u07c0\u07c2\5\u0128\u0095\2\u07c1\u07c3\5\u012a\u0096\2"+
		"\u07c2\u07c1\3\2\2\2\u07c2\u07c3\3\2\2\2\u07c3\u07c5\3\2\2\2\u07c4\u07c6"+
		"\5\u013c\u009f\2\u07c5\u07c4\3\2\2\2\u07c5\u07c6\3\2\2\2\u07c6\u07cf\3"+
		"\2\2\2\u07c7\u07c9\5\u012c\u0097\2\u07c8\u07ca\5\u00d4k\2\u07c9\u07c8"+
		"\3\2\2\2\u07c9\u07ca\3\2\2\2\u07ca\u07cc\3\2\2\2\u07cb\u07cd\5\u013c\u009f"+
		"\2\u07cc\u07cb\3\2\2\2\u07cc\u07cd\3\2\2\2\u07cd\u07cf\3\2\2\2\u07ce\u07bc"+
		"\3\2\2\2\u07ce\u07c7\3\2\2\2\u07cf\u0127\3\2\2\2\u07d0\u07d2\5\f\7\2\u07d1"+
		"\u07d0\3\2\2\2\u07d1\u07d2\3\2\2\2\u07d2\u07d3\3\2\2\2\u07d3\u07d4\5\u0122"+
		"\u0092\2\u07d4\u0129\3\2\2\2\u07d5\u07d6\7%\2\2\u07d6\u012b\3\2\2\2\u07d7"+
		"\u07d8\t\t\2\2\u07d8\u012d\3\2\2\2\u07d9\u07db\5\u0130\u0099\2\u07da\u07dc"+
		"\5\u012e\u0098\2\u07db\u07da\3\2\2\2\u07db\u07dc\3\2\2\2\u07dc\u07e3\3"+
		"\2\2\2\u07dd\u07de\5\u0146\u00a4\2\u07de\u07e0\7}\2\2\u07df\u07e1\5\u012e"+
		"\u0098\2\u07e0\u07df\3\2\2\2\u07e0\u07e1\3\2\2\2\u07e1\u07e3\3\2\2\2\u07e2"+
		"\u07d9\3\2\2\2\u07e2\u07dd\3\2\2\2\u07e3\u012f\3\2\2\2\u07e4\u07e6\5\u00d4"+
		"k\2\u07e5\u07e4\3\2\2\2\u07e5\u07e6\3\2\2\2\u07e6\u07e8\3\2\2\2\u07e7"+
		"\u07e9\5\u008cG\2\u07e8\u07e7\3\2\2\2\u07e8\u07e9\3\2\2\2\u07e9\u07eb"+
		"\3\2\2\2\u07ea\u07ec\5\u0132\u009a\2\u07eb\u07ea\3\2\2\2\u07eb\u07ec\3"+
		"\2\2\2\u07ec\u07ed\3\2\2\2\u07ed\u07f5\7\177\2\2\u07ee\u07f5\5\u0114\u008b"+
		"\2\u07ef\u07f5\5\u00ccg\2\u07f0\u07f5\5\u0084C\2\u07f1\u07f5\5\u015a\u00ae"+
		"\2\u07f2\u07f5\5\u0080A\2\u07f3\u07f5\5\u0086D\2\u07f4\u07e5\3\2\2\2\u07f4"+
		"\u07ee\3\2\2\2\u07f4\u07ef\3\2\2\2\u07f4\u07f0\3\2\2\2\u07f4\u07f1\3\2"+
		"\2\2\u07f4\u07f2\3\2\2\2\u07f4\u07f3\3\2\2\2\u07f5\u0131\3\2\2\2\u07f6"+
		"\u07f7\b\u009a\1\2\u07f7\u07f8\5\u0134\u009b\2\u07f8\u07fe\3\2\2\2\u07f9"+
		"\u07fa\f\3\2\2\u07fa\u07fb\7y\2\2\u07fb\u07fd\5\u0134\u009b\2\u07fc\u07f9"+
		"\3\2\2\2\u07fd\u0800\3\2\2\2\u07fe\u07fc\3\2\2\2\u07fe\u07ff\3\2\2\2\u07ff"+
		"\u0133\3\2\2\2\u0800\u07fe\3\2\2\2\u0801\u0803\5\u00eex\2\u0802\u0804"+
		"\5\u0136\u009c\2\u0803\u0802\3\2\2\2\u0803\u0804\3\2\2\2\u0804\u0806\3"+
		"\2\2\2\u0805\u0807\5\u013a\u009e\2\u0806\u0805\3\2\2\2\u0806\u0807\3\2"+
		"\2\2\u0807\u0815\3\2\2\2\u0808\u080a\5\u00eex\2\u0809\u080b\5\u011a\u008e"+
		"\2\u080a\u0809\3\2\2\2\u080a\u080b\3\2\2\2\u080b\u0815\3\2\2\2\u080c\u080e"+
		"\7\u0083\2\2\u080d\u080c\3\2\2\2\u080d\u080e\3\2\2\2\u080e\u0810\3\2\2"+
		"\2\u080f\u0811\5\u00d4k\2\u0810\u080f\3\2\2\2\u0810\u0811\3\2\2\2\u0811"+
		"\u0812\3\2\2\2\u0812\u0813\7}\2\2\u0813\u0815\5Z.\2\u0814\u0801\3\2\2"+
		"\2\u0814\u0808\3\2\2\2\u0814\u080d\3\2\2\2\u0815\u0135\3\2\2\2\u0816\u0817"+
		"\b\u009c\1\2\u0817\u0818\5\u0138\u009d\2\u0818\u081d\3\2\2\2\u0819\u081a"+
		"\f\3\2\2\u081a\u081c\5\u0138\u009d\2\u081b\u0819\3\2\2\2\u081c\u081f\3"+
		"\2\2\2\u081d\u081b\3\2\2\2\u081d\u081e\3\2\2\2\u081e\u0137\3\2\2\2\u081f"+
		"\u081d\3\2\2\2\u0820\u0821\t\n\2\2\u0821\u0139\3\2\2\2\u0822\u0823\7d"+
		"\2\2\u0823\u0824\7\u0086\2\2\u0824\u0825\b\u009e\1\2\u0825\u013b\3\2\2"+
		"\2\u0826\u0827\7}\2\2\u0827\u0828\5\u013e\u00a0\2\u0828\u013d\3\2\2\2"+
		"\u0829\u082a\b\u00a0\1\2\u082a\u082c\5\u0140\u00a1\2\u082b\u082d\7\u0082"+
		"\2\2\u082c\u082b\3\2\2\2\u082c\u082d\3\2\2\2\u082d\u0836\3\2\2\2\u082e"+
		"\u082f\f\3\2\2\u082f\u0830\7y\2\2\u0830\u0832\5\u0140\u00a1\2\u0831\u0833"+
		"\7\u0082\2\2\u0832\u0831\3\2\2\2\u0832\u0833\3\2\2\2\u0833\u0835\3\2\2"+
		"\2\u0834\u082e\3\2\2\2\u0835\u0838\3\2\2\2\u0836\u0834\3\2\2\2\u0836\u0837"+
		"\3\2\2\2\u0837\u013f\3\2\2\2\u0838\u0836\3\2\2\2\u0839\u083b\5\u00d4k"+
		"\2\u083a\u0839\3\2\2\2\u083a\u083b\3\2\2\2\u083b\u083c\3\2\2\2\u083c\u084f"+
		"\5\u0144\u00a3\2\u083d\u083f\5\u00d4k\2\u083e\u083d\3\2\2\2\u083e\u083f"+
		"\3\2\2\2\u083f\u0840\3\2\2\2\u0840\u0842\7O\2\2\u0841\u0843\5\u0146\u00a4"+
		"\2\u0842\u0841\3\2\2\2\u0842\u0843\3\2\2\2\u0843\u0844\3\2\2\2\u0844\u084f"+
		"\5\u0144\u00a3\2\u0845\u0847\5\u00d4k\2\u0846\u0845\3\2\2\2\u0846\u0847"+
		"\3\2\2\2\u0847\u0848\3\2\2\2\u0848\u084a\5\u0146\u00a4\2\u0849\u084b\7"+
		"O\2\2\u084a\u0849\3\2\2\2\u084a\u084b\3\2\2\2\u084b\u084c\3\2\2\2\u084c"+
		"\u084d\5\u0144\u00a3\2\u084d\u084f\3\2\2\2\u084e\u083a\3\2\2\2\u084e\u083e"+
		"\3\2\2\2\u084e\u0846\3\2\2\2\u084f\u0141\3\2\2\2\u0850\u0852\5\f\7\2\u0851"+
		"\u0850\3\2\2\2\u0851\u0852\3\2\2\2\u0852\u0853\3\2\2\2\u0853\u0856\5\u0122"+
		"\u0092\2\u0854\u0856\5\u00a0Q\2\u0855\u0851\3\2\2\2\u0855\u0854\3\2\2"+
		"\2\u0856\u0143\3\2\2\2\u0857\u0858\5\u0142\u00a2\2\u0858\u0145\3\2\2\2"+
		"\u0859\u085a\t\13\2\2\u085a\u0147\3\2\2\2\u085b\u085c\7\63\2\2\u085c\u085d"+
		"\5\u014a\u00a6\2\u085d\u0149\3\2\2\2\u085e\u0860\5\u0098M\2\u085f\u0861"+
		"\5\u014c\u00a7\2\u0860\u085f\3\2\2\2\u0860\u0861\3\2\2\2\u0861\u014b\3"+
		"\2\2\2\u0862\u0864\5\u00f8}\2\u0863\u0865\5\u014c\u00a7\2\u0864\u0863"+
		"\3\2\2\2\u0864\u0865\3\2\2\2\u0865\u014d\3\2\2\2\u0866\u0867\7}\2\2\u0867"+
		"\u0868\5\u0150\u00a9\2\u0868\u014f\3\2\2\2\u0869\u086b\5\u0152\u00aa\2"+
		"\u086a\u086c\7\u0082\2\2\u086b\u086a\3\2\2\2\u086b\u086c\3\2\2\2\u086c"+
		"\u0875\3\2\2\2\u086d\u086f\5\u0152\u00aa\2\u086e\u0870\7\u0082\2\2\u086f"+
		"\u086e\3\2\2\2\u086f\u0870\3\2\2\2\u0870\u0871\3\2\2\2\u0871\u0872\7y"+
		"\2\2\u0872\u0873\5\u0150\u00a9\2\u0873\u0875\3\2\2\2\u0874\u0869\3\2\2"+
		"\2\u0874\u086d\3\2\2\2\u0875\u0151\3\2\2\2\u0876\u0877\5\u0154\u00ab\2"+
		"\u0877\u0879\7T\2\2\u0878\u087a\5\"\22\2\u0879\u0878\3\2\2\2\u0879\u087a"+
		"\3\2\2\2\u087a\u087b\3\2\2\2\u087b\u087c\7U\2\2\u087c\u0881\3\2\2\2\u087d"+
		"\u087e\5\u0154\u00ab\2\u087e\u087f\5\u0120\u0091\2\u087f\u0881\3\2\2\2"+
		"\u0880\u0876\3\2\2\2\u0880\u087d\3\2\2\2\u0881\u0153\3\2\2\2\u0882\u0885"+
		"\5\u0142\u00a2\2\u0883\u0885\7\u0083\2\2\u0884\u0882\3\2\2\2\u0884\u0883"+
		"\3\2\2\2\u0885\u0155\3\2\2\2\u0886\u0887\7\63\2\2\u0887\u0888\5\u018a"+
		"\u00c6\2\u0888\u0157\3\2\2\2\u0889\u088a\7\63\2\2\u088a\u088b\7\u008c"+
		"\2\2\u088b\u088f\7\u0083\2\2\u088c\u088d\7\63\2\2\u088d\u088f\7\u008f"+
		"\2\2\u088e\u0889\3\2\2\2\u088e\u088c\3\2\2\2\u088f\u0159\3\2\2\2\u0890"+
		"\u0891\7C\2\2\u0891\u0892\7e\2\2\u0892\u0893\5\u015c\u00af\2\u0893\u0894"+
		"\7f\2\2\u0894\u0895\5|?\2\u0895\u015b\3\2\2\2\u0896\u0897\b\u00af\1\2"+
		"\u0897\u0898\5\u015e\u00b0\2\u0898\u089e\3\2\2\2\u0899\u089a\f\3\2\2\u089a"+
		"\u089b\7y\2\2\u089b\u089d\5\u015e\u00b0\2\u089c\u0899\3\2\2\2\u089d\u08a0"+
		"\3\2\2\2\u089e\u089c\3\2\2\2\u089e\u089f\3\2\2\2\u089f\u015d\3\2\2\2\u08a0"+
		"\u089e\3\2\2\2\u08a1\u08a4\5\u0160\u00b1\2\u08a2\u08a4\5\u0112\u008a\2"+
		"\u08a3\u08a1\3\2\2\2\u08a3\u08a2\3\2\2\2\u08a4\u015f\3\2\2\2\u08a5\u08a7"+
		"\7\24\2\2\u08a6\u08a8\7\u0082\2\2\u08a7\u08a6\3\2\2\2\u08a7\u08a8\3\2"+
		"\2\2\u08a8\u08aa\3\2\2\2\u08a9\u08ab\7\u0083\2\2\u08aa\u08a9\3\2\2\2\u08aa"+
		"\u08ab\3\2\2\2\u08ab\u08d6\3\2\2\2\u08ac\u08ae\7\24\2\2\u08ad\u08af\7"+
		"\u0083\2\2\u08ae\u08ad\3\2\2\2\u08ae\u08af\3\2\2\2\u08af\u08b0\3\2\2\2"+
		"\u08b0\u08b1\7d\2\2\u08b1\u08d6\5\u0102\u0082\2\u08b2\u08b4\7K\2\2\u08b3"+
		"\u08b5\7\u0082\2\2\u08b4\u08b3\3\2\2\2\u08b4\u08b5\3\2\2\2\u08b5\u08b7"+
		"\3\2\2\2\u08b6\u08b8\7\u0083\2\2\u08b7\u08b6\3\2\2\2\u08b7\u08b8\3\2\2"+
		"\2\u08b8\u08d6\3\2\2\2\u08b9\u08bb\7K\2\2\u08ba\u08bc\7\u0083\2\2\u08bb"+
		"\u08ba\3\2\2\2\u08bb\u08bc\3\2\2\2\u08bc\u08bd\3\2\2\2\u08bd\u08be\7d"+
		"\2\2\u08be\u08d6\5\u0102\u0082\2\u08bf\u08c0\7C\2\2\u08c0\u08c1\7e\2\2"+
		"\u08c1\u08c2\5\u015c\u00af\2\u08c2\u08c3\7f\2\2\u08c3\u08c5\7\24\2\2\u08c4"+
		"\u08c6\7\u0082\2\2\u08c5\u08c4\3\2\2\2\u08c5\u08c6\3\2\2\2\u08c6\u08c8"+
		"\3\2\2\2\u08c7\u08c9\7\u0083\2\2\u08c8\u08c7\3\2\2\2\u08c8\u08c9\3\2\2"+
		"\2\u08c9\u08d6\3\2\2\2\u08ca\u08cb\7C\2\2\u08cb\u08cc\7e\2\2\u08cc\u08cd"+
		"\5\u015c\u00af\2\u08cd\u08ce\7f\2\2\u08ce\u08d0\7\24\2\2\u08cf\u08d1\7"+
		"\u0083\2\2\u08d0\u08cf\3\2\2\2\u08d0\u08d1\3\2\2\2\u08d1\u08d2\3\2\2\2"+
		"\u08d2\u08d3\7d\2\2\u08d3\u08d4\5\6\4\2\u08d4\u08d6\3\2\2\2\u08d5\u08a5"+
		"\3\2\2\2\u08d5\u08ac\3\2\2\2\u08d5\u08b2\3\2\2\2\u08d5\u08b9\3\2\2\2\u08d5"+
		"\u08bf\3\2\2\2\u08d5\u08ca\3\2\2\2\u08d6\u0161\3\2\2\2\u08d7\u08d8\5\u0166"+
		"\u00b4\2\u08d8\u08da\7e\2\2\u08d9\u08db\5\u0168\u00b5\2\u08da\u08d9\3"+
		"\2\2\2\u08da\u08db\3\2\2\2\u08db\u08dc\3\2\2\2\u08dc\u08dd\7f\2\2\u08dd"+
		"\u0163\3\2\2\2\u08de\u08ee\5\u0162\u00b2\2\u08df\u08e0\5\u0156\u00ac\2"+
		"\u08e0\u08e2\7e\2\2\u08e1\u08e3\5\u0168\u00b5\2\u08e2\u08e1\3\2\2\2\u08e2"+
		"\u08e3\3\2\2\2\u08e3\u08e4\3\2\2\2\u08e4\u08e5\7f\2\2\u08e5\u08ee\3\2"+
		"\2\2\u08e6\u08e7\5\u0158\u00ad\2\u08e7\u08e9\7e\2\2\u08e8\u08ea\5\u0168"+
		"\u00b5\2\u08e9\u08e8\3\2\2\2\u08e9\u08ea\3\2\2\2\u08ea\u08eb\3\2\2\2\u08eb"+
		"\u08ec\7f\2\2\u08ec\u08ee\3\2\2\2\u08ed\u08de\3\2\2\2\u08ed\u08df\3\2"+
		"\2\2\u08ed\u08e6\3\2\2\2\u08ee\u0165\3\2\2\2\u08ef\u08f0\7\u0083\2\2\u08f0"+
		"\u0167\3\2\2\2\u08f1\u08f2\b\u00b5\1\2\u08f2\u08f4\5\u016a\u00b6\2\u08f3"+
		"\u08f5\7\u0082\2\2\u08f4\u08f3\3\2\2\2\u08f4\u08f5\3\2\2\2\u08f5\u08fe"+
		"\3\2\2\2\u08f6\u08f7\f\3\2\2\u08f7\u08f8\7y\2\2\u08f8\u08fa\5\u016a\u00b6"+
		"\2\u08f9\u08fb\7\u0082\2\2\u08fa\u08f9\3\2\2\2\u08fa\u08fb\3\2\2\2\u08fb"+
		"\u08fd\3\2\2\2\u08fc\u08f6\3\2\2\2\u08fd\u0900\3\2\2\2\u08fe\u08fc\3\2"+
		"\2\2\u08fe\u08ff\3\2\2\2\u08ff\u0169\3\2\2\2\u0900\u08fe\3\2\2\2\u0901"+
		"\u0905\5Z.\2\u0902\u0905\5\u0102\u0082\2\u0903\u0905\5\6\4\2\u0904\u0901"+
		"\3\2\2\2\u0904\u0902\3\2\2\2\u0904\u0903\3\2\2\2\u0905\u016b\3\2\2\2\u0906"+
		"\u0907\7K\2\2\u0907\u0908\5\f\7\2\u0908\u0909\7\u0083\2\2\u0909\u0912"+
		"\3\2\2\2\u090a\u090b\7K\2\2\u090b\u090d\5\f\7\2\u090c\u090e\7C\2\2\u090d"+
		"\u090c\3\2\2\2\u090d\u090e\3\2\2\2\u090e\u090f\3\2\2\2\u090f\u0910\5\u0162"+
		"\u00b2\2\u0910\u0912\3\2\2\2\u0911\u0906\3\2\2\2\u0911\u090a\3\2\2\2\u0912"+
		"\u016d\3\2\2\2\u0913\u0915\7#\2\2\u0914\u0913\3\2\2\2\u0914\u0915\3\2"+
		"\2\2\u0915\u0916\3\2\2\2\u0916\u0917\7C\2\2\u0917\u0918\5|?\2\u0918\u016f"+
		"\3\2\2\2\u0919\u091a\7C\2\2\u091a\u091b\7e\2\2\u091b\u091c\7f\2\2\u091c"+
		"\u091d\5|?\2\u091d\u0171\3\2\2\2\u091e\u091f\7H\2\2\u091f\u0920\5d\63"+
		"\2\u0920\u0921\5\u0176\u00bc\2\u0921\u0173\3\2\2\2\u0922\u0924\7H\2\2"+
		"\u0923\u0925\5\u014e\u00a8\2\u0924\u0923\3\2\2\2\u0924\u0925\3\2\2\2\u0925"+
		"\u0926\3\2\2\2\u0926\u0927\5d\63\2\u0927\u0928\5\u0176\u00bc\2\u0928\u0175"+
		"\3\2\2\2\u0929\u092b\5\u0178\u00bd\2\u092a\u092c\5\u0176\u00bc\2\u092b"+
		"\u092a\3\2\2\2\u092b\u092c\3\2\2\2\u092c\u0177\3\2\2\2\u092d\u092e\7\20"+
		"\2\2\u092e\u092f\7T\2\2\u092f\u0930\5\u017a\u00be\2\u0930\u0931\7U\2\2"+
		"\u0931\u0932\5d\63\2\u0932\u0179\3\2\2\2\u0933\u0935\5\u00d4k\2\u0934"+
		"\u0933\3\2\2\2\u0934\u0935\3\2\2\2\u0935\u0936\3\2\2\2\u0936\u0937\5\u0098"+
		"M\2\u0937\u0938\5\u00eex\2\u0938\u0942\3\2\2\2\u0939\u093b\5\u00d4k\2"+
		"\u093a\u0939\3\2\2\2\u093a\u093b\3\2\2\2\u093b\u093c\3\2\2\2\u093c\u093e"+
		"\5\u0098M\2\u093d\u093f\5\u0104\u0083\2\u093e\u093d\3\2\2\2\u093e\u093f"+
		"\3\2\2\2\u093f\u0942\3\2\2\2\u0940\u0942\7\u0082\2\2\u0941\u0934\3\2\2"+
		"\2\u0941\u093a\3\2\2\2\u0941\u0940\3\2\2\2\u0942\u017b\3\2\2\2\u0943\u0945"+
		"\7F\2\2\u0944\u0946\5T+\2\u0945\u0944\3\2\2\2\u0945\u0946\3\2\2\2\u0946"+
		"\u017d\3\2\2\2\u0947\u094a\5\u0180\u00c1\2\u0948\u094a\5\u0184\u00c3\2"+
		"\u0949\u0947\3\2\2\2\u0949\u0948\3\2\2\2\u094a\u017f\3\2\2\2\u094b\u094c"+
		"\7F\2\2\u094c\u094e\7T\2\2\u094d\u094f\5\u0182\u00c2\2\u094e\u094d\3\2"+
		"\2\2\u094e\u094f\3\2\2\2\u094f\u0950\3\2\2\2\u0950\u0951\7U\2\2\u0951"+
		"\u0181\3\2\2\2\u0952\u0953\b\u00c2\1\2\u0953\u0955\5\u0102\u0082\2\u0954"+
		"\u0956\7\u0082\2\2\u0955\u0954\3\2\2\2\u0955\u0956\3\2\2\2\u0956\u095f"+
		"\3\2\2\2\u0957\u0958\f\3\2\2\u0958\u0959\7y\2\2\u0959\u095b\5\u0102\u0082"+
		"\2\u095a\u095c\7\u0082\2\2\u095b\u095a\3\2\2\2\u095b\u095c\3\2\2\2\u095c"+
		"\u095e\3\2\2\2\u095d\u0957\3\2\2\2\u095e\u0961\3\2\2\2\u095f\u095d\3\2"+
		"\2\2\u095f\u0960\3\2\2\2\u0960\u0183\3\2\2\2\u0961\u095f\3\2\2\2\u0962"+
		"\u0963\7\61\2\2\u0963\u0964\7T\2\2\u0964\u0965\5Z.\2\u0965\u0966\7U\2"+
		"\2\u0966\u0969\3\2\2\2\u0967\u0969\7\61\2\2\u0968\u0962\3\2\2\2\u0968"+
		"\u0967\3\2\2\2\u0969\u0185\3\2\2\2\u096a\u096b\7f\2\2\u096b\u096c\7f\2"+
		"\2\u096c\u0187\3\2\2\2\u096d\u096e\7f\2\2\u096e\u096f\7f\2\2\u096f\u0970"+
		"\7d\2\2\u0970\u0189\3\2\2\2\u0971\u09a2\7\60\2\2\u0972\u09a2\7\33\2\2"+
		"\u0973\u0974\7\60\2\2\u0974\u0975\7V\2\2\u0975\u09a2\7W\2\2\u0976\u0977"+
		"\7\33\2\2\u0977\u0978\7V\2\2\u0978\u09a2\7W\2\2\u0979\u09a2\7Z\2\2\u097a"+
		"\u09a2\7[\2\2\u097b\u09a2\7\\\2\2\u097c\u09a2\7]\2\2\u097d\u09a2\7^\2"+
		"\2\u097e\u09a2\7_\2\2\u097f\u09a2\7`\2\2\u0980\u09a2\7a\2\2\u0981\u09a2"+
		"\7b\2\2\u0982\u09a2\7c\2\2\u0983\u09a2\7d\2\2\u0984\u09a2\7e\2\2\u0985"+
		"\u09a2\7f\2\2\u0986\u09a2\7g\2\2\u0987\u09a2\7h\2\2\u0988\u09a2\7i\2\2"+
		"\u0989\u09a2\7j\2\2\u098a\u09a2\7k\2\2\u098b\u09a2\7l\2\2\u098c\u09a2"+
		"\7m\2\2\u098d\u09a2\7n\2\2\u098e\u09a2\7o\2\2\u098f\u09a2\5\u0186\u00c4"+
		"\2\u0990\u09a2\5\u0188\u00c5\2\u0991\u09a2\7p\2\2\u0992\u09a2\7q\2\2\u0993"+
		"\u09a2\7r\2\2\u0994\u09a2\7s\2\2\u0995\u09a2\7t\2\2\u0996\u09a2\7u\2\2"+
		"\u0997\u09a2\7v\2\2\u0998\u09a2\7w\2\2\u0999\u09a2\7x\2\2\u099a\u09a2"+
		"\7y\2\2\u099b\u09a2\7z\2\2\u099c\u09a2\7";
	private static final String _serializedATNSegment1 =
		"{\2\2\u099d\u099e\7T\2\2\u099e\u09a2\7U\2\2\u099f\u09a0\7V\2\2\u09a0\u09a2"+
		"\7W\2\2\u09a1\u0971\3\2\2\2\u09a1\u0972\3\2\2\2\u09a1\u0973\3\2\2\2\u09a1"+
		"\u0976\3\2\2\2\u09a1\u0979\3\2\2\2\u09a1\u097a\3\2\2\2\u09a1\u097b\3\2"+
		"\2\2\u09a1\u097c\3\2\2\2\u09a1\u097d\3\2\2\2\u09a1\u097e\3\2\2\2\u09a1"+
		"\u097f\3\2\2\2\u09a1\u0980\3\2\2\2\u09a1\u0981\3\2\2\2\u09a1\u0982\3\2"+
		"\2\2\u09a1\u0983\3\2\2\2\u09a1\u0984\3\2\2\2\u09a1\u0985\3\2\2\2\u09a1"+
		"\u0986\3\2\2\2\u09a1\u0987\3\2\2\2\u09a1\u0988\3\2\2\2\u09a1\u0989\3\2"+
		"\2\2\u09a1\u098a\3\2\2\2\u09a1\u098b\3\2\2\2\u09a1\u098c\3\2\2\2\u09a1"+
		"\u098d\3\2\2\2\u09a1\u098e\3\2\2\2\u09a1\u098f\3\2\2\2\u09a1\u0990\3\2"+
		"\2\2\u09a1\u0991\3\2\2\2\u09a1\u0992\3\2\2\2\u09a1\u0993\3\2\2\2\u09a1"+
		"\u0994\3\2\2\2\u09a1\u0995\3\2\2\2\u09a1\u0996\3\2\2\2\u09a1\u0997\3\2"+
		"\2\2\u09a1\u0998\3\2\2\2\u09a1\u0999\3\2\2\2\u09a1\u099a\3\2\2\2\u09a1"+
		"\u099b\3\2\2\2\u09a1\u099c\3\2\2\2\u09a1\u099d\3\2\2\2\u09a1\u099f\3\2"+
		"\2\2\u09a2\u018b\3\2\2\2\u09a3\u09ab\7\u0084\2\2\u09a4\u09ab\7\u008a\2"+
		"\2\u09a5\u09ab\7\u008b\2\2\u09a6\u09ab\7\u008c\2\2\u09a7\u09ab\5\u018e"+
		"\u00c8\2\u09a8\u09ab\5\u0190\u00c9\2\u09a9\u09ab\5\u0192\u00ca\2\u09aa"+
		"\u09a3\3\2\2\2\u09aa\u09a4\3\2\2\2\u09aa\u09a5\3\2\2\2\u09aa\u09a6\3\2"+
		"\2\2\u09aa\u09a7\3\2\2\2\u09aa\u09a8\3\2\2\2\u09aa\u09a9\3\2\2\2\u09ab"+
		"\u018d\3\2\2\2\u09ac\u09ad\t\f\2\2\u09ad\u018f\3\2\2\2\u09ae\u09af\7\62"+
		"\2\2\u09af\u0191\3\2\2\2\u09b0\u09b1\t\r\2\2\u09b1\u0193\3\2\2\2\u013f"+
		"\u0195\u01a1\u01a5\u01b0\u01b4\u01c3\u01ca\u01cf\u01d1\u01d6\u01dc\u01e6"+
		"\u01ed\u01f3\u01f7\u01fc\u0202\u0209\u020f\u0212\u0215\u0218\u021f\u0226"+
		"\u025a\u0269\u026f\u0275\u0282\u0284\u028a\u0299\u029f\u02bd\u02c2\u02c6"+
		"\u02ca\u02cd\u02d1\u02d7\u02d9\u02e1\u02e5\u02e8\u02ef\u02f6\u02fa\u02ff"+
		"\u0303\u0306\u030b\u0311\u031e\u0329\u032b\u033a\u033c\u0348\u034a\u0357"+
		"\u0359\u036b\u036d\u0379\u037b\u0386\u0391\u039c\u03a7\u03b2\u03bc\u03c4"+
		"\u03d1\u03db\u03e5\u03e7\u03ec\u03f0\u03f4\u03f8\u03fc\u0400\u0405\u0408"+
		"\u040b\u0411\u0419\u041e\u0421\u0427\u0432\u0449\u044d\u0455\u045b\u0471"+
		"\u0475\u0478\u047f\u0487\u0491\u0498\u04a5\u04b1\u04bb\u04c0\u04c7\u04ca"+
		"\u04cf\u04d4\u04e9\u04ed\u04f2\u04fd\u0503\u0507\u050c\u0510\u0515\u0518"+
		"\u052e\u0534\u053f\u0543\u0546\u0550\u0556\u0559\u0560\u056a\u056e\u0571"+
		"\u0574\u0578\u057d\u057f\u0583\u0587\u0590\u059d\u05a5\u05ab\u05b1\u05b5"+
		"\u05b8\u05c1\u05ca\u05d2\u05dd\u05e3\u05ee\u05f1\u05f6\u0605\u060b\u0614"+
		"\u061e\u0624\u062c\u0630\u0634\u0639\u063e\u0645\u0647\u064c\u0650\u065e"+
		"\u0664\u0673\u067d\u0682\u0689\u068f\u0694\u069a\u06a1\u06a5\u06a7\u06a9"+
		"\u06b0\u06b3\u06b6\u06b9\u06be\u06c2\u06c5\u06c9\u06cd\u06d2\u06d5\u06d7"+
		"\u06db\u06e2\u06e8\u06ec\u06f2\u06f7\u06f9\u06ff\u0703\u0709\u0710\u0714"+
		"\u0716\u0718\u071f\u0729\u072d\u072f\u0731\u0735\u0738\u073e\u0748\u074c"+
		"\u0752\u075a\u075e\u0761\u0765\u076a\u076d\u0771\u0775\u077a\u0784\u078b"+
		"\u0790\u0794\u0799\u079f\u07a3\u07a9\u07af\u07b3\u07b8\u07be\u07c2\u07c5"+
		"\u07c9\u07cc\u07ce\u07d1\u07db\u07e0\u07e2\u07e5\u07e8\u07eb\u07f4\u07fe"+
		"\u0803\u0806\u080a\u080d\u0810\u0814\u081d\u082c\u0832\u0836\u083a\u083e"+
		"\u0842\u0846\u084a\u084e\u0851\u0855\u0860\u0864\u086b\u086f\u0874\u0879"+
		"\u0880\u0884\u088e\u089e\u08a3\u08a7\u08aa\u08ae\u08b4\u08b7\u08bb\u08c5"+
		"\u08c8\u08d0\u08d5\u08da\u08e2\u08e9\u08ed\u08f4\u08fa\u08fe\u0904\u090d"+
		"\u0911\u0914\u0924\u092b\u0934\u093a\u093e\u0941\u0945\u0949\u094e\u0955"+
		"\u095b\u095f\u0968\u09a1\u09aa";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}