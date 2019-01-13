package com.homeworks.aca_book.collections.set;

import java.util.*;

/**
 * Created by home on 10/25/2018.
 */
public class Main {
    public static void main(String[] args) {
        List rawlist = new ArrayList();
        List<Integer> hashSet = new ArrayList<>();


        Object o = hashSet;
        rawlist = hashSet;


        rawlist.add("2");
      //  Integer s = hashSet.get(0);

        Set<Integer> set = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });

        set.add(1);
        set.add(2);
        set.add(1);

        System.out.print(set);


    }

    public void setMyArray(String[] myArray)

    {

        if(myArray == null)

        {

           // this.myArray = new String[0];

        }

        else

        {

         //   this.myArray = Arrays.copyOf(newArray, newArray.length);

        }

    }
}
