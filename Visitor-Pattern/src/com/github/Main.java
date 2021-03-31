package com.github;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/31
 */
public class Main {

    public static void main(String[] args){
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new ConcreteElementA());
        objectStructure.attach(new ConcreteElementB());

        ConcreteVisitorA visitorA = new ConcreteVisitorA();
        ConcreteVisitorB visitorB = new ConcreteVisitorB();

        objectStructure.accept(visitorA);
        objectStructure.accept(visitorB);
    }
}
