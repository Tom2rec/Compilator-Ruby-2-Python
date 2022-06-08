import enum

from gen.RubyParser import RubyParser


class BuiltInFunctions:

    function_names = ['puts']

    @staticmethod
    def puts(params: list):
        for param in params:
            print(param, end=' ')
        print()
