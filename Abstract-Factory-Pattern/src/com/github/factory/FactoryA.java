package com.github.factory;

import com.github.product.Air;
import com.github.product.AirA;
import com.github.product.Engine;
import com.github.product.EngineA;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/29
 */
public class FactoryA implements AbstractFactory{
    @Override
    public Engine createEngine() {
        return new EngineA();
    }

    @Override
    public Air createAir() {
        return new AirA();
    }
}
