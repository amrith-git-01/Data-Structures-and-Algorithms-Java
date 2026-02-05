package One_Dimensional_Arrays.Hard.Max_Sum_With_No_Overlapping_Subaarays;

import java.util.Scanner;

public class Optimal_Solution {
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
        System.out.println("The maxmimum sum without overlapping subaarays is: "
                + findMaxSumWithoutOverlappingSubarrays(arr, l, m));
        scanner.close();
    }

    public static int findMaxSumWithoutOverlappingSubarrays(int arr[], int l, int m) {
        return Math.max(helper(arr, l, m), helper(arr, m, l));
    }

    public static int helper(int arr[], int l, int m) {
        int rangeSumL = 0, rangeSumM = 0;
        for (int i = 0; i < l + m; i++) {
            if (i < l) {
                rangeSumL += arr[i];
            } else {
                rangeSumM += arr[i];
            }
        }

        int maxL = rangeSumL;
        int ans = rangeSumL + rangeSumM;

        for (int i = l + m; i < arr.length; i++) {
            rangeSumM += arr[i] - arr[i - m];
            rangeSumL += arr[i - m] - arr[i - l - m];

            maxL = Math.max(maxL, rangeSumL);
            ans = Math.max(ans, maxL + rangeSumM);
        }

        return ans;
    }
}
