package BinarySearch.Medium.MagneticForceBetweenBalls;

import java.util.Arrays;
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
        System.out.println("Enter the m: ");
        int m = scanner.nextInt();
        System.out.println("The minimum distance is: " + findMinDistance(arr, m));
        scanner.close();
    }

    public static int findMinDistance(int arr[], int m) {
        Arrays.sort(arr);
        int low = 1, high = arr[arr.length - 1] - arr[0];
        int ans = 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canPlace(arr, m, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public static boolean canPlace(int arr[], int m, int dist) {
        int balls = 1;
        int last = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (last + arr[i] >= dist) {
                balls++;
                last = arr[i];
            }
        }

        return balls >= m;
    }
}
