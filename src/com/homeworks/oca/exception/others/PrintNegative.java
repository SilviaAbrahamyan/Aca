package com.homeworks.oca.exception.others;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by home on 11/22/2018.
 */
public class PrintNegative {
    public static void print(List<Integer> list, Predicate<Integer> p) {
        for (Integer num : list)
            if (p.test(num))
                System.out.println(num);
    }
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(-5);
        list.add(0);
        list.add(5);
        print(list, e -> e < 0);
    }
}
