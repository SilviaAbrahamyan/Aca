package com.homeworks.aca_book.collections;

/**
 * Created by home on 10/25/2018.
 */
public enum  OnlyOne {
    ONCE(true);

    OnlyOne(boolean b) {
        System.out.println("constructing");
    }

    public static void main(String[] args) {
        OnlyOne firstCall = OnlyOne. ONCE ;
        OnlyOne secondCall = OnlyOne. ONCE ;
    }
}
