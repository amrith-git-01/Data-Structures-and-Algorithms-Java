package BinarySearch.Easy.FindSqrt;

import java.util.Scanner;

public class Brute_Force {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the x: ");
        int x = scanner.nextInt();
        System.out.println("The sqrt is: " + findSqrt(x));
        scanner.close();
    }

    public static int findSqrt(int x) {
        int ans = 0;
        for (int i = 1; i * i <= x; i++) {
            ans = i;
        }
        return ans;
    }
}
