package com.homeworks.aca_book.collections;

import java.util.*;

/**
 * Created by home on 10/17/2018.
 */
public class ListFeatures {
    public static void main(String... args) throws Exception {
       Set list = new HashSet<>();
        Integer i = new Integer(56);
        Integer d = null;
        list.add(d);
        list.add(5);
        list.add(null);
        list.add(new Integer(45));
        list.add(new Integer(i));
        list.add(new Integer(5));

        String k = null;
        System.out.println(list.toString());
        System.out.println(list.remove(k));
        System.out.println(list.toString());
    }
}
