package One_Dimensional_Arrays.Medium.Maximum_Subarray_Product;

import java.util.Scanner;

public class Brute_Force {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("The max subarray product is: " + maxSubarrayProduct(arr));
        scanner.close();
    }

    public static int maxSubarrayProduct(int arr[]) {
        int maxProduct = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int product = 1;
            for (int j = i; j < arr.length; j++) {
                product *= arr[j];
                maxProduct = Math.max(maxProduct, product);
            }
        }
        return maxProduct;
    }
}
