package com.github;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/29
 */
public class Adapter extends Target{

    private Adaptee adaptee = new Adaptee();

    // 翻译，这样就能做到不同方法名调用同一个方法
    @Override
    public void request() {
        adaptee.SpecificRequest();
    }
}
