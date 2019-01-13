package com.homeworks.oca.exception.inheritance;

/**
 * Created by home on 10/28/2018.
 */
public class Canine {
    public Canine getDoggy() {
        return this;
    }

    static {
        System.out.println("wsrG");
    }
}

interface Pet {
    abstract int c();
}