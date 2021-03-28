package com.github;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/28
 */
public interface Abstract {

    void PrimitiveOperation1();

    void PrimitiveOperation2();

    default void TemplateMethod() {
        PrimitiveOperation1();
        PrimitiveOperation2();
    }
}
