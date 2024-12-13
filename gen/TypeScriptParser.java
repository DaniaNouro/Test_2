// Generated from E:/Com/Test_2/Test_2/src/antlr/TypeScriptParser.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class TypeScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ELSE=1, IMPORT=2, FROM=3, EXPORT=4, CLASS=5, IF=6, ENUM=7, AS=8, FUNCTION=9, 
		TUPLE=10, BOOLEAN=11, NULL=12, THIS=13, NOT=14, LET=15, RETURN=16, TYPE=17, 
		ARRAY_TYPE=18, ARRAY_TYPE_BRACKETS=19, OPERATION=20, COMPARISON_OPERATOR=21, 
		LOGICAL_OPERATOR=22, IDENTIFIER=23, STRING=24, NUMBER=25, LCURLY=26, RCURLY=27, 
		LPAREN=28, RPAREN=29, LBRACK=30, RBRACK=31, COLON=32, SEMICOLON=33, COMMA=34, 
		ARROW=35, BACKTICK=36, SDOLER=37, QUESTION_MARK=38, SPREAD=39, OR=40, 
		EQ=41, DOT=42, WS=43, LINE_COMMENT=44, BLOCK_COMMENT=45;
	public static final int
		RULE_program = 0, RULE_ts_classDeclaration = 1, RULE_ts_classBody = 2, 
		RULE_ts_classBodyMember = 3, RULE_ts_enumDeclaration = 4, RULE_ts_enumMember = 5, 
		RULE_ts_classMember = 6, RULE_ts_variableDeclaration = 7, RULE_ts_array = 8, 
		RULE_ts_methodDeclaration = 9, RULE_ts_methodBody = 10, RULE_ts_parameterList = 11, 
		RULE_ts_parameter = 12, RULE_ts_typeWithBrackets = 13, RULE_ts_objectType = 14, 
		RULE_ts_objectTypeProperty = 15, RULE_ts_enumType = 16, RULE_ts_tupleType = 17, 
		RULE_ts_value = 18, RULE_ts_arrowFunctionDeclaration = 19, RULE_ts_templateString = 20, 
		RULE_ts_templateExpression = 21, RULE_ts_tupleValue = 22, RULE_ts_object = 23, 
		RULE_ts_objectProperty = 24, RULE_ts_statement = 25, RULE_ts_returnStatement = 26, 
		RULE_ts_methodInvocation = 27, RULE_ts_argumentList = 28, RULE_ts_negation = 29, 
		RULE_ts_ifStatement = 30, RULE_ts_ex = 31, RULE_ts_expression = 32, RULE_ts_p1 = 33, 
		RULE_ts_assignment = 34, RULE_ts_parenthesizedValue = 35;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "ts_classDeclaration", "ts_classBody", "ts_classBodyMember", 
			"ts_enumDeclaration", "ts_enumMember", "ts_classMember", "ts_variableDeclaration", 
			"ts_array", "ts_methodDeclaration", "ts_methodBody", "ts_parameterList", 
			"ts_parameter", "ts_typeWithBrackets", "ts_objectType", "ts_objectTypeProperty", 
			"ts_enumType", "ts_tupleType", "ts_value", "ts_arrowFunctionDeclaration", 
			"ts_templateString", "ts_templateExpression", "ts_tupleValue", "ts_object", 
			"ts_objectProperty", "ts_statement", "ts_returnStatement", "ts_methodInvocation", 
			"ts_argumentList", "ts_negation", "ts_ifStatement", "ts_ex", "ts_expression", 
			"ts_p1", "ts_assignment", "ts_parenthesizedValue"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'else'", "'import'", "'from'", "'export'", "'class'", "'if'", 
			"'enum'", "'as'", "'function'", "'tuple'", null, "'null'", "'this'", 
			"'!'", "'let'", "'return'", null, "'Array'", null, null, null, null, 
			null, null, null, "'{'", "'}'", "'('", "')'", "'['", "']'", "':'", "';'", 
			"','", "'=>'", "'`'", "'$'", "'?'", "'...'", "'|'", "'='", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ELSE", "IMPORT", "FROM", "EXPORT", "CLASS", "IF", "ENUM", "AS", 
			"FUNCTION", "TUPLE", "BOOLEAN", "NULL", "THIS", "NOT", "LET", "RETURN", 
			"TYPE", "ARRAY_TYPE", "ARRAY_TYPE_BRACKETS", "OPERATION", "COMPARISON_OPERATOR", 
			"LOGICAL_OPERATOR", "IDENTIFIER", "STRING", "NUMBER", "LCURLY", "RCURLY", 
			"LPAREN", "RPAREN", "LBRACK", "RBRACK", "COLON", "SEMICOLON", "COMMA", 
			"ARROW", "BACKTICK", "SDOLER", "QUESTION_MARK", "SPREAD", "OR", "EQ", 
			"DOT", "WS", "LINE_COMMENT", "BLOCK_COMMENT"
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
	public String getGrammarFileName() { return "TypeScriptParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TypeScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<Ts_classDeclarationContext> ts_classDeclaration() {
			return getRuleContexts(Ts_classDeclarationContext.class);
		}
		public Ts_classDeclarationContext ts_classDeclaration(int i) {
			return getRuleContext(Ts_classDeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(72);
				ts_classDeclaration();
				}
				}
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==EXPORT );
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

	@SuppressWarnings("CheckReturnValue")
	public static class Ts_classDeclarationContext extends ParserRuleContext {
		public TerminalNode EXPORT() { return getToken(TypeScriptParser.EXPORT, 0); }
		public TerminalNode CLASS() { return getToken(TypeScriptParser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TypeScriptParser.IDENTIFIER, 0); }
		public TerminalNode LCURLY() { return getToken(TypeScriptParser.LCURLY, 0); }
		public Ts_classBodyContext ts_classBody() {
			return getRuleContext(Ts_classBodyContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(TypeScriptParser.RCURLY, 0); }
		public Ts_classDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ts_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterTs_classDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitTs_classDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitTs_classDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ts_classDeclarationContext ts_classDeclaration() throws RecognitionException {
		Ts_classDeclarationContext _localctx = new Ts_classDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ts_classDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(EXPORT);
			setState(78);
			match(CLASS);
			setState(79);
			match(IDENTIFIER);
			setState(80);
			match(LCURLY);
			setState(81);
			ts_classBody();
			setState(82);
			match(RCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Ts_classBodyContext extends ParserRuleContext {
		public List<Ts_classBodyMemberContext> ts_classBodyMember() {
			return getRuleContexts(Ts_classBodyMemberContext.class);
		}
		public Ts_classBodyMemberContext ts_classBodyMember(int i) {
			return getRuleContext(Ts_classBodyMemberContext.class,i);
		}
		public Ts_classBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ts_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterTs_classBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitTs_classBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitTs_classBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ts_classBodyContext ts_classBody() throws RecognitionException {
		Ts_classBodyContext _localctx = new Ts_classBodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ts_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8421504L) != 0)) {
				{
				{
				setState(84);
				ts_classBodyMember();
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Ts_classBodyMemberContext extends ParserRuleContext {
		public Ts_enumDeclarationContext ts_enumDeclaration() {
			return getRuleContext(Ts_enumDeclarationContext.class,0);
		}
		public Ts_classMemberContext ts_classMember() {
			return getRuleContext(Ts_classMemberContext.class,0);
		}
		public Ts_classBodyMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ts_classBodyMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterTs_classBodyMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitTs_classBodyMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitTs_classBodyMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ts_classBodyMemberContext ts_classBodyMember() throws RecognitionException {
		Ts_classBodyMemberContext _localctx = new Ts_classBodyMemberContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ts_classBodyMember);
		try {
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				ts_enumDeclaration();
				}
				break;
			case LET:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				ts_classMember();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Ts_enumDeclarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(TypeScriptParser.ENUM, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TypeScriptParser.IDENTIFIER, 0); }
		public TerminalNode LCURLY() { return getToken(TypeScriptParser.LCURLY, 0); }
		public List<Ts_enumMemberContext> ts_enumMember() {
			return getRuleContexts(Ts_enumMemberContext.class);
		}
		public Ts_enumMemberContext ts_enumMember(int i) {
			return getRuleContext(Ts_enumMemberContext.class,i);
		}
		public TerminalNode RCURLY() { return getToken(TypeScriptParser.RCURLY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(TypeScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TypeScriptParser.COMMA, i);
		}
		public Ts_enumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ts_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterTs_enumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitTs_enumDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitTs_enumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ts_enumDeclarationContext ts_enumDeclaration() throws RecognitionException {
		Ts_enumDeclarationContext _localctx = new Ts_enumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ts_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(ENUM);
			setState(95);
			match(IDENTIFIER);
			setState(96);
			match(LCURLY);
			setState(97);
			ts_enumMember();
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(98);
				match(COMMA);
				setState(99);
				ts_enumMember();
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
			match(RCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Ts_enumMemberContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TypeScriptParser.IDENTIFIER, 0); }
		public Ts_enumMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ts_enumMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterTs_enumMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitTs_enumMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitTs_enumMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ts_enumMemberContext ts_enumMember() throws RecognitionException {
		Ts_enumMemberContext _localctx = new Ts_enumMemberContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ts_enumMember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Ts_classMemberContext extends ParserRuleContext {
		public Ts_variableDeclarationContext ts_variableDeclaration() {
			return getRuleContext(Ts_variableDeclarationContext.class,0);
		}
		public Ts_methodDeclarationContext ts_methodDeclaration() {
			return getRuleContext(Ts_methodDeclarationContext.class,0);
		}
		public Ts_arrowFunctionDeclarationContext ts_arrowFunctionDeclaration() {
			return getRuleContext(Ts_arrowFunctionDeclarationContext.class,0);
		}
		public Ts_classMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ts_classMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterTs_classMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitTs_classMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitTs_classMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ts_classMemberContext ts_classMember() throws RecognitionException {
		Ts_classMemberContext _localctx = new Ts_classMemberContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ts_classMember);
		try {
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				ts_variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				ts_methodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				ts_arrowFunctionDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Ts_variableDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TypeScriptParser.IDENTIFIER, 0); }
		public TerminalNode EQ() { return getToken(TypeScriptParser.EQ, 0); }
		public Ts_valueContext ts_value() {
			return getRuleContext(Ts_valueContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(TypeScriptParser.SEMICOLON, 0); }
		public TerminalNode LET() { return getToken(TypeScriptParser.LET, 0); }
		public TerminalNode COLON() { return getToken(TypeScriptParser.COLON, 0); }
		public Ts_typeWithBracketsContext ts_typeWithBrackets() {
			return getRuleContext(Ts_typeWithBracketsContext.class,0);
		}
		public Ts_variableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ts_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterTs_variableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitTs_variableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitTs_variableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ts_variableDeclarationContext ts_variableDeclaration() throws RecognitionException {
		Ts_variableDeclarationContext _localctx = new Ts_variableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ts_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LET) {
				{
				setState(114);
				match(LET);
				}
			}

			setState(117);
			match(IDENTIFIER);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(118);
				match(COLON);
				setState(119);
				ts_typeWithBrackets();
				}
			}

			setState(122);
			match(EQ);
			setState(123);
			ts_value(0);
			setState(124);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Ts_arrayContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(TypeScriptParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(TypeScriptParser.RBRACK, 0); }
		public List<Ts_valueContext> ts_value() {
			return getRuleContexts(Ts_valueContext.class);
		}
		public Ts_valueContext ts_value(int i) {
			return getRuleContext(Ts_valueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TypeScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TypeScriptParser.COMMA, i);
		}
		public Ts_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ts_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterTs_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitTs_array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitTs_array(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ts_arrayContext ts_array() throws RecognitionException {
		Ts_arrayContext _localctx = new Ts_arrayContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ts_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(LBRACK);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 70187513856L) != 0)) {
				{
				setState(127);
				ts_value(0);
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(128);
					match(COMMA);
					setState(129);
					ts_value(0);
					}
					}
					setState(134);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(137);
			match(RBRACK);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Ts_methodDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TypeScriptParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(TypeScriptParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TypeScriptParser.RPAREN, 0); }
		public TerminalNode LCURLY() { return getToken(TypeScriptParser.LCURLY, 0); }
		public Ts_methodBodyContext ts_methodBody() {
			return getRuleContext(Ts_methodBodyContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(TypeScriptParser.RCURLY, 0); }
		public TerminalNode EQ() { return getToken(TypeScriptParser.EQ, 0); }
		public TerminalNode FUNCTION() { return getToken(TypeScriptParser.FUNCTION, 0); }
		public Ts_parameterListContext ts_parameterList() {
			return getRuleContext(Ts_parameterListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(TypeScriptParser.COLON, 0); }
		public Ts_typeWithBracketsContext ts_typeWithBrackets() {
			return getRuleContext(Ts_typeWithBracketsContext.class,0);
		}
		public Ts_methodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ts_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterTs_methodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitTs_methodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitTs_methodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ts_methodDeclarationContext ts_methodDeclaration() throws RecognitionException {
		Ts_methodDeclarationContext _localctx = new Ts_methodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ts_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(IDENTIFIER);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(140);
				match(EQ);
				setState(141);
				match(FUNCTION);
				}
			}

			setState(144);
			match(LPAREN);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER || _la==SPREAD) {
				{
				setState(145);
				ts_parameterList();
				}
			}

			setState(148);
			match(RPAREN);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(149);
				match(COLON);
				setState(150);
				ts_typeWithBrackets();
				}
			}

			setState(153);
			match(LCURLY);
			setState(154);
			ts_methodBody();
			setState(155);
			match(RCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Ts_methodBodyContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(TypeScriptParser.THIS, 0); }
		public List<TerminalNode> DOT() { return getTokens(TypeScriptParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(TypeScriptParser.DOT, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(TypeScriptParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TypeScriptParser.IDENTIFIER, i);
		}
		public TerminalNode EQ() { return getToken(TypeScriptParser.EQ, 0); }
		public TerminalNode LPAREN() { return getToken(TypeScriptParser.LPAREN, 0); }
		public Ts_valueContext ts_value() {
			return getRuleContext(Ts_valueContext.class,0);
		}
		public TerminalNode AS() { return getToken(TypeScriptParser.AS, 0); }
		public TerminalNode RPAREN() { return getToken(TypeScriptParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(TypeScriptParser.SEMICOLON, 0); }
		public List<Ts_statementContext> ts_statement() {
			return getRuleContexts(Ts_statementContext.class);
		}
		public Ts_statementContext ts_statement(int i) {
			return getRuleContext(Ts_statementContext.class,i);
		}
		public Ts_methodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ts_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterTs_methodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitTs_methodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitTs_methodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ts_methodBodyContext ts_methodBody() throws RecognitionException {
		Ts_methodBodyContext _localctx = new Ts_methodBodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ts_methodBody);
		int _la;
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				match(THIS);
				setState(158);
				match(DOT);
				setState(159);
				match(IDENTIFIER);
				setState(160);
				match(EQ);
				setState(161);
				match(LPAREN);
				setState(162);
				ts_value(0);
				setState(163);
				match(AS);
				setState(164);
				match(IDENTIFIER);
				setState(165);
				match(RPAREN);
				setState(166);
				match(DOT);
				setState(167);
				match(IDENTIFIER);
				setState(168);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8495168L) != 0)) {
					{
					{
					setState(170);
					ts_statement();
					}
					}
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Ts_parameterListContext extends ParserRuleContext {
		public List<Ts_parameterContext> ts_parameter() {
			return getRuleContexts(Ts_parameterContext.class);
		}
		public Ts_parameterContext ts_parameter(int i) {
			return getRuleContext(Ts_parameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TypeScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TypeScriptParser.COMMA, i);
		}
		public Ts_parameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ts_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterTs_parameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitTs_parameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitTs_parameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ts_parameterListContext ts_parameterList() throws RecognitionException {
		Ts_parameterListContext _localctx = new Ts_parameterListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ts_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			ts_parameter();
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(179);
				match(COMMA);
				setState(180);
				ts_parameter();
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Ts_parameterContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TypeScriptParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(TypeScriptParser.COLON, 0); }
		public Ts_typeWithBracketsContext ts_typeWithBrackets() {
			return getRuleContext(Ts_typeWithBracketsContext.class,0);
		}
		public TerminalNode QUESTION_MARK() { return getToken(TypeScriptParser.QUESTION_MARK, 0); }
		public TerminalNode EQ() { return getToken(TypeScriptParser.EQ, 0); }
		public Ts_valueContext ts_value() {
			return getRuleContext(Ts_valueContext.class,0);
		}
		public TerminalNode SPREAD() { return getToken(TypeScriptParser.SPREAD, 0); }
		public Ts_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ts_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterTs_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitTs_parameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitTs_parameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ts_parameterContext ts_parameter() throws RecognitionException {
		Ts_parameterContext _localctx = new Ts_parameterContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ts_parameter);
		int _la;
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				match(IDENTIFIER);
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUESTION_MARK) {
					{
					setState(187);
					match(QUESTION_MARK);
					}
				}

				setState(190);
				match(COLON);
				setState(191);
				ts_typeWithBrackets();
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(192);
					match(EQ);
					setState(193);
					ts_value(0);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPREAD) {
					{
					setState(196);
					match(SPREAD);
					}
				}

				setState(199);
				match(IDENTIFIER);
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(200);
					match(COLON);
					setState(201);
					ts_typeWithBrackets();
					}
				}

				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(204);
					match(EQ);
					setState(205);
					ts_value(0);
					}
				}

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

	@SuppressWarnings("CheckReturnValue")
	public static class Ts_typeWithBracketsContext extends ParserRuleContext {
		public List<TerminalNode> TYPE() { return getTokens(TypeScriptParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(TypeScriptParser.TYPE, i);
		}
		public TerminalNode OR() { return getToken(TypeScriptParser.OR, 0); }
		public TerminalNode NULL() { return getToken(TypeScriptParser.NULL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TypeScriptParser.IDENTIFIER, 0); }
		public TerminalNode LBRACK() { return getToken(TypeScriptParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(TypeScriptParser.RBRACK, 0); }
		public Ts_tupleTypeContext ts_tupleType() {
			return getRuleContext(Ts_tupleTypeContext.class,0);
		}
		public Ts_enumTypeContext ts_enumType() {
			return getRuleContext(Ts_enumTypeContext.class,0);
		}
		public Ts_objectTypeContext ts_objectType() {
			return getRuleContext(Ts_objectTypeContext.class,0);
		}
		public Ts_typeWithBracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ts_typeWithBrackets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterTs_typeWithBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitTs_typeWithBrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitTs_typeWithBrackets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ts_typeWithBracketsContext ts_typeWithBrackets() throws RecognitionException {
		Ts_typeWithBracketsContext _localctx = new Ts_typeWithBracketsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ts_typeWithBrackets);
		try {
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				match(TYPE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				match(TYPE);
				setState(212);
				match(OR);
				setState(213);
				match(NULL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
				match(TYPE);
				setState(215);
				match(OR);
				setState(216);
				match(TYPE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(217);
				match(IDENTIFIER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(218);
				match(TYPE);
				setState(219);
				match(LBRACK);
				setState(220);
				match(RBRACK);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(221);
				ts_tupleType();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(222);
				ts_enumType();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(223);
				ts_objectType();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Ts_objectTypeContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(TypeScriptParser.LCURLY, 0); }
		public List<Ts_objectTypePropertyContext> ts_objectTypeProperty() {
			return getRuleContexts(Ts_objectTypePropertyContext.class);
		}
		public Ts_objectTypePropertyContext ts_objectTypeProperty(int i) {
			return getRuleContext(Ts_objectTypePropertyContext.class,i);
		}
		public TerminalNode RCURLY() { return getToken(TypeScriptParser.RCURLY, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(TypeScriptParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(TypeScriptParser.SEMICOLON, i);
		}
		public Ts_objectTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ts_objectType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterTs_objectType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitTs_objectType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitTs_objectType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ts_objectTypeContext ts_objectType() throws RecognitionException {
		Ts_objectTypeContext _localctx = new Ts_objectTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ts_objectType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(LCURLY);
			setState(227);
			ts_objectTypeProperty();
			setState(232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(228);
					match(SEMICOLON);
					setState(229);
					ts_objectTypeProperty();
					}
					} 
				}
				setState(234);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(235);
				match(SEMICOLON);
				}
			}

			setState(238);
			match(RCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Ts_objectTypePropertyContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TypeScriptParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(TypeScriptParser.COLON, 0); }
		public Ts_typeWithBracketsContext ts_typeWithBrackets() {
			return getRuleContext(Ts_typeWithBracketsContext.class,0);
		}
		public Ts_objectTypePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ts_objectTypeProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterTs_objectTypeProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitTs_objectTypeProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitTs_objectTypeProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ts_objectTypePropertyContext ts_objectTypeProperty() throws RecognitionException {
		Ts_objectTypePropertyContext _localctx = new Ts_objectTypePropertyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ts_objectTypeProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(IDENTIFIER);
			setState(241);
			match(COLON);
			setState(242);
			ts_typeWithBrackets();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Ts_enumTypeContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(TypeScriptParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TypeScriptParser.IDENTIFIER, i);
		}
		public TerminalNode DOT() { return getToken(TypeScriptParser.DOT, 0); }
		public Ts_enumTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ts_enumType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterTs_enumType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitTs_enumType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitTs_enumType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ts_enumTypeContext ts_enumType() throws RecognitionException {
		Ts_enumTypeContext _localctx = new Ts_enumTypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ts_enumType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(IDENTIFIER);
			setState(245);
			match(DOT);
			setState(246);
			match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Ts_tupleTypeContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(TypeScriptParser.LBRACK, 0); }
		public List<Ts_typeWithBracketsContext> ts_typeWithBrackets() {
			return getRuleContexts(Ts_typeWithBracketsContext.class);
		}
		public Ts_typeWithBracketsContext ts_typeWithBrackets(int i) {
			return getRuleContext(Ts_typeWithBracketsContext.class,i);
		}
		public TerminalNode RBRACK() { return getToken(TypeScriptParser.RBRACK, 0); }
		public List<TerminalNode> COMMA() { return getTokens(TypeScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TypeScriptParser.COMMA, i);
		}
		public Ts_tupleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ts_tupleType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterTs_tupleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitTs_tupleType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitTs_tupleType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ts_tupleTypeContext ts_tupleType() throws RecognitionException {
		Ts_tupleTypeContext _localctx = new Ts_tupleTypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ts_tupleType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(LBRACK);
			setState(249);
			ts_typeWithBrackets();
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(250);
				match(COMMA);
				setState(251);
				ts_typeWithBrackets();
				}
				}
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(257);
			match(RBRACK);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Ts_valueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(TypeScriptParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(TypeScriptParser.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(TypeScriptParser.BOOLEAN, 0); }
		public TerminalNode NULL() { return getToken(TypeScriptParser.NULL, 0); }
		public TerminalNode THIS() { return getToken(TypeScriptParser.THIS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TypeScriptParser.IDENTIFIER, 0); }
		public Ts_arrayContext ts_array() {
			return getRuleContext(Ts_arrayContext.class,0);
		}
		public Ts_objectContext ts_object() {
			return getRuleContext(Ts_objectContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(TypeScriptParser.LPAREN, 0); }
		public Ts_expressionContext ts_expression() {
			return getRuleContext(Ts_expressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(TypeScriptParser.RPAREN, 0); }
		public Ts_tupleValueContext ts_tupleValue() {
			return getRuleContext(Ts_tupleValueContext.class,0);
		}
		public Ts_parenthesizedValueContext ts_parenthesizedValue() {
			return getRuleContext(Ts_parenthesizedValueContext.class,0);
		}
		public Ts_methodInvocationContext ts_methodInvocation() {
			return getRuleContext(Ts_methodInvocationContext.class,0);
		}
		public Ts_negationContext ts_negation() {
			return getRuleContext(Ts_negationContext.class,0);
		}
		public Ts_enumTypeContext ts_enumType() {
			return getRuleContext(Ts_enumTypeContext.class,0);
		}
		public Ts_templateStringContext ts_templateString() {
			return getRuleContext(Ts_templateStringContext.class,0);
		}
		public TerminalNode DOT() { return getToken(TypeScriptParser.DOT, 0); }
		public List<Ts_valueContext> ts_value() {
			return getRuleContexts(Ts_valueContext.class);
		}
		public Ts_valueContext ts_value(int i) {
			return getRuleContext(Ts_valueContext.class,i);
		}
		public TerminalNode QUESTION_MARK() { return getToken(TypeScriptParser.QUESTION_MARK, 0); }
		public TerminalNode COLON() { return getToken(TypeScriptParser.COLON, 0); }
		public Ts_argumentListContext ts_argumentList() {
			return getRuleContext(Ts_argumentListContext.class,0);
		}
		public Ts_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ts_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterTs_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitTs_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitTs_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ts_valueContext ts_value() throws RecognitionException {
		return ts_value(0);
	}

	private Ts_valueContext ts_value(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Ts_valueContext _localctx = new Ts_valueContext(_ctx, _parentState);
		Ts_valueContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_ts_value, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(260);
				match(STRING);
				}
				break;
			case 2:
				{
				setState(261);
				match(NUMBER);
				}
				break;
			case 3:
				{
				setState(262);
				match(BOOLEAN);
				}
				break;
			case 4:
				{
				setState(263);
				match(NULL);
				}
				break;
			case 5:
				{
				setState(264);
				match(THIS);
				}
				break;
			case 6:
				{
				setState(265);
				match(IDENTIFIER);
				}
				break;
			case 7:
				{
				setState(266);
				ts_array();
				}
				break;
			case 8:
				{
				setState(267);
				ts_object();
				}
				break;
			case 9:
				{
				setState(268);
				match(LPAREN);
				setState(269);
				ts_expression(0);
				setState(270);
				match(RPAREN);
				}
				break;
			case 10:
				{
				setState(272);
				ts_tupleValue();
				}
				break;
			case 11:
				{
				setState(273);
				ts_parenthesizedValue();
				}
				break;
			case 12:
				{
				setState(274);
				ts_methodInvocation();
				}
				break;
			case 13:
				{
				setState(275);
				ts_negation();
				}
				break;
			case 14:
				{
				setState(276);
				ts_enumType();
				}
				break;
			case 15:
				{
				setState(277);
				ts_templateString();
				}
				break;
			case 16:
				{
				setState(278);
				match(THIS);
				setState(279);
				match(DOT);
				setState(280);
				match(IDENTIFIER);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(299);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(297);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new Ts_valueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_ts_value);
						setState(283);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(284);
						match(QUESTION_MARK);
						setState(285);
						ts_value(0);
						setState(286);
						match(COLON);
						setState(287);
						ts_value(4);
						}
						break;
					case 2:
						{
						_localctx = new Ts_valueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_ts_value);
						setState(289);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(290);
						match(DOT);
						setState(291);
						match(IDENTIFIER);
						setState(292);
						match(LPAREN);
						setState(294);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 70187513856L) != 0)) {
							{
							setState(293);
							ts_argumentList();
							}
						}

						setState(296);
						match(RPAREN);
						}
						break;
					}
					} 
				}
				setState(301);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Ts_arrowFunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TypeScriptParser.IDENTIFIER, 0); }
		public TerminalNode EQ() { return getToken(TypeScriptParser.EQ, 0); }
		public TerminalNode LPAREN() { return getToken(TypeScriptParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TypeScriptParser.RPAREN, 0); }
		public TerminalNode ARROW() { return getToken(TypeScriptParser.ARROW, 0); }
		public TerminalNode SEMICOLON() { return getToken(TypeScriptParser.SEMICOLON, 0); }
		public Ts_parameterListContext ts_parameterList() {
			return getRuleContext(Ts_parameterListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(TypeScriptParser.COLON, 0); }
		public Ts_typeWithBracketsContext ts_typeWithBrackets() {
			return getRuleContext(Ts_typeWithBracketsContext.class,0);
		}
		public List<Ts_valueContext> ts_value() {
			return getRuleContexts(Ts_valueContext.class);
		}
		public Ts_valueContext ts_value(int i) {
			return getRuleContext(Ts_valueContext.class,i);
		}
		public List<TerminalNode> OPERATION() { return getTokens(TypeScriptParser.OPERATION); }
		public TerminalNode OPERATION(int i) {
			return getToken(TypeScriptParser.OPERATION, i);
		}
		public Ts_arrowFunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ts_arrowFunctionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterTs_arrowFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitTs_arrowFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitTs_arrowFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ts_arrowFunctionDeclarationContext ts_arrowFunctionDeclaration() throws RecognitionException {
		Ts_arrowFunctionDeclarationContext _localctx = new Ts_arrowFunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ts_arrowFunctionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(IDENTIFIER);
			setState(303);
			match(EQ);
			setState(304);
			match(LPAREN);
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER || _la==SPREAD) {
				{
				setState(305);
				ts_parameterList();
				}
			}

			setState(308);
			match(RPAREN);
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(309);
				match(COLON);
				setState(310);
				ts_typeWithBrackets();
				}
			}

			setState(313);
			match(ARROW);
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 70187513856L) != 0)) {
				{
				{
				setState(314);
				ts_value(0);
				}
				}
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPERATION) {
				{
				{
				setState(320);
				match(OPERATION);
				setState(321);
				ts_value(0);
				}
				}
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(327);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Ts_templateStringContext extends ParserRuleContext {
		public List<TerminalNode> BACKTICK() { return getTokens(TypeScriptParser.BACKTICK); }
		public TerminalNode BACKTICK(int i) {
			return getToken(TypeScriptParser.BACKTICK, i);
		}
		public List<Ts_templateExpressionContext> ts_templateExpression() {
			return getRuleContexts(Ts_templateExpressionContext.class);
		}
		public Ts_templateExpressionContext ts_templateExpression(int i) {
			return getRuleContext(Ts_templateExpressionContext.class,i);
		}
		public Ts_templateStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ts_templateString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterTs_templateString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitTs_templateString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitTs_templateString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ts_templateStringContext ts_templateString() throws RecognitionException {
		Ts_templateStringContext _localctx = new Ts_templateStringContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ts_templateString);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(BACKTICK);
			setState(334);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(332);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						setState(330);
						ts_templateExpression();
						}
						break;
					case 2:
						{
						setState(331);
						matchWildcard();
						}
						break;
					}
					} 
				}
				setState(336);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			setState(337);
			match(BACKTICK);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Ts_templateExpressionContext extends ParserRuleContext {
		public TerminalNode SDOLER() { return getToken(TypeScriptParser.SDOLER, 0); }
		public TerminalNode LCURLY() { return getToken(TypeScriptParser.LCURLY, 0); }
		public Ts_valueContext ts_value() {
			return getRuleContext(Ts_valueContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(TypeScriptParser.RCURLY, 0); }
		public Ts_templateExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ts_templateExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterTs_templateExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitTs_templateExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitTs_templateExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ts_templateExpressionContext ts_templateExpression() throws RecognitionException {
		Ts_templateExpressionContext _localctx = new Ts_templateExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_ts_templateExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(SDOLER);
			setState(340);
			match(LCURLY);
			setState(341);
			ts_value(0);
			setState(342);
			match(RCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Ts_tupleValueContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(TypeScriptParser.LBRACK, 0); }
		public List<Ts_valueContext> ts_value() {
			return getRuleContexts(Ts_valueContext.class);
		}
		public Ts_valueContext ts_value(int i) {
			return getRuleContext(Ts_valueContext.class,i);
		}
		public TerminalNode RBRACK() { return getToken(TypeScriptParser.RBRACK, 0); }
		public List<TerminalNode> COMMA() { return getTokens(TypeScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TypeScriptParser.COMMA, i);
		}
		public Ts_tupleValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ts_tupleValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterTs_tupleValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitTs_tupleValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitTs_tupleValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ts_tupleValueContext ts_tupleValue() throws RecognitionException {
		Ts_tupleValueContext _localctx = new Ts_tupleValueContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_ts_tupleValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(LBRACK);
			setState(345);
			ts_value(0);
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(346);
				match(COMMA);
				setState(347);
				ts_value(0);
				}
				}
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(353);
			match(RBRACK);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Ts_objectContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(TypeScriptParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(TypeScriptParser.RCURLY, 0); }
		public List<Ts_objectPropertyContext> ts_objectProperty() {
			return getRuleContexts(Ts_objectPropertyContext.class);
		}
		public Ts_objectPropertyContext ts_objectProperty(int i) {
			return getRuleContext(Ts_objectPropertyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TypeScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TypeScriptParser.COMMA, i);
		}
		public Ts_objectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ts_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterTs_object(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitTs_object(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitTs_object(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ts_objectContext ts_object() throws RecognitionException {
		Ts_objectContext _localctx = new Ts_objectContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ts_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(LCURLY);
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(356);
				ts_objectProperty();
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(357);
					match(COMMA);
					setState(358);
					ts_objectProperty();
					}
					}
					setState(363);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(366);
			match(RCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Ts_objectPropertyContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TypeScriptParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(TypeScriptParser.COLON, 0); }
		public Ts_valueContext ts_value() {
			return getRuleContext(Ts_valueContext.class,0);
		}
		public Ts_objectPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ts_objectProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterTs_objectProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitTs_objectProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitTs_objectProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ts_objectPropertyContext ts_objectProperty() throws RecognitionException {
		Ts_objectPropertyContext _localctx = new Ts_objectPropertyContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_ts_objectProperty);
		try {
			setState(372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(368);
				match(IDENTIFIER);
				setState(369);
				match(COLON);
				setState(370);
				ts_value(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(371);
				match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Ts_statementContext extends ParserRuleContext {
		public Ts_variableDeclarationContext ts_variableDeclaration() {
			return getRuleContext(Ts_variableDeclarationContext.class,0);
		}
		public Ts_methodInvocationContext ts_methodInvocation() {
			return getRuleContext(Ts_methodInvocationContext.class,0);
		}
		public Ts_ifStatementContext ts_ifStatement() {
			return getRuleContext(Ts_ifStatementContext.class,0);
		}
		public Ts_assignmentContext ts_assignment() {
			return getRuleContext(Ts_assignmentContext.class,0);
		}
		public Ts_returnStatementContext ts_returnStatement() {
			return getRuleContext(Ts_returnStatementContext.class,0);
		}
		public Ts_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ts_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterTs_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitTs_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitTs_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ts_statementContext ts_statement() throws RecognitionException {
		Ts_statementContext _localctx = new Ts_statementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ts_statement);
		try {
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				ts_variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(375);
				ts_methodInvocation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(376);
				ts_ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(377);
				ts_assignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(378);
				ts_returnStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Ts_returnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(TypeScriptParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(TypeScriptParser.SEMICOLON, 0); }
		public List<Ts_valueContext> ts_value() {
			return getRuleContexts(Ts_valueContext.class);
		}
		public Ts_valueContext ts_value(int i) {
			return getRuleContext(Ts_valueContext.class,i);
		}
		public List<TerminalNode> OPERATION() { return getTokens(TypeScriptParser.OPERATION); }
		public TerminalNode OPERATION(int i) {
			return getToken(TypeScriptParser.OPERATION, i);
		}
		public Ts_returnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ts_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterTs_returnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitTs_returnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitTs_returnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ts_returnStatementContext ts_returnStatement() throws RecognitionException {
		Ts_returnStatementContext _localctx = new Ts_returnStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_ts_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(RETURN);
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 70187513856L) != 0)) {
				{
				{
				setState(382);
				ts_value(0);
				}
				}
				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPERATION) {
				{
				{
				setState(388);
				match(OPERATION);
				setState(389);
				ts_value(0);
				}
				}
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(395);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Ts_methodInvocationContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(TypeScriptParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TypeScriptParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(TypeScriptParser.SEMICOLON, 0); }
		public TerminalNode THIS() { return getToken(TypeScriptParser.THIS, 0); }
		public List<TerminalNode> DOT() { return getTokens(TypeScriptParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(TypeScriptParser.DOT, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(TypeScriptParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TypeScriptParser.IDENTIFIER, i);
		}
		public Ts_argumentListContext ts_argumentList() {
			return getRuleContext(Ts_argumentListContext.class,0);
		}
		public Ts_methodInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ts_methodInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterTs_methodInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitTs_methodInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitTs_methodInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ts_methodInvocationContext ts_methodInvocation() throws RecognitionException {
		Ts_methodInvocationContext _localctx = new Ts_methodInvocationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_ts_methodInvocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THIS:
				{
				setState(397);
				match(THIS);
				setState(398);
				match(DOT);
				setState(399);
				match(IDENTIFIER);
				}
				break;
			case IDENTIFIER:
				{
				setState(400);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(403);
				match(DOT);
				setState(404);
				match(IDENTIFIER);
				}
				}
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(410);
			match(LPAREN);
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 70187513856L) != 0)) {
				{
				setState(411);
				ts_argumentList();
				}
			}

			setState(414);
			match(RPAREN);
			setState(415);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Ts_argumentListContext extends ParserRuleContext {
		public List<Ts_valueContext> ts_value() {
			return getRuleContexts(Ts_valueContext.class);
		}
		public Ts_valueContext ts_value(int i) {
			return getRuleContext(Ts_valueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TypeScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TypeScriptParser.COMMA, i);
		}
		public Ts_argumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ts_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterTs_argumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitTs_argumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitTs_argumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ts_argumentListContext ts_argumentList() throws RecognitionException {
		Ts_argumentListContext _localctx = new Ts_argumentListContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_ts_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			ts_value(0);
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(418);
				match(COMMA);
				setState(419);
				ts_value(0);
				}
				}
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Ts_negationContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(TypeScriptParser.NOT, 0); }
		public Ts_valueContext ts_value() {
			return getRuleContext(Ts_valueContext.class,0);
		}
		public Ts_negationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ts_negation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterTs_negation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitTs_negation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitTs_negation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ts_negationContext ts_negation() throws RecognitionException {
		Ts_negationContext _localctx = new Ts_negationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_ts_negation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			match(NOT);
			setState(426);
			ts_value(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Ts_ifStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(TypeScriptParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(TypeScriptParser.LPAREN, 0); }
		public Ts_exContext ts_ex() {
			return getRuleContext(Ts_exContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(TypeScriptParser.RPAREN, 0); }
		public List<TerminalNode> LCURLY() { return getTokens(TypeScriptParser.LCURLY); }
		public TerminalNode LCURLY(int i) {
			return getToken(TypeScriptParser.LCURLY, i);
		}
		public List<TerminalNode> RCURLY() { return getTokens(TypeScriptParser.RCURLY); }
		public TerminalNode RCURLY(int i) {
			return getToken(TypeScriptParser.RCURLY, i);
		}
		public List<Ts_statementContext> ts_statement() {
			return getRuleContexts(Ts_statementContext.class);
		}
		public Ts_statementContext ts_statement(int i) {
			return getRuleContext(Ts_statementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(TypeScriptParser.ELSE, 0); }
		public Ts_ifStatementContext ts_ifStatement() {
			return getRuleContext(Ts_ifStatementContext.class,0);
		}
		public Ts_ifStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ts_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterTs_ifStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitTs_ifStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitTs_ifStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ts_ifStatementContext ts_ifStatement() throws RecognitionException {
		Ts_ifStatementContext _localctx = new Ts_ifStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_ts_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(IF);
			setState(429);
			match(LPAREN);
			setState(430);
			ts_ex();
			setState(431);
			match(RPAREN);
			setState(432);
			match(LCURLY);
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8495168L) != 0)) {
				{
				{
				setState(433);
				ts_statement();
				}
				}
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(439);
			match(RCURLY);
			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(440);
				match(ELSE);
				setState(450);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
					{
					setState(441);
					ts_ifStatement();
					}
					break;
				case LCURLY:
					{
					setState(442);
					match(LCURLY);
					setState(446);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8495168L) != 0)) {
						{
						{
						setState(443);
						ts_statement();
						}
						}
						setState(448);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(449);
					match(RCURLY);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Ts_exContext extends ParserRuleContext {
		public Ts_expressionContext ts_expression() {
			return getRuleContext(Ts_expressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(TypeScriptParser.NOT, 0); }
		public Ts_exContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ts_ex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterTs_ex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitTs_ex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitTs_ex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ts_exContext ts_ex() throws RecognitionException {
		Ts_exContext _localctx = new Ts_exContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_ts_ex);
		try {
			setState(457);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(454);
				ts_expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(455);
				match(NOT);
				setState(456);
				ts_expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Ts_expressionContext extends ParserRuleContext {
		public List<Ts_valueContext> ts_value() {
			return getRuleContexts(Ts_valueContext.class);
		}
		public Ts_valueContext ts_value(int i) {
			return getRuleContext(Ts_valueContext.class,i);
		}
		public Ts_methodInvocationContext ts_methodInvocation() {
			return getRuleContext(Ts_methodInvocationContext.class,0);
		}
		public Ts_p1Context ts_p1() {
			return getRuleContext(Ts_p1Context.class,0);
		}
		public TerminalNode COMPARISON_OPERATOR() { return getToken(TypeScriptParser.COMPARISON_OPERATOR, 0); }
		public TerminalNode QUESTION_MARK() { return getToken(TypeScriptParser.QUESTION_MARK, 0); }
		public TerminalNode COLON() { return getToken(TypeScriptParser.COLON, 0); }
		public List<Ts_expressionContext> ts_expression() {
			return getRuleContexts(Ts_expressionContext.class);
		}
		public Ts_expressionContext ts_expression(int i) {
			return getRuleContext(Ts_expressionContext.class,i);
		}
		public TerminalNode LOGICAL_OPERATOR() { return getToken(TypeScriptParser.LOGICAL_OPERATOR, 0); }
		public Ts_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ts_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterTs_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitTs_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitTs_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ts_expressionContext ts_expression() throws RecognitionException {
		return ts_expression(0);
	}

	private Ts_expressionContext ts_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Ts_expressionContext _localctx = new Ts_expressionContext(_ctx, _parentState);
		Ts_expressionContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_ts_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(460);
				ts_value(0);
				}
				break;
			case 2:
				{
				setState(461);
				ts_methodInvocation();
				}
				break;
			case 3:
				{
				setState(462);
				ts_p1();
				}
				break;
			case 4:
				{
				setState(463);
				ts_value(0);
				setState(464);
				match(COMPARISON_OPERATOR);
				setState(465);
				ts_value(0);
				}
				break;
			case 5:
				{
				setState(467);
				ts_value(0);
				setState(470);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(468);
					match(COMPARISON_OPERATOR);
					setState(469);
					ts_value(0);
					}
					break;
				}
				}
				break;
			case 6:
				{
				setState(472);
				ts_value(0);
				setState(473);
				match(QUESTION_MARK);
				setState(474);
				ts_value(0);
				setState(475);
				match(COLON);
				setState(476);
				ts_value(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(485);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Ts_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_ts_expression);
					setState(480);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(481);
					match(LOGICAL_OPERATOR);
					setState(482);
					ts_expression(3);
					}
					} 
				}
				setState(487);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Ts_p1Context extends ParserRuleContext {
		public List<Ts_valueContext> ts_value() {
			return getRuleContexts(Ts_valueContext.class);
		}
		public Ts_valueContext ts_value(int i) {
			return getRuleContext(Ts_valueContext.class,i);
		}
		public TerminalNode EQ() { return getToken(TypeScriptParser.EQ, 0); }
		public TerminalNode COMPARISON_OPERATOR() { return getToken(TypeScriptParser.COMPARISON_OPERATOR, 0); }
		public Ts_p1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ts_p1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterTs_p1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitTs_p1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitTs_p1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ts_p1Context ts_p1() throws RecognitionException {
		Ts_p1Context _localctx = new Ts_p1Context(_ctx, getState());
		enterRule(_localctx, 66, RULE_ts_p1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			ts_value(0);
			setState(492);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(489);
				match(EQ);
				}
				break;
			case 2:
				{
				setState(490);
				match(COMPARISON_OPERATOR);
				setState(491);
				ts_value(0);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Ts_assignmentContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(TypeScriptParser.EQ, 0); }
		public Ts_expressionContext ts_expression() {
			return getRuleContext(Ts_expressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(TypeScriptParser.SEMICOLON, 0); }
		public TerminalNode THIS() { return getToken(TypeScriptParser.THIS, 0); }
		public List<TerminalNode> DOT() { return getTokens(TypeScriptParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(TypeScriptParser.DOT, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(TypeScriptParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TypeScriptParser.IDENTIFIER, i);
		}
		public Ts_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ts_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterTs_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitTs_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitTs_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ts_assignmentContext ts_assignment() throws RecognitionException {
		Ts_assignmentContext _localctx = new Ts_assignmentContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_ts_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THIS:
				{
				setState(494);
				match(THIS);
				setState(495);
				match(DOT);
				setState(496);
				match(IDENTIFIER);
				}
				break;
			case IDENTIFIER:
				{
				setState(497);
				match(IDENTIFIER);
				setState(502);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(498);
					match(DOT);
					setState(499);
					match(IDENTIFIER);
					}
					}
					setState(504);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(507);
			match(EQ);
			setState(508);
			ts_expression(0);
			setState(509);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Ts_parenthesizedValueContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(TypeScriptParser.LPAREN, 0); }
		public Ts_valueContext ts_value() {
			return getRuleContext(Ts_valueContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(TypeScriptParser.RPAREN, 0); }
		public Ts_parenthesizedValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ts_parenthesizedValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterTs_parenthesizedValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitTs_parenthesizedValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitTs_parenthesizedValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ts_parenthesizedValueContext ts_parenthesizedValue() throws RecognitionException {
		Ts_parenthesizedValueContext _localctx = new Ts_parenthesizedValueContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_ts_parenthesizedValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			match(LPAREN);
			setState(512);
			ts_value(0);
			setState(513);
			match(RPAREN);
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
		case 18:
			return ts_value_sempred((Ts_valueContext)_localctx, predIndex);
		case 32:
			return ts_expression_sempred((Ts_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean ts_value_sempred(Ts_valueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean ts_expression_sempred(Ts_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001-\u0204\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0001\u0000\u0004\u0000J\b\u0000\u000b\u0000\f\u0000K\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0005\u0002V\b\u0002\n\u0002\f\u0002Y\t\u0002\u0001\u0003"+
		"\u0001\u0003\u0003\u0003]\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004e\b\u0004\n\u0004\f\u0004"+
		"h\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006q\b\u0006\u0001\u0007\u0003\u0007"+
		"t\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007y\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0005\b\u0083\b\b\n\b\f\b\u0086\t\b\u0003\b\u0088\b\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0003\t\u008f\b\t\u0001\t\u0001\t\u0003\t\u0093"+
		"\b\t\u0001\t\u0001\t\u0001\t\u0003\t\u0098\b\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00ac\b\n\n"+
		"\n\f\n\u00af\t\n\u0003\n\u00b1\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0005\u000b\u00b6\b\u000b\n\u000b\f\u000b\u00b9\t\u000b\u0001\f\u0001"+
		"\f\u0003\f\u00bd\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00c3\b\f"+
		"\u0001\f\u0003\f\u00c6\b\f\u0001\f\u0001\f\u0001\f\u0003\f\u00cb\b\f\u0001"+
		"\f\u0001\f\u0003\f\u00cf\b\f\u0003\f\u00d1\b\f\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u00e1\b\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0005\u000e\u00e7\b\u000e\n\u000e\f\u000e\u00ea\t\u000e\u0001"+
		"\u000e\u0003\u000e\u00ed\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00fd"+
		"\b\u0011\n\u0011\f\u0011\u0100\t\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u011a\b\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0127\b\u0012"+
		"\u0001\u0012\u0005\u0012\u012a\b\u0012\n\u0012\f\u0012\u012d\t\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0133\b\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0138\b\u0013\u0001\u0013\u0001"+
		"\u0013\u0005\u0013\u013c\b\u0013\n\u0013\f\u0013\u013f\t\u0013\u0001\u0013"+
		"\u0001\u0013\u0005\u0013\u0143\b\u0013\n\u0013\f\u0013\u0146\t\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u014d"+
		"\b\u0014\n\u0014\f\u0014\u0150\t\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0005\u0016\u015d\b\u0016\n\u0016\f\u0016\u0160"+
		"\t\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0005\u0017\u0168\b\u0017\n\u0017\f\u0017\u016b\t\u0017\u0003\u0017"+
		"\u016d\b\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0003\u0018\u0175\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0003\u0019\u017c\b\u0019\u0001\u001a\u0001\u001a"+
		"\u0005\u001a\u0180\b\u001a\n\u001a\f\u001a\u0183\t\u001a\u0001\u001a\u0001"+
		"\u001a\u0005\u001a\u0187\b\u001a\n\u001a\f\u001a\u018a\t\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b"+
		"\u0192\b\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u0196\b\u001b\n\u001b"+
		"\f\u001b\u0199\t\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u019d\b\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0005\u001c\u01a5\b\u001c\n\u001c\f\u001c\u01a8\t\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0005\u001e\u01b3\b\u001e\n\u001e\f\u001e\u01b6\t\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e"+
		"\u01bd\b\u001e\n\u001e\f\u001e\u01c0\t\u001e\u0001\u001e\u0003\u001e\u01c3"+
		"\b\u001e\u0003\u001e\u01c5\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0003\u001f\u01ca\b\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0003 \u01d7\b \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0003 \u01df\b \u0001 \u0001 \u0001 \u0005 \u01e4\b \n"+
		" \f \u01e7\t \u0001!\u0001!\u0001!\u0001!\u0003!\u01ed\b!\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0005\"\u01f5\b\"\n\"\f\"\u01f8\t\""+
		"\u0003\"\u01fa\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0000\u0002$@$\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF\u0000"+
		"\u0000\u0235\u0000I\u0001\u0000\u0000\u0000\u0002M\u0001\u0000\u0000\u0000"+
		"\u0004W\u0001\u0000\u0000\u0000\u0006\\\u0001\u0000\u0000\u0000\b^\u0001"+
		"\u0000\u0000\u0000\nk\u0001\u0000\u0000\u0000\fp\u0001\u0000\u0000\u0000"+
		"\u000es\u0001\u0000\u0000\u0000\u0010~\u0001\u0000\u0000\u0000\u0012\u008b"+
		"\u0001\u0000\u0000\u0000\u0014\u00b0\u0001\u0000\u0000\u0000\u0016\u00b2"+
		"\u0001\u0000\u0000\u0000\u0018\u00d0\u0001\u0000\u0000\u0000\u001a\u00e0"+
		"\u0001\u0000\u0000\u0000\u001c\u00e2\u0001\u0000\u0000\u0000\u001e\u00f0"+
		"\u0001\u0000\u0000\u0000 \u00f4\u0001\u0000\u0000\u0000\"\u00f8\u0001"+
		"\u0000\u0000\u0000$\u0119\u0001\u0000\u0000\u0000&\u012e\u0001\u0000\u0000"+
		"\u0000(\u0149\u0001\u0000\u0000\u0000*\u0153\u0001\u0000\u0000\u0000,"+
		"\u0158\u0001\u0000\u0000\u0000.\u0163\u0001\u0000\u0000\u00000\u0174\u0001"+
		"\u0000\u0000\u00002\u017b\u0001\u0000\u0000\u00004\u017d\u0001\u0000\u0000"+
		"\u00006\u0191\u0001\u0000\u0000\u00008\u01a1\u0001\u0000\u0000\u0000:"+
		"\u01a9\u0001\u0000\u0000\u0000<\u01ac\u0001\u0000\u0000\u0000>\u01c9\u0001"+
		"\u0000\u0000\u0000@\u01de\u0001\u0000\u0000\u0000B\u01e8\u0001\u0000\u0000"+
		"\u0000D\u01f9\u0001\u0000\u0000\u0000F\u01ff\u0001\u0000\u0000\u0000H"+
		"J\u0003\u0002\u0001\u0000IH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000"+
		"\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000L\u0001\u0001"+
		"\u0000\u0000\u0000MN\u0005\u0004\u0000\u0000NO\u0005\u0005\u0000\u0000"+
		"OP\u0005\u0017\u0000\u0000PQ\u0005\u001a\u0000\u0000QR\u0003\u0004\u0002"+
		"\u0000RS\u0005\u001b\u0000\u0000S\u0003\u0001\u0000\u0000\u0000TV\u0003"+
		"\u0006\u0003\u0000UT\u0001\u0000\u0000\u0000VY\u0001\u0000\u0000\u0000"+
		"WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000X\u0005\u0001\u0000"+
		"\u0000\u0000YW\u0001\u0000\u0000\u0000Z]\u0003\b\u0004\u0000[]\u0003\f"+
		"\u0006\u0000\\Z\u0001\u0000\u0000\u0000\\[\u0001\u0000\u0000\u0000]\u0007"+
		"\u0001\u0000\u0000\u0000^_\u0005\u0007\u0000\u0000_`\u0005\u0017\u0000"+
		"\u0000`a\u0005\u001a\u0000\u0000af\u0003\n\u0005\u0000bc\u0005\"\u0000"+
		"\u0000ce\u0003\n\u0005\u0000db\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000"+
		"\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gi\u0001\u0000"+
		"\u0000\u0000hf\u0001\u0000\u0000\u0000ij\u0005\u001b\u0000\u0000j\t\u0001"+
		"\u0000\u0000\u0000kl\u0005\u0017\u0000\u0000l\u000b\u0001\u0000\u0000"+
		"\u0000mq\u0003\u000e\u0007\u0000nq\u0003\u0012\t\u0000oq\u0003&\u0013"+
		"\u0000pm\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000po\u0001\u0000"+
		"\u0000\u0000q\r\u0001\u0000\u0000\u0000rt\u0005\u000f\u0000\u0000sr\u0001"+
		"\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000"+
		"ux\u0005\u0017\u0000\u0000vw\u0005 \u0000\u0000wy\u0003\u001a\r\u0000"+
		"xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000"+
		"\u0000z{\u0005)\u0000\u0000{|\u0003$\u0012\u0000|}\u0005!\u0000\u0000"+
		"}\u000f\u0001\u0000\u0000\u0000~\u0087\u0005\u001e\u0000\u0000\u007f\u0084"+
		"\u0003$\u0012\u0000\u0080\u0081\u0005\"\u0000\u0000\u0081\u0083\u0003"+
		"$\u0012\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0083\u0086\u0001\u0000"+
		"\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000"+
		"\u0000\u0000\u0085\u0088\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000"+
		"\u0000\u0000\u0087\u007f\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000"+
		"\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008a\u0005\u001f"+
		"\u0000\u0000\u008a\u0011\u0001\u0000\u0000\u0000\u008b\u008e\u0005\u0017"+
		"\u0000\u0000\u008c\u008d\u0005)\u0000\u0000\u008d\u008f\u0005\t\u0000"+
		"\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000"+
		"\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0092\u0005\u001c\u0000"+
		"\u0000\u0091\u0093\u0003\u0016\u000b\u0000\u0092\u0091\u0001\u0000\u0000"+
		"\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000"+
		"\u0000\u0094\u0097\u0005\u001d\u0000\u0000\u0095\u0096\u0005 \u0000\u0000"+
		"\u0096\u0098\u0003\u001a\r\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0097"+
		"\u0098\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099"+
		"\u009a\u0005\u001a\u0000\u0000\u009a\u009b\u0003\u0014\n\u0000\u009b\u009c"+
		"\u0005\u001b\u0000\u0000\u009c\u0013\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\u0005\r\u0000\u0000\u009e\u009f\u0005*\u0000\u0000\u009f\u00a0\u0005"+
		"\u0017\u0000\u0000\u00a0\u00a1\u0005)\u0000\u0000\u00a1\u00a2\u0005\u001c"+
		"\u0000\u0000\u00a2\u00a3\u0003$\u0012\u0000\u00a3\u00a4\u0005\b\u0000"+
		"\u0000\u00a4\u00a5\u0005\u0017\u0000\u0000\u00a5\u00a6\u0005\u001d\u0000"+
		"\u0000\u00a6\u00a7\u0005*\u0000\u0000\u00a7\u00a8\u0005\u0017\u0000\u0000"+
		"\u00a8\u00a9\u0005!\u0000\u0000\u00a9\u00b1\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ac\u00032\u0019\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ac\u00af"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae"+
		"\u0001\u0000\u0000\u0000\u00ae\u00b1\u0001\u0000\u0000\u0000\u00af\u00ad"+
		"\u0001\u0000\u0000\u0000\u00b0\u009d\u0001\u0000\u0000\u0000\u00b0\u00ad"+
		"\u0001\u0000\u0000\u0000\u00b1\u0015\u0001\u0000\u0000\u0000\u00b2\u00b7"+
		"\u0003\u0018\f\u0000\u00b3\u00b4\u0005\"\u0000\u0000\u00b4\u00b6\u0003"+
		"\u0018\f\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b6\u00b9\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000"+
		"\u0000\u0000\u00b8\u0017\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bc\u0005\u0017\u0000\u0000\u00bb\u00bd\u0005&\u0000"+
		"\u0000\u00bc\u00bb\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000"+
		"\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00bf\u0005 \u0000\u0000"+
		"\u00bf\u00c2\u0003\u001a\r\u0000\u00c0\u00c1\u0005)\u0000\u0000\u00c1"+
		"\u00c3\u0003$\u0012\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c3"+
		"\u0001\u0000\u0000\u0000\u00c3\u00d1\u0001\u0000\u0000\u0000\u00c4\u00c6"+
		"\u0005\'\u0000\u0000\u00c5\u00c4\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00ca\u0005"+
		"\u0017\u0000\u0000\u00c8\u00c9\u0005 \u0000\u0000\u00c9\u00cb\u0003\u001a"+
		"\r\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000"+
		"\u0000\u00cb\u00ce\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005)\u0000\u0000"+
		"\u00cd\u00cf\u0003$\u0012\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce"+
		"\u00cf\u0001\u0000\u0000\u0000\u00cf\u00d1\u0001\u0000\u0000\u0000\u00d0"+
		"\u00ba\u0001\u0000\u0000\u0000\u00d0\u00c5\u0001\u0000\u0000\u0000\u00d1"+
		"\u0019\u0001\u0000\u0000\u0000\u00d2\u00e1\u0005\u0011\u0000\u0000\u00d3"+
		"\u00d4\u0005\u0011\u0000\u0000\u00d4\u00d5\u0005(\u0000\u0000\u00d5\u00e1"+
		"\u0005\f\u0000\u0000\u00d6\u00d7\u0005\u0011\u0000\u0000\u00d7\u00d8\u0005"+
		"(\u0000\u0000\u00d8\u00e1\u0005\u0011\u0000\u0000\u00d9\u00e1\u0005\u0017"+
		"\u0000\u0000\u00da\u00db\u0005\u0011\u0000\u0000\u00db\u00dc\u0005\u001e"+
		"\u0000\u0000\u00dc\u00e1\u0005\u001f\u0000\u0000\u00dd\u00e1\u0003\"\u0011"+
		"\u0000\u00de\u00e1\u0003 \u0010\u0000\u00df\u00e1\u0003\u001c\u000e\u0000"+
		"\u00e0\u00d2\u0001\u0000\u0000\u0000\u00e0\u00d3\u0001\u0000\u0000\u0000"+
		"\u00e0\u00d6\u0001\u0000\u0000\u0000\u00e0\u00d9\u0001\u0000\u0000\u0000"+
		"\u00e0\u00da\u0001\u0000\u0000\u0000\u00e0\u00dd\u0001\u0000\u0000\u0000"+
		"\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0\u00df\u0001\u0000\u0000\u0000"+
		"\u00e1\u001b\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005\u001a\u0000\u0000"+
		"\u00e3\u00e8\u0003\u001e\u000f\u0000\u00e4\u00e5\u0005!\u0000\u0000\u00e5"+
		"\u00e7\u0003\u001e\u000f\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e7"+
		"\u00ea\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e8"+
		"\u00e9\u0001\u0000\u0000\u0000\u00e9\u00ec\u0001\u0000\u0000\u0000\u00ea"+
		"\u00e8\u0001\u0000\u0000\u0000\u00eb\u00ed\u0005!\u0000\u0000\u00ec\u00eb"+
		"\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00ee"+
		"\u0001\u0000\u0000\u0000\u00ee\u00ef\u0005\u001b\u0000\u0000\u00ef\u001d"+
		"\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005\u0017\u0000\u0000\u00f1\u00f2"+
		"\u0005 \u0000\u0000\u00f2\u00f3\u0003\u001a\r\u0000\u00f3\u001f\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f5\u0005\u0017\u0000\u0000\u00f5\u00f6\u0005"+
		"*\u0000\u0000\u00f6\u00f7\u0005\u0017\u0000\u0000\u00f7!\u0001\u0000\u0000"+
		"\u0000\u00f8\u00f9\u0005\u001e\u0000\u0000\u00f9\u00fe\u0003\u001a\r\u0000"+
		"\u00fa\u00fb\u0005\"\u0000\u0000\u00fb\u00fd\u0003\u001a\r\u0000\u00fc"+
		"\u00fa\u0001\u0000\u0000\u0000\u00fd\u0100\u0001\u0000\u0000\u0000\u00fe"+
		"\u00fc\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff"+
		"\u0101\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0101"+
		"\u0102\u0005\u001f\u0000\u0000\u0102#\u0001\u0000\u0000\u0000\u0103\u0104"+
		"\u0006\u0012\uffff\uffff\u0000\u0104\u011a\u0005\u0018\u0000\u0000\u0105"+
		"\u011a\u0005\u0019\u0000\u0000\u0106\u011a\u0005\u000b\u0000\u0000\u0107"+
		"\u011a\u0005\f\u0000\u0000\u0108\u011a\u0005\r\u0000\u0000\u0109\u011a"+
		"\u0005\u0017\u0000\u0000\u010a\u011a\u0003\u0010\b\u0000\u010b\u011a\u0003"+
		".\u0017\u0000\u010c\u010d\u0005\u001c\u0000\u0000\u010d\u010e\u0003@ "+
		"\u0000\u010e\u010f\u0005\u001d\u0000\u0000\u010f\u011a\u0001\u0000\u0000"+
		"\u0000\u0110\u011a\u0003,\u0016\u0000\u0111\u011a\u0003F#\u0000\u0112"+
		"\u011a\u00036\u001b\u0000\u0113\u011a\u0003:\u001d\u0000\u0114\u011a\u0003"+
		" \u0010\u0000\u0115\u011a\u0003(\u0014\u0000\u0116\u0117\u0005\r\u0000"+
		"\u0000\u0117\u0118\u0005*\u0000\u0000\u0118\u011a\u0005\u0017\u0000\u0000"+
		"\u0119\u0103\u0001\u0000\u0000\u0000\u0119\u0105\u0001\u0000\u0000\u0000"+
		"\u0119\u0106\u0001\u0000\u0000\u0000\u0119\u0107\u0001\u0000\u0000\u0000"+
		"\u0119\u0108\u0001\u0000\u0000\u0000\u0119\u0109\u0001\u0000\u0000\u0000"+
		"\u0119\u010a\u0001\u0000\u0000\u0000\u0119\u010b\u0001\u0000\u0000\u0000"+
		"\u0119\u010c\u0001\u0000\u0000\u0000\u0119\u0110\u0001\u0000\u0000\u0000"+
		"\u0119\u0111\u0001\u0000\u0000\u0000\u0119\u0112\u0001\u0000\u0000\u0000"+
		"\u0119\u0113\u0001\u0000\u0000\u0000\u0119\u0114\u0001\u0000\u0000\u0000"+
		"\u0119\u0115\u0001\u0000\u0000\u0000\u0119\u0116\u0001\u0000\u0000\u0000"+
		"\u011a\u012b\u0001\u0000\u0000\u0000\u011b\u011c\n\u0003\u0000\u0000\u011c"+
		"\u011d\u0005&\u0000\u0000\u011d\u011e\u0003$\u0012\u0000\u011e\u011f\u0005"+
		" \u0000\u0000\u011f\u0120\u0003$\u0012\u0004\u0120\u012a\u0001\u0000\u0000"+
		"\u0000\u0121\u0122\n\u0001\u0000\u0000\u0122\u0123\u0005*\u0000\u0000"+
		"\u0123\u0124\u0005\u0017\u0000\u0000\u0124\u0126\u0005\u001c\u0000\u0000"+
		"\u0125\u0127\u00038\u001c\u0000\u0126\u0125\u0001\u0000\u0000\u0000\u0126"+
		"\u0127\u0001\u0000\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128"+
		"\u012a\u0005\u001d\u0000\u0000\u0129\u011b\u0001\u0000\u0000\u0000\u0129"+
		"\u0121\u0001\u0000\u0000\u0000\u012a\u012d\u0001\u0000\u0000\u0000\u012b"+
		"\u0129\u0001\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000\u012c"+
		"%\u0001\u0000\u0000\u0000\u012d\u012b\u0001\u0000\u0000\u0000\u012e\u012f"+
		"\u0005\u0017\u0000\u0000\u012f\u0130\u0005)\u0000\u0000\u0130\u0132\u0005"+
		"\u001c\u0000\u0000\u0131\u0133\u0003\u0016\u000b\u0000\u0132\u0131\u0001"+
		"\u0000\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133\u0134\u0001"+
		"\u0000\u0000\u0000\u0134\u0137\u0005\u001d\u0000\u0000\u0135\u0136\u0005"+
		" \u0000\u0000\u0136\u0138\u0003\u001a\r\u0000\u0137\u0135\u0001\u0000"+
		"\u0000\u0000\u0137\u0138\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000"+
		"\u0000\u0000\u0139\u013d\u0005#\u0000\u0000\u013a\u013c\u0003$\u0012\u0000"+
		"\u013b\u013a\u0001\u0000\u0000\u0000\u013c\u013f\u0001\u0000\u0000\u0000"+
		"\u013d\u013b\u0001\u0000\u0000\u0000\u013d\u013e\u0001\u0000\u0000\u0000"+
		"\u013e\u0144\u0001\u0000\u0000\u0000\u013f\u013d\u0001\u0000\u0000\u0000"+
		"\u0140\u0141\u0005\u0014\u0000\u0000\u0141\u0143\u0003$\u0012\u0000\u0142"+
		"\u0140\u0001\u0000\u0000\u0000\u0143\u0146\u0001\u0000\u0000\u0000\u0144"+
		"\u0142\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145"+
		"\u0147\u0001\u0000\u0000\u0000\u0146\u0144\u0001\u0000\u0000\u0000\u0147"+
		"\u0148\u0005!\u0000\u0000\u0148\'\u0001\u0000\u0000\u0000\u0149\u014e"+
		"\u0005$\u0000\u0000\u014a\u014d\u0003*\u0015\u0000\u014b\u014d\t\u0000"+
		"\u0000\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014c\u014b\u0001\u0000"+
		"\u0000\u0000\u014d\u0150\u0001\u0000\u0000\u0000\u014e\u014c\u0001\u0000"+
		"\u0000\u0000\u014e\u014f\u0001\u0000\u0000\u0000\u014f\u0151\u0001\u0000"+
		"\u0000\u0000\u0150\u014e\u0001\u0000\u0000\u0000\u0151\u0152\u0005$\u0000"+
		"\u0000\u0152)\u0001\u0000\u0000\u0000\u0153\u0154\u0005%\u0000\u0000\u0154"+
		"\u0155\u0005\u001a\u0000\u0000\u0155\u0156\u0003$\u0012\u0000\u0156\u0157"+
		"\u0005\u001b\u0000\u0000\u0157+\u0001\u0000\u0000\u0000\u0158\u0159\u0005"+
		"\u001e\u0000\u0000\u0159\u015e\u0003$\u0012\u0000\u015a\u015b\u0005\""+
		"\u0000\u0000\u015b\u015d\u0003$\u0012\u0000\u015c\u015a\u0001\u0000\u0000"+
		"\u0000\u015d\u0160\u0001\u0000\u0000\u0000\u015e\u015c\u0001\u0000\u0000"+
		"\u0000\u015e\u015f\u0001\u0000\u0000\u0000\u015f\u0161\u0001\u0000\u0000"+
		"\u0000\u0160\u015e\u0001\u0000\u0000\u0000\u0161\u0162\u0005\u001f\u0000"+
		"\u0000\u0162-\u0001\u0000\u0000\u0000\u0163\u016c\u0005\u001a\u0000\u0000"+
		"\u0164\u0169\u00030\u0018\u0000\u0165\u0166\u0005\"\u0000\u0000\u0166"+
		"\u0168\u00030\u0018\u0000\u0167\u0165\u0001\u0000\u0000\u0000\u0168\u016b"+
		"\u0001\u0000\u0000\u0000\u0169\u0167\u0001\u0000\u0000\u0000\u0169\u016a"+
		"\u0001\u0000\u0000\u0000\u016a\u016d\u0001\u0000\u0000\u0000\u016b\u0169"+
		"\u0001\u0000\u0000\u0000\u016c\u0164\u0001\u0000\u0000\u0000\u016c\u016d"+
		"\u0001\u0000\u0000\u0000\u016d\u016e\u0001\u0000\u0000\u0000\u016e\u016f"+
		"\u0005\u001b\u0000\u0000\u016f/\u0001\u0000\u0000\u0000\u0170\u0171\u0005"+
		"\u0017\u0000\u0000\u0171\u0172\u0005 \u0000\u0000\u0172\u0175\u0003$\u0012"+
		"\u0000\u0173\u0175\u0005\u0017\u0000\u0000\u0174\u0170\u0001\u0000\u0000"+
		"\u0000\u0174\u0173\u0001\u0000\u0000\u0000\u01751\u0001\u0000\u0000\u0000"+
		"\u0176\u017c\u0003\u000e\u0007\u0000\u0177\u017c\u00036\u001b\u0000\u0178"+
		"\u017c\u0003<\u001e\u0000\u0179\u017c\u0003D\"\u0000\u017a\u017c\u0003"+
		"4\u001a\u0000\u017b\u0176\u0001\u0000\u0000\u0000\u017b\u0177\u0001\u0000"+
		"\u0000\u0000\u017b\u0178\u0001\u0000\u0000\u0000\u017b\u0179\u0001\u0000"+
		"\u0000\u0000\u017b\u017a\u0001\u0000\u0000\u0000\u017c3\u0001\u0000\u0000"+
		"\u0000\u017d\u0181\u0005\u0010\u0000\u0000\u017e\u0180\u0003$\u0012\u0000"+
		"\u017f\u017e\u0001\u0000\u0000\u0000\u0180\u0183\u0001\u0000\u0000\u0000"+
		"\u0181\u017f\u0001\u0000\u0000\u0000\u0181\u0182\u0001\u0000\u0000\u0000"+
		"\u0182\u0188\u0001\u0000\u0000\u0000\u0183\u0181\u0001\u0000\u0000\u0000"+
		"\u0184\u0185\u0005\u0014\u0000\u0000\u0185\u0187\u0003$\u0012\u0000\u0186"+
		"\u0184\u0001\u0000\u0000\u0000\u0187\u018a\u0001\u0000\u0000\u0000\u0188"+
		"\u0186\u0001\u0000\u0000\u0000\u0188\u0189\u0001\u0000\u0000\u0000\u0189"+
		"\u018b\u0001\u0000\u0000\u0000\u018a\u0188\u0001\u0000\u0000\u0000\u018b"+
		"\u018c\u0005!\u0000\u0000\u018c5\u0001\u0000\u0000\u0000\u018d\u018e\u0005"+
		"\r\u0000\u0000\u018e\u018f\u0005*\u0000\u0000\u018f\u0192\u0005\u0017"+
		"\u0000\u0000\u0190\u0192\u0005\u0017\u0000\u0000\u0191\u018d\u0001\u0000"+
		"\u0000\u0000\u0191\u0190\u0001\u0000\u0000\u0000\u0192\u0197\u0001\u0000"+
		"\u0000\u0000\u0193\u0194\u0005*\u0000\u0000\u0194\u0196\u0005\u0017\u0000"+
		"\u0000\u0195\u0193\u0001\u0000\u0000\u0000\u0196\u0199\u0001\u0000\u0000"+
		"\u0000\u0197\u0195\u0001\u0000\u0000\u0000\u0197\u0198\u0001\u0000\u0000"+
		"\u0000\u0198\u019a\u0001\u0000\u0000\u0000\u0199\u0197\u0001\u0000\u0000"+
		"\u0000\u019a\u019c\u0005\u001c\u0000\u0000\u019b\u019d\u00038\u001c\u0000"+
		"\u019c\u019b\u0001\u0000\u0000\u0000\u019c\u019d\u0001\u0000\u0000\u0000"+
		"\u019d\u019e\u0001\u0000\u0000\u0000\u019e\u019f\u0005\u001d\u0000\u0000"+
		"\u019f\u01a0\u0005!\u0000\u0000\u01a07\u0001\u0000\u0000\u0000\u01a1\u01a6"+
		"\u0003$\u0012\u0000\u01a2\u01a3\u0005\"\u0000\u0000\u01a3\u01a5\u0003"+
		"$\u0012\u0000\u01a4\u01a2\u0001\u0000\u0000\u0000\u01a5\u01a8\u0001\u0000"+
		"\u0000\u0000\u01a6\u01a4\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001\u0000"+
		"\u0000\u0000\u01a79\u0001\u0000\u0000\u0000\u01a8\u01a6\u0001\u0000\u0000"+
		"\u0000\u01a9\u01aa\u0005\u000e\u0000\u0000\u01aa\u01ab\u0003$\u0012\u0000"+
		"\u01ab;\u0001\u0000\u0000\u0000\u01ac\u01ad\u0005\u0006\u0000\u0000\u01ad"+
		"\u01ae\u0005\u001c\u0000\u0000\u01ae\u01af\u0003>\u001f\u0000\u01af\u01b0"+
		"\u0005\u001d\u0000\u0000\u01b0\u01b4\u0005\u001a\u0000\u0000\u01b1\u01b3"+
		"\u00032\u0019\u0000\u01b2\u01b1\u0001\u0000\u0000\u0000\u01b3\u01b6\u0001"+
		"\u0000\u0000\u0000\u01b4\u01b2\u0001\u0000\u0000\u0000\u01b4\u01b5\u0001"+
		"\u0000\u0000\u0000\u01b5\u01b7\u0001\u0000\u0000\u0000\u01b6\u01b4\u0001"+
		"\u0000\u0000\u0000\u01b7\u01c4\u0005\u001b\u0000\u0000\u01b8\u01c2\u0005"+
		"\u0001\u0000\u0000\u01b9\u01c3\u0003<\u001e\u0000\u01ba\u01be\u0005\u001a"+
		"\u0000\u0000\u01bb\u01bd\u00032\u0019\u0000\u01bc\u01bb\u0001\u0000\u0000"+
		"\u0000\u01bd\u01c0\u0001\u0000\u0000\u0000\u01be\u01bc\u0001\u0000\u0000"+
		"\u0000\u01be\u01bf\u0001\u0000\u0000\u0000\u01bf\u01c1\u0001\u0000\u0000"+
		"\u0000\u01c0\u01be\u0001\u0000\u0000\u0000\u01c1\u01c3\u0005\u001b\u0000"+
		"\u0000\u01c2\u01b9\u0001\u0000\u0000\u0000\u01c2\u01ba\u0001\u0000\u0000"+
		"\u0000\u01c3\u01c5\u0001\u0000\u0000\u0000\u01c4\u01b8\u0001\u0000\u0000"+
		"\u0000\u01c4\u01c5\u0001\u0000\u0000\u0000\u01c5=\u0001\u0000\u0000\u0000"+
		"\u01c6\u01ca\u0003@ \u0000\u01c7\u01c8\u0005\u000e\u0000\u0000\u01c8\u01ca"+
		"\u0003@ \u0000\u01c9\u01c6\u0001\u0000\u0000\u0000\u01c9\u01c7\u0001\u0000"+
		"\u0000\u0000\u01ca?\u0001\u0000\u0000\u0000\u01cb\u01cc\u0006 \uffff\uffff"+
		"\u0000\u01cc\u01df\u0003$\u0012\u0000\u01cd\u01df\u00036\u001b\u0000\u01ce"+
		"\u01df\u0003B!\u0000\u01cf\u01d0\u0003$\u0012\u0000\u01d0\u01d1\u0005"+
		"\u0015\u0000\u0000\u01d1\u01d2\u0003$\u0012\u0000\u01d2\u01df\u0001\u0000"+
		"\u0000\u0000\u01d3\u01d6\u0003$\u0012\u0000\u01d4\u01d5\u0005\u0015\u0000"+
		"\u0000\u01d5\u01d7\u0003$\u0012\u0000\u01d6\u01d4\u0001\u0000\u0000\u0000"+
		"\u01d6\u01d7\u0001\u0000\u0000\u0000\u01d7\u01df\u0001\u0000\u0000\u0000"+
		"\u01d8\u01d9\u0003$\u0012\u0000\u01d9\u01da\u0005&\u0000\u0000\u01da\u01db"+
		"\u0003$\u0012\u0000\u01db\u01dc\u0005 \u0000\u0000\u01dc\u01dd\u0003$"+
		"\u0012\u0000\u01dd\u01df\u0001\u0000\u0000\u0000\u01de\u01cb\u0001\u0000"+
		"\u0000\u0000\u01de\u01cd\u0001\u0000\u0000\u0000\u01de\u01ce\u0001\u0000"+
		"\u0000\u0000\u01de\u01cf\u0001\u0000\u0000\u0000\u01de\u01d3\u0001\u0000"+
		"\u0000\u0000\u01de\u01d8\u0001\u0000\u0000\u0000\u01df\u01e5\u0001\u0000"+
		"\u0000\u0000\u01e0\u01e1\n\u0002\u0000\u0000\u01e1\u01e2\u0005\u0016\u0000"+
		"\u0000\u01e2\u01e4\u0003@ \u0003\u01e3\u01e0\u0001\u0000\u0000\u0000\u01e4"+
		"\u01e7\u0001\u0000\u0000\u0000\u01e5\u01e3\u0001\u0000\u0000\u0000\u01e5"+
		"\u01e6\u0001\u0000\u0000\u0000\u01e6A\u0001\u0000\u0000\u0000\u01e7\u01e5"+
		"\u0001\u0000\u0000\u0000\u01e8\u01ec\u0003$\u0012\u0000\u01e9\u01ed\u0005"+
		")\u0000\u0000\u01ea\u01eb\u0005\u0015\u0000\u0000\u01eb\u01ed\u0003$\u0012"+
		"\u0000\u01ec\u01e9\u0001\u0000\u0000\u0000\u01ec\u01ea\u0001\u0000\u0000"+
		"\u0000\u01ec\u01ed\u0001\u0000\u0000\u0000\u01edC\u0001\u0000\u0000\u0000"+
		"\u01ee\u01ef\u0005\r\u0000\u0000\u01ef\u01f0\u0005*\u0000\u0000\u01f0"+
		"\u01fa\u0005\u0017\u0000\u0000\u01f1\u01f6\u0005\u0017\u0000\u0000\u01f2"+
		"\u01f3\u0005*\u0000\u0000\u01f3\u01f5\u0005\u0017\u0000\u0000\u01f4\u01f2"+
		"\u0001\u0000\u0000\u0000\u01f5\u01f8\u0001\u0000\u0000\u0000\u01f6\u01f4"+
		"\u0001\u0000\u0000\u0000\u01f6\u01f7\u0001\u0000\u0000\u0000\u01f7\u01fa"+
		"\u0001\u0000\u0000\u0000\u01f8\u01f6\u0001\u0000\u0000\u0000\u01f9\u01ee"+
		"\u0001\u0000\u0000\u0000\u01f9\u01f1\u0001\u0000\u0000\u0000\u01fa\u01fb"+
		"\u0001\u0000\u0000\u0000\u01fb\u01fc\u0005)\u0000\u0000\u01fc\u01fd\u0003"+
		"@ \u0000\u01fd\u01fe\u0005!\u0000\u0000\u01feE\u0001\u0000\u0000\u0000"+
		"\u01ff\u0200\u0005\u001c\u0000\u0000\u0200\u0201\u0003$\u0012\u0000\u0201"+
		"\u0202\u0005\u001d\u0000\u0000\u0202G\u0001\u0000\u0000\u00009KW\\fps"+
		"x\u0084\u0087\u008e\u0092\u0097\u00ad\u00b0\u00b7\u00bc\u00c2\u00c5\u00ca"+
		"\u00ce\u00d0\u00e0\u00e8\u00ec\u00fe\u0119\u0126\u0129\u012b\u0132\u0137"+
		"\u013d\u0144\u014c\u014e\u015e\u0169\u016c\u0174\u017b\u0181\u0188\u0191"+
		"\u0197\u019c\u01a6\u01b4\u01be\u01c2\u01c4\u01c9\u01d6\u01de\u01e5\u01ec"+
		"\u01f6\u01f9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}