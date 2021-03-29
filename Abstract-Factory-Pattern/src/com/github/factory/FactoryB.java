package com.github.factory;

import com.github.product.Air;
import com.github.product.AirB;
import com.github.product.Engine;
import com.github.product.EngineB;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/29
 */
public class FactoryB implements AbstractFactory{
    @Override
    public Engine createEngine() {
        return new EngineB();
    }

    @Override
    public Air createAir() {
        return new AirB();
    }
}
