// Generated from C:/Informatyka_i_systemy_inteligentne/ROK II/Sem_4/Teoria_kompilacji_i_kompilatory/Project\RubyLexer.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RubyLexerParser}.
 */
public interface RubyLexerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(RubyLexerParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(RubyLexerParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list(RubyLexerParser.Expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list(RubyLexerParser.Expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(RubyLexerParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(RubyLexerParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#global_get}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_get(RubyLexerParser.Global_getContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#global_get}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_get(RubyLexerParser.Global_getContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#global_set}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_set(RubyLexerParser.Global_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#global_set}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_set(RubyLexerParser.Global_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#global_result}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_result(RubyLexerParser.Global_resultContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#global_result}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_result(RubyLexerParser.Global_resultContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#function_inline_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_inline_call(RubyLexerParser.Function_inline_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#function_inline_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_inline_call(RubyLexerParser.Function_inline_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition(RubyLexerParser.Function_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition(RubyLexerParser.Function_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#function_definition_body}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition_body(RubyLexerParser.Function_definition_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#function_definition_body}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition_body(RubyLexerParser.Function_definition_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#function_definition_header}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition_header(RubyLexerParser.Function_definition_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#function_definition_header}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition_header(RubyLexerParser.Function_definition_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(RubyLexerParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(RubyLexerParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#function_definition_params}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition_params(RubyLexerParser.Function_definition_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#function_definition_params}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition_params(RubyLexerParser.Function_definition_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#function_definition_params_list}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition_params_list(RubyLexerParser.Function_definition_params_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#function_definition_params_list}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition_params_list(RubyLexerParser.Function_definition_params_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#function_definition_param_id}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition_param_id(RubyLexerParser.Function_definition_param_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#function_definition_param_id}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition_param_id(RubyLexerParser.Function_definition_param_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(RubyLexerParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(RubyLexerParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(RubyLexerParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(RubyLexerParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#function_call_param_list}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_param_list(RubyLexerParser.Function_call_param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#function_call_param_list}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_param_list(RubyLexerParser.Function_call_param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#function_call_params}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_params(RubyLexerParser.Function_call_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#function_call_params}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_params(RubyLexerParser.Function_call_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#function_param}.
	 * @param ctx the parse tree
	 */
	void enterFunction_param(RubyLexerParser.Function_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#function_param}.
	 * @param ctx the parse tree
	 */
	void exitFunction_param(RubyLexerParser.Function_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#function_unnamed_param}.
	 * @param ctx the parse tree
	 */
	void enterFunction_unnamed_param(RubyLexerParser.Function_unnamed_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#function_unnamed_param}.
	 * @param ctx the parse tree
	 */
	void exitFunction_unnamed_param(RubyLexerParser.Function_unnamed_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#function_named_param}.
	 * @param ctx the parse tree
	 */
	void enterFunction_named_param(RubyLexerParser.Function_named_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#function_named_param}.
	 * @param ctx the parse tree
	 */
	void exitFunction_named_param(RubyLexerParser.Function_named_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#function_call_assignment}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_assignment(RubyLexerParser.Function_call_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#function_call_assignment}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_assignment(RubyLexerParser.Function_call_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#all_result}.
	 * @param ctx the parse tree
	 */
	void enterAll_result(RubyLexerParser.All_resultContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#all_result}.
	 * @param ctx the parse tree
	 */
	void exitAll_result(RubyLexerParser.All_resultContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#elsif_statement}.
	 * @param ctx the parse tree
	 */
	void enterElsif_statement(RubyLexerParser.Elsif_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#elsif_statement}.
	 * @param ctx the parse tree
	 */
	void exitElsif_statement(RubyLexerParser.Elsif_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#if_elsif_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_elsif_statement(RubyLexerParser.If_elsif_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#if_elsif_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_elsif_statement(RubyLexerParser.If_elsif_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(RubyLexerParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(RubyLexerParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#unless_statement}.
	 * @param ctx the parse tree
	 */
	void enterUnless_statement(RubyLexerParser.Unless_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#unless_statement}.
	 * @param ctx the parse tree
	 */
	void exitUnless_statement(RubyLexerParser.Unless_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(RubyLexerParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(RubyLexerParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(RubyLexerParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(RubyLexerParser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#init_expression}.
	 * @param ctx the parse tree
	 */
	void enterInit_expression(RubyLexerParser.Init_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#init_expression}.
	 * @param ctx the parse tree
	 */
	void exitInit_expression(RubyLexerParser.Init_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#all_assignment}.
	 * @param ctx the parse tree
	 */
	void enterAll_assignment(RubyLexerParser.All_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#all_assignment}.
	 * @param ctx the parse tree
	 */
	void exitAll_assignment(RubyLexerParser.All_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#for_init_list}.
	 * @param ctx the parse tree
	 */
	void enterFor_init_list(RubyLexerParser.For_init_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#for_init_list}.
	 * @param ctx the parse tree
	 */
	void exitFor_init_list(RubyLexerParser.For_init_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#cond_expression}.
	 * @param ctx the parse tree
	 */
	void enterCond_expression(RubyLexerParser.Cond_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#cond_expression}.
	 * @param ctx the parse tree
	 */
	void exitCond_expression(RubyLexerParser.Cond_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#loop_expression}.
	 * @param ctx the parse tree
	 */
	void enterLoop_expression(RubyLexerParser.Loop_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#loop_expression}.
	 * @param ctx the parse tree
	 */
	void exitLoop_expression(RubyLexerParser.Loop_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#for_loop_list}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop_list(RubyLexerParser.For_loop_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#for_loop_list}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop_list(RubyLexerParser.For_loop_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#statement_body}.
	 * @param ctx the parse tree
	 */
	void enterStatement_body(RubyLexerParser.Statement_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#statement_body}.
	 * @param ctx the parse tree
	 */
	void exitStatement_body(RubyLexerParser.Statement_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#statement_expression_list}.
	 * @param ctx the parse tree
	 */
	void enterStatement_expression_list(RubyLexerParser.Statement_expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#statement_expression_list}.
	 * @param ctx the parse tree
	 */
	void exitStatement_expression_list(RubyLexerParser.Statement_expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(RubyLexerParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(RubyLexerParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#dynamic_assignment}.
	 * @param ctx the parse tree
	 */
	void enterDynamic_assignment(RubyLexerParser.Dynamic_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#dynamic_assignment}.
	 * @param ctx the parse tree
	 */
	void exitDynamic_assignment(RubyLexerParser.Dynamic_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#int_assignment}.
	 * @param ctx the parse tree
	 */
	void enterInt_assignment(RubyLexerParser.Int_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#int_assignment}.
	 * @param ctx the parse tree
	 */
	void exitInt_assignment(RubyLexerParser.Int_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#float_assignment}.
	 * @param ctx the parse tree
	 */
	void enterFloat_assignment(RubyLexerParser.Float_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#float_assignment}.
	 * @param ctx the parse tree
	 */
	void exitFloat_assignment(RubyLexerParser.Float_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#string_assignment}.
	 * @param ctx the parse tree
	 */
	void enterString_assignment(RubyLexerParser.String_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#string_assignment}.
	 * @param ctx the parse tree
	 */
	void exitString_assignment(RubyLexerParser.String_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#initial_array_assignment}.
	 * @param ctx the parse tree
	 */
	void enterInitial_array_assignment(RubyLexerParser.Initial_array_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#initial_array_assignment}.
	 * @param ctx the parse tree
	 */
	void exitInitial_array_assignment(RubyLexerParser.Initial_array_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#array_assignment}.
	 * @param ctx the parse tree
	 */
	void enterArray_assignment(RubyLexerParser.Array_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#array_assignment}.
	 * @param ctx the parse tree
	 */
	void exitArray_assignment(RubyLexerParser.Array_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#array_definition}.
	 * @param ctx the parse tree
	 */
	void enterArray_definition(RubyLexerParser.Array_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#array_definition}.
	 * @param ctx the parse tree
	 */
	void exitArray_definition(RubyLexerParser.Array_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#array_definition_elements}.
	 * @param ctx the parse tree
	 */
	void enterArray_definition_elements(RubyLexerParser.Array_definition_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#array_definition_elements}.
	 * @param ctx the parse tree
	 */
	void exitArray_definition_elements(RubyLexerParser.Array_definition_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#array_selector}.
	 * @param ctx the parse tree
	 */
	void enterArray_selector(RubyLexerParser.Array_selectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#array_selector}.
	 * @param ctx the parse tree
	 */
	void exitArray_selector(RubyLexerParser.Array_selectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#dynamic_result}.
	 * @param ctx the parse tree
	 */
	void enterDynamic_result(RubyLexerParser.Dynamic_resultContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#dynamic_result}.
	 * @param ctx the parse tree
	 */
	void exitDynamic_result(RubyLexerParser.Dynamic_resultContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#dynamic_}.
	 * @param ctx the parse tree
	 */
	void enterDynamic_(RubyLexerParser.Dynamic_Context ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#dynamic_}.
	 * @param ctx the parse tree
	 */
	void exitDynamic_(RubyLexerParser.Dynamic_Context ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#int_result}.
	 * @param ctx the parse tree
	 */
	void enterInt_result(RubyLexerParser.Int_resultContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#int_result}.
	 * @param ctx the parse tree
	 */
	void exitInt_result(RubyLexerParser.Int_resultContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#float_result}.
	 * @param ctx the parse tree
	 */
	void enterFloat_result(RubyLexerParser.Float_resultContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#float_result}.
	 * @param ctx the parse tree
	 */
	void exitFloat_result(RubyLexerParser.Float_resultContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#string_result}.
	 * @param ctx the parse tree
	 */
	void enterString_result(RubyLexerParser.String_resultContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#string_result}.
	 * @param ctx the parse tree
	 */
	void exitString_result(RubyLexerParser.String_resultContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#comparison_list}.
	 * @param ctx the parse tree
	 */
	void enterComparison_list(RubyLexerParser.Comparison_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#comparison_list}.
	 * @param ctx the parse tree
	 */
	void exitComparison_list(RubyLexerParser.Comparison_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(RubyLexerParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(RubyLexerParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#comp_var}.
	 * @param ctx the parse tree
	 */
	void enterComp_var(RubyLexerParser.Comp_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#comp_var}.
	 * @param ctx the parse tree
	 */
	void exitComp_var(RubyLexerParser.Comp_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterLvalue(RubyLexerParser.LvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitLvalue(RubyLexerParser.LvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#rvalue}.
	 * @param ctx the parse tree
	 */
	void enterRvalue(RubyLexerParser.RvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#rvalue}.
	 * @param ctx the parse tree
	 */
	void exitRvalue(RubyLexerParser.RvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#break_expression}.
	 * @param ctx the parse tree
	 */
	void enterBreak_expression(RubyLexerParser.Break_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#break_expression}.
	 * @param ctx the parse tree
	 */
	void exitBreak_expression(RubyLexerParser.Break_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#float_t}.
	 * @param ctx the parse tree
	 */
	void enterFloat_t(RubyLexerParser.Float_tContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#float_t}.
	 * @param ctx the parse tree
	 */
	void exitFloat_t(RubyLexerParser.Float_tContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#int_t}.
	 * @param ctx the parse tree
	 */
	void enterInt_t(RubyLexerParser.Int_tContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#int_t}.
	 * @param ctx the parse tree
	 */
	void exitInt_t(RubyLexerParser.Int_tContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#bool_t}.
	 * @param ctx the parse tree
	 */
	void enterBool_t(RubyLexerParser.Bool_tContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#bool_t}.
	 * @param ctx the parse tree
	 */
	void exitBool_t(RubyLexerParser.Bool_tContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#nil_t}.
	 * @param ctx the parse tree
	 */
	void enterNil_t(RubyLexerParser.Nil_tContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#nil_t}.
	 * @param ctx the parse tree
	 */
	void exitNil_t(RubyLexerParser.Nil_tContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#id_}.
	 * @param ctx the parse tree
	 */
	void enterId_(RubyLexerParser.Id_Context ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#id_}.
	 * @param ctx the parse tree
	 */
	void exitId_(RubyLexerParser.Id_Context ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#id_global}.
	 * @param ctx the parse tree
	 */
	void enterId_global(RubyLexerParser.Id_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#id_global}.
	 * @param ctx the parse tree
	 */
	void exitId_global(RubyLexerParser.Id_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#terminator}.
	 * @param ctx the parse tree
	 */
	void enterTerminator(RubyLexerParser.TerminatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#terminator}.
	 * @param ctx the parse tree
	 */
	void exitTerminator(RubyLexerParser.TerminatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#else_token}.
	 * @param ctx the parse tree
	 */
	void enterElse_token(RubyLexerParser.Else_tokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#else_token}.
	 * @param ctx the parse tree
	 */
	void exitElse_token(RubyLexerParser.Else_tokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyLexerParser#crlf}.
	 * @param ctx the parse tree
	 */
	void enterCrlf(RubyLexerParser.CrlfContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyLexerParser#crlf}.
	 * @param ctx the parse tree
	 */
	void exitCrlf(RubyLexerParser.CrlfContext ctx);
}