package com.github;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/30
 */
public class Main {

    public static void main(String[] args){
        Abstraction abstraction = new RefinedAbstraction(new ConcreteImplementorA());
        abstraction.Operation();

        abstraction.setImplementor(new ConcreteImplementorB());
        abstraction.Operation();
    }
}
