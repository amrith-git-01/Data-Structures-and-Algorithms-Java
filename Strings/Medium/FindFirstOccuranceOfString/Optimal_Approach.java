package Strings.Medium.FindFirstOccuranceOfString;

import java.util.Scanner;

public class Optimal_Approach {
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
        int lps[] = build(needle);
        int i = 0, j = 0;
        while (i < haystack.length()) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            }
            if (j == needle.length()) {
                return i - j;
            } else if (i < haystack.length() && haystack.charAt(i) != needle.charAt(j)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
        return -1;
    }

    public static int[] build(String needle) {
        int lps[] = new int[needle.length()];
        int len = 0, i = 1;
        while (i < needle.length()) {
            if (needle.charAt(i) == needle.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
}
