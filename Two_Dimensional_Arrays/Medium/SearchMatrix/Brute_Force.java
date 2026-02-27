package Two_Dimensional_Arrays.Medium.SearchMatrix;

import java.util.Scanner;

public class Brute_Force {
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
        System.out.println("Enter the el: ");
        int el = scanner.nextInt();
        System.out.println("The el is present?: " + searchMatrix(mat, el));
        scanner.close();
    }

    public static boolean searchMatrix(int mat[][], int el) {
        int rows = mat.length;
        int cols = mat[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == el) {
                    return true;
                }
            }
        }
        return false;
    }
}
