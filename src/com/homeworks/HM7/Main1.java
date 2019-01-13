package com.homeworks.HM7;

/**
 * Created by home on 10/17/2018.
 */
public class Main1 {
    public static void main(String... args) throws Exception {
        ArrayList list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            int value = (int) (Math.random() * 100);
            list.add(value);
            System.out.println(">>>" + value);
            System.out.println("ArrayList: " + list);
        }

        int newElement = (int) (Math.random() * 100);
        list.add(5, newElement);
        System.out.println("5:>>>" + newElement);
        System.out.println("List: " + list);

        System.out.println("Element at[5] = " + list.get(5));

        list.remove(5);
        System.out.println("Removed list[5]");
        System.out.println("ArrayList: " + list);

        System.out.println("Element at[5] = " + list.get(7));
        list.remove(7);
        System.out.println("Removed list[7]");
        System.out.println("ArrayList: " + list);


    }
}
