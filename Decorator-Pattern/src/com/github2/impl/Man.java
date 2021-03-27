package com.github2.impl;

import com.github2.base.Human;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/28
 */
public class Man implements Human {
    @Override
    public void run() {
        System.out.println("人可以跑");
    }
}
