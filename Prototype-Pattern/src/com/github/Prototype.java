package com.github;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/28
 */
public abstract class Prototype implements Cloneable{

    @Override
    protected Prototype clone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }
}
