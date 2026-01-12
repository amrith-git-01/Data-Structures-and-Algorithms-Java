package One_Dimensional_Arrays.Medium.Two_Sum;

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
        int res[] = twoSum(arr, sum);
        if (res[0] == -1) {
            System.out.println("There is no numbers that add up to " + sum);
        } else {
            System.out.println("The numbers' indices are: " + res[0] + " " + res[1]);
        }
        scanner.close();
    }

    public static int[] twoSum(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }
}
