package com.github;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/28
 */
public class ConcreteB implements Abstract{
    @Override
    public void PrimitiveOperation1() {
        System.out.println("B类实现方法1");
    }

    @Override
    public void PrimitiveOperation2() {
        System.out.println("B类实现方法2");
    }
}
