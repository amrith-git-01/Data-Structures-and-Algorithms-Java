package One_Dimensional_Arrays.Medium.Maximum_Subarray_Sum;

import java.util.Scanner;

public class Brute_force {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("The max subarray sum is: " + maxSubarraySum(arr));
        scanner.close();
    }

    public static int maxSubarraySum(int arr[]) {
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                max_sum = Math.max(max_sum, sum);
            }
        }
        return max_sum;
    }
}
