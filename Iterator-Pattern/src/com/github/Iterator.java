package com.github;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/30
 */
public interface Iterator<E> {

    E First();

    E next();

    boolean hasNext();

}
