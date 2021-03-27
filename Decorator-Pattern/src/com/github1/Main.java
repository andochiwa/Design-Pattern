package com.github1;

import com.github1.impl.ConcreteComponent;
import com.github1.impl.ConcreteDecoratorA;
import com.github1.impl.ConcreteDecoratorB;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/27
 */
public class Main {

    public static void main(String[] args){
        // 被装饰类c
        ConcreteComponent c = new ConcreteComponent();
        // d1装饰c
        ConcreteDecoratorA d1 = new ConcreteDecoratorA(c);
        // d2装饰d1
        ConcreteDecoratorB d2 = new ConcreteDecoratorB(d1);
        // 执行d2
        d2.operation();
    }
}
