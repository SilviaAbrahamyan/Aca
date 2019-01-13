package com.homeworks.oca.exception.others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by home on 11/22/2018.
 */
public class LaundryTime {
    public static void main(String[] args) {
        Wash<List> wash = new Wash<List>();
                wash.clean(Arrays.asList("sock", "tie"));
    }
}

class Wash<T extends Collection> {
    T item;

    public void clean(T items) {
        System.out.println("Cleaned " + items.size() + " items");
    }
}