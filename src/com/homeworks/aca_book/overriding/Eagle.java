package com.homeworks.aca_book.overriding;

/**
 * Created by home on 10/5/2018.
 */
public class Eagle extends Bird {
     int fly(int height) {
        System.out.println("Bird is flying at "+height+" meters");
        return height;
    }
//    public int eat(int food) { // DOES NOT COMPILE
//        System.out.println("Bird is eating "+food+" units of food");
//        return food;
//    }
}
