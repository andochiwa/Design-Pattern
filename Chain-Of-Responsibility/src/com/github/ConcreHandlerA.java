package com.github;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/31
 */
public class ConcreHandlerA implements Handler{

    private Handler nextHandler;

    public ConcreHandlerA() {
    }

    public ConcreHandlerA(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(int request) {
        if (request >= 0 && request < 10) {
            System.out.println("A处理了:" + request);
        } else {
            nextHandler.handleRequest(request);
        }
    }
}
