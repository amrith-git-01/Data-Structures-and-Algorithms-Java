package BinarySearch.Medium.ShippingContainers;

import java.util.Scanner;

public class Brute_Force {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = scanner.nextInt();
        System.out.println("Enter the array elements: ");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the days: ");
        int days = scanner.nextInt();
        System.out.println("The minimum capacity is: " + findMinCap(arr, days));
        scanner.close();
    }

    public static int findMinCap(int arr[], int days) {
        int low = 0, high = 0;
        for (int n : arr) {
            low = Math.max(low, n);
            high += n;
        }
        for (int i = low; i <= high; i++) {
            if (canShip(arr, days, i)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean canShip(int arr[], int days, int cap) {
        int daysNeeded = 1;
        int cur = 0;
        for (int n : arr) {
            if (n + cur > cap) {
                cur = 0;
                daysNeeded++;
            }
            cur += n;
        }
        return daysNeeded <= days;
    }
}
