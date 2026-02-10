package Two_Dimensional_Arrays.Easy.Flipping_Image;

import java.util.Scanner;
import java.util.Arrays;

public class Optimal_Approach {
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

        System.out.println("The orginal matrix: ");
        System.out.println(Arrays.deepToString(mat));
        flippingImage(mat);
        System.out.println("The flipped matrix: ");
        System.out.println(Arrays.deepToString(mat));
        scanner.close();
    }

    public static void flippingImage(int mat[][]) {
        int rows = mat.length;
        int cols = mat[0].length;
        for (int i = 0; i < rows; i++) {
            int left = 0, right = cols - 1;
            while (left < right) {
                if (mat[i][left] == mat[i][right]) {
                    mat[i][left] = mat[i][left] == 0 ? 1 : 0;
                    mat[i][right] = mat[i][right] == 0 ? 1 : 0;
                }
                left++;
                right--;
            }
            if (left == right) {
                mat[i][left] = mat[i][left] == 0 ? 1 : 0;
            }
        }
    }
}
