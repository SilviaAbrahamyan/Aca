package com.homeworks.live.lambda;

/**
 * Created by home on 12/17/2018.
 */
public class Test1 {
    public static void main(String[] args) {

        foo((s, index) -> s.charAt(index), "valodik",3);
        foo(new Function() {
            @Override
            public char convert(String s, int index) {
                return s.charAt(index);
            }
        }, "valodik",3);

       System.out.println( foo(String::charAt, "valodik",3));
        System.out.println(foo("valodik"::charAt,3));
    }

    private static char foo(Function o, String valodik, int i) {
        return o.convert(valodik,i);
    }

    private static char foo(Function2 o, int i) {
        return o.convert(i);
    }
}
interface Function{
    char convert(String value, int index);
}

interface Function2 {
    char convert(int i);
}
