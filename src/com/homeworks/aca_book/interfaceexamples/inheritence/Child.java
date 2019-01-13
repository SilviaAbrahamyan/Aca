package com.homeworks.aca_book.interfaceexamples.inheritence;

/**
 * Created by home on 10/14/2018.
 */
public class Child extends Parent3 implements Parent1 {
//    @Override
//    public void foo() {
//        System.out.println("foo");
//    }


//
//    @Override
//    public int getSpeed() {
//        return 5;
//    }


    public static void main(String... args) {

//        Parent1 p = new Child();
//        Object p2 = new Child();
//        Parent3 c = (Parent3)new Child();
//        System.out.println(new Child().getpeed(-4));
        // System.out.println(c.isBlind());
//        System.out.println(c.getSpeed());
//        System.out.println(c.getpeed());
        //System.out.println(p2.getSpeed());


        Parent1 p1 = new Child();
        System.out.println(p1.getSpeed());


    }
}
