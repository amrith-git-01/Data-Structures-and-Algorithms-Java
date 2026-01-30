package One_Dimensional_Arrays.Hard.Longest_Consecutive_Sequence;

import java.util.HashSet;
import java.util.Scanner;

public class Optimal_Approach {
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
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int maxLen = 1;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentLen = 1;
                int cur = num;
                while (set.contains(cur + 1)) {
                    cur++;
                    currentLen++;
                }
                maxLen = Math.max(maxLen, currentLen);
            }
        }
        return maxLen;
    }
}
