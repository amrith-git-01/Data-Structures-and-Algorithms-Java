package One_Dimensional_Arrays.Medium.Max_Min_Array;

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
        System.out.println("Array before max-min pattern: " + Arrays.toString(arr));
        maxMinPattern(arr);
        System.out.println("Array after max-min pattern: " + Arrays.toString(arr));
        scanner.close();
    }

    public static void maxMinPattern(int arr[]) {
        int n = arr.length;
        Arrays.sort(arr);
        int res[] = new int[n];
        int left = 0, right = n - 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                res[i] = arr[right--];
            } else {
                res[i] = arr[left++];
            }
        }

        for (int i = 0; i < n; i++) {
            arr[i] = res[i];
        }
    }
}
