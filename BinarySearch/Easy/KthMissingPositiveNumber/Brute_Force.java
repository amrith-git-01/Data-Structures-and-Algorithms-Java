package BinarySearch.Easy.KthMissingPositiveNumber;

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
        System.out.println("Enter the k: ");
        int k = scanner.nextInt();
        System.out.println("The kth missing positive number is: " + findKthMissingPositiveNumber(arr, k));
        scanner.close();
    }

    public static int findKthMissingPositiveNumber(int arr[], int k) {
        int num = 0;
        int missing = 0;
        int index = 0;
        while (missing < k) {
            num++;
            if (index < arr.length && arr[index] == num) {
                index++;
            } else {
                missing++;
            }
        }
        return num;
    }
}
