package com.github;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/29
 */
public class Context {
    private State state;
    private int change;

    public Context(State state, int change) {
        this.state = state;
        this.change = change;
    }

    public void request() {
        state.handle(this);
    }

    public void change() {
        change++;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getChange() {
        return change;
    }
}
