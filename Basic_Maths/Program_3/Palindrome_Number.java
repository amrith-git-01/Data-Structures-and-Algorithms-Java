package Basic_Maths.Program_3;

import java.util.Scanner;

public class Palindrome_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        System.out.println("Is the number palindrome?: " + palindrome(num));
        scanner.close();
    }

    public static boolean palindrome(int num) {
        int n = num;
        int number = 0;
        while (n > 0) {
            number = number * 10 + (n % 10);
            n /= 10;
        }
        return num == number;
    }
}
