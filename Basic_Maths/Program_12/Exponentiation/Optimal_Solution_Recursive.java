package Basic_Maths.Program_12.Exponentiation;

import java.util.Scanner;

public class Optimal_Solution_Recursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the x: ");
        int x = scanner.nextInt();
        System.out.println("Enter the n: ");
        int n = scanner.nextInt();
        System.out.println("The exponentiation is: " + expo(x, n));
        scanner.close();
    }

    public static long expo(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }
        long half = expo(x, n / 2);
        long res = half * half;

        if (n % 2 == 1) {
            res *= x;
        }
        return res;
    }
}
