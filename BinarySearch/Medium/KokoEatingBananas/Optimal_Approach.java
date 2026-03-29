package BinarySearch.Medium.KokoEatingBananas;

import java.util.Scanner;

public class Optimal_Approach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = scanner.nextInt();
        System.out.println("Enter the array elements: ");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the hours: ");
        int hours = scanner.nextInt();
        System.out.println("The min speed is: " + findMinHours(arr, hours));
        scanner.close();
    }

    public static int findMinHours(int arr[], int hours) {
        int low = 1, high = 0;
        for (int n : arr) {
            high = Math.max(high, n);
        }

        int ans = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canEat(arr, hours, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static boolean canEat(int arr[], int hours, int speed) {
        int hoursNeeded = 0;
        for (int n : arr) {
            hoursNeeded += Math.ceil((double) n / speed);
        }
        return hoursNeeded <= hours;
    }
}
