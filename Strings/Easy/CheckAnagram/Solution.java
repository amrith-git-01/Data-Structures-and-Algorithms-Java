package Strings.Easy.CheckAnagram;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str_1 = scanner.next();
        System.out.println("Enter the second string: ");
        String str_2 = scanner.next();
        System.out.println("Is the strings anagrams?: " + checkAnagram(str_1, str_2));
        scanner.close();
    }

    public static boolean checkAnagram(String str_1, String str_2) {
        if (str_1.length() != str_2.length()) {
            return false;
        }
        int arr[] = new int[26];
        for (int i = 0; i < str_1.length(); i++) {
            arr[str_1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < str_2.length(); i++) {
            arr[str_2.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
