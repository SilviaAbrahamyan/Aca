package com.homeworks.HM77;


/**
 * Created by home on 10/24/2018.
 */
public class FloodFill{
    private int x;
    private int y;

    public FloodFill(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int[][] floodFill(int[][] matrix) {
        int maxX = matrix.length - 1;
        int maxY = matrix[0].length - 1;
        int[][] stack = new int[(maxX+1)*(maxY+1)][2];
        int index = 0;

        stack[0][0] = x;
        stack[0][1] = y;
        matrix[x][y] = 1;

        while (index >= 0){
            x = stack[index][0];
            y = stack[index][1];
            index--;

            if ((x > 0) && (matrix[x-1][y] == 0)){
                matrix[x-1][y] = 1;
                index++;
                stack[index][0] = x-1;
                stack[index][1] = y;
            }

            if ((x < maxX) && (matrix[x+1][y] == 0)){
                matrix[x+1][y] = 1;
                index++;
                stack[index][0] = x+1;
                stack[index][1] = y;
            }

            if ((y > 0) && (matrix[x][y-1] == 0)){
                matrix[x][y-1] = 1;
                index++;
                stack[index][0] = x;
                stack[index][1] = y-1;
            }

            if ((y < maxY) && (matrix[x][y+1] == 0)){
                matrix[x][y+1] = 1;
                index++;
                stack[index][0] = x;
                stack[index][1] = y+1;
            }
        }

        return matrix;
    }
}
