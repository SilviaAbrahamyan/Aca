package com.homeworks.aca_book.generics.effective;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by home on 12/21/2018.
 */
public class Ex3 {
    public static void main(String[] args) {
        Set<String> guys = new HashSet<>();
        guys.add("Tom");
        guys.add("Dick");
        Set<String> stooges =  new HashSet<>();
        stooges.add("Larry");
        stooges.add("Moe");
        stooges.add("Curly");
        Set<String> aflCio = union(guys, stooges);
        System.out.println(aflCio);

        //List<String> [] t = new List<String>[0];

    }
    public static Set union1(Set s1, Set s2) {
        Set result = new HashSet(s1);
        result.addAll(s2);
        return result;
    }
    private static <E> Set<E> union(Set<E> s1, Set<E> s2) {
        Set<E> result = new HashSet<>(s1);
        result.addAll(s2);
        return result;
    }

    public static <E> void swap(List<E> list, int i, int j){
        //list.add((E) "sdc");
    };
    public static void swap1(List<?> list, int i, int j){
        swapHelper(list, i, j);
    }
    // Private helper method for wildcard capture
    private static <E> void swapHelper(List<E> list, int i, int j) {
        list.set(i, list.set(j, list.get(i)));
    }
    @SuppressWarnings("unchecked")
    static void dangerous(List<String>... v){

    }
    static <T> T[] toArray(T... args) {
        return args;
    }


}
