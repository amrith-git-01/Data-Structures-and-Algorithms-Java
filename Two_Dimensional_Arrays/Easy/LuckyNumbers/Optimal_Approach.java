package Two_Dimensional_Arrays.Easy.LuckyNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Optimal_Approach {
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
        int rows = mat.length;
        int cols = mat[0].length;
        List<Integer> lucky = new ArrayList<>();

        int rowMin[] = new int[rows];
        int colMax[] = new int[cols];

        findRowMin(mat, rowMin);
        findColMax(mat, colMax);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == rowMin[i] && mat[i][j] == colMax[j]) {
                    lucky.add(mat[i][j]);
                }
            }
        }
        return lucky;
    }

    public static void findRowMin(int mat[][], int rowMin[]) {
        for (int i = 0; i < mat.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < mat[0].length; j++) {
                min = Math.min(min, mat[i][j]);
            }
            rowMin[i] = min;
        }
    }

    public static void findColMax(int mat[][], int colMax[]) {
        for (int i = 0; i < mat[0].length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < mat.length; j++) {
                max = Math.max(max, mat[j][i]);
            }
            colMax[i] = max;
        }
    }
}
