package Strings.Easy.LargestOddNumber;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = scanner.nextLine();
        System.out.println("The largest odd number is: " + findLargestOddNumber(str));
        scanner.close();
    }

    public static String findLargestOddNumber(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            if ((str.charAt(i) - '0') % 2 != 0) {
                return str.substring(0, i + 1);
            }
        }
        return "";
    }
}
