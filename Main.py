from antlr4 import FileStream, CommonTokenStream

from MyRubyVisitor import MyRubyVisitor
from gen.RubyLexer import RubyLexer
from gen.RubyParser import RubyParser

if __name__ == "__main__":
    run = "Examples/"
    print("Type file name to test: ")
    run = run + str(input())
    data = FileStream(run, encoding='utf-8')
    # lexer
    lexer = RubyLexer(data)
    stream = CommonTokenStream(lexer)
    # parser
    parser = RubyParser(stream)
    tree = parser.prog()
    # evaluator
    visitor = MyRubyVisitor()
    print(visitor.visit(tree))
