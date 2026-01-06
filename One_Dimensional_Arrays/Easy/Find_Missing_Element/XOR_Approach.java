package One_Dimensional_Arrays.Easy.Find_Missing_Element;

import java.util.Scanner;

public class XOR_Approach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = scanner.nextInt();
        int arr[] = new int[size - 1];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < size - 1; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("The missing element is: " + findMissingElement(arr, size));
        scanner.close();
    }

    public static int findMissingElement(int arr[], int n) {
        int n_xor = 0, sum_xor = 0;
        for (int i = 1; i <= n; i++) {
            n_xor ^= i;
        }
        for (int num : arr) {
            sum_xor ^= num;
        }
        return n_xor ^ sum_xor;
    }
}
