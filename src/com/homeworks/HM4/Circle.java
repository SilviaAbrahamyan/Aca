package com.homeworks.HM4;

/**
 * Created by home on 9/16/2018.
 */
public class Circle {

    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI*(Math.pow(radius,2));
    }

    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    public boolean contains(Point p){

        Line centerToP = new Line(center, p);
        return radius  >= centerToP.getLenght();

    }

}
