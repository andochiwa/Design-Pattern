package com.github.factory;

import com.github.LeiFeng;
import com.github.Undergraduate;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/28
 */
public class UndergraduateFactory implements Factory{
    @Override
    public LeiFeng initLeiFeng() {
        return new Undergraduate();
    }
}
