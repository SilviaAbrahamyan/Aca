package com.homeworks.aca_book.collections.generic;

import java.io.IOException;
import java.util.*;

/**
 * Created by home on 10/26/2018.
 */
public class Wildcard {
    public void showSize(List<?> list) {
        System.out.println(list.size());
    }
    public static void main(String[] args) {
        Wildcard card = new Wildcard();
       // ArrayDeque<?> list = new ArrayDeque<String>();
       // ArrayList<? super Date> list = new ArrayList<Date>();
       // List<?> list = new ArrayList<?>();
        //List<? extends Exception> list = new LinkedList<IOException>();
        Vector<? extends Number> list = new Vector<Integer>();
        card.showSize(list);
    }
}
