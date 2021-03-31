package com.github;

import java.util.ArrayList;
import java.util.List;

/**
 * 也可以把这个变成抽象类，实现类去定义状态，但这样就需要把状态变为属性public
 * @author HAN
 * @version 1.0
 * @create 2021/3/29
 */
public class Subject {

    private List<Observer> observers = new ArrayList<>();
    private String state;

    public Subject(String state) {
        this.state = state;
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyAllObservers() {
        observers.forEach(Observer::update);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
