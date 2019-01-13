package com.homeworks.HM77;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by home on 10/24/2018.
 */
public class Main1 {
    public static void main(String... args) throws IOException {
        int row = 500;
        int col = 500;
        List<Object> shapeList = new ArrayList<>();
        Object element = null;
        Scanner sc = new Scanner(System.in);
        boolean bool = false;
        while (!bool) {
            System.out.println("Please enter the command: ");
            System.out.println("(E) Export as an image ");
            System.out.println("(F) Fill at point (Extra point)");
            System.out.println("(C) Create a shape");
            System.out.println("(O) Exit");
            String letter = sc.nextLine();
            String[] points;
            switch (letter) {
                case "O":
                    bool = true;
                    break;
                case "E":
                    writeInFile(shapeList,row,col);
                    break;
                case "F":
                    System.out.println("Please insert the coordinate");
                    points = sc.nextLine().split(" ");
                    for (String point : points) {
                        if (Integer.parseInt(point) >= 0 && Integer.parseInt(point) < row && Integer.parseInt(point) < col) {
                            element = constructExtraPoint(points);
                            shapeList.add(element);
                        } else {
                            System.out.println("invalid cordinate");
                            break;
                        }
                    }
                    break;
                case "C":
                    System.out.println("Please select the shape type");
                    System.out.println("(P) Point");
                    System.out.println("(L) Line");
                    System.out.println("(T) Triangle");
                    letter = sc.nextLine();
                    switch (letter) {
                        case "P":
                            System.out.println("Point    ----------------------> Please enter the coordinates ->");
                            points = sc.nextLine().split(" ");
                            for (String point : points) {
                                if (Integer.parseInt(point) >= 0 && Integer.parseInt(point) < row && Integer.parseInt(point) < col) {
                                    element = constructPoint(points);
                                    shapeList.add(element);
                                } else {
                                    System.out.println("invalid cordinate");
                                    break;
                                }
                            }
                            break;
                        case "L":
                            System.out.println("Line    ----------------------> Please enter the coordinates ->");
                            points = sc.nextLine().split(" ");
                            for (String point : points) {
                                if (Integer.parseInt(point) >= 0 && Integer.parseInt(point) < row && Integer.parseInt(point) < col) {
                                    element = constructLine(points);
                                    shapeList.add(element);
                                } else {
                                    System.out.println("invalid cordinate");
                                    break;
                                }
                            }
                            break;
                        case "T":
                            System.out.println("Triangle    ----------------------> Please enter the coordinates ->");
                            points = sc.nextLine().split(" ");
                            for (String point : points) {
                                if (Integer.parseInt(point) >= 0 && Integer.parseInt(point) < row && Integer.parseInt(point) < col) {
                                    element = constructTriangle(points);
                                    shapeList.add(element);
                                } else {
                                    System.out.println("invalid cordinate");
                                    shapeList.add(element);
                                    break;
                                }
                                break;
                            }
                            break;
                    }
            }
        }
    }

    private static void writeInFile(List<Object> shapeList, int row, int col) throws IOException {

        int[][] matrix = new int[row][col];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = 0;
            }
        }
        for (Object list : shapeList) {
            if (list != null) {
                if (list instanceof FloodFill) {
                    FloodFill f = (FloodFill) list;
                    matrix = f.floodFill(matrix);
                } else if (list instanceof Line) {
                    Line l = (Line) list;
                    matrix = l.draw(matrix);
                } else if (list instanceof Triangle) {
                    Triangle t = (Triangle) list;
                    matrix = t.draw(matrix);
                } else if (list instanceof Point) {
                    Point p = (Point) list;
                    matrix = p.draw(matrix);
                } else {
                    System.out.println("Unknown format");
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();

        }
    }


    private static Point constructPoint(String[] pointArgs) {
        int[] points = new int[2];
        points[0] = Integer.parseInt(pointArgs[0]);
        points[1] = Integer.parseInt(pointArgs[1]);
        return new Point(points[0], points[1]);
    }

    private static FloodFill constructExtraPoint(String[] pointArgs) {
        int[] points = new int[2];
        points[0] = Integer.parseInt(pointArgs[0]);
        points[1] = Integer.parseInt(pointArgs[1]);
        return new FloodFill(points[0], points[1]);
    }

    private static Line constructLine(String[] pointArgs) {
        Point[] points = new Point[2];
        points[0] = new Point(Integer.parseInt(pointArgs[0]), Integer.parseInt(pointArgs[1]));
        points[1] = new Point(Integer.parseInt(pointArgs[2]), Integer.parseInt(pointArgs[3]));
        return new Line(points[0], points[1]);
    }

    private static Triangle constructTriangle(String[] pointArgs) {
        Point[] points = new Point[3];
        points[0] = new Point(Integer.parseInt(pointArgs[0]), Integer.parseInt(pointArgs[1]));
        points[1] = new Point(Integer.parseInt(pointArgs[2]), Integer.parseInt(pointArgs[3]));
        points[2] = new Point(Integer.parseInt(pointArgs[4]), Integer.parseInt(pointArgs[5]));
        return new Triangle(points[0], points[1], points[2]);
    }
}

