// Generated from src\parser\Grammar.g4 by ANTLR 4.7.2
package parser;
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
		T__31=32, T__32=33, T__33=34, T__34=35, LITENT=36, LITREAL=37, LITCHAR=38, 
		IDENT=39, LINE_COMMENT=40, MULTILINE_COMMENT=41, WHITESPACE=42;
	public static final int
		RULE_start = 0, RULE_definicion = 1, RULE_funcion = 2, RULE_parametro = 3, 
		RULE_tipo = 4, RULE_sentencia = 5, RULE_expr = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "definicion", "funcion", "parametro", "tipo", "sentencia", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'var '", "':'", "';'", "'['", "']'", "'('", "','", "')'", "'{'", 
			"'}'", "'()'", "'int'", "'float'", "'char'", "'print'", "'read'", "'='", 
			"'if'", "'else'", "'while'", "'return'", "'.'", "'to'", "'<'", "'>'", 
			"'*'", "'/'", "'+'", "'-'", "'>='", "'<='", "'!='", "'&&'", "'||'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"LITENT", "LITREAL", "LITCHAR", "IDENT", "LINE_COMMENT", "MULTILINE_COMMENT", 
			"WHITESPACE"
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
			setState(18);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==IDENT) {
				{
				setState(16);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(14);
					definicion();
					}
					break;
				case IDENT:
					{
					setState(15);
					funcion();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(20);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(21);
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

	public static class DefinicionContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<TerminalNode> LITENT() { return getTokens(GrammarParser.LITENT); }
		public TerminalNode LITENT(int i) {
			return getToken(GrammarParser.LITENT, i);
		}
		public DefinicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicion; }
	}

	public final DefinicionContext definicion() throws RecognitionException {
		DefinicionContext _localctx = new DefinicionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definicion);
		int _la;
		try {
			setState(42);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(23);
				match(T__0);
				setState(24);
				match(IDENT);
				setState(25);
				match(T__1);
				setState(26);
				tipo();
				setState(27);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				match(T__0);
				setState(30);
				match(IDENT);
				setState(31);
				match(T__1);
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(32);
					match(T__3);
					setState(33);
					match(LITENT);
					setState(34);
					match(T__4);
					}
					}
					setState(37); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
				setState(39);
				tipo();
				setState(40);
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

	public static class FuncionContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
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
		enterRule(_localctx, 4, RULE_funcion);
		int _la;
		try {
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				match(IDENT);
				setState(45);
				match(T__5);
				setState(46);
				parametro();
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(47);
					match(T__6);
					setState(48);
					parametro();
					}
					}
					setState(53);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(54);
				match(T__7);
				setState(55);
				match(T__1);
				setState(56);
				tipo();
				setState(57);
				match(T__8);
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(58);
					definicion();
					}
					}
					setState(63);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(65); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(64);
					sentencia();
					}
					}
					setState(67); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << IDENT))) != 0) );
				setState(69);
				match(T__9);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				match(IDENT);
				setState(72);
				match(T__5);
				setState(73);
				parametro();
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(74);
					match(T__6);
					setState(75);
					parametro();
					}
					}
					setState(80);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(81);
				match(T__7);
				setState(82);
				match(T__8);
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(83);
					definicion();
					}
					}
					setState(88);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(90); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(89);
					sentencia();
					}
					}
					setState(92); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << IDENT))) != 0) );
				setState(94);
				match(T__9);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				match(IDENT);
				setState(97);
				match(T__10);
				setState(98);
				match(T__1);
				setState(99);
				tipo();
				setState(100);
				match(T__8);
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(101);
					definicion();
					}
					}
					setState(106);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(108); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(107);
					sentencia();
					}
					}
					setState(110); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << IDENT))) != 0) );
				setState(112);
				match(T__9);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(114);
				match(IDENT);
				setState(115);
				match(T__10);
				setState(116);
				match(T__8);
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(117);
					definicion();
					}
					}
					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(124); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(123);
					sentencia();
					}
					}
					setState(126); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << IDENT))) != 0) );
				setState(128);
				match(T__9);
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
		enterRule(_localctx, 6, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(IDENT);
			setState(133);
			match(T__1);
			setState(134);
			tipo();
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
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class SentenciaContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sentencia);
		int _la;
		try {
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(T__14);
				setState(139);
				expr(0);
				setState(140);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				match(T__15);
				setState(143);
				match(IDENT);
				setState(144);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				match(IDENT);
				setState(146);
				match(T__16);
				setState(147);
				expr(0);
				setState(148);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(150);
				match(T__17);
				setState(151);
				match(T__5);
				setState(152);
				expr(0);
				setState(153);
				match(T__7);
				setState(154);
				match(T__8);
				setState(156); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(155);
					sentencia();
					}
					}
					setState(158); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << IDENT))) != 0) );
				setState(160);
				match(T__9);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(162);
				match(T__17);
				setState(163);
				match(T__5);
				setState(164);
				expr(0);
				setState(165);
				match(T__7);
				setState(166);
				match(T__8);
				setState(168); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(167);
					sentencia();
					}
					}
					setState(170); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << IDENT))) != 0) );
				setState(172);
				match(T__9);
				setState(173);
				match(T__18);
				setState(174);
				match(T__8);
				setState(176); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(175);
					sentencia();
					}
					}
					setState(178); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << IDENT))) != 0) );
				setState(180);
				match(T__9);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(182);
				match(T__19);
				setState(183);
				match(T__5);
				setState(184);
				expr(0);
				setState(185);
				match(T__7);
				setState(186);
				match(T__8);
				setState(188); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(187);
					sentencia();
					}
					}
					setState(190); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << IDENT))) != 0) );
				setState(192);
				match(T__9);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(194);
				match(T__20);
				setState(195);
				expr(0);
				setState(196);
				match(T__2);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(198);
				match(T__20);
				setState(199);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext left;
		public ExprContext right;
		public TerminalNode LITENT() { return getToken(GrammarParser.LITENT, 0); }
		public TerminalNode LITREAL() { return getToken(GrammarParser.LITREAL, 0); }
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITENT:
				{
				setState(203);
				match(LITENT);
				}
				break;
			case LITREAL:
				{
				setState(204);
				match(LITREAL);
				}
				break;
			case IDENT:
				{
				setState(205);
				match(IDENT);
				}
				break;
			case T__5:
				{
				setState(206);
				match(T__5);
				setState(207);
				expr(0);
				setState(208);
				match(T__7);
				}
				break;
			case T__22:
				{
				setState(210);
				match(T__22);
				setState(211);
				match(T__23);
				setState(212);
				tipo();
				setState(213);
				match(T__24);
				setState(214);
				match(T__5);
				setState(215);
				expr(0);
				setState(216);
				match(T__7);
				}
				break;
			case T__34:
				{
				setState(218);
				match(T__34);
				setState(219);
				expr(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(250);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(248);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(222);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(223);
						_la = _input.LA(1);
						if ( !(_la==T__25 || _la==T__26) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(224);
						((ExprContext)_localctx).right = expr(8);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(225);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(226);
						_la = _input.LA(1);
						if ( !(_la==T__27 || _la==T__28) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(227);
						((ExprContext)_localctx).right = expr(7);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(228);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(229);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__29) | (1L << T__30))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(230);
						((ExprContext)_localctx).right = expr(6);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(231);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(232);
						_la = _input.LA(1);
						if ( !(_la==T__16 || _la==T__31) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(233);
						((ExprContext)_localctx).right = expr(5);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(234);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(235);
						match(T__32);
						setState(236);
						((ExprContext)_localctx).right = expr(4);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(237);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(238);
						match(T__33);
						setState(239);
						((ExprContext)_localctx).right = expr(3);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(240);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(241);
						match(T__3);
						setState(242);
						((ExprContext)_localctx).right = expr(0);
						setState(243);
						match(T__4);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(245);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(246);
						match(T__21);
						setState(247);
						match(IDENT);
						}
						break;
					}
					} 
				}
				setState(252);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		case 6:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u0100\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\7\2\23\n\2\f\2"+
		"\16\2\26\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\6\3&\n\3\r\3\16\3\'\3\3\3\3\3\3\5\3-\n\3\3\4\3\4\3\4\3\4\3\4\7\4\64\n"+
		"\4\f\4\16\4\67\13\4\3\4\3\4\3\4\3\4\3\4\7\4>\n\4\f\4\16\4A\13\4\3\4\6"+
		"\4D\n\4\r\4\16\4E\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4O\n\4\f\4\16\4R\13\4"+
		"\3\4\3\4\3\4\7\4W\n\4\f\4\16\4Z\13\4\3\4\6\4]\n\4\r\4\16\4^\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\7\4i\n\4\f\4\16\4l\13\4\3\4\6\4o\n\4\r\4\16\4p"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\7\4y\n\4\f\4\16\4|\13\4\3\4\6\4\177\n\4\r\4\16"+
		"\4\u0080\3\4\3\4\5\4\u0085\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\6\7\u009f\n\7"+
		"\r\7\16\7\u00a0\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\6\7\u00ab\n\7\r\7\16\7"+
		"\u00ac\3\7\3\7\3\7\3\7\6\7\u00b3\n\7\r\7\16\7\u00b4\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\6\7\u00bf\n\7\r\7\16\7\u00c0\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\5\7\u00cb\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\5\b\u00df\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\7\b\u00fb\n\b\f\b\16\b\u00fe\13\b\3\b\2\3\16\t\2\4\6\b\n\f\16\2\7\3\2"+
		"\16\20\3\2\34\35\3\2\36\37\4\2\32\33 !\4\2\23\23\"\"\2\u0121\2\24\3\2"+
		"\2\2\4,\3\2\2\2\6\u0084\3\2\2\2\b\u0086\3\2\2\2\n\u008a\3\2\2\2\f\u00ca"+
		"\3\2\2\2\16\u00de\3\2\2\2\20\23\5\4\3\2\21\23\5\6\4\2\22\20\3\2\2\2\22"+
		"\21\3\2\2\2\23\26\3\2\2\2\24\22\3\2\2\2\24\25\3\2\2\2\25\27\3\2\2\2\26"+
		"\24\3\2\2\2\27\30\7\2\2\3\30\3\3\2\2\2\31\32\7\3\2\2\32\33\7)\2\2\33\34"+
		"\7\4\2\2\34\35\5\n\6\2\35\36\7\5\2\2\36-\3\2\2\2\37 \7\3\2\2 !\7)\2\2"+
		"!%\7\4\2\2\"#\7\6\2\2#$\7&\2\2$&\7\7\2\2%\"\3\2\2\2&\'\3\2\2\2\'%\3\2"+
		"\2\2\'(\3\2\2\2()\3\2\2\2)*\5\n\6\2*+\7\5\2\2+-\3\2\2\2,\31\3\2\2\2,\37"+
		"\3\2\2\2-\5\3\2\2\2./\7)\2\2/\60\7\b\2\2\60\65\5\b\5\2\61\62\7\t\2\2\62"+
		"\64\5\b\5\2\63\61\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66"+
		"8\3\2\2\2\67\65\3\2\2\289\7\n\2\29:\7\4\2\2:;\5\n\6\2;?\7\13\2\2<>\5\4"+
		"\3\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@C\3\2\2\2A?\3\2\2\2BD\5\f"+
		"\7\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2FG\3\2\2\2GH\7\f\2\2H\u0085"+
		"\3\2\2\2IJ\7)\2\2JK\7\b\2\2KP\5\b\5\2LM\7\t\2\2MO\5\b\5\2NL\3\2\2\2OR"+
		"\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QS\3\2\2\2RP\3\2\2\2ST\7\n\2\2TX\7\13\2\2"+
		"UW\5\4\3\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\\\3\2\2\2ZX\3\2\2"+
		"\2[]\5\f\7\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_`\3\2\2\2`a\7\f"+
		"\2\2a\u0085\3\2\2\2bc\7)\2\2cd\7\r\2\2de\7\4\2\2ef\5\n\6\2fj\7\13\2\2"+
		"gi\5\4\3\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2kn\3\2\2\2lj\3\2\2\2"+
		"mo\5\f\7\2nm\3\2\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2qr\3\2\2\2rs\7\f\2\2"+
		"s\u0085\3\2\2\2tu\7)\2\2uv\7\r\2\2vz\7\13\2\2wy\5\4\3\2xw\3\2\2\2y|\3"+
		"\2\2\2zx\3\2\2\2z{\3\2\2\2{~\3\2\2\2|z\3\2\2\2}\177\5\f\7\2~}\3\2\2\2"+
		"\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\3\2"+
		"\2\2\u0082\u0083\7\f\2\2\u0083\u0085\3\2\2\2\u0084.\3\2\2\2\u0084I\3\2"+
		"\2\2\u0084b\3\2\2\2\u0084t\3\2\2\2\u0085\7\3\2\2\2\u0086\u0087\7)\2\2"+
		"\u0087\u0088\7\4\2\2\u0088\u0089\5\n\6\2\u0089\t\3\2\2\2\u008a\u008b\t"+
		"\2\2\2\u008b\13\3\2\2\2\u008c\u008d\7\21\2\2\u008d\u008e\5\16\b\2\u008e"+
		"\u008f\7\5\2\2\u008f\u00cb\3\2\2\2\u0090\u0091\7\22\2\2\u0091\u0092\7"+
		")\2\2\u0092\u00cb\7\5\2\2\u0093\u0094\7)\2\2\u0094\u0095\7\23\2\2\u0095"+
		"\u0096\5\16\b\2\u0096\u0097\7\5\2\2\u0097\u00cb\3\2\2\2\u0098\u0099\7"+
		"\24\2\2\u0099\u009a\7\b\2\2\u009a\u009b\5\16\b\2\u009b\u009c\7\n\2\2\u009c"+
		"\u009e\7\13\2\2\u009d\u009f\5\f\7\2\u009e\u009d\3\2\2\2\u009f\u00a0\3"+
		"\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a3\7\f\2\2\u00a3\u00cb\3\2\2\2\u00a4\u00a5\7\24\2\2\u00a5\u00a6\7"+
		"\b\2\2\u00a6\u00a7\5\16\b\2\u00a7\u00a8\7\n\2\2\u00a8\u00aa\7\13\2\2\u00a9"+
		"\u00ab\5\f\7\2\u00aa\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00aa\3\2"+
		"\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\7\f\2\2\u00af"+
		"\u00b0\7\25\2\2\u00b0\u00b2\7\13\2\2\u00b1\u00b3\5\f\7\2\u00b2\u00b1\3"+
		"\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\u00b7\7\f\2\2\u00b7\u00cb\3\2\2\2\u00b8\u00b9\7\26"+
		"\2\2\u00b9\u00ba\7\b\2\2\u00ba\u00bb\5\16\b\2\u00bb\u00bc\7\n\2\2\u00bc"+
		"\u00be\7\13\2\2\u00bd\u00bf\5\f\7\2\u00be\u00bd\3\2\2\2\u00bf\u00c0\3"+
		"\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00c3\7\f\2\2\u00c3\u00cb\3\2\2\2\u00c4\u00c5\7\27\2\2\u00c5\u00c6\5"+
		"\16\b\2\u00c6\u00c7\7\5\2\2\u00c7\u00cb\3\2\2\2\u00c8\u00c9\7\27\2\2\u00c9"+
		"\u00cb\7\5\2\2\u00ca\u008c\3\2\2\2\u00ca\u0090\3\2\2\2\u00ca\u0093\3\2"+
		"\2\2\u00ca\u0098\3\2\2\2\u00ca\u00a4\3\2\2\2\u00ca\u00b8\3\2\2\2\u00ca"+
		"\u00c4\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\r\3\2\2\2\u00cc\u00cd\b\b\1\2"+
		"\u00cd\u00df\7&\2\2\u00ce\u00df\7\'\2\2\u00cf\u00df\7)\2\2\u00d0\u00d1"+
		"\7\b\2\2\u00d1\u00d2\5\16\b\2\u00d2\u00d3\7\n\2\2\u00d3\u00df\3\2\2\2"+
		"\u00d4\u00d5\7\31\2\2\u00d5\u00d6\7\32\2\2\u00d6\u00d7\5\n\6\2\u00d7\u00d8"+
		"\7\33\2\2\u00d8\u00d9\7\b\2\2\u00d9\u00da\5\16\b\2\u00da\u00db\7\n\2\2"+
		"\u00db\u00df\3\2\2\2\u00dc\u00dd\7%\2\2\u00dd\u00df\5\16\b\3\u00de\u00cc"+
		"\3\2\2\2\u00de\u00ce\3\2\2\2\u00de\u00cf\3\2\2\2\u00de\u00d0\3\2\2\2\u00de"+
		"\u00d4\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00fc\3\2\2\2\u00e0\u00e1\f\t"+
		"\2\2\u00e1\u00e2\t\3\2\2\u00e2\u00fb\5\16\b\n\u00e3\u00e4\f\b\2\2\u00e4"+
		"\u00e5\t\4\2\2\u00e5\u00fb\5\16\b\t\u00e6\u00e7\f\7\2\2\u00e7\u00e8\t"+
		"\5\2\2\u00e8\u00fb\5\16\b\b\u00e9\u00ea\f\6\2\2\u00ea\u00eb\t\6\2\2\u00eb"+
		"\u00fb\5\16\b\7\u00ec\u00ed\f\5\2\2\u00ed\u00ee\7#\2\2\u00ee\u00fb\5\16"+
		"\b\6\u00ef\u00f0\f\4\2\2\u00f0\u00f1\7$\2\2\u00f1\u00fb\5\16\b\5\u00f2"+
		"\u00f3\f\r\2\2\u00f3\u00f4\7\6\2\2\u00f4\u00f5\5\16\b\2\u00f5\u00f6\7"+
		"\7\2\2\u00f6\u00fb\3\2\2\2\u00f7\u00f8\f\f\2\2\u00f8\u00f9\7\30\2\2\u00f9"+
		"\u00fb\7)\2\2\u00fa\u00e0\3\2\2\2\u00fa\u00e3\3\2\2\2\u00fa\u00e6\3\2"+
		"\2\2\u00fa\u00e9\3\2\2\2\u00fa\u00ec\3\2\2\2\u00fa\u00ef\3\2\2\2\u00fa"+
		"\u00f2\3\2\2\2\u00fa\u00f7\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2"+
		"\2\2\u00fc\u00fd\3\2\2\2\u00fd\17\3\2\2\2\u00fe\u00fc\3\2\2\2\31\22\24"+
		"\',\65?EPX^jpz\u0080\u0084\u00a0\u00ac\u00b4\u00c0\u00ca\u00de\u00fa\u00fc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}