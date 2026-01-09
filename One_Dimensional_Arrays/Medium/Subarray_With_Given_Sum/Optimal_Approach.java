package One_Dimensional_Arrays.Medium.Subarray_With_Given_Sum;

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
        System.out.println("Enter the sum: ");
        int sum = scanner.nextInt();
        int res[] = subarrayWithGivenSum(arr, sum);
        if (res[0] == -1) {
            System.out.println("No subarray exists");
        } else {
            System.out.println("The subarray with given sum " + sum + " is: ");
            for (int i = res[0]; i <= res[1]; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        scanner.close();
    }

    public static int[] subarrayWithGivenSum(int arr[], int sum) {
        int left = 0;
        int currentSum = 0;
        for (int right = 0; right < arr.length; right++) {
            currentSum += arr[right];
            while (currentSum > sum && left <= right) {
                currentSum -= arr[left];
                left++;
            }
            if (currentSum == sum) {
                return new int[] { left, right };
            }
        }
        return new int[] { -1 };
    }
}
