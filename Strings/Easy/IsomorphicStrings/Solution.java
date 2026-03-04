package Strings.Easy.IsomorphicStrings;

import java.util.Scanner;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str_1 = scanner.next();
        System.out.println("Enter the second string: ");
        String str_2 = scanner.next();
        System.out.println("Are the two strings Isomorphic?: " + isIsomorphic(str_1, str_2));
        scanner.close();
    }

    public static boolean isIsomorphic(String str_1, String str_2) {
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < str_1.length(); i++) {
            char ch_1 = str_1.charAt(i);
            char ch_2 = str_2.charAt(i);
            if (map.containsKey(ch_1) && map.get(ch_1) != ch_2) {
                return false;
            }
            map.put(ch_1, ch_2);
        }
        return true;
    }
}
