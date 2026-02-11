package Two_Dimensional_Arrays.Easy.LuckyNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Brute_Force {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int rows = scanner.nextInt();
        System.out.println("Enter the cols: ");
        int cols = scanner.nextInt();
        int mat[][] = new int[rows][cols];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }

        System.out.println("The lucky numbers in the matrix are: " + findLuckyNumbers(mat));
        scanner.close();
    }

    public static List<Integer> findLuckyNumbers(int mat[][]) {
        List<Integer> lucky = new ArrayList<>();
        int rows = mat.length;
        int cols = mat[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (isLucky(mat, i, j)) {
                    lucky.add(mat[i][j]);
                }
            }
        }
        return lucky;
    }

    public static boolean isLucky(int mat[][], int i, int j) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int k = 0; k < mat[i].length; k++) {
            min = Math.min(min, mat[i][k]);
        }
        for (int k = 0; k < mat.length; k++) {
            max = Math.max(max, mat[k][j]);
        }

        return mat[i][j] == min && mat[i][j] == max;
    }
}
