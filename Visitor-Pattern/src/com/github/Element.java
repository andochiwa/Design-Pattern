package com.github;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/31
 */
public interface Element {

    void accept(Visitor visitor);
}
