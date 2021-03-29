package com.github.factory;

import com.github.product.Air;
import com.github.product.Engine;

/**
 * 抽象工厂类
 * @author HAN
 * @version 1.0
 * @create 2021/3/29
 */
public interface AbstractFactory {

    Engine createEngine();

    Air createAir();

}
