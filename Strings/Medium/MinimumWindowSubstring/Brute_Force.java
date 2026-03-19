package Strings.Medium.MinimumWindowSubstring;

import java.util.Scanner;

public class Brute_Force {
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
        String best = "";
        for (int i = 0; i < str1.length(); i++) {
            for (int j = i + 1; j <= str1.length(); j++) {
                String sub = str1.substring(i, j);
                if (isValid(sub, str2)) {
                    if (best.equals("") || best.length() > sub.length()) {
                        best = sub;
                    }
                }
            }
        }
        return best;
    }

    public static boolean isValid(String str1, String str2) {
        int hash1[] = new int[128];
        int hash2[] = new int[128];
        for (int i = 0; i < str1.length(); i++) {
            hash1[str1.charAt(i)]++;
        }
        for (int i = 0; i < str2.length(); i++) {
            hash2[str2.charAt(i)]++;
        }

        for (int i = 0; i < 128; i++) {
            if (hash1[i] < hash2[i]) {
                return false;
            }
        }
        return true;
    }
}
