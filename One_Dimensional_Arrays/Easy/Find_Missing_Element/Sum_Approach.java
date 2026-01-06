package One_Dimensional_Arrays.Easy.Find_Missing_Element;

import java.util.Scanner;

public class Sum_Approach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = scanner.nextInt();
        System.out.println("Enter the array elements: ");
        int arr[] = new int[size - 1];
        for (int i = 0; i < size - 1; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("The missing element is: " + findMissingElement(arr, size));
        scanner.close();
    }

    public static int findMissingElement(int arr[], int n) {
        int sum = (n * (n + 1)) / 2;
        int sum_n = 0;
        for (int i = 0; i < arr.length; i++) {
            sum_n += arr[i];
        }
        return sum - sum_n;
    }
}
