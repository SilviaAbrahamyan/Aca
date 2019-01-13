package com.homeworks.aca_book.interfaceexamples.inheritence.ovveriding;

/**
 * Created by home on 11/14/2018.
 */
public interface Parent {
    int v();
}

interface Parent1 extends Parent {
    default int v() {
        return 1;
    }

}

abstract class Parent2  {

    public int v() {
        return 2;
    }

}

class Child extends Parent2 implements Parent1 {
    public static void main(String[] args) {
        Parent p = new Child();
        System.out.println(((Parent1)p).v());
        System.out.println(new Child().v());
    }
}