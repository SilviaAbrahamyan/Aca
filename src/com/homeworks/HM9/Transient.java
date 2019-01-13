package com.homeworks.HM9;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by home on 11/8/2018.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public  @interface Transient {
 int x = 0;
     boolean enabled() default true;
}
