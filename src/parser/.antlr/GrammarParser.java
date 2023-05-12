// Generated from d:\TrabajoDLP\DLP\src\parser\Grammar.g4 by ANTLR 4.9.2

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
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

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
		public EstructuraContext estructura;
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
			List<AST> prog = new ArrayList<AST>();
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << IDENT))) != 0)) {
				{
				setState(26);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__4:
					{
					setState(17);
					((StartContext)_localctx).definicion = definicion();
					prog.add(((StartContext)_localctx).definicion.ast);
					}
					break;
				case IDENT:
					{
					setState(20);
					((StartContext)_localctx).funcion = funcion();
					prog.add(((StartContext)_localctx).funcion.ast);
					}
					break;
				case T__0:
					{
					setState(23);
					((StartContext)_localctx).estructura = estructura();
					prog.add(((StartContext)_localctx).estructura.ast);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(31);
			match(EOF);
			 ((StartContext)_localctx).ast =  new Program(prog); 
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
		public DefStruct ast;
		public Token IDENT;
		public ParametroContext parametro;
		public List<ParametroContext> pa = new ArrayList<ParametroContext>();
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
			setState(34);
			match(T__0);
			setState(35);
			((EstructuraContext)_localctx).IDENT = match(IDENT);
			setState(36);
			match(T__1);
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(37);
				((EstructuraContext)_localctx).parametro = parametro();
				((EstructuraContext)_localctx).pa.add(((EstructuraContext)_localctx).parametro);
				setState(38);
				match(T__2);
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(45);
			match(T__3);
			setState(46);
			match(T__2);
			 ((EstructuraContext)_localctx).ast =  new DefStruct(((EstructuraContext)_localctx).IDENT,((EstructuraContext)_localctx).pa);
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
		public DefVar ast;
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
			setState(49);
			match(T__4);
			setState(50);
			((DefinicionContext)_localctx).IDENT = match(IDENT);
			setState(51);
			match(T__5);
			setState(52);
			((DefinicionContext)_localctx).tipo = tipo();
			setState(53);
			match(T__2);
			((DefinicionContext)_localctx).ast =  new DefVar(((DefinicionContext)_localctx).IDENT, ((DefinicionContext)_localctx).tipo.ast);
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
		public List<ExprContext> ex = new ArrayList<ExprContext>();
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
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
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
				setState(57);
				((SentenciaContext)_localctx).expr = expr(0);
				setState(58);
				match(T__2);
				((SentenciaContext)_localctx).ast =  new Print((((SentenciaContext)_localctx).te!=null?((SentenciaContext)_localctx).te.getText():null),((SentenciaContext)_localctx).expr.ast);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				match(T__9);
				setState(62);
				((SentenciaContext)_localctx).expr = expr(0);
				setState(63);
				match(T__2);
				((SentenciaContext)_localctx).ast =  new Read(((SentenciaContext)_localctx).expr.ast);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				((SentenciaContext)_localctx).left = expr(0);
				setState(67);
				match(T__10);
				setState(68);
				((SentenciaContext)_localctx).right = expr(0);
				setState(69);
				match(T__2);
				((SentenciaContext)_localctx).ast =  new Assignment(((SentenciaContext)_localctx).left.ast, ((SentenciaContext)_localctx).right.ast);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(72);
				match(T__11);
				setState(73);
				match(T__12);
				setState(74);
				((SentenciaContext)_localctx).expr = expr(0);
				setState(75);
				match(T__13);
				setState(76);
				match(T__1);
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__21) | (1L << T__33) | (1L << LITENT) | (1L << LITREAL) | (1L << LITCHAR) | (1L << IDENT))) != 0)) {
					{
					{
					setState(77);
					((SentenciaContext)_localctx).sentencia = sentencia();
					((SentenciaContext)_localctx).tru.add(((SentenciaContext)_localctx).sentencia);
					}
					}
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(83);
				match(T__3);
				setState(84);
				match(T__14);
				setState(85);
				match(T__1);
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__21) | (1L << T__33) | (1L << LITENT) | (1L << LITREAL) | (1L << LITCHAR) | (1L << IDENT))) != 0)) {
					{
					{
					setState(86);
					((SentenciaContext)_localctx).sentencia = sentencia();
					((SentenciaContext)_localctx).fals.add(((SentenciaContext)_localctx).sentencia);
					}
					}
					setState(91);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(92);
				match(T__3);
				((SentenciaContext)_localctx).ast =  new IfElseSentence(((SentenciaContext)_localctx).expr.ast,((SentenciaContext)_localctx).tru,((SentenciaContext)_localctx).fals);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(95);
				match(T__11);
				setState(96);
				match(T__12);
				setState(97);
				((SentenciaContext)_localctx).expr = expr(0);
				setState(98);
				match(T__13);
				setState(99);
				match(T__1);
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__21) | (1L << T__33) | (1L << LITENT) | (1L << LITREAL) | (1L << LITCHAR) | (1L << IDENT))) != 0)) {
					{
					{
					setState(100);
					((SentenciaContext)_localctx).sentencia = sentencia();
					((SentenciaContext)_localctx).tru.add(((SentenciaContext)_localctx).sentencia);
					}
					}
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(106);
				match(T__3);
				((SentenciaContext)_localctx).ast =  new IfSentence(((SentenciaContext)_localctx).expr.ast,((SentenciaContext)_localctx).tru);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(109);
				match(T__15);
				setState(110);
				match(T__12);
				setState(111);
				((SentenciaContext)_localctx).expr = expr(0);
				setState(112);
				match(T__13);
				setState(113);
				match(T__1);
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__21) | (1L << T__33) | (1L << LITENT) | (1L << LITREAL) | (1L << LITCHAR) | (1L << IDENT))) != 0)) {
					{
					{
					setState(114);
					((SentenciaContext)_localctx).sentencia = sentencia();
					((SentenciaContext)_localctx).se.add(((SentenciaContext)_localctx).sentencia);
					}
					}
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(120);
				match(T__3);
				((SentenciaContext)_localctx).ast =  new WhileSentence(((SentenciaContext)_localctx).expr.ast,((SentenciaContext)_localctx).se);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(123);
				match(T__16);
				setState(124);
				((SentenciaContext)_localctx).expr = expr(0);
				setState(125);
				match(T__2);
				((SentenciaContext)_localctx).ast =  new ReturnNode(((SentenciaContext)_localctx).expr.ast);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(128);
				match(T__16);
				setState(129);
				match(T__2);
				((SentenciaContext)_localctx).ast =  new ReturnNode(null);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(131);
				((SentenciaContext)_localctx).IDENT = match(IDENT);
				setState(132);
				match(T__12);
				setState(133);
				match(T__13);
				setState(134);
				match(T__2);
				((SentenciaContext)_localctx).ast =  new FuncCall(((SentenciaContext)_localctx).IDENT,new ArrayList<Expr>());
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(136);
				((SentenciaContext)_localctx).IDENT = match(IDENT);
				setState(137);
				match(T__12);
				setState(138);
				((SentenciaContext)_localctx).expr = expr(0);
				((SentenciaContext)_localctx).ex.add(((SentenciaContext)_localctx).expr);
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(139);
					match(T__17);
					setState(140);
					((SentenciaContext)_localctx).expr = expr(0);
					((SentenciaContext)_localctx).ex.add(((SentenciaContext)_localctx).expr);
					}
					}
					setState(145);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(146);
				match(T__13);
				setState(147);
				match(T__2);
				((SentenciaContext)_localctx).ast =  new FuncCall(((SentenciaContext)_localctx).IDENT,((SentenciaContext)_localctx).ex);
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
		public List<ExprContext> ex = new ArrayList<ExprContext>();
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
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(153);
				((ExprContext)_localctx).LITENT = match(LITENT);
				((ExprContext)_localctx).ast =  new LitEnt(((ExprContext)_localctx).LITENT);
				}
				break;
			case 2:
				{
				setState(155);
				((ExprContext)_localctx).LITREAL = match(LITREAL);
				((ExprContext)_localctx).ast =  new LitReal(((ExprContext)_localctx).LITREAL);
				}
				break;
			case 3:
				{
				setState(157);
				((ExprContext)_localctx).LITCHAR = match(LITCHAR);
				((ExprContext)_localctx).ast =  new LitChar(((ExprContext)_localctx).LITCHAR);
				}
				break;
			case 4:
				{
				setState(159);
				((ExprContext)_localctx).IDENT = match(IDENT);
				((ExprContext)_localctx).ast =  new Variable(((ExprContext)_localctx).IDENT);
				}
				break;
			case 5:
				{
				setState(161);
				((ExprContext)_localctx).IDENT = match(IDENT);
				setState(162);
				match(T__12);
				setState(163);
				match(T__13);
				((ExprContext)_localctx).ast = new MethodCallExpr(((ExprContext)_localctx).IDENT,new ArrayList<Expr>());
				}
				break;
			case 6:
				{
				setState(165);
				((ExprContext)_localctx).IDENT = match(IDENT);
				setState(166);
				match(T__12);
				setState(167);
				((ExprContext)_localctx).expr = ((ExprContext)_localctx).expr = expr(0);
				((ExprContext)_localctx).ex.add(((ExprContext)_localctx).expr);
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(168);
					match(T__17);
					setState(169);
					((ExprContext)_localctx).expr = ((ExprContext)_localctx).expr = expr(0);
					((ExprContext)_localctx).ex.add(((ExprContext)_localctx).expr);
					}
					}
					setState(174);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(175);
				match(T__13);
				((ExprContext)_localctx).ast = new MethodCallExpr(((ExprContext)_localctx).IDENT,((ExprContext)_localctx).ex);
				}
				break;
			case 7:
				{
				setState(178);
				match(T__12);
				setState(179);
				((ExprContext)_localctx).expr = expr(0);
				setState(180);
				match(T__13);
				((ExprContext)_localctx).ast =  ((ExprContext)_localctx).expr.ast ;
				}
				break;
			case 8:
				{
				setState(183);
				match(T__21);
				setState(184);
				((ExprContext)_localctx).tipo = tipo();
				setState(185);
				match(T__22);
				setState(186);
				match(T__12);
				setState(187);
				((ExprContext)_localctx).expr = expr(0);
				setState(188);
				match(T__13);
				((ExprContext)_localctx).ast =  new Cast(((ExprContext)_localctx).tipo.ast, ((ExprContext)_localctx).expr.ast);
				}
				break;
			case 9:
				{
				setState(191);
				match(T__33);
				setState(192);
				((ExprContext)_localctx).expr = expr(1);
				((ExprContext)_localctx).ast =  new ExprLogicaNe( ((ExprContext)_localctx).expr.ast);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(239);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(237);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(197);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(198);
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
						setState(199);
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
						setState(202);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(203);
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
						setState(204);
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
						setState(207);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(208);
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
						setState(209);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(6);
						((ExprContext)_localctx).ast =  new ExprLogica(((ExprContext)_localctx).left.ast, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.ast);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(212);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(213);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__29 || _la==T__30) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(214);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(5);
						((ExprContext)_localctx).ast =  new ExprLogica(((ExprContext)_localctx).left.ast, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.ast);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(217);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(218);
						((ExprContext)_localctx).op = match(T__31);
						setState(219);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(4);
						((ExprContext)_localctx).ast =  new ExprLogica(((ExprContext)_localctx).left.ast, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.ast);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(222);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(223);
						((ExprContext)_localctx).op = match(T__32);
						setState(224);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(3);
						((ExprContext)_localctx).ast =  new ExprLogica(((ExprContext)_localctx).left.ast, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.ast);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(227);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(228);
						match(T__18);
						setState(229);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(0);
						setState(230);
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
						setState(233);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(234);
						match(T__20);
						setState(235);
						((ExprContext)_localctx).IDENT = match(IDENT);
						((ExprContext)_localctx).ast =  new Acces(((ExprContext)_localctx).left.ast, ((ExprContext)_localctx).IDENT);
						}
						break;
					}
					} 
				}
				setState(241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
			setState(373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				((FuncionContext)_localctx).IDENT = match(IDENT);
				setState(243);
				match(T__12);
				setState(244);
				match(T__13);
				setState(245);
				match(T__1);
				setState(246);
				match(T__3);
				((FuncionContext)_localctx).ast =  new Func(((FuncionContext)_localctx).IDENT,null,null,null,null);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				List<Parameter> para = new ArrayList<Parameter>();List<Sentence> sent = new ArrayList<Sentence>(); List<DefVar> def = new ArrayList<DefVar>();
				setState(249);
				((FuncionContext)_localctx).IDENT = match(IDENT);
				setState(250);
				match(T__12);
				setState(251);
				((FuncionContext)_localctx).p = parametro();
				para.add(((FuncionContext)_localctx).p.ast);
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(253);
					match(T__17);
					setState(254);
					((FuncionContext)_localctx).pa = parametro();
					para.add(((FuncionContext)_localctx).pa.ast);
					}
					}
					setState(261);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(262);
				match(T__13);
				setState(263);
				match(T__5);
				setState(264);
				((FuncionContext)_localctx).tipo = tipo();
				setState(265);
				match(T__1);
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(266);
					((FuncionContext)_localctx).definicion = definicion();
					def.add(((FuncionContext)_localctx).definicion.ast);
					}
					}
					setState(273);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(277); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(274);
					((FuncionContext)_localctx).sentencia = sentencia();
					sent.add(((FuncionContext)_localctx).sentencia.ast);
					}
					}
					setState(279); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__21) | (1L << T__33) | (1L << LITENT) | (1L << LITREAL) | (1L << LITCHAR) | (1L << IDENT))) != 0) );
				setState(281);
				match(T__3);
				((FuncionContext)_localctx).ast =  new Func(((FuncionContext)_localctx).IDENT,para,((FuncionContext)_localctx).tipo.ast,def,sent);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				List<Parameter> para = new ArrayList<Parameter>();List<Sentence> sent = new ArrayList<Sentence>(); List<DefVar> def = new ArrayList<DefVar>();
				setState(285);
				((FuncionContext)_localctx).IDENT = match(IDENT);
				setState(286);
				match(T__12);
				setState(287);
				((FuncionContext)_localctx).p = parametro();
				para.add(((FuncionContext)_localctx).p.ast);
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(289);
					match(T__17);
					setState(290);
					((FuncionContext)_localctx).pa = parametro();
					para.add(((FuncionContext)_localctx).pa.ast);
					}
					}
					setState(297);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(298);
				match(T__13);
				setState(299);
				match(T__1);
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(300);
					((FuncionContext)_localctx).definicion = definicion();
					def.add(((FuncionContext)_localctx).definicion.ast);
					}
					}
					setState(307);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(311); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(308);
					((FuncionContext)_localctx).sentencia = sentencia();
					sent.add(((FuncionContext)_localctx).sentencia.ast);
					}
					}
					setState(313); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__21) | (1L << T__33) | (1L << LITENT) | (1L << LITREAL) | (1L << LITCHAR) | (1L << IDENT))) != 0) );
				setState(315);
				match(T__3);
				((FuncionContext)_localctx).ast =  new Func(((FuncionContext)_localctx).IDENT,para,null,def,sent);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				List<Sentence> sent = new ArrayList<Sentence>(); List<DefVar> def = new ArrayList<DefVar>();
				setState(319);
				((FuncionContext)_localctx).IDENT = match(IDENT);
				setState(320);
				match(T__12);
				setState(321);
				match(T__13);
				setState(322);
				match(T__5);
				setState(323);
				((FuncionContext)_localctx).tipo = tipo();
				setState(324);
				match(T__1);
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(325);
					((FuncionContext)_localctx).definicion = definicion();
					def.add(((FuncionContext)_localctx).definicion.ast);
					}
					}
					setState(332);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(336); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(333);
					((FuncionContext)_localctx).sentencia = sentencia();
					sent.add(((FuncionContext)_localctx).sentencia.ast);
					}
					}
					setState(338); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__21) | (1L << T__33) | (1L << LITENT) | (1L << LITREAL) | (1L << LITCHAR) | (1L << IDENT))) != 0) );
				setState(340);
				match(T__3);
				((FuncionContext)_localctx).ast =  new Func(((FuncionContext)_localctx).IDENT,null,((FuncionContext)_localctx).tipo.ast,def,sent);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				List<Sentence> sent = new ArrayList<Sentence>(); List<DefVar> def = new ArrayList<DefVar>();
				setState(344);
				((FuncionContext)_localctx).IDENT = match(IDENT);
				setState(345);
				match(T__12);
				setState(346);
				match(T__13);
				setState(347);
				match(T__1);
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(348);
					((FuncionContext)_localctx).definicion = definicion();
					def.add(((FuncionContext)_localctx).definicion.ast);
					}
					}
					setState(355);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(359); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(356);
					((FuncionContext)_localctx).sentencia = sentencia();
					sent.add(((FuncionContext)_localctx).sentencia.ast);
					}
					}
					setState(361); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__21) | (1L << T__33) | (1L << LITENT) | (1L << LITREAL) | (1L << LITCHAR) | (1L << IDENT))) != 0) );
				setState(363);
				match(T__3);
				((FuncionContext)_localctx).ast =  new Func(((FuncionContext)_localctx).IDENT,null,null,def,sent);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(366);
				((FuncionContext)_localctx).IDENT = match(IDENT);
				setState(367);
				match(T__12);
				setState(368);
				match(T__13);
				setState(369);
				match(T__5);
				setState(370);
				match(T__1);
				setState(371);
				match(T__3);
				((FuncionContext)_localctx).ast =  new Func(((FuncionContext)_localctx).IDENT,null,null,null,null);
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
			setState(375);
			((ParametroContext)_localctx).IDENT = match(IDENT);
			setState(376);
			match(T__5);
			setState(377);
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
			setState(394);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(380);
				match(T__34);
				((TipoContext)_localctx).ast =  new IntType();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
				setState(382);
				match(T__35);
				((TipoContext)_localctx).ast =  new RealType();
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 3);
				{
				setState(384);
				match(T__36);
				((TipoContext)_localctx).ast =  new CharType();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 4);
				{
				setState(386);
				match(T__18);
				setState(387);
				((TipoContext)_localctx).LITENT = match(LITENT);
				setState(388);
				match(T__19);
				setState(389);
				((TipoContext)_localctx).tipo = tipo();
				((TipoContext)_localctx).ast =  new ArrayType(((TipoContext)_localctx).LITENT, ((TipoContext)_localctx).tipo.ast);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(392);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u018f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\7\2\35\n\2\f\2\16\2 \13\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\7\3+\n\3\f\3\16\3.\13\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5Q\n\5\f\5\16\5T\13\5\3\5\3\5\3\5\3"+
		"\5\7\5Z\n\5\f\5\16\5]\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5h\n"+
		"\5\f\5\16\5k\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5v\n\5\f\5\16"+
		"\5y\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\7\5\u0090\n\5\f\5\16\5\u0093\13\5\3\5\3\5\3\5\3"+
		"\5\5\5\u0099\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\7\6\u00ad\n\6\f\6\16\6\u00b0\13\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00c6"+
		"\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00f0\n\6\f\6\16\6\u00f3\13\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0104\n\7\f\7\16"+
		"\7\u0107\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0110\n\7\f\7\16\7\u0113"+
		"\13\7\3\7\3\7\3\7\6\7\u0118\n\7\r\7\16\7\u0119\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0128\n\7\f\7\16\7\u012b\13\7\3\7\3\7\3\7"+
		"\3\7\3\7\7\7\u0132\n\7\f\7\16\7\u0135\13\7\3\7\3\7\3\7\6\7\u013a\n\7\r"+
		"\7\16\7\u013b\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7"+
		"\u014b\n\7\f\7\16\7\u014e\13\7\3\7\3\7\3\7\6\7\u0153\n\7\r\7\16\7\u0154"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0162\n\7\f\7\16\7\u0165"+
		"\13\7\3\7\3\7\3\7\6\7\u016a\n\7\r\7\16\7\u016b\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\5\7\u0178\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u018d\n\t\3\t\2\3\n\n\2\4\6\b"+
		"\n\f\16\20\2\7\3\2\t\13\3\2\32\33\3\2\34\35\4\2\30\31\36\37\3\2 !\2\u01bc"+
		"\2\22\3\2\2\2\4$\3\2\2\2\6\63\3\2\2\2\b\u0098\3\2\2\2\n\u00c5\3\2\2\2"+
		"\f\u0177\3\2\2\2\16\u0179\3\2\2\2\20\u018c\3\2\2\2\22\36\b\2\1\2\23\24"+
		"\5\6\4\2\24\25\b\2\1\2\25\35\3\2\2\2\26\27\5\f\7\2\27\30\b\2\1\2\30\35"+
		"\3\2\2\2\31\32\5\4\3\2\32\33\b\2\1\2\33\35\3\2\2\2\34\23\3\2\2\2\34\26"+
		"\3\2\2\2\34\31\3\2\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37!\3\2"+
		"\2\2 \36\3\2\2\2!\"\7\2\2\3\"#\b\2\1\2#\3\3\2\2\2$%\7\3\2\2%&\7+\2\2&"+
		",\7\4\2\2\'(\5\16\b\2()\7\5\2\2)+\3\2\2\2*\'\3\2\2\2+.\3\2\2\2,*\3\2\2"+
		"\2,-\3\2\2\2-/\3\2\2\2.,\3\2\2\2/\60\7\6\2\2\60\61\7\5\2\2\61\62\b\3\1"+
		"\2\62\5\3\2\2\2\63\64\7\7\2\2\64\65\7+\2\2\65\66\7\b\2\2\66\67\5\20\t"+
		"\2\678\7\5\2\289\b\4\1\29\7\3\2\2\2:;\t\2\2\2;<\5\n\6\2<=\7\5\2\2=>\b"+
		"\5\1\2>\u0099\3\2\2\2?@\7\f\2\2@A\5\n\6\2AB\7\5\2\2BC\b\5\1\2C\u0099\3"+
		"\2\2\2DE\5\n\6\2EF\7\r\2\2FG\5\n\6\2GH\7\5\2\2HI\b\5\1\2I\u0099\3\2\2"+
		"\2JK\7\16\2\2KL\7\17\2\2LM\5\n\6\2MN\7\20\2\2NR\7\4\2\2OQ\5\b\5\2PO\3"+
		"\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2TR\3\2\2\2UV\7\6\2\2VW\7"+
		"\21\2\2W[\7\4\2\2XZ\5\b\5\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\"+
		"^\3\2\2\2][\3\2\2\2^_\7\6\2\2_`\b\5\1\2`\u0099\3\2\2\2ab\7\16\2\2bc\7"+
		"\17\2\2cd\5\n\6\2de\7\20\2\2ei\7\4\2\2fh\5\b\5\2gf\3\2\2\2hk\3\2\2\2i"+
		"g\3\2\2\2ij\3\2\2\2jl\3\2\2\2ki\3\2\2\2lm\7\6\2\2mn\b\5\1\2n\u0099\3\2"+
		"\2\2op\7\22\2\2pq\7\17\2\2qr\5\n\6\2rs\7\20\2\2sw\7\4\2\2tv\5\b\5\2ut"+
		"\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2yw\3\2\2\2z{\7\6\2\2{"+
		"|\b\5\1\2|\u0099\3\2\2\2}~\7\23\2\2~\177\5\n\6\2\177\u0080\7\5\2\2\u0080"+
		"\u0081\b\5\1\2\u0081\u0099\3\2\2\2\u0082\u0083\7\23\2\2\u0083\u0084\7"+
		"\5\2\2\u0084\u0099\b\5\1\2\u0085\u0086\7+\2\2\u0086\u0087\7\17\2\2\u0087"+
		"\u0088\7\20\2\2\u0088\u0089\7\5\2\2\u0089\u0099\b\5\1\2\u008a\u008b\7"+
		"+\2\2\u008b\u008c\7\17\2\2\u008c\u0091\5\n\6\2\u008d\u008e\7\24\2\2\u008e"+
		"\u0090\5\n\6\2\u008f\u008d\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2"+
		"\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094"+
		"\u0095\7\20\2\2\u0095\u0096\7\5\2\2\u0096\u0097\b\5\1\2\u0097\u0099\3"+
		"\2\2\2\u0098:\3\2\2\2\u0098?\3\2\2\2\u0098D\3\2\2\2\u0098J\3\2\2\2\u0098"+
		"a\3\2\2\2\u0098o\3\2\2\2\u0098}\3\2\2\2\u0098\u0082\3\2\2\2\u0098\u0085"+
		"\3\2\2\2\u0098\u008a\3\2\2\2\u0099\t\3\2\2\2\u009a\u009b\b\6\1\2\u009b"+
		"\u009c\7(\2\2\u009c\u00c6\b\6\1\2\u009d\u009e\7)\2\2\u009e\u00c6\b\6\1"+
		"\2\u009f\u00a0\7*\2\2\u00a0\u00c6\b\6\1\2\u00a1\u00a2\7+\2\2\u00a2\u00c6"+
		"\b\6\1\2\u00a3\u00a4\7+\2\2\u00a4\u00a5\7\17\2\2\u00a5\u00a6\7\20\2\2"+
		"\u00a6\u00c6\b\6\1\2\u00a7\u00a8\7+\2\2\u00a8\u00a9\7\17\2\2\u00a9\u00ae"+
		"\5\n\6\2\u00aa\u00ab\7\24\2\2\u00ab\u00ad\5\n\6\2\u00ac\u00aa\3\2\2\2"+
		"\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1"+
		"\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\7\20\2\2\u00b2\u00b3\b\6\1\2"+
		"\u00b3\u00c6\3\2\2\2\u00b4\u00b5\7\17\2\2\u00b5\u00b6\5\n\6\2\u00b6\u00b7"+
		"\7\20\2\2\u00b7\u00b8\b\6\1\2\u00b8\u00c6\3\2\2\2\u00b9\u00ba\7\30\2\2"+
		"\u00ba\u00bb\5\20\t\2\u00bb\u00bc\7\31\2\2\u00bc\u00bd\7\17\2\2\u00bd"+
		"\u00be\5\n\6\2\u00be\u00bf\7\20\2\2\u00bf\u00c0\b\6\1\2\u00c0\u00c6\3"+
		"\2\2\2\u00c1\u00c2\7$\2\2\u00c2\u00c3\5\n\6\3\u00c3\u00c4\b\6\1\2\u00c4"+
		"\u00c6\3\2\2\2\u00c5\u009a\3\2\2\2\u00c5\u009d\3\2\2\2\u00c5\u009f\3\2"+
		"\2\2\u00c5\u00a1\3\2\2\2\u00c5\u00a3\3\2\2\2\u00c5\u00a7\3\2\2\2\u00c5"+
		"\u00b4\3\2\2\2\u00c5\u00b9\3\2\2\2\u00c5\u00c1\3\2\2\2\u00c6\u00f1\3\2"+
		"\2\2\u00c7\u00c8\f\t\2\2\u00c8\u00c9\t\3\2\2\u00c9\u00ca\5\n\6\n\u00ca"+
		"\u00cb\b\6\1\2\u00cb\u00f0\3\2\2\2\u00cc\u00cd\f\b\2\2\u00cd\u00ce\t\4"+
		"\2\2\u00ce\u00cf\5\n\6\t\u00cf\u00d0\b\6\1\2\u00d0\u00f0\3\2\2\2\u00d1"+
		"\u00d2\f\7\2\2\u00d2\u00d3\t\5\2\2\u00d3\u00d4\5\n\6\b\u00d4\u00d5\b\6"+
		"\1\2\u00d5\u00f0\3\2\2\2\u00d6\u00d7\f\6\2\2\u00d7\u00d8\t\6\2\2\u00d8"+
		"\u00d9\5\n\6\7\u00d9\u00da\b\6\1\2\u00da\u00f0\3\2\2\2\u00db\u00dc\f\5"+
		"\2\2\u00dc\u00dd\7\"\2\2\u00dd\u00de\5\n\6\6\u00de\u00df\b\6\1\2\u00df"+
		"\u00f0\3\2\2\2\u00e0\u00e1\f\4\2\2\u00e1\u00e2\7#\2\2\u00e2\u00e3\5\n"+
		"\6\5\u00e3\u00e4\b\6\1\2\u00e4\u00f0\3\2\2\2\u00e5\u00e6\f\r\2\2\u00e6"+
		"\u00e7\7\25\2\2\u00e7\u00e8\5\n\6\2\u00e8\u00e9\7\26\2\2\u00e9\u00ea\b"+
		"\6\1\2\u00ea\u00f0\3\2\2\2\u00eb\u00ec\f\f\2\2\u00ec\u00ed\7\27\2\2\u00ed"+
		"\u00ee\7+\2\2\u00ee\u00f0\b\6\1\2\u00ef\u00c7\3\2\2\2\u00ef\u00cc\3\2"+
		"\2\2\u00ef\u00d1\3\2\2\2\u00ef\u00d6\3\2\2\2\u00ef\u00db\3\2\2\2\u00ef"+
		"\u00e0\3\2\2\2\u00ef\u00e5\3\2\2\2\u00ef\u00eb\3\2\2\2\u00f0\u00f3\3\2"+
		"\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\13\3\2\2\2\u00f3\u00f1"+
		"\3\2\2\2\u00f4\u00f5\7+\2\2\u00f5\u00f6\7\17\2\2\u00f6\u00f7\7\20\2\2"+
		"\u00f7\u00f8\7\4\2\2\u00f8\u00f9\7\6\2\2\u00f9\u0178\b\7\1\2\u00fa\u00fb"+
		"\b\7\1\2\u00fb\u00fc\7+\2\2\u00fc\u00fd\7\17\2\2\u00fd\u00fe\5\16\b\2"+
		"\u00fe\u0105\b\7\1\2\u00ff\u0100\7\24\2\2\u0100\u0101\5\16\b\2\u0101\u0102"+
		"\b\7\1\2\u0102\u0104\3\2\2\2\u0103\u00ff\3\2\2\2\u0104\u0107\3\2\2\2\u0105"+
		"\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\3\2\2\2\u0107\u0105\3\2"+
		"\2\2\u0108\u0109\7\20\2\2\u0109\u010a\7\b\2\2\u010a\u010b\5\20\t\2\u010b"+
		"\u0111\7\4\2\2\u010c\u010d\5\6\4\2\u010d\u010e\b\7\1\2\u010e\u0110\3\2"+
		"\2\2\u010f\u010c\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111"+
		"\u0112\3\2\2\2\u0112\u0117\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0115\5\b"+
		"\5\2\u0115\u0116\b\7\1\2\u0116\u0118\3\2\2\2\u0117\u0114\3\2\2\2\u0118"+
		"\u0119\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\3\2"+
		"\2\2\u011b\u011c\7\6\2\2\u011c\u011d\b\7\1\2\u011d\u0178\3\2\2\2\u011e"+
		"\u011f\b\7\1\2\u011f\u0120\7+\2\2\u0120\u0121\7\17\2\2\u0121\u0122\5\16"+
		"\b\2\u0122\u0129\b\7\1\2\u0123\u0124\7\24\2\2\u0124\u0125\5\16\b\2\u0125"+
		"\u0126\b\7\1\2\u0126\u0128\3\2\2\2\u0127\u0123\3\2\2\2\u0128\u012b\3\2"+
		"\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012c\3\2\2\2\u012b"+
		"\u0129\3\2\2\2\u012c\u012d\7\20\2\2\u012d\u0133\7\4\2\2\u012e\u012f\5"+
		"\6\4\2\u012f\u0130\b\7\1\2\u0130\u0132\3\2\2\2\u0131\u012e\3\2\2\2\u0132"+
		"\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0139\3\2"+
		"\2\2\u0135\u0133\3\2\2\2\u0136\u0137\5\b\5\2\u0137\u0138\b\7\1\2\u0138"+
		"\u013a\3\2\2\2\u0139\u0136\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u0139\3\2"+
		"\2\2\u013b\u013c\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\7\6\2\2\u013e"+
		"\u013f\b\7\1\2\u013f\u0178\3\2\2\2\u0140\u0141\b\7\1\2\u0141\u0142\7+"+
		"\2\2\u0142\u0143\7\17\2\2\u0143\u0144\7\20\2\2\u0144\u0145\7\b\2\2\u0145"+
		"\u0146\5\20\t\2\u0146\u014c\7\4\2\2\u0147\u0148\5\6\4\2\u0148\u0149\b"+
		"\7\1\2\u0149\u014b\3\2\2\2\u014a\u0147\3\2\2\2\u014b\u014e\3\2\2\2\u014c"+
		"\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u0152\3\2\2\2\u014e\u014c\3\2"+
		"\2\2\u014f\u0150\5\b\5\2\u0150\u0151\b\7\1\2\u0151\u0153\3\2\2\2\u0152"+
		"\u014f\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2"+
		"\2\2\u0155\u0156\3\2\2\2\u0156\u0157\7\6\2\2\u0157\u0158\b\7\1\2\u0158"+
		"\u0178\3\2\2\2\u0159\u015a\b\7\1\2\u015a\u015b\7+\2\2\u015b\u015c\7\17"+
		"\2\2\u015c\u015d\7\20\2\2\u015d\u0163\7\4\2\2\u015e\u015f\5\6\4\2\u015f"+
		"\u0160\b\7\1\2\u0160\u0162\3\2\2\2\u0161\u015e\3\2\2\2\u0162\u0165\3\2"+
		"\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0169\3\2\2\2\u0165"+
		"\u0163\3\2\2\2\u0166\u0167\5\b\5\2\u0167\u0168\b\7\1\2\u0168\u016a\3\2"+
		"\2\2\u0169\u0166\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u0169\3\2\2\2\u016b"+
		"\u016c\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016e\7\6\2\2\u016e\u016f\b\7"+
		"\1\2\u016f\u0178\3\2\2\2\u0170\u0171\7+\2\2\u0171\u0172\7\17\2\2\u0172"+
		"\u0173\7\20\2\2\u0173\u0174\7\b\2\2\u0174\u0175\7\4\2\2\u0175\u0176\7"+
		"\6\2\2\u0176\u0178\b\7\1\2\u0177\u00f4\3\2\2\2\u0177\u00fa\3\2\2\2\u0177"+
		"\u011e\3\2\2\2\u0177\u0140\3\2\2\2\u0177\u0159\3\2\2\2\u0177\u0170\3\2"+
		"\2\2\u0178\r\3\2\2\2\u0179\u017a\7+\2\2\u017a\u017b\7\b\2\2\u017b\u017c"+
		"\5\20\t\2\u017c\u017d\b\b\1\2\u017d\17\3\2\2\2\u017e\u017f\7%\2\2\u017f"+
		"\u018d\b\t\1\2\u0180\u0181\7&\2\2\u0181\u018d\b\t\1\2\u0182\u0183\7\'"+
		"\2\2\u0183\u018d\b\t\1\2\u0184\u0185\7\25\2\2\u0185\u0186\7(\2\2\u0186"+
		"\u0187\7\26\2\2\u0187\u0188\5\20\t\2\u0188\u0189\b\t\1\2\u0189\u018d\3"+
		"\2\2\2\u018a\u018b\7+\2\2\u018b\u018d\b\t\1\2\u018c\u017e\3\2\2\2\u018c"+
		"\u0180\3\2\2\2\u018c\u0182\3\2\2\2\u018c\u0184\3\2\2\2\u018c\u018a\3\2"+
		"\2\2\u018d\21\3\2\2\2\33\34\36,R[iw\u0091\u0098\u00ae\u00c5\u00ef\u00f1"+
		"\u0105\u0111\u0119\u0129\u0133\u013b\u014c\u0154\u0163\u016b\u0177\u018c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}