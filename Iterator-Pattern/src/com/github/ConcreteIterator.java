package com.github;

import java.util.List;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/30
 */
public class ConcreteIterator implements Iterator<String>{

    private List<String> aggregate;
    private int index = 0;

    public ConcreteIterator(List<String> aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public String First() {
        return aggregate.get(0);
    }

    @Override
    public String next() {
        return aggregate.get(index++);
    }

    @Override
    public boolean hasNext() {
        return aggregate.size() > index;
    }
}
