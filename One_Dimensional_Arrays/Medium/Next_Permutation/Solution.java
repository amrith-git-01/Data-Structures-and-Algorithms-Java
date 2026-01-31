package One_Dimensional_Arrays.Medium.Next_Permutation;

import java.util.Arrays;
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
        System.out.println("The array is: " + Arrays.toString(arr));
        nextPermutation(arr);
        System.out.println("The next Permutation is: " + Arrays.toString(arr));
        scanner.close();
    }

    public static void nextPermutation(int arr[]) {
        int breakpoint = -1;

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                breakpoint = i;
                break;
            }
        }

        if (breakpoint == -1) {
            reverse(arr, 0, arr.length - 1);
            return;
        }

        for (int i = arr.length - 1; i > breakpoint; i--) {
            if (arr[i] > arr[breakpoint]) {
                swap(arr, i, breakpoint);
                break;
            }
        }

        reverse(arr, breakpoint + 1, arr.length - 1);
    }

    public static void swap(int arr[], int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public static void reverse(int arr[], int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
