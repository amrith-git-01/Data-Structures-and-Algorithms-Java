package BinarySearch.Medium.BookAllocation;

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
        System.out.println("Enter the students: ");
        int m = scanner.nextInt();
        System.out.println("The minimum of maximum is: " + findBooks(arr, m));
        scanner.close();
    }

    public static int findBooks(int arr[], int m) {
        int low = 0, high = 0;
        for (int num : arr) {
            low = Math.max(low, num);
            high += num;
        }
        int ans = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canSplit(arr, m, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static boolean canSplit(int arr[], int m, int pages) {
        int cur = 0, books = 1;
        for (int i = 0; i < arr.length; i++) {
            if (cur + arr[i] > pages) {
                books++;
                cur = 0;
            }
            cur += arr[i];
        }
        return books <= m;
    }
}
