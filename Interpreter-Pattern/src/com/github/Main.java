package com.github;

import java.util.ArrayList;
import java.util.List;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/31
 */
public class Main {

    public static void main(String[] args){
        Context context = new Context();
        List<Expression> list = new ArrayList<>();

        list.add(new TerminalExpression());
        list.add(new NonterminalExpression());
        list.add(new NonterminalExpression());
        list.add(new TerminalExpression());

        list.forEach(exp -> exp.interpret(context));
    }
}
