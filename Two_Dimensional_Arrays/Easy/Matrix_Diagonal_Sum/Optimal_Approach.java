package Two_Dimensional_Arrays.Easy.Matrix_Diagonal_Sum;

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
        System.out.println("The matrix diagonal sum is: " + findMatrixDiagonalSum(mat));
        scanner.close();
    }

    private static int findMatrixDiagonalSum(int[][] mat) {
        int sum = 0;
        int rows = mat.length;
        int cols = mat[0].length;
        for (int i = 0; i < rows; i++) {
            sum += mat[i][i];
            sum += mat[i][rows - 1 - i];
        }
        if (rows == cols && rows % 2 == 1) {
            return sum - mat[rows / 2][cols / 2];
        }
        return sum;
    }
}
