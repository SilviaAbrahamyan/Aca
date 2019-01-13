package com.homeworks.HM77;



/**
 * Created by home on 9/26/2018.
 */
public class Line {
    private final Point p1;
    private final Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        return this.p1;
    }
    public Point getP2() {
        return this.p2;
    }


    public int[][] draw(int[][] matrix) {
        int p1X = 0, p2Y = 0, p2X = 0, p1Y = 0;

        int dx = p2.getX() - p1.getX();
        int dy = p2.getY() - p1.getY();

        int incrementX = (dx > 0) ? 1 : (dx < 0) ? -1 : 0;
        int incrementY = (dy > 0) ? 1 : (dy < 0) ? -1 : 0;
        dx = Math.abs(dx);
        dy = Math.abs(dy);
        int x, y, pdx, pdy, es, el, err;

        if (dx > dy) {
            pdx = incrementX;
            pdy = 0;
            es = dy;
            el = dx;
        } else {
            pdx = 0;
            pdy = incrementY;
            es = dx;
            el = dy;
        }

        x = p1.getX();
        y = p1.getY();
        err = el / 2;
        matrix[x][y] = 1;

        for (int t = 0; t < el; t++) {
            err -= es;
            if (err < 0) {
                err += el;
                x += incrementX;
                y += incrementY;
            } else {
                x += pdx;
                y += pdy;
            }

            matrix[x][y] = 1;
        }
        return matrix;
    }
}
