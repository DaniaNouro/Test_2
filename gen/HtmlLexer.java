// Generated from E:/My_project_compiler/Test_2/src/antlr/HtmlLexer.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class HtmlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPEN_TAG=1, CLOSE_TAG=2, END_TAG=3, ANGULAR_BINDING=4, ANGULAR_EVENT=5, 
		ANGULAR_DIRECTIVE=6, TAG_NAME=7, ATTR_NAME=8, ATTR_VALUE=9, WS=10, EQUAL=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"OPEN_TAG", "CLOSE_TAG", "END_TAG", "ANGULAR_BINDING", "ANGULAR_EVENT", 
			"ANGULAR_DIRECTIVE", "TAG_NAME", "ATTR_NAME", "ATTR_VALUE", "WS", "EQUAL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<'", "'>'", "'</'", null, null, null, null, null, null, null, 
			"'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OPEN_TAG", "CLOSE_TAG", "END_TAG", "ANGULAR_BINDING", "ANGULAR_EVENT", 
			"ANGULAR_DIRECTIVE", "TAG_NAME", "ATTR_NAME", "ATTR_VALUE", "WS", "EQUAL"
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


	public HtmlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "HtmlLexer.g4"; }

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
		"\u0004\u0000\u000bR\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0005\u0006,\b\u0006\n\u0006\f\u0006/\t\u0006\u0001\u0007"+
		"\u0001\u0007\u0005\u00073\b\u0007\n\u0007\f\u00076\t\u0007\u0001\b\u0001"+
		"\b\u0005\b:\b\b\n\b\f\b=\t\b\u0001\b\u0001\b\u0001\b\u0005\bB\b\b\n\b"+
		"\f\bE\t\b\u0001\b\u0003\bH\b\b\u0001\t\u0004\tK\b\t\u000b\t\f\tL\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0000\u0000\u000b\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0001\u0000\u0005\u0004\u0000::AZ__az\u0005\u0000-.0:AZ_"+
		"_az\u0001\u0000\"\"\u0001\u0000\'\'\u0003\u0000\t\n\r\r  W\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0001\u0017\u0001\u0000\u0000\u0000\u0003\u0019\u0001\u0000"+
		"\u0000\u0000\u0005\u001b\u0001\u0000\u0000\u0000\u0007\u001e\u0001\u0000"+
		"\u0000\u0000\t\"\u0001\u0000\u0000\u0000\u000b&\u0001\u0000\u0000\u0000"+
		"\r)\u0001\u0000\u0000\u0000\u000f0\u0001\u0000\u0000\u0000\u0011G\u0001"+
		"\u0000\u0000\u0000\u0013J\u0001\u0000\u0000\u0000\u0015P\u0001\u0000\u0000"+
		"\u0000\u0017\u0018\u0005<\u0000\u0000\u0018\u0002\u0001\u0000\u0000\u0000"+
		"\u0019\u001a\u0005>\u0000\u0000\u001a\u0004\u0001\u0000\u0000\u0000\u001b"+
		"\u001c\u0005<\u0000\u0000\u001c\u001d\u0005/\u0000\u0000\u001d\u0006\u0001"+
		"\u0000\u0000\u0000\u001e\u001f\u0005[\u0000\u0000\u001f \u0003\u000f\u0007"+
		"\u0000 !\u0005]\u0000\u0000!\b\u0001\u0000\u0000\u0000\"#\u0005(\u0000"+
		"\u0000#$\u0003\u000f\u0007\u0000$%\u0005)\u0000\u0000%\n\u0001\u0000\u0000"+
		"\u0000&\'\u0005*\u0000\u0000\'(\u0003\u000f\u0007\u0000(\f\u0001\u0000"+
		"\u0000\u0000)-\u0007\u0000\u0000\u0000*,\u0007\u0001\u0000\u0000+*\u0001"+
		"\u0000\u0000\u0000,/\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000"+
		"-.\u0001\u0000\u0000\u0000.\u000e\u0001\u0000\u0000\u0000/-\u0001\u0000"+
		"\u0000\u000004\u0007\u0000\u0000\u000013\u0007\u0001\u0000\u000021\u0001"+
		"\u0000\u0000\u000036\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u0000"+
		"45\u0001\u0000\u0000\u00005\u0010\u0001\u0000\u0000\u000064\u0001\u0000"+
		"\u0000\u00007;\u0005\"\u0000\u00008:\b\u0002\u0000\u000098\u0001\u0000"+
		"\u0000\u0000:=\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001"+
		"\u0000\u0000\u0000<>\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000"+
		">H\u0005\"\u0000\u0000?C\u0005\'\u0000\u0000@B\b\u0003\u0000\u0000A@\u0001"+
		"\u0000\u0000\u0000BE\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000"+
		"CD\u0001\u0000\u0000\u0000DF\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000"+
		"\u0000FH\u0005\'\u0000\u0000G7\u0001\u0000\u0000\u0000G?\u0001\u0000\u0000"+
		"\u0000H\u0012\u0001\u0000\u0000\u0000IK\u0007\u0004\u0000\u0000JI\u0001"+
		"\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000"+
		"LM\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NO\u0006\t\u0000\u0000"+
		"O\u0014\u0001\u0000\u0000\u0000PQ\u0005=\u0000\u0000Q\u0016\u0001\u0000"+
		"\u0000\u0000\u0007\u0000-4;CGL\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}