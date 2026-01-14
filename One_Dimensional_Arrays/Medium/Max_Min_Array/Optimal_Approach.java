package One_Dimensional_Arrays.Medium.Max_Min_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Optimal_Approach {
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
        Arrays.sort(arr);
        int minIndex = 0, maxIndex = arr.length - 1;
        int maxElement = arr[arr.length - 1] + 1;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] += (arr[maxIndex--] % maxElement) * maxElement;
            } else {
                arr[i] += (arr[minIndex++] % maxElement) * maxElement;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] /= maxElement;
        }
    }
}
