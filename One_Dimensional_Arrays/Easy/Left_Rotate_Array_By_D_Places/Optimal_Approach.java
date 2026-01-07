package One_Dimensional_Arrays.Easy.Left_Rotate_Array_By_D_Places;

import java.util.Arrays;
import java.util.Scanner;

public class Optimal_Approach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = scanner.nextInt();
        System.out.println("Enter the array elements: ");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the d: ");
        int d = scanner.nextInt();
        System.out.println("Array before rotating: " + Arrays.toString(arr));
        LeftRotateArrayByDPlaces(arr, d);
        System.out.println("Array after rotating: " + Arrays.toString(arr));
        scanner.close();
    }

    public static void LeftRotateArrayByDPlaces(int arr[], int d) {
        d = d % arr.length;
        reverse(arr, 0, d - 1);
        reverse(arr, d, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }

    public static void reverse(int arr[], int left, int right) {
        while (left < right) {
            swap(arr, left, right);
            left++;
            right--;
        }
    }

    public static void swap(int arr[], int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
