package Patterns;

import java.util.Scanner;

// Pattern: Right triangle (increasing, right-aligned)
// Example:
//         *
//       * *
//     * * *
//   * * * *
// * * * * *
public class Pattern_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n: ");
        int n = scanner.nextInt();
        printPattern(n);
        scanner.close();
    }

    public static void printPattern(int n) {
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                if (j >= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                if (j != n - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
