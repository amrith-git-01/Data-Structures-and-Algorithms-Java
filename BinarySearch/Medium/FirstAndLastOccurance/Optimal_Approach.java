package BinarySearch.Medium.FirstAndLastOccurance;

import java.util.Arrays;
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
        System.out
                .println("The first and last occurance is: " + Arrays.toString(findFirstAndLastOccurance(arr, target)));
        scanner.close();
    }

    public static int[] findFirstAndLastOccurance(int arr[], int target) {
        return new int[] { findLowerBound(arr, target), findUpperBound(arr, target) };
    }

    public static int findLowerBound(int arr[], int target) {
        int ans = -1;
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (ans == -1 || arr[ans] != target) {
            return -1;
        }
        return ans;
    }

    public static int findUpperBound(int arr[], int target) {
        int ans = -1;
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        int last = ans - 1;
        if (last < 0 || arr[last] != target) {
            return -1;
        }
        return last;
    }
}
