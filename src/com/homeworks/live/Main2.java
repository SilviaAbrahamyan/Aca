package com.homeworks.live;

import java.util.Scanner;

/**
 * Created by home on 10/15/2018.
 */
public class Main2 {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.next();
        System.out.println(new StringBuilder(line).reverse());
    }
}
