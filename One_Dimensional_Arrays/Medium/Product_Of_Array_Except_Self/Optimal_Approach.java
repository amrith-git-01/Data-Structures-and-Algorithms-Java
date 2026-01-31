package One_Dimensional_Arrays.Medium.Product_Of_Array_Except_Self;

import java.util.Arrays;
import java.util.Scanner;

public class Optimal_Approach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = scanner.nextInt();
        System.out.println("Enter  the array elements: ");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("The max product is: " + Arrays.toString(findProductExceptSelf(arr)));
        scanner.close();
    }

    public static int[] findProductExceptSelf(int arr[]) {
        int res[] = new int[arr.length];
        res[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            res[i] = arr[i - 1] * res[i - 1];
        }
        int suffix = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            res[i] *= suffix;
            suffix *= arr[i];
        }
        return res;
    }
}
