package com.github;

import java.util.ArrayList;
import java.util.List;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/30
 */
public class ConcreteAggregate implements Aggregate{

    private List<String> aggregate = new ArrayList<>();

    @Override
    public Iterator<String> createIterator() {
        return new ConcreteIterator(aggregate);
    }

    @Override
    public int count() {
        return aggregate.size();
    }

    @Override
    public void add(String s) {
        aggregate.add(s);
    }
}
