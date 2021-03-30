package com.github;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/31
 */
public class ConcreteMediator implements Mediator{
    @Override
    public void send(String message, Colleague colleague) {
        colleague.notify(message);
    }
}
