package Patterns;

import java.util.Scanner;

// Pattern: Square grid of stars with spaces between them
// Example:
// * * * * *
// * * * * *
// * * * * *
// * * * * *
// * * * * *
public class Pattern_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n: ");
        int n = scanner.nextInt();
        printPattern(n);
        scanner.close();
    }

    public static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
                if (j != n - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
