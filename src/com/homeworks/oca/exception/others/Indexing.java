package com.homeworks.oca.exception.others;

/**
 * Created by home on 11/22/2018.
 */
public class Indexing {
    public static void main(String... books) {
        StringBuilder sb = new StringBuilder();
        for (String book : books)
            sb.insert(sb.indexOf("c"), book);
        System.out.println(sb);
    }
}
