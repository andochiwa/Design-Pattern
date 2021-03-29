package com.github;

import java.util.LinkedList;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/29
 */
public class Memento {

    private LinkedList<Originator> mementos = new LinkedList<>();

    public void save(Originator originator) {
        mementos.addLast(originator);
    }

    public Originator get() {
        if (mementos.isEmpty()) {
            return null;
        }
        Originator originator = mementos.getLast();
        mementos.removeLast();
        return originator;
    }

}
