package com.github;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/30
 */
public abstract class Component {

    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void add(Component c);

    public abstract void remove(Component c);

    public abstract void display(int index);
}
