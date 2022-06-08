from Functions.BuiltInFunctions import BuiltInFunctions
from gen.RubyLexer import RubyLexer
from gen.RubyParser import RubyParser
from gen.RubyVisitor import RubyVisitor


class MyRubyVisitor(RubyVisitor):
    lastLine = int()

    variables = dict()
    global_variables = dict()
    functions = dict()

    def __errorAtLine__(self):
        print("Error at line: ", self.lastLine)

    @staticmethod
    def __keywordOrExisting__(used_str):

        if used_str in ["and", "or", "not", "nil", "true", "false", "null", "end", "def", 'return', 'require']:
            exit(-1000)

        if used_str in ['if', 'else', 'elsif', 'unless', 'while', 'retry', 'break', 'for']:
            exit(-1000)

    @staticmethod
    def __increment__(value, increment, operation):
        if operation == RubyLexer.PLUS_ASSIGN:
            value += increment
        elif operation == RubyLexer.MINUS_ASSIGN:
            value -= increment
        elif operation == RubyLexer.MUL_ASSIGN:
            value *= increment
        elif operation == RubyLexer.DIV_ASSIGN:
            value /= increment
        elif operation == RubyLexer.MOD_ASSIGN:
            value %= increment
        elif operation == RubyLexer.EXP_ASSIGN:
            value **= increment
        return value

    def visitInt_t(self, ctx: RubyParser.Int_tContext):
        return int(ctx.getText())

    def visitFloat_t(self, ctx: RubyParser.Float_tContext):
        return float(ctx.getText())

    def visitBool_t(self, ctx: RubyParser.Bool_tContext):
        return ctx.getText() == 'true'

    def visitNil_t(self, ctx: RubyParser.Nil_tContext):
        return None

    def visitId_(self, ctx: RubyParser.Id_Context):
        name = str(ctx.ID())

        if name not in self.variables:
            print("Name not in variables!")
            self.__errorAtLine__()
            exit(-1000)
        return self.variables[name]

    def visitCrlf(self, ctx: RubyParser.CrlfContext):
        return

    def visitId_global(self, ctx: RubyParser.Id_globalContext):
        name = str(ctx.ID_GLOBAL())

        if name not in self.global_variables:
            print("Name not in global variables!")
            self.__errorAtLine__()
            exit(-1000)
        return self.global_variables[name]

    def visitIf_elsif_statement(self, ctx: RubyParser.If_elsif_statementContext):
        if self.visit(ctx.cond_expression()):
            self.visit(ctx.statement_body())
        elif ctx.else_token():
            self.visit(ctx.statement_body())
        elif ctx.if_elsif_statement():
            self.visit(ctx.if_elsif_statement())

    def visitIf_statement(self, ctx:RubyParser.If_statementContext):
        return self.visitChildren(ctx)

    def visitComparison_list(self, ctx: RubyParser.Comparison_listContext):
        op = ctx.op()
        if op:
            if ctx.op == RubyLexer.AND:
                return self.visit(ctx.left()) and self.visit(ctx.right)
            if ctx.op == RubyLexer.OR:
                return self.visit(ctx.left()) or self.visit(ctx.right)
        elif ctx.comparison():
            return self.visit(ctx.comparison())

    def visitComparison(self, ctx: RubyParser.ComparisonContext):
        ops = {
            RubyLexer.LESS : (lambda x, y: x < y),
            RubyLexer.GREATER: (lambda x, y: x > y),
            RubyLexer.LESS_EQUAL: (lambda x, y: x <= y),
            RubyLexer.GREATER_EQUAL: (lambda x, y: x >= y),
            RubyLexer.EQUAL: (lambda x, y: x == y),
            RubyLexer.NOT_EQUAL: (lambda x, y: x != y)
        }
        op = ctx.op()

        return ops[op](self.visit(ctx.left.comp_var()), self.visit(ctx.right.comp_var()))

    def visitComp_var(self, ctx: RubyParser.Comp_varContext):
        if ctx.id_():
            return self.visit(ctx.id_())

    def visitInt_assignment(self, ctx: RubyParser.Int_assignmentContext):
        op = ctx.op.type
        name = ctx.lvalue().getText()
        value = self.visit(ctx.int_result())

        if op == RubyLexer.ASSIGN:
            self.variables[name] = value
        elif name in self.variables.keys() and isinstance(self.variables[name], int):
            self.variables[name] = self.__increment__(self.variables[name], value, op)
        else:
            print("Cannot increment not defined value")

    def visitInt_result(self, ctx:RubyParser.Int_resultContext):
        ops = {
            RubyLexer.MUL: (lambda x, y: x * y),
            RubyLexer.DIV: (lambda x, y: x / y),
            RubyLexer.MOD: (lambda x, y: x % y),
            RubyLexer.PLUS: (lambda x, y: x + y),
            RubyLexer.MINUS: (lambda x, y: x - y),
        }
        if ctx.op:
            op = ctx.op.type
            return ops[op](ctx.int_result(0), ctx.int_result(1))
        else:
            return int(ctx.int_t().getText())

    def visitFunction_call(self, ctx:RubyParser.Function_callContext):
        function_name = ctx.name.getText()
        if function_name in BuiltInFunctions.function_names:
            do = getattr(BuiltInFunctions, str(function_name))
            k = self.visit(ctx.params)
            do(k)

    def visitFunction_call_params(self, ctx: RubyParser.Function_call_paramsContext):
        params = []
        if ctx.COMMA():
            for param in self.visit(ctx.function_call_params()):
                params.append(param)
            params.append(self.visit(ctx.function_param()))
        else:
            params.append(self.visit(ctx.function_param()))

        return params




