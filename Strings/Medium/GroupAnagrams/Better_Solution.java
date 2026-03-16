package Strings.Medium.GroupAnagrams;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Better_Solution {
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
        HashMap<String, List<String>> map = new HashMap<>();
        for (String word : arr) {
            char charArray[] = word.toCharArray();
            Arrays.sort(charArray);
            String key = String.valueOf(charArray);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
