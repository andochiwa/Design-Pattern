package com.github;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/30
 */
public class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton(){}

    public static Singleton getInstance() {
        return instance;
    }
}

class Singleton2 {
    private static Singleton2 instance;

    private Singleton2(){}

    public static Singleton2 getInstance() {
        if (instance == null) {
            synchronized (Singleton2.class) {
                if (instance == null) {
                    instance = new Singleton2();
                }
            }
        }
        return instance;
    }
}

class Singleton3 {

    private static class Instance {
        public final static Singleton3 instance = new Singleton3();
    }

    private Singleton3(){}

    public static Singleton3 getInstance() {
        return Instance.instance;
    }
}
