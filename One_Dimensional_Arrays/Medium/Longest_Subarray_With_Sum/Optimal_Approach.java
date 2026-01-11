package One_Dimensional_Arrays.Medium.Longest_Subarray_With_Sum;

import java.util.HashMap;
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
        System.out.println("Enter the sum k: ");
        int k = scanner.nextInt();
        System.out.println("The largest subarray with the sum " + k + " is: " + longestSubarrayWithSumK(arr, k));
        scanner.close();
    }

    public static int longestSubarrayWithSumK(int arr[], int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int maxLen = 0, prefixSum = 0;
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            if (map.containsKey(prefixSum - k)) {
                maxLen = Math.max(maxLen, i - map.get(prefixSum - k));
            }
            if (!map.containsKey(arr[i])) {
                map.put(prefixSum, i);
            }
        }
        return maxLen;
    }
}
