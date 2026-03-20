package Strings.Hard.PalindromePairs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Brute_Force {
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
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (isPalindrome(arr[i] + arr[j])) {
                    list.add(Arrays.asList(i, j));
                }
                if (isPalindrome(arr[j] + arr[i])) {
                    list.add(Arrays.asList(j, i));
                }
            }
        }
        return list;
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
