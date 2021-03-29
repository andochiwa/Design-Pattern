package com.github;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/29
 */
public class Originator implements Cloneable{

    private Memento memento = new Memento();

    private String state;

    public void save() {
        try {
            memento.save((Originator) this.clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    public Originator rollback() {
        return memento.get();
    }

    public Originator(String state) {
        this.state = state;
    }

    public void show() {
        System.out.println("现在状态为" + state);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
