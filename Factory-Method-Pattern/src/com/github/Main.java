package com.github;

import com.github.factory.Factory;
import com.github.factory.VolunteerFactory;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/28
 */
public class Main {

    public static void main(String[] args){
        Factory factory = new VolunteerFactory();
        LeiFeng student = factory.initLeiFeng();
        student.buyRice();
        student.sweep();
        student.wash();

    }
}
