package Strings.Medium.GroupAnagrams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Brute_Force {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = scanner.nextInt();
        String arr[] = new String[size];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.next();
        }
        System.out.println("Grouped Anagrams are: " + groupAnagrams(arr));
        scanner.close();
    }

    public static List<List<String>> groupAnagrams(String arr[]) {
        List<List<String>> list = new ArrayList<>();
        boolean vis[] = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (!vis[i]) {
                List<String> group = new ArrayList<>();
                for (int j = i; j < arr.length; j++) {
                    if (!vis[j] && isAnagram(arr[i], arr[j])) {
                        group.add(arr[j]);
                        vis[j] = !vis[j];
                    }
                }
                list.add(group);
            }
        }
        return list;
    }

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        int freq1[] = new int[26];
        int freq2[] = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            freq1[str1.charAt(i) - 'a']++;
            freq2[str2.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }
        return true;
    }
}
