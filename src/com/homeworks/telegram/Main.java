package com.homeworks.telegram;

/**
 * Created by home on 10/27/2018.
 */
public class Main {
    static int x = 0;

    private static int foo() {
        try {
            System.out.println("try block");
            x++;
            if (x == 1) {
                throw new RuntimeException();
            }
            System.out.println(x);

        } finally {
            x++;
            System.out.println(x);
            System.out.println("finally blovk");
            return -1;
        }


    }

    public static void main(String[] args) {
        System.out.print(Main.foo());

    }
}
