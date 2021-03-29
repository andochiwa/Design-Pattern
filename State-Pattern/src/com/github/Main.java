package com.github;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/29
 */
public class Main {

    public static void main(String[] args){
        Context context = new Context(new ConcreteA(), 1);
        context.request();
        context.change();
        context.request();
        context.change();
        context.request();
        context.change();
        context.request();
    }
}
