package com.github;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/29
 */
public abstract class Observer {

    protected Subject subject;

    public abstract void update();
}
