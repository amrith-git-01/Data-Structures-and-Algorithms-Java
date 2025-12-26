package Patterns;

import java.util.Scanner;

// Pattern: Square with stars on border and first two columns
// Example:
// * * * * *
// * *     
// * *     
// * *     
// * * * * *
public class Pattern_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n: ");
        int n = scanner.nextInt();
        printPattern(n);
        scanner.close();
    }

    public static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                    if (j != n - 1) {
                        System.out.print(" ");
                    }
                }

            } else {
                for (int j = 0; j < n; j++) {
                    if (j < 2) {
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                    if (j != n - 1) {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
