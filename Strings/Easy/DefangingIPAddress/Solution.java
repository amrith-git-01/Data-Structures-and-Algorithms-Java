package Strings.Easy.DefangingIPAddress;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = scanner.next();
        System.out.println("The defanged IP is: " + defangIPAddress(str));
        scanner.close();
    }

    public static String defangIPAddress(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i) == '.' ? "[.]" : str.charAt(i));
        }
        return sb.toString();
    }
}
