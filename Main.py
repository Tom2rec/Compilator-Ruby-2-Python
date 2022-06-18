import os
import sys

from antlr4 import FileStream, CommonTokenStream
from antlr4.error.ErrorListener import ErrorListener

from OwnRubyVisitor import OwnRubyVisitor
from gen.RubyLexer import RubyLexer
from gen.RubyParser import RubyParser


def save_to_file(generated_code):
    print("Type file name to save:")
    file = open(f"{input()}.py", "w")
    file.write(generated_code)
    file.close()
    print("Code saved successfully")


class MyErrorListener(ErrorListener):
    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        print('\033[0;31m' +"line "+str(line) + ":" + str(column) + ": syntax ERROR, " + str(msg))
        sys.exit()


if __name__ == "__main__":
    run = "Examples/"

    print("Type file name to test:")
    run = run + str(input())

    if not os.path.isfile(run):
        print("Invalid file name")
        exit(1)

    data = FileStream(run, encoding='utf-8')

    # lexer
    lexer = RubyLexer(data)
    stream = CommonTokenStream(lexer)

    # parser
    parser = RubyParser(stream)
    parser._listeners = [MyErrorListener()]
    tree = parser.prog()

    # evaluator
    visitor = OwnRubyVisitor()
    result = visitor.visit(tree)

    save_to_file(result)
