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
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, WS=44, SINGLE_COMMENT=45, 
		MULTI_COMMENT=46, INTEGER=47, ID=48;
	public static final int
		RULE_program = 0, RULE_importDeclaration = 1, RULE_classDeclaration = 2, 
		RULE_type = 3, RULE_fieldDeclaration = 4, RULE_methodDeclaration = 5, 
		RULE_argument = 6, RULE_statement = 7, RULE_expression = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "importDeclaration", "classDeclaration", "type", "fieldDeclaration", 
			"methodDeclaration", "argument", "statement", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'.'", "';'", "'class'", "'extends'", "'{'", "'}'", 
			"'['", "']'", "'int'", "'...'", "'boolean'", "'String'", "'public'", 
			"'static'", "'('", "','", "')'", "'return'", "'void'", "'main'", "'if'", 
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
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(18);
				importDeclaration();
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(24);
			classDeclaration();
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 281474977821696L) != 0)) {
				{
				setState(25);
				methodDeclaration();
				}
			}

			setState(28);
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
			setState(30);
			match(T__0);
			setState(31);
			((ImportStatementContext)_localctx).ID = match(ID);
			((ImportStatementContext)_localctx).value.add(((ImportStatementContext)_localctx).ID);
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(32);
				match(T__1);
				setState(33);
				((ImportStatementContext)_localctx).ID = match(ID);
				((ImportStatementContext)_localctx).value.add(((ImportStatementContext)_localctx).ID);
				}
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(39);
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
			setState(41);
			match(T__3);
			setState(42);
			((ClassDeclContext)_localctx).className = match(ID);
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(43);
				match(T__4);
				setState(44);
				((ClassDeclContext)_localctx).superClassName = match(ID);
				}
			}

			setState(47);
			match(T__5);
			setState(51);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(48);
					fieldDeclaration();
					}
					} 
				}
				setState(53);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 281474977821696L) != 0)) {
				{
				{
				setState(54);
				methodDeclaration();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
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
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(63);
				((TypeContext)_localctx).typeName = match(T__9);
				}
				break;
			case 2:
				{
				setState(64);
				((TypeContext)_localctx).typeName = match(T__9);
				setState(65);
				match(T__10);
				}
				break;
			case 3:
				{
				setState(66);
				((TypeContext)_localctx).typeName = match(T__11);
				}
				break;
			case 4:
				{
				setState(67);
				((TypeContext)_localctx).typeName = match(T__12);
				}
				break;
			case 5:
				{
				setState(68);
				((TypeContext)_localctx).typeName = match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(76);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(71);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(72);
					match(T__7);
					setState(73);
					match(T__8);
					}
					} 
				}
				setState(78);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
			setState(79);
			type(0);
			setState(80);
			((FieldDeclarationContext)_localctx).fieldName = match(ID);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(81);
				match(T__7);
				setState(82);
				match(T__8);
				}
			}

			setState(85);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		public MethDeclarationContext(MethodDeclarationContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethDeclarationVoidContext extends MethodDeclarationContext {
		public Token methodName;
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
		public MethDeclarationVoidContext(MethodDeclarationContext ctx) { copyFrom(ctx); }
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
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new MethDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(87);
					match(T__13);
					}
				}

				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(90);
					match(T__14);
					}
				}

				setState(93);
				((MethDeclarationContext)_localctx).returnType = type(0);
				setState(94);
				((MethDeclarationContext)_localctx).methodName = match(ID);
				setState(95);
				match(T__15);
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 281474976723968L) != 0)) {
					{
					setState(96);
					argument();
					}
				}

				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__16) {
					{
					{
					setState(99);
					match(T__16);
					setState(100);
					argument();
					}
					}
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(106);
				match(T__17);
				setState(107);
				match(T__5);
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 425511893415232L) != 0)) {
					{
					setState(110);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
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
				match(T__18);
				setState(116);
				expression(0);
				setState(117);
				match(T__2);
				setState(118);
				match(T__6);
				}
				break;
			case 2:
				_localctx = new MethDeclarationVoidContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(120);
					match(T__13);
					}
				}

				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(123);
					match(T__14);
					}
				}

				setState(126);
				match(T__19);
				setState(127);
				((MethDeclarationVoidContext)_localctx).methodName = match(ID);
				setState(128);
				match(T__15);
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 281474976723968L) != 0)) {
					{
					setState(129);
					argument();
					}
				}

				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__16) {
					{
					{
					setState(132);
					match(T__16);
					setState(133);
					argument();
					}
					}
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(139);
				match(T__17);
				setState(140);
				match(T__5);
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 425511893415232L) != 0)) {
					{
					setState(143);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						setState(141);
						fieldDeclaration();
						}
						break;
					case 2:
						{
						setState(142);
						statement();
						}
						break;
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(148);
				match(T__6);
				}
				break;
			case 3:
				_localctx = new MainMethDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				match(T__13);
				setState(150);
				match(T__14);
				setState(151);
				match(T__19);
				setState(152);
				match(T__20);
				setState(153);
				match(T__15);
				setState(154);
				match(T__12);
				setState(155);
				match(T__7);
				setState(156);
				match(T__8);
				setState(157);
				((MainMethDeclarationContext)_localctx).argName = match(ID);
				setState(158);
				match(T__17);
				setState(159);
				match(T__5);
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 425511893415232L) != 0)) {
					{
					setState(162);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						setState(160);
						fieldDeclaration();
						}
						break;
					case 2:
						{
						setState(161);
						statement();
						}
						break;
					}
					}
					setState(166);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(167);
				match(T__6);
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
			setState(170);
			type(0);
			setState(171);
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
		enterRule(_localctx, 14, RULE_statement);
		int _la;
		try {
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				expression(0);
				setState(174);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				match(T__5);
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 425511893401920L) != 0)) {
					{
					{
					setState(177);
					statement();
					}
					}
					setState(182);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(183);
				match(T__6);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				match(T__21);
				setState(185);
				match(T__15);
				setState(186);
				expression(0);
				setState(187);
				match(T__17);
				setState(188);
				statement();
				{
				setState(189);
				match(T__22);
				setState(190);
				statement();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(192);
				match(T__23);
				setState(193);
				match(T__15);
				setState(194);
				expression(0);
				setState(195);
				match(T__17);
				setState(196);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(198);
				match(ID);
				setState(199);
				match(T__24);
				setState(200);
				expression(0);
				setState(201);
				match(T__2);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(203);
				match(ID);
				setState(204);
				match(T__7);
				setState(205);
				expression(0);
				setState(206);
				match(T__8);
				setState(207);
				match(T__24);
				setState(208);
				expression(0);
				setState(209);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(214);
				match(T__15);
				setState(215);
				expression(0);
				setState(216);
				match(T__17);
				}
				break;
			case 2:
				{
				_localctx = new NewIntArrayExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(218);
				match(T__25);
				setState(219);
				match(T__9);
				setState(220);
				match(T__7);
				setState(221);
				((NewIntArrayExpressionContext)_localctx).size = expression(0);
				setState(222);
				match(T__8);
				}
				break;
			case 3:
				{
				_localctx = new ClassInstantiationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(224);
				match(T__25);
				setState(225);
				((ClassInstantiationExpressionContext)_localctx).classname = match(ID);
				setState(238);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(226);
					match(T__15);
					setState(235);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 425511872430336L) != 0)) {
						{
						setState(227);
						expression(0);
						setState(232);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__16) {
							{
							{
							setState(228);
							match(T__16);
							setState(229);
							expression(0);
							}
							}
							setState(234);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(237);
					match(T__17);
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
				setState(240);
				match(T__7);
				setState(241);
				expression(0);
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__16) {
					{
					{
					setState(242);
					match(T__16);
					setState(243);
					expression(0);
					}
					}
					setState(248);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(249);
				match(T__8);
				}
				break;
			case 5:
				{
				_localctx = new ThisReferenceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(251);
				match(T__27);
				}
				break;
			case 6:
				{
				_localctx = new NegationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(252);
				match(T__28);
				setState(253);
				expression(9);
				}
				break;
			case 7:
				{
				_localctx = new IntegerLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(254);
				match(INTEGER);
				}
				break;
			case 8:
				{
				_localctx = new BooleanLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(255);
				match(T__39);
				}
				break;
			case 9:
				{
				_localctx = new BooleanLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(256);
				match(T__40);
				}
				break;
			case 10:
				{
				_localctx = new VariableReferenceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(257);
				((VariableReferenceExpressionContext)_localctx).variable = match(ID);
				setState(259);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(258);
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
			setState(300);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(298);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(263);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(264);
						_la = _input.LA(1);
						if ( !(_la==T__37 || _la==T__38) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(265);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new ArrayAccessExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(266);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(267);
						match(T__7);
						setState(268);
						((ArrayAccessExpressionContext)_localctx).index = expression(0);
						setState(269);
						match(T__8);
						}
						break;
					case 3:
						{
						_localctx = new FunctionCallExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(271);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(272);
						match(T__1);
						setState(273);
						((FunctionCallExpressionContext)_localctx).value = match(ID);
						setState(274);
						match(T__15);
						setState(283);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 425511872430336L) != 0)) {
							{
							setState(275);
							expression(0);
							setState(280);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__16) {
								{
								{
								setState(276);
								match(T__16);
								setState(277);
								expression(0);
								}
								}
								setState(282);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(285);
						match(T__17);
						}
						break;
					case 4:
						{
						_localctx = new ArrayLengthExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(286);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(287);
						match(T__1);
						setState(288);
						match(T__26);
						}
						break;
					case 5:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(289);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						{
						setState(290);
						_la = _input.LA(1);
						if ( !(_la==T__29 || _la==T__30) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(291);
						expression(0);
						}
						}
						break;
					case 6:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(292);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						{
						setState(293);
						_la = _input.LA(1);
						if ( !(_la==T__31 || _la==T__32) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(294);
						expression(0);
						}
						}
						break;
					case 7:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(295);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						{
						setState(296);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 257698037760L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(297);
						expression(0);
						}
						}
						break;
					}
					} 
				}
				setState(302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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
		case 8:
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
		"\u0004\u00010\u0130\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0005\u0000\u0014\b\u0000\n\u0000\f\u0000\u0017"+
		"\t\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u001b\b\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		"#\b\u0001\n\u0001\f\u0001&\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002.\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u00022\b\u0002\n\u0002\f\u00025\t\u0002\u0001\u0002"+
		"\u0005\u00028\b\u0002\n\u0002\f\u0002;\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003F\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003K\b\u0003\n\u0003\f\u0003N\t\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004T\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0003\u0005Y\b\u0005\u0001\u0005\u0003\u0005\\\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005b\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005f\b\u0005\n\u0005\f\u0005i\t\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005o\b\u0005\n\u0005"+
		"\f\u0005r\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005z\b\u0005\u0001\u0005\u0003\u0005}\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0083\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005\u0087\b\u0005\n\u0005\f\u0005\u008a"+
		"\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u0090"+
		"\b\u0005\n\u0005\f\u0005\u0093\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"\u00a3\b\u0005\n\u0005\f\u0005\u00a6\t\u0005\u0001\u0005\u0003\u0005\u00a9"+
		"\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00b3\b\u0007\n\u0007\f\u0007"+
		"\u00b6\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u00d4\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0005\b\u00e7\b\b\n\b\f\b\u00ea\t\b\u0003\b\u00ec\b\b\u0001"+
		"\b\u0003\b\u00ef\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00f5\b\b"+
		"\n\b\f\b\u00f8\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\b\u0104\b\b\u0003\b\u0106\b\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u0117\b\b\n\b\f\b\u011a"+
		"\t\b\u0003\b\u011c\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u012b"+
		"\b\b\n\b\f\b\u012e\t\b\u0001\b\u0000\u0002\u0006\u0010\t\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0000\u0005\u0001\u0000*+\u0001\u0000&\'\u0001"+
		"\u0000\u001e\u001f\u0001\u0000 !\u0001\u0000\"%\u015f\u0000\u0015\u0001"+
		"\u0000\u0000\u0000\u0002\u001e\u0001\u0000\u0000\u0000\u0004)\u0001\u0000"+
		"\u0000\u0000\u0006E\u0001\u0000\u0000\u0000\bO\u0001\u0000\u0000\u0000"+
		"\n\u00a8\u0001\u0000\u0000\u0000\f\u00aa\u0001\u0000\u0000\u0000\u000e"+
		"\u00d3\u0001\u0000\u0000\u0000\u0010\u0105\u0001\u0000\u0000\u0000\u0012"+
		"\u0014\u0003\u0002\u0001\u0000\u0013\u0012\u0001\u0000\u0000\u0000\u0014"+
		"\u0017\u0001\u0000\u0000\u0000\u0015\u0013\u0001\u0000\u0000\u0000\u0015"+
		"\u0016\u0001\u0000\u0000\u0000\u0016\u0018\u0001\u0000\u0000\u0000\u0017"+
		"\u0015\u0001\u0000\u0000\u0000\u0018\u001a\u0003\u0004\u0002\u0000\u0019"+
		"\u001b\u0003\n\u0005\u0000\u001a\u0019\u0001\u0000\u0000\u0000\u001a\u001b"+
		"\u0001\u0000\u0000\u0000\u001b\u001c\u0001\u0000\u0000\u0000\u001c\u001d"+
		"\u0005\u0000\u0000\u0001\u001d\u0001\u0001\u0000\u0000\u0000\u001e\u001f"+
		"\u0005\u0001\u0000\u0000\u001f$\u00050\u0000\u0000 !\u0005\u0002\u0000"+
		"\u0000!#\u00050\u0000\u0000\" \u0001\u0000\u0000\u0000#&\u0001\u0000\u0000"+
		"\u0000$\"\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000%\'\u0001\u0000"+
		"\u0000\u0000&$\u0001\u0000\u0000\u0000\'(\u0005\u0003\u0000\u0000(\u0003"+
		"\u0001\u0000\u0000\u0000)*\u0005\u0004\u0000\u0000*-\u00050\u0000\u0000"+
		"+,\u0005\u0005\u0000\u0000,.\u00050\u0000\u0000-+\u0001\u0000\u0000\u0000"+
		"-.\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/3\u0005\u0006\u0000"+
		"\u000002\u0003\b\u0004\u000010\u0001\u0000\u0000\u000025\u0001\u0000\u0000"+
		"\u000031\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u000049\u0001\u0000"+
		"\u0000\u000053\u0001\u0000\u0000\u000068\u0003\n\u0005\u000076\u0001\u0000"+
		"\u0000\u00008;\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u00009:\u0001"+
		"\u0000\u0000\u0000:<\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000"+
		"<=\u0005\u0007\u0000\u0000=\u0005\u0001\u0000\u0000\u0000>?\u0006\u0003"+
		"\uffff\uffff\u0000?F\u0005\n\u0000\u0000@A\u0005\n\u0000\u0000AF\u0005"+
		"\u000b\u0000\u0000BF\u0005\f\u0000\u0000CF\u0005\r\u0000\u0000DF\u0005"+
		"0\u0000\u0000E>\u0001\u0000\u0000\u0000E@\u0001\u0000\u0000\u0000EB\u0001"+
		"\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000ED\u0001\u0000\u0000\u0000"+
		"FL\u0001\u0000\u0000\u0000GH\n\u0006\u0000\u0000HI\u0005\b\u0000\u0000"+
		"IK\u0005\t\u0000\u0000JG\u0001\u0000\u0000\u0000KN\u0001\u0000\u0000\u0000"+
		"LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000M\u0007\u0001\u0000"+
		"\u0000\u0000NL\u0001\u0000\u0000\u0000OP\u0003\u0006\u0003\u0000PS\u0005"+
		"0\u0000\u0000QR\u0005\b\u0000\u0000RT\u0005\t\u0000\u0000SQ\u0001\u0000"+
		"\u0000\u0000ST\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UV\u0005"+
		"\u0003\u0000\u0000V\t\u0001\u0000\u0000\u0000WY\u0005\u000e\u0000\u0000"+
		"XW\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Y[\u0001\u0000\u0000"+
		"\u0000Z\\\u0005\u000f\u0000\u0000[Z\u0001\u0000\u0000\u0000[\\\u0001\u0000"+
		"\u0000\u0000\\]\u0001\u0000\u0000\u0000]^\u0003\u0006\u0003\u0000^_\u0005"+
		"0\u0000\u0000_a\u0005\u0010\u0000\u0000`b\u0003\f\u0006\u0000a`\u0001"+
		"\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bg\u0001\u0000\u0000\u0000"+
		"cd\u0005\u0011\u0000\u0000df\u0003\f\u0006\u0000ec\u0001\u0000\u0000\u0000"+
		"fi\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000"+
		"\u0000hj\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000jk\u0005\u0012"+
		"\u0000\u0000kp\u0005\u0006\u0000\u0000lo\u0003\b\u0004\u0000mo\u0003\u000e"+
		"\u0007\u0000nl\u0001\u0000\u0000\u0000nm\u0001\u0000\u0000\u0000or\u0001"+
		"\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000"+
		"qs\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000st\u0005\u0013\u0000"+
		"\u0000tu\u0003\u0010\b\u0000uv\u0005\u0003\u0000\u0000vw\u0005\u0007\u0000"+
		"\u0000w\u00a9\u0001\u0000\u0000\u0000xz\u0005\u000e\u0000\u0000yx\u0001"+
		"\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z|\u0001\u0000\u0000\u0000"+
		"{}\u0005\u000f\u0000\u0000|{\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000"+
		"\u0000}~\u0001\u0000\u0000\u0000~\u007f\u0005\u0014\u0000\u0000\u007f"+
		"\u0080\u00050\u0000\u0000\u0080\u0082\u0005\u0010\u0000\u0000\u0081\u0083"+
		"\u0003\f\u0006\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0082\u0083\u0001"+
		"\u0000\u0000\u0000\u0083\u0088\u0001\u0000\u0000\u0000\u0084\u0085\u0005"+
		"\u0011\u0000\u0000\u0085\u0087\u0003\f\u0006\u0000\u0086\u0084\u0001\u0000"+
		"\u0000\u0000\u0087\u008a\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000"+
		"\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008b\u0001\u0000"+
		"\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008b\u008c\u0005\u0012"+
		"\u0000\u0000\u008c\u0091\u0005\u0006\u0000\u0000\u008d\u0090\u0003\b\u0004"+
		"\u0000\u008e\u0090\u0003\u000e\u0007\u0000\u008f\u008d\u0001\u0000\u0000"+
		"\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u0090\u0093\u0001\u0000\u0000"+
		"\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000"+
		"\u0000\u0092\u0094\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000"+
		"\u0000\u0094\u00a9\u0005\u0007\u0000\u0000\u0095\u0096\u0005\u000e\u0000"+
		"\u0000\u0096\u0097\u0005\u000f\u0000\u0000\u0097\u0098\u0005\u0014\u0000"+
		"\u0000\u0098\u0099\u0005\u0015\u0000\u0000\u0099\u009a\u0005\u0010\u0000"+
		"\u0000\u009a\u009b\u0005\r\u0000\u0000\u009b\u009c\u0005\b\u0000\u0000"+
		"\u009c\u009d\u0005\t\u0000\u0000\u009d\u009e\u00050\u0000\u0000\u009e"+
		"\u009f\u0005\u0012\u0000\u0000\u009f\u00a4\u0005\u0006\u0000\u0000\u00a0"+
		"\u00a3\u0003\b\u0004\u0000\u00a1\u00a3\u0003\u000e\u0007\u0000\u00a2\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a7\u0001\u0000\u0000\u0000\u00a6\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a9\u0005\u0007\u0000\u0000\u00a8X\u0001"+
		"\u0000\u0000\u0000\u00a8y\u0001\u0000\u0000\u0000\u00a8\u0095\u0001\u0000"+
		"\u0000\u0000\u00a9\u000b\u0001\u0000\u0000\u0000\u00aa\u00ab\u0003\u0006"+
		"\u0003\u0000\u00ab\u00ac\u00050\u0000\u0000\u00ac\r\u0001\u0000\u0000"+
		"\u0000\u00ad\u00ae\u0003\u0010\b\u0000\u00ae\u00af\u0005\u0003\u0000\u0000"+
		"\u00af\u00d4\u0001\u0000\u0000\u0000\u00b0\u00b4\u0005\u0006\u0000\u0000"+
		"\u00b1\u00b3\u0003\u000e\u0007\u0000\u00b2\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b6\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b7\u00d4\u0005\u0007\u0000\u0000"+
		"\u00b8\u00b9\u0005\u0016\u0000\u0000\u00b9\u00ba\u0005\u0010\u0000\u0000"+
		"\u00ba\u00bb\u0003\u0010\b\u0000\u00bb\u00bc\u0005\u0012\u0000\u0000\u00bc"+
		"\u00bd\u0003\u000e\u0007\u0000\u00bd\u00be\u0005\u0017\u0000\u0000\u00be"+
		"\u00bf\u0003\u000e\u0007\u0000\u00bf\u00d4\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c1\u0005\u0018\u0000\u0000\u00c1\u00c2\u0005\u0010\u0000\u0000\u00c2"+
		"\u00c3\u0003\u0010\b\u0000\u00c3\u00c4\u0005\u0012\u0000\u0000\u00c4\u00c5"+
		"\u0003\u000e\u0007\u0000\u00c5\u00d4\u0001\u0000\u0000\u0000\u00c6\u00c7"+
		"\u00050\u0000\u0000\u00c7\u00c8\u0005\u0019\u0000\u0000\u00c8\u00c9\u0003"+
		"\u0010\b\u0000\u00c9\u00ca\u0005\u0003\u0000\u0000\u00ca\u00d4\u0001\u0000"+
		"\u0000\u0000\u00cb\u00cc\u00050\u0000\u0000\u00cc\u00cd\u0005\b\u0000"+
		"\u0000\u00cd\u00ce\u0003\u0010\b\u0000\u00ce\u00cf\u0005\t\u0000\u0000"+
		"\u00cf\u00d0\u0005\u0019\u0000\u0000\u00d0\u00d1\u0003\u0010\b\u0000\u00d1"+
		"\u00d2\u0005\u0003\u0000\u0000\u00d2\u00d4\u0001\u0000\u0000\u0000\u00d3"+
		"\u00ad\u0001\u0000\u0000\u0000\u00d3\u00b0\u0001\u0000\u0000\u0000\u00d3"+
		"\u00b8\u0001\u0000\u0000\u0000\u00d3\u00c0\u0001\u0000\u0000\u0000\u00d3"+
		"\u00c6\u0001\u0000\u0000\u0000\u00d3\u00cb\u0001\u0000\u0000\u0000\u00d4"+
		"\u000f\u0001\u0000\u0000\u0000\u00d5\u00d6\u0006\b\uffff\uffff\u0000\u00d6"+
		"\u00d7\u0005\u0010\u0000\u0000\u00d7\u00d8\u0003\u0010\b\u0000\u00d8\u00d9"+
		"\u0005\u0012\u0000\u0000\u00d9\u0106\u0001\u0000\u0000\u0000\u00da\u00db"+
		"\u0005\u001a\u0000\u0000\u00db\u00dc\u0005\n\u0000\u0000\u00dc\u00dd\u0005"+
		"\b\u0000\u0000\u00dd\u00de\u0003\u0010\b\u0000\u00de\u00df\u0005\t\u0000"+
		"\u0000\u00df\u0106\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005\u001a\u0000"+
		"\u0000\u00e1\u00ee\u00050\u0000\u0000\u00e2\u00eb\u0005\u0010\u0000\u0000"+
		"\u00e3\u00e8\u0003\u0010\b\u0000\u00e4\u00e5\u0005\u0011\u0000\u0000\u00e5"+
		"\u00e7\u0003\u0010\b\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e7\u00ea"+
		"\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e9"+
		"\u0001\u0000\u0000\u0000\u00e9\u00ec\u0001\u0000\u0000\u0000\u00ea\u00e8"+
		"\u0001\u0000\u0000\u0000\u00eb\u00e3\u0001\u0000\u0000\u0000\u00eb\u00ec"+
		"\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00ef"+
		"\u0005\u0012\u0000\u0000\u00ee\u00e2\u0001\u0000\u0000\u0000\u00ee\u00ef"+
		"\u0001\u0000\u0000\u0000\u00ef\u0106\u0001\u0000\u0000\u0000\u00f0\u00f1"+
		"\u0005\b\u0000\u0000\u00f1\u00f6\u0003\u0010\b\u0000\u00f2\u00f3\u0005"+
		"\u0011\u0000\u0000\u00f3\u00f5\u0003\u0010\b\u0000\u00f4\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f8\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00f9\u0001\u0000"+
		"\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005\t\u0000"+
		"\u0000\u00fa\u0106\u0001\u0000\u0000\u0000\u00fb\u0106\u0005\u001c\u0000"+
		"\u0000\u00fc\u00fd\u0005\u001d\u0000\u0000\u00fd\u0106\u0003\u0010\b\t"+
		"\u00fe\u0106\u0005/\u0000\u0000\u00ff\u0106\u0005(\u0000\u0000\u0100\u0106"+
		"\u0005)\u0000\u0000\u0101\u0103\u00050\u0000\u0000\u0102\u0104\u0007\u0000"+
		"\u0000\u0000\u0103\u0102\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000"+
		"\u0000\u0000\u0104\u0106\u0001\u0000\u0000\u0000\u0105\u00d5\u0001\u0000"+
		"\u0000\u0000\u0105\u00da\u0001\u0000\u0000\u0000\u0105\u00e0\u0001\u0000"+
		"\u0000\u0000\u0105\u00f0\u0001\u0000\u0000\u0000\u0105\u00fb\u0001\u0000"+
		"\u0000\u0000\u0105\u00fc\u0001\u0000\u0000\u0000\u0105\u00fe\u0001\u0000"+
		"\u0000\u0000\u0105\u00ff\u0001\u0000\u0000\u0000\u0105\u0100\u0001\u0000"+
		"\u0000\u0000\u0105\u0101\u0001\u0000\u0000\u0000\u0106\u012c\u0001\u0000"+
		"\u0000\u0000\u0107\u0108\n\u0005\u0000\u0000\u0108\u0109\u0007\u0001\u0000"+
		"\u0000\u0109\u012b\u0003\u0010\b\u0006\u010a\u010b\n\u000e\u0000\u0000"+
		"\u010b\u010c\u0005\b\u0000\u0000\u010c\u010d\u0003\u0010\b\u0000\u010d"+
		"\u010e\u0005\t\u0000\u0000\u010e\u012b\u0001\u0000\u0000\u0000\u010f\u0110"+
		"\n\r\u0000\u0000\u0110\u0111\u0005\u0002\u0000\u0000\u0111\u0112\u0005"+
		"0\u0000\u0000\u0112\u011b\u0005\u0010\u0000\u0000\u0113\u0118\u0003\u0010"+
		"\b\u0000\u0114\u0115\u0005\u0011\u0000\u0000\u0115\u0117\u0003\u0010\b"+
		"\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0117\u011a\u0001\u0000\u0000"+
		"\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000"+
		"\u0000\u0119\u011c\u0001\u0000\u0000\u0000\u011a\u0118\u0001\u0000\u0000"+
		"\u0000\u011b\u0113\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000"+
		"\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u012b\u0005\u0012\u0000"+
		"\u0000\u011e\u011f\n\f\u0000\u0000\u011f\u0120\u0005\u0002\u0000\u0000"+
		"\u0120\u012b\u0005\u001b\u0000\u0000\u0121\u0122\n\b\u0000\u0000\u0122"+
		"\u0123\u0007\u0002\u0000\u0000\u0123\u012b\u0003\u0010\b\u0000\u0124\u0125"+
		"\n\u0007\u0000\u0000\u0125\u0126\u0007\u0003\u0000\u0000\u0126\u012b\u0003"+
		"\u0010\b\u0000\u0127\u0128\n\u0006\u0000\u0000\u0128\u0129\u0007\u0004"+
		"\u0000\u0000\u0129\u012b\u0003\u0010\b\u0000\u012a\u0107\u0001\u0000\u0000"+
		"\u0000\u012a\u010a\u0001\u0000\u0000\u0000\u012a\u010f\u0001\u0000\u0000"+
		"\u0000\u012a\u011e\u0001\u0000\u0000\u0000\u012a\u0121\u0001\u0000\u0000"+
		"\u0000\u012a\u0124\u0001\u0000\u0000\u0000\u012a\u0127\u0001\u0000\u0000"+
		"\u0000\u012b\u012e\u0001\u0000\u0000\u0000\u012c\u012a\u0001\u0000\u0000"+
		"\u0000\u012c\u012d\u0001\u0000\u0000\u0000\u012d\u0011\u0001\u0000\u0000"+
		"\u0000\u012e\u012c\u0001\u0000\u0000\u0000$\u0015\u001a$-39ELSX[agnpy"+
		"|\u0082\u0088\u008f\u0091\u00a2\u00a4\u00a8\u00b4\u00d3\u00e8\u00eb\u00ee"+
		"\u00f6\u0103\u0105\u0118\u011b\u012a\u012c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}