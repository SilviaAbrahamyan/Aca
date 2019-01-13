package com.homeworks.aca_book.lambda;

/**
 * Created by home on 12/17/2018.
 */
public class MethodRefDemo {
    static String stringOp(StringFunc1 sf, String s) {
        return sf.func(s);
    }
    public static void main(String args[])
    {
        String inStr = "Lambdas add power to Java";
        String outStr;
// Here, a method reference to strReverse is passed to stringOp().
        outStr = stringOp(new StringFunc1() {
            @Override
            public String func(String str) {
                return MyStringOps.strReverse(str);
            }
        }, inStr);

        outStr = stringOp(str -> MyStringOps.strReverse(str), inStr);
        outStr = stringOp(MyStringOps::strReverse, inStr);
        System.out.println("Original string: " + inStr);
        System.out.println("String reversed: " + outStr);
    }
}
interface StringFunc1 {
    String func(String n);
}
// This class defines a static method called strReverse().
class MyStringOps {
    // A static method that reverses a string.
    static String strReverse(String str) {
        String result = "";
        int i;
        for(i = str.length()-1; i >= 0; i--)
            result += str.charAt(i);
        return result;
    }
}