package One_Dimensional_Arrays.Hard.Count_Subarrays_With_Sum_K;

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
        System.out.println("The count of subarrays with sum " + k + " is: " + countSubarrayWithWumK(arr, k));
        scanner.close();
    }

    public static int countSubarrayWithWumK(int arr[], int k) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }
}
