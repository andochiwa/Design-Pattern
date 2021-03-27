package com.github1.impl;

import com.github1.base.Component;
import com.github1.base.Decorator;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/27
 */
public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("装饰对象A的操作");
    }
}
