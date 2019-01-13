package com.homeworks.live.reflections;

import java.io.Serializable;

/**
 * Created by home on 11/21/2018.
 */
public class ClassDemo {
    public static void main(String args[]) {

        Parent val1 = new subClass();
        Class cls;

        cls = val1.getClass();
        System.out.println("val1 is object of type = " + cls.getName());

      /* returns the superclass of the class(superClass) represented
         by this object */
        cls = cls.getSuperclass();
        System.out.println("super class of val1 = " + cls.getName());


    }
}

abstract class superClass {
    // super class
}

class subClass  implements Parent {
    // sub class
}
interface Parent{

}