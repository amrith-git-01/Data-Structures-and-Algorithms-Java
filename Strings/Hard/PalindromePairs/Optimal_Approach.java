package Strings.Hard.PalindromePairs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.HashMap;

public class Optimal_Approach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the elements: ");
        String arr[] = new String[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextLine();
        }
        System.out.println("The palindrome pairs are: " + palindromePairs(arr));
        scanner.close();
    }

    public static List<List<Integer>> palindromePairs(String arr[]) {
        List<List<Integer>> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }

        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];

            for (int k = 0; k <= word.length(); k++) {
                String prefix = word.substring(0, k);
                String suffix = word.substring(k);

                if (isPalindrome(prefix)) {
                    String revSuffix = new StringBuilder(suffix).reverse().toString();
                    if (map.containsKey(revSuffix) && map.get(revSuffix) != i) {
                        list.add(Arrays.asList(map.get(revSuffix), i));
                    }
                }
                if (isPalindrome(suffix)) {
                    String revPrefix = new StringBuilder(prefix).reverse().toString();
                    if (map.containsKey(revPrefix) && map.get(revPrefix) != i) {
                        list.add(Arrays.asList(i, map.get(revPrefix)));
                    }
                }
            }
        }
        return list.stream().distinct().collect(Collectors.toList());
    }

    public static boolean isPalindrome(String word) {
        int left = 0, right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
