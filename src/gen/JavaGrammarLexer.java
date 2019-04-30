// Generated from C:/Users/Agata Rychter/IdeaProjects/Grammar\JavaGrammar.g4 by ANTLR 4.7.2
package gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, Parameter=4, ParamType=5, GS=6, Singleton=7, ClassName=8, 
		Digit=9, ParamName=10, Default=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "Parameter", "ParamType", "GS", "Singleton", 
			"ClassName", "Digit", "ParamName", "Default"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'create '", "' '", "'; '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "Parameter", "ParamType", "GS", "Singleton", 
			"ClassName", "Digit", "ParamName", "Default"
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


	public JavaGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JavaGrammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\r\u00ac\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\7\5+\n\5\f\5\16\5.\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6y\n\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\5\7\u0082\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\5\b\u0090\n\b\3\t\3\t\3\t\7\t\u0095\n\t\f\t\16\t\u0098\13\t\3"+
		"\n\3\n\3\13\7\13\u009d\n\13\f\13\16\13\u00a0\13\13\3\13\3\13\3\f\3\f\7"+
		"\f\u00a6\n\f\f\f\16\f\u00a9\13\f\3\f\3\f\2\2\r\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\3\2\6\4\2iiuu\4\2C\\c|\5\2\62;C\\c|\4\2\62"+
		";c|\2\u00bf\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\3\31\3\2\2\2\5!\3\2\2\2\7#\3\2\2\2\t&\3\2\2\2\13x\3\2\2\2\r\u0081"+
		"\3\2\2\2\17\u008f\3\2\2\2\21\u0091\3\2\2\2\23\u0099\3\2\2\2\25\u009e\3"+
		"\2\2\2\27\u00a3\3\2\2\2\31\32\7e\2\2\32\33\7t\2\2\33\34\7g\2\2\34\35\7"+
		"c\2\2\35\36\7v\2\2\36\37\7g\2\2\37 \7\"\2\2 \4\3\2\2\2!\"\7\"\2\2\"\6"+
		"\3\2\2\2#$\7=\2\2$%\7\"\2\2%\b\3\2\2\2&\'\5\25\13\2\'(\7<\2\2(,\5\13\6"+
		"\2)+\5\27\f\2*)\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\n\3\2\2\2.,\3\2"+
		"\2\2/\60\7k\2\2\60\61\7p\2\2\61y\7v\2\2\62\63\7K\2\2\63\64\7p\2\2\64\65"+
		"\7v\2\2\65\66\7g\2\2\66\67\7i\2\2\678\7g\2\28y\7t\2\29:\7e\2\2:;\7j\2"+
		"\2;<\7c\2\2<y\7t\2\2=>\7E\2\2>?\7j\2\2?@\7c\2\2@A\7t\2\2AB\7c\2\2BC\7"+
		"e\2\2CD\7v\2\2DE\7g\2\2Ey\7t\2\2FG\7f\2\2GH\7q\2\2HI\7w\2\2IJ\7d\2\2J"+
		"K\7n\2\2Ky\7g\2\2LM\7F\2\2MN\7q\2\2NO\7w\2\2OP\7d\2\2PQ\7n\2\2Qy\7g\2"+
		"\2RS\7h\2\2ST\7n\2\2TU\7q\2\2UV\7c\2\2Vy\7v\2\2WX\7H\2\2XY\7n\2\2YZ\7"+
		"q\2\2Z[\7c\2\2[y\7v\2\2\\]\7U\2\2]^\7v\2\2^_\7t\2\2_`\7k\2\2`a\7p\2\2"+
		"ay\7i\2\2bc\7d\2\2cd\7q\2\2de\7q\2\2ef\7n\2\2fg\7g\2\2gh\7c\2\2hy\7p\2"+
		"\2ij\7D\2\2jk\7q\2\2kl\7q\2\2lm\7n\2\2mn\7g\2\2no\7c\2\2oy\7p\2\2pq\7"+
		"n\2\2qr\7q\2\2rs\7p\2\2sy\7i\2\2tu\7N\2\2uv\7q\2\2vw\7p\2\2wy\7i\2\2x"+
		"/\3\2\2\2x\62\3\2\2\2x9\3\2\2\2x=\3\2\2\2xF\3\2\2\2xL\3\2\2\2xR\3\2\2"+
		"\2xW\3\2\2\2x\\\3\2\2\2xb\3\2\2\2xi\3\2\2\2xp\3\2\2\2xt\3\2\2\2y\f\3\2"+
		"\2\2z\u0082\t\2\2\2{|\7i\2\2|\u0082\7u\2\2}~\7p\2\2~\177\7q\2\2\177\u0080"+
		"\7i\2\2\u0080\u0082\7u\2\2\u0081z\3\2\2\2\u0081{\3\2\2\2\u0081}\3\2\2"+
		"\2\u0082\16\3\2\2\2\u0083\u0084\7u\2\2\u0084\u0085\7k\2\2\u0085\u0086"+
		"\7p\2\2\u0086\u0087\7i\2\2\u0087\u0090\7n\2\2\u0088\u0089\7p\2\2\u0089"+
		"\u008a\7q\2\2\u008a\u008b\7u\2\2\u008b\u008c\7k\2\2\u008c\u008d\7p\2\2"+
		"\u008d\u008e\7i\2\2\u008e\u0090\7n\2\2\u008f\u0083\3\2\2\2\u008f\u0088"+
		"\3\2\2\2\u0090\20\3\2\2\2\u0091\u0096\4C\\\2\u0092\u0095\t\3\2\2\u0093"+
		"\u0095\5\23\n\2\u0094\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095\u0098\3"+
		"\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\22\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0099\u009a\4\62;\2\u009a\24\3\2\2\2\u009b\u009d\4c|\2"+
		"\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f"+
		"\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\t\4\2\2\u00a2"+
		"\26\3\2\2\2\u00a3\u00a7\7?\2\2\u00a4\u00a6\t\5\2\2\u00a5\u00a4\3\2\2\2"+
		"\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa"+
		"\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ab\t\4\2\2\u00ab\30\3\2\2\2\13\2"+
		",x\u0081\u008f\u0094\u0096\u009e\u00a7\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}