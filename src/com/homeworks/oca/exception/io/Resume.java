package com.homeworks.oca.exception.io;

import java.io.File;

/**
 * Created by home on 11/13/2018.
 */
public class Resume {
    public void resetWorkingDirectory() throws Exception {
        File f1 = new File("/templates/proofs");
        f1.mkdirs();
        File f2 = new File("/templates");
        f2.mkdir(); // k1
        new File(f2, "draft.doc").createNewFile();
//        f1.delete();
//        f2.delete(); // k2
    }

    public static void main(String... leads) {
        try {
            new Resume().resetWorkingDirectory();
        } catch (Exception e) {
            new RuntimeException(e);
        }


        Object formattedString = System.out.printf("%d is my favorite number", 42);
        System.out.println();
        System.out.print(formattedString);
        System.out.println();
        Object formattedString1 = System.out.format("%d is my favorite number", 42);
        System.out.println();
        System.out.print(formattedString1);
    }
}
