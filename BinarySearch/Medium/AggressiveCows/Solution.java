package BinarySearch.Medium.AggressiveCows;

import java.util.Arrays;
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
        System.out.println("The min distance is: " + findDist(arr, k));
        scanner.close();
    }

    public static int findDist(int arr[], int k) {
        Arrays.sort(arr);
        int low = 1, high = arr[arr.length - 1] - arr[0];
        int ans = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canPlace(arr, k, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static boolean canPlace(int arr[], int k, int dist) {
        int cows = 1;
        int last = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - last >= dist) {
                cows++;
                last = arr[i];
            }
        }
        return cows >= k;
    }
}
