package Strings.Easy.RemoveOutermostParenthesis;

import java.util.Scanner;

public class Optimal_Approach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = scanner.nextLine();
        System.out.println("String before removing outermost parenthesis is: " + str);
        System.out.println("String after removing outermost parenthese is: " + removeOutermostParenthesis(str));
        scanner.close();
    }

    public static String removeOutermostParenthesis(String str) {
        StringBuilder s = new StringBuilder();
        int depth = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(') {
                if (depth > 0) {
                    s.append(ch);
                }
                depth++;
            } else {
                depth--;
                if (depth > 0) {
                    s.append(ch);
                }
            }
        }
        return s.toString();
    }
}
