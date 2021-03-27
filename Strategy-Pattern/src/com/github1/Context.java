package com.github1;

/**
 * 环境类
 * @author HAN
 * @version 1.0
 * @create 2021/3/26
 */
public class Context {

    private Strategy strategy;

    public Context(String type) {
        switch (type) {
            case "正常收费":
                strategy = new CashStrategyA();
            case "打9折":
                strategy = new CashStrategyB();
            case "满300返100":
                strategy = new CashStrategyC();
        }
    }

    public void getResult() {
        strategy.algorithm();
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
