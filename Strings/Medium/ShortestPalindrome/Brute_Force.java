package Strings.Medium.ShortestPalindrome;

import java.util.Scanner;

public class Brute_Force {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = scanner.nextLine();
        System.out.println("The shortest palindrome: " + shortestPalindrome(str));
        scanner.close();
    }

    public static String shortestPalindrome(String str) {
        for (int i = str.length(); i >= 0; i--) {
            String prefix = str.substring(0, i);
            if (isPalindrome(prefix)) {
                String suffix = str.substring(i);
                StringBuilder sb = new StringBuilder(suffix);
                sb.reverse();
                return sb.toString() + str;
            }
        }
        return "";
    }

    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(right) != str.charAt(left)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
