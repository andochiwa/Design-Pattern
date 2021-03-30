package com.github;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/31
 */
public class ConcreHandlerB implements Handler{

    private Handler nextHandler;

    public ConcreHandlerB() {
    }

    public ConcreHandlerB(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(int request) {
        if (request >= 10 && request < 20) {
            System.out.println("B处理了:" + request);
        } else {
            nextHandler.handleRequest(request);
        }
    }
}
