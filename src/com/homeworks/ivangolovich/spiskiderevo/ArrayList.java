package com.homeworks.ivangolovich.spiskiderevo;
import static java.lang.System.arraycopy;

/**
 * Created by home on 10/26/2018.
 */
public class ArrayList {
    int [] data = {};

    void remove(){
        remove(data.length-1);

    }
     void remove(int index) {
        int [] temp = new int[data.length-1];
        arraycopy(data, 0, temp, 0, index);
        arraycopy(data, index+1, temp, index, data.length-index);
         this.data = temp;
    }

    void add(int element){
        add(data.length, element);
    }

     void add(int index, int element) {
         int [] temp = new int[data.length+1];
         arraycopy(data, 0, temp, 0, index);
         arraycopy(data, index+ 1, temp, index + 1, data.length-index);
         temp[index] = element;
         this.data = temp;
    }
}
