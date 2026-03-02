package Two_Dimensional_Arrays.Medium.SetMatrixZeroes;

import java.util.Scanner;

public class Optiomal_Approach {
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
        System.out.println("Matrix before setting zeroes: ");
        printMatrix(mat);
        setMatrixZeroes(mat);
        System.out.println("Matrix after setting zeroes: ");
        printMatrix(mat);
        scanner.close();
    }

    public static void setMatrixZeroes(int mat[][]) {
        int rows = mat.length;
        int cols = mat.length;

        boolean firstRow = false, firstCol = false;
        for (int i = 0; i < cols; i++) {
            if (mat[0][i] == 0) {
                firstRow = true;
            }
        }

        for (int i = 0; i < rows; i++) {
            if (mat[i][0] == 0) {
                firstCol = true;
            }
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (mat[i][j] == 0) {
                    mat[0][j] = 0;
                    mat[i][0] = 0;
                }
            }
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (mat[i][0] == 0 || mat[0][j] == 0) {
                    mat[i][j] = 0;
                }
            }
        }

        if (firstCol) {
            for (int i = 0; i < rows; i++) {
                mat[i][0] = 0;
            }
        }

        if (firstRow) {
            for (int i = 0; i < cols; i++) {
                mat[0][i] = 0;
            }
        }
    }

    public static void printMatrix(int mat[][]) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
