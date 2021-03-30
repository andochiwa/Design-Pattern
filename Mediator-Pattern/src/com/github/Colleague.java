package com.github;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/31
 */
public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void send(String message);

    public abstract void notify(String message);
}
