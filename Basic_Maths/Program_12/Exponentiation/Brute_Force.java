package Basic_Maths.Program_12.Exponentiation;

import java.util.Scanner;

public class Brute_Force {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the x: ");
        int x = scanner.nextInt();
        System.out.println("Enter the n: ");
        int n = scanner.nextInt();
        System.out.println("Exponentiation is: " + expo(x, n));
        scanner.close();
    }

    public static int expo(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        return result;
    }
}
