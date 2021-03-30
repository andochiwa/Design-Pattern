package com.github;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/31
 */
public class ConcreteCommand extends Command{
    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
