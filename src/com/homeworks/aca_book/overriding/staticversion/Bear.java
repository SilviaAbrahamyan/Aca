package com.homeworks.aca_book.overriding.staticversion;

/**
 * Created by home on 10/5/2018.
 */
public class Bear {
    public static void eat() {
        System.out.println("Bear is eating");
    }
}

 class Panda extends Bear {
    public static void eat() {
        System.out.println("Panda bear is chewing");
    }
    public static void main(String[] args) {

        Bear b = new Panda();
        new Panda().eat();
    }
}

