package Two_Dimensional_Arrays.Easy.Flipping_Image;

import java.util.Arrays;
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

        System.out.println("The orginal matrix: ");
        System.out.println(Arrays.deepToString(mat));
        int res[][] = flippingImage(mat);
        System.out.println("The flipped matrix: ");
        System.out.println(Arrays.deepToString(res));
        scanner.close();
    }

    public static int[][] flippingImage(int mat[][]) {
        int rows = mat.length;
        int cols = mat.length;
        int res[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            reverse(mat[i], res[i]);
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (res[i][j] == 0) {
                    res[i][j] = 1;
                } else {
                    res[i][j] = 0;
                }
            }
        }
        return res;
    }

    public static void reverse(int arr[], int res[]) {
        for (int i = 0; i < arr.length; i++) {
            res[arr.length - 1 - i] = arr[i];
        }
    }
}
