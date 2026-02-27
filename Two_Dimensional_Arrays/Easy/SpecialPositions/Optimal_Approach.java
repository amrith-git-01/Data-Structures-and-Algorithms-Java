package Two_Dimensional_Arrays.Easy.SpecialPositions;

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
        System.out.println("The number of special positions are: " + findSpecialPositions(mat));
        scanner.close();
    }

    public static int findSpecialPositions(int mat[][]) {
        int rows = mat.length;
        int cols = mat[0].length;
        int count = 0;

        int rowCount[] = new int[rows];
        int colCount[] = new int[cols];

        findRowCount(mat, rowCount);
        findColCount(mat, colCount);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 1 && rowCount[i] == 1 && colCount[j] == 1) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void findColCount(int mat[][], int arr[]) {
        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    count++;
                }
            }
            arr[i] = count;
        }
    }

    public static void findRowCount(int mat[][], int arr[]) {
        for (int i = 0; i < mat[0].length; i++) {
            int count = 0;
            for (int j = 0; j < mat.length; j++) {
                if (mat[j][i] == 1) {
                    count++;
                }
            }
            arr[i] = count;
        }
    }
}
