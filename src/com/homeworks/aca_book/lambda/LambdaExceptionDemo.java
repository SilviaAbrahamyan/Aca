package com.homeworks.aca_book.lambda;

/**
 * Created by home on 12/17/2018.
 */
public class LambdaExceptionDemo {
    public static void main(String args[]) throws Exception {
        double[] values = {1.0, 2.0, 3.0, 4.0};
// This block lambda computes the average of an array of doubles.
        DoubleNumericArrayFunc average = (n) -> {
            double sum = 0;
            if (n.length == 0)
                throw new EmptyArrayException();
            for (int i = 0; i < n.length; i++)
                sum += n[i];
            return sum / n.length;
        };
        System.out.println("The average is " + average.func(values));
// This causes an exception to be thrown.
        System.out.println("The average is " + average.func(new double[0]));
    }
}

interface DoubleNumericArrayFunc {
    double func(double[] n) throws EmptyArrayException;
}

class EmptyArrayException extends Exception {
    EmptyArrayException() {
        super("Array Empty");
    }
}