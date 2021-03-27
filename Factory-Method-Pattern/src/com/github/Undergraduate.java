package com.github;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/28
 */
public class Undergraduate implements LeiFeng {
    @Override
    public void sweep() {
        System.out.println("大学生扫地");
    }

    @Override
    public void wash() {
        System.out.println("大学生洗碗");
    }

    @Override
    public void buyRice() {
        System.out.println("大学生买米");
    }
}
