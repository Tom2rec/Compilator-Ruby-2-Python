# Generated from /home/tturek/Documents/personal/UST/Sophomore_2/Compilators/Ruby-2-Python/Project/Ruby.g4 by ANTLR 4.10.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .RubyParser import RubyParser
else:
    from RubyParser import RubyParser

# This class defines a complete generic visitor for a parse tree produced by RubyParser.

class RubyVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by RubyParser#prog.
    def visitProg(self, ctx:RubyParser.ProgContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#expression_list.
    def visitExpression_list(self, ctx:RubyParser.Expression_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#expression.
    def visitExpression(self, ctx:RubyParser.ExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#function_inline_call.
    def visitFunction_inline_call(self, ctx:RubyParser.Function_inline_callContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#function_definition.
    def visitFunction_definition(self, ctx:RubyParser.Function_definitionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#function_definition_body.
    def visitFunction_definition_body(self, ctx:RubyParser.Function_definition_bodyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#function_definition_header.
    def visitFunction_definition_header(self, ctx:RubyParser.Function_definition_headerContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#function_name.
    def visitFunction_name(self, ctx:RubyParser.Function_nameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#function_definition_params.
    def visitFunction_definition_params(self, ctx:RubyParser.Function_definition_paramsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#function_definition_params_list.
    def visitFunction_definition_params_list(self, ctx:RubyParser.Function_definition_params_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#function_definition_param_id.
    def visitFunction_definition_param_id(self, ctx:RubyParser.Function_definition_param_idContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#return_statement.
    def visitReturn_statement(self, ctx:RubyParser.Return_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#function_call.
    def visitFunction_call(self, ctx:RubyParser.Function_callContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#function_call_param_list.
    def visitFunction_call_param_list(self, ctx:RubyParser.Function_call_param_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#function_call_params.
    def visitFunction_call_params(self, ctx:RubyParser.Function_call_paramsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#function_param.
    def visitFunction_param(self, ctx:RubyParser.Function_paramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#function_unnamed_param.
    def visitFunction_unnamed_param(self, ctx:RubyParser.Function_unnamed_paramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#function_named_param.
    def visitFunction_named_param(self, ctx:RubyParser.Function_named_paramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#function_call_assignment.
    def visitFunction_call_assignment(self, ctx:RubyParser.Function_call_assignmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#all_result.
    def visitAll_result(self, ctx:RubyParser.All_resultContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#elsif_statement.
    def visitElsif_statement(self, ctx:RubyParser.Elsif_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#if_elsif_statement.
    def visitIf_elsif_statement(self, ctx:RubyParser.If_elsif_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#if_statement.
    def visitIf_statement(self, ctx:RubyParser.If_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#unless_statement.
    def visitUnless_statement(self, ctx:RubyParser.Unless_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#while_statement.
    def visitWhile_statement(self, ctx:RubyParser.While_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#for_statement.
    def visitFor_statement(self, ctx:RubyParser.For_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#init_expression.
    def visitInit_expression(self, ctx:RubyParser.Init_expressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#all_assignment.
    def visitAll_assignment(self, ctx:RubyParser.All_assignmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#for_init_list.
    def visitFor_init_list(self, ctx:RubyParser.For_init_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#cond_expression.
    def visitCond_expression(self, ctx:RubyParser.Cond_expressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#loop_expression.
    def visitLoop_expression(self, ctx:RubyParser.Loop_expressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#for_loop_list.
    def visitFor_loop_list(self, ctx:RubyParser.For_loop_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#statement_body.
    def visitStatement_body(self, ctx:RubyParser.Statement_bodyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#statement_expression_list.
    def visitStatement_expression_list(self, ctx:RubyParser.Statement_expression_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#assignment.
    def visitAssignment(self, ctx:RubyParser.AssignmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#dynamic_assignment.
    def visitDynamic_assignment(self, ctx:RubyParser.Dynamic_assignmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#int_assignment.
    def visitInt_assignment(self, ctx:RubyParser.Int_assignmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#float_assignment.
    def visitFloat_assignment(self, ctx:RubyParser.Float_assignmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#string_assignment.
    def visitString_assignment(self, ctx:RubyParser.String_assignmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#initial_array_assignment.
    def visitInitial_array_assignment(self, ctx:RubyParser.Initial_array_assignmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#array_assignment.
    def visitArray_assignment(self, ctx:RubyParser.Array_assignmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#array_definition.
    def visitArray_definition(self, ctx:RubyParser.Array_definitionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#array_definition_elements.
    def visitArray_definition_elements(self, ctx:RubyParser.Array_definition_elementsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#array_selector.
    def visitArray_selector(self, ctx:RubyParser.Array_selectorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#dynamic_result.
    def visitDynamic_result(self, ctx:RubyParser.Dynamic_resultContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#dynamic_.
    def visitDynamic_(self, ctx:RubyParser.Dynamic_Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#int_result.
    def visitInt_result(self, ctx:RubyParser.Int_resultContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#float_result.
    def visitFloat_result(self, ctx:RubyParser.Float_resultContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#string_result.
    def visitString_result(self, ctx:RubyParser.String_resultContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#comparison_list.
    def visitComparison_list(self, ctx:RubyParser.Comparison_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#comparison.
    def visitComparison(self, ctx:RubyParser.ComparisonContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#comp_var.
    def visitComp_var(self, ctx:RubyParser.Comp_varContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#lvalue.
    def visitLvalue(self, ctx:RubyParser.LvalueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#rvalue.
    def visitRvalue(self, ctx:RubyParser.RvalueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#break_expression.
    def visitBreak_expression(self, ctx:RubyParser.Break_expressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#literal_t.
    def visitLiteral_t(self, ctx:RubyParser.Literal_tContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#float_t.
    def visitFloat_t(self, ctx:RubyParser.Float_tContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#int_t.
    def visitInt_t(self, ctx:RubyParser.Int_tContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#bool_t.
    def visitBool_t(self, ctx:RubyParser.Bool_tContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#nil_t.
    def visitNil_t(self, ctx:RubyParser.Nil_tContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#id_.
    def visitId_(self, ctx:RubyParser.Id_Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#terminator.
    def visitTerminator(self, ctx:RubyParser.TerminatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#else_token.
    def visitElse_token(self, ctx:RubyParser.Else_tokenContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RubyParser#crlf.
    def visitCrlf(self, ctx:RubyParser.CrlfContext):
        return self.visitChildren(ctx)



del RubyParser