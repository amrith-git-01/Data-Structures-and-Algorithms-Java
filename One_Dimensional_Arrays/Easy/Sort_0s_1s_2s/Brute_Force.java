package One_Dimensional_Arrays.Easy.Sort_0s_1s_2s;

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
        System.out.println("Arrays before sorting: " + Arrays.toString(arr));
        sort0s1s2s(arr);
        System.out.println("Array after sorting: " + Arrays.toString(arr));
        scanner.close();
    }

    public static void sort0s1s2s(int arr[]) {
        Arrays.sort(arr);
    }
}
