package com.github;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/31
 */
public class Main {

    public static void main(String[] args){
        ConcreteCommand command = new ConcreteCommand(new Receiver());
        Invoker invoker = new Invoker(command);
        invoker.executeCommand();
    }
}
