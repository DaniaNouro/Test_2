// Generated from E:/My_project_compiler/Test_2/src/antlr/IntegrationParser.g4 by ANTLR 4.13.2
package src.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class IntegrationParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NG_DIRECTIVES=1, PROPERTY_BINDING=2, TWO_WAY_BINDING=3, ANGULAR_SYMBOLS=4, 
		INTERPOLATION_START=5, EVENT_BINDING_START=6, EVENT_BINDING_END=7, HTML_COMMENT=8, 
		HTML_CONDITIONAL_COMMENT=9, XML=10, CDATA=11, DTD=12, SCRIPTLET=13, SEA_WS=14, 
		SCRIPT_OPEN=15, STYLE_OPEN=16, TAG_OPEN=17, HTML_TEXT=18, ANGULAR_OPERATOR=19, 
		ANGULAR_LITERAL=20, INTERPOLATION_END=21, IDENTIFIER=22, STRING=23, NUMBER=24, 
		NG_ATTRBIUTE=25, SINGLE_QOUTE=26, ID=27, IN=28, TAG_CLOSE=29, TAG_SLASH_CLOSE=30, 
		TAG_SLASH=31, TAG_EQUALS=32, TAG_NAME=33, TAG_WHITESPACE=34, SCRIPT_BODY=35, 
		SCRIPT_SHORT_BODY=36, STYLE_BODY=37, STYLE_SHORT_BODY=38, ATTVALUE_VALUE=39, 
		ATTRIBUTE=40;
	public static final int
		RULE_htmlDocument = 0, RULE_htmlElement = 1, RULE_htmlContent = 2, RULE_tagName = 3, 
		RULE_attribute = 4, RULE_angularDirective = 5, RULE_angularExpression = 6, 
		RULE_angularInterpolation = 7, RULE_binding = 8, RULE_interpolation = 9, 
		RULE_propertyBinding = 10, RULE_eventBinding = 11, RULE_twoWayBinding = 12, 
		RULE_expression = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"htmlDocument", "htmlElement", "htmlContent", "tagName", "attribute", 
			"angularDirective", "angularExpression", "angularInterpolation", "binding", 
			"interpolation", "propertyBinding", "eventBinding", "twoWayBinding", 
			"expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'{{'", "'('", "')'", null, null, null, 
			null, null, null, null, null, null, "'<'", null, null, null, "'}}'", 
			null, null, null, "'!'", "'''", "'x'", "'in'", "'>'", "'/>'", "'/'", 
			"'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NG_DIRECTIVES", "PROPERTY_BINDING", "TWO_WAY_BINDING", "ANGULAR_SYMBOLS", 
			"INTERPOLATION_START", "EVENT_BINDING_START", "EVENT_BINDING_END", "HTML_COMMENT", 
			"HTML_CONDITIONAL_COMMENT", "XML", "CDATA", "DTD", "SCRIPTLET", "SEA_WS", 
			"SCRIPT_OPEN", "STYLE_OPEN", "TAG_OPEN", "HTML_TEXT", "ANGULAR_OPERATOR", 
			"ANGULAR_LITERAL", "INTERPOLATION_END", "IDENTIFIER", "STRING", "NUMBER", 
			"NG_ATTRBIUTE", "SINGLE_QOUTE", "ID", "IN", "TAG_CLOSE", "TAG_SLASH_CLOSE", 
			"TAG_SLASH", "TAG_EQUALS", "TAG_NAME", "TAG_WHITESPACE", "SCRIPT_BODY", 
			"SCRIPT_SHORT_BODY", "STYLE_BODY", "STYLE_SHORT_BODY", "ATTVALUE_VALUE", 
			"ATTRIBUTE"
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
	public String getGrammarFileName() { return "IntegrationParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public IntegrationParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlDocumentContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(IntegrationParser.EOF, 0); }
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public HtmlDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlDocument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntegrationParserListener ) ((IntegrationParserListener)listener).enterHtmlDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntegrationParserListener ) ((IntegrationParserListener)listener).exitHtmlDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegrationParserVisitor ) return ((IntegrationParserVisitor<? extends T>)visitor).visitHtmlDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlDocumentContext htmlDocument() throws RecognitionException {
		HtmlDocumentContext _localctx = new HtmlDocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_htmlDocument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(28);
				htmlElement();
				}
				}
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TAG_OPEN );
			setState(33);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementContext extends ParserRuleContext {
		public List<TerminalNode> TAG_OPEN() { return getTokens(IntegrationParser.TAG_OPEN); }
		public TerminalNode TAG_OPEN(int i) {
			return getToken(IntegrationParser.TAG_OPEN, i);
		}
		public List<TagNameContext> tagName() {
			return getRuleContexts(TagNameContext.class);
		}
		public TagNameContext tagName(int i) {
			return getRuleContext(TagNameContext.class,i);
		}
		public List<TerminalNode> TAG_CLOSE() { return getTokens(IntegrationParser.TAG_CLOSE); }
		public TerminalNode TAG_CLOSE(int i) {
			return getToken(IntegrationParser.TAG_CLOSE, i);
		}
		public TerminalNode TAG_SLASH() { return getToken(IntegrationParser.TAG_SLASH, 0); }
		public TerminalNode TAG_SLASH_CLOSE() { return getToken(IntegrationParser.TAG_SLASH_CLOSE, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntegrationParserListener ) ((IntegrationParserListener)listener).enterHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntegrationParserListener ) ((IntegrationParserListener)listener).exitHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegrationParserVisitor ) return ((IntegrationParserVisitor<? extends T>)visitor).visitHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_htmlElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(TAG_OPEN);
			setState(36);
			tagName();
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EVENT_BINDING_START || _la==TAG_NAME) {
				{
				{
				setState(37);
				attribute();
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG_CLOSE:
				{
				setState(43);
				match(TAG_CLOSE);
				setState(45);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(44);
					htmlContent();
					}
					break;
				}
				setState(47);
				match(TAG_OPEN);
				setState(48);
				match(TAG_SLASH);
				setState(49);
				tagName();
				setState(50);
				match(TAG_CLOSE);
				}
				break;
			case TAG_SLASH_CLOSE:
				{
				setState(52);
				match(TAG_SLASH_CLOSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class HtmlContentContext extends ParserRuleContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public InterpolationContext interpolation() {
			return getRuleContext(InterpolationContext.class,0);
		}
		public TerminalNode HTML_TEXT() { return getToken(IntegrationParser.HTML_TEXT, 0); }
		public HtmlContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntegrationParserListener ) ((IntegrationParserListener)listener).enterHtmlContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntegrationParserListener ) ((IntegrationParserListener)listener).exitHtmlContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegrationParserVisitor ) return ((IntegrationParserVisitor<? extends T>)visitor).visitHtmlContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContentContext htmlContent() throws RecognitionException {
		HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_htmlContent);
		try {
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				htmlElement();
				}
				break;
			case INTERPOLATION_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				interpolation();
				}
				break;
			case HTML_TEXT:
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				match(HTML_TEXT);
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
	public static class TagNameContext extends ParserRuleContext {
		public TerminalNode TAG_NAME() { return getToken(IntegrationParser.TAG_NAME, 0); }
		public TagNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntegrationParserListener ) ((IntegrationParserListener)listener).enterTagName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntegrationParserListener ) ((IntegrationParserListener)listener).exitTagName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegrationParserVisitor ) return ((IntegrationParserVisitor<? extends T>)visitor).visitTagName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagNameContext tagName() throws RecognitionException {
		TagNameContext _localctx = new TagNameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tagName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(TAG_NAME);
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
	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode TAG_NAME() { return getToken(IntegrationParser.TAG_NAME, 0); }
		public TerminalNode TAG_EQUALS() { return getToken(IntegrationParser.TAG_EQUALS, 0); }
		public TerminalNode ATTVALUE_VALUE() { return getToken(IntegrationParser.ATTVALUE_VALUE, 0); }
		public EventBindingContext eventBinding() {
			return getRuleContext(EventBindingContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntegrationParserListener ) ((IntegrationParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntegrationParserListener ) ((IntegrationParserListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegrationParserVisitor ) return ((IntegrationParserVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_attribute);
		int _la;
		try {
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				match(TAG_NAME);
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TAG_EQUALS) {
					{
					setState(63);
					match(TAG_EQUALS);
					setState(64);
					match(ATTVALUE_VALUE);
					}
				}

				}
				break;
			case EVENT_BINDING_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				eventBinding();
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
	public static class AngularDirectiveContext extends ParserRuleContext {
		public TerminalNode NG_DIRECTIVES() { return getToken(IntegrationParser.NG_DIRECTIVES, 0); }
		public TerminalNode TAG_EQUALS() { return getToken(IntegrationParser.TAG_EQUALS, 0); }
		public AngularExpressionContext angularExpression() {
			return getRuleContext(AngularExpressionContext.class,0);
		}
		public AngularDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_angularDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntegrationParserListener ) ((IntegrationParserListener)listener).enterAngularDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntegrationParserListener ) ((IntegrationParserListener)listener).exitAngularDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegrationParserVisitor ) return ((IntegrationParserVisitor<? extends T>)visitor).visitAngularDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AngularDirectiveContext angularDirective() throws RecognitionException {
		AngularDirectiveContext _localctx = new AngularDirectiveContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_angularDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(NG_DIRECTIVES);
			setState(71);
			match(TAG_EQUALS);
			setState(72);
			angularExpression();
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
	public static class AngularExpressionContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(IntegrationParser.STRING, 0); }
		public AngularExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_angularExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntegrationParserListener ) ((IntegrationParserListener)listener).enterAngularExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntegrationParserListener ) ((IntegrationParserListener)listener).exitAngularExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegrationParserVisitor ) return ((IntegrationParserVisitor<? extends T>)visitor).visitAngularExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AngularExpressionContext angularExpression() throws RecognitionException {
		AngularExpressionContext _localctx = new AngularExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_angularExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(STRING);
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
	public static class AngularInterpolationContext extends ParserRuleContext {
		public TerminalNode INTERPOLATION_START() { return getToken(IntegrationParser.INTERPOLATION_START, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INTERPOLATION_END() { return getToken(IntegrationParser.INTERPOLATION_END, 0); }
		public AngularInterpolationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_angularInterpolation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntegrationParserListener ) ((IntegrationParserListener)listener).enterAngularInterpolation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntegrationParserListener ) ((IntegrationParserListener)listener).exitAngularInterpolation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegrationParserVisitor ) return ((IntegrationParserVisitor<? extends T>)visitor).visitAngularInterpolation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AngularInterpolationContext angularInterpolation() throws RecognitionException {
		AngularInterpolationContext _localctx = new AngularInterpolationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_angularInterpolation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(INTERPOLATION_START);
			setState(77);
			expression();
			setState(78);
			match(INTERPOLATION_END);
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
	public static class BindingContext extends ParserRuleContext {
		public PropertyBindingContext propertyBinding() {
			return getRuleContext(PropertyBindingContext.class,0);
		}
		public EventBindingContext eventBinding() {
			return getRuleContext(EventBindingContext.class,0);
		}
		public TwoWayBindingContext twoWayBinding() {
			return getRuleContext(TwoWayBindingContext.class,0);
		}
		public BindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntegrationParserListener ) ((IntegrationParserListener)listener).enterBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntegrationParserListener ) ((IntegrationParserListener)listener).exitBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegrationParserVisitor ) return ((IntegrationParserVisitor<? extends T>)visitor).visitBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BindingContext binding() throws RecognitionException {
		BindingContext _localctx = new BindingContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_binding);
		try {
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROPERTY_BINDING:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				propertyBinding();
				}
				break;
			case EVENT_BINDING_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				eventBinding();
				}
				break;
			case TWO_WAY_BINDING:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				twoWayBinding();
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
	public static class InterpolationContext extends ParserRuleContext {
		public TerminalNode INTERPOLATION_START() { return getToken(IntegrationParser.INTERPOLATION_START, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INTERPOLATION_END() { return getToken(IntegrationParser.INTERPOLATION_END, 0); }
		public InterpolationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntegrationParserListener ) ((IntegrationParserListener)listener).enterInterpolation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntegrationParserListener ) ((IntegrationParserListener)listener).exitInterpolation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegrationParserVisitor ) return ((IntegrationParserVisitor<? extends T>)visitor).visitInterpolation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterpolationContext interpolation() throws RecognitionException {
		InterpolationContext _localctx = new InterpolationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_interpolation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(INTERPOLATION_START);
			setState(86);
			expression();
			setState(87);
			match(INTERPOLATION_END);
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
	public static class PropertyBindingContext extends ParserRuleContext {
		public TerminalNode PROPERTY_BINDING() { return getToken(IntegrationParser.PROPERTY_BINDING, 0); }
		public PropertyBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyBinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntegrationParserListener ) ((IntegrationParserListener)listener).enterPropertyBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntegrationParserListener ) ((IntegrationParserListener)listener).exitPropertyBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegrationParserVisitor ) return ((IntegrationParserVisitor<? extends T>)visitor).visitPropertyBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyBindingContext propertyBinding() throws RecognitionException {
		PropertyBindingContext _localctx = new PropertyBindingContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_propertyBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(PROPERTY_BINDING);
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
	public static class EventBindingContext extends ParserRuleContext {
		public TerminalNode EVENT_BINDING_START() { return getToken(IntegrationParser.EVENT_BINDING_START, 0); }
		public TerminalNode IDENTIFIER() { return getToken(IntegrationParser.IDENTIFIER, 0); }
		public TerminalNode EVENT_BINDING_END() { return getToken(IntegrationParser.EVENT_BINDING_END, 0); }
		public EventBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventBinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntegrationParserListener ) ((IntegrationParserListener)listener).enterEventBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntegrationParserListener ) ((IntegrationParserListener)listener).exitEventBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegrationParserVisitor ) return ((IntegrationParserVisitor<? extends T>)visitor).visitEventBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventBindingContext eventBinding() throws RecognitionException {
		EventBindingContext _localctx = new EventBindingContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_eventBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(EVENT_BINDING_START);
			setState(92);
			match(IDENTIFIER);
			setState(93);
			match(EVENT_BINDING_END);
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
	public static class TwoWayBindingContext extends ParserRuleContext {
		public TerminalNode TWO_WAY_BINDING() { return getToken(IntegrationParser.TWO_WAY_BINDING, 0); }
		public TwoWayBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_twoWayBinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntegrationParserListener ) ((IntegrationParserListener)listener).enterTwoWayBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntegrationParserListener ) ((IntegrationParserListener)listener).exitTwoWayBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegrationParserVisitor ) return ((IntegrationParserVisitor<? extends T>)visitor).visitTwoWayBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TwoWayBindingContext twoWayBinding() throws RecognitionException {
		TwoWayBindingContext _localctx = new TwoWayBindingContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_twoWayBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(TWO_WAY_BINDING);
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
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(IntegrationParser.IDENTIFIER, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntegrationParserListener ) ((IntegrationParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntegrationParserListener ) ((IntegrationParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegrationParserVisitor ) return ((IntegrationParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
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

	public static final String _serializedATN =
		"\u0004\u0001(d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007"+
		"\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002\f\u0007"+
		"\f\u0002\r\u0007\r\u0001\u0000\u0004\u0000\u001e\b\u0000\u000b\u0000\f"+
		"\u0000\u001f\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001\'\b\u0001\n\u0001\f\u0001*\t\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001.\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u00016\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002;\b\u0002\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004B\b\u0004\u0001\u0004\u0003\u0004"+
		"E\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0003\bT\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0000\u0000\u000e\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u0000\u0000_\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0002#\u0001\u0000\u0000\u0000\u0004:\u0001\u0000\u0000\u0000"+
		"\u0006<\u0001\u0000\u0000\u0000\bD\u0001\u0000\u0000\u0000\nF\u0001\u0000"+
		"\u0000\u0000\fJ\u0001\u0000\u0000\u0000\u000eL\u0001\u0000\u0000\u0000"+
		"\u0010S\u0001\u0000\u0000\u0000\u0012U\u0001\u0000\u0000\u0000\u0014Y"+
		"\u0001\u0000\u0000\u0000\u0016[\u0001\u0000\u0000\u0000\u0018_\u0001\u0000"+
		"\u0000\u0000\u001aa\u0001\u0000\u0000\u0000\u001c\u001e\u0003\u0002\u0001"+
		"\u0000\u001d\u001c\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000"+
		"\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000"+
		" !\u0001\u0000\u0000\u0000!\"\u0005\u0000\u0000\u0001\"\u0001\u0001\u0000"+
		"\u0000\u0000#$\u0005\u0011\u0000\u0000$(\u0003\u0006\u0003\u0000%\'\u0003"+
		"\b\u0004\u0000&%\u0001\u0000\u0000\u0000\'*\u0001\u0000\u0000\u0000(&"+
		"\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)5\u0001\u0000\u0000"+
		"\u0000*(\u0001\u0000\u0000\u0000+-\u0005\u001d\u0000\u0000,.\u0003\u0004"+
		"\u0002\u0000-,\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000./\u0001"+
		"\u0000\u0000\u0000/0\u0005\u0011\u0000\u000001\u0005\u001f\u0000\u0000"+
		"12\u0003\u0006\u0003\u000023\u0005\u001d\u0000\u000036\u0001\u0000\u0000"+
		"\u000046\u0005\u001e\u0000\u00005+\u0001\u0000\u0000\u000054\u0001\u0000"+
		"\u0000\u00006\u0003\u0001\u0000\u0000\u00007;\u0003\u0002\u0001\u0000"+
		"8;\u0003\u0012\t\u00009;\u0005\u0012\u0000\u0000:7\u0001\u0000\u0000\u0000"+
		":8\u0001\u0000\u0000\u0000:9\u0001\u0000\u0000\u0000;\u0005\u0001\u0000"+
		"\u0000\u0000<=\u0005!\u0000\u0000=\u0007\u0001\u0000\u0000\u0000>A\u0005"+
		"!\u0000\u0000?@\u0005 \u0000\u0000@B\u0005\'\u0000\u0000A?\u0001\u0000"+
		"\u0000\u0000AB\u0001\u0000\u0000\u0000BE\u0001\u0000\u0000\u0000CE\u0003"+
		"\u0016\u000b\u0000D>\u0001\u0000\u0000\u0000DC\u0001\u0000\u0000\u0000"+
		"E\t\u0001\u0000\u0000\u0000FG\u0005\u0001\u0000\u0000GH\u0005 \u0000\u0000"+
		"HI\u0003\f\u0006\u0000I\u000b\u0001\u0000\u0000\u0000JK\u0005\u0017\u0000"+
		"\u0000K\r\u0001\u0000\u0000\u0000LM\u0005\u0005\u0000\u0000MN\u0003\u001a"+
		"\r\u0000NO\u0005\u0015\u0000\u0000O\u000f\u0001\u0000\u0000\u0000PT\u0003"+
		"\u0014\n\u0000QT\u0003\u0016\u000b\u0000RT\u0003\u0018\f\u0000SP\u0001"+
		"\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000SR\u0001\u0000\u0000\u0000"+
		"T\u0011\u0001\u0000\u0000\u0000UV\u0005\u0005\u0000\u0000VW\u0003\u001a"+
		"\r\u0000WX\u0005\u0015\u0000\u0000X\u0013\u0001\u0000\u0000\u0000YZ\u0005"+
		"\u0002\u0000\u0000Z\u0015\u0001\u0000\u0000\u0000[\\\u0005\u0006\u0000"+
		"\u0000\\]\u0005\u0016\u0000\u0000]^\u0005\u0007\u0000\u0000^\u0017\u0001"+
		"\u0000\u0000\u0000_`\u0005\u0003\u0000\u0000`\u0019\u0001\u0000\u0000"+
		"\u0000ab\u0005\u0016\u0000\u0000b\u001b\u0001\u0000\u0000\u0000\b\u001f"+
		"(-5:ADS";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}