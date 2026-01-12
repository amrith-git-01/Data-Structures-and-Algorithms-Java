package One_Dimensional_Arrays.Medium.Two_Sum;

import java.util.Arrays;
import java.util.Scanner;

public class Optimal_Approach_Two_Pointer {
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
        int res[] = twoSum(arr, sum);
        if (res[0] == -1) {
            System.out.println("There is no two numbers with the target sum");
        } else {
            System.out.println("The numbers' indices are: " + res[0] + " " + res[1]);
        }
        scanner.close();
    }

    public static int[] twoSum(int arr[], int sum) {
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        while (left < right) {
            if (arr[left] + arr[right] == sum) {
                return new int[] { left, right };
            } else if (arr[left] + arr[right] > sum) {
                right--;
            } else {
                left++;
            }
        }
        return new int[] { -1, -1 };
    }
}
