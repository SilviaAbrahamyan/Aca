package com.homeworks.HM4;

/**
 * Created by home on 9/16/2018.
 */
public class Rectangle {

    private Line a;
    private Line b;


    public Rectangle(Point point, Point b, Point c) {
        this.a = new Line(point, b);
        this.b = new Line(point, c);
    }

    public double getArea() {
        return a.getLenght() * b.getLenght();
    }

    public double getPerimeter() {
        return 2 * a.getLenght() + 2 * b.getLenght();
    }

    public boolean contains(Point p) {
        return (this.a.getEnd().getX() <= p.getX()) && (this.a.getEnd().getY() >= p.getY()) &&
                (this.b.getEnd().getX() >= p.getX()) && (this.b.getEnd().getY() <= p.getY());

    }

}
