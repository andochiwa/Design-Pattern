package com.github;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/30
 */
public class Main {

    public static void main(String[] args){
        Aggregate aggregate = new ConcreteAggregate();

        aggregate.add("A");
        aggregate.add("B");
        aggregate.add("C");
        aggregate.add("D");
        aggregate.add("E");
        aggregate.add("F");

        Iterator<String> iterator = aggregate.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
