from antlr4 import FileStream, CommonTokenStream

from OwnRubyVisitor import OwnRubyVisitor
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
    visitor = OwnRubyVisitor()
    result = visitor.visit(tree)
    print(result)
