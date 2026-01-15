package One_Dimensional_Arrays.Medium.Maximum_Subarray_Product;

import java.util.Scanner;

public class Optimal_Approach {
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
        int maxProduct = arr[0];
        int maxSoFar = arr[0];
        int minSoFar = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];

            int temp = maxSoFar;

            maxSoFar = Math.max(current, Math.max(maxSoFar * current, minSoFar * current));
            minSoFar = Math.min(current, Math.min(temp * current, minSoFar * current));

            maxProduct = Math.max(maxProduct, maxSoFar);
        }
        return maxProduct;
    }
}
