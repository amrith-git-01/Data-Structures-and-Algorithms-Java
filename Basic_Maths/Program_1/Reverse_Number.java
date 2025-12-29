package Basic_Maths.Program_1;

import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        System.out.println("Before reversing: " + num);
        System.out.println("After reversing: " + reverse(num));
        scanner.close();
    }

    public static int reverse(int num) {
        int n = 0;
        while (num > 0) {
            int digit = num % 10;
            n = n * 10 + digit;
            num /= 10;
        }
        return n;
    }
}
