package com.homeworks.HM77;



/**
 * Created by home on 9/16/2018.
 */
public class Triangle{

    private Line ab;
    private Line bc;
    private Line ca;


    public Triangle(Point a,Point b, Point c) {
        this.ab = new Line(a, b);
        this.bc = new Line(b, c);
        this.ca = new Line(c, a);

    }

    public int[][] draw(int[][] matrix) {
        ab.draw(matrix);
        bc.draw(matrix);
        ca.draw(matrix);
        return matrix;
    }
}
