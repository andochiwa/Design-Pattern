package com.github;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/31
 */
public class ConcreHandlerC implements Handler{

    private Handler nextHandler;

    public ConcreHandlerC() {
    }

    public ConcreHandlerC(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(int request) {
        if (request >= 20 && request < 30) {
            System.out.println("C处理了:" + request);
        } else {
            nextHandler.handleRequest(request);
        }
    }
}
