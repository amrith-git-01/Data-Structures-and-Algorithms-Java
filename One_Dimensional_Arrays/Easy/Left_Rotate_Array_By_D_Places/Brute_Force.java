package One_Dimensional_Arrays.Easy.Left_Rotate_Array_By_D_Places;

import java.util.Arrays;
import java.util.Scanner;

public class Brute_Force {
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
        System.out.println("Array before rotating " + d + " places: " + Arrays.toString(arr));
        leftRotateArrayByDPlaces(arr, d);
        System.out.println("Array after rotating " + d + " places: " + Arrays.toString(arr));
        scanner.close();
    }

    public static void leftRotateArrayByDPlaces(int arr[], int d) {
        d = d % arr.length;
        for (int i = 0; i < d; i++) {
            leftRotate(arr);
        }
    }

    public static void leftRotate(int arr[]) {
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;
    }
}
