package Patterns;

import java.util.Scanner;

// Pattern: Right triangle hourglass with even number of stars per row
// Example:
// * *
// * * * *
// * * * * * *
// * * * * * * * *
// * * * * * * * * * *
// * * * * * * * *
// * * * * * *
// * * * *
// * *
public class Pattern_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n: ");
        int n = scanner.nextInt();
        printPattern(n);
        scanner.close();
    }

    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i * 2; j++) {
                System.out.print("*");
                if (j != 2 * i) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < i * 2; j++) {
                System.out.print("*");
                if (j != 2 * i) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
