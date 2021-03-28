package com.github;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/28
 */
public class ComputerDirector {
    private ComputerBuilder computerBuilder;

    public ComputerDirector(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public void build() {
        computerBuilder.cpu();
        computerBuilder.memory();
        computerBuilder.disk();
    }
}
