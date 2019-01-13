package com.homeworks.aca_book.hiding;

/**
 * Created by home on 10/5/2018.
 */
public class Rodent {
    protected static int tailLength = 4;
    public void getRodentDetails() {
        System.out.println("[parentTail="+tailLength+"]");
    }
}
 class Mouse extends Rodent {
    protected static int tailLength = 8;
    public void getMouseDetails() {
        System.out.println("[tail="+tailLength +",parentTail="+super.tailLength+"]");
    }
    public static void main(String[] args) {

        Mouse mouse = new Mouse();
        mouse.getRodentDetails();
       mouse.getMouseDetails();
        String s1 = "hello";
        String s2 = " hello";
        String s3 = new String(" hello");




    }
}

