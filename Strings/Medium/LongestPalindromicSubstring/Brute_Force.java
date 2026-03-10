package Strings.Medium.LongestPalindromicSubstring;

import java.util.Scanner;

public class Brute_Force {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = scanner.next();
        System.out.println("The longest palindromic substring is: " + findLongestPalindromicSubstring(str));
        scanner.close();
    }

    public static String findLongestPalindromicSubstring(String str) {
        String res = String.valueOf(str.charAt(0));
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (isPalindrome(str, i, j)) {
                    if (j - i + 1 > res.length()) {
                        res = str.substring(i, j + 1);
                    }
                }
            }
        }
        return res;
    }

    public static boolean isPalindrome(String str, int left, int right) {
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
