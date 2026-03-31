package BinarySearch.Medium.SumOfMutatedArrayClosestToTarget;

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
        System.out.println("Enter the target: ");
        int target = scanner.nextInt();
        System.out.println("The value is: " + findValue(arr, target));
        scanner.close();
    }

    public static int findValue(int arr[], int target) {
        int low = 0, high = 0;
        for (int num : arr) {
            high = Math.max(high, num);
        }

        int ans = low;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (sum(arr, mid) <= target) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        int sum1 = sum(arr, ans);
        int sum2 = sum(arr, ans + 1);
        if (Math.abs(target - sum2) < Math.abs(target - sum1)) {
            return ans + 1;
        }
        return ans;
    }

    public static int sum(int arr[], int val) {
        int sum = 0;
        for (int num : arr) {
            sum += Math.min(num, val);
        }
        return sum;
    }
}
