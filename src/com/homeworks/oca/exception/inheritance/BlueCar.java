package com.homeworks.oca.exception.inheritance;

/**
 * Created by home on 10/28/2018.
 */
public class BlueCar extends Car1{
   static { System.out.print("5"); }
    { System.out.print("4"); }
    public BlueCar() {
        super("blue");
        System.out.print("5");
    }
    public static void main(String[] gears) {
        new BlueCar();
    }
}
abstract class Car1 {
    static { System.out.print("1"); }
    public Car1(String name) {
        super();
        System.out.print("2");
    }
    { System.out.print("3"); }
}