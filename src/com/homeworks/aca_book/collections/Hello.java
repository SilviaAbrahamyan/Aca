package com.homeworks.aca_book.collections;

import java.util.*;

/**
 * Created by home on 11/15/2018.
 */
public class Hello<T> {
    T t;

    public Hello(T t) {
        this.t = t;
    }

    public String toString() {
        return t.toString();
    }

    public static void main(String[] args) {
        System.out.print(new Hello<String>("hi"));
        System.out.print(new Hello("there"));

        Map m = new HashMap();
        m.put(123, "456");
        m.put("abc", "def");
        System.out.println(("123"));
        Set<Number> numbers = new TreeSet<>();
        numbers.add(new Integer(86));


        numbers.add(75);
        numbers.add(new

                Integer(86));
        numbers.add(null);
        numbers.add(309L);
        Iterator iter = numbers.iterator();
        while(iter.hasNext())
            System.out.print(iter.next());

        Map<String, Double> map = new HashMap<>();

    }


}
