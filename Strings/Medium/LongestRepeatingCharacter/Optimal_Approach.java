package Strings.Medium.LongestRepeatingCharacter;

import java.util.Scanner;

public class Optimal_Approach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = scanner.nextLine();
        System.out.println("Enter the k: ");
        int k = scanner.nextInt();
        System.out.println("Length of longest substring is: " + findLength(str, k));
        scanner.close();
    }

    public static int findLength(String str, int k) {
        int hash[] = new int[26];
        int maxLen = 0, maxFreq = 0;
        int left = 0;
        for (int right = 0; right < str.length(); right++) {
            hash[str.charAt(right) - 'A']++;
            maxFreq = Math.max(maxFreq, hash[str.charAt(right) - 'A']);
            if (right - left + 1 - maxFreq > k) {
                hash[str.charAt(left) - 'A']--;
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}
