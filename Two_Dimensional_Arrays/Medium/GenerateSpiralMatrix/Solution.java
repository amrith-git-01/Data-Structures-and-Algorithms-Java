package Two_Dimensional_Arrays.Medium.GenerateSpiralMatrix;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = scanner.nextInt();
        int mat[][] = new int[size][size];
        generateSpiralMatrix(size, mat);
        printMatrix(mat);
        scanner.close();
    }

    public static void generateSpiralMatrix(int size, int mat[][]) {
        int num = 1;
        int top = 0, left = 0, right = size - 1, bottom = size - 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                mat[top][i] = num++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                mat[i][right] = num++;
            }
            right--;
            if (left <= right) {
                for (int i = right; i >= left; i--) {
                    mat[bottom][i] = num++;
                }
                bottom--;
            }
            if (top <= bottom) {
                for (int i = bottom; i >= top; i--) {
                    mat[i][left] = num++;
                }
                left++;
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
