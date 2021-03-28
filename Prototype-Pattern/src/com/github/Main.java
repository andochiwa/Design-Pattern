package com.github;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/28
 */
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype concretePrototype = new ConcretePrototype("1");
        Prototype clone = concretePrototype.clone();
        System.out.println("当前对象");
        System.out.println(concretePrototype);
        System.out.println("克隆对象");
        System.out.println(clone);
        System.out.println("相等？" + (concretePrototype == clone));
    }
}
