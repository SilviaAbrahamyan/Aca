package com.homeworks.aca_book.collections.generic;

import java.util.*;

/**
 * Created by home on 10/26/2018.
 */
public class Hello<T> {
    T t;

    public Hello(T t) {
        this.t = t;
    }



    @Override
    public String toString() {
        return t.toString();
    }

    public static void main(String[] args) {
        System.out.print(new Hello<String>("hi"));
        System.out.print(new Hello(6));


        Set<Number> numbers = new HashSet<>();
        numbers.add(new Integer(86));
        numbers.add(75);
        numbers.add(new Integer(86));
        numbers.add(null);
        numbers.add(309L);
         Iterator iter = numbers.iterator();
         while (iter.hasNext())
           System.out.println(iter.next());


        TreeSet<String> tree = new TreeSet<String>();
        tree.add("one");
        tree.add("One");
        tree.add("ONE");
        System.out.println(tree);
        System.out.println(tree.ceiling("ON"));


        Map<String, Double> map1 = new HashMap<>();
        map1.put("pi", 3.14159);


        Map<Integer, Integer> map = new HashMap<>(10);
       for (int i = 0; i <= 10; i++) {
           map.put(i, i * i);
             }
         System.out.println(map.get(4));


        List<String> q = new LinkedList<>();
        q.add("10");
        q.add("12");
        String s = null;
        q.remove(s);
        System.out.println(q);

        Map m = new HashMap();
        m.put(123, "456");
        m.put("abc", "def");
        System.out.println(m.containsKey(123));


        List<String> list = Arrays.asList("1", "2", "3");
        Iterator iter1 = list.listIterator();
       // iter1.remove();
        while (iter1.hasNext()){
            System.out.print(iter1.next());
        }

        List list3 = new ArrayList();
       list3.add("one");
       list3.add("two");
         list3.add(7);
//        for (String s: list3)
//           System.out.print(s);
    }
}
