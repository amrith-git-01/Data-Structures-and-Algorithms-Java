package BinarySearch.Medium.MinimumSpeed;

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
        System.out.println("Enter the hours: ");
        double hours = scanner.nextDouble();
        System.out.println("The speed should be: " + findSpeed(arr, hours));
        scanner.close();
    }

    public static int findSpeed(int arr[], double hours) {
        int low = 1, high = 10_00_000;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canReach(arr, hours, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static boolean canReach(int arr[], double hours, int speed) {
        int hoursNeeded = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            hoursNeeded += Math.ceil((double) arr[i] / speed);
        }
        hoursNeeded += (double) arr[arr.length - 1] / speed;
        return hoursNeeded <= hours;
    }
}
