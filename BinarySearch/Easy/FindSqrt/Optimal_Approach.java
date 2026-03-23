package BinarySearch.Easy.FindSqrt;

import java.util.Scanner;

public class Optimal_Approach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the x: ");
        int x = scanner.nextInt();
        System.out.println("The sqrt is: " + findSqrt(x));
        scanner.close();
    }

    public static int findSqrt(int x) {
        int low = 1, high = x;
        int ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid * mid > x) {
                high = mid - 1;
            } else {
                ans = mid;
                low = mid + 1;
            }
        }
        return ans;
    }
}
