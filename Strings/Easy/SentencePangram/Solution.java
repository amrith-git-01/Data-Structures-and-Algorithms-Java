package Strings.Easy.SentencePangram;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = scanner.next();
        System.out.println("Is the sentence pangram?: " + isSentencePangram(str));
        scanner.close();
    }

    public static boolean isSentencePangram(String str) {
        int hash[] = new int[26];
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                hash[str.charAt(i) - 'a']++;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (hash[i] == 0) {
                return false;
            }
        }
        return true;
    }
}
