package com.homeworks.oca.exception.exceptionsAs;

/**
 * Created by home on 10/24/2018.
 */
public class Problems {
    public void doIHaveAProblem() throws MissingMoneyException,
            MissingFoodException {
        System.out.println("t54w");
    }

    public static void main(String[] lots) throws Exception {
        try {
            final Problems p = new Problems();
            p.doIHaveAProblem();
        } catch (Exception e) {
            throw e;
        }
    }
}

class MissingMoneyException extends Exception {
}

class MissingFoodException extends Exception {
}