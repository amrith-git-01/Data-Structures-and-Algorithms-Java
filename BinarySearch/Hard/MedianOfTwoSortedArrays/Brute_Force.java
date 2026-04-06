package BinarySearch.Hard.MedianOfTwoSortedArrays;

import java.util.Scanner;

public class Brute_Force {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size1: ");
        int size1 = scanner.nextInt();
        int arr1[] = new int[size1];
        System.out.println("Enter the size2: ");
        int size2 = scanner.nextInt();
        int arr2[] = new int[size2];
        System.out.println("Enter the elements of arr1: ");
        for (int i = 0; i < size1; i++) {
            arr1[i] = scanner.nextInt();
        }
        System.out.println("Enter the elements of arr2: ");
        for (int i = 0; i < size2; i++) {
            arr2[i] = scanner.nextInt();
        }
        System.out.println("The Median of the arrays is: " + findMedian(arr1, arr2));
        scanner.close();
    }

    public static double findMedian(int arr1[], int arr2[]) {
        int m = arr1.length;
        int n = arr2.length;
        int arr[] = new int[m + n];

        int left = 0, right = 0, index = 0;
        while (left < m && right < n) {
            if (arr1[left] < arr2[right]) {
                arr[index++] = arr1[left++];
            } else {
                arr[index++] = arr2[right++];
            }
        }
        while (left < m) {
            arr[index++] = arr1[left++];
        }
        while (right < n) {
            arr[index++] = arr2[right++];
        }
        if (arr.length % 2 == 0) {
            return (arr[arr.length / 2] + arr[arr.length / 2 - 1]) / 2.0;
        }
        return arr[arr.length / 2];
    }
}
