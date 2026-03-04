package Strings.Easy.LongestCommonPrefix;

import java.util.Scanner;

public interface Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num of words: ");
        int size = scanner.nextInt();
        String arr[] = new String[size];
        System.out.println("Enter the words: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.next();
        }
        System.out.println("The longest common prefix is: " + findLongestCommonPrefix(arr));
        scanner.close();
    }

    public static String findLongestCommonPrefix(String arr[]) {
        String first = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].charAt(index) != first.charAt(index)) {
                break;
            }
            index++;
        }
        return first.substring(0, index);
    }
}
