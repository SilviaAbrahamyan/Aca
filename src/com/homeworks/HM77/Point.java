package com.homeworks.HM77;

/**
 * Created by home on 9/26/2018.
 */
public class Point{
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int[][] draw(int[][] matrix) {
        matrix[x][y] = 1;
        return matrix;
    }
}