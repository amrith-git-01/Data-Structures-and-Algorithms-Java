package One_Dimensional_Arrays.Easy.Move_Zeros_To_End;

import java.util.Arrays;
import java.util.Scanner;

public class Brute_Force {
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
        int temp[] = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                temp[index++] = arr[i];
            }
        }
        while (index < arr.length) {
            temp[index++] = 0;
        }
        for (int i = 0; i < temp.length; i++) {
            arr[i] = temp[i];
        }
    }
}
