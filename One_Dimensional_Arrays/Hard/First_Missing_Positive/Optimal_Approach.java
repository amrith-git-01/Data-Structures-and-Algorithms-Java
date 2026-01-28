package One_Dimensional_Arrays.Hard.First_Missing_Positive;

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
        System.out.println("The first missing positive number is: " + firstMissingPositive(arr));
        scanner.close();
    }

    public static int firstMissingPositive(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 0) {
                arr[i] = arr.length + 1;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            int num = Math.abs(arr[i]);

            if (num <= arr.length) {
                if (arr[num - 1] > 0) {
                    arr[num - 1] = -arr[num - 1];
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                return i + 1;
            }
        }
        return arr.length + 1;
    }
}
