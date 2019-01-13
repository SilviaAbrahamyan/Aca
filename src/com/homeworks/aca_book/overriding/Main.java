package com.homeworks.aca_book.overriding;


import com.homeworks.aca_book.overriding.a.Base;
import com.homeworks.aca_book.overriding.a.Child;

/**
 * Created by home on 10/4/2018.
 */
public class Main {
    public static void main(String[] args) {
        Bird b = new Eagle();

        //b.fly(5);


        foo(new Child());

    }
    public static void foo(Base b){
        b.foo();
        System.out.println(b.getX());
    }
}
