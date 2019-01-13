package com.homeworks.HM4;

/**
 * Created by home on 9/16/2018.
 */
public class Cube {

    private Line range;
    private double side;

    public Cube(Point a, Point b) {

        this.range = new Line(a, b);
        this.side = range.getLenght()/(Math.sqrt(3));
    }

    public double getArea() {
        return 6 * side * side;
    }

    public double getPerimeter() {
        return 12 * side;
    }

    public double getVolume() {
        return Math.pow(side,3);
    }

    public boolean contains(Point p) {
        return (this.range.getStart().getX() <= p.getX()) && (this.range.getStart().getY() >= p.getY() && (this.range.getStart().getZ() >= p.getZ()) &&
                (this.range.getEnd().getX() >= p.getX()) && (this.range.getEnd().getY() <= p.getY()))  && (this.range.getEnd().getZ() <= p.getZ());

    }
}
