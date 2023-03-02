// Generated from c:\Users\u005Cuo285267\Desktop\Traductor\DLP\src\parser\Grammar.g4 by ANTLR 4.9.2
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
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		LITENT=39, LITREAL=40, LITCHAR=41, IDENT=42, LINE_COMMENT=43, MULTILINE_COMMENT=44, 
		WHITESPACE=45;
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
			"'-'", "'>='", "'<='", "'=='", "'!='", "'&&'", "'||'", "'!'", "'()'", 
			"'int'", "'float'", "'char'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "LITENT", "LITREAL", "LITCHAR", "IDENT", "LINE_COMMENT", 
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
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << IDENT))) != 0)) {
				{
				setState(19);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__4:
					{
					setState(16);
					definicion();
					}
					break;
				case IDENT:
					{
					setState(17);
					funcion();
					}
					break;
				case T__0:
					{
					setState(18);
					estructura();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(24);
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

	public static class EstructuraContext extends ParserRuleContext {
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
			setState(26);
			match(T__0);
			setState(27);
			match(IDENT);
			setState(28);
			match(T__1);
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(29);
				parametro();
				setState(30);
				match(T__2);
				}
				}
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(37);
			match(T__3);
			setState(38);
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

	public static class DefinicionContext extends ParserRuleContext {
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
			setState(40);
			match(T__4);
			setState(41);
			match(IDENT);
			setState(42);
			match(T__5);
			setState(43);
			tipo();
			setState(44);
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

	public static class SentenciaContext extends ParserRuleContext {
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
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(47);
				expr(0);
				setState(48);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				match(T__9);
				setState(51);
				expr(0);
				setState(52);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				expr(0);
				setState(55);
				match(T__10);
				setState(56);
				expr(0);
				setState(57);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(59);
				match(T__11);
				setState(60);
				match(T__12);
				setState(61);
				expr(0);
				setState(62);
				match(T__13);
				setState(63);
				match(T__1);
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__21) | (1L << T__33) | (1L << LITENT) | (1L << LITREAL) | (1L << IDENT))) != 0)) {
					{
					{
					setState(64);
					sentencia();
					}
					}
					setState(69);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(70);
				match(T__3);
				setState(71);
				match(T__14);
				setState(72);
				match(T__1);
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__21) | (1L << T__33) | (1L << LITENT) | (1L << LITREAL) | (1L << IDENT))) != 0)) {
					{
					{
					setState(73);
					sentencia();
					}
					}
					setState(78);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(79);
				match(T__3);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(81);
				match(T__11);
				setState(82);
				match(T__12);
				setState(83);
				expr(0);
				setState(84);
				match(T__13);
				setState(85);
				match(T__1);
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__21) | (1L << T__33) | (1L << LITENT) | (1L << LITREAL) | (1L << IDENT))) != 0)) {
					{
					{
					setState(86);
					sentencia();
					}
					}
					setState(91);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(92);
				match(T__3);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(94);
				match(T__15);
				setState(95);
				match(T__12);
				setState(96);
				expr(0);
				setState(97);
				match(T__13);
				setState(98);
				match(T__1);
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__21) | (1L << T__33) | (1L << LITENT) | (1L << LITREAL) | (1L << IDENT))) != 0)) {
					{
					{
					setState(99);
					sentencia();
					}
					}
					setState(104);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(105);
				match(T__3);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(107);
				match(T__16);
				setState(108);
				expr(0);
				setState(109);
				match(T__2);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(111);
				match(T__16);
				setState(112);
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(116);
				match(LITENT);
				}
				break;
			case 2:
				{
				setState(117);
				match(LITREAL);
				}
				break;
			case 3:
				{
				setState(118);
				match(IDENT);
				}
				break;
			case 4:
				{
				setState(119);
				match(IDENT);
				setState(120);
				match(T__12);
				setState(121);
				expr(0);
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(122);
					match(T__17);
					setState(123);
					expr(0);
					}
					}
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(129);
				match(T__13);
				}
				break;
			case 5:
				{
				setState(131);
				match(T__12);
				setState(132);
				expr(0);
				setState(133);
				match(T__13);
				}
				break;
			case 6:
				{
				setState(135);
				match(T__21);
				setState(136);
				tipo();
				setState(137);
				match(T__22);
				setState(138);
				match(T__12);
				setState(139);
				expr(0);
				setState(140);
				match(T__13);
				}
				break;
			case 7:
				{
				setState(142);
				match(T__33);
				setState(143);
				expr(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(174);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(172);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(146);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(147);
						_la = _input.LA(1);
						if ( !(_la==T__23 || _la==T__24) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(148);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(149);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(150);
						_la = _input.LA(1);
						if ( !(_la==T__25 || _la==T__26) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(151);
						expr(7);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(152);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(153);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__27) | (1L << T__28))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(154);
						expr(6);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(155);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(156);
						_la = _input.LA(1);
						if ( !(_la==T__29 || _la==T__30) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(157);
						expr(5);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(158);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(159);
						match(T__31);
						setState(160);
						expr(4);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(161);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(162);
						match(T__32);
						setState(163);
						expr(3);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(164);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(165);
						match(T__18);
						setState(166);
						expr(0);
						setState(167);
						match(T__19);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(169);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(170);
						match(T__20);
						setState(171);
						match(IDENT);
						}
						break;
					}
					} 
				}
				setState(176);
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
		enterRule(_localctx, 10, RULE_funcion);
		int _la;
		try {
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				match(IDENT);
				setState(178);
				match(T__12);
				setState(179);
				parametro();
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(180);
					match(T__17);
					setState(181);
					parametro();
					}
					}
					setState(186);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(187);
				match(T__13);
				setState(188);
				match(T__5);
				setState(189);
				tipo();
				setState(190);
				match(T__1);
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(191);
					definicion();
					}
					}
					setState(196);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(198); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(197);
					sentencia();
					}
					}
					setState(200); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__21) | (1L << T__33) | (1L << LITENT) | (1L << LITREAL) | (1L << IDENT))) != 0) );
				setState(202);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				match(IDENT);
				setState(205);
				match(T__12);
				setState(206);
				parametro();
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(207);
					match(T__17);
					setState(208);
					parametro();
					}
					}
					setState(213);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(214);
				match(T__13);
				setState(215);
				match(T__1);
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(216);
					definicion();
					}
					}
					setState(221);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(223); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(222);
					sentencia();
					}
					}
					setState(225); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__21) | (1L << T__33) | (1L << LITENT) | (1L << LITREAL) | (1L << IDENT))) != 0) );
				setState(227);
				match(T__3);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(229);
				match(IDENT);
				setState(230);
				match(T__34);
				setState(231);
				match(T__5);
				setState(232);
				tipo();
				setState(233);
				match(T__1);
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(234);
					definicion();
					}
					}
					setState(239);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(241); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(240);
					sentencia();
					}
					}
					setState(243); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__21) | (1L << T__33) | (1L << LITENT) | (1L << LITREAL) | (1L << IDENT))) != 0) );
				setState(245);
				match(T__3);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(247);
				match(IDENT);
				setState(248);
				match(T__34);
				setState(249);
				match(T__1);
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(250);
					definicion();
					}
					}
					setState(255);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(257); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(256);
					sentencia();
					}
					}
					setState(259); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__21) | (1L << T__33) | (1L << LITENT) | (1L << LITREAL) | (1L << IDENT))) != 0) );
				setState(261);
				match(T__3);
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
		enterRule(_localctx, 12, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(IDENT);
			setState(266);
			match(T__5);
			setState(267);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
			setState(278);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				match(T__35);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				match(T__36);
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 3);
				{
				setState(271);
				match(T__37);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 4);
				{
				setState(272);
				match(T__18);
				setState(273);
				expr(0);
				setState(274);
				match(T__19);
				setState(275);
				tipo();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(277);
				match(IDENT);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u011b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\7\2"+
		"\26\n\2\f\2\16\2\31\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3#\n\3\f\3"+
		"\16\3&\13\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5D\n\5\f\5\16"+
		"\5G\13\5\3\5\3\5\3\5\3\5\7\5M\n\5\f\5\16\5P\13\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\7\5Z\n\5\f\5\16\5]\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5"+
		"g\n\5\f\5\16\5j\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5t\n\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\177\n\6\f\6\16\6\u0082\13\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0093\n\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00af\n\6\f\6\16\6\u00b2\13\6\3\7\3\7"+
		"\3\7\3\7\3\7\7\7\u00b9\n\7\f\7\16\7\u00bc\13\7\3\7\3\7\3\7\3\7\3\7\7\7"+
		"\u00c3\n\7\f\7\16\7\u00c6\13\7\3\7\6\7\u00c9\n\7\r\7\16\7\u00ca\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\7\7\u00d4\n\7\f\7\16\7\u00d7\13\7\3\7\3\7\3\7\7"+
		"\7\u00dc\n\7\f\7\16\7\u00df\13\7\3\7\6\7\u00e2\n\7\r\7\16\7\u00e3\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00ee\n\7\f\7\16\7\u00f1\13\7\3\7\6\7"+
		"\u00f4\n\7\r\7\16\7\u00f5\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00fe\n\7\f\7\16"+
		"\7\u0101\13\7\3\7\6\7\u0104\n\7\r\7\16\7\u0105\3\7\3\7\5\7\u010a\n\7\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0119\n\t\3\t\2"+
		"\3\n\n\2\4\6\b\n\f\16\20\2\7\3\2\t\13\3\2\32\33\3\2\34\35\4\2\30\31\36"+
		"\37\3\2 !\2\u0141\2\27\3\2\2\2\4\34\3\2\2\2\6*\3\2\2\2\bs\3\2\2\2\n\u0092"+
		"\3\2\2\2\f\u0109\3\2\2\2\16\u010b\3\2\2\2\20\u0118\3\2\2\2\22\26\5\6\4"+
		"\2\23\26\5\f\7\2\24\26\5\4\3\2\25\22\3\2\2\2\25\23\3\2\2\2\25\24\3\2\2"+
		"\2\26\31\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\32\3\2\2\2\31\27\3\2\2"+
		"\2\32\33\7\2\2\3\33\3\3\2\2\2\34\35\7\3\2\2\35\36\7,\2\2\36$\7\4\2\2\37"+
		" \5\16\b\2 !\7\5\2\2!#\3\2\2\2\"\37\3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2"+
		"\2\2%\'\3\2\2\2&$\3\2\2\2\'(\7\6\2\2()\7\5\2\2)\5\3\2\2\2*+\7\7\2\2+,"+
		"\7,\2\2,-\7\b\2\2-.\5\20\t\2./\7\5\2\2/\7\3\2\2\2\60\61\t\2\2\2\61\62"+
		"\5\n\6\2\62\63\7\5\2\2\63t\3\2\2\2\64\65\7\f\2\2\65\66\5\n\6\2\66\67\7"+
		"\5\2\2\67t\3\2\2\289\5\n\6\29:\7\r\2\2:;\5\n\6\2;<\7\5\2\2<t\3\2\2\2="+
		">\7\16\2\2>?\7\17\2\2?@\5\n\6\2@A\7\20\2\2AE\7\4\2\2BD\5\b\5\2CB\3\2\2"+
		"\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3\2\2\2HI\7\6\2\2IJ\7\21"+
		"\2\2JN\7\4\2\2KM\5\b\5\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2"+
		"\2\2PN\3\2\2\2QR\7\6\2\2Rt\3\2\2\2ST\7\16\2\2TU\7\17\2\2UV\5\n\6\2VW\7"+
		"\20\2\2W[\7\4\2\2XZ\5\b\5\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\"+
		"^\3\2\2\2][\3\2\2\2^_\7\6\2\2_t\3\2\2\2`a\7\22\2\2ab\7\17\2\2bc\5\n\6"+
		"\2cd\7\20\2\2dh\7\4\2\2eg\5\b\5\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2"+
		"\2\2ik\3\2\2\2jh\3\2\2\2kl\7\6\2\2lt\3\2\2\2mn\7\23\2\2no\5\n\6\2op\7"+
		"\5\2\2pt\3\2\2\2qr\7\23\2\2rt\7\5\2\2s\60\3\2\2\2s\64\3\2\2\2s8\3\2\2"+
		"\2s=\3\2\2\2sS\3\2\2\2s`\3\2\2\2sm\3\2\2\2sq\3\2\2\2t\t\3\2\2\2uv\b\6"+
		"\1\2v\u0093\7)\2\2w\u0093\7*\2\2x\u0093\7,\2\2yz\7,\2\2z{\7\17\2\2{\u0080"+
		"\5\n\6\2|}\7\24\2\2}\177\5\n\6\2~|\3\2\2\2\177\u0082\3\2\2\2\u0080~\3"+
		"\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083"+
		"\u0084\7\20\2\2\u0084\u0093\3\2\2\2\u0085\u0086\7\17\2\2\u0086\u0087\5"+
		"\n\6\2\u0087\u0088\7\20\2\2\u0088\u0093\3\2\2\2\u0089\u008a\7\30\2\2\u008a"+
		"\u008b\5\20\t\2\u008b\u008c\7\31\2\2\u008c\u008d\7\17\2\2\u008d\u008e"+
		"\5\n\6\2\u008e\u008f\7\20\2\2\u008f\u0093\3\2\2\2\u0090\u0091\7$\2\2\u0091"+
		"\u0093\5\n\6\3\u0092u\3\2\2\2\u0092w\3\2\2\2\u0092x\3\2\2\2\u0092y\3\2"+
		"\2\2\u0092\u0085\3\2\2\2\u0092\u0089\3\2\2\2\u0092\u0090\3\2\2\2\u0093"+
		"\u00b0\3\2\2\2\u0094\u0095\f\t\2\2\u0095\u0096\t\3\2\2\u0096\u00af\5\n"+
		"\6\n\u0097\u0098\f\b\2\2\u0098\u0099\t\4\2\2\u0099\u00af\5\n\6\t\u009a"+
		"\u009b\f\7\2\2\u009b\u009c\t\5\2\2\u009c\u00af\5\n\6\b\u009d\u009e\f\6"+
		"\2\2\u009e\u009f\t\6\2\2\u009f\u00af\5\n\6\7\u00a0\u00a1\f\5\2\2\u00a1"+
		"\u00a2\7\"\2\2\u00a2\u00af\5\n\6\6\u00a3\u00a4\f\4\2\2\u00a4\u00a5\7#"+
		"\2\2\u00a5\u00af\5\n\6\5\u00a6\u00a7\f\r\2\2\u00a7\u00a8\7\25\2\2\u00a8"+
		"\u00a9\5\n\6\2\u00a9\u00aa\7\26\2\2\u00aa\u00af\3\2\2\2\u00ab\u00ac\f"+
		"\f\2\2\u00ac\u00ad\7\27\2\2\u00ad\u00af\7,\2\2\u00ae\u0094\3\2\2\2\u00ae"+
		"\u0097\3\2\2\2\u00ae\u009a\3\2\2\2\u00ae\u009d\3\2\2\2\u00ae\u00a0\3\2"+
		"\2\2\u00ae\u00a3\3\2\2\2\u00ae\u00a6\3\2\2\2\u00ae\u00ab\3\2\2\2\u00af"+
		"\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\13\3\2\2"+
		"\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\7,\2\2\u00b4\u00b5\7\17\2\2\u00b5\u00ba"+
		"\5\16\b\2\u00b6\u00b7\7\24\2\2\u00b7\u00b9\5\16\b\2\u00b8\u00b6\3\2\2"+
		"\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd"+
		"\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00be\7\20\2\2\u00be\u00bf\7\b\2\2"+
		"\u00bf\u00c0\5\20\t\2\u00c0\u00c4\7\4\2\2\u00c1\u00c3\5\6\4\2\u00c2\u00c1"+
		"\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c9\5\b\5\2\u00c8\u00c7\3\2"+
		"\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00cd\7\6\2\2\u00cd\u010a\3\2\2\2\u00ce\u00cf\7,"+
		"\2\2\u00cf\u00d0\7\17\2\2\u00d0\u00d5\5\16\b\2\u00d1\u00d2\7\24\2\2\u00d2"+
		"\u00d4\5\16\b\2\u00d3\u00d1\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3"+
		"\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8"+
		"\u00d9\7\20\2\2\u00d9\u00dd\7\4\2\2\u00da\u00dc\5\6\4\2\u00db\u00da\3"+
		"\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e2\5\b\5\2\u00e1\u00e0\3\2"+
		"\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00e6\7\6\2\2\u00e6\u010a\3\2\2\2\u00e7\u00e8\7,"+
		"\2\2\u00e8\u00e9\7%\2\2\u00e9\u00ea\7\b\2\2\u00ea\u00eb\5\20\t\2\u00eb"+
		"\u00ef\7\4\2\2\u00ec\u00ee\5\6\4\2\u00ed\u00ec\3\2\2\2\u00ee\u00f1\3\2"+
		"\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1"+
		"\u00ef\3\2\2\2\u00f2\u00f4\5\b\5\2\u00f3\u00f2\3\2\2\2\u00f4\u00f5\3\2"+
		"\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u00f8\7\6\2\2\u00f8\u010a\3\2\2\2\u00f9\u00fa\7,\2\2\u00fa\u00fb\7%\2"+
		"\2\u00fb\u00ff\7\4\2\2\u00fc\u00fe\5\6\4\2\u00fd\u00fc\3\2\2\2\u00fe\u0101"+
		"\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0103\3\2\2\2\u0101"+
		"\u00ff\3\2\2\2\u0102\u0104\5\b\5\2\u0103\u0102\3\2\2\2\u0104\u0105\3\2"+
		"\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\3\2\2\2\u0107"+
		"\u0108\7\6\2\2\u0108\u010a\3\2\2\2\u0109\u00b3\3\2\2\2\u0109\u00ce\3\2"+
		"\2\2\u0109\u00e7\3\2\2\2\u0109\u00f9\3\2\2\2\u010a\r\3\2\2\2\u010b\u010c"+
		"\7,\2\2\u010c\u010d\7\b\2\2\u010d\u010e\5\20\t\2\u010e\17\3\2\2\2\u010f"+
		"\u0119\7&\2\2\u0110\u0119\7\'\2\2\u0111\u0119\7(\2\2\u0112\u0113\7\25"+
		"\2\2\u0113\u0114\5\n\6\2\u0114\u0115\7\26\2\2\u0115\u0116\5\20\t\2\u0116"+
		"\u0119\3\2\2\2\u0117\u0119\7,\2\2\u0118\u010f\3\2\2\2\u0118\u0110\3\2"+
		"\2\2\u0118\u0111\3\2\2\2\u0118\u0112\3\2\2\2\u0118\u0117\3\2\2\2\u0119"+
		"\21\3\2\2\2\32\25\27$EN[hs\u0080\u0092\u00ae\u00b0\u00ba\u00c4\u00ca\u00d5"+
		"\u00dd\u00e3\u00ef\u00f5\u00ff\u0105\u0109\u0118";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}