package com.github;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/29
 */
public class Main {

    public static void main(String[] args){
        Originator originator = new Originator("A");
        originator.save();
        originator.show();

        originator.setState("B");
        originator.show();
        originator.save();

        originator.setState("C");
        originator.show();

        Originator rollback = originator.rollback();
        rollback.show();

        Originator rollback1 = rollback.rollback();
        rollback1.show();

    }
}
