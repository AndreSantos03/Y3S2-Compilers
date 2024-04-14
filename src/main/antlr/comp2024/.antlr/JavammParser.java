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
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		WS=46, SINGLE_COMMENT=47, MULTI_COMMENT=48, INTEGER=49, ID=50;
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
			"'static'", "'void'", "'main'", "'('", "'args'", "')'", "','", "'return'", 
			"'if'", "'else'", "'while'", "'='", "'new'", "'length'", "'this'", "'!'", 
			"'*'", "'/'", "'+'", "'-'", "'<'", "'>'", "'=='", "'!='", "'&&'", "'||'", 
			"'true'", "'false'", "'++'", "'--'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "WS", "SINGLE_COMMENT", 
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1125899906963472L) != 0)) {
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
		public Token value;
		public Token function;
		public List<TerminalNode> ID() { return getTokens(JavammParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JavammParser.ID, i);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(T__0);
			setState(35);
			((ImportDeclarationContext)_localctx).value = match(ID);
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(36);
				match(T__1);
				setState(37);
				((ImportDeclarationContext)_localctx).function = match(ID);
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43);
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
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(45);
				match(T__3);
				}
			}

			setState(48);
			match(T__4);
			setState(49);
			((ClassDeclContext)_localctx).className = match(ID);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(50);
				match(T__5);
				setState(51);
				((ClassDeclContext)_localctx).superClassName = match(ID);
				}
			}

			setState(54);
			match(T__6);
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1125899906963472L) != 0)) {
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
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(70);
				((IntContext)_localctx).typeName = match(T__10);
				}
				break;
			case 2:
				{
				_localctx = new VarargContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(71);
				((VarargContext)_localctx).typeName = match(T__11);
				}
				break;
			case 3:
				{
				_localctx = new VarargContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(72);
				((VarargContext)_localctx).typeName = match(T__10);
				setState(73);
				match(T__12);
				}
				break;
			case 4:
				{
				_localctx = new BooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(74);
				((BooleanContext)_localctx).typeName = match(T__13);
				}
				break;
			case 5:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(75);
				((StringContext)_localctx).typeName = match(T__14);
				}
				break;
			case 6:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(76);
				((IdContext)_localctx).typeName = match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(84);
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
					setState(79);
					if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
					setState(80);
					match(T__8);
					setState(81);
					match(T__9);
					}
					} 
				}
				setState(86);
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
			setState(87);
			type(0);
			setState(88);
			((FieldDeclarationContext)_localctx).variable = match(ID);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(89);
				match(T__8);
				setState(90);
				match(T__9);
				}
			}

			setState(93);
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
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(95);
					((MethodDeclarationContext)_localctx).isPublic = match(T__3);
					}
				}

				setState(98);
				((MethodDeclarationContext)_localctx).isStatic = match(T__15);
				setState(99);
				match(T__16);
				setState(100);
				match(T__17);
				setState(101);
				match(T__18);
				setState(102);
				match(T__14);
				setState(103);
				match(T__8);
				setState(104);
				match(T__9);
				setState(105);
				match(T__19);
				setState(106);
				match(T__20);
				setState(107);
				match(T__6);
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1702047573924480L) != 0)) {
					{
					setState(110);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						setState(108);
						fieldDeclaration();
						}
						break;
					case 2:
						{
						setState(109);
						statement();
						}
						break;
					}
					}
					setState(114);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(115);
				match(T__7);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(116);
					((MethodDeclarationContext)_localctx).isPublic = match(T__3);
					}
				}

				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__15) {
					{
					setState(119);
					((MethodDeclarationContext)_localctx).isStatic = match(T__15);
					}
				}

				setState(122);
				type(0);
				setState(123);
				((MethodDeclarationContext)_localctx).methodName = match(ID);
				setState(124);
				match(T__18);
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1125899906897920L) != 0)) {
					{
					setState(125);
					argument();
					}
				}

				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__21) {
					{
					{
					setState(128);
					match(T__21);
					setState(129);
					argument();
					}
					}
					setState(134);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(135);
				match(T__20);
				setState(136);
				match(T__6);
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1702047573924480L) != 0)) {
					{
					setState(139);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						setState(137);
						fieldDeclaration();
						}
						break;
					case 2:
						{
						setState(138);
						statement();
						}
						break;
					}
					}
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__22) {
					{
					setState(144);
					returnDeclaration();
					}
				}

				setState(147);
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
			setState(151);
			match(T__22);
			setState(152);
			expression(0);
			setState(153);
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
			setState(155);
			type(0);
			setState(156);
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
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new SimpleExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				expression(0);
				setState(159);
				match(T__2);
				}
				break;
			case 2:
				_localctx = new BlockContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				match(T__6);
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1702047573869184L) != 0)) {
					{
					{
					setState(162);
					statement();
					}
					}
					setState(167);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(168);
				match(T__7);
				}
				break;
			case 3:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				match(T__23);
				setState(170);
				match(T__18);
				setState(171);
				expression(0);
				setState(172);
				match(T__20);
				setState(173);
				statement();
				{
				setState(174);
				match(T__24);
				setState(175);
				statement();
				}
				}
				break;
			case 4:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(177);
				match(T__25);
				setState(178);
				match(T__18);
				setState(179);
				expression(0);
				setState(180);
				match(T__20);
				setState(181);
				statement();
				}
				break;
			case 5:
				_localctx = new AssignmentContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(183);
				((AssignmentContext)_localctx).variable = match(ID);
				setState(184);
				match(T__26);
				setState(185);
				expression(0);
				setState(186);
				match(T__2);
				}
				break;
			case 6:
				_localctx = new AssignmentArrayContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(188);
				((AssignmentArrayContext)_localctx).variable = match(ID);
				setState(189);
				match(T__8);
				setState(190);
				expression(0);
				setState(191);
				match(T__9);
				setState(192);
				match(T__26);
				setState(193);
				expression(0);
				setState(194);
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
			setState(198);
			expression(0);
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(199);
				match(T__21);
				setState(200);
				expression(0);
				}
				}
				setState(205);
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
		public Token value;
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
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(207);
				match(T__18);
				setState(208);
				expression(0);
				setState(209);
				match(T__20);
				}
				break;
			case 2:
				{
				_localctx = new NewIntArrayExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(211);
				match(T__27);
				setState(212);
				match(T__10);
				setState(213);
				match(T__8);
				setState(214);
				((NewIntArrayExpressionContext)_localctx).size = expression(0);
				setState(215);
				match(T__9);
				}
				break;
			case 3:
				{
				_localctx = new ClassInstantiationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(217);
				match(T__27);
				setState(218);
				((ClassInstantiationExpressionContext)_localctx).classname = match(ID);
				setState(219);
				match(T__18);
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1702047489982976L) != 0)) {
					{
					setState(220);
					parameter();
					}
				}

				setState(223);
				match(T__20);
				}
				break;
			case 4:
				{
				_localctx = new FunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(224);
				((FunctionCallExpressionContext)_localctx).value = match(ID);
				setState(225);
				match(T__18);
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1702047489982976L) != 0)) {
					{
					setState(226);
					parameter();
					}
				}

				setState(229);
				match(T__20);
				}
				break;
			case 5:
				{
				_localctx = new ArrayInitializationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(230);
				match(T__8);
				setState(231);
				expression(0);
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__21) {
					{
					{
					setState(232);
					match(T__21);
					setState(233);
					expression(0);
					}
					}
					setState(238);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(239);
				match(T__9);
				}
				break;
			case 6:
				{
				_localctx = new ThisReferenceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(241);
				match(T__29);
				}
				break;
			case 7:
				{
				_localctx = new NegationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(242);
				match(T__30);
				setState(243);
				expression(9);
				}
				break;
			case 8:
				{
				_localctx = new IntegerLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(244);
				((IntegerLiteralContext)_localctx).value = match(INTEGER);
				}
				break;
			case 9:
				{
				_localctx = new BooleanLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(245);
				((BooleanLiteralContext)_localctx).value = match(T__41);
				}
				break;
			case 10:
				{
				_localctx = new BooleanLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(246);
				((BooleanLiteralContext)_localctx).value = match(T__42);
				}
				break;
			case 11:
				{
				_localctx = new VariableReferenceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(247);
				((VariableReferenceExpressionContext)_localctx).variable = match(ID);
				setState(249);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(248);
					((VariableReferenceExpressionContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__43 || _la==T__44) ) {
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
			setState(283);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(281);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(253);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(254);
						((BinaryExpressionContext)_localctx).operation = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__39 || _la==T__40) ) {
							((BinaryExpressionContext)_localctx).operation = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(255);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new ArrayAccessExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(256);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(257);
						match(T__8);
						setState(258);
						((ArrayAccessExpressionContext)_localctx).index = expression(0);
						setState(259);
						match(T__9);
						}
						break;
					case 3:
						{
						_localctx = new FunctionCallExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(261);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(262);
						match(T__1);
						setState(263);
						((FunctionCallExpressionContext)_localctx).value = match(ID);
						setState(264);
						match(T__18);
						setState(266);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1702047489982976L) != 0)) {
							{
							setState(265);
							parameter();
							}
						}

						setState(268);
						match(T__20);
						}
						break;
					case 4:
						{
						_localctx = new ArrayLengthExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(269);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(270);
						match(T__1);
						setState(271);
						match(T__28);
						}
						break;
					case 5:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(272);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						{
						setState(273);
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
						setState(274);
						expression(0);
						}
						}
						break;
					case 6:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(275);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						{
						setState(276);
						((BinaryExpressionContext)_localctx).operation = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__33 || _la==T__34) ) {
							((BinaryExpressionContext)_localctx).operation = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(277);
						expression(0);
						}
						}
						break;
					case 7:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(278);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						{
						setState(279);
						((BinaryExpressionContext)_localctx).operation = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1030792151040L) != 0)) ) {
							((BinaryExpressionContext)_localctx).operation = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(280);
						expression(0);
						}
						}
						break;
					}
					} 
				}
				setState(285);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
		"\u0004\u00012\u011f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0005\u0000\u0018"+
		"\b\u0000\n\u0000\f\u0000\u001b\t\u0000\u0001\u0000\u0001\u0000\u0003\u0000"+
		"\u001f\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001\'\b\u0001\n\u0001\f\u0001*\t\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0003\u0002/\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u00025\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u00029\b\u0002\n\u0002\f\u0002<\t\u0002\u0001\u0002\u0005\u0002"+
		"?\b\u0002\n\u0002\f\u0002B\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003N\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003S\b\u0003\n\u0003\f\u0003V\t\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\\\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0003\u0005a\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005o\b\u0005\n\u0005\f\u0005"+
		"r\t\u0005\u0001\u0005\u0001\u0005\u0003\u0005v\b\u0005\u0001\u0005\u0003"+
		"\u0005y\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u007f\b\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u0083\b\u0005"+
		"\n\u0005\f\u0005\u0086\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005\u008c\b\u0005\n\u0005\f\u0005\u008f\t\u0005\u0001\u0005"+
		"\u0003\u0005\u0092\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0096\b"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00a4"+
		"\b\b\n\b\f\b\u00a7\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00c5\b\b\u0001\t\u0001\t\u0001"+
		"\t\u0005\t\u00ca\b\t\n\t\f\t\u00cd\t\t\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u00de\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u00e4\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00eb\b\n"+
		"\n\n\f\n\u00ee\t\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u00fa\b\n\u0003\n\u00fc\b\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u010b\b\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0005\n\u011a\b\n\n\n\f\n\u011d\t\n\u0001\n\u0000\u0002\u0006\u0014"+
		"\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000\u0005"+
		"\u0001\u0000,-\u0001\u0000()\u0001\u0000 !\u0001\u0000\"#\u0001\u0000"+
		"$\'\u0149\u0000\u0019\u0001\u0000\u0000\u0000\u0002\"\u0001\u0000\u0000"+
		"\u0000\u0004.\u0001\u0000\u0000\u0000\u0006M\u0001\u0000\u0000\u0000\b"+
		"W\u0001\u0000\u0000\u0000\n\u0095\u0001\u0000\u0000\u0000\f\u0097\u0001"+
		"\u0000\u0000\u0000\u000e\u009b\u0001\u0000\u0000\u0000\u0010\u00c4\u0001"+
		"\u0000\u0000\u0000\u0012\u00c6\u0001\u0000\u0000\u0000\u0014\u00fb\u0001"+
		"\u0000\u0000\u0000\u0016\u0018\u0003\u0002\u0001\u0000\u0017\u0016\u0001"+
		"\u0000\u0000\u0000\u0018\u001b\u0001\u0000\u0000\u0000\u0019\u0017\u0001"+
		"\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u001c\u0001"+
		"\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001c\u001e\u0003"+
		"\u0004\u0002\u0000\u001d\u001f\u0003\n\u0005\u0000\u001e\u001d\u0001\u0000"+
		"\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000"+
		"\u0000 !\u0005\u0000\u0000\u0001!\u0001\u0001\u0000\u0000\u0000\"#\u0005"+
		"\u0001\u0000\u0000#(\u00052\u0000\u0000$%\u0005\u0002\u0000\u0000%\'\u0005"+
		"2\u0000\u0000&$\u0001\u0000\u0000\u0000\'*\u0001\u0000\u0000\u0000(&\u0001"+
		"\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)+\u0001\u0000\u0000\u0000"+
		"*(\u0001\u0000\u0000\u0000+,\u0005\u0003\u0000\u0000,\u0003\u0001\u0000"+
		"\u0000\u0000-/\u0005\u0004\u0000\u0000.-\u0001\u0000\u0000\u0000./\u0001"+
		"\u0000\u0000\u0000/0\u0001\u0000\u0000\u000001\u0005\u0005\u0000\u0000"+
		"14\u00052\u0000\u000023\u0005\u0006\u0000\u000035\u00052\u0000\u00004"+
		"2\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000056\u0001\u0000\u0000"+
		"\u00006:\u0005\u0007\u0000\u000079\u0003\b\u0004\u000087\u0001\u0000\u0000"+
		"\u00009<\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000:;\u0001\u0000"+
		"\u0000\u0000;@\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000=?\u0003"+
		"\n\u0005\u0000>=\u0001\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000@>\u0001"+
		"\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AC\u0001\u0000\u0000\u0000"+
		"B@\u0001\u0000\u0000\u0000CD\u0005\b\u0000\u0000D\u0005\u0001\u0000\u0000"+
		"\u0000EF\u0006\u0003\uffff\uffff\u0000FN\u0005\u000b\u0000\u0000GN\u0005"+
		"\f\u0000\u0000HI\u0005\u000b\u0000\u0000IN\u0005\r\u0000\u0000JN\u0005"+
		"\u000e\u0000\u0000KN\u0005\u000f\u0000\u0000LN\u00052\u0000\u0000ME\u0001"+
		"\u0000\u0000\u0000MG\u0001\u0000\u0000\u0000MH\u0001\u0000\u0000\u0000"+
		"MJ\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000ML\u0001\u0000\u0000"+
		"\u0000NT\u0001\u0000\u0000\u0000OP\n\u0007\u0000\u0000PQ\u0005\t\u0000"+
		"\u0000QS\u0005\n\u0000\u0000RO\u0001\u0000\u0000\u0000SV\u0001\u0000\u0000"+
		"\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000U\u0007\u0001"+
		"\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000WX\u0003\u0006\u0003\u0000"+
		"X[\u00052\u0000\u0000YZ\u0005\t\u0000\u0000Z\\\u0005\n\u0000\u0000[Y\u0001"+
		"\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000"+
		"]^\u0005\u0003\u0000\u0000^\t\u0001\u0000\u0000\u0000_a\u0005\u0004\u0000"+
		"\u0000`_\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ab\u0001\u0000"+
		"\u0000\u0000bc\u0005\u0010\u0000\u0000cd\u0005\u0011\u0000\u0000de\u0005"+
		"\u0012\u0000\u0000ef\u0005\u0013\u0000\u0000fg\u0005\u000f\u0000\u0000"+
		"gh\u0005\t\u0000\u0000hi\u0005\n\u0000\u0000ij\u0005\u0014\u0000\u0000"+
		"jk\u0005\u0015\u0000\u0000kp\u0005\u0007\u0000\u0000lo\u0003\b\u0004\u0000"+
		"mo\u0003\u0010\b\u0000nl\u0001\u0000\u0000\u0000nm\u0001\u0000\u0000\u0000"+
		"or\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000"+
		"\u0000qs\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000s\u0096\u0005"+
		"\b\u0000\u0000tv\u0005\u0004\u0000\u0000ut\u0001\u0000\u0000\u0000uv\u0001"+
		"\u0000\u0000\u0000vx\u0001\u0000\u0000\u0000wy\u0005\u0010\u0000\u0000"+
		"xw\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000"+
		"\u0000z{\u0003\u0006\u0003\u0000{|\u00052\u0000\u0000|~\u0005\u0013\u0000"+
		"\u0000}\u007f\u0003\u000e\u0007\u0000~}\u0001\u0000\u0000\u0000~\u007f"+
		"\u0001\u0000\u0000\u0000\u007f\u0084\u0001\u0000\u0000\u0000\u0080\u0081"+
		"\u0005\u0016\u0000\u0000\u0081\u0083\u0003\u000e\u0007\u0000\u0082\u0080"+
		"\u0001\u0000\u0000\u0000\u0083\u0086\u0001\u0000\u0000\u0000\u0084\u0082"+
		"\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0087"+
		"\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u0088"+
		"\u0005\u0015\u0000\u0000\u0088\u008d\u0005\u0007\u0000\u0000\u0089\u008c"+
		"\u0003\b\u0004\u0000\u008a\u008c\u0003\u0010\b\u0000\u008b\u0089\u0001"+
		"\u0000\u0000\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008c\u008f\u0001"+
		"\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001"+
		"\u0000\u0000\u0000\u008e\u0091\u0001\u0000\u0000\u0000\u008f\u008d\u0001"+
		"\u0000\u0000\u0000\u0090\u0092\u0003\f\u0006\u0000\u0091\u0090\u0001\u0000"+
		"\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000"+
		"\u0000\u0000\u0093\u0094\u0005\b\u0000\u0000\u0094\u0096\u0001\u0000\u0000"+
		"\u0000\u0095`\u0001\u0000\u0000\u0000\u0095u\u0001\u0000\u0000\u0000\u0096"+
		"\u000b\u0001\u0000\u0000\u0000\u0097\u0098\u0005\u0017\u0000\u0000\u0098"+
		"\u0099\u0003\u0014\n\u0000\u0099\u009a\u0005\u0003\u0000\u0000\u009a\r"+
		"\u0001\u0000\u0000\u0000\u009b\u009c\u0003\u0006\u0003\u0000\u009c\u009d"+
		"\u00052\u0000\u0000\u009d\u000f\u0001\u0000\u0000\u0000\u009e\u009f\u0003"+
		"\u0014\n\u0000\u009f\u00a0\u0005\u0003\u0000\u0000\u00a0\u00c5\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a5\u0005\u0007\u0000\u0000\u00a2\u00a4\u0003\u0010"+
		"\b\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a8\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a8\u00c5\u0005\b\u0000\u0000\u00a9\u00aa\u0005\u0018\u0000\u0000"+
		"\u00aa\u00ab\u0005\u0013\u0000\u0000\u00ab\u00ac\u0003\u0014\n\u0000\u00ac"+
		"\u00ad\u0005\u0015\u0000\u0000\u00ad\u00ae\u0003\u0010\b\u0000\u00ae\u00af"+
		"\u0005\u0019\u0000\u0000\u00af\u00b0\u0003\u0010\b\u0000\u00b0\u00c5\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b2\u0005\u001a\u0000\u0000\u00b2\u00b3\u0005"+
		"\u0013\u0000\u0000\u00b3\u00b4\u0003\u0014\n\u0000\u00b4\u00b5\u0005\u0015"+
		"\u0000\u0000\u00b5\u00b6\u0003\u0010\b\u0000\u00b6\u00c5\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b8\u00052\u0000\u0000\u00b8\u00b9\u0005\u001b\u0000\u0000"+
		"\u00b9\u00ba\u0003\u0014\n\u0000\u00ba\u00bb\u0005\u0003\u0000\u0000\u00bb"+
		"\u00c5\u0001\u0000\u0000\u0000\u00bc\u00bd\u00052\u0000\u0000\u00bd\u00be"+
		"\u0005\t\u0000\u0000\u00be\u00bf\u0003\u0014\n\u0000\u00bf\u00c0\u0005"+
		"\n\u0000\u0000\u00c0\u00c1\u0005\u001b\u0000\u0000\u00c1\u00c2\u0003\u0014"+
		"\n\u0000\u00c2\u00c3\u0005\u0003\u0000\u0000\u00c3\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c4\u009e\u0001\u0000\u0000\u0000\u00c4\u00a1\u0001\u0000\u0000"+
		"\u0000\u00c4\u00a9\u0001\u0000\u0000\u0000\u00c4\u00b1\u0001\u0000\u0000"+
		"\u0000\u00c4\u00b7\u0001\u0000\u0000\u0000\u00c4\u00bc\u0001\u0000\u0000"+
		"\u0000\u00c5\u0011\u0001\u0000\u0000\u0000\u00c6\u00cb\u0003\u0014\n\u0000"+
		"\u00c7\u00c8\u0005\u0016\u0000\u0000\u00c8\u00ca\u0003\u0014\n\u0000\u00c9"+
		"\u00c7\u0001\u0000\u0000\u0000\u00ca\u00cd\u0001\u0000\u0000\u0000\u00cb"+
		"\u00c9\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc"+
		"\u0013\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00ce"+
		"\u00cf\u0006\n\uffff\uffff\u0000\u00cf\u00d0\u0005\u0013\u0000\u0000\u00d0"+
		"\u00d1\u0003\u0014\n\u0000\u00d1\u00d2\u0005\u0015\u0000\u0000\u00d2\u00fc"+
		"\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005\u001c\u0000\u0000\u00d4\u00d5"+
		"\u0005\u000b\u0000\u0000\u00d5\u00d6\u0005\t\u0000\u0000\u00d6\u00d7\u0003"+
		"\u0014\n\u0000\u00d7\u00d8\u0005\n\u0000\u0000\u00d8\u00fc\u0001\u0000"+
		"\u0000\u0000\u00d9\u00da\u0005\u001c\u0000\u0000\u00da\u00db\u00052\u0000"+
		"\u0000\u00db\u00dd\u0005\u0013\u0000\u0000\u00dc\u00de\u0003\u0012\t\u0000"+
		"\u00dd\u00dc\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000"+
		"\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00fc\u0005\u0015\u0000\u0000"+
		"\u00e0\u00e1\u00052\u0000\u0000\u00e1\u00e3\u0005\u0013\u0000\u0000\u00e2"+
		"\u00e4\u0003\u0012\t\u0000\u00e3\u00e2\u0001\u0000\u0000\u0000\u00e3\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u00fc"+
		"\u0005\u0015\u0000\u0000\u00e6\u00e7\u0005\t\u0000\u0000\u00e7\u00ec\u0003"+
		"\u0014\n\u0000\u00e8\u00e9\u0005\u0016\u0000\u0000\u00e9\u00eb\u0003\u0014"+
		"\n\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00eb\u00ee\u0001\u0000\u0000"+
		"\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000"+
		"\u0000\u00ed\u00ef\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000"+
		"\u0000\u00ef\u00f0\u0005\n\u0000\u0000\u00f0\u00fc\u0001\u0000\u0000\u0000"+
		"\u00f1\u00fc\u0005\u001e\u0000\u0000\u00f2\u00f3\u0005\u001f\u0000\u0000"+
		"\u00f3\u00fc\u0003\u0014\n\t\u00f4\u00fc\u00051\u0000\u0000\u00f5\u00fc"+
		"\u0005*\u0000\u0000\u00f6\u00fc\u0005+\u0000\u0000\u00f7\u00f9\u00052"+
		"\u0000\u0000\u00f8\u00fa\u0007\u0000\u0000\u0000\u00f9\u00f8\u0001\u0000"+
		"\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa\u00fc\u0001\u0000"+
		"\u0000\u0000\u00fb\u00ce\u0001\u0000\u0000\u0000\u00fb\u00d3\u0001\u0000"+
		"\u0000\u0000\u00fb\u00d9\u0001\u0000\u0000\u0000\u00fb\u00e0\u0001\u0000"+
		"\u0000\u0000\u00fb\u00e6\u0001\u0000\u0000\u0000\u00fb\u00f1\u0001\u0000"+
		"\u0000\u0000\u00fb\u00f2\u0001\u0000\u0000\u0000\u00fb\u00f4\u0001\u0000"+
		"\u0000\u0000\u00fb\u00f5\u0001\u0000\u0000\u0000\u00fb\u00f6\u0001\u0000"+
		"\u0000\u0000\u00fb\u00f7\u0001\u0000\u0000\u0000\u00fc\u011b\u0001\u0000"+
		"\u0000\u0000\u00fd\u00fe\n\u0005\u0000\u0000\u00fe\u00ff\u0007\u0001\u0000"+
		"\u0000\u00ff\u011a\u0003\u0014\n\u0006\u0100\u0101\n\u000f\u0000\u0000"+
		"\u0101\u0102\u0005\t\u0000\u0000\u0102\u0103\u0003\u0014\n\u0000\u0103"+
		"\u0104\u0005\n\u0000\u0000\u0104\u011a\u0001\u0000\u0000\u0000\u0105\u0106"+
		"\n\r\u0000\u0000\u0106\u0107\u0005\u0002\u0000\u0000\u0107\u0108\u0005"+
		"2\u0000\u0000\u0108\u010a\u0005\u0013\u0000\u0000\u0109\u010b\u0003\u0012"+
		"\t\u0000\u010a\u0109\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000"+
		"\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u011a\u0005\u0015\u0000"+
		"\u0000\u010d\u010e\n\f\u0000\u0000\u010e\u010f\u0005\u0002\u0000\u0000"+
		"\u010f\u011a\u0005\u001d\u0000\u0000\u0110\u0111\n\b\u0000\u0000\u0111"+
		"\u0112\u0007\u0002\u0000\u0000\u0112\u011a\u0003\u0014\n\u0000\u0113\u0114"+
		"\n\u0007\u0000\u0000\u0114\u0115\u0007\u0003\u0000\u0000\u0115\u011a\u0003"+
		"\u0014\n\u0000\u0116\u0117\n\u0006\u0000\u0000\u0117\u0118\u0007\u0004"+
		"\u0000\u0000\u0118\u011a\u0003\u0014\n\u0000\u0119\u00fd\u0001\u0000\u0000"+
		"\u0000\u0119\u0100\u0001\u0000\u0000\u0000\u0119\u0105\u0001\u0000\u0000"+
		"\u0000\u0119\u010d\u0001\u0000\u0000\u0000\u0119\u0110\u0001\u0000\u0000"+
		"\u0000\u0119\u0113\u0001\u0000\u0000\u0000\u0119\u0116\u0001\u0000\u0000"+
		"\u0000\u011a\u011d\u0001\u0000\u0000\u0000\u011b\u0119\u0001\u0000\u0000"+
		"\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c\u0015\u0001\u0000\u0000"+
		"\u0000\u011d\u011b\u0001\u0000\u0000\u0000 \u0019\u001e(.4:@MT[`npux~"+
		"\u0084\u008b\u008d\u0091\u0095\u00a5\u00c4\u00cb\u00dd\u00e3\u00ec\u00f9"+
		"\u00fb\u010a\u0119\u011b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}