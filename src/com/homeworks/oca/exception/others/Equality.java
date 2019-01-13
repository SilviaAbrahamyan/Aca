package com.homeworks.oca.exception.others;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

/**
 * Created by home on 11/22/2018.
 */
public class Equality {
    public static void main(String[] args) {
//        System.out.println(new StringBuilder("zelda")
//                == new StringBuilder("zelda"));
//        System.out.println(3 == 3);
//        System.out.println("bart" == "bart");
//        System.out.println(new int[0] == new int[0]);
//        System.out.println(LocalTime.now() == LocalTime.now());
//
//        List<String> drinks = Arrays.asList("can", "cup");
//        for (int container = drinks.size(); container > 0; container++) {
//            System.out.print(drinks.get(container--) + ",");
//        }

        String x = "bike";
        String x1 = new String("bike");
        boolean b1 = x == x1;
        boolean b2 = x.equals(x1);
        System.out.println(b1);
        System.out.println(b2);

    }
}
