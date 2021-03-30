package com.github;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/31
 */
public class Main {

    public static void main(String[] args){
        Handler handlerC = new ConcreHandlerC();
        Handler handlerB = new ConcreHandlerB(handlerC);
        Handler handlerA = new ConcreHandlerA(handlerB);

        int[] request = new int[]{0, 10, 20, 15, 29, 5, 6, 8, 23, 25, 16, 18};

        for (int i : request) {
            handlerA.handleRequest(i);
        }
    }
}
