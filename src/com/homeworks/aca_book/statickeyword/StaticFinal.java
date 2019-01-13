package com.homeworks.aca_book.statickeyword;

import java.util.ArrayList;

/**
 * Created by home on 10/4/2018.
 */
public class StaticFinal {
    private static final ArrayList<String> values = new ArrayList<>();
    private static final int four = 0;

   static String name = "Webby";
    public static void speak() {
        name = "Sparky";
    }
    public static void main(String[] args) {
        speak();
        System.out.println(name);
        values.add("changed");
        values.add("3");
        for(String s: values){

            System.out.println(s);
        }
    }
}
