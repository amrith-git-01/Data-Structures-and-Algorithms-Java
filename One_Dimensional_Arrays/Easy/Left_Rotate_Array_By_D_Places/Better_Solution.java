package One_Dimensional_Arrays.Easy.Left_Rotate_Array_By_D_Places;

import java.util.Arrays;
import java.util.Scanner;

public class Better_Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the d: ");
        int d = scanner.nextInt();
        System.out.println("Array before rotating: " + Arrays.toString(arr));
        leftRotateArrayByDPlaces(arr, d);
        System.out.println("Array after rotating: " + Arrays.toString(arr));
        scanner.close();
    }

    public static void leftRotateArrayByDPlaces(int arr[], int d) {
        d = d % arr.length;
        int temp[] = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        for (int i = d; i < arr.length; i++) {
            arr[i - d] = arr[i];
        }
        for (int i = 0; i < d; i++) {
            arr[arr.length - d + i] = temp[i];
        }
    }
}
