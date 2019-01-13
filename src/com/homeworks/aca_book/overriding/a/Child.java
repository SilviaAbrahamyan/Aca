package com.homeworks.aca_book.overriding.a;


/**
 * Created by home on 10/4/2018.
 */
public class Child extends Base {

    public int x = 5;

//    public void foo() {
//        System.out.println("Child" + this.x);
//    }

    public static void main(String[] args) {
        Child b = new Child();
        b.foo();

    }

    public void foo(Base b) {
        b.foo();
        System.out.println(this.x);
    }


}
