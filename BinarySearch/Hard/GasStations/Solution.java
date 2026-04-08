package BinarySearch.Hard.GasStations;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the stations: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the k: ");
        int k = scanner.nextInt();
        System.out.println("The minimum penalty is: " + findMinPenalty(arr, k));
        scanner.close();
    }

    public static double findMinPenalty(int arr[], int k) {
        int n = arr.length;
        double low = 0, high = 0;
        for (int i = 0; i < n - 1; i++) {
            high = Math.max(arr[i + 1] - arr[i], high);
        }
        double ans = high;
        for (int i = 0; i < 100; i++) {
            double mid = low + (high - low) / 2.0;
            if (canPlace(arr, k, mid)) {
                ans = mid;
                high = mid;
            } else {
                low = mid;
            }
        }
        return ans;
    }

    public static boolean canPlace(int arr[], int k, double dist) {
        if (dist == 0) {
            return true;
        }
        int stationsNeeded = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            stationsNeeded += (int) ((arr[i + 1] - arr[i]) / dist);
        }
        return stationsNeeded <= k;
    }
}
