package com.homeworks.aca_book.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by home on 10/1/2018.
 */
public class Test {
    public static void main(String [] args){
        int three = 3;
        String four = "4";
        System.out.println(1 + 2 + three + four);

//        String alpha = "";
//       for(char current = 'a'; current <= 'z'; current++)
//           alpha += current;
//        System.out.println(alpha);

        int[] numbers2 = {42, 55, 99};

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.remove(new Integer(1));
        System.out.println(numbers);
    }
}
