package One_Dimensional_Arrays.Medium.Remove_Element_From_Array;

import java.util.Scanner;

public class Optimal_Approach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = scanner.nextInt();
        System.out.println("Enter the array elements: ");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the value: ");
        int val = scanner.nextInt();
        System.out.println("Valid array length is: " + findValidLength(arr, val));
        scanner.close();
    }

    public static int findValidLength(int arr[], int val) {
        int left = 0;
        for (int right = 0; right < arr.length; right++) {
            if (arr[right] != val) {
                arr[left] = arr[right];
                left++;
            }
        }
        return left;
    }
}
