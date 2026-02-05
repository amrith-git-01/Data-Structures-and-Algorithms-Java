package One_Dimensional_Arrays.Hard.Max_Sum_With_No_Overlapping_Subaarays;

import java.util.Scanner;

public class Brute_Force {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the L: ");
        int l = scanner.nextInt();
        System.out.println("Enter the M: ");
        int m = scanner.nextInt();
        System.out.println(
                "Maximum sum of overlapping subarrays is: " + findMaxSumWithoutOverlappingSubarrays(arr, l, m));
        scanner.close();
    }

    public static int findMaxSumWithoutOverlappingSubarrays(int arr[], int l, int m) {
        int max = 0;
        for (int i = 0; i <= arr.length - l; i++) {
            int sumL = 0;
            for (int k = i; k < i + l; k++) {
                sumL += arr[k];
            }
            for (int j = 0; j <= arr.length - m; j++) {
                if (i + l <= j || j + m <= i) {
                    int sumM = 0;
                    for (int k = j; k < j + m; k++) {
                        sumM += arr[k];
                    }
                    max = Math.max(max, sumL + sumM);
                }

            }
        }
        return max;
    }
}
