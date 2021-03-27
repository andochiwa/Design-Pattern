package com.github.factory;

import com.github.LeiFeng;
import com.github.Volunteer;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/28
 */
public class VolunteerFactory implements Factory{
    @Override
    public LeiFeng initLeiFeng() {
        return new Volunteer();
    }
}
