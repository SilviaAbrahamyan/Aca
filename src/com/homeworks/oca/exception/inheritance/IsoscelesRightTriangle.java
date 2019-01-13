package com.homeworks.oca.exception.inheritance;

/**
 * Created by home on 10/28/2018.
 */
public abstract class IsoscelesRightTriangle extends RightTriangle {
    public String getDescription() { return "rt"; }
    public static void main(String[] edges) {
        final Triangle shape = new RightTriangle(); // g3
        System.out.print(shape.getDescription());
    }
}

abstract class Triangle {
    abstract String getDescription();
}

class RightTriangle extends Triangle {
    protected String getDescription() {
        return "rga";
    } // g1
}