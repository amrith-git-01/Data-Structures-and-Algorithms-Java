package BinarySearch.Hard.MultiplicationTable;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the m: ");
        int m = scanner.nextInt();
        System.out.println("Enter the n: ");
        int n = scanner.nextInt();
        System.out.println("Enter the k: ");
        int k = scanner.nextInt();
        System.out.println("The kth smallest number is: " + findKthSmallestNumber(m, n, k));
        scanner.close();
    }

    public static int findKthSmallestNumber(int m, int n, int k) {
        int low = 1, high = n * m;
        int ans = 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (count(m, n, mid) >= k) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static int count(int m, int n, int val) {
        int count = 0;
        for (int i = 1; i <= m; i++) {
            count += Math.min(n, val / i);
        }
        return count;
    }
}
