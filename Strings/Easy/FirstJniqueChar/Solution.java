package Strings.Easy.FirstJniqueChar;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = scanner.next();
        int res = findFirstUniqueChar(str);
        if (res == -1) {
            System.out.println("No unique chars");
        } else {
            System.out.println("The first unique char is placed in: " + res);
        }
        scanner.close();
    }

    public static int findFirstUniqueChar(String str) {
        int hash[] = new int[26];
        for (int i = 0; i < str.length(); i++) {
            hash[str.charAt(i) - 'a']++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (hash[str.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
