package One_Dimensional_Arrays.Easy.Remove_Duplicates_From_Sorted_Array;

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
        System.out.println("Array before removing duplicates: " + Arrays.toString(arr));
        int index = removeDuplicates(arr);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
        }
        scanner.close();
    }

    public static int removeDuplicates(int arr[]) {
        int left = 0;
        for (int right = 1; right < arr.length; right++) {
            if (arr[left] != arr[right]) {
                arr[++left] = arr[right];
            }
        }
        return left + 1;
    }
}
