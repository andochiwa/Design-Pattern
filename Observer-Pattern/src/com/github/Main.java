package com.github;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/29
 */
public class Main {

    public static void main(String[] args){
        Subject subject = new Subject("abc");
        subject.attach(new ConcreteObserver(subject, "A"));
        subject.attach(new ConcreteObserver(subject, "B"));
        subject.attach(new ConcreteObserver(subject, "C"));
        subject.notifyAllObservers();

        subject.setState("def");
        subject.notifyAllObservers();
    }
}
