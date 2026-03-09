package Strings.Medium.IntegerToRoman;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the integer: ");
        int num = scanner.nextInt();
        System.out.println("The roman conversion is: " + integerToRoman(num));
        scanner.close();
    }

    public static String integerToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        int values[] = {
                1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1
        };
        String symbols[] = {
                "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
        };

        for (int i = 0; i < values.length; i++) {
            while (values[i] <= num) {
                sb.append(symbols[i]);
                num -= values[i];
            }
        }
        return sb.toString();
    }
}
