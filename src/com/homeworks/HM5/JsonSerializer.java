package com.homeworks.HM5;

/**
 * Created by home on 9/26/2018.
 */
public class JsonSerializer {
    public static String toJson(Object obj) {
        if (obj instanceof Point) {
            return pointToJson((Point) obj, "");
        } else if (obj instanceof Line) {
            return pointToJson((Line) obj);
        } else {
            return pointToJson((Triangle) obj);
        }

        //return null;
    }

    private static String pointToJson(Triangle obj) {
        StringBuilder builder = new StringBuilder();
        builder.append("{").append("\n");
        builder.append("\t").append("\"a\" " + ":" + "{").append("\n");
        builder.append("\t").append("\t").append("\"x\" " + ":" + obj.getA().getX() + ",").append("\n");
        builder.append("\t").append("\t").append("\"y\" " + ":" + obj.getA().getY()).append("\n");
        builder.append("\t").append("}" + ",").append("\n");
        builder.append("\t").append("\"b\" " + ":" + " {").append("\n ");
        builder.append("\t").append("\t").append("\"x\" " + ":" + obj.getB().getX() + ",").append("\n");
        builder.append("\t").append("\t").append("\"y\" " + ":" + obj.getB().getY()).append("\n");
        builder.append("\t").append("}" + ",").append("\n");
        builder.append("\t").append("\"c\" " + ":" + " {").append("\n ");
        builder.append("\t").append("\t").append("\"x\" " + ":" + obj.getC().getX() + ",").append("\n");
        builder.append("\t").append("\t").append("\"y\" " + ":" + obj.getC().getY()).append("\n");
        builder.append("\t").append("}").append("\n");
        builder.append("}");
        return builder.toString();
    }

    private static String pointToJson(Line obj) {
        StringBuilder builder = new StringBuilder();
        builder.append("{").append("\n");
        builder.append("\t").append("\"p1\" " + ":" + "{").append("\n");
        builder.append("\t").append("\t").append("\"x\" " + ":" + obj.getP1().getX() + ",").append("\n");
        builder.append("\t").append("\t").append("\"y\" " + ":" + obj.getP1().getY()).append("\n");
        builder.append("\t").append("}" + ",").append("\n");
        builder.append("\t").append("\"p2\" " + ":" + " {").append("\n ");
        builder.append("\t").append("\t").append("\"x\" " + ":" + obj.getP2().getX() + ",").append("\n");
        builder.append("\t").append("\t").append("\"y\" " + ":" + obj.getP2().getY()).append("\n");
        builder.append("\t").append("}").append("\n");
        builder.append("}");
        return builder.toString();
    }

    private static String pointToJson(Point point, String padding) {
        StringBuilder builder = new StringBuilder();
        builder.append("{").append("\n");
        builder.append("\t").append("\"x\" " + ":" + point.getX() + ",").append("\n");
        builder.append("\t").append("\"y\" " + ":" + point.getY()).append("\n");
        ;
        builder.append("}");
        return builder.toString();
    }


    public static void main(String... args) {

        Triangle t = new Triangle(new Point(2, 3), new Point(4, 5), new Point(6, 7));
        //System.out.println(JsonSerializer.pointToJson(t));
        // System.out.println(JsonSerializer.pointToJson(new Line((new Point(2, 3)), new Point(4, 5))));
        System.out.println(JsonSerializer.pointToJson(new Point(2, 3), ""));
    }
}
