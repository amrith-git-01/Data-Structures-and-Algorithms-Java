package BinarySearch.Medium.SplitArrayLargestSum;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the k: ");
        int k = scanner.nextInt();
        System.out.println("The minimum sum of splitted array is: " + findSum(arr, k));
        scanner.close();
    }

    public static int findSum(int arr[], int k) {
        int low = 0, high = 0;
        for (int num : arr) {
            low = Math.min(low, num);
            high += num;
        }
        int ans = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canSplit(arr, k, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static boolean canSplit(int arr[], int k, int sum) {
        int parts = 1;
        int cur = 0;
        for (int num : arr) {
            if (cur + num > sum) {
                parts++;
                cur = 0;
            }
            cur += num;
        }
        return parts <= k;
    }
}
