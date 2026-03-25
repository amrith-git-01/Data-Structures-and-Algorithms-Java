package BinarySearch.Medium.SearchRotatedSortedArray;

import java.util.Scanner;

public class Brute_Force {
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
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == el) {
                return i;
            }
        }
        return -1;
    }
}
