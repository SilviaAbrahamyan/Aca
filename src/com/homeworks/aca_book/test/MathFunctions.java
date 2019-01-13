package com.homeworks.aca_book.test;

/**
 * Created by home on 10/3/2018.
 */
public class MathFunctions {
    public static void addToInt(int x, int amountToAdd) {
        x = x + amountToAdd;
        System.out.println(x);
    }

    public static void main(String[] args) {
        int a = 15;
        int b = 10;
        MathFunctions.addToInt(a, b);
        System.out.println(a);
    }
}
