package com.homeworks.oca.exception;

/**
 * Created by home on 10/23/2018.
 */
public class Coat {
    public Long zipper() throws Exception {
        try {
            String checkZipper = (String)new Object();
        } catch (Exception e) {
            throw new RuntimeException("Broken");
        }
        return null;
    }
    public static void main(String... warmth) {
        try {
            new Coat().zipper();
            System.out.print("Finished");
        } catch (Throwable t) {}
    }
}
