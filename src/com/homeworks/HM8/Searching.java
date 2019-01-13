package com.homeworks.HM8;

/**
 * Created by home on 10/20/2018.
 */
public class Searching {

    private ArrayList list;

    public Searching() {
        this.list = new ArrayList();
    }

    public ArrayList searchingByName(ArrayList arrayList, String words) {

        binarySearch(arrayList, words, 0, list.getElements().length);
        return list;
    }

    void binarySearch(ArrayList arrayList, String word, int left, int right)
    {
        for(int i = 0; i< arrayList.getElements().length-2; i++){

        if(arrayList.get(i).getM().toLowerCase().equals(word.toLowerCase())) {
                list.add(arrayList.get(i));
            }
        }
    }
}
