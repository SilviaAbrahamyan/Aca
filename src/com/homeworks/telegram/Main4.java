package com.homeworks.telegram;

/**
 * Created by home on 10/27/2018.
 */
public class Main4 {
    public static void main(String[] args) {
        Outer.A i = new Outer.A();
        i.foo();
    }
}

class Outer {
    static class A {
        static void foo() {
            System.out.println("Static");
        }

    }
}
