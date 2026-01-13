package One_Dimensional_Arrays.Medium.Remove_Element_From_Array;

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
        System.out.println("Enter the value: ");
        int val = scanner.nextInt();
        System.out.println("The valid array length is: " + findValidLength(arr, val));
        scanner.close();
    }

    public static int findValidLength(int arr[], int val) {
        int i = 0, n = arr.length;
        while (i < n) {
            if (arr[i] == val) {
                for (int j = i; j < n - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                n--;
            } else {
                i++;
            }
        }
        return n;
    }
}
