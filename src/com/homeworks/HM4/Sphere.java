package com.homeworks.HM4;

/**
 * Created by home on 9/16/2018.
 */
public class Sphere {

    private Point center;
    private double radius;

    public Sphere(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public double getArea() {
        return 4*Math.PI*(Math.pow(radius,2));
    }

    public double getVolume() {
        return (4/3)*Math.PI*(Math.pow(radius,3));
    }

    public boolean contains(Point p) {
        return Math.pow(p.getX() - center.getX(),2) + Math.pow(p.getY() - center.getY(),2) +
                Math.pow(p.getZ() - center.getZ(),2) <= Math.pow(radius,2);

    }
}
