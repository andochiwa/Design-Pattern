package com.github;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/30
 */
public interface Aggregate {

    Iterator<String> createIterator();

    int count();

    void add(String s);
}
