package Two_Dimensional_Arrays.Medium.KWeakestRows;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int rows = scanner.nextInt();
        System.out.println("Enter the cols: ");
        int cols = scanner.nextInt();
        int mat[][] = new int[rows][cols];
        System.out.println("Enter the matrix elements: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter the k: ");
        int k = scanner.nextInt();
        System.out.println("The K weakest rows are: " + Arrays.toString(findKWeakestRows(mat, k)));
        scanner.close();
    }

    public static int[] findKWeakestRows(int mat[][], int k) {
        int rows = mat.length;
        int arr[][] = new int[rows][2];
        for (int i = 0; i < rows; i++) {
            arr[i][0] = binarySearch(mat[i]);
            arr[i][1] = i;
        }
        Arrays.sort(arr, (a, b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0];
            }
            return a[1] - b[1];
        });

        int res[] = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = arr[i][1];
        }
        return res;
    }

    public static int binarySearch(int arr[]) {
        int low = 0, high = arr.length - 1;
        int first = arr.length;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == 0) {
                first = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return first;
    }
}
