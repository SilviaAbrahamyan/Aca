package com.homeworks.aca_book.interfaceexamples;

/**
 * Created by home on 10/13/2018.
 */
public interface IsWarmBlooded {
    boolean hasScales();
    public  default double getTemperature() {
        return 10.0;
    }
}
