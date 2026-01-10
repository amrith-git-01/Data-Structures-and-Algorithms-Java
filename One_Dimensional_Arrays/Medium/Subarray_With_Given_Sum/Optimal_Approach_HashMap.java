package One_Dimensional_Arrays.Medium.Subarray_With_Given_Sum;

import java.util.HashMap;
import java.util.Scanner;

public class Optimal_Approach_HashMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the sum: ");
        int sum = scanner.nextInt();
        int res[] = subarrayWithGivenSum(arr, sum);
        if (res[0] == -1) {
            System.out.println("No subarray sum exists");
        } else {
            System.out.println("The subarray with given sum " + sum + " is: ");
            for (int i = res[0]; i <= res[1]; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        scanner.close();
    }

    public static int[] subarrayWithGivenSum(int arr[], int sum) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int prefixSum = 0;
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            if (map.containsKey(prefixSum - sum)) {
                return new int[] { map.get(prefixSum - sum) + 1, i };
            }
            map.put(prefixSum, i);
        }
        return new int[] { -1 };
    }
}
