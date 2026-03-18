package Strings.Medium.MinimumStepsToMakeStringsAnagrams;

import java.util.Scanner;

public class Optimal_Approach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string 1: ");
        String str1 = scanner.nextLine();
        System.out.println("Enter the string 2: ");
        String str2 = scanner.nextLine();
        System.out.println("The minimum steps are: " + minSteps(str1, str2));
        scanner.close();
    }

    public static int minSteps(String str1, String str2) {
        int hash[] = new int[26];
        int steps = 0;
        for (int i = 0; i < str1.length(); i++) {
            hash[str1.charAt(i) - 'a']++;
        }
        for (int j = 0; j < str2.length(); j++) {
            hash[str2.charAt(j) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (hash[i] > 0) {
                steps += hash[i];
            }
        }
        return steps;
    }
}
