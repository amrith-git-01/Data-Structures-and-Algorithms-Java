package One_Dimensional_Arrays.Hard.Maximum_Gap;

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
        System.out.println("The maximum gap is: " + findMaxGap(arr));
        scanner.close();
    }

    public static int findMaxGap(int arr[]) {
        Arrays.sort(arr);
        int max = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            max = Math.max(max, arr[i + 1] - arr[i]);
        }
        return max;
    }
}
