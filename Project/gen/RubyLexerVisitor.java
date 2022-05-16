// Generated from C:/Informatyka_i_systemy_inteligentne/ROK II/Sem_4/Teoria_kompilacji_i_kompilatory/Project\RubyLexer.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RubyLexerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RubyLexerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(RubyLexerParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_list(RubyLexerParser.Expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(RubyLexerParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#global_get}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_get(RubyLexerParser.Global_getContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#global_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_set(RubyLexerParser.Global_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#global_result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_result(RubyLexerParser.Global_resultContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#function_inline_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_inline_call(RubyLexerParser.Function_inline_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#function_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definition(RubyLexerParser.Function_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#function_definition_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definition_body(RubyLexerParser.Function_definition_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#function_definition_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definition_header(RubyLexerParser.Function_definition_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(RubyLexerParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#function_definition_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definition_params(RubyLexerParser.Function_definition_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#function_definition_params_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definition_params_list(RubyLexerParser.Function_definition_params_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#function_definition_param_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definition_param_id(RubyLexerParser.Function_definition_param_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(RubyLexerParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(RubyLexerParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#function_call_param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_param_list(RubyLexerParser.Function_call_param_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#function_call_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_params(RubyLexerParser.Function_call_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#function_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_param(RubyLexerParser.Function_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#function_unnamed_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_unnamed_param(RubyLexerParser.Function_unnamed_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#function_named_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_named_param(RubyLexerParser.Function_named_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#function_call_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_assignment(RubyLexerParser.Function_call_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#all_result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAll_result(RubyLexerParser.All_resultContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#elsif_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsif_statement(RubyLexerParser.Elsif_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#if_elsif_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_elsif_statement(RubyLexerParser.If_elsif_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(RubyLexerParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#unless_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnless_statement(RubyLexerParser.Unless_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(RubyLexerParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(RubyLexerParser.For_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#init_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_expression(RubyLexerParser.Init_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#all_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAll_assignment(RubyLexerParser.All_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#for_init_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_init_list(RubyLexerParser.For_init_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#cond_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_expression(RubyLexerParser.Cond_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#loop_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_expression(RubyLexerParser.Loop_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#for_loop_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop_list(RubyLexerParser.For_loop_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#statement_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_body(RubyLexerParser.Statement_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#statement_expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_expression_list(RubyLexerParser.Statement_expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(RubyLexerParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#dynamic_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamic_assignment(RubyLexerParser.Dynamic_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#int_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_assignment(RubyLexerParser.Int_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#float_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat_assignment(RubyLexerParser.Float_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#string_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_assignment(RubyLexerParser.String_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#initial_array_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitial_array_assignment(RubyLexerParser.Initial_array_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#array_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_assignment(RubyLexerParser.Array_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#array_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_definition(RubyLexerParser.Array_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#array_definition_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_definition_elements(RubyLexerParser.Array_definition_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#array_selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_selector(RubyLexerParser.Array_selectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#dynamic_result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamic_result(RubyLexerParser.Dynamic_resultContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#dynamic_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamic_(RubyLexerParser.Dynamic_Context ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#int_result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_result(RubyLexerParser.Int_resultContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#float_result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat_result(RubyLexerParser.Float_resultContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#string_result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_result(RubyLexerParser.String_resultContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#comparison_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison_list(RubyLexerParser.Comparison_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(RubyLexerParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#comp_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_var(RubyLexerParser.Comp_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLvalue(RubyLexerParser.LvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#rvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRvalue(RubyLexerParser.RvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#break_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_expression(RubyLexerParser.Break_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#float_t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat_t(RubyLexerParser.Float_tContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#int_t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_t(RubyLexerParser.Int_tContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#bool_t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_t(RubyLexerParser.Bool_tContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#nil_t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNil_t(RubyLexerParser.Nil_tContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#id_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_(RubyLexerParser.Id_Context ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#id_global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_global(RubyLexerParser.Id_globalContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#terminator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminator(RubyLexerParser.TerminatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#else_token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_token(RubyLexerParser.Else_tokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyLexerParser#crlf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrlf(RubyLexerParser.CrlfContext ctx);
}