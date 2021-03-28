package com.github;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/28
 */
public class ConcretePrototype extends Prototype{

    private String id;

    public ConcretePrototype(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "id='" + id + '\'' +
                '}';
    }
}
