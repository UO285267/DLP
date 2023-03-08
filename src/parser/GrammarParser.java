// Generated from src\parser\Grammar.g4 by ANTLR 4.7.2
package parser;

	import ast.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, LITENT=38, 
		LITREAL=39, LITCHAR=40, IDENT=41, LINE_COMMENT=42, MULTILINE_COMMENT=43, 
		WHITESPACE=44;
	public static final int
		RULE_start = 0, RULE_estructura = 1, RULE_definicion = 2, RULE_sentencia = 3, 
		RULE_expr = 4, RULE_funcion = 5, RULE_parametro = 6, RULE_tipo = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "estructura", "definicion", "sentencia", "expr", "funcion", 
			"parametro", "tipo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'struct'", "'{'", "';'", "'}'", "'var '", "':'", "'print'", "'printsp'", 
			"'println'", "'read'", "'='", "'if'", "'('", "')'", "'else'", "'while'", 
			"'return'", "','", "'['", "']'", "'.'", "'<'", "'>'", "'*'", "'/'", "'+'", 
			"'-'", "'>='", "'<='", "'=='", "'!='", "'&&'", "'||'", "'!'", "'int'", 
			"'float'", "'char'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "LITENT", "LITREAL", "LITCHAR", "IDENT", "LINE_COMMENT", 
			"MULTILINE_COMMENT", "WHITESPACE"
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
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public Program ast;
		public DefinicionContext definicion;
		public FuncionContext funcion;
		public TerminalNode EOF() { return getToken(GrammarParser.EOF, 0); }
		public List<DefinicionContext> definicion() {
			return getRuleContexts(DefinicionContext.class);
		}
		public DefinicionContext definicion(int i) {
			return getRuleContext(DefinicionContext.class,i);
		}
		public List<FuncionContext> funcion() {
			return getRuleContexts(FuncionContext.class);
		}
		public FuncionContext funcion(int i) {
			return getRuleContext(FuncionContext.class,i);
		}
		public List<EstructuraContext> estructura() {
			return getRuleContexts(EstructuraContext.class);
		}
		public EstructuraContext estructura(int i) {
			return getRuleContext(EstructuraContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			List<Def> def = new ArrayList<Def>(); List<Func> func = new ArrayList<Func>();
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << IDENT))) != 0)) {
				{
				setState(24);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__4:
					{
					setState(17);
					((StartContext)_localctx).definicion = definicion();
					def.add(((StartContext)_localctx).definicion.ast);
					}
					break;
				case IDENT:
					{
					setState(20);
					((StartContext)_localctx).funcion = funcion();
					func.add(((StartContext)_localctx).funcion.ast);
					}
					break;
				case T__0:
					{
					setState(23);
					estructura();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(29);
			match(EOF);
			 ((StartContext)_localctx).ast =  new Program(def,func); 
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

	public static class EstructuraContext extends ParserRuleContext {
		public StructType ast;
		public Token IDENT;
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public EstructuraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estructura; }
	}

	public final EstructuraContext estructura() throws RecognitionException {
		EstructuraContext _localctx = new EstructuraContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_estructura);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(T__0);
			setState(33);
			((EstructuraContext)_localctx).IDENT = match(IDENT);
			setState(34);
			match(T__1);
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(35);
				parametro();
				setState(36);
				match(T__2);
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43);
			match(T__3);
			setState(44);
			match(T__2);
			 ((EstructuraContext)_localctx).ast =  new StructType(((EstructuraContext)_localctx).IDENT);
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

	public static class DefinicionContext extends ParserRuleContext {
		public Def ast;
		public Token IDENT;
		public TipoContext tipo;
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public DefinicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicion; }
	}

	public final DefinicionContext definicion() throws RecognitionException {
		DefinicionContext _localctx = new DefinicionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_definicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(T__4);
			setState(48);
			((DefinicionContext)_localctx).IDENT = match(IDENT);
			setState(49);
			match(T__5);
			setState(50);
			((DefinicionContext)_localctx).tipo = tipo();
			setState(51);
			match(T__2);
			((DefinicionContext)_localctx).ast =  new Def(((DefinicionContext)_localctx).IDENT, ((DefinicionContext)_localctx).tipo.ast);
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

	public static class SentenciaContext extends ParserRuleContext {
		public Sentence ast;
		public Token te;
		public ExprContext expr;
		public ExprContext left;
		public ExprContext right;
		public SentenciaContext sentencia;
		public List<SentenciaContext> tru = new ArrayList<SentenciaContext>();
		public List<SentenciaContext> fals = new ArrayList<SentenciaContext>();
		public List<SentenciaContext> se = new ArrayList<SentenciaContext>();
		public Token IDENT;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sentencia);
		int _la;
		try {
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				((SentenciaContext)_localctx).te = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
					((SentenciaContext)_localctx).te = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(55);
				((SentenciaContext)_localctx).expr = expr(0);
				setState(56);
				match(T__2);
				((SentenciaContext)_localctx).ast =  new Print((((SentenciaContext)_localctx).te!=null?((SentenciaContext)_localctx).te.getText():null),((SentenciaContext)_localctx).expr.ast);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				match(T__9);
				setState(60);
				((SentenciaContext)_localctx).expr = expr(0);
				setState(61);
				match(T__2);
				((SentenciaContext)_localctx).ast =  new Read(((SentenciaContext)_localctx).expr.ast);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				((SentenciaContext)_localctx).left = expr(0);
				setState(65);
				match(T__10);
				setState(66);
				((SentenciaContext)_localctx).right = expr(0);
				setState(67);
				match(T__2);
				((SentenciaContext)_localctx).ast =  new Assignment(((SentenciaContext)_localctx).left.ast, ((SentenciaContext)_localctx).right.ast);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(70);
				match(T__11);
				setState(71);
				match(T__12);
				setState(72);
				((SentenciaContext)_localctx).expr = expr(0);
				setState(73);
				match(T__13);
				setState(74);
				match(T__1);
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__21) | (1L << T__33) | (1L << LITENT) | (1L << LITREAL) | (1L << LITCHAR) | (1L << IDENT))) != 0)) {
					{
					{
					setState(75);
					((SentenciaContext)_localctx).sentencia = sentencia();
					((SentenciaContext)_localctx).tru.add(((SentenciaContext)_localctx).sentencia);
					}
					}
					setState(80);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(81);
				match(T__3);
				setState(82);
				match(T__14);
				setState(83);
				match(T__1);
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__21) | (1L << T__33) | (1L << LITENT) | (1L << LITREAL) | (1L << LITCHAR) | (1L << IDENT))) != 0)) {
					{
					{
					setState(84);
					((SentenciaContext)_localctx).sentencia = sentencia();
					((SentenciaContext)_localctx).fals.add(((SentenciaContext)_localctx).sentencia);
					}
					}
					setState(89);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(90);
				match(T__3);
				((SentenciaContext)_localctx).ast =  new IfElseSentence(((SentenciaContext)_localctx).expr.ast,((SentenciaContext)_localctx).tru,((SentenciaContext)_localctx).fals);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(93);
				match(T__11);
				setState(94);
				match(T__12);
				setState(95);
				((SentenciaContext)_localctx).expr = expr(0);
				setState(96);
				match(T__13);
				setState(97);
				match(T__1);
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__21) | (1L << T__33) | (1L << LITENT) | (1L << LITREAL) | (1L << LITCHAR) | (1L << IDENT))) != 0)) {
					{
					{
					setState(98);
					((SentenciaContext)_localctx).sentencia = sentencia();
					((SentenciaContext)_localctx).tru.add(((SentenciaContext)_localctx).sentencia);
					}
					}
					setState(103);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(104);
				match(T__3);
				((SentenciaContext)_localctx).ast =  new IfSentence(((SentenciaContext)_localctx).expr.ast,((SentenciaContext)_localctx).tru);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(107);
				match(T__15);
				setState(108);
				match(T__12);
				setState(109);
				((SentenciaContext)_localctx).expr = expr(0);
				setState(110);
				match(T__13);
				setState(111);
				match(T__1);
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__21) | (1L << T__33) | (1L << LITENT) | (1L << LITREAL) | (1L << LITCHAR) | (1L << IDENT))) != 0)) {
					{
					{
					setState(112);
					((SentenciaContext)_localctx).sentencia = sentencia();
					((SentenciaContext)_localctx).se.add(((SentenciaContext)_localctx).sentencia);
					}
					}
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(118);
				match(T__3);
				((SentenciaContext)_localctx).ast =  new WhileSentence(((SentenciaContext)_localctx).expr.ast,((SentenciaContext)_localctx).se);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(121);
				match(T__16);
				setState(122);
				((SentenciaContext)_localctx).expr = expr(0);
				setState(123);
				match(T__2);
				((SentenciaContext)_localctx).ast =  new ReturnNode(((SentenciaContext)_localctx).expr.ast);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(126);
				match(T__16);
				setState(127);
				match(T__2);
				((SentenciaContext)_localctx).ast =  new ReturnNode(null);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(129);
				((SentenciaContext)_localctx).IDENT = match(IDENT);
				setState(130);
				match(T__12);
				setState(131);
				((SentenciaContext)_localctx).expr = expr(0);
				setState(132);
				match(T__13);
				setState(133);
				match(T__2);
				((SentenciaContext)_localctx).ast =  new FuncCall(((SentenciaContext)_localctx).IDENT,((SentenciaContext)_localctx).expr.ast);
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

	public static class ExprContext extends ParserRuleContext {
		public Expr ast;
		public ExprContext left;
		public Token LITENT;
		public Token LITREAL;
		public Token LITCHAR;
		public Token IDENT;
		public ExprContext expr;
		public TipoContext tipo;
		public Token op;
		public ExprContext right;
		public TerminalNode LITENT() { return getToken(GrammarParser.LITENT, 0); }
		public TerminalNode LITREAL() { return getToken(GrammarParser.LITREAL, 0); }
		public TerminalNode LITCHAR() { return getToken(GrammarParser.LITCHAR, 0); }
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(139);
				((ExprContext)_localctx).LITENT = match(LITENT);
				((ExprContext)_localctx).ast =  new LitEnt(((ExprContext)_localctx).LITENT);
				}
				break;
			case 2:
				{
				setState(141);
				((ExprContext)_localctx).LITREAL = match(LITREAL);
				((ExprContext)_localctx).ast =  new LitReal(((ExprContext)_localctx).LITREAL);
				}
				break;
			case 3:
				{
				setState(143);
				((ExprContext)_localctx).LITCHAR = match(LITCHAR);
				((ExprContext)_localctx).ast =  new LitChar(((ExprContext)_localctx).LITCHAR);
				}
				break;
			case 4:
				{
				setState(145);
				((ExprContext)_localctx).IDENT = match(IDENT);
				((ExprContext)_localctx).ast =  new Variable(((ExprContext)_localctx).IDENT);
				}
				break;
			case 5:
				{
				setState(147);
				((ExprContext)_localctx).IDENT = match(IDENT);
				setState(148);
				match(T__12);
				setState(149);
				((ExprContext)_localctx).expr = expr(0);
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(150);
					match(T__17);
					setState(151);
					((ExprContext)_localctx).expr = expr(0);
					}
					}
					setState(156);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(157);
				match(T__13);
				}
				break;
			case 6:
				{
				setState(159);
				match(T__12);
				setState(160);
				((ExprContext)_localctx).expr = expr(0);
				setState(161);
				match(T__13);
				((ExprContext)_localctx).ast =  ((ExprContext)_localctx).expr.ast ;
				}
				break;
			case 7:
				{
				setState(164);
				match(T__21);
				setState(165);
				((ExprContext)_localctx).tipo = tipo();
				setState(166);
				match(T__22);
				setState(167);
				match(T__12);
				setState(168);
				((ExprContext)_localctx).expr = expr(0);
				setState(169);
				match(T__13);
				((ExprContext)_localctx).ast =  new Cast(((ExprContext)_localctx).tipo.ast, ((ExprContext)_localctx).expr.ast);
				}
				break;
			case 8:
				{
				setState(172);
				match(T__33);
				setState(173);
				((ExprContext)_localctx).expr = expr(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(210);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(176);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(177);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__23 || _la==T__24) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(178);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(8);
						((ExprContext)_localctx).ast =  new ExprAritmetica(((ExprContext)_localctx).left.ast, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.ast);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(181);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(182);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__25 || _la==T__26) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(183);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(7);
						((ExprContext)_localctx).ast =  new ExprAritmetica(((ExprContext)_localctx).left.ast, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.ast);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(186);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(187);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__27) | (1L << T__28))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(188);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(6);
						((ExprContext)_localctx).ast =  new ExprLogica(((ExprContext)_localctx).left.ast, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.ast);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(191);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(192);
						_la = _input.LA(1);
						if ( !(_la==T__29 || _la==T__30) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(193);
						((ExprContext)_localctx).expr = expr(5);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(194);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(195);
						match(T__31);
						setState(196);
						((ExprContext)_localctx).expr = expr(4);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(197);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(198);
						match(T__32);
						setState(199);
						((ExprContext)_localctx).expr = expr(3);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(200);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(201);
						match(T__18);
						setState(202);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(0);
						setState(203);
						match(T__19);
						((ExprContext)_localctx).ast =  new ArrayAcces(((ExprContext)_localctx).left.ast, ((ExprContext)_localctx).right.ast);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(206);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(207);
						((ExprContext)_localctx).op = match(T__20);
						setState(208);
						((ExprContext)_localctx).IDENT = match(IDENT);
						((ExprContext)_localctx).ast =  new Acces(((ExprContext)_localctx).left.ast, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).IDENT);
						}
						break;
					}
					} 
				}
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class FuncionContext extends ParserRuleContext {
		public Func ast;
		public Token IDENT;
		public ParametroContext p;
		public ParametroContext pa;
		public TipoContext tipo;
		public DefinicionContext definicion;
		public SentenciaContext sentencia;
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public List<DefinicionContext> definicion() {
			return getRuleContexts(DefinicionContext.class);
		}
		public DefinicionContext definicion(int i) {
			return getRuleContext(DefinicionContext.class,i);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_funcion);
		int _la;
		try {
			setState(333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				List<Parameter> para = new ArrayList<Parameter>();List<Sentence> sent = new ArrayList<Sentence>(); List<Def> def = new ArrayList<Def>();
				setState(216);
				((FuncionContext)_localctx).IDENT = match(IDENT);
				setState(217);
				match(T__12);
				setState(218);
				((FuncionContext)_localctx).p = parametro();
				para.add(((FuncionContext)_localctx).p.ast);
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(220);
					match(T__17);
					setState(221);
					((FuncionContext)_localctx).pa = parametro();
					para.add(((FuncionContext)_localctx).pa.ast);
					}
					}
					setState(228);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(229);
				match(T__13);
				setState(230);
				match(T__5);
				setState(231);
				((FuncionContext)_localctx).tipo = tipo();
				setState(232);
				match(T__1);
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(233);
					((FuncionContext)_localctx).definicion = definicion();
					def.add(((FuncionContext)_localctx).definicion.ast);
					}
					}
					setState(240);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(244); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(241);
					((FuncionContext)_localctx).sentencia = sentencia();
					sent.add(((FuncionContext)_localctx).sentencia.ast);
					}
					}
					setState(246); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__21) | (1L << T__33) | (1L << LITENT) | (1L << LITREAL) | (1L << LITCHAR) | (1L << IDENT))) != 0) );
				setState(248);
				match(T__3);
				((FuncionContext)_localctx).ast =  new Func(((FuncionContext)_localctx).IDENT,para,((FuncionContext)_localctx).tipo.ast,def,sent);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				List<Parameter> para = new ArrayList<Parameter>();List<Sentence> sent = new ArrayList<Sentence>(); List<Def> def = new ArrayList<Def>();
				setState(252);
				((FuncionContext)_localctx).IDENT = match(IDENT);
				setState(253);
				match(T__12);
				setState(254);
				((FuncionContext)_localctx).p = parametro();
				para.add(((FuncionContext)_localctx).p.ast);
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(256);
					match(T__17);
					setState(257);
					((FuncionContext)_localctx).pa = parametro();
					para.add(((FuncionContext)_localctx).pa.ast);
					}
					}
					setState(264);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(265);
				match(T__13);
				setState(266);
				match(T__1);
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(267);
					((FuncionContext)_localctx).definicion = definicion();
					def.add(((FuncionContext)_localctx).definicion.ast);
					}
					}
					setState(274);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(278); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(275);
					((FuncionContext)_localctx).sentencia = sentencia();
					sent.add(((FuncionContext)_localctx).sentencia.ast);
					}
					}
					setState(280); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__21) | (1L << T__33) | (1L << LITENT) | (1L << LITREAL) | (1L << LITCHAR) | (1L << IDENT))) != 0) );
				setState(282);
				match(T__3);
				((FuncionContext)_localctx).ast =  new Func(((FuncionContext)_localctx).IDENT,para,null,def,sent);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				List<Sentence> sent = new ArrayList<Sentence>(); List<Def> def = new ArrayList<Def>();
				setState(286);
				((FuncionContext)_localctx).IDENT = match(IDENT);
				setState(287);
				match(T__12);
				setState(288);
				match(T__13);
				setState(289);
				match(T__5);
				setState(290);
				((FuncionContext)_localctx).tipo = tipo();
				setState(291);
				match(T__1);
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(292);
					((FuncionContext)_localctx).definicion = definicion();
					def.add(((FuncionContext)_localctx).definicion.ast);
					}
					}
					setState(299);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(303); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(300);
					((FuncionContext)_localctx).sentencia = sentencia();
					sent.add(((FuncionContext)_localctx).sentencia.ast);
					}
					}
					setState(305); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__21) | (1L << T__33) | (1L << LITENT) | (1L << LITREAL) | (1L << LITCHAR) | (1L << IDENT))) != 0) );
				setState(307);
				match(T__3);
				((FuncionContext)_localctx).ast =  new Func(((FuncionContext)_localctx).IDENT,null,((FuncionContext)_localctx).tipo.ast,def,sent);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				List<Sentence> sent = new ArrayList<Sentence>(); List<Def> def = new ArrayList<Def>();
				setState(311);
				((FuncionContext)_localctx).IDENT = match(IDENT);
				setState(312);
				match(T__12);
				setState(313);
				match(T__13);
				setState(314);
				match(T__1);
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(315);
					((FuncionContext)_localctx).definicion = definicion();
					def.add(((FuncionContext)_localctx).definicion.ast);
					}
					}
					setState(322);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(326); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(323);
					((FuncionContext)_localctx).sentencia = sentencia();
					sent.add(((FuncionContext)_localctx).sentencia.ast);
					}
					}
					setState(328); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__21) | (1L << T__33) | (1L << LITENT) | (1L << LITREAL) | (1L << LITCHAR) | (1L << IDENT))) != 0) );
				setState(330);
				match(T__3);
				((FuncionContext)_localctx).ast =  new Func(((FuncionContext)_localctx).IDENT,null,null,def,sent);
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

	public static class ParametroContext extends ParserRuleContext {
		public Parameter ast;
		public Token IDENT;
		public TipoContext tipo;
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			((ParametroContext)_localctx).IDENT = match(IDENT);
			setState(336);
			match(T__5);
			setState(337);
			((ParametroContext)_localctx).tipo = tipo();
			((ParametroContext)_localctx).ast =  new Parameter(((ParametroContext)_localctx).IDENT,((ParametroContext)_localctx).tipo.ast);
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

	public static class TipoContext extends ParserRuleContext {
		public Type ast;
		public Token LITENT;
		public TipoContext tipo;
		public Token IDENT;
		public TerminalNode LITENT() { return getToken(GrammarParser.LITENT, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tipo);
		try {
			setState(354);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(340);
				match(T__34);
				((TipoContext)_localctx).ast =  new IntType();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
				setState(342);
				match(T__35);
				((TipoContext)_localctx).ast =  new RealType();
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 3);
				{
				setState(344);
				match(T__36);
				((TipoContext)_localctx).ast =  new CharType();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 4);
				{
				setState(346);
				match(T__18);
				setState(347);
				((TipoContext)_localctx).LITENT = match(LITENT);
				setState(348);
				match(T__19);
				setState(349);
				((TipoContext)_localctx).tipo = tipo();
				((TipoContext)_localctx).ast =  new ArrayType(((TipoContext)_localctx).LITENT, ((TipoContext)_localctx).tipo.ast);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(352);
				((TipoContext)_localctx).IDENT = match(IDENT);
				((TipoContext)_localctx).ast =  new StructType((((TipoContext)_localctx).IDENT!=null?((TipoContext)_localctx).IDENT.getText():null));
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 11);
		case 7:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u0167\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\7\2\33\n\2\f\2\16\2\36\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\7\3)\n\3\f\3\16\3,\13\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5O\n\5\f\5\16\5R\13\5\3\5\3\5\3\5\3\5\7\5"+
		"X\n\5\f\5\16\5[\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5f\n\5\f\5"+
		"\16\5i\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5t\n\5\f\5\16\5w\13"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5\u008b\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\7\6\u009b\n\6\f\6\16\6\u009e\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00b1\n\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00d5\n\6\f\6\16\6"+
		"\u00d8\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00e3\n\7\f\7\16\7"+
		"\u00e6\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00ef\n\7\f\7\16\7\u00f2\13"+
		"\7\3\7\3\7\3\7\6\7\u00f7\n\7\r\7\16\7\u00f8\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\7\7\u0107\n\7\f\7\16\7\u010a\13\7\3\7\3\7\3\7\3"+
		"\7\3\7\7\7\u0111\n\7\f\7\16\7\u0114\13\7\3\7\3\7\3\7\6\7\u0119\n\7\r\7"+
		"\16\7\u011a\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u012a"+
		"\n\7\f\7\16\7\u012d\13\7\3\7\3\7\3\7\6\7\u0132\n\7\r\7\16\7\u0133\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0141\n\7\f\7\16\7\u0144"+
		"\13\7\3\7\3\7\3\7\6\7\u0149\n\7\r\7\16\7\u014a\3\7\3\7\3\7\5\7\u0150\n"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\5\t\u0165\n\t\3\t\2\3\n\n\2\4\6\b\n\f\16\20\2\7\3\2\t\13\3\2"+
		"\32\33\3\2\34\35\4\2\30\31\36\37\3\2 !\2\u018f\2\22\3\2\2\2\4\"\3\2\2"+
		"\2\6\61\3\2\2\2\b\u008a\3\2\2\2\n\u00b0\3\2\2\2\f\u014f\3\2\2\2\16\u0151"+
		"\3\2\2\2\20\u0164\3\2\2\2\22\34\b\2\1\2\23\24\5\6\4\2\24\25\b\2\1\2\25"+
		"\33\3\2\2\2\26\27\5\f\7\2\27\30\b\2\1\2\30\33\3\2\2\2\31\33\5\4\3\2\32"+
		"\23\3\2\2\2\32\26\3\2\2\2\32\31\3\2\2\2\33\36\3\2\2\2\34\32\3\2\2\2\34"+
		"\35\3\2\2\2\35\37\3\2\2\2\36\34\3\2\2\2\37 \7\2\2\3 !\b\2\1\2!\3\3\2\2"+
		"\2\"#\7\3\2\2#$\7+\2\2$*\7\4\2\2%&\5\16\b\2&\'\7\5\2\2\')\3\2\2\2(%\3"+
		"\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+-\3\2\2\2,*\3\2\2\2-.\7\6\2\2./\7"+
		"\5\2\2/\60\b\3\1\2\60\5\3\2\2\2\61\62\7\7\2\2\62\63\7+\2\2\63\64\7\b\2"+
		"\2\64\65\5\20\t\2\65\66\7\5\2\2\66\67\b\4\1\2\67\7\3\2\2\289\t\2\2\29"+
		":\5\n\6\2:;\7\5\2\2;<\b\5\1\2<\u008b\3\2\2\2=>\7\f\2\2>?\5\n\6\2?@\7\5"+
		"\2\2@A\b\5\1\2A\u008b\3\2\2\2BC\5\n\6\2CD\7\r\2\2DE\5\n\6\2EF\7\5\2\2"+
		"FG\b\5\1\2G\u008b\3\2\2\2HI\7\16\2\2IJ\7\17\2\2JK\5\n\6\2KL\7\20\2\2L"+
		"P\7\4\2\2MO\5\b\5\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QS\3\2\2\2"+
		"RP\3\2\2\2ST\7\6\2\2TU\7\21\2\2UY\7\4\2\2VX\5\b\5\2WV\3\2\2\2X[\3\2\2"+
		"\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\]\7\6\2\2]^\b\5\1\2^\u008b"+
		"\3\2\2\2_`\7\16\2\2`a\7\17\2\2ab\5\n\6\2bc\7\20\2\2cg\7\4\2\2df\5\b\5"+
		"\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\7\6\2"+
		"\2kl\b\5\1\2l\u008b\3\2\2\2mn\7\22\2\2no\7\17\2\2op\5\n\6\2pq\7\20\2\2"+
		"qu\7\4\2\2rt\5\b\5\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vx\3\2\2\2"+
		"wu\3\2\2\2xy\7\6\2\2yz\b\5\1\2z\u008b\3\2\2\2{|\7\23\2\2|}\5\n\6\2}~\7"+
		"\5\2\2~\177\b\5\1\2\177\u008b\3\2\2\2\u0080\u0081\7\23\2\2\u0081\u0082"+
		"\7\5\2\2\u0082\u008b\b\5\1\2\u0083\u0084\7+\2\2\u0084\u0085\7\17\2\2\u0085"+
		"\u0086\5\n\6\2\u0086\u0087\7\20\2\2\u0087\u0088\7\5\2\2\u0088\u0089\b"+
		"\5\1\2\u0089\u008b\3\2\2\2\u008a8\3\2\2\2\u008a=\3\2\2\2\u008aB\3\2\2"+
		"\2\u008aH\3\2\2\2\u008a_\3\2\2\2\u008am\3\2\2\2\u008a{\3\2\2\2\u008a\u0080"+
		"\3\2\2\2\u008a\u0083\3\2\2\2\u008b\t\3\2\2\2\u008c\u008d\b\6\1\2\u008d"+
		"\u008e\7(\2\2\u008e\u00b1\b\6\1\2\u008f\u0090\7)\2\2\u0090\u00b1\b\6\1"+
		"\2\u0091\u0092\7*\2\2\u0092\u00b1\b\6\1\2\u0093\u0094\7+\2\2\u0094\u00b1"+
		"\b\6\1\2\u0095\u0096\7+\2\2\u0096\u0097\7\17\2\2\u0097\u009c\5\n\6\2\u0098"+
		"\u0099\7\24\2\2\u0099\u009b\5\n\6\2\u009a\u0098\3\2\2\2\u009b\u009e\3"+
		"\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009f\u00a0\7\20\2\2\u00a0\u00b1\3\2\2\2\u00a1\u00a2\7"+
		"\17\2\2\u00a2\u00a3\5\n\6\2\u00a3\u00a4\7\20\2\2\u00a4\u00a5\b\6\1\2\u00a5"+
		"\u00b1\3\2\2\2\u00a6\u00a7\7\30\2\2\u00a7\u00a8\5\20\t\2\u00a8\u00a9\7"+
		"\31\2\2\u00a9\u00aa\7\17\2\2\u00aa\u00ab\5\n\6\2\u00ab\u00ac\7\20\2\2"+
		"\u00ac\u00ad\b\6\1\2\u00ad\u00b1\3\2\2\2\u00ae\u00af\7$\2\2\u00af\u00b1"+
		"\5\n\6\3\u00b0\u008c\3\2\2\2\u00b0\u008f\3\2\2\2\u00b0\u0091\3\2\2\2\u00b0"+
		"\u0093\3\2\2\2\u00b0\u0095\3\2\2\2\u00b0\u00a1\3\2\2\2\u00b0\u00a6\3\2"+
		"\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00d6\3\2\2\2\u00b2\u00b3\f\t\2\2\u00b3"+
		"\u00b4\t\3\2\2\u00b4\u00b5\5\n\6\n\u00b5\u00b6\b\6\1\2\u00b6\u00d5\3\2"+
		"\2\2\u00b7\u00b8\f\b\2\2\u00b8\u00b9\t\4\2\2\u00b9\u00ba\5\n\6\t\u00ba"+
		"\u00bb\b\6\1\2\u00bb\u00d5\3\2\2\2\u00bc\u00bd\f\7\2\2\u00bd\u00be\t\5"+
		"\2\2\u00be\u00bf\5\n\6\b\u00bf\u00c0\b\6\1\2\u00c0\u00d5\3\2\2\2\u00c1"+
		"\u00c2\f\6\2\2\u00c2\u00c3\t\6\2\2\u00c3\u00d5\5\n\6\7\u00c4\u00c5\f\5"+
		"\2\2\u00c5\u00c6\7\"\2\2\u00c6\u00d5\5\n\6\6\u00c7\u00c8\f\4\2\2\u00c8"+
		"\u00c9\7#\2\2\u00c9\u00d5\5\n\6\5\u00ca\u00cb\f\r\2\2\u00cb\u00cc\7\25"+
		"\2\2\u00cc\u00cd\5\n\6\2\u00cd\u00ce\7\26\2\2\u00ce\u00cf\b\6\1\2\u00cf"+
		"\u00d5\3\2\2\2\u00d0\u00d1\f\f\2\2\u00d1\u00d2\7\27\2\2\u00d2\u00d3\7"+
		"+\2\2\u00d3\u00d5\b\6\1\2\u00d4\u00b2\3\2\2\2\u00d4\u00b7\3\2\2\2\u00d4"+
		"\u00bc\3\2\2\2\u00d4\u00c1\3\2\2\2\u00d4\u00c4\3\2\2\2\u00d4\u00c7\3\2"+
		"\2\2\u00d4\u00ca\3\2\2\2\u00d4\u00d0\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\13\3\2\2\2\u00d8\u00d6\3\2\2"+
		"\2\u00d9\u00da\b\7\1\2\u00da\u00db\7+\2\2\u00db\u00dc\7\17\2\2\u00dc\u00dd"+
		"\5\16\b\2\u00dd\u00e4\b\7\1\2\u00de\u00df\7\24\2\2\u00df\u00e0\5\16\b"+
		"\2\u00e0\u00e1\b\7\1\2\u00e1\u00e3\3\2\2\2\u00e2\u00de\3\2\2\2\u00e3\u00e6"+
		"\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e7\u00e8\7\20\2\2\u00e8\u00e9\7\b\2\2\u00e9\u00ea\5"+
		"\20\t\2\u00ea\u00f0\7\4\2\2\u00eb\u00ec\5\6\4\2\u00ec\u00ed\b\7\1\2\u00ed"+
		"\u00ef\3\2\2\2\u00ee\u00eb\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2"+
		"\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f6\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3"+
		"\u00f4\5\b\5\2\u00f4\u00f5\b\7\1\2\u00f5\u00f7\3\2\2\2\u00f6\u00f3\3\2"+
		"\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00fa\3\2\2\2\u00fa\u00fb\7\6\2\2\u00fb\u00fc\b\7\1\2\u00fc\u0150\3\2"+
		"\2\2\u00fd\u00fe\b\7\1\2\u00fe\u00ff\7+\2\2\u00ff\u0100\7\17\2\2\u0100"+
		"\u0101\5\16\b\2\u0101\u0108\b\7\1\2\u0102\u0103\7\24\2\2\u0103\u0104\5"+
		"\16\b\2\u0104\u0105\b\7\1\2\u0105\u0107\3\2\2\2\u0106\u0102\3\2\2\2\u0107"+
		"\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010b\3\2"+
		"\2\2\u010a\u0108\3\2\2\2\u010b\u010c\7\20\2\2\u010c\u0112\7\4\2\2\u010d"+
		"\u010e\5\6\4\2\u010e\u010f\b\7\1\2\u010f\u0111\3\2\2\2\u0110\u010d\3\2"+
		"\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113"+
		"\u0118\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0116\5\b\5\2\u0116\u0117\b\7"+
		"\1\2\u0117\u0119\3\2\2\2\u0118\u0115\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\7\6"+
		"\2\2\u011d\u011e\b\7\1\2\u011e\u0150\3\2\2\2\u011f\u0120\b\7\1\2\u0120"+
		"\u0121\7+\2\2\u0121\u0122\7\17\2\2\u0122\u0123\7\20\2\2\u0123\u0124\7"+
		"\b\2\2\u0124\u0125\5\20\t\2\u0125\u012b\7\4\2\2\u0126\u0127\5\6\4\2\u0127"+
		"\u0128\b\7\1\2\u0128\u012a\3\2\2\2\u0129\u0126\3\2\2\2\u012a\u012d\3\2"+
		"\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u0131\3\2\2\2\u012d"+
		"\u012b\3\2\2\2\u012e\u012f\5\b\5\2\u012f\u0130\b\7\1\2\u0130\u0132\3\2"+
		"\2\2\u0131\u012e\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0131\3\2\2\2\u0133"+
		"\u0134\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\7\6\2\2\u0136\u0137\b\7"+
		"\1\2\u0137\u0150\3\2\2\2\u0138\u0139\b\7\1\2\u0139\u013a\7+\2\2\u013a"+
		"\u013b\7\17\2\2\u013b\u013c\7\20\2\2\u013c\u0142\7\4\2\2\u013d\u013e\5"+
		"\6\4\2\u013e\u013f\b\7\1\2\u013f\u0141\3\2\2\2\u0140\u013d\3\2\2\2\u0141"+
		"\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0148\3\2"+
		"\2\2\u0144\u0142\3\2\2\2\u0145\u0146\5\b\5\2\u0146\u0147\b\7\1\2\u0147"+
		"\u0149\3\2\2\2\u0148\u0145\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u0148\3\2"+
		"\2\2\u014a\u014b\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d\7\6\2\2\u014d"+
		"\u014e\b\7\1\2\u014e\u0150\3\2\2\2\u014f\u00d9\3\2\2\2\u014f\u00fd\3\2"+
		"\2\2\u014f\u011f\3\2\2\2\u014f\u0138\3\2\2\2\u0150\r\3\2\2\2\u0151\u0152"+
		"\7+\2\2\u0152\u0153\7\b\2\2\u0153\u0154\5\20\t\2\u0154\u0155\b\b\1\2\u0155"+
		"\17\3\2\2\2\u0156\u0157\7%\2\2\u0157\u0165\b\t\1\2\u0158\u0159\7&\2\2"+
		"\u0159\u0165\b\t\1\2\u015a\u015b\7\'\2\2\u015b\u0165\b\t\1\2\u015c\u015d"+
		"\7\25\2\2\u015d\u015e\7(\2\2\u015e\u015f\7\26\2\2\u015f\u0160\5\20\t\2"+
		"\u0160\u0161\b\t\1\2\u0161\u0165\3\2\2\2\u0162\u0163\7+\2\2\u0163\u0165"+
		"\b\t\1\2\u0164\u0156\3\2\2\2\u0164\u0158\3\2\2\2\u0164\u015a\3\2\2\2\u0164"+
		"\u015c\3\2\2\2\u0164\u0162\3\2\2\2\u0165\21\3\2\2\2\32\32\34*PYgu\u008a"+
		"\u009c\u00b0\u00d4\u00d6\u00e4\u00f0\u00f8\u0108\u0112\u011a\u012b\u0133"+
		"\u0142\u014a\u014f\u0164";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}