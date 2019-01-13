package com.homeworks.live;

/**
 * Created by home on 10/15/2018.
 */
public class Main7 {
    public static void main(String... args) throws Exception {
        X x = new X();
        x.foo();
    }

}

class A1 {
//    private void foo() {
//    	System.out.println("IllegalAccessError method");
//    }

    public void foo() {
        System.out.println("Public class method");
    }
}

interface B1 {
    default void foo() {
        System.out.println("Interface method");
    }
}

class X extends A1 implements B1 {
}
