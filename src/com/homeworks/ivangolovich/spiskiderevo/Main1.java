package com.homeworks.ivangolovich.spiskiderevo;


import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

/**
 * Created by home on 10/17/2018.
 */
public class Main1 {
    public static void main(String... args) throws Exception {
       LinkedList list = new LinkedList();
            for(int i = 0; i < 10; i++) {
                int value = (int) (Math.random() * 100);
                list.add(value);
                System.out.println(">>>" + value);
                System.out.println("List: " + list);
            }
        System.out.println("size:>>>" + list.sizeIterative());
        System.out.println("max:>>>" + list.maxIterative());
        System.out.println("sum:>>>" + list.sumIterative());
            int newElement = (int) (Math.random() * 100);
            list.insert(5, newElement);
            System.out.println("5:>>>" + newElement);
            System.out.println("List: " + list);

            System.out.println("Element at[5] = " + list.get(5));

            list.remove(5);
            System.out.println("Removed list[5]");
            System.out.println("List: " + list);


        Map<Integer, Integer> map = new HashMap<>();
        map.put(3, 6);
        map.put(4, null);
        map.put(null, null);
        System.out.println("Map: " + map);
       Integer i = map.get(4);
        System.out.println("Map: " + map.get(4));
    }
}
