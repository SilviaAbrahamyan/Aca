package com.homeworks.oca.exception.others;

import java.util.Arrays;
import java.util.List;

/**
 * Created by home on 11/22/2018.
 */
public class Exams {
    public static void main(String[] args) {
        List<String> exams = Arrays.asList("OCA", "OCP");
        for (String e1 : exams)
            for (String e2 : exams)
                System.out.print(e1 + " " + e2);
        System.out.println();


//        char one = Integer.parseInt("1");
//        Character two = Integer.parseInt("2");
//        int three = Integer.parseInt("3");
//        Integer four = Integer.parseInt("4");
//        short five = Integer.parseInt("5");
//        Short six = Integer.parseInt("6");
    }
}
