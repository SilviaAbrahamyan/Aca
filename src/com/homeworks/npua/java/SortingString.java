package com.homeworks.npua.java;

/**
 * Created by home on 10/16/2018.
 */
public class SortingString {



    private int sortingCharacter(String a, String b) {
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

    public void sortingWord(String[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (sortingCharacter(arr[j], arr[j + 1]) == 1) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        String arr[] = new String[]{"Anna", "Ani", "Misho", "Marine", "Sona", "Silvia", "Karen", "Zara"};
        SortingString s = new SortingString();
        s.sortingWord(arr);

    }
}
