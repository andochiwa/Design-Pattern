package com.github;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/28
 */
public class Proxy implements Subject {

    Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        System.out.println("代理类开始工作");
        subject.request();
        System.out.println("代理类结束工作");
    }
}
