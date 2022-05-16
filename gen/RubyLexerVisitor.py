# Generated from /home/tturek/Documents/personal/UST/Sophomore_2/Compilators/Compilator-Ruby-2-Python/Project/RubyLexer.g4 by ANTLR 4.10.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .RubyLexerParser import RubyLexerParser
else:
    from RubyLexerParser import RubyLexerParser

# This class defines a complete generic visitor for a parse tree produced by RubyLexerParser.

class RubyLexerVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by RubyLexerParser#prog.
    def visitProg(self, ctx:RubyLexerParser.ProgContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#expression_list.
    def visitExpression_list(self, ctx:RubyLexerParser.Expression_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#expression.
    def visitExpression(self, ctx:RubyLexerParser.ExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#global_get.
    def visitGlobal_get(self, ctx:RubyLexerParser.Global_getContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#global_set.
    def visitGlobal_set(self, ctx:RubyLexerParser.Global_setContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#global_result.
    def visitGlobal_result(self, ctx:RubyLexerParser.Global_resultContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#function_inline_call.
    def visitFunction_inline_call(self, ctx:RubyLexerParser.Function_inline_callContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#function_definition.
    def visitFunction_definition(self, ctx:RubyLexerParser.Function_definitionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#function_definition_body.
    def visitFunction_definition_body(self, ctx:RubyLexerParser.Function_definition_bodyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#function_definition_header.
    def visitFunction_definition_header(self, ctx:RubyLexerParser.Function_definition_headerContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#function_name.
    def visitFunction_name(self, ctx:RubyLexerParser.Function_nameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#function_definition_params.
    def visitFunction_definition_params(self, ctx:RubyLexerParser.Function_definition_paramsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#function_definition_params_list.
    def visitFunction_definition_params_list(self, ctx:RubyLexerParser.Function_definition_params_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#function_definition_param_id.
    def visitFunction_definition_param_id(self, ctx:RubyLexerParser.Function_definition_param_idContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#return_statement.
    def visitReturn_statement(self, ctx:RubyLexerParser.Return_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#function_call.
    def visitFunction_call(self, ctx:RubyLexerParser.Function_callContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#function_call_param_list.
    def visitFunction_call_param_list(self, ctx:RubyLexerParser.Function_call_param_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#function_call_params.
    def visitFunction_call_params(self, ctx:RubyLexerParser.Function_call_paramsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#function_param.
    def visitFunction_param(self, ctx:RubyLexerParser.Function_paramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#function_unnamed_param.
    def visitFunction_unnamed_param(self, ctx:RubyLexerParser.Function_unnamed_paramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#function_named_param.
    def visitFunction_named_param(self, ctx:RubyLexerParser.Function_named_paramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#function_call_assignment.
    def visitFunction_call_assignment(self, ctx:RubyLexerParser.Function_call_assignmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#all_result.
    def visitAll_result(self, ctx:RubyLexerParser.All_resultContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#elsif_statement.
    def visitElsif_statement(self, ctx:RubyLexerParser.Elsif_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#if_elsif_statement.
    def visitIf_elsif_statement(self, ctx:RubyLexerParser.If_elsif_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#if_statement.
    def visitIf_statement(self, ctx:RubyLexerParser.If_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#unless_statement.
    def visitUnless_statement(self, ctx:RubyLexerParser.Unless_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#while_statement.
    def visitWhile_statement(self, ctx:RubyLexerParser.While_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#for_statement.
    def visitFor_statement(self, ctx:RubyLexerParser.For_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#init_expression.
    def visitInit_expression(self, ctx:RubyLexerParser.Init_expressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#all_assignment.
    def visitAll_assignment(self, ctx:RubyLexerParser.All_assignmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#for_init_list.
    def visitFor_init_list(self, ctx:RubyLexerParser.For_init_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#cond_expression.
    def visitCond_expression(self, ctx:RubyLexerParser.Cond_expressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#loop_expression.
    def visitLoop_expression(self, ctx:RubyLexerParser.Loop_expressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#for_loop_list.
    def visitFor_loop_list(self, ctx:RubyLexerParser.For_loop_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#statement_body.
    def visitStatement_body(self, ctx:RubyLexerParser.Statement_bodyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#statement_expression_list.
    def visitStatement_expression_list(self, ctx:RubyLexerParser.Statement_expression_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#assignment.
    def visitAssignment(self, ctx:RubyLexerParser.AssignmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#dynamic_assignment.
    def visitDynamic_assignment(self, ctx:RubyLexerParser.Dynamic_assignmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#int_assignment.
    def visitInt_assignment(self, ctx:RubyLexerParser.Int_assignmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#float_assignment.
    def visitFloat_assignment(self, ctx:RubyLexerParser.Float_assignmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#string_assignment.
    def visitString_assignment(self, ctx:RubyLexerParser.String_assignmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#initial_array_assignment.
    def visitInitial_array_assignment(self, ctx:RubyLexerParser.Initial_array_assignmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#array_assignment.
    def visitArray_assignment(self, ctx:RubyLexerParser.Array_assignmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#array_definition.
    def visitArray_definition(self, ctx:RubyLexerParser.Array_definitionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#array_definition_elements.
    def visitArray_definition_elements(self, ctx:RubyLexerParser.Array_definition_elementsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#array_selector.
    def visitArray_selector(self, ctx:RubyLexerParser.Array_selectorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#dynamic_result.
    def visitDynamic_result(self, ctx:RubyLexerParser.Dynamic_resultContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#dynamic_.
    def visitDynamic_(self, ctx:RubyLexerParser.Dynamic_Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#int_result.
    def visitInt_result(self, ctx:RubyLexerParser.Int_resultContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#float_result.
    def visitFloat_result(self, ctx:RubyLexerParser.Float_resultContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#string_result.
    def visitString_result(self, ctx:RubyLexerParser.String_resultContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#comparison_list.
    def visitComparison_list(self, ctx:RubyLexerParser.Comparison_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#comparison.
    def visitComparison(self, ctx:RubyLexerParser.ComparisonContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#comp_var.
    def visitComp_var(self, ctx:RubyLexerParser.Comp_varContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#lvalue.
    def visitLvalue(self, ctx:RubyLexerParser.LvalueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#rvalue.
    def visitRvalue(self, ctx:RubyLexerParser.RvalueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#break_expression.
    def visitBreak_expression(self, ctx:RubyLexerParser.Break_expressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#float_t.
    def visitFloat_t(self, ctx:RubyLexerParser.Float_tContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#int_t.
    def visitInt_t(self, ctx:RubyLexerParser.Int_tContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#bool_t.
    def visitBool_t(self, ctx:RubyLexerParser.Bool_tContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#nil_t.
    def visitNil_t(self, ctx:RubyLexerParser.Nil_tContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#id_.
    def visitId_(self, ctx:RubyLexerParser.Id_Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#id_global.
    def visitId_global(self, ctx:RubyLexerParser.Id_globalContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#terminator.
    def visitTerminator(self, ctx:RubyLexerParser.TerminatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#else_token.
    def visitElse_token(self, ctx:RubyLexerParser.Else_tokenContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyLexerParser#crlf.
    def visitCrlf(self, ctx:RubyLexerParser.CrlfContext):
        return self.visitChildren(ctx)



del RubyLexerParser