package BinarySearch.Medium.PainterPartition;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the painters: ");
        int m = scanner.nextInt();
        System.out.println("The minimum of maximum time is: " + findTime(arr, m));
        scanner.close();
    }

    public static int findTime(int arr[], int m) {
        int low = 0, high = 0;
        for (int num : arr) {
            low = Math.max(low, num);
            high += num;
        }
        int ans = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canPartition(arr, m, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static boolean canPartition(int arr[], int m, int time) {
        int cur = 0, painter = 1;
        for (int num : arr) {
            if (cur + num > time) {
                painter++;
                cur = 0;
            }
            cur += num;
        }
        return painter <= m;
    }
}
