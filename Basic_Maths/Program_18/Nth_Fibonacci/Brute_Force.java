package Basic_Maths.Program_18.Nth_Fibonacci;

import java.util.Scanner;

public class Brute_Force {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n: ");
        int n = scanner.nextInt();
        System.out.println("The " + n + "th fibonacci number is: " + fibo(n));
        scanner.close();
    }

    public static int fibo(int n) {
        if (n <= 1) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}
