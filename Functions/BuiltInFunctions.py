import enum

from gen.RubyParser import RubyParser


class BuiltInFunctions:

    function_names = ['puts']

    def puts(self, ctx: RubyParser.Function_callContext):
        print(ctx.params)