// Generated from c:/Users/NASA/Desktop/comp2024-10e/src/main/antlr/comp2024/grammar/Javamm.g4 by ANTLR 4.13.1

    package pt.up.fe.comp2024;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class JavammParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, WS=54, SINGLE_COMMENT=55, MULTI_COMMENT=56, INTEGER=57, ID=58;
	public static final int
		RULE_program = 0, RULE_importDeclaration = 1, RULE_classDeclaration = 2, 
		RULE_type = 3, RULE_fieldDeclaration = 4, RULE_methodDeclaration = 5, 
		RULE_argument = 6, RULE_methodBody = 7, RULE_statement = 8, RULE_expression = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "importDeclaration", "classDeclaration", "type", "fieldDeclaration", 
			"methodDeclaration", "argument", "methodBody", "statement", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'.'", "';'", "'class'", "'extends'", "'{'", "'}'", 
			"'['", "']'", "'int'", "'...'", "'boolean'", "'String'", "'double'", 
			"'float'", "'public'", "'private'", "'protected'", "'('", "','", "')'", 
			"'static'", "'void'", "'main'", "'return'", "'if'", "'else'", "'while'", 
			"'='", "'new'", "'length'", "'this'", "'!'", "'*'", "'/'", "'+'", "'-'", 
			"'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'+='", "'-='", "'*='", 
			"'/='", "'&&'", "'||'", "'true'", "'false'", "'++'", "'--'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "WS", "SINGLE_COMMENT", "MULTI_COMMENT", 
			"INTEGER", "ID"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Javamm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavammParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(JavammParser.EOF, 0); }
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(20);
				importDeclaration();
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(26);
				classDeclaration();
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 288230376152232960L) != 0)) {
				{
				setState(32);
				methodDeclaration();
				}
			}

			setState(35);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportDeclarationContext extends ParserRuleContext {
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
	 
		public ImportDeclarationContext() { }
		public void copyFrom(ImportDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatementContext extends ImportDeclarationContext {
		public Token ID;
		public List<Token> value = new ArrayList<Token>();
		public List<TerminalNode> ID() { return getTokens(JavammParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JavammParser.ID, i);
		}
		public ImportStatementContext(ImportDeclarationContext ctx) { copyFrom(ctx); }
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_importDeclaration);
		int _la;
		try {
			_localctx = new ImportStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(T__0);
			setState(38);
			((ImportStatementContext)_localctx).ID = match(ID);
			((ImportStatementContext)_localctx).value.add(((ImportStatementContext)_localctx).ID);
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(39);
				match(T__1);
				setState(40);
				((ImportStatementContext)_localctx).ID = match(ID);
				((ImportStatementContext)_localctx).value.add(((ImportStatementContext)_localctx).ID);
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
	 
		public ClassDeclarationContext() { }
		public void copyFrom(ClassDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclContext extends ClassDeclarationContext {
		public Token className;
		public Token superClassName;
		public List<TerminalNode> ID() { return getTokens(JavammParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JavammParser.ID, i);
		}
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public ClassDeclContext(ClassDeclarationContext ctx) { copyFrom(ctx); }
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDeclaration);
		int _la;
		try {
			int _alt;
			_localctx = new ClassDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__3);
			setState(49);
			((ClassDeclContext)_localctx).className = match(ID);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(50);
				match(T__4);
				setState(51);
				((ClassDeclContext)_localctx).superClassName = match(ID);
				}
			}

			setState(54);
			match(T__5);
			setState(58);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(55);
					fieldDeclaration();
					}
					} 
				}
				setState(60);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 288230376152232960L) != 0)) {
				{
				{
				setState(61);
				methodDeclaration();
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			match(T__6);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public Token typeName;
		public TerminalNode ID() { return getToken(JavammParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(70);
				((TypeContext)_localctx).typeName = match(T__9);
				}
				break;
			case 2:
				{
				setState(71);
				((TypeContext)_localctx).typeName = match(T__9);
				setState(72);
				match(T__10);
				}
				break;
			case 3:
				{
				setState(73);
				((TypeContext)_localctx).typeName = match(T__11);
				}
				break;
			case 4:
				{
				setState(74);
				((TypeContext)_localctx).typeName = match(T__12);
				}
				break;
			case 5:
				{
				setState(75);
				((TypeContext)_localctx).typeName = match(T__13);
				}
				break;
			case 6:
				{
				setState(76);
				((TypeContext)_localctx).typeName = match(T__14);
				}
				break;
			case 7:
				{
				setState(77);
				((TypeContext)_localctx).typeName = match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(85);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(80);
					if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
					setState(81);
					match(T__7);
					setState(82);
					match(T__8);
					}
					} 
				}
				setState(87);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FieldDeclarationContext extends ParserRuleContext {
		public Token fieldName;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(JavammParser.ID, 0); }
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			type(0);
			setState(89);
			((FieldDeclarationContext)_localctx).fieldName = match(ID);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(90);
				match(T__7);
				setState(91);
				match(T__8);
				}
			}

			setState(94);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
	 
		public MethodDeclarationContext() { }
		public void copyFrom(MethodDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethDeclarationContext extends MethodDeclarationContext {
		public TypeContext returnType;
		public Token methodName;
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(JavammParser.ID, 0); }
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public MethDeclarationContext(MethodDeclarationContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MainMethDeclarationContext extends MethodDeclarationContext {
		public Token argName;
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TerminalNode ID() { return getToken(JavammParser.ID, 0); }
		public MainMethDeclarationContext(MethodDeclarationContext ctx) { copyFrom(ctx); }
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_methodDeclaration);
		int _la;
		try {
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new MethDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 458752L) != 0)) {
					{
					setState(96);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 458752L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(99);
				((MethDeclarationContext)_localctx).returnType = type(0);
				setState(100);
				((MethDeclarationContext)_localctx).methodName = match(ID);
				setState(101);
				match(T__18);
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 288230376151774208L) != 0)) {
					{
					{
					setState(102);
					argument();
					}
					}
					setState(107);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__19) {
					{
					{
					setState(108);
					match(T__19);
					setState(109);
					argument();
					}
					}
					setState(114);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(115);
				match(T__20);
				setState(116);
				methodBody();
				}
				break;
			case 2:
				_localctx = new MainMethDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				match(T__15);
				setState(119);
				match(T__21);
				setState(120);
				match(T__22);
				setState(121);
				match(T__23);
				setState(122);
				match(T__18);
				setState(123);
				match(T__12);
				setState(124);
				match(T__7);
				setState(125);
				match(T__8);
				setState(126);
				((MainMethDeclarationContext)_localctx).argName = match(ID);
				setState(127);
				match(T__20);
				setState(128);
				methodBody();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentContext extends ParserRuleContext {
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
	 
		public ArgumentContext() { }
		public void copyFrom(ArgumentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentDeclContext extends ArgumentContext {
		public Token argName;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(JavammParser.ID, 0); }
		public ArgumentDeclContext(ArgumentContext ctx) { copyFrom(ctx); }
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_argument);
		try {
			_localctx = new ArgumentDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			type(0);
			setState(132);
			((ArgumentDeclContext)_localctx).argName = match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MethodBodyContext extends ParserRuleContext {
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_methodBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__5);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 435723278276425024L) != 0)) {
				{
				setState(141);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(135);
					fieldDeclaration();
					}
					break;
				case 2:
					{
					setState(136);
					statement();
					}
					break;
				case 3:
					{
					setState(137);
					match(T__24);
					setState(138);
					expression(0);
					setState(139);
					match(T__2);
					}
					break;
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146);
			match(T__6);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ID() { return getToken(JavammParser.ID, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		int _la;
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				expression(0);
				setState(149);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				match(T__5);
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 435723278242808128L) != 0)) {
					{
					{
					setState(152);
					statement();
					}
					}
					setState(157);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(158);
				match(T__6);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				match(T__25);
				setState(160);
				match(T__18);
				setState(161);
				expression(0);
				setState(162);
				match(T__20);
				setState(163);
				statement();
				setState(166);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(164);
					match(T__26);
					setState(165);
					statement();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(168);
				match(T__27);
				setState(169);
				match(T__18);
				setState(170);
				expression(0);
				setState(171);
				match(T__20);
				setState(172);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(174);
				match(ID);
				setState(175);
				match(T__28);
				setState(176);
				expression(0);
				setState(177);
				match(T__2);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(179);
				match(ID);
				setState(180);
				match(T__7);
				setState(181);
				expression(0);
				setState(182);
				match(T__8);
				setState(183);
				match(T__28);
				setState(184);
				expression(0);
				setState(185);
				match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ThisReferenceExpressionContext extends ExpressionContext {
		public ThisReferenceExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayInitializationExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayInitializationExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesisExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesisExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanLiteralContext extends ExpressionContext {
		public BooleanLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallExpressionContext extends ExpressionContext {
		public Token value;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ID() { return getToken(JavammParser.ID, 0); }
		public FunctionCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinaryExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BinaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableReferenceExpressionContext extends ExpressionContext {
		public Token variable;
		public Token op;
		public TerminalNode ID() { return getToken(JavammParser.ID, 0); }
		public VariableReferenceExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayLengthExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayLengthExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NewIntArrayExpressionContext extends ExpressionContext {
		public ExpressionContext size;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NewIntArrayExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassInstantiationExpressionContext extends ExpressionContext {
		public Token classname;
		public TerminalNode ID() { return getToken(JavammParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ClassInstantiationExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NegationExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NegationExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayAccessExpressionContext extends ExpressionContext {
		public ExpressionContext index;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayAccessExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntegerLiteralContext extends ExpressionContext {
		public TerminalNode INTEGER() { return getToken(JavammParser.INTEGER, 0); }
		public IntegerLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(190);
				match(T__18);
				setState(191);
				expression(0);
				setState(192);
				match(T__20);
				}
				break;
			case 2:
				{
				_localctx = new NewIntArrayExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(194);
				match(T__29);
				setState(195);
				match(T__9);
				setState(196);
				match(T__7);
				setState(197);
				((NewIntArrayExpressionContext)_localctx).size = expression(0);
				setState(198);
				match(T__8);
				}
				break;
			case 3:
				{
				_localctx = new ClassInstantiationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(200);
				match(T__29);
				setState(201);
				((ClassInstantiationExpressionContext)_localctx).classname = match(ID);
				setState(214);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(202);
					match(T__18);
					setState(211);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 435723277907263744L) != 0)) {
						{
						setState(203);
						expression(0);
						setState(208);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__19) {
							{
							{
							setState(204);
							match(T__19);
							setState(205);
							expression(0);
							}
							}
							setState(210);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(213);
					match(T__20);
					}
					break;
				}
				}
				break;
			case 4:
				{
				_localctx = new ArrayInitializationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(216);
				match(T__7);
				setState(217);
				expression(0);
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__19) {
					{
					{
					setState(218);
					match(T__19);
					setState(219);
					expression(0);
					}
					}
					setState(224);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(225);
				match(T__8);
				}
				break;
			case 5:
				{
				_localctx = new ThisReferenceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(227);
				match(T__31);
				}
				break;
			case 6:
				{
				_localctx = new NegationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(228);
				match(T__32);
				setState(229);
				expression(9);
				}
				break;
			case 7:
				{
				_localctx = new IntegerLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(230);
				match(INTEGER);
				}
				break;
			case 8:
				{
				_localctx = new BooleanLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(231);
				match(T__49);
				}
				break;
			case 9:
				{
				_localctx = new BooleanLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(232);
				match(T__50);
				}
				break;
			case 10:
				{
				_localctx = new VariableReferenceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(233);
				((VariableReferenceExpressionContext)_localctx).variable = match(ID);
				setState(235);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(234);
					((VariableReferenceExpressionContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__51 || _la==T__52) ) {
						((VariableReferenceExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(276);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(274);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(239);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(240);
						_la = _input.LA(1);
						if ( !(_la==T__47 || _la==T__48) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(241);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new ArrayAccessExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(242);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(243);
						match(T__7);
						setState(244);
						((ArrayAccessExpressionContext)_localctx).index = expression(0);
						setState(245);
						match(T__8);
						}
						break;
					case 3:
						{
						_localctx = new FunctionCallExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(247);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(248);
						match(T__1);
						setState(249);
						((FunctionCallExpressionContext)_localctx).value = match(ID);
						setState(250);
						match(T__18);
						setState(259);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 435723277907263744L) != 0)) {
							{
							setState(251);
							expression(0);
							setState(256);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__19) {
								{
								{
								setState(252);
								match(T__19);
								setState(253);
								expression(0);
								}
								}
								setState(258);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(261);
						match(T__20);
						}
						break;
					case 4:
						{
						_localctx = new ArrayLengthExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(262);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(263);
						match(T__1);
						setState(264);
						match(T__30);
						}
						break;
					case 5:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(265);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						{
						setState(266);
						_la = _input.LA(1);
						if ( !(_la==T__33 || _la==T__34) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(267);
						expression(0);
						}
						}
						break;
					case 6:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(268);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						{
						setState(269);
						_la = _input.LA(1);
						if ( !(_la==T__35 || _la==T__36) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(270);
						expression(0);
						}
						}
						break;
					case 7:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(271);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						{
						setState(272);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 281200098803712L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(273);
						expression(0);
						}
						}
						break;
					}
					} 
				}
				setState(278);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return type_sempred((TypeContext)_localctx, predIndex);
		case 9:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 14);
		case 3:
			return precpred(_ctx, 13);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001:\u0118\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0005\u0000\u0016\b\u0000\n\u0000"+
		"\f\u0000\u0019\t\u0000\u0001\u0000\u0005\u0000\u001c\b\u0000\n\u0000\f"+
		"\u0000\u001f\t\u0000\u0001\u0000\u0003\u0000\"\b\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001*\b"+
		"\u0001\n\u0001\f\u0001-\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u00025\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u00029\b\u0002\n\u0002\f\u0002<\t\u0002\u0001\u0002\u0005"+
		"\u0002?\b\u0002\n\u0002\f\u0002B\t\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003O\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003T\b\u0003\n\u0003\f\u0003W\t\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004]\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0003\u0005b\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005h\b\u0005\n\u0005\f\u0005k\t"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005o\b\u0005\n\u0005\f\u0005r\t"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0082\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u008e\b\u0007\n\u0007\f\u0007"+
		"\u0091\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0005\b\u009a\b\b\n\b\f\b\u009d\t\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00a7\b\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00bc"+
		"\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005"+
		"\t\u00cf\b\t\n\t\f\t\u00d2\t\t\u0003\t\u00d4\b\t\u0001\t\u0003\t\u00d7"+
		"\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00dd\b\t\n\t\f\t\u00e0\t"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u00ec\b\t\u0003\t\u00ee\b\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0005\t\u00ff\b\t\n\t\f\t\u0102\t\t\u0003\t"+
		"\u0104\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u0113\b\t\n\t\f\t\u0116"+
		"\t\t\u0001\t\u0000\u0002\u0006\u0012\n\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0000\u0006\u0001\u0000\u0010\u0012\u0001\u000045\u0001\u0000"+
		"01\u0001\u0000\"#\u0001\u0000$%\u0001\u0000&/\u0141\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0002%\u0001\u0000\u0000\u0000\u00040\u0001\u0000\u0000"+
		"\u0000\u0006N\u0001\u0000\u0000\u0000\bX\u0001\u0000\u0000\u0000\n\u0081"+
		"\u0001\u0000\u0000\u0000\f\u0083\u0001\u0000\u0000\u0000\u000e\u0086\u0001"+
		"\u0000\u0000\u0000\u0010\u00bb\u0001\u0000\u0000\u0000\u0012\u00ed\u0001"+
		"\u0000\u0000\u0000\u0014\u0016\u0003\u0002\u0001\u0000\u0015\u0014\u0001"+
		"\u0000\u0000\u0000\u0016\u0019\u0001\u0000\u0000\u0000\u0017\u0015\u0001"+
		"\u0000\u0000\u0000\u0017\u0018\u0001\u0000\u0000\u0000\u0018\u001d\u0001"+
		"\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u001a\u001c\u0003"+
		"\u0004\u0002\u0000\u001b\u001a\u0001\u0000\u0000\u0000\u001c\u001f\u0001"+
		"\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001e\u0001"+
		"\u0000\u0000\u0000\u001e!\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000"+
		"\u0000\u0000 \"\u0003\n\u0005\u0000! \u0001\u0000\u0000\u0000!\"\u0001"+
		"\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#$\u0005\u0000\u0000\u0001"+
		"$\u0001\u0001\u0000\u0000\u0000%&\u0005\u0001\u0000\u0000&+\u0005:\u0000"+
		"\u0000\'(\u0005\u0002\u0000\u0000(*\u0005:\u0000\u0000)\'\u0001\u0000"+
		"\u0000\u0000*-\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000+,\u0001"+
		"\u0000\u0000\u0000,.\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000"+
		"./\u0005\u0003\u0000\u0000/\u0003\u0001\u0000\u0000\u000001\u0005\u0004"+
		"\u0000\u000014\u0005:\u0000\u000023\u0005\u0005\u0000\u000035\u0005:\u0000"+
		"\u000042\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000056\u0001\u0000"+
		"\u0000\u00006:\u0005\u0006\u0000\u000079\u0003\b\u0004\u000087\u0001\u0000"+
		"\u0000\u00009<\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000:;\u0001"+
		"\u0000\u0000\u0000;@\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000"+
		"=?\u0003\n\u0005\u0000>=\u0001\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000"+
		"@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AC\u0001\u0000\u0000"+
		"\u0000B@\u0001\u0000\u0000\u0000CD\u0005\u0007\u0000\u0000D\u0005\u0001"+
		"\u0000\u0000\u0000EF\u0006\u0003\uffff\uffff\u0000FO\u0005\n\u0000\u0000"+
		"GH\u0005\n\u0000\u0000HO\u0005\u000b\u0000\u0000IO\u0005\f\u0000\u0000"+
		"JO\u0005\r\u0000\u0000KO\u0005\u000e\u0000\u0000LO\u0005\u000f\u0000\u0000"+
		"MO\u0005:\u0000\u0000NE\u0001\u0000\u0000\u0000NG\u0001\u0000\u0000\u0000"+
		"NI\u0001\u0000\u0000\u0000NJ\u0001\u0000\u0000\u0000NK\u0001\u0000\u0000"+
		"\u0000NL\u0001\u0000\u0000\u0000NM\u0001\u0000\u0000\u0000OU\u0001\u0000"+
		"\u0000\u0000PQ\n\b\u0000\u0000QR\u0005\b\u0000\u0000RT\u0005\t\u0000\u0000"+
		"SP\u0001\u0000\u0000\u0000TW\u0001\u0000\u0000\u0000US\u0001\u0000\u0000"+
		"\u0000UV\u0001\u0000\u0000\u0000V\u0007\u0001\u0000\u0000\u0000WU\u0001"+
		"\u0000\u0000\u0000XY\u0003\u0006\u0003\u0000Y\\\u0005:\u0000\u0000Z[\u0005"+
		"\b\u0000\u0000[]\u0005\t\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001"+
		"\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^_\u0005\u0003\u0000\u0000"+
		"_\t\u0001\u0000\u0000\u0000`b\u0007\u0000\u0000\u0000a`\u0001\u0000\u0000"+
		"\u0000ab\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000cd\u0003\u0006"+
		"\u0003\u0000de\u0005:\u0000\u0000ei\u0005\u0013\u0000\u0000fh\u0003\f"+
		"\u0006\u0000gf\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000ig\u0001"+
		"\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jp\u0001\u0000\u0000\u0000"+
		"ki\u0001\u0000\u0000\u0000lm\u0005\u0014\u0000\u0000mo\u0003\f\u0006\u0000"+
		"nl\u0001\u0000\u0000\u0000or\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000"+
		"\u0000pq\u0001\u0000\u0000\u0000qs\u0001\u0000\u0000\u0000rp\u0001\u0000"+
		"\u0000\u0000st\u0005\u0015\u0000\u0000tu\u0003\u000e\u0007\u0000u\u0082"+
		"\u0001\u0000\u0000\u0000vw\u0005\u0010\u0000\u0000wx\u0005\u0016\u0000"+
		"\u0000xy\u0005\u0017\u0000\u0000yz\u0005\u0018\u0000\u0000z{\u0005\u0013"+
		"\u0000\u0000{|\u0005\r\u0000\u0000|}\u0005\b\u0000\u0000}~\u0005\t\u0000"+
		"\u0000~\u007f\u0005:\u0000\u0000\u007f\u0080\u0005\u0015\u0000\u0000\u0080"+
		"\u0082\u0003\u000e\u0007\u0000\u0081a\u0001\u0000\u0000\u0000\u0081v\u0001"+
		"\u0000\u0000\u0000\u0082\u000b\u0001\u0000\u0000\u0000\u0083\u0084\u0003"+
		"\u0006\u0003\u0000\u0084\u0085\u0005:\u0000\u0000\u0085\r\u0001\u0000"+
		"\u0000\u0000\u0086\u008f\u0005\u0006\u0000\u0000\u0087\u008e\u0003\b\u0004"+
		"\u0000\u0088\u008e\u0003\u0010\b\u0000\u0089\u008a\u0005\u0019\u0000\u0000"+
		"\u008a\u008b\u0003\u0012\t\u0000\u008b\u008c\u0005\u0003\u0000\u0000\u008c"+
		"\u008e\u0001\u0000\u0000\u0000\u008d\u0087\u0001\u0000\u0000\u0000\u008d"+
		"\u0088\u0001\u0000\u0000\u0000\u008d\u0089\u0001\u0000\u0000\u0000\u008e"+
		"\u0091\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f"+
		"\u0090\u0001\u0000\u0000\u0000\u0090\u0092\u0001\u0000\u0000\u0000\u0091"+
		"\u008f\u0001\u0000\u0000\u0000\u0092\u0093\u0005\u0007\u0000\u0000\u0093"+
		"\u000f\u0001\u0000\u0000\u0000\u0094\u0095\u0003\u0012\t\u0000\u0095\u0096"+
		"\u0005\u0003\u0000\u0000\u0096\u00bc\u0001\u0000\u0000\u0000\u0097\u009b"+
		"\u0005\u0006\u0000\u0000\u0098\u009a\u0003\u0010\b\u0000\u0099\u0098\u0001"+
		"\u0000\u0000\u0000\u009a\u009d\u0001\u0000\u0000\u0000\u009b\u0099\u0001"+
		"\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009e\u0001"+
		"\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009e\u00bc\u0005"+
		"\u0007\u0000\u0000\u009f\u00a0\u0005\u001a\u0000\u0000\u00a0\u00a1\u0005"+
		"\u0013\u0000\u0000\u00a1\u00a2\u0003\u0012\t\u0000\u00a2\u00a3\u0005\u0015"+
		"\u0000\u0000\u00a3\u00a6\u0003\u0010\b\u0000\u00a4\u00a5\u0005\u001b\u0000"+
		"\u0000\u00a5\u00a7\u0003\u0010\b\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00bc\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a9\u0005\u001c\u0000\u0000\u00a9\u00aa\u0005\u0013\u0000\u0000"+
		"\u00aa\u00ab\u0003\u0012\t\u0000\u00ab\u00ac\u0005\u0015\u0000\u0000\u00ac"+
		"\u00ad\u0003\u0010\b\u0000\u00ad\u00bc\u0001\u0000\u0000\u0000\u00ae\u00af"+
		"\u0005:\u0000\u0000\u00af\u00b0\u0005\u001d\u0000\u0000\u00b0\u00b1\u0003"+
		"\u0012\t\u0000\u00b1\u00b2\u0005\u0003\u0000\u0000\u00b2\u00bc\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b4\u0005:\u0000\u0000\u00b4\u00b5\u0005\b\u0000"+
		"\u0000\u00b5\u00b6\u0003\u0012\t\u0000\u00b6\u00b7\u0005\t\u0000\u0000"+
		"\u00b7\u00b8\u0005\u001d\u0000\u0000\u00b8\u00b9\u0003\u0012\t\u0000\u00b9"+
		"\u00ba\u0005\u0003\u0000\u0000\u00ba\u00bc\u0001\u0000\u0000\u0000\u00bb"+
		"\u0094\u0001\u0000\u0000\u0000\u00bb\u0097\u0001\u0000\u0000\u0000\u00bb"+
		"\u009f\u0001\u0000\u0000\u0000\u00bb\u00a8\u0001\u0000\u0000\u0000\u00bb"+
		"\u00ae\u0001\u0000\u0000\u0000\u00bb\u00b3\u0001\u0000\u0000\u0000\u00bc"+
		"\u0011\u0001\u0000\u0000\u0000\u00bd\u00be\u0006\t\uffff\uffff\u0000\u00be"+
		"\u00bf\u0005\u0013\u0000\u0000\u00bf\u00c0\u0003\u0012\t\u0000\u00c0\u00c1"+
		"\u0005\u0015\u0000\u0000\u00c1\u00ee\u0001\u0000\u0000\u0000\u00c2\u00c3"+
		"\u0005\u001e\u0000\u0000\u00c3\u00c4\u0005\n\u0000\u0000\u00c4\u00c5\u0005"+
		"\b\u0000\u0000\u00c5\u00c6\u0003\u0012\t\u0000\u00c6\u00c7\u0005\t\u0000"+
		"\u0000\u00c7\u00ee\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005\u001e\u0000"+
		"\u0000\u00c9\u00d6\u0005:\u0000\u0000\u00ca\u00d3\u0005\u0013\u0000\u0000"+
		"\u00cb\u00d0\u0003\u0012\t\u0000\u00cc\u00cd\u0005\u0014\u0000\u0000\u00cd"+
		"\u00cf\u0003\u0012\t\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00cf\u00d2"+
		"\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d1"+
		"\u0001\u0000\u0000\u0000\u00d1\u00d4\u0001\u0000\u0000\u0000\u00d2\u00d0"+
		"\u0001\u0000\u0000\u0000\u00d3\u00cb\u0001\u0000\u0000\u0000\u00d3\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\u00d7"+
		"\u0005\u0015\u0000\u0000\u00d6\u00ca\u0001\u0000\u0000\u0000\u00d6\u00d7"+
		"\u0001\u0000\u0000\u0000\u00d7\u00ee\u0001\u0000\u0000\u0000\u00d8\u00d9"+
		"\u0005\b\u0000\u0000\u00d9\u00de\u0003\u0012\t\u0000\u00da\u00db\u0005"+
		"\u0014\u0000\u0000\u00db\u00dd\u0003\u0012\t\u0000\u00dc\u00da\u0001\u0000"+
		"\u0000\u0000\u00dd\u00e0\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000"+
		"\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e1\u0001\u0000"+
		"\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005\t\u0000"+
		"\u0000\u00e2\u00ee\u0001\u0000\u0000\u0000\u00e3\u00ee\u0005 \u0000\u0000"+
		"\u00e4\u00e5\u0005!\u0000\u0000\u00e5\u00ee\u0003\u0012\t\t\u00e6\u00ee"+
		"\u00059\u0000\u0000\u00e7\u00ee\u00052\u0000\u0000\u00e8\u00ee\u00053"+
		"\u0000\u0000\u00e9\u00eb\u0005:\u0000\u0000\u00ea\u00ec\u0007\u0001\u0000"+
		"\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000"+
		"\u0000\u00ec\u00ee\u0001\u0000\u0000\u0000\u00ed\u00bd\u0001\u0000\u0000"+
		"\u0000\u00ed\u00c2\u0001\u0000\u0000\u0000\u00ed\u00c8\u0001\u0000\u0000"+
		"\u0000\u00ed\u00d8\u0001\u0000\u0000\u0000\u00ed\u00e3\u0001\u0000\u0000"+
		"\u0000\u00ed\u00e4\u0001\u0000\u0000\u0000\u00ed\u00e6\u0001\u0000\u0000"+
		"\u0000\u00ed\u00e7\u0001\u0000\u0000\u0000\u00ed\u00e8\u0001\u0000\u0000"+
		"\u0000\u00ed\u00e9\u0001\u0000\u0000\u0000\u00ee\u0114\u0001\u0000\u0000"+
		"\u0000\u00ef\u00f0\n\u0005\u0000\u0000\u00f0\u00f1\u0007\u0002\u0000\u0000"+
		"\u00f1\u0113\u0003\u0012\t\u0006\u00f2\u00f3\n\u000e\u0000\u0000\u00f3"+
		"\u00f4\u0005\b\u0000\u0000\u00f4\u00f5\u0003\u0012\t\u0000\u00f5\u00f6"+
		"\u0005\t\u0000\u0000\u00f6\u0113\u0001\u0000\u0000\u0000\u00f7\u00f8\n"+
		"\r\u0000\u0000\u00f8\u00f9\u0005\u0002\u0000\u0000\u00f9\u00fa\u0005:"+
		"\u0000\u0000\u00fa\u0103\u0005\u0013\u0000\u0000\u00fb\u0100\u0003\u0012"+
		"\t\u0000\u00fc\u00fd\u0005\u0014\u0000\u0000\u00fd\u00ff\u0003\u0012\t"+
		"\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00ff\u0102\u0001\u0000\u0000"+
		"\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000"+
		"\u0000\u0101\u0104\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000"+
		"\u0000\u0103\u00fb\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000"+
		"\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u0113\u0005\u0015\u0000"+
		"\u0000\u0106\u0107\n\f\u0000\u0000\u0107\u0108\u0005\u0002\u0000\u0000"+
		"\u0108\u0113\u0005\u001f\u0000\u0000\u0109\u010a\n\b\u0000\u0000\u010a"+
		"\u010b\u0007\u0003\u0000\u0000\u010b\u0113\u0003\u0012\t\u0000\u010c\u010d"+
		"\n\u0007\u0000\u0000\u010d\u010e\u0007\u0004\u0000\u0000\u010e\u0113\u0003"+
		"\u0012\t\u0000\u010f\u0110\n\u0006\u0000\u0000\u0110\u0111\u0007\u0005"+
		"\u0000\u0000\u0111\u0113\u0003\u0012\t\u0000\u0112\u00ef\u0001\u0000\u0000"+
		"\u0000\u0112\u00f2\u0001\u0000\u0000\u0000\u0112\u00f7\u0001\u0000\u0000"+
		"\u0000\u0112\u0106\u0001\u0000\u0000\u0000\u0112\u0109\u0001\u0000\u0000"+
		"\u0000\u0112\u010c\u0001\u0000\u0000\u0000\u0112\u010f\u0001\u0000\u0000"+
		"\u0000\u0113\u0116\u0001\u0000\u0000\u0000\u0114\u0112\u0001\u0000\u0000"+
		"\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115\u0013\u0001\u0000\u0000"+
		"\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u001d\u0017\u001d!+4:@NU\\"+
		"aip\u0081\u008d\u008f\u009b\u00a6\u00bb\u00d0\u00d3\u00d6\u00de\u00eb"+
		"\u00ed\u0100\u0103\u0112\u0114";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}