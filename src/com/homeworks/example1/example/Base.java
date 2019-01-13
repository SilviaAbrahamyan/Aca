package com.homeworks.example1.example;

/**
 * Created by home on 10/5/2018.
 */
public class Base{
    int x = 10;
    void foo(Integer i){
        System.out.println("Base");
    }
}

 class Child extends Base{
    int x = 15;
    void foo(int i){
        System.out.println("Child");
    }
}

 class Main1{
    public static void main(String[] args) {
        Base b = new Child();
        Child c = new Child();
        b.foo(5);
        c.foo(new Integer(3));
        System.out.println(b.x);
        System.out.println(c.x);
    }
}

