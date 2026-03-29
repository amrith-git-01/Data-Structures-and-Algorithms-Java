package BinarySearch.Medium.KokoEatingBananas;

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
        for (int i = low; i <= high; i++) {
            if (canEat(arr, hours, i)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean canEat(int arr[], int hours, int speed) {
        int hoursNeeded = 0;
        for (int n : arr) {
            hoursNeeded += Math.ceil((double) n / speed);
        }
        return hoursNeeded <= hours;
    }
}
