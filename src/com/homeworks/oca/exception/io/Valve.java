package com.homeworks.oca.exception.io;

import java.io.*;

/**
 * Created by home on 11/13/2018.
 */
public class Valve implements Serializable {
    private int chambers = -1;
    private transient Double size = null;
    private static transient String color;

    public Valve() {
        this.chambers = 3;

    }

    public static void main(String[] love) throws Throwable {
        try (ObjectOutputStream o = new ObjectOutputStream(
                new FileOutputStream("C://temp//cake.txt"))) {
            final Valve v = new Valve();
            v.chambers = 2;
            v.size = 10.0;
           v.color = "REd";
            o.writeObject(v);
        }
    new Valve();
        try (ObjectInputStream o = new ObjectInputStream(
                new FileInputStream("C://temp//cake.txt"))) {
            Valve v = (Valve) o.readObject();
            System.out.print(v.chambers + "," + v.size + "," + v.color);
        }
    }

    {
        chambers = 4;
    }
}

