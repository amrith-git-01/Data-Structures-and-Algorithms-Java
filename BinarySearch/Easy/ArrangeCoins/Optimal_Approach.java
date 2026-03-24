package BinarySearch.Easy.ArrangeCoins;

import java.util.Scanner;

public class Optimal_Approach {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n: ");
        int n = scanner.nextInt();
        System.out.println("The max number of complete rows is: " + findRows(n));
        scanner.close();
    }

    public static int findRows(int n) {
        int low = 1, high = n;
        int ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long coins = (long) (mid * (mid + 1)) / 2;
            if (coins <= n) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}
