package Strings.Medium.MultiplyStrings;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string1: ");
        String str1 = scanner.nextLine();
        System.out.println("Enter the string2: ");
        String str2 = scanner.nextLine();
        System.out.println("The string multiplication is: " + stringMultiply(str1, str2));
        scanner.close();
    }

    public static String stringMultiply(String str1, String str2) {
        if (str1.equals("0") || str2.equals("0")) {
            return "0";
        }
        int result[] = new int[str1.length() + str2.length()];
        for (int i = str1.length() - 1; i >= 0; i--) {
            for (int j = str2.length() - 1; j >= 0; j--) {
                int dig1 = str1.charAt(i) - '0';
                int dig2 = str2.charAt(j) - '0';

                int pro = dig1 * dig2;
                int p1 = i + j;
                int p2 = i + j + 1;

                int sum = pro + result[p2];
                result[p2] = sum % 10;
                result[p1] += sum / 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            if (!(sb.length() == 0 && num == 0)) {
                sb.append(num);
            }
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
