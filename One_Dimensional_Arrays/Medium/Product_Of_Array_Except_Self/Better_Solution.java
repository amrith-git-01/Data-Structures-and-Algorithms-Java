package One_Dimensional_Arrays.Medium.Product_Of_Array_Except_Self;

import java.util.Arrays;
import java.util.Scanner;

public class Better_Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = scanner.nextInt();
        System.out.println("Enter the array elements: ");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("The max product is: " + Arrays.toString(findProductExceptSelf(arr)));
        scanner.close();
    }

    public static int[] findProductExceptSelf(int arr[]) {
        int zeroCount = 0, totalProduct = 1, zeroIndex = -1;
        int res[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeroCount++;
                zeroIndex = i;
            } else {
                totalProduct *= arr[i];
            }
        }

        if (zeroCount > 1) {
            return res;
        } else if (zeroCount == 1) {
            res[zeroIndex] = totalProduct;
            return res;
        }

        for (int i = 0; i < arr.length; i++) {
            res[i] = totalProduct / arr[i];
        }
        return res;
    }
}
