package com.homeworks.aca_book.io;

/**
 * Created by home on 10/28/2018.
 */
public class InstanceOf {
    public static void main(String args[]) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        if (a instanceof A)
            System.out.println("a is instance of A");
        if (b instanceof B)
            System.out.println("b is instance of B");
        if (c instanceof C)
            System.out.println("c is instance of C");
        if (c instanceof A)
            System.out.println("c can be cast to A");

        if (a instanceof C)
            System.out.println("a can be cast to C");
        System.out.println();
// compare types of derived types
        A ob;
        ob = d; // A reference to d
        System.out.println("ob now refers to d");
        if (ob instanceof A)
            System.out.println("ob is instance of D");
        System.out.println();
    }
}

class A {
    int i, j;
}

class B {
    int i, j;
}

class C extends A {
    int k;
}

class D extends A {
    int k;
}