package Two_Dimensional_Arrays.Medium.SearchMatrix2;

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
        System.out.println("Enter the el: ");
        int el = scanner.nextInt();
        System.out.println("Is the element present?: " + searchMatrix(mat, el));
        scanner.close();
    }

    public static boolean searchMatrix(int mat[][], int el) {
        int rows = mat.length;
        int cols = mat[0].length;

        int r = 0, c = cols - 1;
        while (r < rows && c >= 0) {
            int val = mat[r][c];
            if (val == el) {
                return true;
            } else if (val > el) {
                c--;
            } else {
                r++;
            }
        }
        return false;
    }
}
