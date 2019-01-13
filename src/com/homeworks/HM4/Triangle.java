package com.homeworks.HM4;

/**
 * Created by home on 9/16/2018.
 */
public class Triangle {

    private Line ab;
    private Line bc;
    private Line ca;


    public Triangle(Point a, Point b, Point c) {
        this.ab = new Line(a, b);
        this.bc = new Line(b, c);
        this.ca = new Line(c, a);

    }

    public double getArea() {
        return calculateArea(ab.getStart().getX(), ab.getStart().getY(), bc.getStart().getX(), bc.getStart().getY(), ca.getStart().getX(), ca.getStart().getY());
    }

    public double getPerimeter() {
        return ab.getLenght() + bc.getLenght() + ca.getLenght();
    }

    public boolean contains(Point p) {
        return getArea() == calculateArea(ab.getStart().getX(), ab.getStart().getY(), bc.getStart().getX(), bc.getStart().getY(), p.getX(), p.getY()) +
                calculateArea(ab.getStart().getX(), ab.getStart().getY(), p.getX(), p.getY(), ca.getStart().getX(), ca.getStart().getY()) +
                calculateArea(p.getX(), p.getY(), bc.getStart().getX(), bc.getStart().getY(), ca.getStart().getX(), ca.getStart().getY());
    }


    private double calculateArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        return Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) +
                x3 * (y1 - y2)) / 2.0);
    }
}
