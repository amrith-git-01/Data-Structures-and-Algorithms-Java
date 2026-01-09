package One_Dimensional_Arrays.Medium.Subarray_With_Given_Sum;

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
        System.out.println("Enter the sum: ");
        int sum = scanner.nextInt();
        int res[] = subarrayWithGivenSum(arr, sum);
        if (res[0] == -1) {
            System.out.println("No subarray exists");
        } else {
            System.out.println("The elements with the given sum " + sum + " is: ");
            for (int i = res[0]; i <= res[1]; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        scanner.close();
    }

    public static int[] subarrayWithGivenSum(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1 };
    }
}
