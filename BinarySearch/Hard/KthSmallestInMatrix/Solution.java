package BinarySearch.Hard.KthSmallestInMatrix;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = scanner.nextInt();
        int arr[][] = new int[size][size];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter the k: ");
        int k = scanner.nextInt();
        System.out.println("The kth smallest element is: " + findKthSmallestElement(arr, k));
        scanner.close();
    }

    public static int findKthSmallestElement(int arr[][], int k) {
        int n = arr.length;
        int low = arr[0][0], high = arr[n - 1][n - 1];

        int ans = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (count(arr, mid) >= k) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static int count(int arr[][], int mid) {
        int count = 0;
        for (int row = 0; row < arr.length; row++) {
            int col = arr.length - 1;
            while (col >= 0 && arr[row][col] > mid) {
                col--;
            }
            count += col + 1;
        }
        return count;
    }
}
