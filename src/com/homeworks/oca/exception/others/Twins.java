package com.homeworks.oca.exception.others;

/**
 * Created by home on 11/22/2018.
 */
public class Twins implements Alex, Michael {
    @Override
    public void write() {

    }

     public static void publish() {}
    @Override
    public void think() {

    }
}

interface Alex {
    default void write() {
    }

    static void publish() {
    }

    void think();
}

interface Michael {
    public default void write() {
    }

    public static void publish() {
    }

    public void think();
}