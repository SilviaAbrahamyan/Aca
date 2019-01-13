package com.homeworks.oca.exception.others;

import java.util.Arrays;
import java.util.List;

/**
 * Created by home on 11/22/2018.
 */
public class Museums {
    public static void main(String[] args) {
        String[] array = {"Natural History", "Science", "Art"};
        Integer [] array1 = {1, 2, 3};
        List<String> museums = Arrays.asList(array);
        List<Integer> museums1 = Arrays.asList(array1);
        museums1.remove(1);
        System.out.println(museums1);
    }
}
