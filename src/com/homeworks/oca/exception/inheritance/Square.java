package com.homeworks.oca.exception.inheritance;

/**
 * Created by home on 10/28/2018.
 */
public final class Square extends Rectangle {
    public static int getEqualSides() {return 4;} // x2
    public static void main(String[] corners) {
        final Square myFigure = new Square(); // x3
        System.out.print(myFigure.getEqualSides());
    }
}
abstract class Parallelogram {
    private int getEqualSides() {return 0;}
}
abstract class Rectangle extends Parallelogram {
    public static int getEqualSides() {return 2;} // x1
}