package Strings.Medium.MinimumStepsToMakeStringsAnagrams;

import java.util.Scanner;

public class Brute_Force {
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
        char str2_arr[] = str2.toCharArray();
        int steps = 0;
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            boolean found = false;
            for (int j = 0; j < str2.length(); j++) {
                if (ch == str2_arr[j]) {
                    str2_arr[j] = '#';
                    found = true;
                    break;
                }
            }
            if (!found) {
                steps++;
            }
        }
        return steps;
    }
}
