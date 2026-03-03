package Strings.Easy.ReverseWords;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = scanner.nextLine();
        System.out.println("The Reversed String is: " + reverseWords(str));
        scanner.close();
    }

    public static String reverseWords(String str) {
        String s = str.strip();
        String arr[] = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
            if (i != 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
