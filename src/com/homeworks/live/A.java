package com.homeworks.live;

/**
 * Created by home on 9/19/2018.
 */
public  class A {
    int x;

    void f(){

        x = 1;
    }
}

class B extends A{

    final A a= new A();

    final void k(){

        System.out.println(a.x = 4235);
    }
}
