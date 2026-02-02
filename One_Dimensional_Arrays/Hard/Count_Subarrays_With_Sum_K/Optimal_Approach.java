package One_Dimensional_Arrays.Hard.Count_Subarrays_With_Sum_K;

import java.util.HashMap;
import java.util.Scanner;

public class Better_Solution {
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
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0, count = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(map, 0) + 1);
        }
        return count;
    }
}