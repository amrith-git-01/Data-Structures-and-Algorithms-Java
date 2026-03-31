package BinarySearch.Medium.LumberjackProblem;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = scanner.nextInt();
        System.out.println("Enter the array elements: ");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the minimum requirement: ");
        int m = scanner.nextInt();
        System.out.println("The minimum height setting is: " + findHeight(arr, m));
        scanner.close();
    }

    public static int findHeight(int arr[], int m) {
        int low = 1, high = 0;
        for (int num : arr) {
            high = Math.max(high, num);
        }
        int ans = low;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canCollect(arr, m, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static boolean canCollect(int arr[], int m, int height) {
        int wood = 0;
        for (int num : arr) {
            wood += (num >= height) ? num - height : 0;
        }
        return wood >= m;
    }
}
