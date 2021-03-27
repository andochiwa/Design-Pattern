package com.github;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/28
 */
public class RealSubject implements Subject{
    @Override
    public void request() {
        System.out.println("真实的请求");
    }
}
