package One_Dimensional_Arrays.Medium.Merge_Two_Sorted_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Optimal_Approach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size1: ");
        int size1 = scanner.nextInt();
        int arr1[] = new int[size1];
        System.out.println("Enter the array1 elements: ");
        for (int i = 0; i < size1; i++) {
            arr1[i] = scanner.nextInt();
        }
        System.out.println("Enter the size2: ");
        int size2 = scanner.nextInt();
        int arr2[] = new int[size2];
        System.out.println("Enter the array2 elements: ");
        for (int i = 0; i < size2; i++) {
            arr2[i] = scanner.nextInt();
        }
        int arr[] = mergeArrays(arr1, arr2);
        System.out.println("The merged array is: " + Arrays.toString(arr));
        scanner.close();
    }

    public static int[] mergeArrays(int arr1[], int arr2[]) {
        int arr[] = new int[arr1.length + arr2.length];
        int left = 0, right = 0, index = 0;
        while (left < arr1.length && right < arr2.length) {
            if (arr1[left] < arr2[right]) {
                arr[index++] = arr1[left++];
            } else {
                arr[index++] = arr2[right++];
            }
        }
        while (left < arr1.length) {
            arr[index++] = arr1[left++];
        }
        while (right < arr2.length) {
            arr[index++] = arr2[right++];
        }
        return arr;
    }
}
