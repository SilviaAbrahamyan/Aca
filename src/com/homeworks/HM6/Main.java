package com.homeworks.HM6;

/**
 * Created by home on 10/2/2018.
 */
public class Main{
    public static void main(String[] args){
        int size = Integer.parseInt(args[0]);
        char[][] matrix = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = '-';
            }
        }
        int p1X = Integer.parseInt(args[1]), p1Y = Integer.parseInt(args[2]),
                p2X = Integer.parseInt(args[3]), p2Y = Integer.parseInt(args[4]);

        if ((p1X < 0 | p1X >= size) | (p1Y < 0 | p1Y >= size) |
                (p2X < 0 | p2X >= size) | (p2Y < 0 | p2Y >= size)) {

            System.out.println("invalid cordinate");
        } else {
            Point p1 = new Point(p1X, p1Y);
            Point p2 = new Point(p2X, p2Y);

            drawLine(matrix, p1, p2);

            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(matrix[i][j]);
                }
                System.out.println();
            }
        }
    }

    private static void drawLine(char[][] matrix, Point p1, Point p2){

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
        }  else
        {
            pdx = 0;
            pdy = incrementY;
            es = dx;
            el = dy;
        }

        x = p1.getX();
        y = p1.getY();
        err = el/2;
        matrix[x][y] = '*';

        for (int t = 0; t < el; t++)
        {
            err -= es;
            if (err < 0)
            {
                err += el;
                x += incrementX;
                y += incrementY;
            }
            else
            {
                x += pdx;
                y += pdy;
            }

            matrix[x][y] = '*';
        }
    }
}

