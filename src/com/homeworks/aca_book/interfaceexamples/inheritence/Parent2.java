package com.homeworks.aca_book.interfaceexamples.inheritence;

/**
 * Created by home on 10/14/2018.
 */
public interface Parent2 {
    //public  int getSpeed() ;

    public  int getSpeed();

    default boolean isBlind() { return true; }

    }
