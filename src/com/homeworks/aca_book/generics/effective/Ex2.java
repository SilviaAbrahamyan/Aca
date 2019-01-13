package com.homeworks.aca_book.generics.effective;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by home on 12/21/2018.
 */
public class Ex2 {
    public static void main(String[] args) {
        // Fails at runtime!
        Object[] objectArray = new Long[1];
       objectArray[0] = "I don't fit in"; // Throws ArrayStoreException
     //   objectArray[0] = 1; // Throws ArrayStoreException
     //  objectArray[0] = new Long(6);
       objectArray[0] = new String("46");

        // Won't compile!
        //List<Object> ol = new ArrayList<Long>(); // Incompatible types
       // ol.add("I don't fit in");


      //  List<String>[] stringLists = new List<String>[1]; // (1)
      //  List<Integer> intList = List.of(42); // (2)
      //  Object[] objects = stringLists; // (3)
      //  objects[0] = intList; // (4)
      //  String s = stringLists[0].get(0); // (5)
    }
}
