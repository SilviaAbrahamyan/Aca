package com.homeworks.aca_book.Immutability;

/**
 * Created by home on 10/3/2018.
 */
public class Immutabile {

    private final int number;


    public Immutabile(int number) {

        this.number = number;
    }

    public int getNumber() {
        return number;
    }
    public static void main(String[] args) {

        Immutabile m = new Immutabile(4);
    }
}
