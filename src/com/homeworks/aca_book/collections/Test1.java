package com.homeworks.aca_book.collections;

import java.util.*;

/**
 * Created by home on 10/26/2018.
 */
public class Test1 {
    public static void main(String[] args) {
        HashSet<Number> hs = new HashSet<Number>();
        HashSet<? super ClassCastException> set = new HashSet<Exception>();
        List<String> list = new Vector<String>();
        List<? extends Object> objects = new ArrayList<>();
        Map<String, ? extends Number> hm = new HashMap<String, Integer>();
    }
}
