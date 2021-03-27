package com.github1;

import java.util.Scanner;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/26
 */
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        Context context = new Context(next);
        context.getResult();
    }
}
