package Strings.Medium.ReverseWordsInStrings;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = scanner.nextLine();
        System.out.println("The reversed word string is: " + reverseWords(str));
        scanner.close();
    }

    public static String reverseWords(String str) {
        int left = 0;
        int right = 0;
        char arr[] = str.toCharArray();
        while (right <= str.length()) {
            if (right == arr.length || arr[right] == ' ') {
                if (left < right) {
                    reverse(arr, left, right - 1);
                }
                left = right + 1;
            }
            right++;
        }
        return String.valueOf(arr);
    }

    public static void reverse(char arr[], int left, int right) {
        while (left < right) {
            swap(arr, left, right);
            left++;
            right--;
        }
    }

    public static void swap(char arr[], int left, int right) {
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
