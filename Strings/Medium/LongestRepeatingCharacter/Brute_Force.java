package Strings.Medium.LongestRepeatingCharacter;

import java.util.Scanner;

public class Brute_Force {
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
        int maxLen = 0;
        for (int i = 0; i < str.length(); i++) {
            int hash[] = new int[26];
            for (int j = i; j < str.length(); j++) {
                hash[str.charAt(j) - 'A']++;
                int maxFreq = 0;
                for (int l = 0; l < 26; l++) {
                    maxFreq = Math.max(maxFreq, hash[l]);
                }
                int windowSize = j - i + 1;
                if (windowSize - maxFreq <= k) {
                    maxLen = Math.max(maxLen, windowSize);
                }
            }
        }
        return maxLen;
    }
}
