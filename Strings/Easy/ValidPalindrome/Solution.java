import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String words = scanner.next();
        System.out.println("Is the string valid palindrome?: " + isValidPalindrome(words));
        scanner.close();
    }

    public static boolean isValidPalindrome(String words) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < words.length(); i++) {
            char ch = words.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                str.append(Character.toLowerCase(ch));
            }
        }
        return isPalindrome(str.toString());
    }

    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
