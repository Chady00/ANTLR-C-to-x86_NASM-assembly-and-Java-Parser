// Generated from MyLanguageV1Code.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MyLanguageV1CodeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, ENDIF=3, PRINT=4, INT=5, SHIFTLEFT=6, DO=7, WHILE=8, RETURN=9, 
		PLUS=10, EQUAL=11, ASSIGN=12, NOTEQUAL=13, SEMICOLON=14, LPAREN=15, RPAREN=16, 
		LBRACE=17, RBRACE=18, INTEGER=19, NAME=20, NAME_TOKEN=21, WS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IF", "ELSE", "ENDIF", "PRINT", "INT", "SHIFTLEFT", "DO", "WHILE", "RETURN", 
			"PLUS", "EQUAL", "ASSIGN", "NOTEQUAL", "SEMICOLON", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "INTEGER", "NAME", "NAME_TOKEN", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'endif'", "'print'", "'int'", "'<<'", "'do'", 
			"'while'", "'return'", "'+'", "'=='", "'='", "'!='", "';'", "'('", "')'", 
			"'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSE", "ENDIF", "PRINT", "INT", "SHIFTLEFT", "DO", "WHILE", 
			"RETURN", "PLUS", "EQUAL", "ASSIGN", "NOTEQUAL", "SEMICOLON", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "INTEGER", "NAME", "NAME_TOKEN", "WS"
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


	public MyLanguageV1CodeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MyLanguageV1Code.g4"; }

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
		"\u0004\u0000\u0016\u0084\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0005\u0012o\b\u0012\n\u0012\f\u0012r\t\u0012\u0001"+
		"\u0013\u0004\u0013u\b\u0013\u000b\u0013\f\u0013v\u0001\u0014\u0004\u0014"+
		"z\b\u0014\u000b\u0014\f\u0014{\u0001\u0015\u0004\u0015\u007f\b\u0015\u000b"+
		"\u0015\f\u0015\u0080\u0001\u0015\u0001\u0015\u0000\u0000\u0016\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016\u0001\u0000\u0004"+
		"\u0001\u000009\u0001\u0000az\u0002\u0000AZaz\u0003\u0000\t\n\r\r  \u0087"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0001-\u0001\u0000\u0000\u0000\u00030"+
		"\u0001\u0000\u0000\u0000\u00055\u0001\u0000\u0000\u0000\u0007;\u0001\u0000"+
		"\u0000\u0000\tA\u0001\u0000\u0000\u0000\u000bE\u0001\u0000\u0000\u0000"+
		"\rH\u0001\u0000\u0000\u0000\u000fK\u0001\u0000\u0000\u0000\u0011Q\u0001"+
		"\u0000\u0000\u0000\u0013X\u0001\u0000\u0000\u0000\u0015Z\u0001\u0000\u0000"+
		"\u0000\u0017]\u0001\u0000\u0000\u0000\u0019_\u0001\u0000\u0000\u0000\u001b"+
		"b\u0001\u0000\u0000\u0000\u001dd\u0001\u0000\u0000\u0000\u001ff\u0001"+
		"\u0000\u0000\u0000!h\u0001\u0000\u0000\u0000#j\u0001\u0000\u0000\u0000"+
		"%l\u0001\u0000\u0000\u0000\'t\u0001\u0000\u0000\u0000)y\u0001\u0000\u0000"+
		"\u0000+~\u0001\u0000\u0000\u0000-.\u0005i\u0000\u0000./\u0005f\u0000\u0000"+
		"/\u0002\u0001\u0000\u0000\u000001\u0005e\u0000\u000012\u0005l\u0000\u0000"+
		"23\u0005s\u0000\u000034\u0005e\u0000\u00004\u0004\u0001\u0000\u0000\u0000"+
		"56\u0005e\u0000\u000067\u0005n\u0000\u000078\u0005d\u0000\u000089\u0005"+
		"i\u0000\u00009:\u0005f\u0000\u0000:\u0006\u0001\u0000\u0000\u0000;<\u0005"+
		"p\u0000\u0000<=\u0005r\u0000\u0000=>\u0005i\u0000\u0000>?\u0005n\u0000"+
		"\u0000?@\u0005t\u0000\u0000@\b\u0001\u0000\u0000\u0000AB\u0005i\u0000"+
		"\u0000BC\u0005n\u0000\u0000CD\u0005t\u0000\u0000D\n\u0001\u0000\u0000"+
		"\u0000EF\u0005<\u0000\u0000FG\u0005<\u0000\u0000G\f\u0001\u0000\u0000"+
		"\u0000HI\u0005d\u0000\u0000IJ\u0005o\u0000\u0000J\u000e\u0001\u0000\u0000"+
		"\u0000KL\u0005w\u0000\u0000LM\u0005h\u0000\u0000MN\u0005i\u0000\u0000"+
		"NO\u0005l\u0000\u0000OP\u0005e\u0000\u0000P\u0010\u0001\u0000\u0000\u0000"+
		"QR\u0005r\u0000\u0000RS\u0005e\u0000\u0000ST\u0005t\u0000\u0000TU\u0005"+
		"u\u0000\u0000UV\u0005r\u0000\u0000VW\u0005n\u0000\u0000W\u0012\u0001\u0000"+
		"\u0000\u0000XY\u0005+\u0000\u0000Y\u0014\u0001\u0000\u0000\u0000Z[\u0005"+
		"=\u0000\u0000[\\\u0005=\u0000\u0000\\\u0016\u0001\u0000\u0000\u0000]^"+
		"\u0005=\u0000\u0000^\u0018\u0001\u0000\u0000\u0000_`\u0005!\u0000\u0000"+
		"`a\u0005=\u0000\u0000a\u001a\u0001\u0000\u0000\u0000bc\u0005;\u0000\u0000"+
		"c\u001c\u0001\u0000\u0000\u0000de\u0005(\u0000\u0000e\u001e\u0001\u0000"+
		"\u0000\u0000fg\u0005)\u0000\u0000g \u0001\u0000\u0000\u0000hi\u0005{\u0000"+
		"\u0000i\"\u0001\u0000\u0000\u0000jk\u0005}\u0000\u0000k$\u0001\u0000\u0000"+
		"\u0000lp\u0007\u0000\u0000\u0000mo\u0007\u0000\u0000\u0000nm\u0001\u0000"+
		"\u0000\u0000or\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001"+
		"\u0000\u0000\u0000q&\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000"+
		"su\u0007\u0001\u0000\u0000ts\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000"+
		"\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000w(\u0001\u0000"+
		"\u0000\u0000xz\u0007\u0002\u0000\u0000yx\u0001\u0000\u0000\u0000z{\u0001"+
		"\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000"+
		"|*\u0001\u0000\u0000\u0000}\u007f\u0007\u0003\u0000\u0000~}\u0001\u0000"+
		"\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0006\u0015\u0000\u0000\u0083,\u0001\u0000\u0000\u0000"+
		"\u0005\u0000pv{\u0080\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}