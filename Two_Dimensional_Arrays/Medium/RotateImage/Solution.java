package Two_Dimensional_Arrays.Medium.RotateImage;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int rows = scanner.nextInt();
        System.out.println("Enter the cols: ");
        int cols = scanner.nextInt();
        int mat[][] = new int[rows][cols];
        System.out.println("Enter the matrix elements: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }
        rotateImage(mat);
        printMatrix(mat);
        scanner.close();
    }

    public static void rotateImage(int mat[][]) {
        int rows = mat.length;
        for (int i = 0; i < rows; i++) {
            for (int j = i + 1; j < rows; j++) {
                swap(mat, i, j);
            }
        }
        for (int i = 0; i < rows; i++) {
            reverseRows(mat[i]);
        }
    }

    public static void swap(int mat[][], int left, int right) {
        int temp = mat[left][right];
        mat[left][right] = mat[right][left];
        mat[right][left] = temp;
    }

    public static void reverseRows(int arr[]) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
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
