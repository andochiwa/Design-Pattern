package com.github;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/31
 */
public class Main {

    public static void main(String[] args){
        Mediator mediator = new ConcreteMediator();

        Colleague colleagueA = new ConcreteColleagueA(mediator);
        Colleague colleagueB = new ConcreteColleagueB(mediator);

        colleagueA.send("消息A");
        colleagueB.send("消息B");
    }
}
