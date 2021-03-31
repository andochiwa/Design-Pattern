package com.github;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/31
 */
public class NonterminalExpression implements Expression {
    @Override
    public void interpret(Context context) {
        System.out.println("非终端解释器");
    }
}
