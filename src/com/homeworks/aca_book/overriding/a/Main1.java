package com.homeworks.aca_book.overriding.a;

import com.homeworks.aca_book.overriding.b.Child1;

/**
 * Created by home on 10/4/2018.
 */
public class Main1 {
    {
        System.out.println(this.x);
        x = 9;
    }

    int x = 8;
    public static void main(String[] args) {
        foo(new Child1());

    }
    public static void foo(Base1 b){
        fOoo(new int[5]);
        b.foo();
        Main1 m = new Main1();
        System.out.println(m.x);
    }

    public static void fOoo(int ... x){

    }
}
