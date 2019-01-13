package com.homeworks.live.reflections;

import java.lang.reflect.Array;

/**
 * Created by home on 11/21/2018.
 */
public class ObtainingtheClassObjectofanArray {
    public static void main(String[] args) throws ClassNotFoundException {
        int[] intArray = (int[]) Array.newInstance(int.class, 3);
        Array.set(intArray, 0, 123);
        Array.set(intArray, 1, 456);
        Array.set(intArray, 2, 789);

        System.out.println("intArray[0] = " + Array.get(intArray, 0));
        System.out.println("intArray[1] = " + Array.get(intArray, 1));
        System.out.println("intArray[2] = " + Array.get(intArray, 2));

        Class intArray1 = Class.forName("[I");
    }
}

class ArrayofREflec {
    private static String[] strArr = (String[]) Array.newInstance(String.class, 10);

    private static int[] intArr = (int[]) Array.newInstance(int.class, 10);

    public static void fillArrays() {
        for (int i = 0; i <= 9; i++) {
            Array.set(strArr, i, String.valueOf(i));
            Array.setInt(intArr, i, i);
        }

    }
    public static void showArrays() {
        System.out.println("-Arrays have: ");
        for (int i = 0; i <= 9; i++) {
            System.out.println("At position " + i + " strArr component is :" + Array.get(strArr, i));
            System.out.println("At position " + i + " intArr component is :" + Array.getInt(intArr, i));
        }

    }


    public static void main(String[] args) {

        fillArrays();
        showArrays();
        System.out.println("Components of the strArr are of type : " + strArr.getClass().getComponentType());
        System.out.println("Length of the strArr is : " + Array.getLength(strArr));
        System.out.println("Components of the intArr are of type : " + intArr.getClass().getComponentType());
        System.out.println("Length of the intArr is : " + Array.getLength(strArr));

    }
}