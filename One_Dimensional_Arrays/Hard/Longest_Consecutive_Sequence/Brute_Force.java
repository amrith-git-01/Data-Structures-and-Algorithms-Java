package One_Dimensional_Arrays.Hard.Longest_Consecutive_Sequence;

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
        System.out.println("The longest consecutive sequence is: " + findLongestConsecutiveSequence(arr));
        scanner.close();
    }

    public static int findLongestConsecutiveSequence(int arr[]) {
        int maxLen = 1;
        for (int i = 0; i < arr.length; i++) {
            int cur = arr[i];
            int len = 1;
            while (arrayContains(arr, cur + 1)) {
                cur++;
                len++;
            }
            maxLen = Math.max(maxLen, len);
        }
        return maxLen;
    }

    public static boolean arrayContains(int arr[], int num) {
        for (int n : arr) {
            if (n == num) {
                return true;
            }
        }
        return false;
    }
}
