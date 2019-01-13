package com.homeworks.aca_book.collections.generic;

/**
 * Created by home on 10/28/2018.
 */
public class NonGen {
    Object ob; // ob is now of type Object
    // Pass the constructor a reference to
// an object of type Object
    NonGen(Object o) {
        ob = o;
    }
    // Return type Object.
    Object getob() {
        return ob;
    }
    // Show type of ob.
    void showType() {
        System.out.println("Type of ob is " +
                ob.getClass().getName());
    }
}
