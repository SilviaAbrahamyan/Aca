package com.homeworks.oca.exception.others;

import java.nio.file.Files;

/**
 * Created by home on 11/23/2018.
 */
public class PickApples {
    public static void main(String... orchard) {
        final Season s = Season.FALL;
        switch (s) {
//            case 3:
//                System.out.println("Time to pick!");
            default:
                System.out.println("Not yet!");
        }

//        if(Files.isSameFile("/salad/carrot", "/fruit/apple"))
//            System.out.println("Same!");
//        else System.out.println("Different!");
    }
}

enum Season {
    SPRING(1), SUMMER(2), FALL(3), WINTER(4);

    Season(int orderId) {
    }
}