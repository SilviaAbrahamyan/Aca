package com.homeworks.live;

/**
 * Created by home on 10/15/2018.
 */
public class Main4 {
    public static void main(String... args) {
        foo();
    }

    private static void foo() {
        for(int i = 10; i >= -10; i--) {
            try {
                System.out.println("i = " + i);
                int x = 100 / i;
                System.out.println(x);
            }catch(Exception e) {
                System.out.println("Exception");
                break;
            }finally {
                System.out.println("Finally");
                continue;
            }
        }
    }
}
