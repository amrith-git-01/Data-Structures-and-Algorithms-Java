package Basic_Maths.Program_14.Fibonacci_Series;

import java.util.Scanner;

public class Brute_Force {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n: ");
        int n = scanner.nextInt();
        System.out.println("The fibonacci series are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciSeries(i) + " ");
        }
        scanner.close();
    }

    public static int fibonacciSeries(int n) {
        if (n <= 1)
            return n;
        return fibonacciSeries(n - 1) + fibonacciSeries(n - 2);
    }
}
