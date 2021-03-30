package com.github;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/31
 */
public abstract class Command {

    protected Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    public abstract void execute();
}
