package com.homeworks.aca_book.interfaceexamples;

/**
 * Created by home on 10/13/2018.
 */
public interface IsBloodedWarm extends IsWarmBlooded {
    int v = 0;
    @Override
    default double getTemperature() {
        return 0;
    }

    @Override
   default boolean hasScales(){
        return true;
    };
}
