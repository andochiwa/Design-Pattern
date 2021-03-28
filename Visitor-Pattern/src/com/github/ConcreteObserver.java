package com.github;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/29
 */
public class ConcreteObserver extends Observer {

    private String name;

    public ConcreteObserver(Subject subject, String name) {
        this.name = name;
        super.subject = subject;
    }

    @Override
    public void update() {
        System.out.println("观察者: " + name + " 的状态为:" + subject.getState());
    }
}
