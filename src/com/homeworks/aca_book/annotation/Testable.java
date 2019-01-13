package com.homeworks.aca_book.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by home on 11/20/2018.
 */
public class Testable {
    public void execute() {
        System.out.println("Executing..");
    }
    @Test void testExecute() { execute(); }
}
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
 @interface Test {}