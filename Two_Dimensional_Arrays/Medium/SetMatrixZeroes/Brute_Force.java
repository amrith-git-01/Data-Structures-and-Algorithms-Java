package Two_Dimensional_Arrays.Medium.SetMatrixZeroes;

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
        System.out.println("Matrix before setting zeroes: ");
        printMatrix(mat);
        setMatrixZeroes(mat);
        System.out.println("Matrix after setting zeroes: ");
        printMatrix(mat);
        scanner.close();
    }

    public static void setMatrixZeroes(int mat[][]) {
        int rows = mat.length;
        int cols = mat[0].length;

        boolean rowZero[] = new boolean[rows];
        boolean colZero[] = new boolean[cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 0) {
                    rowZero[i] = true;
                    colZero[i] = true;
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (colZero[j] || rowZero[i]) {
                    mat[i][j] = 0;
                }
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
