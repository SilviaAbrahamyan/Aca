package com.homeworks.aca_book.inheritence.order;

/**
 * Created by home on 9/28/2018.
 */
public class A {A() {
    System.out.println("Inside A's constructor.");
}
}

// Create a subclass by extending class A.
class B extends A {
    B() {
        System.out.println("Inside B's constructor.");
    }
}
// Create another subclass by extending B.
class C extends B {
    C() {
        System.out.println("Inside C's constructor.");
    }
}
class CallingCons {
    public static void main(String args[]) {
        B c = new B();
    }
}