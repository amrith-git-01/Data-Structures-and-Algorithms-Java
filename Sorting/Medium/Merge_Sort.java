package Sorting.Medium;

import java.util.Arrays;
import java.util.Scanner;

public class Merge_Sort {
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
        mergeSort(arr, 0, size - 1);
        System.out.println("Array after sorting: " + Arrays.toString(arr));
        scanner.close();
    }

    public static void mergeSort(int arr[], int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public static void merge(int arr[], int low, int mid, int high) {
        int temp[] = new int[high - low + 1];
        int index = 0;
        int left = low;
        int right = mid + 1;
        while (left <= mid && right <= high) {
            if (arr[left] < arr[right]) {
                temp[index++] = arr[left++];
            } else {
                temp[index++] = arr[right++];
            }
        }
        while (left <= mid) {
            temp[index++] = arr[left++];
        }
        while (right <= high) {
            temp[index++] = arr[right++];
        }
        for (int i = 0; i < index; i++) {
            arr[low + i] = temp[i];
        }
    }
}
