package com.homeworks.HM5;

/**
 * Created by home on 9/26/2018.
 */
public class Triangle {
    private final Point a;
    private final Point b;
    private final Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Point getA() {
        return this.a;
    }
    public Point getB() {
        return this.b;
    }
    public Point getC() {
        return this.c;
    }
}
