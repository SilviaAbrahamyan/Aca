package com.homeworks.aca_book.generics.effective;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by home on 12/27/2018.
 */
public class Ex {
    public static void main(String[] args) {
        List<Object> list =  new ArrayList<>();
        list.add(3);

        Set<Integer> set = new HashSet();

        Object[] objectArray = new Long[1];
        objectArray[0] = new Object();
    }


}
