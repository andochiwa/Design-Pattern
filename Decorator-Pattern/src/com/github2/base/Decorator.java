package com.github2.base;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/28
 */
public abstract class Decorator implements Human {

    private Human human;

    public Decorator(Human human) {
        this.human = human;
    }

    @Override
    public void run() {
        human.run();
    }
}
