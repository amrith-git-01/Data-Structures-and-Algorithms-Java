package Two_Dimensional_Arrays.Easy.Richest_Customer;

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
        System.out.println("Ths richest Customer is: " + findRichestCustomer(mat));
        scanner.close();
    }

    public static int findRichestCustomer(int mat[][]) {
        int rows = mat.length;
        int max = 0;
        for (int i = 0; i < rows; i++) {
            max = Math.max(max, findSum(mat[i]));
        }
        return max;
    }

    public static int findSum(int arr[]) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
