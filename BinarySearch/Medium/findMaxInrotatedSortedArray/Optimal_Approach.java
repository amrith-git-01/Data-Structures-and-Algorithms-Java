package BinarySearch.Medium.findMaxInrotatedSortedArray;

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
        System.out.println("The max is: " + findMax(arr));
        scanner.close();
    }

    public static int findMax(int arr[]) {
        int max = Integer.MIN_VALUE;
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[high] >= arr[mid]) {
                max = Math.max(max, arr[high]);
                high = mid - 1;
            } else {
                max = Math.max(max, arr[mid]);
                low = mid + 1;
            }
        }
        return max;
    }
}
