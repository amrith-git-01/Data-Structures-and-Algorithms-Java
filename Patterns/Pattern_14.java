package Patterns;

import java.util.Scanner;

// Pattern: Right triangle with consecutive numbers
// Example:
// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15
public class Pattern_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n: ");
        int n = scanner.nextInt();
        printPattern(n);
        scanner.close();
    }

    public static void printPattern(int n) {
        int num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(num++);
                if (j != i) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
