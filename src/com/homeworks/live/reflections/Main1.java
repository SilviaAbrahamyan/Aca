package com.homeworks.live.reflections;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by home on 11/20/2018.
 */
public class Main1 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException{
        A1 a = new B1(4,5);
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
        System.out.println(((B1)a).getY());

    }


}

class A1 {
    private int x;
    public int testField;
    public A1(int x) {
        this.x=x;
    }
    public int getX(){
        return this.x;
    }
}

class B1 extends A1 {

    private  int y;
    public B1(int x,int y) {
        super(x);
        this.y=y;
    }
    public int getY(){
        return this.y;
    }
}
