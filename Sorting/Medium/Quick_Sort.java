package Sorting.Medium;

import java.util.Arrays;
import java.util.Scanner;

public class Quick_Sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = scanner.nextInt();
        System.out.println("Enter the array elements: ");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Array before sorting: " + Arrays.toString(arr));
        quickSort(arr, 0, size - 1);
        System.out.println("Array after sorting: " + Arrays.toString(arr));
        scanner.close();
    }

    public static void quickSort(int arr[], int low, int high) {
        if (low >= high) {
            return;
        }
        int partition = findPartition(arr, low, high);
        quickSort(arr, low, partition - 1);
        quickSort(arr, partition + 1, high);
    }

    public static int findPartition(int arr[], int low, int high) {
        int pivot = arr[low];
        int left = low, right = high;
        while (left < right) {
            while (left < right && arr[left] < pivot) {
                left++;
            }
            while (right > left && arr[right] > pivot) {
                right--;
            }
            if (left < right) {
                swap(arr, left, right);
            }
        }
        return right;
    }

    public static void swap(int arr[], int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
