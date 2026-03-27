package BinarySearch.Medium.FindRightInterval;

import java.util.Arrays;
import java.util.Scanner;

public class Brute_Force {
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
        for (int i = 0; i < mat.length; i++) {
            int end = mat[i][1];
            int index = -1;
            int minStart = Integer.MAX_VALUE;
            for (int j = 0; j < mat.length; j++) {
                if (mat[j][0] >= end && mat[j][0] < minStart) {
                    minStart = mat[j][0];
                    index = j;
                }
            }
            res[i] = index;
        }
        return res;
    }
}
