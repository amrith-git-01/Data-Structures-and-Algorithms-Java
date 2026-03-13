package Strings.Medium.FindFirstOccuranceOfString;

import java.util.Scanner;

public class Brute_Force {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the haystack: ");
        String haystack = scanner.next();
        System.out.println("Enter the needle: ");
        String needle = scanner.next();
        int index = findIndex(haystack, needle);
        if (index == -1) {
            System.out.println("No index found!");
        } else {
            System.out.println("The first occurance is at: " + index);
        }
        scanner.close();
    }

    public static int findIndex(String haystack, String needle) {
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j = 0;
            while (j < needle.length() && needle.charAt(j) == haystack.charAt(i + j)) {
                j++;
            }
            if (j == needle.length()) {
                return i;
            }
        }
        return -1;
    }
}
