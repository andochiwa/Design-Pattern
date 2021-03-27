package com.github2.impl;

import com.github2.base.Decorator;
import com.github2.base.Human;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/28
 */
public class ManDecorator extends Decorator {
    public ManDecorator(Human human) {
        super(human);
    }

    private void fly() {
        System.out.println("人可以飞");
    }

    @Override
    public void run() {
        super.run();
        fly();
    }
}
