package com.homeworks.oca.exception.OperatorsandConstructs;

/**
 * Created by home on 11/21/2018.
 */
public class ThePlan {
    public static void main(String[] input) {
        int plan = 1;
        plan = plan++ ;
                plan = plan++ + --plan;
        if (plan == 1) {
            System.out.print(1);
        } else {
            if (plan == 2) System.out.print(2);
        else System.out.print(3);
        }
    }
}
