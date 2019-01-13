package com.homeworks.aca_book.annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

/**
 * Created by home on 11/20/2018.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
    String str();
    float xyz() default 0;
    float val();

}
@Retention(RetentionPolicy.RUNTIME)
@interface What {
    String description();
}
class Meta {
    // Annotate a method.
    @MyAnno(str = "Annotation Example", val = 100)
    public static void myMeth() {
        Meta ob = new Meta();
// Obtain the annotation for this method
// and display the values of the members.
        try {
// First, get a Class object that represents
// this class.
            Class c = ob.getClass();
// Now, get a Method object that represents
// this method.
            Method m = c.getMethod("myMeth");
// Next, get the annotation for this class.
            MyAnno anno = m.getAnnotation(MyAnno.class);
// Finally, display the values.
            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException exc) {
            System.out.println("Method Not Found.");
        }
    }
        @MyAnno(str = "Two Parameters", val = 19)
        public static void myMeth(String str, int i)
        {
            Meta ob = new Meta();
            try {
                Class c = ob.getClass();
// Here, the parameter types are specified.
                Method m = c.getMethod("myMeth", String.class, int.class);
                MyAnno anno = m.getAnnotation(MyAnno.class);
                System.out.println(anno.str() + " " + anno.val());
            } catch (NoSuchMethodException exc) {
                System.out.println("Method Not Found.");
            }
        }

    public static void main(String args[]) {
        myMeth();
        myMeth("test", 10);
    }
}

@What(description = "An annotation test class")
@MyAnno(str = "Meta2", val = 99)
class Meta2 {
    @What(description = "An annotation test method")
    @MyAnno(str = "Testing", val = 100)
    public static void myMeth() {
        Meta2 ob = new Meta2();
        try {
            Annotation annos[] = ob.getClass().getAnnotations();
// Display all annotations for Meta2.
            System.out.println("All annotations for Meta2:");
            for(Annotation a : annos)
                System.out.println(a);
            System.out.println();
// Display all annotations for myMeth.
            Method m = ob.getClass( ).getMethod("myMeth");
            annos = m.getAnnotations();
            System.out.println("All annotations for myMeth:");
            for(Annotation a : annos)
            System.out.println(a);
        } catch (NoSuchMethodException exc) {
            System.out.println("Method Not Found.");
        }
    }
    public static void main(String args[]) {
        myMeth();
    }
}