package com.homeworks.oca.exception.others;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by home on 11/22/2018.
 */
public class Iterator1 {
    public static void main(String[] args) {
//        LinkedList<String> list = new LinkedList<>();
//        list.add("Grapes of Wrath");
//        list.add("1984");
//        list.forEach(System.out::println);
//        Iterator it =  list.iterator();
//        while (it.hasNext())
//            System.out.println(it.next());

//        List<String> list = new LinkedList<>();
//        list.add("Archie");
//        list.add("X-Men");
//        Stream<String> s = list.stream();
//        s.forEach(System.out::println);
//        s.forEach(System.out::println);

        List<String> list = new LinkedList<>();
        list.add("Archie");
        list.add("X-Men");
//        list.stream().forEach(System.out.println);
//        list.stream().forEach(System.out.println);

        List<String> list1 = new ArrayList<>();
        list1.add("Monday");
      //  list.add(String::new);
        list1.add("Tuesday");
       list1.remove(0);
        System.out.println(list1.get(0));
    }
}
