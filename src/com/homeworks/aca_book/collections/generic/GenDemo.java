package com.homeworks.aca_book.collections.generic;

/**
 * Created by home on 10/28/2018.
 */
public class GenDemo {
    public static void main(String args[]) {
// Create a Gen reference for Integers.
        Gen<Integer> iOb;
// Create a Gen<Integer> object and assign its
// reference to iOb. Notice the use of autoboxing
// to encapsulate the value 88 within an Integer object.
        iOb = new Gen<Integer>(88);
// Show the type of data used by iOb.
        iOb.showType();
// Get the value in iOb. Notice that
// no cast is needed.
        int v = iOb.getob();
        System.out.println("value: " + v);
        System.out.println();
// Create a Gen object for Strings.
        Gen<String> strOb = new Gen<String> ("Generics Test");
// Show the type of data used by strOb.
        strOb.showType();
// Get the value of strOb. Again, notice
// that no cast is needed.
        String str = strOb.getob();
        System.out.println("value: " + str);

        System.out.println();
        NonGen iOb1;
// Create NonGen Object and store
// an Integer in it. Autoboxing still occurs.
        iOb1 = new NonGen(88);
// Show the type of data used by iOb.
        iOb1.showType();
// Get the value of iOb.
// This time, a cast is necessary.
        int vv = (Integer) iOb1.getob();
        System.out.println("value: " + v);
        System.out.println();
// Create another NonGen object and
// store a String in it.
        NonGen strOb1 = new NonGen("Non-Generics Test");
// Show the type of data used by strOb.
        strOb1.showType();
// Get the value of strOb.
// Again, notice that a cast is necessary.
        String strr = (String) strOb1.getob();
        System.out.println("value: " + strr);
// This compiles, but is conceptually wrong!
        iOb1 = strOb1;
        vv = (Integer) iOb1.getob();
    }
}
