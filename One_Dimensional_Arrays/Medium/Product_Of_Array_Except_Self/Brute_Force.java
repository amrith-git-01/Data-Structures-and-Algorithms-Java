package One_Dimensional_Arrays.Medium.Product_Of_Array_Except_Self;

import java.util.Arrays;
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
        System.out.println("The product is: " + Arrays.toString(findProductExceptSelf(arr)));
        scanner.close();
    }

    public static int[] findProductExceptSelf(int arr[]) {
        int res[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int pro = 1;
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    pro *= arr[j];
                }
            }
            res[i] = pro;
        }
        return res;
    }
}
