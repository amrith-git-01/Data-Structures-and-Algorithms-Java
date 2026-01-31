package One_Dimensional_Arrays.Hard.Equal_0s_1s_Subarray;

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
        System.out.println("The max subarray with equal 0s and 1s are: " + findEqualSubarray(arr));
        scanner.close();
    }

    public static int findEqualSubarray(int arr[]) {
        int maxLen = 0;
        for (int i = 0; i < arr.length; i++) {
            int zeroCount = 0, oneCount = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] == 0) {
                    zeroCount++;
                } else {
                    oneCount++;
                }

                if (zeroCount == oneCount) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        return maxLen;
    }
}
