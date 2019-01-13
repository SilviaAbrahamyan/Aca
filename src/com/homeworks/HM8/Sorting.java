package com.homeworks.HM8;


/**
 * Created by home on 10/20/2018.
 */
public class Sorting {
    private ArrayList list;

    public Sorting(ArrayList arrayList) {
        this.list = arrayList;

    }

    private int sortingByCharacter(Table table1, Table table2) {
        String  a = table1.getM();
        String  b = table2.getM();
        int length = 0;
        int d = 0;
        if (a.length() > b.length()) {
            length = b.length();
        } else {
            length = a.length();
        }

        for (int i = 0; i < length; i++) {

            if (a.charAt(i) < b.charAt(i)) {
                d = -1;
                break;
            } else if (a.charAt(i) > b.charAt(i)) {
                d = 1;
                break;
            } else {
                continue;
            }
        }
        return d;
    }

    public ArrayList sortingByName(String word) {
        for (int i = 0; i < list.getElements().length - 2; i++) {
            for (int j = 0; j < list.getElements().length - i - 2; j++) {
                if (sortingByCharacter(list.get(j), list.get(j+1)) == 1) {
                    Table temp = list.get(j);
                    list.remove(j);
                    list.add(j+1, temp);
                }
            }
        }

        return list;
    }


}
