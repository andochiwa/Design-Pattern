package com.github;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/31
 */
public interface Mediator {

    void send(String message, Colleague colleague);

}
