package com.homeworks.live;

import com.homeworks.HM4.Point;

/**
 * Created by home on 9/18/2018.
 */
public class Test {

    public static void main(String[] args) {

        int i1 = 1_234;
        double d4 = 1_234.0;
        Point p = new Point(5, 4);
        foo(p);
        System.out.println(p);
        for (int i = 0; i < 5; i++) {

            System.out.println((Integer) i);
        }

        System.out.println(i1);


    }

    static void foo(Point p) {
        p.setX(10);
        p = new Point(20, 20);
        byte j = 127;
        System.out.println(3 + 2 + "a " + 3 + 2);
        System.out.println(("" + j).length());
    }
}
