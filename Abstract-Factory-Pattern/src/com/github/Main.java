package com.github;

import com.github.factory.AbstractFactory;
import com.github.factory.FactoryA;
import com.github.factory.FactoryB;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/29
 */
public class Main {

    public static void main(String[] args){
        AbstractFactory factoryA = new FactoryA();
        factoryA.createEngine();
        factoryA.createAir();

        AbstractFactory factoryB = new FactoryB();
        factoryB.createEngine();
        factoryB.createAir();
    }
}
