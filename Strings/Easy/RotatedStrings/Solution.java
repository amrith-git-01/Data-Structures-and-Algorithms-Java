package Strings.Easy.RotatedStrings;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str_1 = scanner.next();
        System.out.println("Enter the second string: ");
        String str_2 = scanner.next();
        System.out.println("Is String Rotated?: " + checkRotated(str_1, str_2));
        scanner.close();
    }

    public static boolean checkRotated(String str_1, String str_2) {
        if (str_1.length() != str_2.length()) {
            return false;
        }
        for (int i = 0; i < str_1.length(); i++) {
            boolean match = true;
            for (int j = 0; j < str_2.length(); j++) {
                if (str_1.charAt((i + j) % str_1.length()) != str_2.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                return true;
            }
        }
        return false;
    }
}
