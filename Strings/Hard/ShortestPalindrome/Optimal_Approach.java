package Strings.Hard.ShortestPalindrome;

import java.util.Scanner;

public class Optimal_Approach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = scanner.nextLine();
        System.out.println("The shortest palindrome: " + shortestPalindrome(str));
        scanner.close();
    }

    public static String shortestPalindrome(String str) {
        String s = str + '#' + new StringBuilder(str).reverse().toString();
        int lps[] = buildLPS(s);
        int index = lps[lps.length - 1];
        String sub = str.substring(index);
        return new StringBuilder(sub).reverse().toString() + str;
    }

    public static int[] buildLPS(String str) {
        int lps[] = new int[str.length()];
        int len = 0, i = 1;
        while (i < str.length()) {
            if (str.charAt(len) == str.charAt(i)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
}
