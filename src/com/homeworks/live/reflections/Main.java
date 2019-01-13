package com.homeworks.live.reflections;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by home on 11/20/2018.
 */
public class Main {

    public static void main(String[] args) {
        A a = new B(4,5);
        System.out.println(a.getX());
        // int x = a.getX();
        //int x = A::getX.invoke(a);
        // a.getClass();
        Class clazz  = a.getClass();

        System.out.println(clazz);
        List<Field> fields = new ArrayList<>();
        getAllFields(clazz, fields);

        System.out.println(fields);
    }

    private static void getAllFields(Class clazz, List<Field> fields) {
        if(clazz ==null) return;
        for(Field f : clazz.getDeclaredFields()) {
            fields.add(f);
        }
        getAllFields(clazz.getSuperclass(),fields);
    }
}

class A {
    private int x;
    public int testField;
    public A(int x) {
        this.x=x;
    }
    public int getX(){
        return this.x;
    }
}

class B extends A {

    private int y;
    public B(int x,int y) {
        super(x);
        this.y=y;
    }
    public int getY(){
        return this.y;
    }
}
