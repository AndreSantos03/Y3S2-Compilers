// Generated from c:/Users/NASA/Desktop/comp2024-10e/src/main/antlr/comp2024/Javamm.g4 by ANTLR 4.13.1

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
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, WS=44, SINGLE_COMMENT=45, 
		MULTI_COMMENT=46, INTEGER=47, ID=48;
	public static final int
		RULE_program = 0, RULE_importDeclaration = 1, RULE_classDeclaration = 2, 
		RULE_type = 3, RULE_fieldDeclaration = 4, RULE_methodDeclaration = 5, 
		RULE_returnDeclaration = 6, RULE_argument = 7, RULE_statement = 8, RULE_parameter = 9, 
		RULE_expression = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "importDeclaration", "classDeclaration", "type", "fieldDeclaration", 
			"methodDeclaration", "returnDeclaration", "argument", "statement", "parameter", 
			"expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'.'", "';'", "'public'", "'class'", "'extends'", "'{'", 
			"'}'", "'['", "']'", "'int'", "'...'", "'boolean'", "'String'", "'static'", 
			"'('", "','", "')'", "'void'", "'main'", "'return'", "'if'", "'else'", 
			"'while'", "'='", "'new'", "'length'", "'this'", "'!'", "'*'", "'/'", 
			"'+'", "'-'", "'<'", "'>'", "'=='", "'!='", "'&&'", "'||'", "'true'", 
			"'false'", "'++'", "'--'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "WS", "SINGLE_COMMENT", 
			"MULTI_COMMENT", "INTEGER", "ID"
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
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public TerminalNode EOF() { return getToken(JavammParser.EOF, 0); }
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
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
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(22);
				importDeclaration();
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(28);
			classDeclaration();
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 281474976770064L) != 0)) {
				{
				setState(29);
				methodDeclaration();
				}
			}

			setState(32);
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
		public Token value;
		public Token function;
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
			setState(34);
			match(T__0);
			setState(35);
			((ImportStatementContext)_localctx).value = match(ID);
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(36);
				match(T__1);
				setState(37);
				((ImportStatementContext)_localctx).function = match(ID);
				}
			}

			setState(40);
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
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(42);
				match(T__3);
				}
			}

			setState(45);
			match(T__4);
			setState(46);
			((ClassDeclContext)_localctx).className = match(ID);
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(47);
				match(T__5);
				setState(48);
				((ClassDeclContext)_localctx).superClassName = match(ID);
				}
			}

			setState(51);
			match(T__6);
			setState(55);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(52);
					fieldDeclaration();
					}
					} 
				}
				setState(57);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 281474976770064L) != 0)) {
				{
				{
				setState(58);
				methodDeclaration();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
			match(T__7);
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
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayContext extends TypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArrayContext(TypeContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanContext extends TypeContext {
		public Token typeName;
		public BooleanContext(TypeContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends TypeContext {
		public Token typeName;
		public StringContext(TypeContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarargContext extends TypeContext {
		public Token typeName;
		public VarargContext(TypeContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends TypeContext {
		public Token typeName;
		public TerminalNode ID() { return getToken(JavammParser.ID, 0); }
		public IdContext(TypeContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntContext extends TypeContext {
		public Token typeName;
		public IntContext(TypeContext ctx) { copyFrom(ctx); }
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
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(67);
				((IntContext)_localctx).typeName = match(T__10);
				}
				break;
			case 2:
				{
				_localctx = new VarargContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(68);
				((VarargContext)_localctx).typeName = match(T__10);
				setState(69);
				match(T__11);
				}
				break;
			case 3:
				{
				_localctx = new BooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(70);
				((BooleanContext)_localctx).typeName = match(T__12);
				}
				break;
			case 4:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(71);
				((StringContext)_localctx).typeName = match(T__13);
				}
				break;
			case 5:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(72);
				((IdContext)_localctx).typeName = match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(80);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArrayContext(new TypeContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(75);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(76);
					match(T__8);
					setState(77);
					match(T__9);
					}
					} 
				}
				setState(82);
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
		public Token variable;
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
			setState(83);
			type(0);
			setState(84);
			((FieldDeclarationContext)_localctx).variable = match(ID);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(85);
				match(T__8);
				setState(86);
				match(T__9);
				}
			}

			setState(89);
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
		public Token isStatic;
		public TypeContext returnType;
		public Token methodName;
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
		public ReturnDeclarationContext returnDeclaration() {
			return getRuleContext(ReturnDeclarationContext.class,0);
		}
		public MethDeclarationContext(MethodDeclarationContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MainMethDeclarationContext extends MethodDeclarationContext {
		public Token argName;
		public TerminalNode ID() { return getToken(JavammParser.ID, 0); }
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
		public MainMethDeclarationContext(MethodDeclarationContext ctx) { copyFrom(ctx); }
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_methodDeclaration);
		int _la;
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new MethDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(91);
					match(T__3);
					}
				}

				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(94);
					((MethDeclarationContext)_localctx).isStatic = match(T__14);
					}
				}

				setState(97);
				((MethDeclarationContext)_localctx).returnType = type(0);
				setState(98);
				((MethDeclarationContext)_localctx).methodName = match(ID);
				setState(99);
				match(T__15);
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 281474976737280L) != 0)) {
					{
					setState(100);
					argument();
					}
				}

				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__16) {
					{
					{
					setState(103);
					match(T__16);
					setState(104);
					argument();
					}
					}
					setState(109);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(110);
				match(T__17);
				setState(111);
				match(T__6);
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 425511893428864L) != 0)) {
					{
					setState(114);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						setState(112);
						fieldDeclaration();
						}
						break;
					case 2:
						{
						setState(113);
						statement();
						}
						break;
					}
					}
					setState(118);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(119);
					returnDeclaration();
					}
				}

				setState(122);
				match(T__7);
				}
				break;
			case 2:
				_localctx = new MainMethDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				match(T__3);
				setState(125);
				match(T__14);
				setState(126);
				match(T__18);
				setState(127);
				match(T__19);
				setState(128);
				match(T__15);
				setState(129);
				match(T__13);
				setState(130);
				match(T__8);
				setState(131);
				match(T__9);
				setState(132);
				((MainMethDeclarationContext)_localctx).argName = match(ID);
				setState(133);
				match(T__17);
				setState(134);
				match(T__6);
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 425511893428864L) != 0)) {
					{
					setState(137);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
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
					}
					}
					setState(141);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(142);
				match(T__7);
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
	public static class ReturnDeclarationContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnDeclaration; }
	}

	public final ReturnDeclarationContext returnDeclaration() throws RecognitionException {
		ReturnDeclarationContext _localctx = new ReturnDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_returnDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(T__20);
			setState(146);
			expression(0);
			setState(147);
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
		enterRule(_localctx, 14, RULE_argument);
		try {
			_localctx = new ArgumentDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			type(0);
			setState(150);
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
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends StatementContext {
		public Token variable;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ID() { return getToken(JavammParser.ID, 0); }
		public AssignmentContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends StatementContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentArrayContext extends StatementContext {
		public Token variable;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ID() { return getToken(JavammParser.ID, 0); }
		public AssignmentArrayContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleExpressionContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SimpleExpressionContext(StatementContext ctx) { copyFrom(ctx); }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		int _la;
		try {
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new SimpleExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				expression(0);
				setState(153);
				match(T__2);
				}
				break;
			case 2:
				_localctx = new BlockContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(T__6);
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 425511893402240L) != 0)) {
					{
					{
					setState(156);
					statement();
					}
					}
					setState(161);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(162);
				match(T__7);
				}
				break;
			case 3:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(163);
				match(T__21);
				setState(164);
				match(T__15);
				setState(165);
				expression(0);
				setState(166);
				match(T__17);
				setState(167);
				statement();
				{
				setState(168);
				match(T__22);
				setState(169);
				statement();
				}
				}
				break;
			case 4:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(171);
				match(T__23);
				setState(172);
				match(T__15);
				setState(173);
				expression(0);
				setState(174);
				match(T__17);
				setState(175);
				statement();
				}
				break;
			case 5:
				_localctx = new AssignmentContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(177);
				((AssignmentContext)_localctx).variable = match(ID);
				setState(178);
				match(T__24);
				setState(179);
				expression(0);
				setState(180);
				match(T__2);
				}
				break;
			case 6:
				_localctx = new AssignmentArrayContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(182);
				((AssignmentArrayContext)_localctx).variable = match(ID);
				setState(183);
				match(T__8);
				setState(184);
				expression(0);
				setState(185);
				match(T__9);
				setState(186);
				match(T__24);
				setState(187);
				expression(0);
				setState(188);
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
	public static class ParameterContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			expression(0);
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(193);
				match(T__16);
				setState(194);
				expression(0);
				}
				}
				setState(199);
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
		public Token value;
		public BooleanLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallExpressionContext extends ExpressionContext {
		public Token value;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ID() { return getToken(JavammParser.ID, 0); }
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public FunctionCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinaryExpressionContext extends ExpressionContext {
		public Token operation;
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
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(201);
				match(T__15);
				setState(202);
				expression(0);
				setState(203);
				match(T__17);
				}
				break;
			case 2:
				{
				_localctx = new NewIntArrayExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(205);
				match(T__25);
				setState(206);
				match(T__10);
				setState(207);
				match(T__8);
				setState(208);
				((NewIntArrayExpressionContext)_localctx).size = expression(0);
				setState(209);
				match(T__9);
				}
				break;
			case 3:
				{
				_localctx = new ClassInstantiationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(211);
				match(T__25);
				setState(212);
				((ClassInstantiationExpressionContext)_localctx).classname = match(ID);
				setState(213);
				match(T__15);
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 425511872430592L) != 0)) {
					{
					setState(214);
					parameter();
					}
				}

				setState(217);
				match(T__17);
				}
				break;
			case 4:
				{
				_localctx = new ArrayInitializationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(218);
				match(T__8);
				setState(219);
				expression(0);
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__16) {
					{
					{
					setState(220);
					match(T__16);
					setState(221);
					expression(0);
					}
					}
					setState(226);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(227);
				match(T__9);
				}
				break;
			case 5:
				{
				_localctx = new ThisReferenceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(229);
				match(T__27);
				}
				break;
			case 6:
				{
				_localctx = new NegationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(230);
				match(T__28);
				setState(231);
				expression(9);
				}
				break;
			case 7:
				{
				_localctx = new IntegerLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(232);
				match(INTEGER);
				}
				break;
			case 8:
				{
				_localctx = new BooleanLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(233);
				((BooleanLiteralContext)_localctx).value = match(T__39);
				}
				break;
			case 9:
				{
				_localctx = new BooleanLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(234);
				((BooleanLiteralContext)_localctx).value = match(T__40);
				}
				break;
			case 10:
				{
				_localctx = new VariableReferenceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(235);
				((VariableReferenceExpressionContext)_localctx).variable = match(ID);
				setState(237);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(236);
					((VariableReferenceExpressionContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__41 || _la==T__42) ) {
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
			setState(271);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(269);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(241);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(242);
						((BinaryExpressionContext)_localctx).operation = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__37 || _la==T__38) ) {
							((BinaryExpressionContext)_localctx).operation = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(243);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new ArrayAccessExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(244);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(245);
						match(T__8);
						setState(246);
						((ArrayAccessExpressionContext)_localctx).index = expression(0);
						setState(247);
						match(T__9);
						}
						break;
					case 3:
						{
						_localctx = new FunctionCallExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(249);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(250);
						match(T__1);
						setState(251);
						((FunctionCallExpressionContext)_localctx).value = match(ID);
						setState(252);
						match(T__15);
						setState(254);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 425511872430592L) != 0)) {
							{
							setState(253);
							parameter();
							}
						}

						setState(256);
						match(T__17);
						}
						break;
					case 4:
						{
						_localctx = new ArrayLengthExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(257);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(258);
						match(T__1);
						setState(259);
						match(T__26);
						}
						break;
					case 5:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(260);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						{
						setState(261);
						((BinaryExpressionContext)_localctx).operation = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__29 || _la==T__30) ) {
							((BinaryExpressionContext)_localctx).operation = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(262);
						expression(0);
						}
						}
						break;
					case 6:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(263);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						{
						setState(264);
						((BinaryExpressionContext)_localctx).operation = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__31 || _la==T__32) ) {
							((BinaryExpressionContext)_localctx).operation = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(265);
						expression(0);
						}
						}
						break;
					case 7:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(266);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						{
						setState(267);
						((BinaryExpressionContext)_localctx).operation = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 257698037760L) != 0)) ) {
							((BinaryExpressionContext)_localctx).operation = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(268);
						expression(0);
						}
						}
						break;
					}
					} 
				}
				setState(273);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return type_sempred((TypeContext)_localctx, predIndex);
		case 10:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
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
		"\u0004\u00010\u0113\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0005\u0000\u0018"+
		"\b\u0000\n\u0000\f\u0000\u001b\t\u0000\u0001\u0000\u0001\u0000\u0003\u0000"+
		"\u001f\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\'\b\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0003\u0002,\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u00022\b\u0002\u0001\u0002\u0001\u0002\u0005\u00026\b\u0002\n\u0002"+
		"\f\u00029\t\u0002\u0001\u0002\u0005\u0002<\b\u0002\n\u0002\f\u0002?\t"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003J\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u0003O\b\u0003\n\u0003\f\u0003R\t"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004X\b"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0003\u0005]\b\u0005\u0001"+
		"\u0005\u0003\u0005`\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005f\b\u0005\u0001\u0005\u0001\u0005\u0005\u0005j\b\u0005"+
		"\n\u0005\f\u0005m\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005s\b\u0005\n\u0005\f\u0005v\t\u0005\u0001\u0005\u0003\u0005"+
		"y\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u008a\b\u0005"+
		"\n\u0005\f\u0005\u008d\t\u0005\u0001\u0005\u0003\u0005\u0090\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u009e\b\b\n\b\f"+
		"\b\u00a1\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u00bf\b\b\u0001\t\u0001\t\u0001\t\u0005\t\u00c4"+
		"\b\t\n\t\f\t\u00c7\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u00d8\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00df"+
		"\b\n\n\n\f\n\u00e2\t\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00ee\b\n\u0003\n\u00f0\b\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u00ff\b\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0005\n\u010e\b\n\n\n\f\n\u0111\t\n\u0001\n\u0000\u0002\u0006\u0014"+
		"\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000\u0005"+
		"\u0001\u0000*+\u0001\u0000&\'\u0001\u0000\u001e\u001f\u0001\u0000 !\u0001"+
		"\u0000\"%\u0139\u0000\u0019\u0001\u0000\u0000\u0000\u0002\"\u0001\u0000"+
		"\u0000\u0000\u0004+\u0001\u0000\u0000\u0000\u0006I\u0001\u0000\u0000\u0000"+
		"\bS\u0001\u0000\u0000\u0000\n\u008f\u0001\u0000\u0000\u0000\f\u0091\u0001"+
		"\u0000\u0000\u0000\u000e\u0095\u0001\u0000\u0000\u0000\u0010\u00be\u0001"+
		"\u0000\u0000\u0000\u0012\u00c0\u0001\u0000\u0000\u0000\u0014\u00ef\u0001"+
		"\u0000\u0000\u0000\u0016\u0018\u0003\u0002\u0001\u0000\u0017\u0016\u0001"+
		"\u0000\u0000\u0000\u0018\u001b\u0001\u0000\u0000\u0000\u0019\u0017\u0001"+
		"\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u001c\u0001"+
		"\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001c\u001e\u0003"+
		"\u0004\u0002\u0000\u001d\u001f\u0003\n\u0005\u0000\u001e\u001d\u0001\u0000"+
		"\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000"+
		"\u0000 !\u0005\u0000\u0000\u0001!\u0001\u0001\u0000\u0000\u0000\"#\u0005"+
		"\u0001\u0000\u0000#&\u00050\u0000\u0000$%\u0005\u0002\u0000\u0000%\'\u0005"+
		"0\u0000\u0000&$\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000\'("+
		"\u0001\u0000\u0000\u0000()\u0005\u0003\u0000\u0000)\u0003\u0001\u0000"+
		"\u0000\u0000*,\u0005\u0004\u0000\u0000+*\u0001\u0000\u0000\u0000+,\u0001"+
		"\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-.\u0005\u0005\u0000\u0000"+
		".1\u00050\u0000\u0000/0\u0005\u0006\u0000\u000002\u00050\u0000\u00001"+
		"/\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u000023\u0001\u0000\u0000"+
		"\u000037\u0005\u0007\u0000\u000046\u0003\b\u0004\u000054\u0001\u0000\u0000"+
		"\u000069\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u000078\u0001\u0000"+
		"\u0000\u00008=\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u0000:<\u0003"+
		"\n\u0005\u0000;:\u0001\u0000\u0000\u0000<?\u0001\u0000\u0000\u0000=;\u0001"+
		"\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>@\u0001\u0000\u0000\u0000"+
		"?=\u0001\u0000\u0000\u0000@A\u0005\b\u0000\u0000A\u0005\u0001\u0000\u0000"+
		"\u0000BC\u0006\u0003\uffff\uffff\u0000CJ\u0005\u000b\u0000\u0000DE\u0005"+
		"\u000b\u0000\u0000EJ\u0005\f\u0000\u0000FJ\u0005\r\u0000\u0000GJ\u0005"+
		"\u000e\u0000\u0000HJ\u00050\u0000\u0000IB\u0001\u0000\u0000\u0000ID\u0001"+
		"\u0000\u0000\u0000IF\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000"+
		"IH\u0001\u0000\u0000\u0000JP\u0001\u0000\u0000\u0000KL\n\u0006\u0000\u0000"+
		"LM\u0005\t\u0000\u0000MO\u0005\n\u0000\u0000NK\u0001\u0000\u0000\u0000"+
		"OR\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000"+
		"\u0000Q\u0007\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000ST\u0003"+
		"\u0006\u0003\u0000TW\u00050\u0000\u0000UV\u0005\t\u0000\u0000VX\u0005"+
		"\n\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XY\u0001"+
		"\u0000\u0000\u0000YZ\u0005\u0003\u0000\u0000Z\t\u0001\u0000\u0000\u0000"+
		"[]\u0005\u0004\u0000\u0000\\[\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000"+
		"\u0000]_\u0001\u0000\u0000\u0000^`\u0005\u000f\u0000\u0000_^\u0001\u0000"+
		"\u0000\u0000_`\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ab\u0003"+
		"\u0006\u0003\u0000bc\u00050\u0000\u0000ce\u0005\u0010\u0000\u0000df\u0003"+
		"\u000e\u0007\u0000ed\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000"+
		"fk\u0001\u0000\u0000\u0000gh\u0005\u0011\u0000\u0000hj\u0003\u000e\u0007"+
		"\u0000ig\u0001\u0000\u0000\u0000jm\u0001\u0000\u0000\u0000ki\u0001\u0000"+
		"\u0000\u0000kl\u0001\u0000\u0000\u0000ln\u0001\u0000\u0000\u0000mk\u0001"+
		"\u0000\u0000\u0000no\u0005\u0012\u0000\u0000ot\u0005\u0007\u0000\u0000"+
		"ps\u0003\b\u0004\u0000qs\u0003\u0010\b\u0000rp\u0001\u0000\u0000\u0000"+
		"rq\u0001\u0000\u0000\u0000sv\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000"+
		"\u0000tu\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000vt\u0001\u0000"+
		"\u0000\u0000wy\u0003\f\u0006\u0000xw\u0001\u0000\u0000\u0000xy\u0001\u0000"+
		"\u0000\u0000yz\u0001\u0000\u0000\u0000z{\u0005\b\u0000\u0000{\u0090\u0001"+
		"\u0000\u0000\u0000|}\u0005\u0004\u0000\u0000}~\u0005\u000f\u0000\u0000"+
		"~\u007f\u0005\u0013\u0000\u0000\u007f\u0080\u0005\u0014\u0000\u0000\u0080"+
		"\u0081\u0005\u0010\u0000\u0000\u0081\u0082\u0005\u000e\u0000\u0000\u0082"+
		"\u0083\u0005\t\u0000\u0000\u0083\u0084\u0005\n\u0000\u0000\u0084\u0085"+
		"\u00050\u0000\u0000\u0085\u0086\u0005\u0012\u0000\u0000\u0086\u008b\u0005"+
		"\u0007\u0000\u0000\u0087\u008a\u0003\b\u0004\u0000\u0088\u008a\u0003\u0010"+
		"\b\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u0088\u0001\u0000\u0000"+
		"\u0000\u008a\u008d\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000"+
		"\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008e\u0001\u0000\u0000"+
		"\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008e\u0090\u0005\b\u0000\u0000"+
		"\u008f\\\u0001\u0000\u0000\u0000\u008f|\u0001\u0000\u0000\u0000\u0090"+
		"\u000b\u0001\u0000\u0000\u0000\u0091\u0092\u0005\u0015\u0000\u0000\u0092"+
		"\u0093\u0003\u0014\n\u0000\u0093\u0094\u0005\u0003\u0000\u0000\u0094\r"+
		"\u0001\u0000\u0000\u0000\u0095\u0096\u0003\u0006\u0003\u0000\u0096\u0097"+
		"\u00050\u0000\u0000\u0097\u000f\u0001\u0000\u0000\u0000\u0098\u0099\u0003"+
		"\u0014\n\u0000\u0099\u009a\u0005\u0003\u0000\u0000\u009a\u00bf\u0001\u0000"+
		"\u0000\u0000\u009b\u009f\u0005\u0007\u0000\u0000\u009c\u009e\u0003\u0010"+
		"\b\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009e\u00a1\u0001\u0000\u0000"+
		"\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a2\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000"+
		"\u0000\u00a2\u00bf\u0005\b\u0000\u0000\u00a3\u00a4\u0005\u0016\u0000\u0000"+
		"\u00a4\u00a5\u0005\u0010\u0000\u0000\u00a5\u00a6\u0003\u0014\n\u0000\u00a6"+
		"\u00a7\u0005\u0012\u0000\u0000\u00a7\u00a8\u0003\u0010\b\u0000\u00a8\u00a9"+
		"\u0005\u0017\u0000\u0000\u00a9\u00aa\u0003\u0010\b\u0000\u00aa\u00bf\u0001"+
		"\u0000\u0000\u0000\u00ab\u00ac\u0005\u0018\u0000\u0000\u00ac\u00ad\u0005"+
		"\u0010\u0000\u0000\u00ad\u00ae\u0003\u0014\n\u0000\u00ae\u00af\u0005\u0012"+
		"\u0000\u0000\u00af\u00b0\u0003\u0010\b\u0000\u00b0\u00bf\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b2\u00050\u0000\u0000\u00b2\u00b3\u0005\u0019\u0000\u0000"+
		"\u00b3\u00b4\u0003\u0014\n\u0000\u00b4\u00b5\u0005\u0003\u0000\u0000\u00b5"+
		"\u00bf\u0001\u0000\u0000\u0000\u00b6\u00b7\u00050\u0000\u0000\u00b7\u00b8"+
		"\u0005\t\u0000\u0000\u00b8\u00b9\u0003\u0014\n\u0000\u00b9\u00ba\u0005"+
		"\n\u0000\u0000\u00ba\u00bb\u0005\u0019\u0000\u0000\u00bb\u00bc\u0003\u0014"+
		"\n\u0000\u00bc\u00bd\u0005\u0003\u0000\u0000\u00bd\u00bf\u0001\u0000\u0000"+
		"\u0000\u00be\u0098\u0001\u0000\u0000\u0000\u00be\u009b\u0001\u0000\u0000"+
		"\u0000\u00be\u00a3\u0001\u0000\u0000\u0000\u00be\u00ab\u0001\u0000\u0000"+
		"\u0000\u00be\u00b1\u0001\u0000\u0000\u0000\u00be\u00b6\u0001\u0000\u0000"+
		"\u0000\u00bf\u0011\u0001\u0000\u0000\u0000\u00c0\u00c5\u0003\u0014\n\u0000"+
		"\u00c1\u00c2\u0005\u0011\u0000\u0000\u00c2\u00c4\u0003\u0014\n\u0000\u00c3"+
		"\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c7\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6"+
		"\u0013\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c8"+
		"\u00c9\u0006\n\uffff\uffff\u0000\u00c9\u00ca\u0005\u0010\u0000\u0000\u00ca"+
		"\u00cb\u0003\u0014\n\u0000\u00cb\u00cc\u0005\u0012\u0000\u0000\u00cc\u00f0"+
		"\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005\u001a\u0000\u0000\u00ce\u00cf"+
		"\u0005\u000b\u0000\u0000\u00cf\u00d0\u0005\t\u0000\u0000\u00d0\u00d1\u0003"+
		"\u0014\n\u0000\u00d1\u00d2\u0005\n\u0000\u0000\u00d2\u00f0\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d4\u0005\u001a\u0000\u0000\u00d4\u00d5\u00050\u0000"+
		"\u0000\u00d5\u00d7\u0005\u0010\u0000\u0000\u00d6\u00d8\u0003\u0012\t\u0000"+
		"\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000"+
		"\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u00f0\u0005\u0012\u0000\u0000"+
		"\u00da\u00db\u0005\t\u0000\u0000\u00db\u00e0\u0003\u0014\n\u0000\u00dc"+
		"\u00dd\u0005\u0011\u0000\u0000\u00dd\u00df\u0003\u0014\n\u0000\u00de\u00dc"+
		"\u0001\u0000\u0000\u0000\u00df\u00e2\u0001\u0000\u0000\u0000\u00e0\u00de"+
		"\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e3"+
		"\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e3\u00e4"+
		"\u0005\n\u0000\u0000\u00e4\u00f0\u0001\u0000\u0000\u0000\u00e5\u00f0\u0005"+
		"\u001c\u0000\u0000\u00e6\u00e7\u0005\u001d\u0000\u0000\u00e7\u00f0\u0003"+
		"\u0014\n\t\u00e8\u00f0\u0005/\u0000\u0000\u00e9\u00f0\u0005(\u0000\u0000"+
		"\u00ea\u00f0\u0005)\u0000\u0000\u00eb\u00ed\u00050\u0000\u0000\u00ec\u00ee"+
		"\u0007\u0000\u0000\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ed\u00ee"+
		"\u0001\u0000\u0000\u0000\u00ee\u00f0\u0001\u0000\u0000\u0000\u00ef\u00c8"+
		"\u0001\u0000\u0000\u0000\u00ef\u00cd\u0001\u0000\u0000\u0000\u00ef\u00d3"+
		"\u0001\u0000\u0000\u0000\u00ef\u00da\u0001\u0000\u0000\u0000\u00ef\u00e5"+
		"\u0001\u0000\u0000\u0000\u00ef\u00e6\u0001\u0000\u0000\u0000\u00ef\u00e8"+
		"\u0001\u0000\u0000\u0000\u00ef\u00e9\u0001\u0000\u0000\u0000\u00ef\u00ea"+
		"\u0001\u0000\u0000\u0000\u00ef\u00eb\u0001\u0000\u0000\u0000\u00f0\u010f"+
		"\u0001\u0000\u0000\u0000\u00f1\u00f2\n\u0005\u0000\u0000\u00f2\u00f3\u0007"+
		"\u0001\u0000\u0000\u00f3\u010e\u0003\u0014\n\u0006\u00f4\u00f5\n\u000e"+
		"\u0000\u0000\u00f5\u00f6\u0005\t\u0000\u0000\u00f6\u00f7\u0003\u0014\n"+
		"\u0000\u00f7\u00f8\u0005\n\u0000\u0000\u00f8\u010e\u0001\u0000\u0000\u0000"+
		"\u00f9\u00fa\n\r\u0000\u0000\u00fa\u00fb\u0005\u0002\u0000\u0000\u00fb"+
		"\u00fc\u00050\u0000\u0000\u00fc\u00fe\u0005\u0010\u0000\u0000\u00fd\u00ff"+
		"\u0003\u0012\t\u0000\u00fe\u00fd\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001"+
		"\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u010e\u0005"+
		"\u0012\u0000\u0000\u0101\u0102\n\f\u0000\u0000\u0102\u0103\u0005\u0002"+
		"\u0000\u0000\u0103\u010e\u0005\u001b\u0000\u0000\u0104\u0105\n\b\u0000"+
		"\u0000\u0105\u0106\u0007\u0002\u0000\u0000\u0106\u010e\u0003\u0014\n\u0000"+
		"\u0107\u0108\n\u0007\u0000\u0000\u0108\u0109\u0007\u0003\u0000\u0000\u0109"+
		"\u010e\u0003\u0014\n\u0000\u010a\u010b\n\u0006\u0000\u0000\u010b\u010c"+
		"\u0007\u0004\u0000\u0000\u010c\u010e\u0003\u0014\n\u0000\u010d\u00f1\u0001"+
		"\u0000\u0000\u0000\u010d\u00f4\u0001\u0000\u0000\u0000\u010d\u00f9\u0001"+
		"\u0000\u0000\u0000\u010d\u0101\u0001\u0000\u0000\u0000\u010d\u0104\u0001"+
		"\u0000\u0000\u0000\u010d\u0107\u0001\u0000\u0000\u0000\u010d\u010a\u0001"+
		"\u0000\u0000\u0000\u010e\u0111\u0001\u0000\u0000\u0000\u010f\u010d\u0001"+
		"\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u0015\u0001"+
		"\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u001e\u0019\u001e"+
		"&+17=IPW\\_ekrtx\u0089\u008b\u008f\u009f\u00be\u00c5\u00d7\u00e0\u00ed"+
		"\u00ef\u00fe\u010d\u010f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}