package Patterns;

import java.util.Scanner;

// Pattern: Right triangle (decreasing, left-aligned)
// Example:
// * * * * *
// * * * *
// * * *
// * *
// *
public class Pattern_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n: ");
        int n = scanner.nextInt();
        printPattern(n);
        scanner.close();
    }

    public static void printPattern(int n) {
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
                if (i != j) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
