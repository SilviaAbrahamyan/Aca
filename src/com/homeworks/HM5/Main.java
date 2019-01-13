package com.homeworks.HM5;

import java.util.Scanner;

/**
 * Created by home on 9/26/2018.
 */
public class Main {

    public static void main(String... args) {
        Space2d space2d = new Space2d();

        //"3,4 7,5 5,2" xml

        for (int i = 0; i < args.length - 1; i++) {
            String arg = args[i];
            String[] pointArgs = arg.split(" ");

            Object element = null;

            switch (pointArgs.length) {
                case 1:
                    element = constructPoint(pointArgs);
                    break;
                case 2:
                    element = constructLine(pointArgs);
                    break;
                case 3:
                    element = constructTriangle(pointArgs);
                    break;
            }

            space2d.addElement(element);
        }

       String format = args[args.length - 1];

        for (Object element : space2d.getElements()) {
            if (element != null) {
                if ("xml".equals(format)) {
                    System.out.println(XmlSerializer.toXml(element));
                } else if ("json".equals(format)) {
                    System.out.println(JsonSerializer.toJson(element));
                } else {
                    System.out.println("Unknown format");
                }
            }
        }
    }

    private static Point constructPoint(String[] pointArgs) {
        int[] points = new int[2];
        String[] pointParams = pointArgs[0].split(",");
        points[0] = Integer.parseInt(pointParams[0]);
        points[1] = Integer.parseInt(pointParams[1]);
        return new Point(points[0], points[1]);
    }

    private static Line constructLine(String[] pointArgs) {
        Point[] points = new Point[pointArgs.length];
        for (int i = 0; i < pointArgs.length; i++) {
            String[] pointParams = pointArgs[i].split(",");
            points[i] = new Point(
                    Integer.parseInt(pointParams[0]),
                    Integer.parseInt(pointParams[1])
            );
        }
        return new Line(points[0], points[1]);
    }

    private static Triangle constructTriangle(String[] pointArgs) {
        Point[] points = new Point[pointArgs.length];

        for (int i = 0; i < pointArgs.length; i++) {
            String[] pointParams = pointArgs[i].split(",");
            points[i] = new Point(
                    Integer.parseInt(pointParams[0]),
                    Integer.parseInt(pointParams[1])
            );
        }

        return new Triangle(points[0], points[1], points[2]);
    }

}
