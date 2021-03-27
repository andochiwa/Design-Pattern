package com.github1.base;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/27
 */
public abstract class Decorator implements Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
