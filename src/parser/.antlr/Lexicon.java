// Generated from d:\Esqueleto Traductor\src\parser\Lexicon.g4 by ANTLR 4.9.2
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
		LITENT=1, LITREAL=2, LITCHAR=3, IDENT=4, LINE_COMMENT=5, MULTILINE_COMMENT=6, 
		WHITESPACE=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LITENT", "LITREAL", "LITCHAR", "IDENT", "LINE_COMMENT", "MULTILINE_COMMENT", 
			"WHITESPACE"
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
			null, "LITENT", "LITREAL", "LITCHAR", "IDENT", "LINE_COMMENT", "MULTILINE_COMMENT", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\tQ\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\6\2\23\n\2\r\2\16\2"+
		"\24\3\3\6\3\30\n\3\r\3\16\3\31\3\3\3\3\6\3\36\n\3\r\3\16\3\37\3\4\3\4"+
		"\3\4\3\4\5\4&\n\4\3\4\3\4\3\5\6\5+\n\5\r\5\16\5,\3\6\3\6\3\6\3\6\7\6\63"+
		"\n\6\f\6\16\6\66\13\6\3\6\5\69\n\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7A\n\7\f"+
		"\7\16\7D\13\7\3\7\3\7\3\7\3\7\3\7\3\b\6\bL\n\b\r\b\16\bM\3\b\3\b\4\64"+
		"B\2\t\3\3\5\4\7\5\t\6\13\7\r\b\17\t\3\2\6\3\2\62;\6\2\62;C\\aac|\3\3\f"+
		"\f\5\2\13\f\17\17\"\"\2X\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\3\22\3\2\2\2\5\27\3\2\2\2\7!"+
		"\3\2\2\2\t*\3\2\2\2\13.\3\2\2\2\r<\3\2\2\2\17K\3\2\2\2\21\23\t\2\2\2\22"+
		"\21\3\2\2\2\23\24\3\2\2\2\24\22\3\2\2\2\24\25\3\2\2\2\25\4\3\2\2\2\26"+
		"\30\t\2\2\2\27\26\3\2\2\2\30\31\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32"+
		"\33\3\2\2\2\33\35\7\60\2\2\34\36\t\2\2\2\35\34\3\2\2\2\36\37\3\2\2\2\37"+
		"\35\3\2\2\2\37 \3\2\2\2 \6\3\2\2\2!%\7)\2\2\"&\13\2\2\2#$\7^\2\2$&\7p"+
		"\2\2%\"\3\2\2\2%#\3\2\2\2&\'\3\2\2\2\'(\7)\2\2(\b\3\2\2\2)+\t\3\2\2*)"+
		"\3\2\2\2+,\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\n\3\2\2\2./\7\61\2\2/\60\7\61"+
		"\2\2\60\64\3\2\2\2\61\63\13\2\2\2\62\61\3\2\2\2\63\66\3\2\2\2\64\65\3"+
		"\2\2\2\64\62\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\679\t\4\2\28\67\3\2\2\2"+
		"9:\3\2\2\2:;\b\6\2\2;\f\3\2\2\2<=\7\61\2\2=>\7,\2\2>B\3\2\2\2?A\13\2\2"+
		"\2@?\3\2\2\2AD\3\2\2\2BC\3\2\2\2B@\3\2\2\2CE\3\2\2\2DB\3\2\2\2EF\7,\2"+
		"\2FG\7\61\2\2GH\3\2\2\2HI\b\7\2\2I\16\3\2\2\2JL\t\5\2\2KJ\3\2\2\2LM\3"+
		"\2\2\2MK\3\2\2\2MN\3\2\2\2NO\3\2\2\2OP\b\b\2\2P\20\3\2\2\2\f\2\24\31\37"+
		"%,\648BM\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}