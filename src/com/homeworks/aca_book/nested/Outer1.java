package com.homeworks.aca_book.nested;

/**
 * Created by home on 10/18/2018.
 */
public class Outer1 {
    private int length = 5;

    public void calculate() {
        final int width = 20;
        int one = 20;
        int two = one;
        two++;
        int three;
        if ( one == 4) three = 3;
        else three = 4;
        int four = 4;
        class Inner {
            private int length = Outer1.this.length;
            int width = 40;
            public void multiply() {
                System.out.println(width);
                System.out.println(length);
                System.out.println(one);
               // System.out.println(two);
                System.out.println(three);
                System.out.println(four);

            }
        }
        Inner inner = new Inner();
        inner.multiply();
    }

    public static void main(String[] args) {
        Outer1 outer = new Outer1();
        outer.calculate();
    }
}
