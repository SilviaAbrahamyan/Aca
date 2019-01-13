package com.homeworks.aca_book.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by home on 1/1/2019.
 */
public class JavaStreamFilterStringLength {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("pen", "custom", "orphanage",
                "forest", "bubble", "butterfly");

        List<String> result = words.stream().filter(word -> word.length() > 5)
                .collect(Collectors.toList());

        result.forEach(word -> System.out.println(word));
    }
}
