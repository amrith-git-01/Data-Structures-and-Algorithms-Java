package BinarySearch.Medium.FindRightInterval;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Optimal_Approach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = scanner.nextInt();
        int mat[][] = new int[size][2];
        System.out.println("Enter the intervals: ");
        for (int i = 0; i < size; i++) {
            mat[i][0] = scanner.nextInt();
            mat[i][1] = scanner.nextInt();
        }
        System.out.println("The result is: " + Arrays.toString(findResult(mat)));
        scanner.close();
    }

    public static int[] findResult(int mat[][]) {
        int res[] = new int[mat.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < mat.length; i++) {
            map.put(mat[i][0], i);
        }
        Arrays.sort(mat, (a, b) -> {
            return a[0] - b[0];
        });
        for (int i = 0; i < mat.length; i++) {
            int index = map.get(mat[i][0]);
            int id = findLowerBound(mat, mat[i][1]);
            res[index] = id == -1 ? id : map.get(mat[id][0]);
        }
        return res;
    }

    public static int findLowerBound(int mat[][], int id) {
        int low = 0, high = mat.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mat[mid][0] >= id) {
                ans = mid;
                low = mid - 1;
            } else {
                high = mid + 1;
            }
        }
        return ans;
    }
}
