package One_Dimensional_Arrays.Hard.Longest_Subarray_With_Sum_K;

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
        System.out.println("Enter the k: ");
        int k = scanner.nextInt();
        System.out.println("The longest subarray with sum " + k + " is: " + longestSubarrayWithSumK(arr, k));
        scanner.close();
    }

    public static int longestSubarrayWithSumK(int arr[], int k) {
        int sum = arr[0];
        int left = 0, right = 0;
        int maxLen = 0;
        while (right < arr.length) {
            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
            right++;
            if (right < arr.length) {
                sum += arr[right];
            }
        }
        return maxLen;
    }
}
