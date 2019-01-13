package com.homeworks.npua;

import java.util.Scanner;

/**
 * Created by home on 12/10/2018.
 */
public class EDIST {
    static int min(int x, int y, int z) {
        if (x <= y && x <= z) return x;
        if (y <= x && y <= z) return y;
        else return z;
    }

    static int editDistDP(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        int dp[][] = new int[m + 1][n + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i == 0) {
                    dp[i][j] = j;
                }
                else if (j == 0) {
                    dp[i][j] = i;
                }
                else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                }
                else {
                    dp[i][j] = 1 + min(dp[i][j - 1],  // Insert
                            dp[i - 1][j],  // Remove
                            dp[i - 1][j - 1]);// Replace
                }
            }
        }
        return dp[m][n];
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String s1, s2;
        System.out.println("Enter two strings, one per line");
        s1 = input.nextLine();
        s2 = input.nextLine();
        System.out.println(editDistDP(s1.trim().replaceAll("\\s+", ""), s2.trim().replaceAll("\\s+", "")));
    }
}
