package BinarySearch.Hard.MedianOfTwoSortedArrays;

import java.util.Scanner;

public class Optimal_Approach {
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

        if (n > m) {
            return findMedian(arr2, arr1);
        }

        int low = 0, high = m;
        while (low <= high) {
            int cut1 = low + (high - low) / 2;
            int cut2 = (n + m + 1) / 2 - cut1;

            int left1 = cut1 == 0 ? Integer.MIN_VALUE : arr1[cut1 - 1];
            int left2 = cut2 == 0 ? Integer.MIN_VALUE : arr2[cut2 - 1];

            int right1 = cut1 == m ? Integer.MAX_VALUE : arr1[cut1];
            int right2 = cut2 == n ? Integer.MAX_VALUE : arr2[cut2];

            if (left1 <= right2 && left2 <= right1) {
                if ((n + m) / 2 == 1) {
                    return Math.max(left1, left2);
                } else {
                    return (Math.max(right1, right2) + Math.min(left1, left2)) / 2.0;
                }
            } else if (left1 > right2) {
                high = cut1 - 1;
            } else {
                low = cut1 + 1;
            }
        }
        return 0.0;
    }
}
