package com.homeworks.live.reflections.bygeeks;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by home on 11/21/2018.
 */
public class GetSuperClassFromObject {
    public static void main(String[] args) {


        // Create new object
        Object o = new String("JavaCodeGeeks");


        // Get super class and print it
        Class<?> clazz = o.getClass().getSuperclass();
        System.out.println("Superclass = " + clazz);

        o = new ArrayList<>();
        Runnable r = new Runnable() {
            @Override
            public void run() {

            }
        };
        clazz = o.getClass().getSuperclass();
        System.out.println("Superclass = " + clazz);
        System.out.println("Superclass = " + r.getClass().getSuperclass());
    }
}

