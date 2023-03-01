// Generated from c:\Users\u005Cuo285267\Desktop\Esqueleto Traductor\src\parser\Lexicon.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Lexicon extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LITENT=1, LITREAL=2, IDENT=3, OPERADOR=4, COMPARADOR=5, LOGICO=6, LINE_COMMENT=7, 
		MULTILINE_COMMENT=8, WHITESPACE=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LITENT", "LITREAL", "IDENT", "OPERADOR", "COMPARADOR", "LOGICO", "LINE_COMMENT", 
			"MULTILINE_COMMENT", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LITENT", "LITREAL", "IDENT", "OPERADOR", "COMPARADOR", "LOGICO", 
			"LINE_COMMENT", "MULTILINE_COMMENT", "WHITESPACE"
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


	public Lexicon(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lexicon.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\13a\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\6\2"+
		"\27\n\2\r\2\16\2\30\3\3\6\3\34\n\3\r\3\16\3\35\3\3\3\3\6\3\"\n\3\r\3\16"+
		"\3#\3\4\3\4\7\4(\n\4\f\4\16\4+\13\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\5\6\66\n\6\3\7\3\7\3\7\3\7\3\7\5\7=\n\7\3\b\3\b\3\b\3\b\7\bC\n\b\f"+
		"\b\16\bF\13\b\3\b\5\bI\n\b\3\b\3\b\3\t\3\t\3\t\3\t\7\tQ\n\t\f\t\16\tT"+
		"\13\t\3\t\3\t\3\t\3\t\3\t\3\n\6\n\\\n\n\r\n\16\n]\3\n\3\n\4DR\2\13\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\3\2\b\3\2\62;\4\2C\\c|\6\2\62;C"+
		"\\aac|\6\2\'\',-//\61\61\3\3\f\f\5\2\13\f\17\17\"\"\2l\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\3\26\3\2\2\2\5\33\3\2\2\2\7%\3\2\2\2\t,\3\2"+
		"\2\2\13\65\3\2\2\2\r<\3\2\2\2\17>\3\2\2\2\21L\3\2\2\2\23[\3\2\2\2\25\27"+
		"\t\2\2\2\26\25\3\2\2\2\27\30\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\4"+
		"\3\2\2\2\32\34\t\2\2\2\33\32\3\2\2\2\34\35\3\2\2\2\35\33\3\2\2\2\35\36"+
		"\3\2\2\2\36\37\3\2\2\2\37!\7\60\2\2 \"\t\2\2\2! \3\2\2\2\"#\3\2\2\2#!"+
		"\3\2\2\2#$\3\2\2\2$\6\3\2\2\2%)\t\3\2\2&(\t\4\2\2\'&\3\2\2\2(+\3\2\2\2"+
		")\'\3\2\2\2)*\3\2\2\2*\b\3\2\2\2+)\3\2\2\2,-\t\5\2\2-\n\3\2\2\2.\66\4"+
		">@\2/\60\7>\2\2\60\66\7?\2\2\61\62\7@\2\2\62\66\7?\2\2\63\64\7#\2\2\64"+
		"\66\7?\2\2\65.\3\2\2\2\65/\3\2\2\2\65\61\3\2\2\2\65\63\3\2\2\2\66\f\3"+
		"\2\2\2\678\7(\2\28=\7(\2\29:\7~\2\2:=\7~\2\2;=\7#\2\2<\67\3\2\2\2<9\3"+
		"\2\2\2<;\3\2\2\2=\16\3\2\2\2>?\7\61\2\2?@\7\61\2\2@D\3\2\2\2AC\13\2\2"+
		"\2BA\3\2\2\2CF\3\2\2\2DE\3\2\2\2DB\3\2\2\2EH\3\2\2\2FD\3\2\2\2GI\t\6\2"+
		"\2HG\3\2\2\2IJ\3\2\2\2JK\b\b\2\2K\20\3\2\2\2LM\7\61\2\2MN\7,\2\2NR\3\2"+
		"\2\2OQ\13\2\2\2PO\3\2\2\2QT\3\2\2\2RS\3\2\2\2RP\3\2\2\2SU\3\2\2\2TR\3"+
		"\2\2\2UV\7,\2\2VW\7\61\2\2WX\3\2\2\2XY\b\t\2\2Y\22\3\2\2\2Z\\\t\7\2\2"+
		"[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^_\3\2\2\2_`\b\n\2\2`\24\3\2"+
		"\2\2\r\2\30\35#)\65<DHR]\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}