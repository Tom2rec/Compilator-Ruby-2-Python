# Generated from /home/tturek/Documents/personal/UST/Sophomore_2/Compilators/Compilator-Ruby-2-Python/Project/RubyLexer.g4 by ANTLR 4.10.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .RubyLexerParser import RubyLexerParser
else:
    from RubyLexerParser import RubyLexerParser

# This class defines a complete listener for a parse tree produced by RubyLexerParser.
class RubyLexerListener(ParseTreeListener):

    # Enter a parse tree produced by RubyLexerParser#prog.
    def enterProg(self, ctx:RubyLexerParser.ProgContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#prog.
    def exitProg(self, ctx:RubyLexerParser.ProgContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#expression_list.
    def enterExpression_list(self, ctx:RubyLexerParser.Expression_listContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#expression_list.
    def exitExpression_list(self, ctx:RubyLexerParser.Expression_listContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#expression.
    def enterExpression(self, ctx:RubyLexerParser.ExpressionContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#expression.
    def exitExpression(self, ctx:RubyLexerParser.ExpressionContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#global_get.
    def enterGlobal_get(self, ctx:RubyLexerParser.Global_getContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#global_get.
    def exitGlobal_get(self, ctx:RubyLexerParser.Global_getContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#global_set.
    def enterGlobal_set(self, ctx:RubyLexerParser.Global_setContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#global_set.
    def exitGlobal_set(self, ctx:RubyLexerParser.Global_setContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#global_result.
    def enterGlobal_result(self, ctx:RubyLexerParser.Global_resultContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#global_result.
    def exitGlobal_result(self, ctx:RubyLexerParser.Global_resultContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#function_inline_call.
    def enterFunction_inline_call(self, ctx:RubyLexerParser.Function_inline_callContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#function_inline_call.
    def exitFunction_inline_call(self, ctx:RubyLexerParser.Function_inline_callContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#function_definition.
    def enterFunction_definition(self, ctx:RubyLexerParser.Function_definitionContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#function_definition.
    def exitFunction_definition(self, ctx:RubyLexerParser.Function_definitionContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#function_definition_body.
    def enterFunction_definition_body(self, ctx:RubyLexerParser.Function_definition_bodyContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#function_definition_body.
    def exitFunction_definition_body(self, ctx:RubyLexerParser.Function_definition_bodyContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#function_definition_header.
    def enterFunction_definition_header(self, ctx:RubyLexerParser.Function_definition_headerContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#function_definition_header.
    def exitFunction_definition_header(self, ctx:RubyLexerParser.Function_definition_headerContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#function_name.
    def enterFunction_name(self, ctx:RubyLexerParser.Function_nameContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#function_name.
    def exitFunction_name(self, ctx:RubyLexerParser.Function_nameContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#function_definition_params.
    def enterFunction_definition_params(self, ctx:RubyLexerParser.Function_definition_paramsContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#function_definition_params.
    def exitFunction_definition_params(self, ctx:RubyLexerParser.Function_definition_paramsContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#function_definition_params_list.
    def enterFunction_definition_params_list(self, ctx:RubyLexerParser.Function_definition_params_listContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#function_definition_params_list.
    def exitFunction_definition_params_list(self, ctx:RubyLexerParser.Function_definition_params_listContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#function_definition_param_id.
    def enterFunction_definition_param_id(self, ctx:RubyLexerParser.Function_definition_param_idContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#function_definition_param_id.
    def exitFunction_definition_param_id(self, ctx:RubyLexerParser.Function_definition_param_idContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#return_statement.
    def enterReturn_statement(self, ctx:RubyLexerParser.Return_statementContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#return_statement.
    def exitReturn_statement(self, ctx:RubyLexerParser.Return_statementContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#function_call.
    def enterFunction_call(self, ctx:RubyLexerParser.Function_callContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#function_call.
    def exitFunction_call(self, ctx:RubyLexerParser.Function_callContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#function_call_param_list.
    def enterFunction_call_param_list(self, ctx:RubyLexerParser.Function_call_param_listContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#function_call_param_list.
    def exitFunction_call_param_list(self, ctx:RubyLexerParser.Function_call_param_listContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#function_call_params.
    def enterFunction_call_params(self, ctx:RubyLexerParser.Function_call_paramsContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#function_call_params.
    def exitFunction_call_params(self, ctx:RubyLexerParser.Function_call_paramsContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#function_param.
    def enterFunction_param(self, ctx:RubyLexerParser.Function_paramContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#function_param.
    def exitFunction_param(self, ctx:RubyLexerParser.Function_paramContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#function_unnamed_param.
    def enterFunction_unnamed_param(self, ctx:RubyLexerParser.Function_unnamed_paramContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#function_unnamed_param.
    def exitFunction_unnamed_param(self, ctx:RubyLexerParser.Function_unnamed_paramContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#function_named_param.
    def enterFunction_named_param(self, ctx:RubyLexerParser.Function_named_paramContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#function_named_param.
    def exitFunction_named_param(self, ctx:RubyLexerParser.Function_named_paramContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#function_call_assignment.
    def enterFunction_call_assignment(self, ctx:RubyLexerParser.Function_call_assignmentContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#function_call_assignment.
    def exitFunction_call_assignment(self, ctx:RubyLexerParser.Function_call_assignmentContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#all_result.
    def enterAll_result(self, ctx:RubyLexerParser.All_resultContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#all_result.
    def exitAll_result(self, ctx:RubyLexerParser.All_resultContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#elsif_statement.
    def enterElsif_statement(self, ctx:RubyLexerParser.Elsif_statementContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#elsif_statement.
    def exitElsif_statement(self, ctx:RubyLexerParser.Elsif_statementContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#if_elsif_statement.
    def enterIf_elsif_statement(self, ctx:RubyLexerParser.If_elsif_statementContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#if_elsif_statement.
    def exitIf_elsif_statement(self, ctx:RubyLexerParser.If_elsif_statementContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#if_statement.
    def enterIf_statement(self, ctx:RubyLexerParser.If_statementContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#if_statement.
    def exitIf_statement(self, ctx:RubyLexerParser.If_statementContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#unless_statement.
    def enterUnless_statement(self, ctx:RubyLexerParser.Unless_statementContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#unless_statement.
    def exitUnless_statement(self, ctx:RubyLexerParser.Unless_statementContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#while_statement.
    def enterWhile_statement(self, ctx:RubyLexerParser.While_statementContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#while_statement.
    def exitWhile_statement(self, ctx:RubyLexerParser.While_statementContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#for_statement.
    def enterFor_statement(self, ctx:RubyLexerParser.For_statementContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#for_statement.
    def exitFor_statement(self, ctx:RubyLexerParser.For_statementContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#init_expression.
    def enterInit_expression(self, ctx:RubyLexerParser.Init_expressionContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#init_expression.
    def exitInit_expression(self, ctx:RubyLexerParser.Init_expressionContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#all_assignment.
    def enterAll_assignment(self, ctx:RubyLexerParser.All_assignmentContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#all_assignment.
    def exitAll_assignment(self, ctx:RubyLexerParser.All_assignmentContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#for_init_list.
    def enterFor_init_list(self, ctx:RubyLexerParser.For_init_listContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#for_init_list.
    def exitFor_init_list(self, ctx:RubyLexerParser.For_init_listContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#cond_expression.
    def enterCond_expression(self, ctx:RubyLexerParser.Cond_expressionContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#cond_expression.
    def exitCond_expression(self, ctx:RubyLexerParser.Cond_expressionContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#loop_expression.
    def enterLoop_expression(self, ctx:RubyLexerParser.Loop_expressionContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#loop_expression.
    def exitLoop_expression(self, ctx:RubyLexerParser.Loop_expressionContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#for_loop_list.
    def enterFor_loop_list(self, ctx:RubyLexerParser.For_loop_listContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#for_loop_list.
    def exitFor_loop_list(self, ctx:RubyLexerParser.For_loop_listContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#statement_body.
    def enterStatement_body(self, ctx:RubyLexerParser.Statement_bodyContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#statement_body.
    def exitStatement_body(self, ctx:RubyLexerParser.Statement_bodyContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#statement_expression_list.
    def enterStatement_expression_list(self, ctx:RubyLexerParser.Statement_expression_listContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#statement_expression_list.
    def exitStatement_expression_list(self, ctx:RubyLexerParser.Statement_expression_listContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#assignment.
    def enterAssignment(self, ctx:RubyLexerParser.AssignmentContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#assignment.
    def exitAssignment(self, ctx:RubyLexerParser.AssignmentContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#dynamic_assignment.
    def enterDynamic_assignment(self, ctx:RubyLexerParser.Dynamic_assignmentContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#dynamic_assignment.
    def exitDynamic_assignment(self, ctx:RubyLexerParser.Dynamic_assignmentContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#int_assignment.
    def enterInt_assignment(self, ctx:RubyLexerParser.Int_assignmentContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#int_assignment.
    def exitInt_assignment(self, ctx:RubyLexerParser.Int_assignmentContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#float_assignment.
    def enterFloat_assignment(self, ctx:RubyLexerParser.Float_assignmentContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#float_assignment.
    def exitFloat_assignment(self, ctx:RubyLexerParser.Float_assignmentContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#string_assignment.
    def enterString_assignment(self, ctx:RubyLexerParser.String_assignmentContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#string_assignment.
    def exitString_assignment(self, ctx:RubyLexerParser.String_assignmentContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#initial_array_assignment.
    def enterInitial_array_assignment(self, ctx:RubyLexerParser.Initial_array_assignmentContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#initial_array_assignment.
    def exitInitial_array_assignment(self, ctx:RubyLexerParser.Initial_array_assignmentContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#array_assignment.
    def enterArray_assignment(self, ctx:RubyLexerParser.Array_assignmentContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#array_assignment.
    def exitArray_assignment(self, ctx:RubyLexerParser.Array_assignmentContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#array_definition.
    def enterArray_definition(self, ctx:RubyLexerParser.Array_definitionContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#array_definition.
    def exitArray_definition(self, ctx:RubyLexerParser.Array_definitionContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#array_definition_elements.
    def enterArray_definition_elements(self, ctx:RubyLexerParser.Array_definition_elementsContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#array_definition_elements.
    def exitArray_definition_elements(self, ctx:RubyLexerParser.Array_definition_elementsContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#array_selector.
    def enterArray_selector(self, ctx:RubyLexerParser.Array_selectorContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#array_selector.
    def exitArray_selector(self, ctx:RubyLexerParser.Array_selectorContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#dynamic_result.
    def enterDynamic_result(self, ctx:RubyLexerParser.Dynamic_resultContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#dynamic_result.
    def exitDynamic_result(self, ctx:RubyLexerParser.Dynamic_resultContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#dynamic_.
    def enterDynamic_(self, ctx:RubyLexerParser.Dynamic_Context):
        pass

    # Exit a parse tree produced by RubyLexerParser#dynamic_.
    def exitDynamic_(self, ctx:RubyLexerParser.Dynamic_Context):
        pass


    # Enter a parse tree produced by RubyLexerParser#int_result.
    def enterInt_result(self, ctx:RubyLexerParser.Int_resultContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#int_result.
    def exitInt_result(self, ctx:RubyLexerParser.Int_resultContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#float_result.
    def enterFloat_result(self, ctx:RubyLexerParser.Float_resultContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#float_result.
    def exitFloat_result(self, ctx:RubyLexerParser.Float_resultContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#string_result.
    def enterString_result(self, ctx:RubyLexerParser.String_resultContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#string_result.
    def exitString_result(self, ctx:RubyLexerParser.String_resultContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#comparison_list.
    def enterComparison_list(self, ctx:RubyLexerParser.Comparison_listContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#comparison_list.
    def exitComparison_list(self, ctx:RubyLexerParser.Comparison_listContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#comparison.
    def enterComparison(self, ctx:RubyLexerParser.ComparisonContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#comparison.
    def exitComparison(self, ctx:RubyLexerParser.ComparisonContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#comp_var.
    def enterComp_var(self, ctx:RubyLexerParser.Comp_varContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#comp_var.
    def exitComp_var(self, ctx:RubyLexerParser.Comp_varContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#lvalue.
    def enterLvalue(self, ctx:RubyLexerParser.LvalueContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#lvalue.
    def exitLvalue(self, ctx:RubyLexerParser.LvalueContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#rvalue.
    def enterRvalue(self, ctx:RubyLexerParser.RvalueContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#rvalue.
    def exitRvalue(self, ctx:RubyLexerParser.RvalueContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#break_expression.
    def enterBreak_expression(self, ctx:RubyLexerParser.Break_expressionContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#break_expression.
    def exitBreak_expression(self, ctx:RubyLexerParser.Break_expressionContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#float_t.
    def enterFloat_t(self, ctx:RubyLexerParser.Float_tContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#float_t.
    def exitFloat_t(self, ctx:RubyLexerParser.Float_tContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#int_t.
    def enterInt_t(self, ctx:RubyLexerParser.Int_tContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#int_t.
    def exitInt_t(self, ctx:RubyLexerParser.Int_tContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#bool_t.
    def enterBool_t(self, ctx:RubyLexerParser.Bool_tContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#bool_t.
    def exitBool_t(self, ctx:RubyLexerParser.Bool_tContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#nil_t.
    def enterNil_t(self, ctx:RubyLexerParser.Nil_tContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#nil_t.
    def exitNil_t(self, ctx:RubyLexerParser.Nil_tContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#id_.
    def enterId_(self, ctx:RubyLexerParser.Id_Context):
        pass

    # Exit a parse tree produced by RubyLexerParser#id_.
    def exitId_(self, ctx:RubyLexerParser.Id_Context):
        pass


    # Enter a parse tree produced by RubyLexerParser#id_global.
    def enterId_global(self, ctx:RubyLexerParser.Id_globalContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#id_global.
    def exitId_global(self, ctx:RubyLexerParser.Id_globalContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#terminator.
    def enterTerminator(self, ctx:RubyLexerParser.TerminatorContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#terminator.
    def exitTerminator(self, ctx:RubyLexerParser.TerminatorContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#else_token.
    def enterElse_token(self, ctx:RubyLexerParser.Else_tokenContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#else_token.
    def exitElse_token(self, ctx:RubyLexerParser.Else_tokenContext):
        pass


    # Enter a parse tree produced by RubyLexerParser#crlf.
    def enterCrlf(self, ctx:RubyLexerParser.CrlfContext):
        pass

    # Exit a parse tree produced by RubyLexerParser#crlf.
    def exitCrlf(self, ctx:RubyLexerParser.CrlfContext):
        pass



del RubyLexerParser