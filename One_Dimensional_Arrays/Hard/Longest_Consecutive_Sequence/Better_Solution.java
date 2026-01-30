package One_Dimensional_Arrays.Hard.Longest_Consecutive_Sequence;

import java.util.Arrays;
import java.util.Scanner;

public class Better_Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("The longest consecutive sequence is: " + findLongestConsecutiveSequence(arr));
        scanner.close();
    }

    public static int findLongestConsecutiveSequence(int arr[]) {
        Arrays.sort(arr);
        int maxLen = 1;
        int curLen = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] == 1) {
                curLen++;
            } else {
                maxLen = Math.max(maxLen, curLen);
                curLen = 0;
            }
        }
        return maxLen;
    }
}
