package com.github;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/31
 */
public class ConcreteVisitorB implements Visitor {
    @Override
    public void visitConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println(concreteElementA.getClass().getName() + "被" + this.getClass().getName() + "访问");
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println(concreteElementB.getClass().getName() + "被" + this.getClass().getName() + "访问");
    }
}
