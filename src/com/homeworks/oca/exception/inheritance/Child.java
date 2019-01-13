package com.homeworks.oca.exception.inheritance;



/**
 * Created by home on 10/28/2018.
 */
public class Child extends Parent{
    int x = 6;
    public static void foo(){
        System.out.println("C");
    }

    public static void main(String[] args) {
        Child c = new Child();
        Parent p = new Child();
        System.out.println(c.x + "," + p.x);

    }
}
class Parent{
    int x = 7;
    public static void foo(){
        System.out.println("P");
    }
}