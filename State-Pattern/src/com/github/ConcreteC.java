package com.github;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/29
 */
public class ConcreteC implements State{
    @Override
    public void handle(Context context) {
        if (context.getChange() == 3) {
            System.out.println("切换到了状态C");
        }
    }
}
