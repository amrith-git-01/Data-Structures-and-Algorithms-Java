package Patterns;

import java.util.Scanner;

// Pattern: Right triangle hourglass (increasing then decreasing, left-aligned)
// Example:
// *
// * *
// * * *
// * * * *
// * * * * *
// * * * *
// * * *
// * *
// *
public class Pattern_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n: ");
        int n = scanner.nextInt();
        printPattern(n);
        scanner.close();
    }

    public static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
                if(j != i){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
                if(j != i){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
