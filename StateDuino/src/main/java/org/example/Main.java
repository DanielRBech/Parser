package org.example;

import gen.StateDuinoLexer;
import gen.StateDuinoParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter StateDuino code:");
        ANTLRInputStream input = new ANTLRInputStream(System.in);

        StateDuinoLexer lexer = new StateDuinoLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        StateDuinoParser parser = new StateDuinoParser(tokens);

        ParseTree tree = parser.prog();
        System.out.println(tree.toStringTree(parser));
    }
}
