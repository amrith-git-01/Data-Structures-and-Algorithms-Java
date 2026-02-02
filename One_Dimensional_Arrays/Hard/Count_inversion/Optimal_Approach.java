package One_Dimensional_Arrays.Hard.Count_inversion;

import java.util.Arrays;
import java.util.Scanner;

public class Optimal_Approach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = scanner.nextInt();
        System.out.println("Enter the array elements: ");
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("The count of inversions is: " + countInversions(arr, 0, arr.length - 1));
        scanner.close();
    }

    public static int countInversions(int arr[], int low, int high) {
        int count = 0;
        if (low < high) {
            int mid = low + (high - low) / 2;
            count += countInversions(arr, low, mid);
            count += countInversions(arr, mid + 1, high);
            count += mergeSort(arr, low, mid, high);
        }
        return count;
    }

    public static int mergeSort(int arr[], int low, int mid, int high) {
        int[] left = Arrays.copyOfRange(arr, low, mid + 1);
        int[] right = Arrays.copyOfRange(arr, mid + 1, high + 1);
        int count = 0;
        int i = 0, j = 0, k = low;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
                count += (mid + 1) - (low + i);
            }
        }
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        while (j < right.length) {
            arr[k++] = right[j++];
        }
        return count;
    }
}
