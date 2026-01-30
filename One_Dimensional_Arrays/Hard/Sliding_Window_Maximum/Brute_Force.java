package One_Dimensional_Arrays.Hard.Sliding_Window_Maximum;

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
        System.out.println("Enter the k: ");
        int k = scanner.nextInt();
        int res[] = findSlidingWindowMax(arr, k);
        System.out.println("The resultant array is: ");
        System.out.println(Arrays.toString(res));
        scanner.close();
    }

    public static int[] findSlidingWindowMax(int arr[], int k) {
        int res[] = new int[arr.length - k + 1];
        for (int i = 0; i < arr.length - k + 1; i++) {
            int max = arr[i];
            for (int j = i + 1; j < i + k; j++) {
                max = Math.max(max, arr[j]);
            }
            res[i] = max;
        }
        return res;
    }
}
