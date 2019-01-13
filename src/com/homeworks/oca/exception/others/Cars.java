package com.homeworks.oca.exception.others;

/**
 * Created by home on 11/22/2018.
 */
public class Cars {
    static {
        System.out.println("static");
    }
    private static void drive() {
        System.out.println("fast");
    }
    public static void main(String[] args) {
        drive();
        drive();
    }
}
