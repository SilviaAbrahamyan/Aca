package com.homeworks.oca.exception;

/**
 * Created by home on 10/23/2018.
 */
public class BiggerProblem extends Problem {
    public static void main(String uhOh[]) {
        try {
            throw new BiggerProblem();
        } catch (BiggerProblem re) {
            System.out.print("p");
        } catch (Problem e) {
            System.out.print("h");
        } finally {
            System.out.print("f");
        }
    }
}
    class Problem extends RuntimeException {}