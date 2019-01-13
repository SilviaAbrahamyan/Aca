package com.homeworks.aca_book.test;

/**
 * Created by home on 10/4/2018.
 */
public class Palindrome {
    public static String isPalindrome(String word) {
        char[] s = word.toCharArray();
        String reverse = "";
        for (int i = s.length - 1; i >= 0; i--) {
            reverse += s[i];
        }

        return reverse;
    }

    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("mama"));
        String s = "Giraffe";
        boolean y = (s != "Giraffe");
        System.out.println(5 == 5.00);
        System.out.println(y == true);
        int i = -1;
        i = i >> 1;
        System.out.println(i);
    }
}
