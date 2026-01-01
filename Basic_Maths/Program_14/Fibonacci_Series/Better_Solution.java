package Basic_Maths.Program_14.Fibonacci_Series;

import java.util.Scanner;

public class Better_Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n: ");
        int n = scanner.nextInt();
        System.out.println("The fibonacci series is: ");
        int arr[] = fibonacciSeries(n);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        scanner.close();
    }

    public static int[] fibonacciSeries(int n) {
        if (n <= 0) {
            return new int[0];
        }
        int arr[] = new int[n];
        arr[0] = 0;
        if (n > 1) {
            arr[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr;
    }
}
