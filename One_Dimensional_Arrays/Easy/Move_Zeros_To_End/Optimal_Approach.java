package One_Dimensional_Arrays.Easy.Move_Zeros_To_End;

import java.util.Arrays;
import java.util.Scanner;

public class Optimal_Approach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Array before moving: " + Arrays.toString(arr));
        moveZerosToEnd(arr);
        System.out.println("Array after moving: " + Arrays.toString(arr));
        scanner.close();
    }

    public static void moveZerosToEnd(int arr[]) {
        int left = 0;
        for (int right = 0; right < arr.length; right++) {
            if (arr[right] != 0) {
                if (left != right) {
                    swap(arr, left, right);
                }
                left++;
            }
        }
    }

    public static void swap(int arr[], int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
