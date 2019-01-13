package com.homeworks.HM4;

/**
 * Created by home on 9/16/2018.
 */
public class Line {

    private Point start;
    private Point end;


    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public double getLenght() {
        return Math.sqrt(Math.pow((this.end.getX() - this.start.getX()), 2) + Math.pow((this.end.getY() - this.start.getY()), 2) +
                Math.pow((this.end.getZ() - this.start.getZ()), 2));

    }

    // ac + cb = ab
//    public boolean contains(Point p){
//        return (Math.sqrt(Math.pow((p.getX()-this.start.getX()),2) + Math.pow((p.getY()-this.start.getY()),2)) +
//                Math.sqrt(Math.pow((this.end.getX()-p.getX()),2) + Math.pow((this.end.getY()-p.getY()),2))) ==
//                getLenght();
//    }


    public boolean contains(Point p) {
        return ((p.getY() - this.start.getY()) / (this.end.getY() - this.start.getY()) -
                (p.getX() - this.start.getX()) / (this.end.getX() - this.start.getX()) == 0) ||
                (p.getY() == this.start.getY() && this.end.getY() == p.getY() &&
                        this.start.getX() < p.getX() && p.getX() > this.end.getY()) ||
                (p.getX() == this.start.getX() && this.end.getX() == p.getX() &&
                        this.start.getY() < p.getY() && p.getY() > this.end.getY());
    }

    @Override
    public String toString() {
        return "Line{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }

    public static void main(String[] args) {

        Line l = new Line(new Point(4, 3), new Point(4, 5));
        System.out.println(l.contains(new Point(4, 1)));
    }
}
