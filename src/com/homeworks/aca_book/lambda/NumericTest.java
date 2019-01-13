package com.homeworks.aca_book.lambda;

/**
 * Created by home on 12/15/2018.
 */
public interface NumericTest {
    boolean test(double n);
}

class LambdaDemo2 {
    public static void main(String args[]) {
// A lambda expression that tests if a number is even.
        NumericTest isEven = new NumericTest() {
            @Override
            public boolean test(double n) {
                return n % 2 == 0;
            }
        };

        NumericTest isEven1 = n -> n % 2 == 0;
        if (isEven1.test(10)) System.out.println("10 is even");
        if (!isEven1.test(9)) System.out.println("9 is not even");
// Now, use a lambda expression that tests if a number
// is non-negative.
       // NumericTest isNonNeg = (int n) -> n >= 0;
//        if (isNonNeg.test(1)) System.out.println("1 is non-negative");
//        if (!isNonNeg.test(-1)) System.out.println("-1 is negative");
    }
}