package com.homeworks.oca.exception.io;

import java.io.File;

/**
 * Created by home on 11/13/2018.
 */
public class Journey {
    public static void main(String[] dig) {
        File file = new File("/Earth");
        System.out.print(file.getParent()
                +" - "
                +file.getParent()); }
}
