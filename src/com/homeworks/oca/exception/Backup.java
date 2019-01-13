package com.homeworks.oca.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by home on 10/23/2018.
 */
public class Backup {
    public void performBackup() {
        try {
            throw new IOException("Disk not found");
        } catch (Exception e) {
            try {
                throw new FileNotFoundException("“File not found”");
            } catch (FileNotFoundException e2) { // z1
                System.out.print("“Failed”");
            }
        }
    }
    public static void main(String... files) {
        new Backup().performBackup(); // z2
    }
}
