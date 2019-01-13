package com.homeworks.live.vtable;

/**
 * Created by home on 11/21/2018.
 */
public class Main1 {
    public static void main(String[] args) {
        Base1 b = new Child1();
        Child1 c = new Child1();
        b.foo(5);
        c.foo(3);
        System.out.println(b.x);
        System.out.println(c.x);
    }
}
class Base1{
    int x = 10;
    //Overloading foo method...


    void foo(Integer i){
        System.out.println(" Integer Base");
    }

    void foo(int i) {
        System.out.println(" int Base");
    }
}

 class Child1 extends Base1{
    int x = 15;

    //Overriding Base.foo(Integer i)
    void foo(Integer i) {
        System.out.println(" Integer Child");
    }
    //Overriding Base.foo(int i)
    void foo(int i){
        System.out.println(" int Child");
    }

}