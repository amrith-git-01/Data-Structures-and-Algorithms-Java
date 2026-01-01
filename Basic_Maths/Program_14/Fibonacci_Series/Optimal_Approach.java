package Basic_Maths.Program_14.Fibonacci_Series;

import java.util.Scanner;

public class Optimal_Approach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n: ");
        int n = scanner.nextInt();
        System.out.println("The fibonacci series are: ");
        fibonacciSeries(n);
        scanner.close();
    }

    public static void fibonacciSeries(int n) {
        if (n <= 0) {
            return;
        }
        int a = 0, b = 1;
        System.out.print(a + " ");
        if (n == 1) {
            return;
        }
        System.out.print(b + " ");

        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
    }
}
