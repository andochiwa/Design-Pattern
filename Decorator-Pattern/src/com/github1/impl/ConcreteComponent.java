package com.github1.impl;

import com.github1.base.Component;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/27
 */
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("具体对象操作");
    }
}
