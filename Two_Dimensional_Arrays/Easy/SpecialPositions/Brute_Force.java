package Two_Dimensional_Arrays.Easy.SpecialPositions;

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
        System.out.println("The number of special positions are: " + findSpecialPositions(mat));
        scanner.close();
    }

    public static int findSpecialPositions(int mat[][]) {
        int rows = mat.length;
        int cols = mat[0].length;
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 1 && isSpecial(i, j, mat))
                    count++;
            }
        }
        return count;
    }

    public static boolean isSpecial(int i, int j, int mat[][]) {
        int rows = mat.length;
        int cols = mat[0].length;
        int count = 0;
        for (int k = 0; k < cols; k++) {
            if (mat[i][k] == 1) {
                count++;
            }
            if (count > 1) {
                return false;
            }
        }
        count = 0;
        for (int k = 0; k < rows; k++) {
            if (mat[k][j] == 1) {
                count++;
            }
            if (count > 1) {
                return false;
            }
        }
        return true;
    }
}
