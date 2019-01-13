package com.homeworks.live;

/**
 * Created by home on 10/15/2018.
 */
public class Main3 {
    public static void main(String... args) {
        try {
            int x = parseInt(args[0]);
            System.out.println(x);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number");
        }

    }

    private static int parseInt(String line) {

        int result = 0;

        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) < '0' || line.charAt(i) > '9') {
                throw new NumberFormatException();
            }
            result = result * 10;
            result += line.charAt(i) - '0';
        }

        return result;
    }
}
