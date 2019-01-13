package com.homeworks.telegram;

/**
 * Created by home on 10/27/2018.
 */
public class Main1 {
    public static void main(String[] args) {
//        B b = new B() {
//        };
//        b.foo();

        print(new A() { // creatinh annonymous class
            @Override
            public void foo() {

            }
        });
    }

    static void print(A a){

    }
}
interface A{
    default void foo(){
        System.out.println("A's foo");
    }
}

interface B extends A{
    default void foo(){
        A.super.foo();
    }
}