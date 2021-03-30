package com.github;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/31
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}
