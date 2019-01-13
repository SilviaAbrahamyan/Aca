package com.homeworks.aca_book.generics;

/**
 * Created by home on 11/15/2018.
 */
public class Coffee {
    private static long counter = 0;
    private final long id = counter++;
    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}
class Latte extends Coffee {} ///:~


 class Mocha extends Coffee {} ///:~


 class Cappuccino extends Coffee {} ///:~


 class Americano extends Coffee {} ///:~


 class Breve extends Coffee {} ///:~