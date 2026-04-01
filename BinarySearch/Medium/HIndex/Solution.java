package BinarySearch.Medium.HIndex;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = scanner.nextInt();
        System.out.println("Enter the elements: ");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("The h index is: " + findHIndex(arr));
        scanner.close();
    }

    public static int findHIndex(int arr[]) {
        int low = 0, high = arr.length;
        int ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canBeHIndex(arr, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static boolean canBeHIndex(int arr[], int val) {
        int count = 0;
        for (int num : arr) {
            if (num >= val) {
                count++;
            }
        }
        return count >= val;
    }
}
