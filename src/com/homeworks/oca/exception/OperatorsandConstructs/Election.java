package com.homeworks.oca.exception.OperatorsandConstructs;

/**
 * Created by home on 11/21/2018.
 */
public class Election {
    public void calculateResult(Integer candidateA, Integer candidateB) {
        boolean process = candidateA == null || candidateA.intValue() < 10;
     boolean value = true && false;
        System.out.print(process || value);
    }

    public static void main(String[] unused) {
        new Election().calculateResult(7, 203);
    }
}
