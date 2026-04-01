package BinarySearch.Medium.FindKClosestElements;

import java.util.ArrayList;
import java.util.List;
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
        System.out.println("Enter the x: ");
        int x = scanner.nextInt();
        System.out.println("Enter the k: ");
        int k = scanner.nextInt();
        System.out.println("The elements are: " + FindKClosestElements(arr, x, k));
        scanner.close();
    }

    public static List<Integer> FindKClosestElements(int arr[], int x, int k) {
        int low = 0, high = arr.length - k;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (x - arr[mid] <= arr[mid + k] - x) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i = low; i < low + k; i++) {
            list.add(arr[i]);
        }
        return list;
    }
}
