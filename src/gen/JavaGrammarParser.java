// Generated from C:/Users/Agata Rychter/IdeaProjects/Grammar\JavaGrammar.g4 by ANTLR 4.7.2
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, Parameter=4, ParamType=5, GS=6, Singleton=7, ClassName=8, 
		Digit=9, ParamName=10, Default=11;
	public static final int
		RULE_prule = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"prule"
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

	@Override
	public String getGrammarFileName() { return "JavaGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class PruleContext extends ParserRuleContext {
		public TerminalNode ClassName() { return getToken(JavaGrammarParser.ClassName, 0); }
		public TerminalNode GS() { return getToken(JavaGrammarParser.GS, 0); }
		public TerminalNode Singleton() { return getToken(JavaGrammarParser.Singleton, 0); }
		public List<TerminalNode> Parameter() { return getTokens(JavaGrammarParser.Parameter); }
		public TerminalNode Parameter(int i) {
			return getToken(JavaGrammarParser.Parameter, i);
		}
		public PruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterPrule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitPrule(this);
		}
	}

	public final PruleContext prule() throws RecognitionException {
		PruleContext _localctx = new PruleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2);
			match(T__0);
			setState(3);
			match(ClassName);
			setState(4);
			match(T__1);
			setState(7); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(5);
				match(Parameter);
				setState(6);
				match(T__1);
				}
				}
				setState(9); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Parameter );
			setState(11);
			match(T__2);
			setState(12);
			match(GS);
			setState(13);
			match(T__1);
			setState(14);
			match(Singleton);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\r\23\4\2\t\2\3\2"+
		"\3\2\3\2\3\2\3\2\6\2\n\n\2\r\2\16\2\13\3\2\3\2\3\2\3\2\3\2\3\2\2\2\3\2"+
		"\2\2\2\22\2\4\3\2\2\2\4\5\7\3\2\2\5\6\7\n\2\2\6\t\7\4\2\2\7\b\7\6\2\2"+
		"\b\n\7\4\2\2\t\7\3\2\2\2\n\13\3\2\2\2\13\t\3\2\2\2\13\f\3\2\2\2\f\r\3"+
		"\2\2\2\r\16\7\5\2\2\16\17\7\b\2\2\17\20\7\4\2\2\20\21\7\t\2\2\21\3\3\2"+
		"\2\2\3\13";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}