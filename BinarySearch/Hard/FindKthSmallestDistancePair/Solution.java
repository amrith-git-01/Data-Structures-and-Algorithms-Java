package BinarySearch.Hard.FindKthSmallestDistancePair;

import java.util.Arrays;
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
        System.out.println("Enter the k: ");
        int k = scanner.nextInt();
        System.out.println("The kth smallest pair distance is: " + findKthSmallestDistancePair(arr, k));
        scanner.close();
    }

    public static int findKthSmallestDistancePair(int arr[], int k) {
        Arrays.sort(arr);
        int low = 0, high = arr[arr.length - 1];
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (countDist(arr, mid) >= k) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static int countDist(int arr[], int dist) {
        int left = 0, count = 0;
        for (int right = 0; right < arr.length; right++) {
            while (arr[right] - arr[left] > dist) {
                left++;
            }
            count += right - left;
        }
        return count;
    }
}
