package Two_Dimensional_Arrays.Easy.Transpose;

import java.util.Arrays;
import java.util.Scanner;

public class Brute_Force {
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
        int res[][] = findTranspose(mat);
        System.out.println("The transposed matrix: ");
        System.out.println(Arrays.deepToString(res));
        scanner.close();
    }

    public static int[][] findTranspose(int mat[][]) {
        int rows = mat.length;
        int cols = mat[0].length;
        int res[][] = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                res[j][i] = mat[i][j];
            }
        }

        return res;
    }
}
