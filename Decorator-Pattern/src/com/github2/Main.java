package com.github2;

import com.github2.base.Human;
import com.github2.impl.Man;
import com.github2.impl.ManDecorator;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/28
 */
public class Main {

    public static void main(String[] args){
        // 被装饰的类
        Human man = new Man();
        // 装饰的类
        ManDecorator manDecorator = new ManDecorator(man);
        // 执行增强后的run方法
        manDecorator.run();
    }
}
