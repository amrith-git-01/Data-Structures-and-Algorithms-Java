package Two_Dimensional_Arrays.Easy.Transpose;

import java.util.Arrays;
import java.util.Scanner;

public class Optimal_Approach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int rows = scanner.nextInt();
        System.out.println("Enter the cols: ");
        int cols = scanner.nextInt();
        System.out.println("Enter the elements: ");
        int mat[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }
        System.out.println("The original matrix: ");
        System.out.println(Arrays.deepToString(mat));
        findTranspose(mat);
        System.out.println("The transposed matrix: ");
        System.out.println(Arrays.deepToString(mat));
        scanner.close();
    }

    public static void findTranspose(int mat[][]) {
        int rows = mat.length;
        int cols = mat[0].length;
        if (rows != cols) {
            return;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = i + 1; j < rows; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }
}
