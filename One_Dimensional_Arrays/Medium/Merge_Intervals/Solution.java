package One_Dimensional_Arrays.Medium.Merge_Intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = scanner.nextInt();
        int arr[][] = new int[size][2];
        System.out.println("Enter the intervals: ");
        for (int i = 0; i < size; i++) {
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
        }
        System.out.println("Intervals before merging: " + Arrays.deepToString(arr));
        System.out.println("Intervals after merging: " + Arrays.deepToString(mergeIntervals(arr)));
        scanner.close();
    }

    public static int[][] mergeIntervals(int arr[][]) {
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        int current[] = arr[0];
        List<int[]> mergedIntervals = new ArrayList<>();

        for (int i = 1; i < arr.length; i++) {
            if (arr[i][0] <= current[1]) {
                current[1] = Math.max(arr[i][1], current[1]);
            } else {
                mergedIntervals.add(current);
                current = arr[i];
            }
        }
        mergedIntervals.add(current);
        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }
}
