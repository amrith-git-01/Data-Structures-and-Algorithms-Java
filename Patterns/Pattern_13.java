package Patterns;

import java.util.Scanner;

// Pattern: Right triangle with row numbers repeated
// Example:
// 1
// 2 2
// 3 3 3
// 4 4 4 4
// 5 5 5 5 5
public class Pattern_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n: ");
        int n = scanner.nextInt();
        printPattern(n);
        scanner.close();
    }

    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
                if (j != i - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
