package com.homeworks.HM5;

import java.util.ListIterator;

/**
 * Created by home on 9/26/2018.
 */
public class XmlSerializer {
    public static String toXml(Object obj) {
        if (obj instanceof Point) {
            return pointToXml((Point) obj, "");
        } else if (obj instanceof Line) {
            return pointToXml((Line) obj);
        } else {
            return pointToXml((Triangle) obj);
        }
        //TODO for Line and Triangle

        //  return null;
    }

    private static String pointToXml(Triangle obj) {

        StringBuilder builder = new StringBuilder();
        builder.append("<Triangle>").append("\n");
        builder.append("\t").append(pointToXml(obj.getA(), "\t")).append("\n");
        builder.append("\t").append(pointToXml(obj.getB(), "\t")).append("\n");
        builder.append("\t").append(pointToXml(obj.getC(), "\t")).append("\n");

//        builder.append("\t").append("<Point>").append("\n");
//        builder.append("\t").append("\t").append("<x>").append(obj.getA().getX()).append("</x>").append("\n");
//        builder.append("\t").append("\t").append("<y>").append(obj.getA().getY()).append("</y>").append("\n");
//        builder.append("\t").append("</Point>").append("\n");
//        builder.append("\t").append("<Point>").append("\n");
//        builder.append("\t").append("\t").append("<x>").append(obj.getB().getX()).append("</x>").append("\n");
//        builder.append("\t").append("\t").append("<Y>").append(obj.getB().getY()).append("</y>").append("\n");
//        builder.append("\t").append("</Point>").append("\n");
//        builder.append("\t").append("<Point>").append("\n");
//        builder.append("\t").append("\t").append("<x>").append(obj.getC().getX()).append("</x>").append("\n");
//        builder.append("\t").append("\t").append("<y>").append(obj.getC().getY()).append("</y>").append("\n");
//        builder.append("\t").append("</Point>").append("\n");
        builder.append("</Triangle>");
        return builder.toString();
    }

    private static String pointToXml(Line obj) {

        StringBuilder builder = new StringBuilder();
        builder.append("<Line>").append("\n");
        builder.append("\t").append(pointToXml(obj.getP1(), "\t")).append("\n");
        builder.append("\t").append(pointToXml(obj.getP2(), "\t")).append("\n");
//        builder.append("\t").append("<Point>").append("\n");
//        builder.append("\t").append("\t").append("<x>").append(obj.getP1().getX()).append("</x>").append("\n");
//        builder.append("\t").append("\t").append("<y>").append(obj.getP1().getY()).append("</y>").append("\n");
//        builder.append("\t").append("</Point>").append("\n");
//        builder.append("\t").append("<Point>").append("\n");
//        builder.append("\t").append("\t").append("<x>").append(obj.getP2().getX()).append("</x>").append("\n");
//        builder.append("\t").append("\t").append("<Y>").append(obj.getP2().getY()).append("</y>").append("\n");
//        builder.append("\t").append("</Point>").append("\n");
        builder.append("</Line>");
        return builder.toString();
    }

    private static String pointToXml(Point point, String padding) {

        StringBuilder builder = new StringBuilder();
        builder.append(padding).append("<Point>").append("\n");
        builder.append(padding).append("\t").append("<x>").append(point.getX()).append("</x>").append("\n");
        builder.append(padding).append("\t").append("<y>").append(point.getY()).append("</Y>").append("\n");
        builder.append(padding).append("</Point>");

        return builder.toString();
    }

    public static void main(String... args) {

        Line t = new Line(new Point(2, 3), new Point(4, 5));
        System.out.println(XmlSerializer.pointToXml(t));
        //System.out.println(XmlSerializer.pointToXml(new Point(4,5)));
    }
}
