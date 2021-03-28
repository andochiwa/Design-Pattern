package com.github;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/28
 */
public class HighBuilding extends ComputerBuilder{
    @Override
    public void cpu() {
        System.out.println("高端cpu");
    }

    @Override
    public void memory() {
        System.out.println("高端memory");
    }

    @Override
    public void disk() {
        System.out.println("高端disk");
    }
}
