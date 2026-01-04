package Sorting.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class Bubble_Sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Array before sorting: " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Array after sorting: " + Arrays.toString(arr));
        scanner.close();
    }

    public static void bubbleSort(int arr[]) {
        for (int i = arr.length - 1; i > 0; i--) {
            boolean didSwap = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    didSwap = true;
                    swap(arr, j, j + 1);
                }
                if (!didSwap) {
                    break;
                }
            }
        }
    }

    public static void swap(int arr[], int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
