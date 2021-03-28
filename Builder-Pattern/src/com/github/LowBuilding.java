package com.github;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/28
 */
public class LowBuilding extends ComputerBuilder{
    @Override
    public void cpu() {
        System.out.println("低端cpu");
    }

    @Override
    public void memory() {
        System.out.println("低端memory");
    }

    @Override
    public void disk() {
        System.out.println("低端disk");
    }
}
