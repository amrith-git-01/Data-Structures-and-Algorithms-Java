package Strings.Medium.CountSubstringsWithKDistinctChars;

import java.util.Scanner;

public class Optimal_Approach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = scanner.next();
        System.out.println("Enter the k: ");
        int k = scanner.nextInt();
        System.out.println("The number of substrings are: " + countSubstrings(str, k));
        scanner.close();
    }

    public static int countSubstrings(String str, int k) {
        return atMost(str, k) - atMost(str, k - 1);
    }

    public static int atMost(String str, int k) {
        int left = 0, count = 0, distinct = 0;
        int hash[] = new int[256];
        for (int right = 0; right < str.length(); right++) {
            if (hash[str.charAt(right)] == 0) {
                distinct++;
            }
            hash[str.charAt(right)]++;

            while (distinct > k) {
                hash[str.charAt(left)]--;
                if ((hash[str.charAt(left)]) == 0) {
                    distinct--;
                }
                left++;
            }

            count += (right - left + 1);
        }

        return count;
    }
}
