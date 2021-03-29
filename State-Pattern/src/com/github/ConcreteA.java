package com.github;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/29
 */
public class ConcreteA implements State{
    @Override
    public void handle(Context context) {
        if (context.getChange() == 1) {
            System.out.println("切换到了状态A");
        } else {
            context.setState(new ConcreteB());
            context.request();
        }
    }
}
