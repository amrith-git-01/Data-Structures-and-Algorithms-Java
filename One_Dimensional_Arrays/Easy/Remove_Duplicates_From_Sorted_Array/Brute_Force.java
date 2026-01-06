package One_Dimensional_Arrays.Easy.Remove_Duplicates_From_Sorted_Array;

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
        System.out.println("Array before removing duplicates: " + Arrays.toString(arr));
        int index = removeDuplicates(arr);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
        }
        scanner.close();
    }

    public static int removeDuplicates(int arr[]) {
        int temp[] = new int[arr.length];
        int index = 0;
        temp[index++] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                temp[index++] = arr[i];
            }
        }
        for (int i = 0; i < index; i++) {
            arr[i] = temp[i];
        }
        return index;
    }
}
