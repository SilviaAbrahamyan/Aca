package com.homeworks.oca.exception.others;

import java.util.Arrays;
import java.util.List;

/**
 * Created by home on 11/22/2018.
 */
public class Dance {
    public static void swing(int... beats) throws ClassCastException {
        try {
            System.out.print("1"+beats[2]); // p1
        } catch (RuntimeException e) {
            System.out.print("2");
        } catch (Exception e) {
            System.out.print("3");
        } finally {
            System.out.print("4");
        }
    }
    public static void main(String... music) {
        new Dance().swing(0,0); // p2
        System.out.print("5");


        List<String> drinks = Arrays.asList("can", "cup");
        for (int container = drinks.size(); container > 0; container++) {
            System.out.print(drinks.get(container-1) + ",");
        }
    }
}
