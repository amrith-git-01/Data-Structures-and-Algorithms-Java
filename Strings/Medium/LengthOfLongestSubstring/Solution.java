package Strings.Medium.LengthOfLongestSubstring;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = scanner.next();
        System.out.println(
                "The longest length of non repeating char substring is: " + findLongestNonRepeatingCharSubstring(str));
        scanner.close();
    }

    public static int findLongestNonRepeatingCharSubstring(String str) {
        int maxLen = 0;
        int left = 0;
        int hash[] = new int[256];
        for (int right = 0; right < str.length(); right++) {
            hash[str.charAt(right)]++;
            if (hash[str.charAt(right)] > 1) {
                hash[str.charAt(left)]--;
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}
