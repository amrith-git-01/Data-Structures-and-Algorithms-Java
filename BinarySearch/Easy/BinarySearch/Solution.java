package BinarySearch.Easy.BinarySearch;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = scanner.nextInt();
        System.out.println("Enter the array elemnts: ");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the key: ");
        int key = scanner.nextInt();
        int res = binarySearch(arr, key);
        if (res == -1) {
            System.out.println("No element found!");
        } else {
            System.out.println("The element is found at: " + res);
        }
        scanner.close();
    }

    public static int binarySearch(int arr[], int key) {
        int low = 0, high = arr.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
