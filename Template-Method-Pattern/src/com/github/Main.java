package com.github;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/28
 */
public class Main {

    public static void main(String[] args){
        Abstract a = new ConcreteA();
        Abstract b = new ConcreteB();
        a.TemplateMethod();
        b.TemplateMethod();
    }
}
