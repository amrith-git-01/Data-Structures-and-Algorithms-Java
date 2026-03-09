package Strings.Medium.CountSubstringsWithKDistinctChars;

import java.util.Scanner;

public class Brute_Force {
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
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            int distinct = 0;
            int hash[] = new int[256];
            for (int j = i; j < str.length(); j++) {
                if (hash[str.charAt(j)] == 0) {
                    distinct++;
                }
                hash[str.charAt(j)]++;

                if (distinct == k) {
                    count++;
                } else if (distinct > k) {
                    break;
                }
            }
        }
        return count;
    }
}
