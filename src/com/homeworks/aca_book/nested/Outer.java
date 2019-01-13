package com.homeworks.aca_book.nested;

import com.homeworks.aca_book.nested.Enclosing;

/**
 * Created by home on 10/18/2018.
 */
public class Outer {
    public static int repeat = 5;;

    protected final class Inner {
        public  int repeat = 3;

        public void go() {
            int x = 0;
                System.out.println(repeat);
        }
    }

    public static void go() {

        System.out.println("1 " +  repeat);
    }


    public static void main(String[] args) {
        Outer outer = new Outer();
        Inner inner = outer.new Inner();// create the inner class
        inner.go();
        outer.go();

       // Enclosing.Nested.Nested1 = new Enclosing.Nested.Nested1();
    }
}
