package Strings.Hard.MinimumWindowSubstring;

import java.util.Scanner;

public class Optimal_Approach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string 1: ");
        String str1 = scanner.nextLine();
        System.out.println("Enter the string 2: ");
        String str2 = scanner.nextLine();
        System.out.println("The shortest substring is: " + findMinimumWindowSubstring(str1, str2));
        scanner.close();
    }

    public static String findMinimumWindowSubstring(String str1, String str2) {
        int need[] = new int[128];
        for (int i = 0; i < str2.length(); i++) {
            need[str2.charAt(i)]++;
        }
        int req = 0;
        for (int i = 0; i < 128; i++) {
            if (need[i] > 0) {
                req++;
            }
        }
        int window[] = new int[128];
        int bestLen = Integer.MAX_VALUE;
        int bestLeft = 0;
        int left = 0;
        int have = 0;
        for (int right = 0; right < str1.length(); right++) {
            char ch = str1.charAt(right);
            window[ch]++;
            if (need[ch] > 0 && window[ch] == need[ch]) {
                have++;
            }

            while (have == req) {
                if (right - left + 1 < bestLen) {
                    bestLen = right - left + 1;
                    bestLeft = left;
                }
                char lc = str1.charAt(left);
                window[lc]--;
                left++;
                if (need[lc] > 0 && window[lc] < need[lc]) {
                    have--;
                }
            }
        }
        return bestLen == Integer.MAX_VALUE ? "" : str1.substring(bestLeft, bestLeft + bestLen);
    }
}
