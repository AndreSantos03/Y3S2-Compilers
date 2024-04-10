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
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, WS=45, SINGLE_COMMENT=46, 
		MULTI_COMMENT=47, INTEGER=48, ID=49;
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
			"'}'", "'['", "']'", "'int'", "'int...'", "'...'", "'boolean'", "'String'", 
			"'static'", "'('", "','", "')'", "'void'", "'main'", "'return'", "'if'", 
			"'else'", "'while'", "'='", "'new'", "'length'", "'this'", "'!'", "'*'", 
			"'/'", "'+'", "'-'", "'<'", "'>'", "'=='", "'!='", "'&&'", "'||'", "'true'", 
			"'false'", "'++'", "'--'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "WS", "SINGLE_COMMENT", 
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 562949953542160L) != 0)) {
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 562949953542160L) != 0)) {
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
			setState(74);
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
				((VarargContext)_localctx).typeName = match(T__11);
				}
				break;
			case 3:
				{
				_localctx = new VarargContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(69);
				((VarargContext)_localctx).typeName = match(T__10);
				setState(70);
				match(T__12);
				}
				break;
			case 4:
				{
				_localctx = new BooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(71);
				((BooleanContext)_localctx).typeName = match(T__13);
				}
				break;
			case 5:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(72);
				((StringContext)_localctx).typeName = match(T__14);
				}
				break;
			case 6:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(73);
				((IdContext)_localctx).typeName = match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(81);
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
					setState(76);
					if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
					setState(77);
					match(T__8);
					setState(78);
					match(T__9);
					}
					} 
				}
				setState(83);
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
			setState(84);
			type(0);
			setState(85);
			((FieldDeclarationContext)_localctx).variable = match(ID);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(86);
				match(T__8);
				setState(87);
				match(T__9);
				}
			}

			setState(90);
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
		public Token isPublic;
		public Token isStatic;
		public Token methodName;
		public Token argName;
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
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_methodDeclaration);
		int _la;
		try {
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(92);
					((MethodDeclarationContext)_localctx).isPublic = match(T__3);
					}
				}

				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__15) {
					{
					setState(95);
					((MethodDeclarationContext)_localctx).isStatic = match(T__15);
					}
				}

				setState(98);
				type(0);
				setState(99);
				((MethodDeclarationContext)_localctx).methodName = match(ID);
				setState(100);
				match(T__16);
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 562949953476608L) != 0)) {
					{
					setState(101);
					argument();
					}
				}

				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(104);
					match(T__17);
					setState(105);
					argument();
					}
					}
					setState(110);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(111);
				match(T__18);
				setState(112);
				match(T__6);
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 851023786859136L) != 0)) {
					{
					setState(115);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						setState(113);
						fieldDeclaration();
						}
						break;
					case 2:
						{
						setState(114);
						statement();
						}
						break;
					}
					}
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(120);
					returnDeclaration();
					}
				}

				setState(123);
				match(T__7);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				((MethodDeclarationContext)_localctx).isPublic = match(T__3);
				setState(126);
				((MethodDeclarationContext)_localctx).isStatic = match(T__15);
				setState(127);
				match(T__19);
				setState(128);
				match(T__20);
				setState(129);
				match(T__16);
				setState(130);
				match(T__14);
				setState(131);
				match(T__8);
				setState(132);
				match(T__9);
				setState(133);
				((MethodDeclarationContext)_localctx).argName = match(ID);
				setState(134);
				match(T__18);
				setState(135);
				match(T__6);
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 851023786859136L) != 0)) {
					{
					setState(138);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						setState(136);
						fieldDeclaration();
						}
						break;
					case 2:
						{
						setState(137);
						statement();
						}
						break;
					}
					}
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(143);
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
			setState(146);
			match(T__21);
			setState(147);
			expression(0);
			setState(148);
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
			setState(150);
			type(0);
			setState(151);
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
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new SimpleExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				expression(0);
				setState(154);
				match(T__2);
				}
				break;
			case 2:
				_localctx = new BlockContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				match(T__6);
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 851023786803840L) != 0)) {
					{
					{
					setState(157);
					statement();
					}
					}
					setState(162);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(163);
				match(T__7);
				}
				break;
			case 3:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				match(T__22);
				setState(165);
				match(T__16);
				setState(166);
				expression(0);
				setState(167);
				match(T__18);
				setState(168);
				statement();
				{
				setState(169);
				match(T__23);
				setState(170);
				statement();
				}
				}
				break;
			case 4:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(172);
				match(T__24);
				setState(173);
				match(T__16);
				setState(174);
				expression(0);
				setState(175);
				match(T__18);
				setState(176);
				statement();
				}
				break;
			case 5:
				_localctx = new AssignmentContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(178);
				((AssignmentContext)_localctx).variable = match(ID);
				setState(179);
				match(T__25);
				setState(180);
				expression(0);
				setState(181);
				match(T__2);
				}
				break;
			case 6:
				_localctx = new AssignmentArrayContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(183);
				((AssignmentArrayContext)_localctx).variable = match(ID);
				setState(184);
				match(T__8);
				setState(185);
				expression(0);
				setState(186);
				match(T__9);
				setState(187);
				match(T__25);
				setState(188);
				expression(0);
				setState(189);
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
			setState(193);
			expression(0);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(194);
				match(T__17);
				setState(195);
				expression(0);
				}
				}
				setState(200);
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
		public TerminalNode ID() { return getToken(JavammParser.ID, 0); }
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(202);
				match(T__16);
				setState(203);
				expression(0);
				setState(204);
				match(T__18);
				}
				break;
			case 2:
				{
				_localctx = new NewIntArrayExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(206);
				match(T__26);
				setState(207);
				match(T__10);
				setState(208);
				match(T__8);
				setState(209);
				((NewIntArrayExpressionContext)_localctx).size = expression(0);
				setState(210);
				match(T__9);
				}
				break;
			case 3:
				{
				_localctx = new ClassInstantiationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(212);
				match(T__26);
				setState(213);
				((ClassInstantiationExpressionContext)_localctx).classname = match(ID);
				setState(214);
				match(T__16);
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 851023744860672L) != 0)) {
					{
					setState(215);
					parameter();
					}
				}

				setState(218);
				match(T__18);
				}
				break;
			case 4:
				{
				_localctx = new FunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(219);
				((FunctionCallExpressionContext)_localctx).value = match(ID);
				setState(220);
				match(T__16);
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 851023744860672L) != 0)) {
					{
					setState(221);
					parameter();
					}
				}

				setState(224);
				match(T__18);
				}
				break;
			case 5:
				{
				_localctx = new ArrayInitializationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(225);
				match(T__8);
				setState(226);
				expression(0);
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(227);
					match(T__17);
					setState(228);
					expression(0);
					}
					}
					setState(233);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(234);
				match(T__9);
				}
				break;
			case 6:
				{
				_localctx = new ThisReferenceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(236);
				match(T__28);
				}
				break;
			case 7:
				{
				_localctx = new NegationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(237);
				match(T__29);
				setState(238);
				expression(9);
				}
				break;
			case 8:
				{
				_localctx = new IntegerLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(239);
				match(INTEGER);
				}
				break;
			case 9:
				{
				_localctx = new BooleanLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(240);
				((BooleanLiteralContext)_localctx).value = match(T__40);
				}
				break;
			case 10:
				{
				_localctx = new BooleanLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(241);
				((BooleanLiteralContext)_localctx).value = match(T__41);
				}
				break;
			case 11:
				{
				_localctx = new VariableReferenceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(242);
				((VariableReferenceExpressionContext)_localctx).variable = match(ID);
				setState(244);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(243);
					((VariableReferenceExpressionContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__42 || _la==T__43) ) {
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
			setState(278);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(276);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(248);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(249);
						((BinaryExpressionContext)_localctx).operation = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__38 || _la==T__39) ) {
							((BinaryExpressionContext)_localctx).operation = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(250);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new ArrayAccessExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(251);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(252);
						match(T__8);
						setState(253);
						((ArrayAccessExpressionContext)_localctx).index = expression(0);
						setState(254);
						match(T__9);
						}
						break;
					case 3:
						{
						_localctx = new FunctionCallExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(256);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(257);
						match(T__1);
						setState(258);
						((FunctionCallExpressionContext)_localctx).value = match(ID);
						setState(259);
						match(T__16);
						setState(261);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 851023744860672L) != 0)) {
							{
							setState(260);
							parameter();
							}
						}

						setState(263);
						match(T__18);
						}
						break;
					case 4:
						{
						_localctx = new ArrayLengthExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(264);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(265);
						match(T__1);
						setState(266);
						match(T__27);
						}
						break;
					case 5:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(267);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						{
						setState(268);
						((BinaryExpressionContext)_localctx).operation = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__30 || _la==T__31) ) {
							((BinaryExpressionContext)_localctx).operation = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(269);
						expression(0);
						}
						}
						break;
					case 6:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(270);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						{
						setState(271);
						((BinaryExpressionContext)_localctx).operation = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__32 || _la==T__33) ) {
							((BinaryExpressionContext)_localctx).operation = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(272);
						expression(0);
						}
						}
						break;
					case 7:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(273);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						{
						setState(274);
						((BinaryExpressionContext)_localctx).operation = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 515396075520L) != 0)) ) {
							((BinaryExpressionContext)_localctx).operation = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(275);
						expression(0);
						}
						}
						break;
					}
					} 
				}
				setState(280);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
			return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 15);
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
		"\u0004\u00011\u011a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003K\b"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003P\b\u0003\n\u0003"+
		"\f\u0003S\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004Y\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0003\u0005^\b\u0005"+
		"\u0001\u0005\u0003\u0005a\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005g\b\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"k\b\u0005\n\u0005\f\u0005n\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005t\b\u0005\n\u0005\f\u0005w\t\u0005\u0001\u0005"+
		"\u0003\u0005z\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"\u008b\b\u0005\n\u0005\f\u0005\u008e\t\u0005\u0001\u0005\u0003\u0005\u0091"+
		"\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u009f"+
		"\b\b\n\b\f\b\u00a2\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00c0\b\b\u0001\t\u0001\t\u0001"+
		"\t\u0005\t\u00c5\b\t\n\t\f\t\u00c8\t\t\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u00d9\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u00df\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00e6\b\n"+
		"\n\n\f\n\u00e9\t\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u00f5\b\n\u0003\n\u00f7\b\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u0106\b\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0005\n\u0115\b\n\n\n\f\n\u0118\t\n\u0001\n\u0000\u0002\u0006\u0014"+
		"\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000\u0005"+
		"\u0001\u0000+,\u0001\u0000\'(\u0001\u0000\u001f \u0001\u0000!\"\u0001"+
		"\u0000#&\u0143\u0000\u0019\u0001\u0000\u0000\u0000\u0002\"\u0001\u0000"+
		"\u0000\u0000\u0004+\u0001\u0000\u0000\u0000\u0006J\u0001\u0000\u0000\u0000"+
		"\bT\u0001\u0000\u0000\u0000\n\u0090\u0001\u0000\u0000\u0000\f\u0092\u0001"+
		"\u0000\u0000\u0000\u000e\u0096\u0001\u0000\u0000\u0000\u0010\u00bf\u0001"+
		"\u0000\u0000\u0000\u0012\u00c1\u0001\u0000\u0000\u0000\u0014\u00f6\u0001"+
		"\u0000\u0000\u0000\u0016\u0018\u0003\u0002\u0001\u0000\u0017\u0016\u0001"+
		"\u0000\u0000\u0000\u0018\u001b\u0001\u0000\u0000\u0000\u0019\u0017\u0001"+
		"\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u001c\u0001"+
		"\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001c\u001e\u0003"+
		"\u0004\u0002\u0000\u001d\u001f\u0003\n\u0005\u0000\u001e\u001d\u0001\u0000"+
		"\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000"+
		"\u0000 !\u0005\u0000\u0000\u0001!\u0001\u0001\u0000\u0000\u0000\"#\u0005"+
		"\u0001\u0000\u0000#&\u00051\u0000\u0000$%\u0005\u0002\u0000\u0000%\'\u0005"+
		"1\u0000\u0000&$\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000\'("+
		"\u0001\u0000\u0000\u0000()\u0005\u0003\u0000\u0000)\u0003\u0001\u0000"+
		"\u0000\u0000*,\u0005\u0004\u0000\u0000+*\u0001\u0000\u0000\u0000+,\u0001"+
		"\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-.\u0005\u0005\u0000\u0000"+
		".1\u00051\u0000\u0000/0\u0005\u0006\u0000\u000002\u00051\u0000\u00001"+
		"/\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u000023\u0001\u0000\u0000"+
		"\u000037\u0005\u0007\u0000\u000046\u0003\b\u0004\u000054\u0001\u0000\u0000"+
		"\u000069\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u000078\u0001\u0000"+
		"\u0000\u00008=\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u0000:<\u0003"+
		"\n\u0005\u0000;:\u0001\u0000\u0000\u0000<?\u0001\u0000\u0000\u0000=;\u0001"+
		"\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>@\u0001\u0000\u0000\u0000"+
		"?=\u0001\u0000\u0000\u0000@A\u0005\b\u0000\u0000A\u0005\u0001\u0000\u0000"+
		"\u0000BC\u0006\u0003\uffff\uffff\u0000CK\u0005\u000b\u0000\u0000DK\u0005"+
		"\f\u0000\u0000EF\u0005\u000b\u0000\u0000FK\u0005\r\u0000\u0000GK\u0005"+
		"\u000e\u0000\u0000HK\u0005\u000f\u0000\u0000IK\u00051\u0000\u0000JB\u0001"+
		"\u0000\u0000\u0000JD\u0001\u0000\u0000\u0000JE\u0001\u0000\u0000\u0000"+
		"JG\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000JI\u0001\u0000\u0000"+
		"\u0000KQ\u0001\u0000\u0000\u0000LM\n\u0007\u0000\u0000MN\u0005\t\u0000"+
		"\u0000NP\u0005\n\u0000\u0000OL\u0001\u0000\u0000\u0000PS\u0001\u0000\u0000"+
		"\u0000QO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000R\u0007\u0001"+
		"\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000TU\u0003\u0006\u0003\u0000"+
		"UX\u00051\u0000\u0000VW\u0005\t\u0000\u0000WY\u0005\n\u0000\u0000XV\u0001"+
		"\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000"+
		"Z[\u0005\u0003\u0000\u0000[\t\u0001\u0000\u0000\u0000\\^\u0005\u0004\u0000"+
		"\u0000]\\\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^`\u0001\u0000"+
		"\u0000\u0000_a\u0005\u0010\u0000\u0000`_\u0001\u0000\u0000\u0000`a\u0001"+
		"\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0003\u0006\u0003\u0000"+
		"cd\u00051\u0000\u0000df\u0005\u0011\u0000\u0000eg\u0003\u000e\u0007\u0000"+
		"fe\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gl\u0001\u0000\u0000"+
		"\u0000hi\u0005\u0012\u0000\u0000ik\u0003\u000e\u0007\u0000jh\u0001\u0000"+
		"\u0000\u0000kn\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000lm\u0001"+
		"\u0000\u0000\u0000mo\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000"+
		"op\u0005\u0013\u0000\u0000pu\u0005\u0007\u0000\u0000qt\u0003\b\u0004\u0000"+
		"rt\u0003\u0010\b\u0000sq\u0001\u0000\u0000\u0000sr\u0001\u0000\u0000\u0000"+
		"tw\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000"+
		"\u0000vy\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000xz\u0003\f\u0006"+
		"\u0000yx\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z{\u0001\u0000"+
		"\u0000\u0000{|\u0005\b\u0000\u0000|\u0091\u0001\u0000\u0000\u0000}~\u0005"+
		"\u0004\u0000\u0000~\u007f\u0005\u0010\u0000\u0000\u007f\u0080\u0005\u0014"+
		"\u0000\u0000\u0080\u0081\u0005\u0015\u0000\u0000\u0081\u0082\u0005\u0011"+
		"\u0000\u0000\u0082\u0083\u0005\u000f\u0000\u0000\u0083\u0084\u0005\t\u0000"+
		"\u0000\u0084\u0085\u0005\n\u0000\u0000\u0085\u0086\u00051\u0000\u0000"+
		"\u0086\u0087\u0005\u0013\u0000\u0000\u0087\u008c\u0005\u0007\u0000\u0000"+
		"\u0088\u008b\u0003\b\u0004\u0000\u0089\u008b\u0003\u0010\b\u0000\u008a"+
		"\u0088\u0001\u0000\u0000\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008b"+
		"\u008e\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c"+
		"\u008d\u0001\u0000\u0000\u0000\u008d\u008f\u0001\u0000\u0000\u0000\u008e"+
		"\u008c\u0001\u0000\u0000\u0000\u008f\u0091\u0005\b\u0000\u0000\u0090]"+
		"\u0001\u0000\u0000\u0000\u0090}\u0001\u0000\u0000\u0000\u0091\u000b\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\u0005\u0016\u0000\u0000\u0093\u0094\u0003"+
		"\u0014\n\u0000\u0094\u0095\u0005\u0003\u0000\u0000\u0095\r\u0001\u0000"+
		"\u0000\u0000\u0096\u0097\u0003\u0006\u0003\u0000\u0097\u0098\u00051\u0000"+
		"\u0000\u0098\u000f\u0001\u0000\u0000\u0000\u0099\u009a\u0003\u0014\n\u0000"+
		"\u009a\u009b\u0005\u0003\u0000\u0000\u009b\u00c0\u0001\u0000\u0000\u0000"+
		"\u009c\u00a0\u0005\u0007\u0000\u0000\u009d\u009f\u0003\u0010\b\u0000\u009e"+
		"\u009d\u0001\u0000\u0000\u0000\u009f\u00a2\u0001\u0000\u0000\u0000\u00a0"+
		"\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a3"+
		"\u00c0\u0005\b\u0000\u0000\u00a4\u00a5\u0005\u0017\u0000\u0000\u00a5\u00a6"+
		"\u0005\u0011\u0000\u0000\u00a6\u00a7\u0003\u0014\n\u0000\u00a7\u00a8\u0005"+
		"\u0013\u0000\u0000\u00a8\u00a9\u0003\u0010\b\u0000\u00a9\u00aa\u0005\u0018"+
		"\u0000\u0000\u00aa\u00ab\u0003\u0010\b\u0000\u00ab\u00c0\u0001\u0000\u0000"+
		"\u0000\u00ac\u00ad\u0005\u0019\u0000\u0000\u00ad\u00ae\u0005\u0011\u0000"+
		"\u0000\u00ae\u00af\u0003\u0014\n\u0000\u00af\u00b0\u0005\u0013\u0000\u0000"+
		"\u00b0\u00b1\u0003\u0010\b\u0000\u00b1\u00c0\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b3\u00051\u0000\u0000\u00b3\u00b4\u0005\u001a\u0000\u0000\u00b4\u00b5"+
		"\u0003\u0014\n\u0000\u00b5\u00b6\u0005\u0003\u0000\u0000\u00b6\u00c0\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b8\u00051\u0000\u0000\u00b8\u00b9\u0005\t"+
		"\u0000\u0000\u00b9\u00ba\u0003\u0014\n\u0000\u00ba\u00bb\u0005\n\u0000"+
		"\u0000\u00bb\u00bc\u0005\u001a\u0000\u0000\u00bc\u00bd\u0003\u0014\n\u0000"+
		"\u00bd\u00be\u0005\u0003\u0000\u0000\u00be\u00c0\u0001\u0000\u0000\u0000"+
		"\u00bf\u0099\u0001\u0000\u0000\u0000\u00bf\u009c\u0001\u0000\u0000\u0000"+
		"\u00bf\u00a4\u0001\u0000\u0000\u0000\u00bf\u00ac\u0001\u0000\u0000\u0000"+
		"\u00bf\u00b2\u0001\u0000\u0000\u0000\u00bf\u00b7\u0001\u0000\u0000\u0000"+
		"\u00c0\u0011\u0001\u0000\u0000\u0000\u00c1\u00c6\u0003\u0014\n\u0000\u00c2"+
		"\u00c3\u0005\u0012\u0000\u0000\u00c3\u00c5\u0003\u0014\n\u0000\u00c4\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c8\u0001\u0000\u0000\u0000\u00c6\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u0013"+
		"\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c9\u00ca"+
		"\u0006\n\uffff\uffff\u0000\u00ca\u00cb\u0005\u0011\u0000\u0000\u00cb\u00cc"+
		"\u0003\u0014\n\u0000\u00cc\u00cd\u0005\u0013\u0000\u0000\u00cd\u00f7\u0001"+
		"\u0000\u0000\u0000\u00ce\u00cf\u0005\u001b\u0000\u0000\u00cf\u00d0\u0005"+
		"\u000b\u0000\u0000\u00d0\u00d1\u0005\t\u0000\u0000\u00d1\u00d2\u0003\u0014"+
		"\n\u0000\u00d2\u00d3\u0005\n\u0000\u0000\u00d3\u00f7\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d5\u0005\u001b\u0000\u0000\u00d5\u00d6\u00051\u0000\u0000"+
		"\u00d6\u00d8\u0005\u0011\u0000\u0000\u00d7\u00d9\u0003\u0012\t\u0000\u00d8"+
		"\u00d7\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9"+
		"\u00da\u0001\u0000\u0000\u0000\u00da\u00f7\u0005\u0013\u0000\u0000\u00db"+
		"\u00dc\u00051\u0000\u0000\u00dc\u00de\u0005\u0011\u0000\u0000\u00dd\u00df"+
		"\u0003\u0012\t\u0000\u00de\u00dd\u0001\u0000\u0000\u0000\u00de\u00df\u0001"+
		"\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00f7\u0005"+
		"\u0013\u0000\u0000\u00e1\u00e2\u0005\t\u0000\u0000\u00e2\u00e7\u0003\u0014"+
		"\n\u0000\u00e3\u00e4\u0005\u0012\u0000\u0000\u00e4\u00e6\u0003\u0014\n"+
		"\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e6\u00e9\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000"+
		"\u0000\u00e8\u00ea\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000"+
		"\u0000\u00ea\u00eb\u0005\n\u0000\u0000\u00eb\u00f7\u0001\u0000\u0000\u0000"+
		"\u00ec\u00f7\u0005\u001d\u0000\u0000\u00ed\u00ee\u0005\u001e\u0000\u0000"+
		"\u00ee\u00f7\u0003\u0014\n\t\u00ef\u00f7\u00050\u0000\u0000\u00f0\u00f7"+
		"\u0005)\u0000\u0000\u00f1\u00f7\u0005*\u0000\u0000\u00f2\u00f4\u00051"+
		"\u0000\u0000\u00f3\u00f5\u0007\u0000\u0000\u0000\u00f4\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f7\u0001\u0000"+
		"\u0000\u0000\u00f6\u00c9\u0001\u0000\u0000\u0000\u00f6\u00ce\u0001\u0000"+
		"\u0000\u0000\u00f6\u00d4\u0001\u0000\u0000\u0000\u00f6\u00db\u0001\u0000"+
		"\u0000\u0000\u00f6\u00e1\u0001\u0000\u0000\u0000\u00f6\u00ec\u0001\u0000"+
		"\u0000\u0000\u00f6\u00ed\u0001\u0000\u0000\u0000\u00f6\u00ef\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f0\u0001\u0000\u0000\u0000\u00f6\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f2\u0001\u0000\u0000\u0000\u00f7\u0116\u0001\u0000"+
		"\u0000\u0000\u00f8\u00f9\n\u0005\u0000\u0000\u00f9\u00fa\u0007\u0001\u0000"+
		"\u0000\u00fa\u0115\u0003\u0014\n\u0006\u00fb\u00fc\n\u000f\u0000\u0000"+
		"\u00fc\u00fd\u0005\t\u0000\u0000\u00fd\u00fe\u0003\u0014\n\u0000\u00fe"+
		"\u00ff\u0005\n\u0000\u0000\u00ff\u0115\u0001\u0000\u0000\u0000\u0100\u0101"+
		"\n\r\u0000\u0000\u0101\u0102\u0005\u0002\u0000\u0000\u0102\u0103\u0005"+
		"1\u0000\u0000\u0103\u0105\u0005\u0011\u0000\u0000\u0104\u0106\u0003\u0012"+
		"\t\u0000\u0105\u0104\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000"+
		"\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u0107\u0115\u0005\u0013\u0000"+
		"\u0000\u0108\u0109\n\f\u0000\u0000\u0109\u010a\u0005\u0002\u0000\u0000"+
		"\u010a\u0115\u0005\u001c\u0000\u0000\u010b\u010c\n\b\u0000\u0000\u010c"+
		"\u010d\u0007\u0002\u0000\u0000\u010d\u0115\u0003\u0014\n\u0000\u010e\u010f"+
		"\n\u0007\u0000\u0000\u010f\u0110\u0007\u0003\u0000\u0000\u0110\u0115\u0003"+
		"\u0014\n\u0000\u0111\u0112\n\u0006\u0000\u0000\u0112\u0113\u0007\u0004"+
		"\u0000\u0000\u0113\u0115\u0003\u0014\n\u0000\u0114\u00f8\u0001\u0000\u0000"+
		"\u0000\u0114\u00fb\u0001\u0000\u0000\u0000\u0114\u0100\u0001\u0000\u0000"+
		"\u0000\u0114\u0108\u0001\u0000\u0000\u0000\u0114\u010b\u0001\u0000\u0000"+
		"\u0000\u0114\u010e\u0001\u0000\u0000\u0000\u0114\u0111\u0001\u0000\u0000"+
		"\u0000\u0115\u0118\u0001\u0000\u0000\u0000\u0116\u0114\u0001\u0000\u0000"+
		"\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117\u0015\u0001\u0000\u0000"+
		"\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u001f\u0019\u001e&+17=JQX]"+
		"`flsuy\u008a\u008c\u0090\u00a0\u00bf\u00c6\u00d8\u00de\u00e7\u00f4\u00f6"+
		"\u0105\u0114\u0116";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}