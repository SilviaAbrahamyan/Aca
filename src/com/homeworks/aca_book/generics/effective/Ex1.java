package com.homeworks.aca_book.generics.effective;

import java.util.List;
import java.util.*;

/**
 * Created by home on 12/21/2018.
 */
public class Ex1 {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        unsafeAdd(strings, Integer.valueOf(42));
//        String s = strings.get(0); // Has compiler-generated cast
//        Set s1 = new TreeSet();
//        Set s2 = new TreeSet();
//        s1.add(4);
//        s1.add(9);
//        s1.add(40);
//        s1.add(0);
//        s2.add(0);
//        s2.add(6);
//        System.out.println(numElementsInCommon(s1, s2));
//
//Set s = new HashSet();
//        Set<String> exaltation = new HashSet<>();
//       // s = exaltation;
//        exaltation = s;

        String s = strings.get(0);
    }

    private static void unsafeAdd(List list, Object o) {
        list.add(o);
    }

//    static <T> int numElementsInCommon(Set<?> s1, Set s2) {
////        s1.add(null);
////       s2.add("sG");
//        //List<?> [] n = new List[8];
//        //List<T> [] n1 = new List[8];
//        int result = 0;
//        for (Object o1 : s1)
//            if (s2.contains(o1))
//                result++;
//        return result;
//    }
}


