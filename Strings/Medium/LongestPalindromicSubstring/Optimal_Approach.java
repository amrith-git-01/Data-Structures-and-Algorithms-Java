package Strings.Medium.LongestPalindromicSubstring;

import java.util.Scanner;

public class Optimal_Approach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = scanner.next();
        System.out.println("The longest palindromic substring is: " + findLongestPalindromicSubstring(str));
        scanner.close();
    }

    public static String findLongestPalindromicSubstring(String str) {
        int start = 0, maxLen = 1;
        for (int i = 0; i < str.length(); i++) {
            int oddLen = expand(str, i, i);
            if (oddLen > maxLen) {
                maxLen = oddLen;
                start = i - (oddLen - 1) / 2;
            }
            int evenLen = expand(str, i, i + 1);
            if (evenLen > maxLen) {
                maxLen = evenLen;
                start = i - (evenLen / 2) + 1;
            }
        }
        return str.substring(start, maxLen + start);
    }

    public static int expand(String str, int left, int right) {
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
