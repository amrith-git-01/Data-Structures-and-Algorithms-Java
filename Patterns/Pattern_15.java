package Patterns;

import java.util.Scanner;

public class Pattern_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n: ");
        int n = scanner.nextInt();
        printPattern(n);
        scanner.close();
    }

    public static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - i - 1; j >= 0; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1 + " ");
            }
            for (int j = i - 1; j >= 0; j--) {
                System.out.print(j + 1);
                if (j > 0) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
