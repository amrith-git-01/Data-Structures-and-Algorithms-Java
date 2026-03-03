package Strings.Easy.RemoveOutermostParenthesis;

import java.util.Scanner;

public class Brute_Force {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = scanner.nextLine();
        System.out.println("String before removing outermost parenthesis is: " + str);
        System.out.println("String after removing outermost parenthese is: " + removeOutermostParenthesis(str));
        scanner.close();
    }

    public static String removeOutermostParenthesis(String str) {
        int left = 0, right = 0;
        int count = 0;
        StringBuilder s = new StringBuilder();
        while (right < str.length()) {
            if (str.charAt(right) == '(') {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                s.append(str.substring(left + 1, right));
                left = right + 1;
            }
            right++;
        }
        return s.isEmpty() ? " " : s.toString();
    }
}
