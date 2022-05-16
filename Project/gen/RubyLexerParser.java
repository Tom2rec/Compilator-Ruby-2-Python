// Generated from C:/Informatyka_i_systemy_inteligentne/ROK II/Sem_4/Teoria_kompilacji_i_kompilatory/Project\RubyLexer.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RubyLexerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMA=1, SEMICOLON=2, CRLF=3, REQUIRE=4, END=5, DEF=6, RETURN=7, IF=8, 
		ELSE=9, ELSIF=10, UNLESS=11, WHILE=12, RETRY=13, BREAK=14, FOR=15, TRUE=16, 
		FALSE=17, PLUS=18, MINUS=19, MUL=20, DIV=21, MOD=22, EXP=23, EQUAL=24, 
		NOT_EQUAL=25, GREATER=26, LESS=27, LESS_EQUAL=28, GREATER_EQUAL=29, ASSIGN=30, 
		PLUS_ASSIGN=31, MINUS_ASSIGN=32, MUL_ASSIGN=33, DIV_ASSIGN=34, MOD_ASSIGN=35, 
		EXP_ASSIGN=36, AND=37, OR=38, NOT=39, LEFT_RBRACKET=40, RIGHT_RBRACKET=41, 
		LEFT_SBRACKET=42, RIGHT_SBRACKET=43, NIL=44, SINGLE_LINE_COMMENT=45, MULTI_LINE_COMMENT=46, 
		WHITE_SPACE=47, INT=48, FLOAT=49, ID=50, ID_GLOBAL=51;
	public static final int
		RULE_prog = 0, RULE_expression_list = 1, RULE_expression = 2, RULE_global_get = 3, 
		RULE_global_set = 4, RULE_global_result = 5, RULE_function_inline_call = 6, 
		RULE_function_definition = 7, RULE_function_definition_body = 8, RULE_function_definition_header = 9, 
		RULE_function_name = 10, RULE_function_definition_params = 11, RULE_function_definition_params_list = 12, 
		RULE_function_definition_param_id = 13, RULE_return_statement = 14, RULE_function_call = 15, 
		RULE_function_call_param_list = 16, RULE_function_call_params = 17, RULE_function_param = 18, 
		RULE_function_unnamed_param = 19, RULE_function_named_param = 20, RULE_function_call_assignment = 21, 
		RULE_all_result = 22, RULE_elsif_statement = 23, RULE_if_elsif_statement = 24, 
		RULE_if_statement = 25, RULE_unless_statement = 26, RULE_while_statement = 27, 
		RULE_for_statement = 28, RULE_init_expression = 29, RULE_all_assignment = 30, 
		RULE_for_init_list = 31, RULE_cond_expression = 32, RULE_loop_expression = 33, 
		RULE_for_loop_list = 34, RULE_statement_body = 35, RULE_statement_expression_list = 36, 
		RULE_assignment = 37, RULE_dynamic_assignment = 38, RULE_int_assignment = 39, 
		RULE_float_assignment = 40, RULE_string_assignment = 41, RULE_initial_array_assignment = 42, 
		RULE_array_assignment = 43, RULE_array_definition = 44, RULE_array_definition_elements = 45, 
		RULE_array_selector = 46, RULE_dynamic_result = 47, RULE_dynamic_ = 48, 
		RULE_int_result = 49, RULE_float_result = 50, RULE_string_result = 51, 
		RULE_comparison_list = 52, RULE_comparison = 53, RULE_comp_var = 54, RULE_lvalue = 55, 
		RULE_rvalue = 56, RULE_break_expression = 57, RULE_float_t = 58, RULE_int_t = 59, 
		RULE_bool_t = 60, RULE_nil_t = 61, RULE_id_ = 62, RULE_id_global = 63, 
		RULE_terminator = 64, RULE_else_token = 65, RULE_crlf = 66;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "expression_list", "expression", "global_get", "global_set", 
			"global_result", "function_inline_call", "function_definition", "function_definition_body", 
			"function_definition_header", "function_name", "function_definition_params", 
			"function_definition_params_list", "function_definition_param_id", "return_statement", 
			"function_call", "function_call_param_list", "function_call_params", 
			"function_param", "function_unnamed_param", "function_named_param", "function_call_assignment", 
			"all_result", "elsif_statement", "if_elsif_statement", "if_statement", 
			"unless_statement", "while_statement", "for_statement", "init_expression", 
			"all_assignment", "for_init_list", "cond_expression", "loop_expression", 
			"for_loop_list", "statement_body", "statement_expression_list", "assignment", 
			"dynamic_assignment", "int_assignment", "float_assignment", "string_assignment", 
			"initial_array_assignment", "array_assignment", "array_definition", "array_definition_elements", 
			"array_selector", "dynamic_result", "dynamic_", "int_result", "float_result", 
			"string_result", "comparison_list", "comparison", "comp_var", "lvalue", 
			"rvalue", "break_expression", "float_t", "int_t", "bool_t", "nil_t", 
			"id_", "id_global", "terminator", "else_token", "crlf"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "';'", null, "'require'", "'end'", "'def'", "'return'", 
			"'if'", "'else'", "'elsif'", "'unless'", "'while'", "'retry'", "'break'", 
			"'for'", "'true'", "'false'", "'+'", "'-'", "'*'", "'/'", "'%'", "'**'", 
			"'=='", "'!='", "'>'", "'<'", "'<='", "'>='", "'='", "'+='", "'-='", 
			"'*='", "'/='", "'%='", "'**='", null, null, null, "'('", "')'", "'['", 
			"']'", "'nil'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMA", "SEMICOLON", "CRLF", "REQUIRE", "END", "DEF", "RETURN", 
			"IF", "ELSE", "ELSIF", "UNLESS", "WHILE", "RETRY", "BREAK", "FOR", "TRUE", 
			"FALSE", "PLUS", "MINUS", "MUL", "DIV", "MOD", "EXP", "EQUAL", "NOT_EQUAL", 
			"GREATER", "LESS", "LESS_EQUAL", "GREATER_EQUAL", "ASSIGN", "PLUS_ASSIGN", 
			"MINUS_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", "EXP_ASSIGN", 
			"AND", "OR", "NOT", "LEFT_RBRACKET", "RIGHT_RBRACKET", "LEFT_SBRACKET", 
			"RIGHT_SBRACKET", "NIL", "SINGLE_LINE_COMMENT", "MULTI_LINE_COMMENT", 
			"WHITE_SPACE", "INT", "FLOAT", "ID", "ID_GLOBAL"
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
	public String getGrammarFileName() { return "RubyLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RubyLexerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			expression_list(0);
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

	public static class Expression_listContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterExpression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitExpression_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitExpression_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		return expression_list(0);
	}

	private Expression_listContext expression_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expression_listContext _localctx = new Expression_listContext(_ctx, _parentState);
		Expression_listContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expression_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEF:
			case RETURN:
			case IF:
			case UNLESS:
			case WHILE:
			case FOR:
			case TRUE:
			case FALSE:
			case NOT:
			case LEFT_RBRACKET:
			case NIL:
			case INT:
			case FLOAT:
			case ID:
			case ID_GLOBAL:
				{
				setState(137);
				expression();
				setState(138);
				terminator(0);
				}
				break;
			case SEMICOLON:
			case CRLF:
				{
				setState(140);
				terminator(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expression_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression_list);
					setState(143);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(144);
					expression();
					setState(145);
					terminator(0);
					}
					} 
				}
				setState(151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Function_definitionContext function_definition() {
			return getRuleContext(Function_definitionContext.class,0);
		}
		public Function_inline_callContext function_inline_call() {
			return getRuleContext(Function_inline_callContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Unless_statementContext unless_statement() {
			return getRuleContext(Unless_statementContext.class,0);
		}
		public RvalueContext rvalue() {
			return getRuleContext(RvalueContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expression);
		try {
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				function_definition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				function_inline_call();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				if_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(155);
				unless_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(156);
				rvalue(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(157);
				return_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(158);
				while_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(159);
				for_statement();
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

	public static class Global_getContext extends ParserRuleContext {
		public LvalueContext var_name;
		public Token op;
		public Id_globalContext global_name;
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(RubyLexerParser.ASSIGN, 0); }
		public Id_globalContext id_global() {
			return getRuleContext(Id_globalContext.class,0);
		}
		public Global_getContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_get; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterGlobal_get(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitGlobal_get(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitGlobal_get(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Global_getContext global_get() throws RecognitionException {
		Global_getContext _localctx = new Global_getContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_global_get);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			((Global_getContext)_localctx).var_name = lvalue();
			setState(163);
			((Global_getContext)_localctx).op = match(ASSIGN);
			setState(164);
			((Global_getContext)_localctx).global_name = id_global();
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

	public static class Global_setContext extends ParserRuleContext {
		public Id_globalContext global_name;
		public Token op;
		public All_resultContext result;
		public Id_globalContext id_global() {
			return getRuleContext(Id_globalContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(RubyLexerParser.ASSIGN, 0); }
		public All_resultContext all_result() {
			return getRuleContext(All_resultContext.class,0);
		}
		public Global_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterGlobal_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitGlobal_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitGlobal_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Global_setContext global_set() throws RecognitionException {
		Global_setContext _localctx = new Global_setContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_global_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			((Global_setContext)_localctx).global_name = id_global();
			setState(167);
			((Global_setContext)_localctx).op = match(ASSIGN);
			setState(168);
			((Global_setContext)_localctx).result = all_result();
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

	public static class Global_resultContext extends ParserRuleContext {
		public Id_globalContext id_global() {
			return getRuleContext(Id_globalContext.class,0);
		}
		public Global_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterGlobal_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitGlobal_result(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitGlobal_result(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Global_resultContext global_result() throws RecognitionException {
		Global_resultContext _localctx = new Global_resultContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_global_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			id_global();
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

	public static class Function_inline_callContext extends ParserRuleContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Function_inline_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_inline_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterFunction_inline_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitFunction_inline_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitFunction_inline_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_inline_callContext function_inline_call() throws RecognitionException {
		Function_inline_callContext _localctx = new Function_inline_callContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_function_inline_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			function_call();
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

	public static class Function_definitionContext extends ParserRuleContext {
		public Function_definition_headerContext function_definition_header() {
			return getRuleContext(Function_definition_headerContext.class,0);
		}
		public Function_definition_bodyContext function_definition_body() {
			return getRuleContext(Function_definition_bodyContext.class,0);
		}
		public TerminalNode END() { return getToken(RubyLexerParser.END, 0); }
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterFunction_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitFunction_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitFunction_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_function_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			function_definition_header();
			setState(175);
			function_definition_body();
			setState(176);
			match(END);
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

	public static class Function_definition_bodyContext extends ParserRuleContext {
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Function_definition_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterFunction_definition_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitFunction_definition_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitFunction_definition_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_definition_bodyContext function_definition_body() throws RecognitionException {
		Function_definition_bodyContext _localctx = new Function_definition_bodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function_definition_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			expression_list(0);
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

	public static class Function_definition_headerContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(RubyLexerParser.DEF, 0); }
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public CrlfContext crlf() {
			return getRuleContext(CrlfContext.class,0);
		}
		public Function_definition_paramsContext function_definition_params() {
			return getRuleContext(Function_definition_paramsContext.class,0);
		}
		public Function_definition_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterFunction_definition_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitFunction_definition_header(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitFunction_definition_header(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_definition_headerContext function_definition_header() throws RecognitionException {
		Function_definition_headerContext _localctx = new Function_definition_headerContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_function_definition_header);
		try {
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(DEF);
				setState(181);
				function_name();
				setState(182);
				crlf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				match(DEF);
				setState(185);
				function_name();
				setState(186);
				function_definition_params();
				setState(187);
				crlf();
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

	public static class Function_nameContext extends ParserRuleContext {
		public Id_Context id_() {
			return getRuleContext(Id_Context.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			id_();
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

	public static class Function_definition_paramsContext extends ParserRuleContext {
		public TerminalNode LEFT_RBRACKET() { return getToken(RubyLexerParser.LEFT_RBRACKET, 0); }
		public TerminalNode RIGHT_RBRACKET() { return getToken(RubyLexerParser.RIGHT_RBRACKET, 0); }
		public Function_definition_params_listContext function_definition_params_list() {
			return getRuleContext(Function_definition_params_listContext.class,0);
		}
		public Function_definition_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterFunction_definition_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitFunction_definition_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitFunction_definition_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_definition_paramsContext function_definition_params() throws RecognitionException {
		Function_definition_paramsContext _localctx = new Function_definition_paramsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_function_definition_params);
		try {
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				match(LEFT_RBRACKET);
				setState(194);
				match(RIGHT_RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				match(LEFT_RBRACKET);
				setState(196);
				function_definition_params_list(0);
				setState(197);
				match(RIGHT_RBRACKET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(199);
				function_definition_params_list(0);
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

	public static class Function_definition_params_listContext extends ParserRuleContext {
		public Function_definition_param_idContext function_definition_param_id() {
			return getRuleContext(Function_definition_param_idContext.class,0);
		}
		public Function_definition_params_listContext function_definition_params_list() {
			return getRuleContext(Function_definition_params_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(RubyLexerParser.COMMA, 0); }
		public Function_definition_params_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition_params_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterFunction_definition_params_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitFunction_definition_params_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitFunction_definition_params_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_definition_params_listContext function_definition_params_list() throws RecognitionException {
		return function_definition_params_list(0);
	}

	private Function_definition_params_listContext function_definition_params_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Function_definition_params_listContext _localctx = new Function_definition_params_listContext(_ctx, _parentState);
		Function_definition_params_listContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_function_definition_params_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(203);
			function_definition_param_id();
			}
			_ctx.stop = _input.LT(-1);
			setState(210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Function_definition_params_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_function_definition_params_list);
					setState(205);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(206);
					match(COMMA);
					setState(207);
					function_definition_param_id();
					}
					} 
				}
				setState(212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class Function_definition_param_idContext extends ParserRuleContext {
		public Id_Context id_() {
			return getRuleContext(Id_Context.class,0);
		}
		public Function_definition_param_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition_param_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterFunction_definition_param_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitFunction_definition_param_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitFunction_definition_param_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_definition_param_idContext function_definition_param_id() throws RecognitionException {
		Function_definition_param_idContext _localctx = new Function_definition_param_idContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_function_definition_param_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			id_();
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

	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(RubyLexerParser.RETURN, 0); }
		public All_resultContext all_result() {
			return getRuleContext(All_resultContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitReturn_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(RETURN);
			setState(216);
			all_result();
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

	public static class Function_callContext extends ParserRuleContext {
		public Function_nameContext name;
		public Function_call_param_listContext params;
		public TerminalNode LEFT_RBRACKET() { return getToken(RubyLexerParser.LEFT_RBRACKET, 0); }
		public TerminalNode RIGHT_RBRACKET() { return getToken(RubyLexerParser.RIGHT_RBRACKET, 0); }
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public Function_call_param_listContext function_call_param_list() {
			return getRuleContext(Function_call_param_listContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_function_call);
		try {
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				((Function_callContext)_localctx).name = function_name();
				setState(219);
				match(LEFT_RBRACKET);
				setState(220);
				((Function_callContext)_localctx).params = function_call_param_list();
				setState(221);
				match(RIGHT_RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				((Function_callContext)_localctx).name = function_name();
				setState(224);
				((Function_callContext)_localctx).params = function_call_param_list();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(226);
				((Function_callContext)_localctx).name = function_name();
				setState(227);
				match(LEFT_RBRACKET);
				setState(228);
				match(RIGHT_RBRACKET);
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

	public static class Function_call_param_listContext extends ParserRuleContext {
		public Function_call_paramsContext function_call_params() {
			return getRuleContext(Function_call_paramsContext.class,0);
		}
		public Function_call_param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_param_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterFunction_call_param_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitFunction_call_param_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitFunction_call_param_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_call_param_listContext function_call_param_list() throws RecognitionException {
		Function_call_param_listContext _localctx = new Function_call_param_listContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_function_call_param_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			function_call_params(0);
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

	public static class Function_call_paramsContext extends ParserRuleContext {
		public Function_paramContext function_param() {
			return getRuleContext(Function_paramContext.class,0);
		}
		public Function_call_paramsContext function_call_params() {
			return getRuleContext(Function_call_paramsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(RubyLexerParser.COMMA, 0); }
		public Function_call_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterFunction_call_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitFunction_call_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitFunction_call_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_call_paramsContext function_call_params() throws RecognitionException {
		return function_call_params(0);
	}

	private Function_call_paramsContext function_call_params(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Function_call_paramsContext _localctx = new Function_call_paramsContext(_ctx, _parentState);
		Function_call_paramsContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_function_call_params, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(235);
			function_param();
			}
			_ctx.stop = _input.LT(-1);
			setState(242);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Function_call_paramsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_function_call_params);
					setState(237);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(238);
					match(COMMA);
					setState(239);
					function_param();
					}
					} 
				}
				setState(244);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class Function_paramContext extends ParserRuleContext {
		public Function_unnamed_paramContext function_unnamed_param() {
			return getRuleContext(Function_unnamed_paramContext.class,0);
		}
		public Function_named_paramContext function_named_param() {
			return getRuleContext(Function_named_paramContext.class,0);
		}
		public Function_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterFunction_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitFunction_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitFunction_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_paramContext function_param() throws RecognitionException {
		Function_paramContext _localctx = new Function_paramContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_function_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(245);
				function_unnamed_param();
				}
				break;
			case 2:
				{
				setState(246);
				function_named_param();
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

	public static class Function_unnamed_paramContext extends ParserRuleContext {
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public Float_resultContext float_result() {
			return getRuleContext(Float_resultContext.class,0);
		}
		public String_resultContext string_result() {
			return getRuleContext(String_resultContext.class,0);
		}
		public Dynamic_resultContext dynamic_result() {
			return getRuleContext(Dynamic_resultContext.class,0);
		}
		public Function_unnamed_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_unnamed_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterFunction_unnamed_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitFunction_unnamed_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitFunction_unnamed_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_unnamed_paramContext function_unnamed_param() throws RecognitionException {
		Function_unnamed_paramContext _localctx = new Function_unnamed_paramContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_function_unnamed_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(249);
				int_result(0);
				}
				break;
			case 2:
				{
				setState(250);
				float_result(0);
				}
				break;
			case 3:
				{
				setState(251);
				string_result(0);
				}
				break;
			case 4:
				{
				setState(252);
				dynamic_result(0);
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

	public static class Function_named_paramContext extends ParserRuleContext {
		public Token op;
		public Id_Context id_() {
			return getRuleContext(Id_Context.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(RubyLexerParser.ASSIGN, 0); }
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public Float_resultContext float_result() {
			return getRuleContext(Float_resultContext.class,0);
		}
		public String_resultContext string_result() {
			return getRuleContext(String_resultContext.class,0);
		}
		public Dynamic_resultContext dynamic_result() {
			return getRuleContext(Dynamic_resultContext.class,0);
		}
		public Function_named_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_named_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterFunction_named_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitFunction_named_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitFunction_named_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_named_paramContext function_named_param() throws RecognitionException {
		Function_named_paramContext _localctx = new Function_named_paramContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_function_named_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			id_();
			setState(256);
			((Function_named_paramContext)_localctx).op = match(ASSIGN);
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(257);
				int_result(0);
				}
				break;
			case 2:
				{
				setState(258);
				float_result(0);
				}
				break;
			case 3:
				{
				setState(259);
				string_result(0);
				}
				break;
			case 4:
				{
				setState(260);
				dynamic_result(0);
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

	public static class Function_call_assignmentContext extends ParserRuleContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Function_call_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterFunction_call_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitFunction_call_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitFunction_call_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_call_assignmentContext function_call_assignment() throws RecognitionException {
		Function_call_assignmentContext _localctx = new Function_call_assignmentContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_function_call_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			function_call();
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

	public static class All_resultContext extends ParserRuleContext {
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public Float_resultContext float_result() {
			return getRuleContext(Float_resultContext.class,0);
		}
		public String_resultContext string_result() {
			return getRuleContext(String_resultContext.class,0);
		}
		public Dynamic_resultContext dynamic_result() {
			return getRuleContext(Dynamic_resultContext.class,0);
		}
		public Global_resultContext global_result() {
			return getRuleContext(Global_resultContext.class,0);
		}
		public All_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterAll_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitAll_result(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitAll_result(this);
			else return visitor.visitChildren(this);
		}
	}

	public final All_resultContext all_result() throws RecognitionException {
		All_resultContext _localctx = new All_resultContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_all_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(265);
				int_result(0);
				}
				break;
			case 2:
				{
				setState(266);
				float_result(0);
				}
				break;
			case 3:
				{
				setState(267);
				string_result(0);
				}
				break;
			case 4:
				{
				setState(268);
				dynamic_result(0);
				}
				break;
			case 5:
				{
				setState(269);
				global_result();
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

	public static class Elsif_statementContext extends ParserRuleContext {
		public If_elsif_statementContext if_elsif_statement() {
			return getRuleContext(If_elsif_statementContext.class,0);
		}
		public Elsif_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsif_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterElsif_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitElsif_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitElsif_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elsif_statementContext elsif_statement() throws RecognitionException {
		Elsif_statementContext _localctx = new Elsif_statementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_elsif_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			if_elsif_statement();
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

	public static class If_elsif_statementContext extends ParserRuleContext {
		public TerminalNode ELSIF() { return getToken(RubyLexerParser.ELSIF, 0); }
		public Cond_expressionContext cond_expression() {
			return getRuleContext(Cond_expressionContext.class,0);
		}
		public List<CrlfContext> crlf() {
			return getRuleContexts(CrlfContext.class);
		}
		public CrlfContext crlf(int i) {
			return getRuleContext(CrlfContext.class,i);
		}
		public List<Statement_bodyContext> statement_body() {
			return getRuleContexts(Statement_bodyContext.class);
		}
		public Statement_bodyContext statement_body(int i) {
			return getRuleContext(Statement_bodyContext.class,i);
		}
		public Else_tokenContext else_token() {
			return getRuleContext(Else_tokenContext.class,0);
		}
		public If_elsif_statementContext if_elsif_statement() {
			return getRuleContext(If_elsif_statementContext.class,0);
		}
		public If_elsif_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_elsif_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterIf_elsif_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitIf_elsif_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitIf_elsif_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_elsif_statementContext if_elsif_statement() throws RecognitionException {
		If_elsif_statementContext _localctx = new If_elsif_statementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_if_elsif_statement);
		try {
			setState(293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				match(ELSIF);
				setState(275);
				cond_expression();
				setState(276);
				crlf();
				setState(277);
				statement_body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				match(ELSIF);
				setState(280);
				cond_expression();
				setState(281);
				crlf();
				setState(282);
				statement_body();
				setState(283);
				else_token();
				setState(284);
				crlf();
				setState(285);
				statement_body();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(287);
				match(ELSIF);
				setState(288);
				cond_expression();
				setState(289);
				crlf();
				setState(290);
				statement_body();
				setState(291);
				if_elsif_statement();
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

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(RubyLexerParser.IF, 0); }
		public Cond_expressionContext cond_expression() {
			return getRuleContext(Cond_expressionContext.class,0);
		}
		public List<CrlfContext> crlf() {
			return getRuleContexts(CrlfContext.class);
		}
		public CrlfContext crlf(int i) {
			return getRuleContext(CrlfContext.class,i);
		}
		public List<Statement_bodyContext> statement_body() {
			return getRuleContexts(Statement_bodyContext.class);
		}
		public Statement_bodyContext statement_body(int i) {
			return getRuleContext(Statement_bodyContext.class,i);
		}
		public TerminalNode END() { return getToken(RubyLexerParser.END, 0); }
		public Else_tokenContext else_token() {
			return getRuleContext(Else_tokenContext.class,0);
		}
		public Elsif_statementContext elsif_statement() {
			return getRuleContext(Elsif_statementContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_if_statement);
		try {
			setState(317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				match(IF);
				setState(296);
				cond_expression();
				setState(297);
				crlf();
				setState(298);
				statement_body();
				setState(299);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				match(IF);
				setState(302);
				cond_expression();
				setState(303);
				crlf();
				setState(304);
				statement_body();
				setState(305);
				else_token();
				setState(306);
				crlf();
				setState(307);
				statement_body();
				setState(308);
				match(END);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(310);
				match(IF);
				setState(311);
				cond_expression();
				setState(312);
				crlf();
				setState(313);
				statement_body();
				setState(314);
				elsif_statement();
				setState(315);
				match(END);
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

	public static class Unless_statementContext extends ParserRuleContext {
		public TerminalNode UNLESS() { return getToken(RubyLexerParser.UNLESS, 0); }
		public Cond_expressionContext cond_expression() {
			return getRuleContext(Cond_expressionContext.class,0);
		}
		public List<CrlfContext> crlf() {
			return getRuleContexts(CrlfContext.class);
		}
		public CrlfContext crlf(int i) {
			return getRuleContext(CrlfContext.class,i);
		}
		public List<Statement_bodyContext> statement_body() {
			return getRuleContexts(Statement_bodyContext.class);
		}
		public Statement_bodyContext statement_body(int i) {
			return getRuleContext(Statement_bodyContext.class,i);
		}
		public TerminalNode END() { return getToken(RubyLexerParser.END, 0); }
		public Else_tokenContext else_token() {
			return getRuleContext(Else_tokenContext.class,0);
		}
		public Elsif_statementContext elsif_statement() {
			return getRuleContext(Elsif_statementContext.class,0);
		}
		public Unless_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unless_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterUnless_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitUnless_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitUnless_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unless_statementContext unless_statement() throws RecognitionException {
		Unless_statementContext _localctx = new Unless_statementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_unless_statement);
		try {
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				match(UNLESS);
				setState(320);
				cond_expression();
				setState(321);
				crlf();
				setState(322);
				statement_body();
				setState(323);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				match(UNLESS);
				setState(326);
				cond_expression();
				setState(327);
				crlf();
				setState(328);
				statement_body();
				setState(329);
				else_token();
				setState(330);
				crlf();
				setState(331);
				statement_body();
				setState(332);
				match(END);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(334);
				match(UNLESS);
				setState(335);
				cond_expression();
				setState(336);
				crlf();
				setState(337);
				statement_body();
				setState(338);
				elsif_statement();
				setState(339);
				match(END);
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

	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(RubyLexerParser.WHILE, 0); }
		public Cond_expressionContext cond_expression() {
			return getRuleContext(Cond_expressionContext.class,0);
		}
		public CrlfContext crlf() {
			return getRuleContext(CrlfContext.class,0);
		}
		public Statement_bodyContext statement_body() {
			return getRuleContext(Statement_bodyContext.class,0);
		}
		public TerminalNode END() { return getToken(RubyLexerParser.END, 0); }
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitWhile_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(WHILE);
			setState(344);
			cond_expression();
			setState(345);
			crlf();
			setState(346);
			statement_body();
			setState(347);
			match(END);
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

	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(RubyLexerParser.FOR, 0); }
		public TerminalNode LEFT_RBRACKET() { return getToken(RubyLexerParser.LEFT_RBRACKET, 0); }
		public Init_expressionContext init_expression() {
			return getRuleContext(Init_expressionContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(RubyLexerParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(RubyLexerParser.SEMICOLON, i);
		}
		public Cond_expressionContext cond_expression() {
			return getRuleContext(Cond_expressionContext.class,0);
		}
		public Loop_expressionContext loop_expression() {
			return getRuleContext(Loop_expressionContext.class,0);
		}
		public TerminalNode RIGHT_RBRACKET() { return getToken(RubyLexerParser.RIGHT_RBRACKET, 0); }
		public CrlfContext crlf() {
			return getRuleContext(CrlfContext.class,0);
		}
		public Statement_bodyContext statement_body() {
			return getRuleContext(Statement_bodyContext.class,0);
		}
		public TerminalNode END() { return getToken(RubyLexerParser.END, 0); }
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitFor_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitFor_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_for_statement);
		try {
			setState(371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				match(FOR);
				setState(350);
				match(LEFT_RBRACKET);
				setState(351);
				init_expression();
				setState(352);
				match(SEMICOLON);
				setState(353);
				cond_expression();
				setState(354);
				match(SEMICOLON);
				setState(355);
				loop_expression();
				setState(356);
				match(RIGHT_RBRACKET);
				setState(357);
				crlf();
				setState(358);
				statement_body();
				setState(359);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
				match(FOR);
				setState(362);
				init_expression();
				setState(363);
				match(SEMICOLON);
				setState(364);
				cond_expression();
				setState(365);
				match(SEMICOLON);
				setState(366);
				loop_expression();
				setState(367);
				crlf();
				setState(368);
				statement_body();
				setState(369);
				match(END);
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

	public static class Init_expressionContext extends ParserRuleContext {
		public For_init_listContext for_init_list() {
			return getRuleContext(For_init_listContext.class,0);
		}
		public Init_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterInit_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitInit_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitInit_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Init_expressionContext init_expression() throws RecognitionException {
		Init_expressionContext _localctx = new Init_expressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_init_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			for_init_list(0);
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

	public static class All_assignmentContext extends ParserRuleContext {
		public Int_assignmentContext int_assignment() {
			return getRuleContext(Int_assignmentContext.class,0);
		}
		public Float_assignmentContext float_assignment() {
			return getRuleContext(Float_assignmentContext.class,0);
		}
		public String_assignmentContext string_assignment() {
			return getRuleContext(String_assignmentContext.class,0);
		}
		public Dynamic_assignmentContext dynamic_assignment() {
			return getRuleContext(Dynamic_assignmentContext.class,0);
		}
		public All_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterAll_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitAll_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitAll_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final All_assignmentContext all_assignment() throws RecognitionException {
		All_assignmentContext _localctx = new All_assignmentContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_all_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(375);
				int_assignment();
				}
				break;
			case 2:
				{
				setState(376);
				float_assignment();
				}
				break;
			case 3:
				{
				setState(377);
				string_assignment();
				}
				break;
			case 4:
				{
				setState(378);
				dynamic_assignment();
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

	public static class For_init_listContext extends ParserRuleContext {
		public All_assignmentContext all_assignment() {
			return getRuleContext(All_assignmentContext.class,0);
		}
		public For_init_listContext for_init_list() {
			return getRuleContext(For_init_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(RubyLexerParser.COMMA, 0); }
		public For_init_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_init_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterFor_init_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitFor_init_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitFor_init_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_init_listContext for_init_list() throws RecognitionException {
		return for_init_list(0);
	}

	private For_init_listContext for_init_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		For_init_listContext _localctx = new For_init_listContext(_ctx, _parentState);
		For_init_listContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_for_init_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(382);
			all_assignment();
			}
			_ctx.stop = _input.LT(-1);
			setState(389);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new For_init_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_for_init_list);
					setState(384);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(385);
					match(COMMA);
					setState(386);
					all_assignment();
					}
					} 
				}
				setState(391);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class Cond_expressionContext extends ParserRuleContext {
		public Comparison_listContext comparison_list() {
			return getRuleContext(Comparison_listContext.class,0);
		}
		public Cond_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterCond_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitCond_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitCond_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cond_expressionContext cond_expression() throws RecognitionException {
		Cond_expressionContext _localctx = new Cond_expressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_cond_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			comparison_list();
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

	public static class Loop_expressionContext extends ParserRuleContext {
		public For_loop_listContext for_loop_list() {
			return getRuleContext(For_loop_listContext.class,0);
		}
		public Loop_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterLoop_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitLoop_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitLoop_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_expressionContext loop_expression() throws RecognitionException {
		Loop_expressionContext _localctx = new Loop_expressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_loop_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			for_loop_list(0);
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

	public static class For_loop_listContext extends ParserRuleContext {
		public All_assignmentContext all_assignment() {
			return getRuleContext(All_assignmentContext.class,0);
		}
		public For_loop_listContext for_loop_list() {
			return getRuleContext(For_loop_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(RubyLexerParser.COMMA, 0); }
		public For_loop_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterFor_loop_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitFor_loop_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitFor_loop_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loop_listContext for_loop_list() throws RecognitionException {
		return for_loop_list(0);
	}

	private For_loop_listContext for_loop_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		For_loop_listContext _localctx = new For_loop_listContext(_ctx, _parentState);
		For_loop_listContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_for_loop_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(397);
			all_assignment();
			}
			_ctx.stop = _input.LT(-1);
			setState(404);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new For_loop_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_for_loop_list);
					setState(399);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(400);
					match(COMMA);
					setState(401);
					all_assignment();
					}
					} 
				}
				setState(406);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static class Statement_bodyContext extends ParserRuleContext {
		public Statement_expression_listContext statement_expression_list() {
			return getRuleContext(Statement_expression_listContext.class,0);
		}
		public Statement_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterStatement_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitStatement_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitStatement_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_bodyContext statement_body() throws RecognitionException {
		Statement_bodyContext _localctx = new Statement_bodyContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_statement_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			statement_expression_list(0);
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

	public static class Statement_expression_listContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public TerminalNode RETRY() { return getToken(RubyLexerParser.RETRY, 0); }
		public Break_expressionContext break_expression() {
			return getRuleContext(Break_expressionContext.class,0);
		}
		public Statement_expression_listContext statement_expression_list() {
			return getRuleContext(Statement_expression_listContext.class,0);
		}
		public Statement_expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterStatement_expression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitStatement_expression_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitStatement_expression_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_expression_listContext statement_expression_list() throws RecognitionException {
		return statement_expression_list(0);
	}

	private Statement_expression_listContext statement_expression_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Statement_expression_listContext _localctx = new Statement_expression_listContext(_ctx, _parentState);
		Statement_expression_listContext _prevctx = _localctx;
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_statement_expression_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEF:
			case RETURN:
			case IF:
			case UNLESS:
			case WHILE:
			case FOR:
			case TRUE:
			case FALSE:
			case NOT:
			case LEFT_RBRACKET:
			case NIL:
			case INT:
			case FLOAT:
			case ID:
			case ID_GLOBAL:
				{
				setState(410);
				expression();
				setState(411);
				terminator(0);
				}
				break;
			case RETRY:
				{
				setState(413);
				match(RETRY);
				setState(414);
				terminator(0);
				}
				break;
			case BREAK:
				{
				setState(415);
				break_expression();
				setState(416);
				terminator(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(433);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(431);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new Statement_expression_listContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_statement_expression_list);
						setState(420);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(421);
						expression();
						setState(422);
						terminator(0);
						}
						break;
					case 2:
						{
						_localctx = new Statement_expression_listContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_statement_expression_list);
						setState(424);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(425);
						match(RETRY);
						setState(426);
						terminator(0);
						}
						break;
					case 3:
						{
						_localctx = new Statement_expression_listContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_statement_expression_list);
						setState(427);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(428);
						break_expression();
						setState(429);
						terminator(0);
						}
						break;
					}
					} 
				}
				setState(435);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class AssignmentContext extends ParserRuleContext {
		public LvalueContext var_id;
		public Token op;
		public RvalueContext rvalue() {
			return getRuleContext(RvalueContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(RubyLexerParser.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(RubyLexerParser.PLUS_ASSIGN, 0); }
		public TerminalNode MINUS_ASSIGN() { return getToken(RubyLexerParser.MINUS_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(RubyLexerParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(RubyLexerParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(RubyLexerParser.MOD_ASSIGN, 0); }
		public TerminalNode EXP_ASSIGN() { return getToken(RubyLexerParser.EXP_ASSIGN, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_assignment);
		int _la;
		try {
			setState(444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(436);
				((AssignmentContext)_localctx).var_id = lvalue();
				setState(437);
				((AssignmentContext)_localctx).op = match(ASSIGN);
				setState(438);
				rvalue(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(440);
				((AssignmentContext)_localctx).var_id = lvalue();
				setState(441);
				((AssignmentContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS_ASSIGN) | (1L << MINUS_ASSIGN) | (1L << MUL_ASSIGN) | (1L << DIV_ASSIGN) | (1L << MOD_ASSIGN) | (1L << EXP_ASSIGN))) != 0)) ) {
					((AssignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(442);
				rvalue(0);
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

	public static class Dynamic_assignmentContext extends ParserRuleContext {
		public LvalueContext var_id;
		public Token op;
		public Dynamic_resultContext dynamic_result() {
			return getRuleContext(Dynamic_resultContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(RubyLexerParser.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(RubyLexerParser.PLUS_ASSIGN, 0); }
		public TerminalNode MINUS_ASSIGN() { return getToken(RubyLexerParser.MINUS_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(RubyLexerParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(RubyLexerParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(RubyLexerParser.MOD_ASSIGN, 0); }
		public TerminalNode EXP_ASSIGN() { return getToken(RubyLexerParser.EXP_ASSIGN, 0); }
		public Dynamic_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamic_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterDynamic_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitDynamic_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitDynamic_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dynamic_assignmentContext dynamic_assignment() throws RecognitionException {
		Dynamic_assignmentContext _localctx = new Dynamic_assignmentContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_dynamic_assignment);
		int _la;
		try {
			setState(454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(446);
				((Dynamic_assignmentContext)_localctx).var_id = lvalue();
				setState(447);
				((Dynamic_assignmentContext)_localctx).op = match(ASSIGN);
				setState(448);
				dynamic_result(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(450);
				((Dynamic_assignmentContext)_localctx).var_id = lvalue();
				setState(451);
				((Dynamic_assignmentContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS_ASSIGN) | (1L << MINUS_ASSIGN) | (1L << MUL_ASSIGN) | (1L << DIV_ASSIGN) | (1L << MOD_ASSIGN) | (1L << EXP_ASSIGN))) != 0)) ) {
					((Dynamic_assignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(452);
				dynamic_result(0);
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

	public static class Int_assignmentContext extends ParserRuleContext {
		public LvalueContext var_id;
		public Token op;
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(RubyLexerParser.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(RubyLexerParser.PLUS_ASSIGN, 0); }
		public TerminalNode MINUS_ASSIGN() { return getToken(RubyLexerParser.MINUS_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(RubyLexerParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(RubyLexerParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(RubyLexerParser.MOD_ASSIGN, 0); }
		public TerminalNode EXP_ASSIGN() { return getToken(RubyLexerParser.EXP_ASSIGN, 0); }
		public Int_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterInt_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitInt_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitInt_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_assignmentContext int_assignment() throws RecognitionException {
		Int_assignmentContext _localctx = new Int_assignmentContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_int_assignment);
		int _la;
		try {
			setState(464);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(456);
				((Int_assignmentContext)_localctx).var_id = lvalue();
				setState(457);
				((Int_assignmentContext)_localctx).op = match(ASSIGN);
				setState(458);
				int_result(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(460);
				((Int_assignmentContext)_localctx).var_id = lvalue();
				setState(461);
				((Int_assignmentContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS_ASSIGN) | (1L << MINUS_ASSIGN) | (1L << MUL_ASSIGN) | (1L << DIV_ASSIGN) | (1L << MOD_ASSIGN) | (1L << EXP_ASSIGN))) != 0)) ) {
					((Int_assignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(462);
				int_result(0);
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

	public static class Float_assignmentContext extends ParserRuleContext {
		public LvalueContext var_id;
		public Token op;
		public Float_resultContext float_result() {
			return getRuleContext(Float_resultContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(RubyLexerParser.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(RubyLexerParser.PLUS_ASSIGN, 0); }
		public TerminalNode MINUS_ASSIGN() { return getToken(RubyLexerParser.MINUS_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(RubyLexerParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(RubyLexerParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(RubyLexerParser.MOD_ASSIGN, 0); }
		public TerminalNode EXP_ASSIGN() { return getToken(RubyLexerParser.EXP_ASSIGN, 0); }
		public Float_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterFloat_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitFloat_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitFloat_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Float_assignmentContext float_assignment() throws RecognitionException {
		Float_assignmentContext _localctx = new Float_assignmentContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_float_assignment);
		int _la;
		try {
			setState(474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(466);
				((Float_assignmentContext)_localctx).var_id = lvalue();
				setState(467);
				((Float_assignmentContext)_localctx).op = match(ASSIGN);
				setState(468);
				float_result(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(470);
				((Float_assignmentContext)_localctx).var_id = lvalue();
				setState(471);
				((Float_assignmentContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS_ASSIGN) | (1L << MINUS_ASSIGN) | (1L << MUL_ASSIGN) | (1L << DIV_ASSIGN) | (1L << MOD_ASSIGN) | (1L << EXP_ASSIGN))) != 0)) ) {
					((Float_assignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(472);
				float_result(0);
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

	public static class String_assignmentContext extends ParserRuleContext {
		public LvalueContext var_id;
		public Token op;
		public String_resultContext string_result() {
			return getRuleContext(String_resultContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(RubyLexerParser.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(RubyLexerParser.PLUS_ASSIGN, 0); }
		public String_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterString_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitString_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitString_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_assignmentContext string_assignment() throws RecognitionException {
		String_assignmentContext _localctx = new String_assignmentContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_string_assignment);
		try {
			setState(484);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(476);
				((String_assignmentContext)_localctx).var_id = lvalue();
				setState(477);
				((String_assignmentContext)_localctx).op = match(ASSIGN);
				setState(478);
				string_result(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(480);
				((String_assignmentContext)_localctx).var_id = lvalue();
				setState(481);
				((String_assignmentContext)_localctx).op = match(PLUS_ASSIGN);
				setState(482);
				string_result(0);
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

	public static class Initial_array_assignmentContext extends ParserRuleContext {
		public LvalueContext var_id;
		public Token op;
		public TerminalNode LEFT_SBRACKET() { return getToken(RubyLexerParser.LEFT_SBRACKET, 0); }
		public TerminalNode RIGHT_SBRACKET() { return getToken(RubyLexerParser.RIGHT_SBRACKET, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(RubyLexerParser.ASSIGN, 0); }
		public Initial_array_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initial_array_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterInitial_array_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitInitial_array_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitInitial_array_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initial_array_assignmentContext initial_array_assignment() throws RecognitionException {
		Initial_array_assignmentContext _localctx = new Initial_array_assignmentContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_initial_array_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			((Initial_array_assignmentContext)_localctx).var_id = lvalue();
			setState(487);
			((Initial_array_assignmentContext)_localctx).op = match(ASSIGN);
			setState(488);
			match(LEFT_SBRACKET);
			setState(489);
			match(RIGHT_SBRACKET);
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

	public static class Array_assignmentContext extends ParserRuleContext {
		public Array_selectorContext arr_def;
		public Token op;
		public All_resultContext arr_val;
		public Array_selectorContext array_selector() {
			return getRuleContext(Array_selectorContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(RubyLexerParser.ASSIGN, 0); }
		public All_resultContext all_result() {
			return getRuleContext(All_resultContext.class,0);
		}
		public Array_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterArray_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitArray_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitArray_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_assignmentContext array_assignment() throws RecognitionException {
		Array_assignmentContext _localctx = new Array_assignmentContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_array_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			((Array_assignmentContext)_localctx).arr_def = array_selector();
			setState(492);
			((Array_assignmentContext)_localctx).op = match(ASSIGN);
			setState(493);
			((Array_assignmentContext)_localctx).arr_val = all_result();
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

	public static class Array_definitionContext extends ParserRuleContext {
		public TerminalNode LEFT_SBRACKET() { return getToken(RubyLexerParser.LEFT_SBRACKET, 0); }
		public Array_definition_elementsContext array_definition_elements() {
			return getRuleContext(Array_definition_elementsContext.class,0);
		}
		public TerminalNode RIGHT_SBRACKET() { return getToken(RubyLexerParser.RIGHT_SBRACKET, 0); }
		public Array_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterArray_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitArray_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitArray_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_definitionContext array_definition() throws RecognitionException {
		Array_definitionContext _localctx = new Array_definitionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_array_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			match(LEFT_SBRACKET);
			setState(496);
			array_definition_elements(0);
			setState(497);
			match(RIGHT_SBRACKET);
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

	public static class Array_definition_elementsContext extends ParserRuleContext {
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public Dynamic_resultContext dynamic_result() {
			return getRuleContext(Dynamic_resultContext.class,0);
		}
		public Array_definition_elementsContext array_definition_elements() {
			return getRuleContext(Array_definition_elementsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(RubyLexerParser.COMMA, 0); }
		public Array_definition_elementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_definition_elements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterArray_definition_elements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitArray_definition_elements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitArray_definition_elements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_definition_elementsContext array_definition_elements() throws RecognitionException {
		return array_definition_elements(0);
	}

	private Array_definition_elementsContext array_definition_elements(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Array_definition_elementsContext _localctx = new Array_definition_elementsContext(_ctx, _parentState);
		Array_definition_elementsContext _prevctx = _localctx;
		int _startState = 90;
		enterRecursionRule(_localctx, 90, RULE_array_definition_elements, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(502);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(500);
				int_result(0);
				}
				break;
			case 2:
				{
				setState(501);
				dynamic_result(0);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(512);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Array_definition_elementsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_array_definition_elements);
					setState(504);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(505);
					match(COMMA);
					setState(508);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						setState(506);
						int_result(0);
						}
						break;
					case 2:
						{
						setState(507);
						dynamic_result(0);
						}
						break;
					}
					}
					} 
				}
				setState(514);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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

	public static class Array_selectorContext extends ParserRuleContext {
		public Id_Context id_() {
			return getRuleContext(Id_Context.class,0);
		}
		public TerminalNode LEFT_SBRACKET() { return getToken(RubyLexerParser.LEFT_SBRACKET, 0); }
		public TerminalNode RIGHT_SBRACKET() { return getToken(RubyLexerParser.RIGHT_SBRACKET, 0); }
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public Dynamic_resultContext dynamic_result() {
			return getRuleContext(Dynamic_resultContext.class,0);
		}
		public Id_globalContext id_global() {
			return getRuleContext(Id_globalContext.class,0);
		}
		public Array_selectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterArray_selector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitArray_selector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitArray_selector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_selectorContext array_selector() throws RecognitionException {
		Array_selectorContext _localctx = new Array_selectorContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_array_selector);
		try {
			setState(531);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(515);
				id_();
				setState(516);
				match(LEFT_SBRACKET);
				setState(519);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(517);
					int_result(0);
					}
					break;
				case 2:
					{
					setState(518);
					dynamic_result(0);
					}
					break;
				}
				setState(521);
				match(RIGHT_SBRACKET);
				}
				break;
			case ID_GLOBAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(523);
				id_global();
				setState(524);
				match(LEFT_SBRACKET);
				setState(527);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(525);
					int_result(0);
					}
					break;
				case 2:
					{
					setState(526);
					dynamic_result(0);
					}
					break;
				}
				setState(529);
				match(RIGHT_SBRACKET);
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

	public static class Dynamic_resultContext extends ParserRuleContext {
		public Token op;
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public List<Dynamic_resultContext> dynamic_result() {
			return getRuleContexts(Dynamic_resultContext.class);
		}
		public Dynamic_resultContext dynamic_result(int i) {
			return getRuleContext(Dynamic_resultContext.class,i);
		}
		public TerminalNode MUL() { return getToken(RubyLexerParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(RubyLexerParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(RubyLexerParser.MOD, 0); }
		public Float_resultContext float_result() {
			return getRuleContext(Float_resultContext.class,0);
		}
		public String_resultContext string_result() {
			return getRuleContext(String_resultContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(RubyLexerParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(RubyLexerParser.MINUS, 0); }
		public TerminalNode LEFT_RBRACKET() { return getToken(RubyLexerParser.LEFT_RBRACKET, 0); }
		public TerminalNode RIGHT_RBRACKET() { return getToken(RubyLexerParser.RIGHT_RBRACKET, 0); }
		public Dynamic_Context dynamic_() {
			return getRuleContext(Dynamic_Context.class,0);
		}
		public Dynamic_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamic_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterDynamic_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitDynamic_result(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitDynamic_result(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dynamic_resultContext dynamic_result() throws RecognitionException {
		return dynamic_result(0);
	}

	private Dynamic_resultContext dynamic_result(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Dynamic_resultContext _localctx = new Dynamic_resultContext(_ctx, _parentState);
		Dynamic_resultContext _prevctx = _localctx;
		int _startState = 94;
		enterRecursionRule(_localctx, 94, RULE_dynamic_result, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(534);
				int_result(0);
				setState(535);
				((Dynamic_resultContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
					((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(536);
				dynamic_result(13);
				}
				break;
			case 2:
				{
				setState(538);
				float_result(0);
				setState(539);
				((Dynamic_resultContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
					((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(540);
				dynamic_result(11);
				}
				break;
			case 3:
				{
				setState(542);
				string_result(0);
				setState(543);
				((Dynamic_resultContext)_localctx).op = match(MUL);
				setState(544);
				dynamic_result(8);
				}
				break;
			case 4:
				{
				setState(546);
				int_result(0);
				setState(547);
				((Dynamic_resultContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(548);
				dynamic_result(6);
				}
				break;
			case 5:
				{
				setState(550);
				float_result(0);
				setState(551);
				((Dynamic_resultContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(552);
				dynamic_result(4);
				}
				break;
			case 6:
				{
				setState(554);
				match(LEFT_RBRACKET);
				setState(555);
				dynamic_result(0);
				setState(556);
				match(RIGHT_RBRACKET);
				}
				break;
			case 7:
				{
				setState(558);
				dynamic_();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(584);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(582);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(561);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(562);
						((Dynamic_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(563);
						dynamic_result(11);
						}
						break;
					case 2:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(564);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(565);
						((Dynamic_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(566);
						dynamic_result(4);
						}
						break;
					case 3:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(567);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(568);
						((Dynamic_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(569);
						int_result(0);
						}
						break;
					case 4:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(570);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(571);
						((Dynamic_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(572);
						float_result(0);
						}
						break;
					case 5:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(573);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(574);
						((Dynamic_resultContext)_localctx).op = match(MUL);
						setState(575);
						string_result(0);
						}
						break;
					case 6:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(576);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(577);
						((Dynamic_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(578);
						int_result(0);
						}
						break;
					case 7:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(579);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(580);
						((Dynamic_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(581);
						float_result(0);
						}
						break;
					}
					} 
				}
				setState(586);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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

	public static class Dynamic_Context extends ParserRuleContext {
		public Id_Context id_() {
			return getRuleContext(Id_Context.class,0);
		}
		public Function_call_assignmentContext function_call_assignment() {
			return getRuleContext(Function_call_assignmentContext.class,0);
		}
		public Array_selectorContext array_selector() {
			return getRuleContext(Array_selectorContext.class,0);
		}
		public Dynamic_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamic_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterDynamic_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitDynamic_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitDynamic_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dynamic_Context dynamic_() throws RecognitionException {
		Dynamic_Context _localctx = new Dynamic_Context(_ctx, getState());
		enterRule(_localctx, 96, RULE_dynamic_);
		try {
			setState(590);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(587);
				id_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(588);
				function_call_assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(589);
				array_selector();
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

	public static class Int_resultContext extends ParserRuleContext {
		public Token op;
		public TerminalNode LEFT_RBRACKET() { return getToken(RubyLexerParser.LEFT_RBRACKET, 0); }
		public List<Int_resultContext> int_result() {
			return getRuleContexts(Int_resultContext.class);
		}
		public Int_resultContext int_result(int i) {
			return getRuleContext(Int_resultContext.class,i);
		}
		public TerminalNode RIGHT_RBRACKET() { return getToken(RubyLexerParser.RIGHT_RBRACKET, 0); }
		public Int_tContext int_t() {
			return getRuleContext(Int_tContext.class,0);
		}
		public TerminalNode MUL() { return getToken(RubyLexerParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(RubyLexerParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(RubyLexerParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(RubyLexerParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(RubyLexerParser.MINUS, 0); }
		public Int_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterInt_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitInt_result(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitInt_result(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_resultContext int_result() throws RecognitionException {
		return int_result(0);
	}

	private Int_resultContext int_result(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Int_resultContext _localctx = new Int_resultContext(_ctx, _parentState);
		Int_resultContext _prevctx = _localctx;
		int _startState = 98;
		enterRecursionRule(_localctx, 98, RULE_int_result, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_RBRACKET:
				{
				setState(593);
				match(LEFT_RBRACKET);
				setState(594);
				int_result(0);
				setState(595);
				match(RIGHT_RBRACKET);
				}
				break;
			case INT:
				{
				setState(597);
				int_t();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(608);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(606);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
					case 1:
						{
						_localctx = new Int_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_int_result);
						setState(600);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(601);
						((Int_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((Int_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(602);
						int_result(5);
						}
						break;
					case 2:
						{
						_localctx = new Int_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_int_result);
						setState(603);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(604);
						((Int_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((Int_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(605);
						int_result(4);
						}
						break;
					}
					} 
				}
				setState(610);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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

	public static class Float_resultContext extends ParserRuleContext {
		public Token op;
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public List<Float_resultContext> float_result() {
			return getRuleContexts(Float_resultContext.class);
		}
		public Float_resultContext float_result(int i) {
			return getRuleContext(Float_resultContext.class,i);
		}
		public TerminalNode MUL() { return getToken(RubyLexerParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(RubyLexerParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(RubyLexerParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(RubyLexerParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(RubyLexerParser.MINUS, 0); }
		public TerminalNode LEFT_RBRACKET() { return getToken(RubyLexerParser.LEFT_RBRACKET, 0); }
		public TerminalNode RIGHT_RBRACKET() { return getToken(RubyLexerParser.RIGHT_RBRACKET, 0); }
		public Float_tContext float_t() {
			return getRuleContext(Float_tContext.class,0);
		}
		public Float_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterFloat_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitFloat_result(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitFloat_result(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Float_resultContext float_result() throws RecognitionException {
		return float_result(0);
	}

	private Float_resultContext float_result(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Float_resultContext _localctx = new Float_resultContext(_ctx, _parentState);
		Float_resultContext _prevctx = _localctx;
		int _startState = 100;
		enterRecursionRule(_localctx, 100, RULE_float_result, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(612);
				int_result(0);
				setState(613);
				((Float_resultContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
					((Float_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(614);
				float_result(7);
				}
				break;
			case 2:
				{
				setState(616);
				int_result(0);
				setState(617);
				((Float_resultContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((Float_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(618);
				float_result(4);
				}
				break;
			case 3:
				{
				setState(620);
				match(LEFT_RBRACKET);
				setState(621);
				float_result(0);
				setState(622);
				match(RIGHT_RBRACKET);
				}
				break;
			case 4:
				{
				setState(624);
				float_t();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(641);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(639);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
					case 1:
						{
						_localctx = new Float_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_float_result);
						setState(627);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(628);
						((Float_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((Float_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(629);
						float_result(9);
						}
						break;
					case 2:
						{
						_localctx = new Float_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_float_result);
						setState(630);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(631);
						((Float_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((Float_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(632);
						float_result(6);
						}
						break;
					case 3:
						{
						_localctx = new Float_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_float_result);
						setState(633);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(634);
						((Float_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((Float_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(635);
						int_result(0);
						}
						break;
					case 4:
						{
						_localctx = new Float_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_float_result);
						setState(636);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(637);
						((Float_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((Float_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(638);
						int_result(0);
						}
						break;
					}
					} 
				}
				setState(643);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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

	public static class String_resultContext extends ParserRuleContext {
		public Token op;
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public List<String_resultContext> string_result() {
			return getRuleContexts(String_resultContext.class);
		}
		public String_resultContext string_result(int i) {
			return getRuleContext(String_resultContext.class,i);
		}
		public TerminalNode MUL() { return getToken(RubyLexerParser.MUL, 0); }
		public TerminalNode PLUS() { return getToken(RubyLexerParser.PLUS, 0); }
		public String_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterString_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitString_result(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitString_result(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_resultContext string_result() throws RecognitionException {
		return string_result(0);
	}

	private String_resultContext string_result(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		String_resultContext _localctx = new String_resultContext(_ctx, _parentState);
		String_resultContext _prevctx = _localctx;
		int _startState = 102;
		enterRecursionRule(_localctx, 102, RULE_string_result, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(645);
			int_result(0);
			setState(646);
			((String_resultContext)_localctx).op = match(MUL);
			setState(647);
			string_result(2);
			}
			_ctx.stop = _input.LT(-1);
			setState(657);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(655);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						_localctx = new String_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_string_result);
						setState(649);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(650);
						((String_resultContext)_localctx).op = match(PLUS);
						setState(651);
						string_result(2);
						}
						break;
					case 2:
						{
						_localctx = new String_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_string_result);
						setState(652);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(653);
						((String_resultContext)_localctx).op = match(MUL);
						setState(654);
						int_result(0);
						}
						break;
					}
					} 
				}
				setState(659);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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

	public static class Comparison_listContext extends ParserRuleContext {
		public ComparisonContext left;
		public Token op;
		public Comparison_listContext right;
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public TerminalNode AND() { return getToken(RubyLexerParser.AND, 0); }
		public Comparison_listContext comparison_list() {
			return getRuleContext(Comparison_listContext.class,0);
		}
		public TerminalNode OR() { return getToken(RubyLexerParser.OR, 0); }
		public TerminalNode LEFT_RBRACKET() { return getToken(RubyLexerParser.LEFT_RBRACKET, 0); }
		public TerminalNode RIGHT_RBRACKET() { return getToken(RubyLexerParser.RIGHT_RBRACKET, 0); }
		public Comparison_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterComparison_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitComparison_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitComparison_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comparison_listContext comparison_list() throws RecognitionException {
		Comparison_listContext _localctx = new Comparison_listContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_comparison_list);
		try {
			setState(673);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(660);
				((Comparison_listContext)_localctx).left = comparison();
				setState(661);
				((Comparison_listContext)_localctx).op = match(AND);
				setState(662);
				((Comparison_listContext)_localctx).right = comparison_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(664);
				((Comparison_listContext)_localctx).left = comparison();
				setState(665);
				((Comparison_listContext)_localctx).op = match(OR);
				setState(666);
				((Comparison_listContext)_localctx).right = comparison_list();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(668);
				match(LEFT_RBRACKET);
				setState(669);
				comparison_list();
				setState(670);
				match(RIGHT_RBRACKET);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(672);
				comparison();
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

	public static class ComparisonContext extends ParserRuleContext {
		public Comp_varContext left;
		public Token op;
		public Comp_varContext right;
		public List<Comp_varContext> comp_var() {
			return getRuleContexts(Comp_varContext.class);
		}
		public Comp_varContext comp_var(int i) {
			return getRuleContext(Comp_varContext.class,i);
		}
		public TerminalNode LESS() { return getToken(RubyLexerParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(RubyLexerParser.GREATER, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(RubyLexerParser.LESS_EQUAL, 0); }
		public TerminalNode GREATER_EQUAL() { return getToken(RubyLexerParser.GREATER_EQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(RubyLexerParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(RubyLexerParser.NOT_EQUAL, 0); }
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_comparison);
		int _la;
		try {
			setState(683);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(675);
				((ComparisonContext)_localctx).left = comp_var();
				setState(676);
				((ComparisonContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATER) | (1L << LESS) | (1L << LESS_EQUAL) | (1L << GREATER_EQUAL))) != 0)) ) {
					((ComparisonContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(677);
				((ComparisonContext)_localctx).right = comp_var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(679);
				((ComparisonContext)_localctx).left = comp_var();
				setState(680);
				((ComparisonContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==EQUAL || _la==NOT_EQUAL) ) {
					((ComparisonContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(681);
				((ComparisonContext)_localctx).right = comp_var();
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

	public static class Comp_varContext extends ParserRuleContext {
		public All_resultContext all_result() {
			return getRuleContext(All_resultContext.class,0);
		}
		public Array_selectorContext array_selector() {
			return getRuleContext(Array_selectorContext.class,0);
		}
		public Id_Context id_() {
			return getRuleContext(Id_Context.class,0);
		}
		public Comp_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterComp_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitComp_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitComp_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_varContext comp_var() throws RecognitionException {
		Comp_varContext _localctx = new Comp_varContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_comp_var);
		try {
			setState(688);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(685);
				all_result();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(686);
				array_selector();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(687);
				id_();
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

	public static class LvalueContext extends ParserRuleContext {
		public Id_Context id_() {
			return getRuleContext(Id_Context.class,0);
		}
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterLvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitLvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitLvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LvalueContext lvalue() throws RecognitionException {
		LvalueContext _localctx = new LvalueContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_lvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
			id_();
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

	public static class RvalueContext extends ParserRuleContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public Initial_array_assignmentContext initial_array_assignment() {
			return getRuleContext(Initial_array_assignmentContext.class,0);
		}
		public Array_assignmentContext array_assignment() {
			return getRuleContext(Array_assignmentContext.class,0);
		}
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public Float_resultContext float_result() {
			return getRuleContext(Float_resultContext.class,0);
		}
		public String_resultContext string_result() {
			return getRuleContext(String_resultContext.class,0);
		}
		public Global_setContext global_set() {
			return getRuleContext(Global_setContext.class,0);
		}
		public Global_getContext global_get() {
			return getRuleContext(Global_getContext.class,0);
		}
		public Dynamic_assignmentContext dynamic_assignment() {
			return getRuleContext(Dynamic_assignmentContext.class,0);
		}
		public String_assignmentContext string_assignment() {
			return getRuleContext(String_assignmentContext.class,0);
		}
		public Float_assignmentContext float_assignment() {
			return getRuleContext(Float_assignmentContext.class,0);
		}
		public Int_assignmentContext int_assignment() {
			return getRuleContext(Int_assignmentContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Bool_tContext bool_t() {
			return getRuleContext(Bool_tContext.class,0);
		}
		public Float_tContext float_t() {
			return getRuleContext(Float_tContext.class,0);
		}
		public Int_tContext int_t() {
			return getRuleContext(Int_tContext.class,0);
		}
		public Nil_tContext nil_t() {
			return getRuleContext(Nil_tContext.class,0);
		}
		public TerminalNode NOT() { return getToken(RubyLexerParser.NOT, 0); }
		public List<RvalueContext> rvalue() {
			return getRuleContexts(RvalueContext.class);
		}
		public RvalueContext rvalue(int i) {
			return getRuleContext(RvalueContext.class,i);
		}
		public TerminalNode LEFT_RBRACKET() { return getToken(RubyLexerParser.LEFT_RBRACKET, 0); }
		public TerminalNode RIGHT_RBRACKET() { return getToken(RubyLexerParser.RIGHT_RBRACKET, 0); }
		public TerminalNode EXP() { return getToken(RubyLexerParser.EXP, 0); }
		public TerminalNode MUL() { return getToken(RubyLexerParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(RubyLexerParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(RubyLexerParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(RubyLexerParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(RubyLexerParser.MINUS, 0); }
		public TerminalNode LESS() { return getToken(RubyLexerParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(RubyLexerParser.GREATER, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(RubyLexerParser.LESS_EQUAL, 0); }
		public TerminalNode GREATER_EQUAL() { return getToken(RubyLexerParser.GREATER_EQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(RubyLexerParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(RubyLexerParser.NOT_EQUAL, 0); }
		public TerminalNode OR() { return getToken(RubyLexerParser.OR, 0); }
		public TerminalNode AND() { return getToken(RubyLexerParser.AND, 0); }
		public RvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterRvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitRvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitRvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RvalueContext rvalue() throws RecognitionException {
		return rvalue(0);
	}

	private RvalueContext rvalue(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RvalueContext _localctx = new RvalueContext(_ctx, _parentState);
		RvalueContext _prevctx = _localctx;
		int _startState = 112;
		enterRecursionRule(_localctx, 112, RULE_rvalue, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(693);
				lvalue();
				}
				break;
			case 2:
				{
				setState(694);
				initial_array_assignment();
				}
				break;
			case 3:
				{
				setState(695);
				array_assignment();
				}
				break;
			case 4:
				{
				setState(696);
				int_result(0);
				}
				break;
			case 5:
				{
				setState(697);
				float_result(0);
				}
				break;
			case 6:
				{
				setState(698);
				string_result(0);
				}
				break;
			case 7:
				{
				setState(699);
				global_set();
				}
				break;
			case 8:
				{
				setState(700);
				global_get();
				}
				break;
			case 9:
				{
				setState(701);
				dynamic_assignment();
				}
				break;
			case 10:
				{
				setState(702);
				string_assignment();
				}
				break;
			case 11:
				{
				setState(703);
				float_assignment();
				}
				break;
			case 12:
				{
				setState(704);
				int_assignment();
				}
				break;
			case 13:
				{
				setState(705);
				assignment();
				}
				break;
			case 14:
				{
				setState(706);
				function_call();
				}
				break;
			case 15:
				{
				setState(707);
				bool_t();
				}
				break;
			case 16:
				{
				setState(708);
				float_t();
				}
				break;
			case 17:
				{
				setState(709);
				int_t();
				}
				break;
			case 18:
				{
				setState(710);
				nil_t();
				}
				break;
			case 19:
				{
				setState(711);
				match(NOT);
				setState(712);
				rvalue(7);
				}
				break;
			case 20:
				{
				setState(713);
				match(LEFT_RBRACKET);
				setState(714);
				rvalue(0);
				setState(715);
				match(RIGHT_RBRACKET);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(739);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(737);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
					case 1:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(719);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(720);
						match(EXP);
						setState(721);
						rvalue(9);
						}
						break;
					case 2:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(722);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(723);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(724);
						rvalue(7);
						}
						break;
					case 3:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(725);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(726);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(727);
						rvalue(6);
						}
						break;
					case 4:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(728);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(729);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATER) | (1L << LESS) | (1L << LESS_EQUAL) | (1L << GREATER_EQUAL))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(730);
						rvalue(5);
						}
						break;
					case 5:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(731);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(732);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOT_EQUAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(733);
						rvalue(4);
						}
						break;
					case 6:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(734);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(735);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(736);
						rvalue(3);
						}
						break;
					}
					} 
				}
				setState(741);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
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

	public static class Break_expressionContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(RubyLexerParser.BREAK, 0); }
		public Break_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterBreak_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitBreak_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitBreak_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_expressionContext break_expression() throws RecognitionException {
		Break_expressionContext _localctx = new Break_expressionContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_break_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(742);
			match(BREAK);
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

	public static class Float_tContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(RubyLexerParser.FLOAT, 0); }
		public Float_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterFloat_t(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitFloat_t(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitFloat_t(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Float_tContext float_t() throws RecognitionException {
		Float_tContext _localctx = new Float_tContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_float_t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			match(FLOAT);
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

	public static class Int_tContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(RubyLexerParser.INT, 0); }
		public Int_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterInt_t(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitInt_t(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitInt_t(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_tContext int_t() throws RecognitionException {
		Int_tContext _localctx = new Int_tContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_int_t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			match(INT);
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

	public static class Bool_tContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(RubyLexerParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(RubyLexerParser.FALSE, 0); }
		public Bool_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterBool_t(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitBool_t(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitBool_t(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_tContext bool_t() throws RecognitionException {
		Bool_tContext _localctx = new Bool_tContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_bool_t);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	public static class Nil_tContext extends ParserRuleContext {
		public TerminalNode NIL() { return getToken(RubyLexerParser.NIL, 0); }
		public Nil_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nil_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterNil_t(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitNil_t(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitNil_t(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nil_tContext nil_t() throws RecognitionException {
		Nil_tContext _localctx = new Nil_tContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_nil_t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(750);
			match(NIL);
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

	public static class Id_Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RubyLexerParser.ID, 0); }
		public Id_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterId_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitId_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitId_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_Context id_() throws RecognitionException {
		Id_Context _localctx = new Id_Context(_ctx, getState());
		enterRule(_localctx, 124, RULE_id_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			match(ID);
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

	public static class Id_globalContext extends ParserRuleContext {
		public TerminalNode ID_GLOBAL() { return getToken(RubyLexerParser.ID_GLOBAL, 0); }
		public Id_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterId_global(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitId_global(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitId_global(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_globalContext id_global() throws RecognitionException {
		Id_globalContext _localctx = new Id_globalContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_id_global);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
			match(ID_GLOBAL);
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

	public static class TerminatorContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(RubyLexerParser.SEMICOLON, 0); }
		public CrlfContext crlf() {
			return getRuleContext(CrlfContext.class,0);
		}
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public TerminatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterTerminator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitTerminator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitTerminator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminatorContext terminator() throws RecognitionException {
		return terminator(0);
	}

	private TerminatorContext terminator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TerminatorContext _localctx = new TerminatorContext(_ctx, _parentState);
		TerminatorContext _prevctx = _localctx;
		int _startState = 128;
		enterRecursionRule(_localctx, 128, RULE_terminator, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(759);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMICOLON:
				{
				setState(757);
				match(SEMICOLON);
				}
				break;
			case CRLF:
				{
				setState(758);
				crlf();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(767);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(765);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
					case 1:
						{
						_localctx = new TerminatorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_terminator);
						setState(761);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(762);
						match(SEMICOLON);
						}
						break;
					case 2:
						{
						_localctx = new TerminatorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_terminator);
						setState(763);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(764);
						crlf();
						}
						break;
					}
					} 
				}
				setState(769);
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

	public static class Else_tokenContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(RubyLexerParser.ELSE, 0); }
		public Else_tokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterElse_token(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitElse_token(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitElse_token(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_tokenContext else_token() throws RecognitionException {
		Else_tokenContext _localctx = new Else_tokenContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_else_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(770);
			match(ELSE);
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

	public static class CrlfContext extends ParserRuleContext {
		public TerminalNode CRLF() { return getToken(RubyLexerParser.CRLF, 0); }
		public CrlfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crlf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).enterCrlf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyLexerListener ) ((RubyLexerListener)listener).exitCrlf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyLexerVisitor ) return ((RubyLexerVisitor<? extends T>)visitor).visitCrlf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrlfContext crlf() throws RecognitionException {
		CrlfContext _localctx = new CrlfContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_crlf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
			match(CRLF);
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
		case 1:
			return expression_list_sempred((Expression_listContext)_localctx, predIndex);
		case 12:
			return function_definition_params_list_sempred((Function_definition_params_listContext)_localctx, predIndex);
		case 17:
			return function_call_params_sempred((Function_call_paramsContext)_localctx, predIndex);
		case 31:
			return for_init_list_sempred((For_init_listContext)_localctx, predIndex);
		case 34:
			return for_loop_list_sempred((For_loop_listContext)_localctx, predIndex);
		case 36:
			return statement_expression_list_sempred((Statement_expression_listContext)_localctx, predIndex);
		case 45:
			return array_definition_elements_sempred((Array_definition_elementsContext)_localctx, predIndex);
		case 47:
			return dynamic_result_sempred((Dynamic_resultContext)_localctx, predIndex);
		case 49:
			return int_result_sempred((Int_resultContext)_localctx, predIndex);
		case 50:
			return float_result_sempred((Float_resultContext)_localctx, predIndex);
		case 51:
			return string_result_sempred((String_resultContext)_localctx, predIndex);
		case 56:
			return rvalue_sempred((RvalueContext)_localctx, predIndex);
		case 64:
			return terminator_sempred((TerminatorContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_list_sempred(Expression_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean function_definition_params_list_sempred(Function_definition_params_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean function_call_params_sempred(Function_call_paramsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean for_init_list_sempred(For_init_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean for_loop_list_sempred(For_loop_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean statement_expression_list_sempred(Statement_expression_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean array_definition_elements_sempred(Array_definition_elementsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean dynamic_result_sempred(Dynamic_resultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 10);
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 14);
		case 12:
			return precpred(_ctx, 12);
		case 13:
			return precpred(_ctx, 9);
		case 14:
			return precpred(_ctx, 7);
		case 15:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean int_result_sempred(Int_resultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return precpred(_ctx, 4);
		case 17:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean float_result_sempred(Float_resultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 8);
		case 19:
			return precpred(_ctx, 5);
		case 20:
			return precpred(_ctx, 6);
		case 21:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean string_result_sempred(String_resultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22:
			return precpred(_ctx, 1);
		case 23:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean rvalue_sempred(RvalueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 24:
			return precpred(_ctx, 8);
		case 25:
			return precpred(_ctx, 6);
		case 26:
			return precpred(_ctx, 5);
		case 27:
			return precpred(_ctx, 4);
		case 28:
			return precpred(_ctx, 3);
		case 29:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean terminator_sempred(TerminatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 30:
			return precpred(_ctx, 4);
		case 31:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00013\u0307\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u008e\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u0094\b\u0001\n\u0001"+
		"\f\u0001\u0097\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00a1\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u00be\b\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00c9\b\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00d1\b\f\n\f\f\f\u00d4"+
		"\t\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00e7"+
		"\b\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00f1\b\u0011\n\u0011\f\u0011"+
		"\u00f4\t\u0011\u0001\u0012\u0001\u0012\u0003\u0012\u00f8\b\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00fe\b\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u0106\b\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u010f\b\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u0126\b\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u013e\b\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0003\u001a\u0156\b\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0003\u001c\u0174\b\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u017c\b\u001e\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005"+
		"\u001f\u0184\b\u001f\n\u001f\f\u001f\u0187\t\u001f\u0001 \u0001 \u0001"+
		"!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0005\"\u0193"+
		"\b\"\n\"\f\"\u0196\t\"\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0003$\u01a3\b$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0005$\u01b0\b$\n$"+
		"\f$\u01b3\t$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003"+
		"%\u01bd\b%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003"+
		"&\u01c7\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0003\'\u01d1\b\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001("+
		"\u0001(\u0003(\u01db\b(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0003)\u01e5\b)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001+\u0001"+
		"+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001-\u0001-\u0001-\u0003"+
		"-\u01f7\b-\u0001-\u0001-\u0001-\u0001-\u0003-\u01fd\b-\u0005-\u01ff\b"+
		"-\n-\f-\u0202\t-\u0001.\u0001.\u0001.\u0001.\u0003.\u0208\b.\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0003.\u0210\b.\u0001.\u0001.\u0003.\u0214"+
		"\b.\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0003/\u0230\b/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0005"+
		"/\u0247\b/\n/\f/\u024a\t/\u00010\u00010\u00010\u00030\u024f\b0\u00011"+
		"\u00011\u00011\u00011\u00011\u00011\u00031\u0257\b1\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00051\u025f\b1\n1\f1\u0262\t1\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00032\u0272\b2\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00052\u0280\b2\n2\f2\u0283\t2\u0001"+
		"3\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u0001"+
		"3\u00053\u0290\b3\n3\f3\u0293\t3\u00014\u00014\u00014\u00014\u00014\u0001"+
		"4\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00034\u02a2\b4\u0001"+
		"5\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u00035\u02ac\b5\u0001"+
		"6\u00016\u00016\u00036\u02b1\b6\u00017\u00017\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00038\u02ce\b8\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00058\u02e2\b8\n8\f8\u02e5\t8\u00019\u00019\u0001:\u0001:\u0001"+
		";\u0001;\u0001<\u0001<\u0001=\u0001=\u0001>\u0001>\u0001?\u0001?\u0001"+
		"@\u0001@\u0001@\u0003@\u02f8\b@\u0001@\u0001@\u0001@\u0001@\u0005@\u02fe"+
		"\b@\n@\f@\u0301\t@\u0001A\u0001A\u0001B\u0001B\u0001B\u0000\r\u0002\u0018"+
		"\">DHZ^bdfp\u0080C\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfh"+
		"jlnprtvxz|~\u0080\u0082\u0084\u0000\u0007\u0001\u0000\u001f$\u0001\u0000"+
		"\u0014\u0016\u0001\u0000\u0012\u0013\u0001\u0000\u001a\u001d\u0001\u0000"+
		"\u0018\u0019\u0001\u0000%&\u0001\u0000\u0010\u0011\u0337\u0000\u0086\u0001"+
		"\u0000\u0000\u0000\u0002\u008d\u0001\u0000\u0000\u0000\u0004\u00a0\u0001"+
		"\u0000\u0000\u0000\u0006\u00a2\u0001\u0000\u0000\u0000\b\u00a6\u0001\u0000"+
		"\u0000\u0000\n\u00aa\u0001\u0000\u0000\u0000\f\u00ac\u0001\u0000\u0000"+
		"\u0000\u000e\u00ae\u0001\u0000\u0000\u0000\u0010\u00b2\u0001\u0000\u0000"+
		"\u0000\u0012\u00bd\u0001\u0000\u0000\u0000\u0014\u00bf\u0001\u0000\u0000"+
		"\u0000\u0016\u00c8\u0001\u0000\u0000\u0000\u0018\u00ca\u0001\u0000\u0000"+
		"\u0000\u001a\u00d5\u0001\u0000\u0000\u0000\u001c\u00d7\u0001\u0000\u0000"+
		"\u0000\u001e\u00e6\u0001\u0000\u0000\u0000 \u00e8\u0001\u0000\u0000\u0000"+
		"\"\u00ea\u0001\u0000\u0000\u0000$\u00f7\u0001\u0000\u0000\u0000&\u00fd"+
		"\u0001\u0000\u0000\u0000(\u00ff\u0001\u0000\u0000\u0000*\u0107\u0001\u0000"+
		"\u0000\u0000,\u010e\u0001\u0000\u0000\u0000.\u0110\u0001\u0000\u0000\u0000"+
		"0\u0125\u0001\u0000\u0000\u00002\u013d\u0001\u0000\u0000\u00004\u0155"+
		"\u0001\u0000\u0000\u00006\u0157\u0001\u0000\u0000\u00008\u0173\u0001\u0000"+
		"\u0000\u0000:\u0175\u0001\u0000\u0000\u0000<\u017b\u0001\u0000\u0000\u0000"+
		">\u017d\u0001\u0000\u0000\u0000@\u0188\u0001\u0000\u0000\u0000B\u018a"+
		"\u0001\u0000\u0000\u0000D\u018c\u0001\u0000\u0000\u0000F\u0197\u0001\u0000"+
		"\u0000\u0000H\u01a2\u0001\u0000\u0000\u0000J\u01bc\u0001\u0000\u0000\u0000"+
		"L\u01c6\u0001\u0000\u0000\u0000N\u01d0\u0001\u0000\u0000\u0000P\u01da"+
		"\u0001\u0000\u0000\u0000R\u01e4\u0001\u0000\u0000\u0000T\u01e6\u0001\u0000"+
		"\u0000\u0000V\u01eb\u0001\u0000\u0000\u0000X\u01ef\u0001\u0000\u0000\u0000"+
		"Z\u01f3\u0001\u0000\u0000\u0000\\\u0213\u0001\u0000\u0000\u0000^\u022f"+
		"\u0001\u0000\u0000\u0000`\u024e\u0001\u0000\u0000\u0000b\u0256\u0001\u0000"+
		"\u0000\u0000d\u0271\u0001\u0000\u0000\u0000f\u0284\u0001\u0000\u0000\u0000"+
		"h\u02a1\u0001\u0000\u0000\u0000j\u02ab\u0001\u0000\u0000\u0000l\u02b0"+
		"\u0001\u0000\u0000\u0000n\u02b2\u0001\u0000\u0000\u0000p\u02cd\u0001\u0000"+
		"\u0000\u0000r\u02e6\u0001\u0000\u0000\u0000t\u02e8\u0001\u0000\u0000\u0000"+
		"v\u02ea\u0001\u0000\u0000\u0000x\u02ec\u0001\u0000\u0000\u0000z\u02ee"+
		"\u0001\u0000\u0000\u0000|\u02f0\u0001\u0000\u0000\u0000~\u02f2\u0001\u0000"+
		"\u0000\u0000\u0080\u02f7\u0001\u0000\u0000\u0000\u0082\u0302\u0001\u0000"+
		"\u0000\u0000\u0084\u0304\u0001\u0000\u0000\u0000\u0086\u0087\u0003\u0002"+
		"\u0001\u0000\u0087\u0001\u0001\u0000\u0000\u0000\u0088\u0089\u0006\u0001"+
		"\uffff\uffff\u0000\u0089\u008a\u0003\u0004\u0002\u0000\u008a\u008b\u0003"+
		"\u0080@\u0000\u008b\u008e\u0001\u0000\u0000\u0000\u008c\u008e\u0003\u0080"+
		"@\u0000\u008d\u0088\u0001\u0000\u0000\u0000\u008d\u008c\u0001\u0000\u0000"+
		"\u0000\u008e\u0095\u0001\u0000\u0000\u0000\u008f\u0090\n\u0002\u0000\u0000"+
		"\u0090\u0091\u0003\u0004\u0002\u0000\u0091\u0092\u0003\u0080@\u0000\u0092"+
		"\u0094\u0001\u0000\u0000\u0000\u0093\u008f\u0001\u0000\u0000\u0000\u0094"+
		"\u0097\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095"+
		"\u0096\u0001\u0000\u0000\u0000\u0096\u0003\u0001\u0000\u0000\u0000\u0097"+
		"\u0095\u0001\u0000\u0000\u0000\u0098\u00a1\u0003\u000e\u0007\u0000\u0099"+
		"\u00a1\u0003\f\u0006\u0000\u009a\u00a1\u00032\u0019\u0000\u009b\u00a1"+
		"\u00034\u001a\u0000\u009c\u00a1\u0003p8\u0000\u009d\u00a1\u0003\u001c"+
		"\u000e\u0000\u009e\u00a1\u00036\u001b\u0000\u009f\u00a1\u00038\u001c\u0000"+
		"\u00a0\u0098\u0001\u0000\u0000\u0000\u00a0\u0099\u0001\u0000\u0000\u0000"+
		"\u00a0\u009a\u0001\u0000\u0000\u0000\u00a0\u009b\u0001\u0000\u0000\u0000"+
		"\u00a0\u009c\u0001\u0000\u0000\u0000\u00a0\u009d\u0001\u0000\u0000\u0000"+
		"\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u009f\u0001\u0000\u0000\u0000"+
		"\u00a1\u0005\u0001\u0000\u0000\u0000\u00a2\u00a3\u0003n7\u0000\u00a3\u00a4"+
		"\u0005\u001e\u0000\u0000\u00a4\u00a5\u0003~?\u0000\u00a5\u0007\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a7\u0003~?\u0000\u00a7\u00a8\u0005\u001e\u0000\u0000"+
		"\u00a8\u00a9\u0003,\u0016\u0000\u00a9\t\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ab\u0003~?\u0000\u00ab\u000b\u0001\u0000\u0000\u0000\u00ac\u00ad\u0003"+
		"\u001e\u000f\u0000\u00ad\r\u0001\u0000\u0000\u0000\u00ae\u00af\u0003\u0012"+
		"\t\u0000\u00af\u00b0\u0003\u0010\b\u0000\u00b0\u00b1\u0005\u0005\u0000"+
		"\u0000\u00b1\u000f\u0001\u0000\u0000\u0000\u00b2\u00b3\u0003\u0002\u0001"+
		"\u0000\u00b3\u0011\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005\u0006\u0000"+
		"\u0000\u00b5\u00b6\u0003\u0014\n\u0000\u00b6\u00b7\u0003\u0084B\u0000"+
		"\u00b7\u00be\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005\u0006\u0000\u0000"+
		"\u00b9\u00ba\u0003\u0014\n\u0000\u00ba\u00bb\u0003\u0016\u000b\u0000\u00bb"+
		"\u00bc\u0003\u0084B\u0000\u00bc\u00be\u0001\u0000\u0000\u0000\u00bd\u00b4"+
		"\u0001\u0000\u0000\u0000\u00bd\u00b8\u0001\u0000\u0000\u0000\u00be\u0013"+
		"\u0001\u0000\u0000\u0000\u00bf\u00c0\u0003|>\u0000\u00c0\u0015\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c2\u0005(\u0000\u0000\u00c2\u00c9\u0005)\u0000\u0000"+
		"\u00c3\u00c4\u0005(\u0000\u0000\u00c4\u00c5\u0003\u0018\f\u0000\u00c5"+
		"\u00c6\u0005)\u0000\u0000\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7\u00c9"+
		"\u0003\u0018\f\u0000\u00c8\u00c1\u0001\u0000\u0000\u0000\u00c8\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c9\u0017\u0001"+
		"\u0000\u0000\u0000\u00ca\u00cb\u0006\f\uffff\uffff\u0000\u00cb\u00cc\u0003"+
		"\u001a\r\u0000\u00cc\u00d2\u0001\u0000\u0000\u0000\u00cd\u00ce\n\u0001"+
		"\u0000\u0000\u00ce\u00cf\u0005\u0001\u0000\u0000\u00cf\u00d1\u0003\u001a"+
		"\r\u0000\u00d0\u00cd\u0001\u0000\u0000\u0000\u00d1\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000"+
		"\u0000\u00d3\u0019\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d6\u0003|>\u0000\u00d6\u001b\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d8\u0005\u0007\u0000\u0000\u00d8\u00d9\u0003,\u0016\u0000\u00d9\u001d"+
		"\u0001\u0000\u0000\u0000\u00da\u00db\u0003\u0014\n\u0000\u00db\u00dc\u0005"+
		"(\u0000\u0000\u00dc\u00dd\u0003 \u0010\u0000\u00dd\u00de\u0005)\u0000"+
		"\u0000\u00de\u00e7\u0001\u0000\u0000\u0000\u00df\u00e0\u0003\u0014\n\u0000"+
		"\u00e0\u00e1\u0003 \u0010\u0000\u00e1\u00e7\u0001\u0000\u0000\u0000\u00e2"+
		"\u00e3\u0003\u0014\n\u0000\u00e3\u00e4\u0005(\u0000\u0000\u00e4\u00e5"+
		"\u0005)\u0000\u0000\u00e5\u00e7\u0001\u0000\u0000\u0000\u00e6\u00da\u0001"+
		"\u0000\u0000\u0000\u00e6\u00df\u0001\u0000\u0000\u0000\u00e6\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e7\u001f\u0001\u0000\u0000\u0000\u00e8\u00e9\u0003"+
		"\"\u0011\u0000\u00e9!\u0001\u0000\u0000\u0000\u00ea\u00eb\u0006\u0011"+
		"\uffff\uffff\u0000\u00eb\u00ec\u0003$\u0012\u0000\u00ec\u00f2\u0001\u0000"+
		"\u0000\u0000\u00ed\u00ee\n\u0001\u0000\u0000\u00ee\u00ef\u0005\u0001\u0000"+
		"\u0000\u00ef\u00f1\u0003$\u0012\u0000\u00f0\u00ed\u0001\u0000\u0000\u0000"+
		"\u00f1\u00f4\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3#\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f5\u00f8\u0003&\u0013\u0000\u00f6\u00f8"+
		"\u0003(\u0014\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f7\u00f6\u0001"+
		"\u0000\u0000\u0000\u00f8%\u0001\u0000\u0000\u0000\u00f9\u00fe\u0003b1"+
		"\u0000\u00fa\u00fe\u0003d2\u0000\u00fb\u00fe\u0003f3\u0000\u00fc\u00fe"+
		"\u0003^/\u0000\u00fd\u00f9\u0001\u0000\u0000\u0000\u00fd\u00fa\u0001\u0000"+
		"\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fc\u0001\u0000"+
		"\u0000\u0000\u00fe\'\u0001\u0000\u0000\u0000\u00ff\u0100\u0003|>\u0000"+
		"\u0100\u0105\u0005\u001e\u0000\u0000\u0101\u0106\u0003b1\u0000\u0102\u0106"+
		"\u0003d2\u0000\u0103\u0106\u0003f3\u0000\u0104\u0106\u0003^/\u0000\u0105"+
		"\u0101\u0001\u0000\u0000\u0000\u0105\u0102\u0001\u0000\u0000\u0000\u0105"+
		"\u0103\u0001\u0000\u0000\u0000\u0105\u0104\u0001\u0000\u0000\u0000\u0106"+
		")\u0001\u0000\u0000\u0000\u0107\u0108\u0003\u001e\u000f\u0000\u0108+\u0001"+
		"\u0000\u0000\u0000\u0109\u010f\u0003b1\u0000\u010a\u010f\u0003d2\u0000"+
		"\u010b\u010f\u0003f3\u0000\u010c\u010f\u0003^/\u0000\u010d\u010f\u0003"+
		"\n\u0005\u0000\u010e\u0109\u0001\u0000\u0000\u0000\u010e\u010a\u0001\u0000"+
		"\u0000\u0000\u010e\u010b\u0001\u0000\u0000\u0000\u010e\u010c\u0001\u0000"+
		"\u0000\u0000\u010e\u010d\u0001\u0000\u0000\u0000\u010f-\u0001\u0000\u0000"+
		"\u0000\u0110\u0111\u00030\u0018\u0000\u0111/\u0001\u0000\u0000\u0000\u0112"+
		"\u0113\u0005\n\u0000\u0000\u0113\u0114\u0003@ \u0000\u0114\u0115\u0003"+
		"\u0084B\u0000\u0115\u0116\u0003F#\u0000\u0116\u0126\u0001\u0000\u0000"+
		"\u0000\u0117\u0118\u0005\n\u0000\u0000\u0118\u0119\u0003@ \u0000\u0119"+
		"\u011a\u0003\u0084B\u0000\u011a\u011b\u0003F#\u0000\u011b\u011c\u0003"+
		"\u0082A\u0000\u011c\u011d\u0003\u0084B\u0000\u011d\u011e\u0003F#\u0000"+
		"\u011e\u0126\u0001\u0000\u0000\u0000\u011f\u0120\u0005\n\u0000\u0000\u0120"+
		"\u0121\u0003@ \u0000\u0121\u0122\u0003\u0084B\u0000\u0122\u0123\u0003"+
		"F#\u0000\u0123\u0124\u00030\u0018\u0000\u0124\u0126\u0001\u0000\u0000"+
		"\u0000\u0125\u0112\u0001\u0000\u0000\u0000\u0125\u0117\u0001\u0000\u0000"+
		"\u0000\u0125\u011f\u0001\u0000\u0000\u0000\u01261\u0001\u0000\u0000\u0000"+
		"\u0127\u0128\u0005\b\u0000\u0000\u0128\u0129\u0003@ \u0000\u0129\u012a"+
		"\u0003\u0084B\u0000\u012a\u012b\u0003F#\u0000\u012b\u012c\u0005\u0005"+
		"\u0000\u0000\u012c\u013e\u0001\u0000\u0000\u0000\u012d\u012e\u0005\b\u0000"+
		"\u0000\u012e\u012f\u0003@ \u0000\u012f\u0130\u0003\u0084B\u0000\u0130"+
		"\u0131\u0003F#\u0000\u0131\u0132\u0003\u0082A\u0000\u0132\u0133\u0003"+
		"\u0084B\u0000\u0133\u0134\u0003F#\u0000\u0134\u0135\u0005\u0005\u0000"+
		"\u0000\u0135\u013e\u0001\u0000\u0000\u0000\u0136\u0137\u0005\b\u0000\u0000"+
		"\u0137\u0138\u0003@ \u0000\u0138\u0139\u0003\u0084B\u0000\u0139\u013a"+
		"\u0003F#\u0000\u013a\u013b\u0003.\u0017\u0000\u013b\u013c\u0005\u0005"+
		"\u0000\u0000\u013c\u013e\u0001\u0000\u0000\u0000\u013d\u0127\u0001\u0000"+
		"\u0000\u0000\u013d\u012d\u0001\u0000\u0000\u0000\u013d\u0136\u0001\u0000"+
		"\u0000\u0000\u013e3\u0001\u0000\u0000\u0000\u013f\u0140\u0005\u000b\u0000"+
		"\u0000\u0140\u0141\u0003@ \u0000\u0141\u0142\u0003\u0084B\u0000\u0142"+
		"\u0143\u0003F#\u0000\u0143\u0144\u0005\u0005\u0000\u0000\u0144\u0156\u0001"+
		"\u0000\u0000\u0000\u0145\u0146\u0005\u000b\u0000\u0000\u0146\u0147\u0003"+
		"@ \u0000\u0147\u0148\u0003\u0084B\u0000\u0148\u0149\u0003F#\u0000\u0149"+
		"\u014a\u0003\u0082A\u0000\u014a\u014b\u0003\u0084B\u0000\u014b\u014c\u0003"+
		"F#\u0000\u014c\u014d\u0005\u0005\u0000\u0000\u014d\u0156\u0001\u0000\u0000"+
		"\u0000\u014e\u014f\u0005\u000b\u0000\u0000\u014f\u0150\u0003@ \u0000\u0150"+
		"\u0151\u0003\u0084B\u0000\u0151\u0152\u0003F#\u0000\u0152\u0153\u0003"+
		".\u0017\u0000\u0153\u0154\u0005\u0005\u0000\u0000\u0154\u0156\u0001\u0000"+
		"\u0000\u0000\u0155\u013f\u0001\u0000\u0000\u0000\u0155\u0145\u0001\u0000"+
		"\u0000\u0000\u0155\u014e\u0001\u0000\u0000\u0000\u01565\u0001\u0000\u0000"+
		"\u0000\u0157\u0158\u0005\f\u0000\u0000\u0158\u0159\u0003@ \u0000\u0159"+
		"\u015a\u0003\u0084B\u0000\u015a\u015b\u0003F#\u0000\u015b\u015c\u0005"+
		"\u0005\u0000\u0000\u015c7\u0001\u0000\u0000\u0000\u015d\u015e\u0005\u000f"+
		"\u0000\u0000\u015e\u015f\u0005(\u0000\u0000\u015f\u0160\u0003:\u001d\u0000"+
		"\u0160\u0161\u0005\u0002\u0000\u0000\u0161\u0162\u0003@ \u0000\u0162\u0163"+
		"\u0005\u0002\u0000\u0000\u0163\u0164\u0003B!\u0000\u0164\u0165\u0005)"+
		"\u0000\u0000\u0165\u0166\u0003\u0084B\u0000\u0166\u0167\u0003F#\u0000"+
		"\u0167\u0168\u0005\u0005\u0000\u0000\u0168\u0174\u0001\u0000\u0000\u0000"+
		"\u0169\u016a\u0005\u000f\u0000\u0000\u016a\u016b\u0003:\u001d\u0000\u016b"+
		"\u016c\u0005\u0002\u0000\u0000\u016c\u016d\u0003@ \u0000\u016d\u016e\u0005"+
		"\u0002\u0000\u0000\u016e\u016f\u0003B!\u0000\u016f\u0170\u0003\u0084B"+
		"\u0000\u0170\u0171\u0003F#\u0000\u0171\u0172\u0005\u0005\u0000\u0000\u0172"+
		"\u0174\u0001\u0000\u0000\u0000\u0173\u015d\u0001\u0000\u0000\u0000\u0173"+
		"\u0169\u0001\u0000\u0000\u0000\u01749\u0001\u0000\u0000\u0000\u0175\u0176"+
		"\u0003>\u001f\u0000\u0176;\u0001\u0000\u0000\u0000\u0177\u017c\u0003N"+
		"\'\u0000\u0178\u017c\u0003P(\u0000\u0179\u017c\u0003R)\u0000\u017a\u017c"+
		"\u0003L&\u0000\u017b\u0177\u0001\u0000\u0000\u0000\u017b\u0178\u0001\u0000"+
		"\u0000\u0000\u017b\u0179\u0001\u0000\u0000\u0000\u017b\u017a\u0001\u0000"+
		"\u0000\u0000\u017c=\u0001\u0000\u0000\u0000\u017d\u017e\u0006\u001f\uffff"+
		"\uffff\u0000\u017e\u017f\u0003<\u001e\u0000\u017f\u0185\u0001\u0000\u0000"+
		"\u0000\u0180\u0181\n\u0002\u0000\u0000\u0181\u0182\u0005\u0001\u0000\u0000"+
		"\u0182\u0184\u0003<\u001e\u0000\u0183\u0180\u0001\u0000\u0000\u0000\u0184"+
		"\u0187\u0001\u0000\u0000\u0000\u0185\u0183\u0001\u0000\u0000\u0000\u0185"+
		"\u0186\u0001\u0000\u0000\u0000\u0186?\u0001\u0000\u0000\u0000\u0187\u0185"+
		"\u0001\u0000\u0000\u0000\u0188\u0189\u0003h4\u0000\u0189A\u0001\u0000"+
		"\u0000\u0000\u018a\u018b\u0003D\"\u0000\u018bC\u0001\u0000\u0000\u0000"+
		"\u018c\u018d\u0006\"\uffff\uffff\u0000\u018d\u018e\u0003<\u001e\u0000"+
		"\u018e\u0194\u0001\u0000\u0000\u0000\u018f\u0190\n\u0002\u0000\u0000\u0190"+
		"\u0191\u0005\u0001\u0000\u0000\u0191\u0193\u0003<\u001e\u0000\u0192\u018f"+
		"\u0001\u0000\u0000\u0000\u0193\u0196\u0001\u0000\u0000\u0000\u0194\u0192"+
		"\u0001\u0000\u0000\u0000\u0194\u0195\u0001\u0000\u0000\u0000\u0195E\u0001"+
		"\u0000\u0000\u0000\u0196\u0194\u0001\u0000\u0000\u0000\u0197\u0198\u0003"+
		"H$\u0000\u0198G\u0001\u0000\u0000\u0000\u0199\u019a\u0006$\uffff\uffff"+
		"\u0000\u019a\u019b\u0003\u0004\u0002\u0000\u019b\u019c\u0003\u0080@\u0000"+
		"\u019c\u01a3\u0001\u0000\u0000\u0000\u019d\u019e\u0005\r\u0000\u0000\u019e"+
		"\u01a3\u0003\u0080@\u0000\u019f\u01a0\u0003r9\u0000\u01a0\u01a1\u0003"+
		"\u0080@\u0000\u01a1\u01a3\u0001\u0000\u0000\u0000\u01a2\u0199\u0001\u0000"+
		"\u0000\u0000\u01a2\u019d\u0001\u0000\u0000\u0000\u01a2\u019f\u0001\u0000"+
		"\u0000\u0000\u01a3\u01b1\u0001\u0000\u0000\u0000\u01a4\u01a5\n\u0003\u0000"+
		"\u0000\u01a5\u01a6\u0003\u0004\u0002\u0000\u01a6\u01a7\u0003\u0080@\u0000"+
		"\u01a7\u01b0\u0001\u0000\u0000\u0000\u01a8\u01a9\n\u0002\u0000\u0000\u01a9"+
		"\u01aa\u0005\r\u0000\u0000\u01aa\u01b0\u0003\u0080@\u0000\u01ab\u01ac"+
		"\n\u0001\u0000\u0000\u01ac\u01ad\u0003r9\u0000\u01ad\u01ae\u0003\u0080"+
		"@\u0000\u01ae\u01b0\u0001\u0000\u0000\u0000\u01af\u01a4\u0001\u0000\u0000"+
		"\u0000\u01af\u01a8\u0001\u0000\u0000\u0000\u01af\u01ab\u0001\u0000\u0000"+
		"\u0000\u01b0\u01b3\u0001\u0000\u0000\u0000\u01b1\u01af\u0001\u0000\u0000"+
		"\u0000\u01b1\u01b2\u0001\u0000\u0000\u0000\u01b2I\u0001\u0000\u0000\u0000"+
		"\u01b3\u01b1\u0001\u0000\u0000\u0000\u01b4\u01b5\u0003n7\u0000\u01b5\u01b6"+
		"\u0005\u001e\u0000\u0000\u01b6\u01b7\u0003p8\u0000\u01b7\u01bd\u0001\u0000"+
		"\u0000\u0000\u01b8\u01b9\u0003n7\u0000\u01b9\u01ba\u0007\u0000\u0000\u0000"+
		"\u01ba\u01bb\u0003p8\u0000\u01bb\u01bd\u0001\u0000\u0000\u0000\u01bc\u01b4"+
		"\u0001\u0000\u0000\u0000\u01bc\u01b8\u0001\u0000\u0000\u0000\u01bdK\u0001"+
		"\u0000\u0000\u0000\u01be\u01bf\u0003n7\u0000\u01bf\u01c0\u0005\u001e\u0000"+
		"\u0000\u01c0\u01c1\u0003^/\u0000\u01c1\u01c7\u0001\u0000\u0000\u0000\u01c2"+
		"\u01c3\u0003n7\u0000\u01c3\u01c4\u0007\u0000\u0000\u0000\u01c4\u01c5\u0003"+
		"^/\u0000\u01c5\u01c7\u0001\u0000\u0000\u0000\u01c6\u01be\u0001\u0000\u0000"+
		"\u0000\u01c6\u01c2\u0001\u0000\u0000\u0000\u01c7M\u0001\u0000\u0000\u0000"+
		"\u01c8\u01c9\u0003n7\u0000\u01c9\u01ca\u0005\u001e\u0000\u0000\u01ca\u01cb"+
		"\u0003b1\u0000\u01cb\u01d1\u0001\u0000\u0000\u0000\u01cc\u01cd\u0003n"+
		"7\u0000\u01cd\u01ce\u0007\u0000\u0000\u0000\u01ce\u01cf\u0003b1\u0000"+
		"\u01cf\u01d1\u0001\u0000\u0000\u0000\u01d0\u01c8\u0001\u0000\u0000\u0000"+
		"\u01d0\u01cc\u0001\u0000\u0000\u0000\u01d1O\u0001\u0000\u0000\u0000\u01d2"+
		"\u01d3\u0003n7\u0000\u01d3\u01d4\u0005\u001e\u0000\u0000\u01d4\u01d5\u0003"+
		"d2\u0000\u01d5\u01db\u0001\u0000\u0000\u0000\u01d6\u01d7\u0003n7\u0000"+
		"\u01d7\u01d8\u0007\u0000\u0000\u0000\u01d8\u01d9\u0003d2\u0000\u01d9\u01db"+
		"\u0001\u0000\u0000\u0000\u01da\u01d2\u0001\u0000\u0000\u0000\u01da\u01d6"+
		"\u0001\u0000\u0000\u0000\u01dbQ\u0001\u0000\u0000\u0000\u01dc\u01dd\u0003"+
		"n7\u0000\u01dd\u01de\u0005\u001e\u0000\u0000\u01de\u01df\u0003f3\u0000"+
		"\u01df\u01e5\u0001\u0000\u0000\u0000\u01e0\u01e1\u0003n7\u0000\u01e1\u01e2"+
		"\u0005\u001f\u0000\u0000\u01e2\u01e3\u0003f3\u0000\u01e3\u01e5\u0001\u0000"+
		"\u0000\u0000\u01e4\u01dc\u0001\u0000\u0000\u0000\u01e4\u01e0\u0001\u0000"+
		"\u0000\u0000\u01e5S\u0001\u0000\u0000\u0000\u01e6\u01e7\u0003n7\u0000"+
		"\u01e7\u01e8\u0005\u001e\u0000\u0000\u01e8\u01e9\u0005*\u0000\u0000\u01e9"+
		"\u01ea\u0005+\u0000\u0000\u01eaU\u0001\u0000\u0000\u0000\u01eb\u01ec\u0003"+
		"\\.\u0000\u01ec\u01ed\u0005\u001e\u0000\u0000\u01ed\u01ee\u0003,\u0016"+
		"\u0000\u01eeW\u0001\u0000\u0000\u0000\u01ef\u01f0\u0005*\u0000\u0000\u01f0"+
		"\u01f1\u0003Z-\u0000\u01f1\u01f2\u0005+\u0000\u0000\u01f2Y\u0001\u0000"+
		"\u0000\u0000\u01f3\u01f6\u0006-\uffff\uffff\u0000\u01f4\u01f7\u0003b1"+
		"\u0000\u01f5\u01f7\u0003^/\u0000\u01f6\u01f4\u0001\u0000\u0000\u0000\u01f6"+
		"\u01f5\u0001\u0000\u0000\u0000\u01f7\u0200\u0001\u0000\u0000\u0000\u01f8"+
		"\u01f9\n\u0001\u0000\u0000\u01f9\u01fc\u0005\u0001\u0000\u0000\u01fa\u01fd"+
		"\u0003b1\u0000\u01fb\u01fd\u0003^/\u0000\u01fc\u01fa\u0001\u0000\u0000"+
		"\u0000\u01fc\u01fb\u0001\u0000\u0000\u0000\u01fd\u01ff\u0001\u0000\u0000"+
		"\u0000\u01fe\u01f8\u0001\u0000\u0000\u0000\u01ff\u0202\u0001\u0000\u0000"+
		"\u0000\u0200\u01fe\u0001\u0000\u0000\u0000\u0200\u0201\u0001\u0000\u0000"+
		"\u0000\u0201[\u0001\u0000\u0000\u0000\u0202\u0200\u0001\u0000\u0000\u0000"+
		"\u0203\u0204\u0003|>\u0000\u0204\u0207\u0005*\u0000\u0000\u0205\u0208"+
		"\u0003b1\u0000\u0206\u0208\u0003^/\u0000\u0207\u0205\u0001\u0000\u0000"+
		"\u0000\u0207\u0206\u0001\u0000\u0000\u0000\u0208\u0209\u0001\u0000\u0000"+
		"\u0000\u0209\u020a\u0005+\u0000\u0000\u020a\u0214\u0001\u0000\u0000\u0000"+
		"\u020b\u020c\u0003~?\u0000\u020c\u020f\u0005*\u0000\u0000\u020d\u0210"+
		"\u0003b1\u0000\u020e\u0210\u0003^/\u0000\u020f\u020d\u0001\u0000\u0000"+
		"\u0000\u020f\u020e\u0001\u0000\u0000\u0000\u0210\u0211\u0001\u0000\u0000"+
		"\u0000\u0211\u0212\u0005+\u0000\u0000\u0212\u0214\u0001\u0000\u0000\u0000"+
		"\u0213\u0203\u0001\u0000\u0000\u0000\u0213\u020b\u0001\u0000\u0000\u0000"+
		"\u0214]\u0001\u0000\u0000\u0000\u0215\u0216\u0006/\uffff\uffff\u0000\u0216"+
		"\u0217\u0003b1\u0000\u0217\u0218\u0007\u0001\u0000\u0000\u0218\u0219\u0003"+
		"^/\r\u0219\u0230\u0001\u0000\u0000\u0000\u021a\u021b\u0003d2\u0000\u021b"+
		"\u021c\u0007\u0001\u0000\u0000\u021c\u021d\u0003^/\u000b\u021d\u0230\u0001"+
		"\u0000\u0000\u0000\u021e\u021f\u0003f3\u0000\u021f\u0220\u0005\u0014\u0000"+
		"\u0000\u0220\u0221\u0003^/\b\u0221\u0230\u0001\u0000\u0000\u0000\u0222"+
		"\u0223\u0003b1\u0000\u0223\u0224\u0007\u0002\u0000\u0000\u0224\u0225\u0003"+
		"^/\u0006\u0225\u0230\u0001\u0000\u0000\u0000\u0226\u0227\u0003d2\u0000"+
		"\u0227\u0228\u0007\u0002\u0000\u0000\u0228\u0229\u0003^/\u0004\u0229\u0230"+
		"\u0001\u0000\u0000\u0000\u022a\u022b\u0005(\u0000\u0000\u022b\u022c\u0003"+
		"^/\u0000\u022c\u022d\u0005)\u0000\u0000\u022d\u0230\u0001\u0000\u0000"+
		"\u0000\u022e\u0230\u0003`0\u0000\u022f\u0215\u0001\u0000\u0000\u0000\u022f"+
		"\u021a\u0001\u0000\u0000\u0000\u022f\u021e\u0001\u0000\u0000\u0000\u022f"+
		"\u0222\u0001\u0000\u0000\u0000\u022f\u0226\u0001\u0000\u0000\u0000\u022f"+
		"\u022a\u0001\u0000\u0000\u0000\u022f\u022e\u0001\u0000\u0000\u0000\u0230"+
		"\u0248\u0001\u0000\u0000\u0000\u0231\u0232\n\n\u0000\u0000\u0232\u0233"+
		"\u0007\u0001\u0000\u0000\u0233\u0247\u0003^/\u000b\u0234\u0235\n\u0003"+
		"\u0000\u0000\u0235\u0236\u0007\u0002\u0000\u0000\u0236\u0247\u0003^/\u0004"+
		"\u0237\u0238\n\u000e\u0000\u0000\u0238\u0239\u0007\u0001\u0000\u0000\u0239"+
		"\u0247\u0003b1\u0000\u023a\u023b\n\f\u0000\u0000\u023b\u023c\u0007\u0001"+
		"\u0000\u0000\u023c\u0247\u0003d2\u0000\u023d\u023e\n\t\u0000\u0000\u023e"+
		"\u023f\u0005\u0014\u0000\u0000\u023f\u0247\u0003f3\u0000\u0240\u0241\n"+
		"\u0007\u0000\u0000\u0241\u0242\u0007\u0002\u0000\u0000\u0242\u0247\u0003"+
		"b1\u0000\u0243\u0244\n\u0005\u0000\u0000\u0244\u0245\u0007\u0002\u0000"+
		"\u0000\u0245\u0247\u0003d2\u0000\u0246\u0231\u0001\u0000\u0000\u0000\u0246"+
		"\u0234\u0001\u0000\u0000\u0000\u0246\u0237\u0001\u0000\u0000\u0000\u0246"+
		"\u023a\u0001\u0000\u0000\u0000\u0246\u023d\u0001\u0000\u0000\u0000\u0246"+
		"\u0240\u0001\u0000\u0000\u0000\u0246\u0243\u0001\u0000\u0000\u0000\u0247"+
		"\u024a\u0001\u0000\u0000\u0000\u0248\u0246\u0001\u0000\u0000\u0000\u0248"+
		"\u0249\u0001\u0000\u0000\u0000\u0249_\u0001\u0000\u0000\u0000\u024a\u0248"+
		"\u0001\u0000\u0000\u0000\u024b\u024f\u0003|>\u0000\u024c\u024f\u0003*"+
		"\u0015\u0000\u024d\u024f\u0003\\.\u0000\u024e\u024b\u0001\u0000\u0000"+
		"\u0000\u024e\u024c\u0001\u0000\u0000\u0000\u024e\u024d\u0001\u0000\u0000"+
		"\u0000\u024fa\u0001\u0000\u0000\u0000\u0250\u0251\u00061\uffff\uffff\u0000"+
		"\u0251\u0252\u0005(\u0000\u0000\u0252\u0253\u0003b1\u0000\u0253\u0254"+
		"\u0005)\u0000\u0000\u0254\u0257\u0001\u0000\u0000\u0000\u0255\u0257\u0003"+
		"v;\u0000\u0256\u0250\u0001\u0000\u0000\u0000\u0256\u0255\u0001\u0000\u0000"+
		"\u0000\u0257\u0260\u0001\u0000\u0000\u0000\u0258\u0259\n\u0004\u0000\u0000"+
		"\u0259\u025a\u0007\u0001\u0000\u0000\u025a\u025f\u0003b1\u0005\u025b\u025c"+
		"\n\u0003\u0000\u0000\u025c\u025d\u0007\u0002\u0000\u0000\u025d\u025f\u0003"+
		"b1\u0004\u025e\u0258\u0001\u0000\u0000\u0000\u025e\u025b\u0001\u0000\u0000"+
		"\u0000\u025f\u0262\u0001\u0000\u0000\u0000\u0260\u025e\u0001\u0000\u0000"+
		"\u0000\u0260\u0261\u0001\u0000\u0000\u0000\u0261c\u0001\u0000\u0000\u0000"+
		"\u0262\u0260\u0001\u0000\u0000\u0000\u0263\u0264\u00062\uffff\uffff\u0000"+
		"\u0264\u0265\u0003b1\u0000\u0265\u0266\u0007\u0001\u0000\u0000\u0266\u0267"+
		"\u0003d2\u0007\u0267\u0272\u0001\u0000\u0000\u0000\u0268\u0269\u0003b"+
		"1\u0000\u0269\u026a\u0007\u0002\u0000\u0000\u026a\u026b\u0003d2\u0004"+
		"\u026b\u0272\u0001\u0000\u0000\u0000\u026c\u026d\u0005(\u0000\u0000\u026d"+
		"\u026e\u0003d2\u0000\u026e\u026f\u0005)\u0000\u0000\u026f\u0272\u0001"+
		"\u0000\u0000\u0000\u0270\u0272\u0003t:\u0000\u0271\u0263\u0001\u0000\u0000"+
		"\u0000\u0271\u0268\u0001\u0000\u0000\u0000\u0271\u026c\u0001\u0000\u0000"+
		"\u0000\u0271\u0270\u0001\u0000\u0000\u0000\u0272\u0281\u0001\u0000\u0000"+
		"\u0000\u0273\u0274\n\b\u0000\u0000\u0274\u0275\u0007\u0001\u0000\u0000"+
		"\u0275\u0280\u0003d2\t\u0276\u0277\n\u0005\u0000\u0000\u0277\u0278\u0007"+
		"\u0002\u0000\u0000\u0278\u0280\u0003d2\u0006\u0279\u027a\n\u0006\u0000"+
		"\u0000\u027a\u027b\u0007\u0001\u0000\u0000\u027b\u0280\u0003b1\u0000\u027c"+
		"\u027d\n\u0003\u0000\u0000\u027d\u027e\u0007\u0002\u0000\u0000\u027e\u0280"+
		"\u0003b1\u0000\u027f\u0273\u0001\u0000\u0000\u0000\u027f\u0276\u0001\u0000"+
		"\u0000\u0000\u027f\u0279\u0001\u0000\u0000\u0000\u027f\u027c\u0001\u0000"+
		"\u0000\u0000\u0280\u0283\u0001\u0000\u0000\u0000\u0281\u027f\u0001\u0000"+
		"\u0000\u0000\u0281\u0282\u0001\u0000\u0000\u0000\u0282e\u0001\u0000\u0000"+
		"\u0000\u0283\u0281\u0001\u0000\u0000\u0000\u0284\u0285\u00063\uffff\uffff"+
		"\u0000\u0285\u0286\u0003b1\u0000\u0286\u0287\u0005\u0014\u0000\u0000\u0287"+
		"\u0288\u0003f3\u0002\u0288\u0291\u0001\u0000\u0000\u0000\u0289\u028a\n"+
		"\u0001\u0000\u0000\u028a\u028b\u0005\u0012\u0000\u0000\u028b\u0290\u0003"+
		"f3\u0002\u028c\u028d\n\u0003\u0000\u0000\u028d\u028e\u0005\u0014\u0000"+
		"\u0000\u028e\u0290\u0003b1\u0000\u028f\u0289\u0001\u0000\u0000\u0000\u028f"+
		"\u028c\u0001\u0000\u0000\u0000\u0290\u0293\u0001\u0000\u0000\u0000\u0291"+
		"\u028f\u0001\u0000\u0000\u0000\u0291\u0292\u0001\u0000\u0000\u0000\u0292"+
		"g\u0001\u0000\u0000\u0000\u0293\u0291\u0001\u0000\u0000\u0000\u0294\u0295"+
		"\u0003j5\u0000\u0295\u0296\u0005%\u0000\u0000\u0296\u0297\u0003h4\u0000"+
		"\u0297\u02a2\u0001\u0000\u0000\u0000\u0298\u0299\u0003j5\u0000\u0299\u029a"+
		"\u0005&\u0000\u0000\u029a\u029b\u0003h4\u0000\u029b\u02a2\u0001\u0000"+
		"\u0000\u0000\u029c\u029d\u0005(\u0000\u0000\u029d\u029e\u0003h4\u0000"+
		"\u029e\u029f\u0005)\u0000\u0000\u029f\u02a2\u0001\u0000\u0000\u0000\u02a0"+
		"\u02a2\u0003j5\u0000\u02a1\u0294\u0001\u0000\u0000\u0000\u02a1\u0298\u0001"+
		"\u0000\u0000\u0000\u02a1\u029c\u0001\u0000\u0000\u0000\u02a1\u02a0\u0001"+
		"\u0000\u0000\u0000\u02a2i\u0001\u0000\u0000\u0000\u02a3\u02a4\u0003l6"+
		"\u0000\u02a4\u02a5\u0007\u0003\u0000\u0000\u02a5\u02a6\u0003l6\u0000\u02a6"+
		"\u02ac\u0001\u0000\u0000\u0000\u02a7\u02a8\u0003l6\u0000\u02a8\u02a9\u0007"+
		"\u0004\u0000\u0000\u02a9\u02aa\u0003l6\u0000\u02aa\u02ac\u0001\u0000\u0000"+
		"\u0000\u02ab\u02a3\u0001\u0000\u0000\u0000\u02ab\u02a7\u0001\u0000\u0000"+
		"\u0000\u02ack\u0001\u0000\u0000\u0000\u02ad\u02b1\u0003,\u0016\u0000\u02ae"+
		"\u02b1\u0003\\.\u0000\u02af\u02b1\u0003|>\u0000\u02b0\u02ad\u0001\u0000"+
		"\u0000\u0000\u02b0\u02ae\u0001\u0000\u0000\u0000\u02b0\u02af\u0001\u0000"+
		"\u0000\u0000\u02b1m\u0001\u0000\u0000\u0000\u02b2\u02b3\u0003|>\u0000"+
		"\u02b3o\u0001\u0000\u0000\u0000\u02b4\u02b5\u00068\uffff\uffff\u0000\u02b5"+
		"\u02ce\u0003n7\u0000\u02b6\u02ce\u0003T*\u0000\u02b7\u02ce\u0003V+\u0000"+
		"\u02b8\u02ce\u0003b1\u0000\u02b9\u02ce\u0003d2\u0000\u02ba\u02ce\u0003"+
		"f3\u0000\u02bb\u02ce\u0003\b\u0004\u0000\u02bc\u02ce\u0003\u0006\u0003"+
		"\u0000\u02bd\u02ce\u0003L&\u0000\u02be\u02ce\u0003R)\u0000\u02bf\u02ce"+
		"\u0003P(\u0000\u02c0\u02ce\u0003N\'\u0000\u02c1\u02ce\u0003J%\u0000\u02c2"+
		"\u02ce\u0003\u001e\u000f\u0000\u02c3\u02ce\u0003x<\u0000\u02c4\u02ce\u0003"+
		"t:\u0000\u02c5\u02ce\u0003v;\u0000\u02c6\u02ce\u0003z=\u0000\u02c7\u02c8"+
		"\u0005\'\u0000\u0000\u02c8\u02ce\u0003p8\u0007\u02c9\u02ca\u0005(\u0000"+
		"\u0000\u02ca\u02cb\u0003p8\u0000\u02cb\u02cc\u0005)\u0000\u0000\u02cc"+
		"\u02ce\u0001\u0000\u0000\u0000\u02cd\u02b4\u0001\u0000\u0000\u0000\u02cd"+
		"\u02b6\u0001\u0000\u0000\u0000\u02cd\u02b7\u0001\u0000\u0000\u0000\u02cd"+
		"\u02b8\u0001\u0000\u0000\u0000\u02cd\u02b9\u0001\u0000\u0000\u0000\u02cd"+
		"\u02ba\u0001\u0000\u0000\u0000\u02cd\u02bb\u0001\u0000\u0000\u0000\u02cd"+
		"\u02bc\u0001\u0000\u0000\u0000\u02cd\u02bd\u0001\u0000\u0000\u0000\u02cd"+
		"\u02be\u0001\u0000\u0000\u0000\u02cd\u02bf\u0001\u0000\u0000\u0000\u02cd"+
		"\u02c0\u0001\u0000\u0000\u0000\u02cd\u02c1\u0001\u0000\u0000\u0000\u02cd"+
		"\u02c2\u0001\u0000\u0000\u0000\u02cd\u02c3\u0001\u0000\u0000\u0000\u02cd"+
		"\u02c4\u0001\u0000\u0000\u0000\u02cd\u02c5\u0001\u0000\u0000\u0000\u02cd"+
		"\u02c6\u0001\u0000\u0000\u0000\u02cd\u02c7\u0001\u0000\u0000\u0000\u02cd"+
		"\u02c9\u0001\u0000\u0000\u0000\u02ce\u02e3\u0001\u0000\u0000\u0000\u02cf"+
		"\u02d0\n\b\u0000\u0000\u02d0\u02d1\u0005\u0017\u0000\u0000\u02d1\u02e2"+
		"\u0003p8\t\u02d2\u02d3\n\u0006\u0000\u0000\u02d3\u02d4\u0007\u0001\u0000"+
		"\u0000\u02d4\u02e2\u0003p8\u0007\u02d5\u02d6\n\u0005\u0000\u0000\u02d6"+
		"\u02d7\u0007\u0002\u0000\u0000\u02d7\u02e2\u0003p8\u0006\u02d8\u02d9\n"+
		"\u0004\u0000\u0000\u02d9\u02da\u0007\u0003\u0000\u0000\u02da\u02e2\u0003"+
		"p8\u0005\u02db\u02dc\n\u0003\u0000\u0000\u02dc\u02dd\u0007\u0004\u0000"+
		"\u0000\u02dd\u02e2\u0003p8\u0004\u02de\u02df\n\u0002\u0000\u0000\u02df"+
		"\u02e0\u0007\u0005\u0000\u0000\u02e0\u02e2\u0003p8\u0003\u02e1\u02cf\u0001"+
		"\u0000\u0000\u0000\u02e1\u02d2\u0001\u0000\u0000\u0000\u02e1\u02d5\u0001"+
		"\u0000\u0000\u0000\u02e1\u02d8\u0001\u0000\u0000\u0000\u02e1\u02db\u0001"+
		"\u0000\u0000\u0000\u02e1\u02de\u0001\u0000\u0000\u0000\u02e2\u02e5\u0001"+
		"\u0000\u0000\u0000\u02e3\u02e1\u0001\u0000\u0000\u0000\u02e3\u02e4\u0001"+
		"\u0000\u0000\u0000\u02e4q\u0001\u0000\u0000\u0000\u02e5\u02e3\u0001\u0000"+
		"\u0000\u0000\u02e6\u02e7\u0005\u000e\u0000\u0000\u02e7s\u0001\u0000\u0000"+
		"\u0000\u02e8\u02e9\u00051\u0000\u0000\u02e9u\u0001\u0000\u0000\u0000\u02ea"+
		"\u02eb\u00050\u0000\u0000\u02ebw\u0001\u0000\u0000\u0000\u02ec\u02ed\u0007"+
		"\u0006\u0000\u0000\u02edy\u0001\u0000\u0000\u0000\u02ee\u02ef\u0005,\u0000"+
		"\u0000\u02ef{\u0001\u0000\u0000\u0000\u02f0\u02f1\u00052\u0000\u0000\u02f1"+
		"}\u0001\u0000\u0000\u0000\u02f2\u02f3\u00053\u0000\u0000\u02f3\u007f\u0001"+
		"\u0000\u0000\u0000\u02f4\u02f5\u0006@\uffff\uffff\u0000\u02f5\u02f8\u0005"+
		"\u0002\u0000\u0000\u02f6\u02f8\u0003\u0084B\u0000\u02f7\u02f4\u0001\u0000"+
		"\u0000\u0000\u02f7\u02f6\u0001\u0000\u0000\u0000\u02f8\u02ff\u0001\u0000"+
		"\u0000\u0000\u02f9\u02fa\n\u0004\u0000\u0000\u02fa\u02fe\u0005\u0002\u0000"+
		"\u0000\u02fb\u02fc\n\u0003\u0000\u0000\u02fc\u02fe\u0003\u0084B\u0000"+
		"\u02fd\u02f9\u0001\u0000\u0000\u0000\u02fd\u02fb\u0001\u0000\u0000\u0000"+
		"\u02fe\u0301\u0001\u0000\u0000\u0000\u02ff\u02fd\u0001\u0000\u0000\u0000"+
		"\u02ff\u0300\u0001\u0000\u0000\u0000\u0300\u0081\u0001\u0000\u0000\u0000"+
		"\u0301\u02ff\u0001\u0000\u0000\u0000\u0302\u0303\u0005\t\u0000\u0000\u0303"+
		"\u0083\u0001\u0000\u0000\u0000\u0304\u0305\u0005\u0003\u0000\u0000\u0305"+
		"\u0085\u0001\u0000\u0000\u00006\u008d\u0095\u00a0\u00bd\u00c8\u00d2\u00e6"+
		"\u00f2\u00f7\u00fd\u0105\u010e\u0125\u013d\u0155\u0173\u017b\u0185\u0194"+
		"\u01a2\u01af\u01b1\u01bc\u01c6\u01d0\u01da\u01e4\u01f6\u01fc\u0200\u0207"+
		"\u020f\u0213\u022f\u0246\u0248\u024e\u0256\u025e\u0260\u0271\u027f\u0281"+
		"\u028f\u0291\u02a1\u02ab\u02b0\u02cd\u02e1\u02e3\u02f7\u02fd\u02ff";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}