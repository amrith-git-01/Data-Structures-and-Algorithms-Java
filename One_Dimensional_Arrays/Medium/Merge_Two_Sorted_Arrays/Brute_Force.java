package One_Dimensional_Arrays.Medium.Merge_Two_Sorted_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Brute_Force {
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
        System.out.println("Enter the array2 elements: ");
        int arr2[] = new int[size2];
        for (int i = 0; i < size2; i++) {
            arr2[i] = scanner.nextInt();
        }
        int arr[] = mergeArrays(arr1, arr2);
        System.out.println("The merged arre is: " + Arrays.toString(arr));
        scanner.close();
    }

    public static int[] mergeArrays(int arr1[], int arr2[]) {
        int arr[] = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr[i + arr1.length] = arr2[i];
        }
        Arrays.sort(arr);
        return arr;
    }
}
