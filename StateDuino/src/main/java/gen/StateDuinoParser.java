// Generated from C:/Users/danie/Desktop/StateDuino/src/main/java/gen/StateDuino.g4 by ANTLR 4.13.1
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class StateDuinoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, STATE=2, STATEMACHINE=3, ONENTRY=4, ONREPEAT=5, ONEXIT=6, TRANSITIONS=7, 
		CHANGESTATE=8, NUMBER=9, BOOL=10, BREAK=11, CASE=12, CONST=13, ELSE=14, 
		ELSEIF=15, ENUM=16, FOR=17, IF=18, RETURN=19, WHILE=20, SWITCH=21, VOID=22, 
		DIGITALREAD=23, DIGITALWRITE=24, ANALOGREAD=25, ANALOGWRITE=26, HIGH=27, 
		LOW=28, DELAY=29, FUNCTION=30, DEFAULT=31, STRING_LITERAL=32, NUMBER_LITERAL=33, 
		BOOL_LITERAL=34, ID=35, LPAREN=36, RPAREN=37, LBRACE=38, RBRACE=39, LBRACK=40, 
		RBRACK=41, SEMI=42, COMMA=43, DOT=44, GT=45, LT=46, NOT=47, QUESTION=48, 
		COLON=49, EQUAL=50, LE=51, GE=52, NOTEQUAL=53, XOR=54, AND=55, OR=56, 
		INC=57, DEC=58, ADD=59, SUB=60, MUL=61, DIV=62, CARET=63, MOD=64, ADD_ASSIGN=65, 
		SUB_ASSIGN=66, ASSIGN=67, WS=68, COMMENT=69, LINE_COMMENT=70;
	public static final int
		RULE_prog = 0, RULE_stateMachine = 1, RULE_state = 2, RULE_stateBody = 3, 
		RULE_onEntry = 4, RULE_onRepeat = 5, RULE_onExit = 6, RULE_transitions = 7, 
		RULE_function = 8, RULE_statement = 9, RULE_ifStatement = 10, RULE_switchStatement = 11, 
		RULE_caseStatement = 12, RULE_defaultCaseStatement = 13, RULE_forStatement = 14, 
		RULE_whileStatement = 15, RULE_functionNames = 16, RULE_expression = 17, 
		RULE_declaration = 18, RULE_values = 19, RULE_unary = 20, RULE_binary = 21, 
		RULE_arithmetic = 22, RULE_logical = 23, RULE_typeSpecifier = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stateMachine", "state", "stateBody", "onEntry", "onRepeat", 
			"onExit", "transitions", "function", "statement", "ifStatement", "switchStatement", 
			"caseStatement", "defaultCaseStatement", "forStatement", "whileStatement", 
			"functionNames", "expression", "declaration", "values", "unary", "binary", 
			"arithmetic", "logical", "typeSpecifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'char'", "'state'", "'stateMachine'", "'onEntry'", "'onRepeat'", 
			"'onExit'", "'transitions'", "'changeState'", "'number'", "'bool'", "'break'", 
			"'case'", "'const'", "'else'", "'else if'", "'enum'", "'for'", "'if'", 
			"'return'", "'while'", "'switch'", "'void'", "'digitalRead'", "'digitalWrite'", 
			"'analogRead'", "'analogWrite'", "'HIGH'", "'LOW'", "'delay'", "'function'", 
			"'default'", null, null, null, null, "'('", "')'", "'{'", "'}'", "'['", 
			"']'", "';'", "','", "'.'", "'>'", "'<'", "'!'", "'?'", "':'", "'=='", 
			"'<='", "'>='", "'!='", "'XOR'", null, null, "'++'", "'--'", "'+'", "'-'", 
			"'*'", "'/'", "'^'", "'%'", "'+='", "'-='", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "STATE", "STATEMACHINE", "ONENTRY", "ONREPEAT", "ONEXIT", 
			"TRANSITIONS", "CHANGESTATE", "NUMBER", "BOOL", "BREAK", "CASE", "CONST", 
			"ELSE", "ELSEIF", "ENUM", "FOR", "IF", "RETURN", "WHILE", "SWITCH", "VOID", 
			"DIGITALREAD", "DIGITALWRITE", "ANALOGREAD", "ANALOGWRITE", "HIGH", "LOW", 
			"DELAY", "FUNCTION", "DEFAULT", "STRING_LITERAL", "NUMBER_LITERAL", "BOOL_LITERAL", 
			"ID", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", 
			"COMMA", "DOT", "GT", "LT", "NOT", "QUESTION", "COLON", "EQUAL", "LE", 
			"GE", "NOTEQUAL", "XOR", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", 
			"DIV", "CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", "ASSIGN", "WS", "COMMENT", 
			"LINE_COMMENT"
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
	public String getGrammarFileName() { return "StateDuino.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public StateDuinoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public StateMachineContext stateMachine() {
			return getRuleContext(StateMachineContext.class,0);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateDuinoListener ) ((StateDuinoListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateDuinoListener ) ((StateDuinoListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateDuinoVisitor ) return ((StateDuinoVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(50);
				function();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			stateMachine();
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
	public static class StateMachineContext extends ParserRuleContext {
		public TerminalNode STATEMACHINE() { return getToken(StateDuinoParser.STATEMACHINE, 0); }
		public TerminalNode ID() { return getToken(StateDuinoParser.ID, 0); }
		public TerminalNode LBRACE() { return getToken(StateDuinoParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(StateDuinoParser.RBRACE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(StateDuinoParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(StateDuinoParser.SEMI, i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<StateContext> state() {
			return getRuleContexts(StateContext.class);
		}
		public StateContext state(int i) {
			return getRuleContext(StateContext.class,i);
		}
		public StateMachineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateMachine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateDuinoListener ) ((StateDuinoListener)listener).enterStateMachine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateDuinoListener ) ((StateDuinoListener)listener).exitStateMachine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateDuinoVisitor ) return ((StateDuinoVisitor<? extends T>)visitor).visitStateMachine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateMachineContext stateMachine() throws RecognitionException {
		StateMachineContext _localctx = new StateMachineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stateMachine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(STATEMACHINE);
			setState(59);
			match(ID);
			setState(60);
			match(LBRACE);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2161868688544835074L) != 0)) {
				{
				setState(67);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DIGITALREAD:
				case DIGITALWRITE:
				case ANALOGREAD:
				case ANALOGWRITE:
				case HIGH:
				case LOW:
				case DELAY:
				case NUMBER_LITERAL:
				case BOOL_LITERAL:
				case ID:
				case LPAREN:
				case NOT:
				case INC:
				case DEC:
				case ADD:
				case SUB:
					{
					setState(61);
					expression(0);
					setState(62);
					match(SEMI);
					}
					break;
				case T__0:
				case NUMBER:
				case BOOL:
				case CONST:
				case ENUM:
				case VOID:
					{
					setState(64);
					declaration();
					setState(65);
					match(SEMI);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(72);
				state();
				}
				}
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STATE );
			setState(77);
			match(RBRACE);
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
	public static class StateContext extends ParserRuleContext {
		public TerminalNode STATE() { return getToken(StateDuinoParser.STATE, 0); }
		public TerminalNode ID() { return getToken(StateDuinoParser.ID, 0); }
		public StateBodyContext stateBody() {
			return getRuleContext(StateBodyContext.class,0);
		}
		public StateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateDuinoListener ) ((StateDuinoListener)listener).enterState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateDuinoListener ) ((StateDuinoListener)listener).exitState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateDuinoVisitor ) return ((StateDuinoVisitor<? extends T>)visitor).visitState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_state);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(STATE);
			setState(80);
			match(ID);
			setState(81);
			stateBody();
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
	public static class StateBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(StateDuinoParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(StateDuinoParser.RBRACE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public OnEntryContext onEntry() {
			return getRuleContext(OnEntryContext.class,0);
		}
		public OnRepeatContext onRepeat() {
			return getRuleContext(OnRepeatContext.class,0);
		}
		public OnExitContext onExit() {
			return getRuleContext(OnExitContext.class,0);
		}
		public TransitionsContext transitions() {
			return getRuleContext(TransitionsContext.class,0);
		}
		public StateBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateDuinoListener ) ((StateDuinoListener)listener).enterStateBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateDuinoListener ) ((StateDuinoListener)listener).exitStateBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateDuinoVisitor ) return ((StateDuinoVisitor<? extends T>)visitor).visitStateBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateBodyContext stateBody() throws RecognitionException {
		StateBodyContext _localctx = new StateBodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stateBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(LBRACE);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2161868688548898306L) != 0)) {
				{
				setState(86);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(84);
					expression(0);
					}
					break;
				case 2:
					{
					setState(85);
					statement();
					}
					break;
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ONENTRY) {
				{
				setState(91);
				onEntry();
				}
			}

			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ONREPEAT) {
				{
				setState(94);
				onRepeat();
				}
			}

			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ONEXIT) {
				{
				setState(97);
				onExit();
				}
			}

			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TRANSITIONS) {
				{
				setState(100);
				transitions();
				}
			}

			setState(103);
			match(RBRACE);
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
	public static class OnEntryContext extends ParserRuleContext {
		public TerminalNode ONENTRY() { return getToken(StateDuinoParser.ONENTRY, 0); }
		public TerminalNode LBRACE() { return getToken(StateDuinoParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(StateDuinoParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public OnEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onEntry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateDuinoListener ) ((StateDuinoListener)listener).enterOnEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateDuinoListener ) ((StateDuinoListener)listener).exitOnEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateDuinoVisitor ) return ((StateDuinoVisitor<? extends T>)visitor).visitOnEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnEntryContext onEntry() throws RecognitionException {
		OnEntryContext _localctx = new OnEntryContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_onEntry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(ONENTRY);
			setState(106);
			match(LBRACE);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2161868688548898306L) != 0)) {
				{
				{
				setState(107);
				statement();
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
			match(RBRACE);
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
	public static class OnRepeatContext extends ParserRuleContext {
		public TerminalNode ONREPEAT() { return getToken(StateDuinoParser.ONREPEAT, 0); }
		public TerminalNode LBRACE() { return getToken(StateDuinoParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(StateDuinoParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public OnRepeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onRepeat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateDuinoListener ) ((StateDuinoListener)listener).enterOnRepeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateDuinoListener ) ((StateDuinoListener)listener).exitOnRepeat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateDuinoVisitor ) return ((StateDuinoVisitor<? extends T>)visitor).visitOnRepeat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnRepeatContext onRepeat() throws RecognitionException {
		OnRepeatContext _localctx = new OnRepeatContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_onRepeat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(ONREPEAT);
			setState(116);
			match(LBRACE);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2161868688548898306L) != 0)) {
				{
				{
				setState(117);
				statement();
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
			match(RBRACE);
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
	public static class OnExitContext extends ParserRuleContext {
		public TerminalNode ONEXIT() { return getToken(StateDuinoParser.ONEXIT, 0); }
		public TerminalNode LBRACE() { return getToken(StateDuinoParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(StateDuinoParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public OnExitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onExit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateDuinoListener ) ((StateDuinoListener)listener).enterOnExit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateDuinoListener ) ((StateDuinoListener)listener).exitOnExit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateDuinoVisitor ) return ((StateDuinoVisitor<? extends T>)visitor).visitOnExit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnExitContext onExit() throws RecognitionException {
		OnExitContext _localctx = new OnExitContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_onExit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(ONEXIT);
			setState(126);
			match(LBRACE);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2161868688548898306L) != 0)) {
				{
				{
				setState(127);
				statement();
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133);
			match(RBRACE);
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
	public static class TransitionsContext extends ParserRuleContext {
		public TerminalNode TRANSITIONS() { return getToken(StateDuinoParser.TRANSITIONS, 0); }
		public TerminalNode LBRACE() { return getToken(StateDuinoParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(StateDuinoParser.RBRACE, 0); }
		public List<TerminalNode> CHANGESTATE() { return getTokens(StateDuinoParser.CHANGESTATE); }
		public TerminalNode CHANGESTATE(int i) {
			return getToken(StateDuinoParser.CHANGESTATE, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(StateDuinoParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(StateDuinoParser.LPAREN, i);
		}
		public List<TerminalNode> ID() { return getTokens(StateDuinoParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(StateDuinoParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(StateDuinoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(StateDuinoParser.COMMA, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> NUMBER_LITERAL() { return getTokens(StateDuinoParser.NUMBER_LITERAL); }
		public TerminalNode NUMBER_LITERAL(int i) {
			return getToken(StateDuinoParser.NUMBER_LITERAL, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(StateDuinoParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(StateDuinoParser.RPAREN, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(StateDuinoParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(StateDuinoParser.SEMI, i);
		}
		public TransitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transitions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateDuinoListener ) ((StateDuinoListener)listener).enterTransitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateDuinoListener ) ((StateDuinoListener)listener).exitTransitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateDuinoVisitor ) return ((StateDuinoVisitor<? extends T>)visitor).visitTransitions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransitionsContext transitions() throws RecognitionException {
		TransitionsContext _localctx = new TransitionsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_transitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(TRANSITIONS);
			setState(136);
			match(LBRACE);
			setState(147); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(137);
				match(CHANGESTATE);
				setState(138);
				match(LPAREN);
				setState(139);
				match(ID);
				setState(140);
				match(COMMA);
				setState(141);
				expression(0);
				setState(142);
				match(COMMA);
				setState(143);
				match(NUMBER_LITERAL);
				setState(144);
				match(RPAREN);
				setState(145);
				match(SEMI);
				}
				}
				setState(149); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CHANGESTATE );
			setState(151);
			match(RBRACE);
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
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(StateDuinoParser.FUNCTION, 0); }
		public List<TerminalNode> ID() { return getTokens(StateDuinoParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(StateDuinoParser.ID, i);
		}
		public TerminalNode LPAREN() { return getToken(StateDuinoParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(StateDuinoParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(StateDuinoParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(StateDuinoParser.RBRACE, 0); }
		public List<TypeSpecifierContext> typeSpecifier() {
			return getRuleContexts(TypeSpecifierContext.class);
		}
		public TypeSpecifierContext typeSpecifier(int i) {
			return getRuleContext(TypeSpecifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(StateDuinoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(StateDuinoParser.COMMA, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateDuinoListener ) ((StateDuinoListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateDuinoListener ) ((StateDuinoListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateDuinoVisitor ) return ((StateDuinoVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(FUNCTION);
			setState(154);
			match(ID);
			setState(155);
			match(LPAREN);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4261378L) != 0)) {
				{
				setState(163);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(156);
					typeSpecifier();
					setState(157);
					match(ID);
					setState(158);
					match(COMMA);
					}
					break;
				case 2:
					{
					setState(160);
					typeSpecifier();
					setState(161);
					match(ID);
					}
					break;
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(168);
			match(RPAREN);
			setState(169);
			match(LBRACE);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2161868688548898306L) != 0)) {
				{
				{
				setState(170);
				statement();
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(176);
			match(RBRACE);
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
	public static class StatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(StateDuinoParser.SEMI, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(StateDuinoParser.RETURN, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateDuinoListener ) ((StateDuinoListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateDuinoListener ) ((StateDuinoListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateDuinoVisitor ) return ((StateDuinoVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement);
		try {
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				ifStatement();
				}
				break;
			case DIGITALREAD:
			case DIGITALWRITE:
			case ANALOGREAD:
			case ANALOGWRITE:
			case HIGH:
			case LOW:
			case DELAY:
			case NUMBER_LITERAL:
			case BOOL_LITERAL:
			case ID:
			case LPAREN:
			case NOT:
			case INC:
			case DEC:
			case ADD:
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				expression(0);
				setState(180);
				match(SEMI);
				}
				break;
			case T__0:
			case NUMBER:
			case BOOL:
			case CONST:
			case ENUM:
			case VOID:
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
				declaration();
				setState(183);
				match(SEMI);
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 4);
				{
				setState(185);
				switchStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(186);
				forStatement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 6);
				{
				setState(187);
				whileStatement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 7);
				{
				setState(188);
				match(RETURN);
				setState(189);
				expression(0);
				setState(190);
				match(SEMI);
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
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(StateDuinoParser.IF, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(StateDuinoParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(StateDuinoParser.LPAREN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(StateDuinoParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(StateDuinoParser.RPAREN, i);
		}
		public List<TerminalNode> LBRACE() { return getTokens(StateDuinoParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(StateDuinoParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(StateDuinoParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(StateDuinoParser.RBRACE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> ELSEIF() { return getTokens(StateDuinoParser.ELSEIF); }
		public TerminalNode ELSEIF(int i) {
			return getToken(StateDuinoParser.ELSEIF, i);
		}
		public TerminalNode ELSE() { return getToken(StateDuinoParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateDuinoListener ) ((StateDuinoListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateDuinoListener ) ((StateDuinoListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateDuinoVisitor ) return ((StateDuinoVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(IF);
			setState(195);
			match(LPAREN);
			setState(196);
			expression(0);
			setState(197);
			match(RPAREN);
			setState(198);
			match(LBRACE);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2161868688548898306L) != 0)) {
				{
				{
				setState(199);
				statement();
				}
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(205);
			match(RBRACE);
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(206);
				match(ELSEIF);
				setState(207);
				match(LPAREN);
				setState(208);
				expression(0);
				setState(209);
				match(RPAREN);
				setState(210);
				match(LBRACE);
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2161868688548898306L) != 0)) {
					{
					{
					setState(211);
					statement();
					}
					}
					setState(216);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(217);
				match(RBRACE);
				}
				}
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(224);
				match(ELSE);
				setState(225);
				match(LBRACE);
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2161868688548898306L) != 0)) {
					{
					{
					setState(226);
					statement();
					}
					}
					setState(231);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(232);
				match(RBRACE);
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
	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(StateDuinoParser.SWITCH, 0); }
		public TerminalNode LPAREN() { return getToken(StateDuinoParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(StateDuinoParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(StateDuinoParser.LBRACE, 0); }
		public DefaultCaseStatementContext defaultCaseStatement() {
			return getRuleContext(DefaultCaseStatementContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(StateDuinoParser.RBRACE, 0); }
		public List<CaseStatementContext> caseStatement() {
			return getRuleContexts(CaseStatementContext.class);
		}
		public CaseStatementContext caseStatement(int i) {
			return getRuleContext(CaseStatementContext.class,i);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateDuinoListener ) ((StateDuinoListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateDuinoListener ) ((StateDuinoListener)listener).exitSwitchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateDuinoVisitor ) return ((StateDuinoVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_switchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(SWITCH);
			setState(236);
			match(LPAREN);
			setState(237);
			expression(0);
			setState(238);
			match(RPAREN);
			setState(239);
			match(LBRACE);
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(240);
				caseStatement();
				}
				}
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(246);
			defaultCaseStatement();
			setState(247);
			match(RBRACE);
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
	public static class CaseStatementContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(StateDuinoParser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(StateDuinoParser.COLON, 0); }
		public TerminalNode BREAK() { return getToken(StateDuinoParser.BREAK, 0); }
		public TerminalNode SEMI() { return getToken(StateDuinoParser.SEMI, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public CaseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateDuinoListener ) ((StateDuinoListener)listener).enterCaseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateDuinoListener ) ((StateDuinoListener)listener).exitCaseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateDuinoVisitor ) return ((StateDuinoVisitor<? extends T>)visitor).visitCaseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseStatementContext caseStatement() throws RecognitionException {
		CaseStatementContext _localctx = new CaseStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_caseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(CASE);
			setState(250);
			expression(0);
			setState(251);
			match(COLON);
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2161868688548898306L) != 0)) {
				{
				{
				setState(252);
				statement();
				}
				}
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(258);
			match(BREAK);
			setState(259);
			match(SEMI);
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
	public static class DefaultCaseStatementContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(StateDuinoParser.DEFAULT, 0); }
		public TerminalNode COLON() { return getToken(StateDuinoParser.COLON, 0); }
		public TerminalNode BREAK() { return getToken(StateDuinoParser.BREAK, 0); }
		public TerminalNode SEMI() { return getToken(StateDuinoParser.SEMI, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public DefaultCaseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultCaseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateDuinoListener ) ((StateDuinoListener)listener).enterDefaultCaseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateDuinoListener ) ((StateDuinoListener)listener).exitDefaultCaseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateDuinoVisitor ) return ((StateDuinoVisitor<? extends T>)visitor).visitDefaultCaseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultCaseStatementContext defaultCaseStatement() throws RecognitionException {
		DefaultCaseStatementContext _localctx = new DefaultCaseStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_defaultCaseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(DEFAULT);
			setState(262);
			match(COLON);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2161868688548898306L) != 0)) {
				{
				{
				setState(263);
				statement();
				}
				}
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(269);
			match(BREAK);
			setState(270);
			match(SEMI);
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
	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(StateDuinoParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(StateDuinoParser.LPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(StateDuinoParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(StateDuinoParser.SEMI, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(StateDuinoParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(StateDuinoParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(StateDuinoParser.RBRACE, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateDuinoListener ) ((StateDuinoListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateDuinoListener ) ((StateDuinoListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateDuinoVisitor ) return ((StateDuinoVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(FOR);
			setState(273);
			match(LPAREN);
			setState(276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGITALREAD:
			case DIGITALWRITE:
			case ANALOGREAD:
			case ANALOGWRITE:
			case HIGH:
			case LOW:
			case DELAY:
			case NUMBER_LITERAL:
			case BOOL_LITERAL:
			case ID:
			case LPAREN:
			case NOT:
			case INC:
			case DEC:
			case ADD:
			case SUB:
				{
				setState(274);
				expression(0);
				}
				break;
			case T__0:
			case NUMBER:
			case BOOL:
			case CONST:
			case ENUM:
			case VOID:
				{
				setState(275);
				declaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(278);
			match(SEMI);
			setState(279);
			expression(0);
			setState(280);
			match(SEMI);
			setState(281);
			expression(0);
			setState(282);
			match(RPAREN);
			setState(283);
			match(LBRACE);
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2161868688548898306L) != 0)) {
				{
				{
				setState(284);
				statement();
				}
				}
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(290);
			match(RBRACE);
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
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(StateDuinoParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(StateDuinoParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(StateDuinoParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(StateDuinoParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(StateDuinoParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateDuinoListener ) ((StateDuinoListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateDuinoListener ) ((StateDuinoListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateDuinoVisitor ) return ((StateDuinoVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(WHILE);
			setState(293);
			match(LPAREN);
			setState(294);
			expression(0);
			setState(295);
			match(RPAREN);
			setState(296);
			match(LBRACE);
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2161868688548898306L) != 0)) {
				{
				{
				setState(297);
				statement();
				}
				}
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(303);
			match(RBRACE);
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
	public static class FunctionNamesContext extends ParserRuleContext {
		public TerminalNode DELAY() { return getToken(StateDuinoParser.DELAY, 0); }
		public TerminalNode DIGITALWRITE() { return getToken(StateDuinoParser.DIGITALWRITE, 0); }
		public TerminalNode DIGITALREAD() { return getToken(StateDuinoParser.DIGITALREAD, 0); }
		public TerminalNode ANALOGREAD() { return getToken(StateDuinoParser.ANALOGREAD, 0); }
		public TerminalNode ANALOGWRITE() { return getToken(StateDuinoParser.ANALOGWRITE, 0); }
		public TerminalNode ID() { return getToken(StateDuinoParser.ID, 0); }
		public FunctionNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionNames; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateDuinoListener ) ((StateDuinoListener)listener).enterFunctionNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateDuinoListener ) ((StateDuinoListener)listener).exitFunctionNames(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateDuinoVisitor ) return ((StateDuinoVisitor<? extends T>)visitor).visitFunctionNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNamesContext functionNames() throws RecognitionException {
		FunctionNamesContext _localctx = new FunctionNamesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_functionNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 35022438400L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(StateDuinoParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(StateDuinoParser.RPAREN, 0); }
		public FunctionNamesContext functionNames() {
			return getRuleContext(FunctionNamesContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(StateDuinoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(StateDuinoParser.COMMA, i);
		}
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public TerminalNode NOT() { return getToken(StateDuinoParser.NOT, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public BinaryContext binary() {
			return getRuleContext(BinaryContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(StateDuinoParser.QUESTION, 0); }
		public TerminalNode COLON() { return getToken(StateDuinoParser.COLON, 0); }
		public TerminalNode SEMI() { return getToken(StateDuinoParser.SEMI, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateDuinoListener ) ((StateDuinoListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateDuinoListener ) ((StateDuinoListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateDuinoVisitor ) return ((StateDuinoVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(308);
				match(LPAREN);
				setState(309);
				expression(0);
				setState(310);
				match(RPAREN);
				}
				break;
			case 2:
				{
				setState(312);
				functionNames();
				setState(313);
				match(LPAREN);
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2161868688540565504L) != 0)) {
					{
					setState(318);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						setState(314);
						expression(0);
						setState(315);
						match(COMMA);
						}
						break;
					case 2:
						{
						setState(317);
						expression(0);
						}
						break;
					}
					}
					setState(322);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(323);
				match(RPAREN);
				}
				break;
			case 3:
				{
				setState(327);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INC:
				case DEC:
					{
					setState(325);
					unary();
					}
					break;
				case NOT:
					{
					setState(326);
					match(NOT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(329);
				expression(4);
				}
				break;
			case 4:
				{
				setState(330);
				values();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(348);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(346);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(333);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(334);
						binary();
						setState(335);
						expression(4);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(337);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(338);
						unary();
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(339);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(340);
						match(QUESTION);
						setState(341);
						expression(0);
						setState(342);
						match(COLON);
						setState(343);
						expression(0);
						setState(344);
						match(SEMI);
						}
						break;
					}
					} 
				}
				setState(350);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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
	public static class DeclarationContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TerminalNode ID() { return getToken(StateDuinoParser.ID, 0); }
		public TerminalNode CONST() { return getToken(StateDuinoParser.CONST, 0); }
		public TerminalNode ASSIGN() { return getToken(StateDuinoParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateDuinoListener ) ((StateDuinoListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateDuinoListener ) ((StateDuinoListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateDuinoVisitor ) return ((StateDuinoVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(351);
				match(CONST);
				}
			}

			setState(354);
			typeSpecifier();
			setState(355);
			match(ID);
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(356);
				match(ASSIGN);
				setState(357);
				expression(0);
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
	public static class ValuesContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(StateDuinoParser.ID, 0); }
		public TerminalNode NUMBER_LITERAL() { return getToken(StateDuinoParser.NUMBER_LITERAL, 0); }
		public TerminalNode ADD() { return getToken(StateDuinoParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(StateDuinoParser.SUB, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(StateDuinoParser.BOOL_LITERAL, 0); }
		public TerminalNode HIGH() { return getToken(StateDuinoParser.HIGH, 0); }
		public TerminalNode LOW() { return getToken(StateDuinoParser.LOW, 0); }
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateDuinoListener ) ((StateDuinoListener)listener).enterValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateDuinoListener ) ((StateDuinoListener)listener).exitValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateDuinoVisitor ) return ((StateDuinoVisitor<? extends T>)visitor).visitValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_values);
		int _la;
		try {
			setState(368);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				match(ID);
				}
				break;
			case NUMBER_LITERAL:
			case ADD:
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ADD || _la==SUB) {
					{
					setState(361);
					_la = _input.LA(1);
					if ( !(_la==ADD || _la==SUB) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(364);
				match(NUMBER_LITERAL);
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(365);
				match(BOOL_LITERAL);
				}
				break;
			case HIGH:
				enterOuterAlt(_localctx, 4);
				{
				setState(366);
				match(HIGH);
				}
				break;
			case LOW:
				enterOuterAlt(_localctx, 5);
				{
				setState(367);
				match(LOW);
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
	public static class UnaryContext extends ParserRuleContext {
		public TerminalNode INC() { return getToken(StateDuinoParser.INC, 0); }
		public TerminalNode DEC() { return getToken(StateDuinoParser.DEC, 0); }
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateDuinoListener ) ((StateDuinoListener)listener).enterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateDuinoListener ) ((StateDuinoListener)listener).exitUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateDuinoVisitor ) return ((StateDuinoVisitor<? extends T>)visitor).visitUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_unary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			_la = _input.LA(1);
			if ( !(_la==INC || _la==DEC) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class BinaryContext extends ParserRuleContext {
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public LogicalContext logical() {
			return getRuleContext(LogicalContext.class,0);
		}
		public BinaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateDuinoListener ) ((StateDuinoListener)listener).enterBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateDuinoListener ) ((StateDuinoListener)listener).exitBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateDuinoVisitor ) return ((StateDuinoVisitor<? extends T>)visitor).visitBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryContext binary() throws RecognitionException {
		BinaryContext _localctx = new BinaryContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_binary);
		try {
			setState(374);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case SUB:
			case MUL:
			case DIV:
			case MOD:
			case ADD_ASSIGN:
			case SUB_ASSIGN:
			case ASSIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				arithmetic();
				}
				break;
			case GT:
			case LT:
			case EQUAL:
			case LE:
			case GE:
			case NOTEQUAL:
			case XOR:
			case AND:
			case OR:
				enterOuterAlt(_localctx, 2);
				{
				setState(373);
				logical();
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
	public static class ArithmeticContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(StateDuinoParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(StateDuinoParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(StateDuinoParser.MOD, 0); }
		public TerminalNode ADD() { return getToken(StateDuinoParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(StateDuinoParser.SUB, 0); }
		public TerminalNode ASSIGN() { return getToken(StateDuinoParser.ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(StateDuinoParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(StateDuinoParser.SUB_ASSIGN, 0); }
		public ArithmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateDuinoListener ) ((StateDuinoListener)listener).enterArithmetic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateDuinoListener ) ((StateDuinoListener)listener).exitArithmetic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateDuinoVisitor ) return ((StateDuinoVisitor<? extends T>)visitor).visitArithmetic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticContext arithmetic() throws RecognitionException {
		ArithmeticContext _localctx = new ArithmeticContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_arithmetic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			_la = _input.LA(1);
			if ( !(((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & 495L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class LogicalContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(StateDuinoParser.LT, 0); }
		public TerminalNode LE() { return getToken(StateDuinoParser.LE, 0); }
		public TerminalNode GT() { return getToken(StateDuinoParser.GT, 0); }
		public TerminalNode GE() { return getToken(StateDuinoParser.GE, 0); }
		public TerminalNode EQUAL() { return getToken(StateDuinoParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(StateDuinoParser.NOTEQUAL, 0); }
		public TerminalNode XOR() { return getToken(StateDuinoParser.XOR, 0); }
		public TerminalNode AND() { return getToken(StateDuinoParser.AND, 0); }
		public TerminalNode OR() { return getToken(StateDuinoParser.OR, 0); }
		public LogicalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateDuinoListener ) ((StateDuinoListener)listener).enterLogical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateDuinoListener ) ((StateDuinoListener)listener).exitLogical(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateDuinoVisitor ) return ((StateDuinoVisitor<? extends T>)visitor).visitLogical(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalContext logical() throws RecognitionException {
		LogicalContext _localctx = new LogicalContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_logical);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 143094841285279744L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class TypeSpecifierContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(StateDuinoParser.VOID, 0); }
		public TerminalNode NUMBER() { return getToken(StateDuinoParser.NUMBER, 0); }
		public TerminalNode ENUM() { return getToken(StateDuinoParser.ENUM, 0); }
		public TerminalNode BOOL() { return getToken(StateDuinoParser.BOOL, 0); }
		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateDuinoListener ) ((StateDuinoListener)listener).enterTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateDuinoListener ) ((StateDuinoListener)listener).exitTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateDuinoVisitor ) return ((StateDuinoVisitor<? extends T>)visitor).visitTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_typeSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4261378L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001F\u017f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0001\u0000\u0005\u00004\b\u0000\n\u0000\f\u00007\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001D\b\u0001"+
		"\n\u0001\f\u0001G\t\u0001\u0001\u0001\u0004\u0001J\b\u0001\u000b\u0001"+
		"\f\u0001K\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003W\b\u0003"+
		"\n\u0003\f\u0003Z\t\u0003\u0001\u0003\u0003\u0003]\b\u0003\u0001\u0003"+
		"\u0003\u0003`\b\u0003\u0001\u0003\u0003\u0003c\b\u0003\u0001\u0003\u0003"+
		"\u0003f\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004m\b\u0004\n\u0004\f\u0004p\t\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005w\b\u0005\n\u0005"+
		"\f\u0005z\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006\u0081\b\u0006\n\u0006\f\u0006\u0084\t\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0004\u0007\u0094\b\u0007\u000b\u0007\f\u0007\u0095\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0005\b\u00a4\b\b\n\b\f\b\u00a7\t\b\u0001\b"+
		"\u0001\b\u0001\b\u0005\b\u00ac\b\b\n\b\f\b\u00af\t\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00c1\b\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0005\n\u00c9\b\n\n\n\f\n\u00cc\t\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00d5\b\n\n\n"+
		"\f\n\u00d8\t\n\u0001\n\u0001\n\u0005\n\u00dc\b\n\n\n\f\n\u00df\t\n\u0001"+
		"\n\u0001\n\u0001\n\u0005\n\u00e4\b\n\n\n\f\n\u00e7\t\n\u0001\n\u0003\n"+
		"\u00ea\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0005\u000b\u00f2\b\u000b\n\u000b\f\u000b\u00f5\t\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f"+
		"\u00fe\b\f\n\f\f\f\u0101\t\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0005\r\u0109\b\r\n\r\f\r\u010c\t\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0115\b\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0005\u000e\u011e\b\u000e\n\u000e\f\u000e\u0121\t\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0005\u000f\u012b\b\u000f\n\u000f\f\u000f\u012e\t\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0005\u0011\u013f\b\u0011\n\u0011\f\u0011\u0142"+
		"\t\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0148"+
		"\b\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u014c\b\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0005\u0011\u015b\b\u0011\n\u0011\f\u0011\u015e\t\u0011\u0001\u0012\u0003"+
		"\u0012\u0161\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u0167\b\u0012\u0001\u0013\u0001\u0013\u0003\u0013\u016b\b\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0171\b\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0003\u0015\u0177\b\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0000\u0001\"\u0019\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.0\u0000\u0006\u0003"+
		"\u0000\u0017\u001a\u001d\u001d##\u0001\u0000;<\u0001\u00009:\u0002\u0000"+
		";>@C\u0002\u0000-.28\u0004\u0000\u0001\u0001\t\n\u0010\u0010\u0016\u0016"+
		"\u0198\u00005\u0001\u0000\u0000\u0000\u0002:\u0001\u0000\u0000\u0000\u0004"+
		"O\u0001\u0000\u0000\u0000\u0006S\u0001\u0000\u0000\u0000\bi\u0001\u0000"+
		"\u0000\u0000\ns\u0001\u0000\u0000\u0000\f}\u0001\u0000\u0000\u0000\u000e"+
		"\u0087\u0001\u0000\u0000\u0000\u0010\u0099\u0001\u0000\u0000\u0000\u0012"+
		"\u00c0\u0001\u0000\u0000\u0000\u0014\u00c2\u0001\u0000\u0000\u0000\u0016"+
		"\u00eb\u0001\u0000\u0000\u0000\u0018\u00f9\u0001\u0000\u0000\u0000\u001a"+
		"\u0105\u0001\u0000\u0000\u0000\u001c\u0110\u0001\u0000\u0000\u0000\u001e"+
		"\u0124\u0001\u0000\u0000\u0000 \u0131\u0001\u0000\u0000\u0000\"\u014b"+
		"\u0001\u0000\u0000\u0000$\u0160\u0001\u0000\u0000\u0000&\u0170\u0001\u0000"+
		"\u0000\u0000(\u0172\u0001\u0000\u0000\u0000*\u0176\u0001\u0000\u0000\u0000"+
		",\u0178\u0001\u0000\u0000\u0000.\u017a\u0001\u0000\u0000\u00000\u017c"+
		"\u0001\u0000\u0000\u000024\u0003\u0010\b\u000032\u0001\u0000\u0000\u0000"+
		"47\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000056\u0001\u0000\u0000"+
		"\u000068\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u000089\u0003\u0002"+
		"\u0001\u00009\u0001\u0001\u0000\u0000\u0000:;\u0005\u0003\u0000\u0000"+
		";<\u0005#\u0000\u0000<E\u0005&\u0000\u0000=>\u0003\"\u0011\u0000>?\u0005"+
		"*\u0000\u0000?D\u0001\u0000\u0000\u0000@A\u0003$\u0012\u0000AB\u0005*"+
		"\u0000\u0000BD\u0001\u0000\u0000\u0000C=\u0001\u0000\u0000\u0000C@\u0001"+
		"\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000"+
		"EF\u0001\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000"+
		"\u0000HJ\u0003\u0004\u0002\u0000IH\u0001\u0000\u0000\u0000JK\u0001\u0000"+
		"\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LM\u0001"+
		"\u0000\u0000\u0000MN\u0005\'\u0000\u0000N\u0003\u0001\u0000\u0000\u0000"+
		"OP\u0005\u0002\u0000\u0000PQ\u0005#\u0000\u0000QR\u0003\u0006\u0003\u0000"+
		"R\u0005\u0001\u0000\u0000\u0000SX\u0005&\u0000\u0000TW\u0003\"\u0011\u0000"+
		"UW\u0003\u0012\t\u0000VT\u0001\u0000\u0000\u0000VU\u0001\u0000\u0000\u0000"+
		"WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000"+
		"\u0000Y\\\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000[]\u0003\b"+
		"\u0004\u0000\\[\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]_\u0001"+
		"\u0000\u0000\u0000^`\u0003\n\u0005\u0000_^\u0001\u0000\u0000\u0000_`\u0001"+
		"\u0000\u0000\u0000`b\u0001\u0000\u0000\u0000ac\u0003\f\u0006\u0000ba\u0001"+
		"\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000ce\u0001\u0000\u0000\u0000"+
		"df\u0003\u000e\u0007\u0000ed\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000"+
		"\u0000fg\u0001\u0000\u0000\u0000gh\u0005\'\u0000\u0000h\u0007\u0001\u0000"+
		"\u0000\u0000ij\u0005\u0004\u0000\u0000jn\u0005&\u0000\u0000km\u0003\u0012"+
		"\t\u0000lk\u0001\u0000\u0000\u0000mp\u0001\u0000\u0000\u0000nl\u0001\u0000"+
		"\u0000\u0000no\u0001\u0000\u0000\u0000oq\u0001\u0000\u0000\u0000pn\u0001"+
		"\u0000\u0000\u0000qr\u0005\'\u0000\u0000r\t\u0001\u0000\u0000\u0000st"+
		"\u0005\u0005\u0000\u0000tx\u0005&\u0000\u0000uw\u0003\u0012\t\u0000vu"+
		"\u0001\u0000\u0000\u0000wz\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000"+
		"\u0000xy\u0001\u0000\u0000\u0000y{\u0001\u0000\u0000\u0000zx\u0001\u0000"+
		"\u0000\u0000{|\u0005\'\u0000\u0000|\u000b\u0001\u0000\u0000\u0000}~\u0005"+
		"\u0006\u0000\u0000~\u0082\u0005&\u0000\u0000\u007f\u0081\u0003\u0012\t"+
		"\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081\u0084\u0001\u0000\u0000"+
		"\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000"+
		"\u0000\u0083\u0085\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000"+
		"\u0000\u0085\u0086\u0005\'\u0000\u0000\u0086\r\u0001\u0000\u0000\u0000"+
		"\u0087\u0088\u0005\u0007\u0000\u0000\u0088\u0093\u0005&\u0000\u0000\u0089"+
		"\u008a\u0005\b\u0000\u0000\u008a\u008b\u0005$\u0000\u0000\u008b\u008c"+
		"\u0005#\u0000\u0000\u008c\u008d\u0005+\u0000\u0000\u008d\u008e\u0003\""+
		"\u0011\u0000\u008e\u008f\u0005+\u0000\u0000\u008f\u0090\u0005!\u0000\u0000"+
		"\u0090\u0091\u0005%\u0000\u0000\u0091\u0092\u0005*\u0000\u0000\u0092\u0094"+
		"\u0001\u0000\u0000\u0000\u0093\u0089\u0001\u0000\u0000\u0000\u0094\u0095"+
		"\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095\u0096"+
		"\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0098"+
		"\u0005\'\u0000\u0000\u0098\u000f\u0001\u0000\u0000\u0000\u0099\u009a\u0005"+
		"\u001e\u0000\u0000\u009a\u009b\u0005#\u0000\u0000\u009b\u00a5\u0005$\u0000"+
		"\u0000\u009c\u009d\u00030\u0018\u0000\u009d\u009e\u0005#\u0000\u0000\u009e"+
		"\u009f\u0005+\u0000\u0000\u009f\u00a4\u0001\u0000\u0000\u0000\u00a0\u00a1"+
		"\u00030\u0018\u0000\u00a1\u00a2\u0005#\u0000\u0000\u00a2\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a3\u009c\u0001\u0000\u0000\u0000\u00a3\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a8\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005%\u0000"+
		"\u0000\u00a9\u00ad\u0005&\u0000\u0000\u00aa\u00ac\u0003\u0012\t\u0000"+
		"\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ac\u00af\u0001\u0000\u0000\u0000"+
		"\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000"+
		"\u00ae\u00b0\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b1\u0005\'\u0000\u0000\u00b1\u0011\u0001\u0000\u0000\u0000\u00b2"+
		"\u00c1\u0003\u0014\n\u0000\u00b3\u00b4\u0003\"\u0011\u0000\u00b4\u00b5"+
		"\u0005*\u0000\u0000\u00b5\u00c1\u0001\u0000\u0000\u0000\u00b6\u00b7\u0003"+
		"$\u0012\u0000\u00b7\u00b8\u0005*\u0000\u0000\u00b8\u00c1\u0001\u0000\u0000"+
		"\u0000\u00b9\u00c1\u0003\u0016\u000b\u0000\u00ba\u00c1\u0003\u001c\u000e"+
		"\u0000\u00bb\u00c1\u0003\u001e\u000f\u0000\u00bc\u00bd\u0005\u0013\u0000"+
		"\u0000\u00bd\u00be\u0003\"\u0011\u0000\u00be\u00bf\u0005*\u0000\u0000"+
		"\u00bf\u00c1\u0001\u0000\u0000\u0000\u00c0\u00b2\u0001\u0000\u0000\u0000"+
		"\u00c0\u00b3\u0001\u0000\u0000\u0000\u00c0\u00b6\u0001\u0000\u0000\u0000"+
		"\u00c0\u00b9\u0001\u0000\u0000\u0000\u00c0\u00ba\u0001\u0000\u0000\u0000"+
		"\u00c0\u00bb\u0001\u0000\u0000\u0000\u00c0\u00bc\u0001\u0000\u0000\u0000"+
		"\u00c1\u0013\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005\u0012\u0000\u0000"+
		"\u00c3\u00c4\u0005$\u0000\u0000\u00c4\u00c5\u0003\"\u0011\u0000\u00c5"+
		"\u00c6\u0005%\u0000\u0000\u00c6\u00ca\u0005&\u0000\u0000\u00c7\u00c9\u0003"+
		"\u0012\t\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c9\u00cc\u0001\u0000"+
		"\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000"+
		"\u0000\u0000\u00cb\u00cd\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000"+
		"\u0000\u0000\u00cd\u00dd\u0005\'\u0000\u0000\u00ce\u00cf\u0005\u000f\u0000"+
		"\u0000\u00cf\u00d0\u0005$\u0000\u0000\u00d0\u00d1\u0003\"\u0011\u0000"+
		"\u00d1\u00d2\u0005%\u0000\u0000\u00d2\u00d6\u0005&\u0000\u0000\u00d3\u00d5"+
		"\u0003\u0012\t\u0000\u00d4\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d8\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d9\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001"+
		"\u0000\u0000\u0000\u00d9\u00da\u0005\'\u0000\u0000\u00da\u00dc\u0001\u0000"+
		"\u0000\u0000\u00db\u00ce\u0001\u0000\u0000\u0000\u00dc\u00df\u0001\u0000"+
		"\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000"+
		"\u0000\u0000\u00de\u00e9\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000"+
		"\u0000\u0000\u00e0\u00e1\u0005\u000e\u0000\u0000\u00e1\u00e5\u0005&\u0000"+
		"\u0000\u00e2\u00e4\u0003\u0012\t\u0000\u00e3\u00e2\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e7\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e8\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e8\u00ea\u0005\'\u0000\u0000\u00e9"+
		"\u00e0\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea"+
		"\u0015\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005\u0015\u0000\u0000\u00ec"+
		"\u00ed\u0005$\u0000\u0000\u00ed\u00ee\u0003\"\u0011\u0000\u00ee\u00ef"+
		"\u0005%\u0000\u0000\u00ef\u00f3\u0005&\u0000\u0000\u00f0\u00f2\u0003\u0018"+
		"\f\u0000\u00f1\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f5\u0001\u0000\u0000"+
		"\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f6\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f7\u0003\u001a\r\u0000\u00f7\u00f8\u0005\'\u0000\u0000"+
		"\u00f8\u0017\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005\f\u0000\u0000\u00fa"+
		"\u00fb\u0003\"\u0011\u0000\u00fb\u00ff\u00051\u0000\u0000\u00fc\u00fe"+
		"\u0003\u0012\t\u0000\u00fd\u00fc\u0001\u0000\u0000\u0000\u00fe\u0101\u0001"+
		"\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000\u00ff\u0100\u0001"+
		"\u0000\u0000\u0000\u0100\u0102\u0001\u0000\u0000\u0000\u0101\u00ff\u0001"+
		"\u0000\u0000\u0000\u0102\u0103\u0005\u000b\u0000\u0000\u0103\u0104\u0005"+
		"*\u0000\u0000\u0104\u0019\u0001\u0000\u0000\u0000\u0105\u0106\u0005\u001f"+
		"\u0000\u0000\u0106\u010a\u00051\u0000\u0000\u0107\u0109\u0003\u0012\t"+
		"\u0000\u0108\u0107\u0001\u0000\u0000\u0000\u0109\u010c\u0001\u0000\u0000"+
		"\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000"+
		"\u0000\u010b\u010d\u0001\u0000\u0000\u0000\u010c\u010a\u0001\u0000\u0000"+
		"\u0000\u010d\u010e\u0005\u000b\u0000\u0000\u010e\u010f\u0005*\u0000\u0000"+
		"\u010f\u001b\u0001\u0000\u0000\u0000\u0110\u0111\u0005\u0011\u0000\u0000"+
		"\u0111\u0114\u0005$\u0000\u0000\u0112\u0115\u0003\"\u0011\u0000\u0113"+
		"\u0115\u0003$\u0012\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0114\u0113"+
		"\u0001\u0000\u0000\u0000\u0115\u0116\u0001\u0000\u0000\u0000\u0116\u0117"+
		"\u0005*\u0000\u0000\u0117\u0118\u0003\"\u0011\u0000\u0118\u0119\u0005"+
		"*\u0000\u0000\u0119\u011a\u0003\"\u0011\u0000\u011a\u011b\u0005%\u0000"+
		"\u0000\u011b\u011f\u0005&\u0000\u0000\u011c\u011e\u0003\u0012\t\u0000"+
		"\u011d\u011c\u0001\u0000\u0000\u0000\u011e\u0121\u0001\u0000\u0000\u0000"+
		"\u011f\u011d\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000"+
		"\u0120\u0122\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000"+
		"\u0122\u0123\u0005\'\u0000\u0000\u0123\u001d\u0001\u0000\u0000\u0000\u0124"+
		"\u0125\u0005\u0014\u0000\u0000\u0125\u0126\u0005$\u0000\u0000\u0126\u0127"+
		"\u0003\"\u0011\u0000\u0127\u0128\u0005%\u0000\u0000\u0128\u012c\u0005"+
		"&\u0000\u0000\u0129\u012b\u0003\u0012\t\u0000\u012a\u0129\u0001\u0000"+
		"\u0000\u0000\u012b\u012e\u0001\u0000\u0000\u0000\u012c\u012a\u0001\u0000"+
		"\u0000\u0000\u012c\u012d\u0001\u0000\u0000\u0000\u012d\u012f\u0001\u0000"+
		"\u0000\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012f\u0130\u0005\'\u0000"+
		"\u0000\u0130\u001f\u0001\u0000\u0000\u0000\u0131\u0132\u0007\u0000\u0000"+
		"\u0000\u0132!\u0001\u0000\u0000\u0000\u0133\u0134\u0006\u0011\uffff\uffff"+
		"\u0000\u0134\u0135\u0005$\u0000\u0000\u0135\u0136\u0003\"\u0011\u0000"+
		"\u0136\u0137\u0005%\u0000\u0000\u0137\u014c\u0001\u0000\u0000\u0000\u0138"+
		"\u0139\u0003 \u0010\u0000\u0139\u0140\u0005$\u0000\u0000\u013a\u013b\u0003"+
		"\"\u0011\u0000\u013b\u013c\u0005+\u0000\u0000\u013c\u013f\u0001\u0000"+
		"\u0000\u0000\u013d\u013f\u0003\"\u0011\u0000\u013e\u013a\u0001\u0000\u0000"+
		"\u0000\u013e\u013d\u0001\u0000\u0000\u0000\u013f\u0142\u0001\u0000\u0000"+
		"\u0000\u0140\u013e\u0001\u0000\u0000\u0000\u0140\u0141\u0001\u0000\u0000"+
		"\u0000\u0141\u0143\u0001\u0000\u0000\u0000\u0142\u0140\u0001\u0000\u0000"+
		"\u0000\u0143\u0144\u0005%\u0000\u0000\u0144\u014c\u0001\u0000\u0000\u0000"+
		"\u0145\u0148\u0003(\u0014\u0000\u0146\u0148\u0005/\u0000\u0000\u0147\u0145"+
		"\u0001\u0000\u0000\u0000\u0147\u0146\u0001\u0000\u0000\u0000\u0148\u0149"+
		"\u0001\u0000\u0000\u0000\u0149\u014c\u0003\"\u0011\u0004\u014a\u014c\u0003"+
		"&\u0013\u0000\u014b\u0133\u0001\u0000\u0000\u0000\u014b\u0138\u0001\u0000"+
		"\u0000\u0000\u014b\u0147\u0001\u0000\u0000\u0000\u014b\u014a\u0001\u0000"+
		"\u0000\u0000\u014c\u015c\u0001\u0000\u0000\u0000\u014d\u014e\n\u0003\u0000"+
		"\u0000\u014e\u014f\u0003*\u0015\u0000\u014f\u0150\u0003\"\u0011\u0004"+
		"\u0150\u015b\u0001\u0000\u0000\u0000\u0151\u0152\n\u0005\u0000\u0000\u0152"+
		"\u015b\u0003(\u0014\u0000\u0153\u0154\n\u0002\u0000\u0000\u0154\u0155"+
		"\u00050\u0000\u0000\u0155\u0156\u0003\"\u0011\u0000\u0156\u0157\u0005"+
		"1\u0000\u0000\u0157\u0158\u0003\"\u0011\u0000\u0158\u0159\u0005*\u0000"+
		"\u0000\u0159\u015b\u0001\u0000\u0000\u0000\u015a\u014d\u0001\u0000\u0000"+
		"\u0000\u015a\u0151\u0001\u0000\u0000\u0000\u015a\u0153\u0001\u0000\u0000"+
		"\u0000\u015b\u015e\u0001\u0000\u0000\u0000\u015c\u015a\u0001\u0000\u0000"+
		"\u0000\u015c\u015d\u0001\u0000\u0000\u0000\u015d#\u0001\u0000\u0000\u0000"+
		"\u015e\u015c\u0001\u0000\u0000\u0000\u015f\u0161\u0005\r\u0000\u0000\u0160"+
		"\u015f\u0001\u0000\u0000\u0000\u0160\u0161\u0001\u0000\u0000\u0000\u0161"+
		"\u0162\u0001\u0000\u0000\u0000\u0162\u0163\u00030\u0018\u0000\u0163\u0166"+
		"\u0005#\u0000\u0000\u0164\u0165\u0005C\u0000\u0000\u0165\u0167\u0003\""+
		"\u0011\u0000\u0166\u0164\u0001\u0000\u0000\u0000\u0166\u0167\u0001\u0000"+
		"\u0000\u0000\u0167%\u0001\u0000\u0000\u0000\u0168\u0171\u0005#\u0000\u0000"+
		"\u0169\u016b\u0007\u0001\u0000\u0000\u016a\u0169\u0001\u0000\u0000\u0000"+
		"\u016a\u016b\u0001\u0000\u0000\u0000\u016b\u016c\u0001\u0000\u0000\u0000"+
		"\u016c\u0171\u0005!\u0000\u0000\u016d\u0171\u0005\"\u0000\u0000\u016e"+
		"\u0171\u0005\u001b\u0000\u0000\u016f\u0171\u0005\u001c\u0000\u0000\u0170"+
		"\u0168\u0001\u0000\u0000\u0000\u0170\u016a\u0001\u0000\u0000\u0000\u0170"+
		"\u016d\u0001\u0000\u0000\u0000\u0170\u016e\u0001\u0000\u0000\u0000\u0170"+
		"\u016f\u0001\u0000\u0000\u0000\u0171\'\u0001\u0000\u0000\u0000\u0172\u0173"+
		"\u0007\u0002\u0000\u0000\u0173)\u0001\u0000\u0000\u0000\u0174\u0177\u0003"+
		",\u0016\u0000\u0175\u0177\u0003.\u0017\u0000\u0176\u0174\u0001\u0000\u0000"+
		"\u0000\u0176\u0175\u0001\u0000\u0000\u0000\u0177+\u0001\u0000\u0000\u0000"+
		"\u0178\u0179\u0007\u0003\u0000\u0000\u0179-\u0001\u0000\u0000\u0000\u017a"+
		"\u017b\u0007\u0004\u0000\u0000\u017b/\u0001\u0000\u0000\u0000\u017c\u017d"+
		"\u0007\u0005\u0000\u0000\u017d1\u0001\u0000\u0000\u0000(5CEKVX\\_benx"+
		"\u0082\u0095\u00a3\u00a5\u00ad\u00c0\u00ca\u00d6\u00dd\u00e5\u00e9\u00f3"+
		"\u00ff\u010a\u0114\u011f\u012c\u013e\u0140\u0147\u014b\u015a\u015c\u0160"+
		"\u0166\u016a\u0170\u0176";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}