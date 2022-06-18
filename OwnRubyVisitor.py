from gen.RubyParser import RubyParser
from gen.RubyVisitor import RubyVisitor


class OwnRubyVisitor(RubyVisitor):
    operators = ["+", "-", "*", "/", "**", "%", "==", "=", "+=", "-=", "*=", "/=", "%=", "**=", "and", "or", "not"]

    def visit_child_nodes(self, children):
        result = ""
        for node in children:
            if node.getChildCount() == 0:
                node_txt = node.getText()

                if node_txt in self.operators:
                    result += " "

                if node_txt != "end":
                    result += node.getText()

                if node_txt in [","] or node_txt in self.operators:
                    result += " "

            else:
                result += self.visit(node)
        return result

    def visit_params(self, ctx):
        result = ""
        if ctx.COMMA():
            result += self.visit_child_nodes(ctx.children)
        else:
            result += self.visit(ctx.children[0])

        return result

    def assignment(self, ctx):
        return self.visit(ctx.lvalue()) + " " + ctx.op.text + " " + self.visit(ctx.children[2])

    def visitExpression_list(self, ctx: RubyParser.Expression_listContext):
        result = ""
        for child in ctx.children:
            if child.getChildCount() == 0:
                token = child.getText()
                if token in ["true", "false"]:
                    token[0] = token[0].upper()
                if token == "nil":
                    token = "None"
                if token == "&&":
                    token = "and"
                if token == "||":
                    token = "or"
                if token == "!":
                    token = "not"
                result += token
            else:
                result += self.visit(child)
        return result

    def visitGlobal_get(self, ctx: RubyParser.Global_getContext):
        result = ""
        if ctx.var_name[0] == "$":
            result += ctx.var_name[1:]
        else:
            result += ctx.var_name

        result += " = "

        if ctx.global_name[0] == "$":
            result += ctx.global_name[1:]
        else:
            result += ctx.global_name

        return result

    def visitGlobal_set(self, ctx: RubyParser.Global_setContext):
        result = ""
        result += "global "
        result += str(ctx.global_name.ID_GLOBAL())[1:]
        result += " = "
        result += self.visit(ctx.result)

        return result

    def visitGlobal_result(self, ctx: RubyParser.Global_resultContext):
        return ctx.id_global()[1:]

    def visitFunction_definition(self, ctx: RubyParser.Function_definitionContext):
        return self.visit_child_nodes(ctx.children)

    def visitFunction_definition_header(self, ctx: RubyParser.Function_definition_headerContext):
        return "def " + self.visit_child_nodes(ctx.children[1:])

    def visitFunction_definition_body(self, ctx:RubyParser.Function_definition_bodyContext):
        result = "\t"
        for char in self.visit(ctx.expression_list()):
            result += char
            if char == "\n":
                result += "\t"

        return result

    def visitFunction_definition_params(self, ctx: RubyParser.Function_definition_paramsContext):
        result = ""
        if ctx.LEFT_RBRACKET():
            result += self.visit_child_nodes(ctx.children)
        else:
            result += "("
            result += self.visit(ctx.function_definition_params_list())
            result += ")"

        return result + ":"

    def visitFunction_definition_params_list(self, ctx: RubyParser.Function_definition_params_listContext):
        return self.visit_params(ctx)

    def visitReturn_statement(self, ctx: RubyParser.Return_statementContext):
        return "return " + self.visit_child_nodes(ctx.children[1:])

    def visitFunction_call(self, ctx: RubyParser.Function_callContext):
        result = ""
        result += self.visit(ctx.name)
        result += "("
        if ctx.params:
            result += self.visit(ctx.params)
        result += ")"

        return result

    def visitFunction_call_params(self, ctx: RubyParser.Function_call_paramsContext):
        return self.visit_params(ctx)

    def visitFunction_named_param(self, ctx: RubyParser.Function_named_paramContext):
        return self.visit_child_nodes(ctx.children)

    def visitIf_elsif_statement(self, ctx: RubyParser.If_elsif_statementContext):
        return self.visit_child_nodes(ctx.children)

    def visitIf_statement(self, ctx: RubyParser.If_statementContext):
        return self.visit_child_nodes(ctx.children)

    def visitUnless_statement(self, ctx: RubyParser.Unless_statementContext):
        return "if not " + self.visit_child_nodes(ctx.children[1:])

    def visitWhile_statement(self, ctx: RubyParser.While_statementContext):
        result = ""
        result += str(ctx.WHILE())
        result += " "
        result += self.visit(ctx.cond_expression())
        result += ":"
        result += self.visit(ctx.crlf())
        result += self.visit(ctx.statement_body())
        return result

    def visitFor_statement(self, ctx: RubyParser.For_statementContext):
        result = self.visit(ctx.init_expression())
        result += "\n"
        result += "while "
        result += self.visit(ctx.cond_expression())
        result += ":"
        result += "\n"
        result += self.visit(ctx.statement_body())
        result += "\t" + self.visit(ctx.loop_expression())

        return result

    def visitFor_init_list(self, ctx: RubyParser.For_init_listContext):
        return self.visit_params(ctx)

    def visitFor_loop_list(self, ctx: RubyParser.For_loop_listContext):
        return self.visit_params(ctx)

    def visitStatement_body(self, ctx:RubyParser.Statement_bodyContext):
        result = ""
        for line in self.visitChildren(ctx).split("\n"):
            result += "\t"
            result += line
            result += "\n"

        return result

    def visitStatement_expression_list(self, ctx: RubyParser.Statement_expression_listContext):
        return self.visit_child_nodes(ctx.children)

    def visitAssignment(self, ctx: RubyParser.AssignmentContext):
        return self.assignment(ctx)

    def visitDynamic_assignment(self, ctx: RubyParser.Dynamic_assignmentContext):
        return self.assignment(ctx)

    def visitInt_assignment(self, ctx: RubyParser.Int_assignmentContext):
        return self.assignment(ctx)

    def visitFloat_assignment(self, ctx: RubyParser.Float_assignmentContext):
        return self.assignment(ctx)

    def visitString_assignment(self, ctx: RubyParser.String_assignmentContext):
        return self.assignment(ctx)

    def visitInitial_array_assignment(self, ctx: RubyParser.Initial_array_assignmentContext):
        result = ""
        result += self.visit(ctx.lvalue())
        result += " " + ctx.op.text + " "
        result += self.visit_child_nodes(ctx.children[2:])
        return result

    def visitArray_assignment(self, ctx: RubyParser.Array_assignmentContext):
        return self.visit(ctx.arr_def) + " " + ctx.op.text + " " + self.visit(ctx.arr_val)

    def visitArray_definition(self, ctx: RubyParser.Array_definitionContext):
        return self.visit_child_nodes(ctx.children)

    def visitArray_definition_elements(self, ctx: RubyParser.Array_definition_elementsContext):
        return self.visit_params(ctx)

    def visitArray_selector(self, ctx: RubyParser.Array_selectorContext):
        return self.visit_child_nodes(ctx.children)

    def visitDynamic_result(self, ctx: RubyParser.Dynamic_resultContext):
        return self.visit_child_nodes(ctx.children)

    def visitDynamic_(self, ctx: RubyParser.Dynamic_Context):
        return self.visitChildren(ctx)

    def visitInt_result(self, ctx: RubyParser.Int_resultContext):
        return self.visit_child_nodes(ctx.children)

    def visitFloat_result(self, ctx: RubyParser.Float_resultContext):
        return self.visit_child_nodes(ctx.children)

    def visitString_result(self, ctx: RubyParser.String_resultContext):
        return self.visit_child_nodes(ctx.children)

    def visitComparison_list(self, ctx: RubyParser.Comparison_listContext):
        result = ""
        if ctx.AND() or ctx.AND():
            result += self.visit(ctx.comparison())
            result += " "
            result += ctx.op.text
            result += " "
            result += self.visit(ctx.comparison_list())
        else:
            result += self.visit_child_nodes(ctx.children)
        return result

    def visitComparison(self, ctx: RubyParser.ComparisonContext):
        result = ""
        result += self.visit(ctx.left)
        result += " "
        result += ctx.op.text
        result += " "
        result += self.visit(ctx.right)
        return result

    def visitRvalue(self, ctx: RubyParser.RvalueContext):
        return self.visit_child_nodes(ctx.children)

    def visitBreak_expression(self, ctx: RubyParser.Break_expressionContext):
        return ctx.getText()

    def visitFloat_t(self, ctx: RubyParser.Float_tContext):
        return ctx.getText()

    def visitInt_t(self, ctx: RubyParser.Int_tContext):
        return ctx.getText()

    def visitBool_t(self, ctx: RubyParser.Bool_tContext):
        return ctx.getText()[0].upper() + ctx.getText()[1:]

    def visitNil_t(self, ctx: RubyParser.Nil_tContext):
        return "None"

    def visitId_(self, ctx: RubyParser.Id_Context):
        return ctx.getText()

    def visitId_global(self, ctx: RubyParser.Id_globalContext):
        return ctx.getText()[1:]

    def visitTerminator(self, ctx: RubyParser.TerminatorContext):
        result = ""
        for _ in ctx.children:
            result += self.visitCrlf(None)

        return result

    def visitElse_token(self, ctx: RubyParser.Else_tokenContext):
        return ctx.getText()

    def visitCrlf(self, ctx: RubyParser.CrlfContext):
        return "\n"

