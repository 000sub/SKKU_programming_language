// Generated from Expr.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, NEWLINE=4, INT=5, REAL=6, ID=7, WS=8, ADD=9, MUL=10, 
		SUB=11, DIV=12, ASSIGN=13, COMMA=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "NEWLINE", "INT", "REAL", "ID", "WS", "ADD", 
			"MUL", "SUB", "DIV", "ASSIGN", "COMMA"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "')'", null, null, null, null, null, "'+'", "'*'", 
			"'-'", "'/'", "'='", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "NEWLINE", "INT", "REAL", "ID", "WS", "ADD", 
			"MUL", "SUB", "DIV", "ASSIGN", "COMMA"
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


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20S\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\4\3\4\3\5\6"+
		"\5\'\n\5\r\5\16\5(\3\6\6\6,\n\6\r\6\16\6-\3\7\6\7\61\n\7\r\7\16\7\62\3"+
		"\7\3\7\7\7\67\n\7\f\7\16\7:\13\7\3\b\6\b=\n\b\r\b\16\b>\3\t\6\tB\n\t\r"+
		"\t\16\tC\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\2\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\3\2\6\4\2\f\f\17\17\3\2\62;\4\2C\\c|\5\2\13\f\17\17\"\"\2X\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3\37\3\2\2\2\5!\3\2\2\2\7#\3\2\2\2"+
		"\t&\3\2\2\2\13+\3\2\2\2\r\60\3\2\2\2\17<\3\2\2\2\21A\3\2\2\2\23G\3\2\2"+
		"\2\25I\3\2\2\2\27K\3\2\2\2\31M\3\2\2\2\33O\3\2\2\2\35Q\3\2\2\2\37 \7="+
		"\2\2 \4\3\2\2\2!\"\7*\2\2\"\6\3\2\2\2#$\7+\2\2$\b\3\2\2\2%\'\t\2\2\2&"+
		"%\3\2\2\2\'(\3\2\2\2(&\3\2\2\2()\3\2\2\2)\n\3\2\2\2*,\t\3\2\2+*\3\2\2"+
		"\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\f\3\2\2\2/\61\t\3\2\2\60/\3\2\2\2\61"+
		"\62\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\64\3\2\2\2\648\7\60\2\2\65"+
		"\67\t\3\2\2\66\65\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29\16\3\2\2"+
		"\2:8\3\2\2\2;=\t\4\2\2<;\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?\20\3\2"+
		"\2\2@B\t\5\2\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2DE\3\2\2\2EF\b\t"+
		"\2\2F\22\3\2\2\2GH\7-\2\2H\24\3\2\2\2IJ\7,\2\2J\26\3\2\2\2KL\7/\2\2L\30"+
		"\3\2\2\2MN\7\61\2\2N\32\3\2\2\2OP\7?\2\2P\34\3\2\2\2QR\7.\2\2R\36\3\2"+
		"\2\2\t\2(-\628>C\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}