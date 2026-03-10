package Strings.Medium.SumOfBeautyOfAllSubstrings;

import java.util.Scanner;

public class Optimal_Approach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = scanner.next();
        System.out.println("The sum is: " + sum(str));
        scanner.close();
    }

    public static int sum(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            int hash[] = new int[26];
            for (int j = i; j < str.length(); j++) {
                hash[str.charAt(j) - 'a']++;
                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;
                for (int k = 0; k < 26; k++) {
                    if (hash[k] > 0) {
                        max = Math.max(max, hash[k]);
                        min = Math.min(min, hash[k]);
                    }
                }
                sum += (max - min);
            }
        }
        return sum;
    }
}
