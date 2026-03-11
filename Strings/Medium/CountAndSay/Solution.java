package Strings.Medium.CountAndSay;

import java.util.Scanner;

public class Solution {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n: ");
        int n = scanner.nextInt();
        System.out.println("The count and say is: " + countAndSay(n));
        scanner.close();
    }

    public static String countAndSay(int n) {
        String current = "1";
        for (int i = 1; i < n; i++) {
            current = generate(current);
        }
        return current;
    }

    public static String generate(String current) {
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while (i < current.length()) {
            int count = 0;
            char ch = current.charAt(i);
            while (i < current.length() && ch == current.charAt(i)) {
                count++;
                i++;
            }
            sb.append(count);
            sb.append(ch);
        }
        return sb.toString();
    }
}
