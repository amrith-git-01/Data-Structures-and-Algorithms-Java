package BinarySearch.Medium.SearchRotatedSortedArray;

import java.util.Scanner;

public class Optimal_Approach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the target: ");
        int target = scanner.nextInt();
        int res = findRotatedSortedArray(arr, target);
        if (res == -1) {
            System.out.println("Element not found!");
        } else {
            System.out.println("Element found at: " + res);
        }
        scanner.close();
    }

    public static int findRotatedSortedArray(int arr[], int el) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == el) {
                return mid;
            } else if (arr[low] <= arr[mid]) {
                if (el >= arr[low] && el < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (el > arr[mid] && el <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
