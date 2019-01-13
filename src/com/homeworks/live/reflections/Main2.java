package com.homeworks.live.reflections;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by home on 11/20/2018.
 */
public class Main2 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException , InvocationTargetException {
        A2 a = new B2(4,5);
        System.out.println(a.getX());
        // int x = a.getX();
        //int x = A::getX.invoke(a);
        // a.getClass();
        Class clazz  = a.getClass();

        System.out.println(clazz);
        List<Field> fields = new ArrayList<>();
        Field yField = clazz.getDeclaredField("y");
        yField.setAccessible(true);
        yField.set(a,10);
        System.out.println(((B2)a).getY());
        Method foo = clazz.getDeclaredMethod("foo");
        foo.setAccessible(true);

        foo.invoke(a);
        // B.class.getDeclaredMethod("foo").invoke();

        Method bar = clazz.getDeclaredMethod("bar");
        bar.setAccessible(true);
        bar.invoke(null);
        // B b = null; b.bar();

    }


}

class A2 {
    private int x;
    public int testField;
    public A2(int x) {
        this.x=x;
    }
    public int getX(){
        return this.x;
    }
}

class B2 extends A2{

    private  int y;
    public B2(int x,int y) {
        super(x);
        this.y=y;
    }
    public int getY(){
        return this.y;
    }
    private void foo() {
        System.out.println("foo");
    }
    protected static void bar() {
        System.out.println("bar");
    }
}