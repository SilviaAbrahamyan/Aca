package com.homeworks.aca_book.generics;



import java.util.ArrayList;
import java.util.List;

/**
 * Created by home on 12/19/2018.
 */
public class LegacyAutoboxing {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add(5);
        int n = (int) l.get(0);
    }

}
