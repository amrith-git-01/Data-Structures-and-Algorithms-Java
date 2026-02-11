package Two_Dimensional_Arrays.Easy.ToeplitzMatrix;

import java.util.Scanner;

public class Solution {
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

        System.out.println("Is the matric a toeplitx matrix?: " + findToeplitzMatrix(mat));
        scanner.close();
    }

    public static boolean findToeplitzMatrix(int mat[][]) {
        int rows = mat.length;
        int cols = mat[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i > 0 && j > 0) {
                    if (mat[i][j] != mat[i - 1][j - 1]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
