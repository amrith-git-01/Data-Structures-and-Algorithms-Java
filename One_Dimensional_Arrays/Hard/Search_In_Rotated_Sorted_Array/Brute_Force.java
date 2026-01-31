package One_Dimensional_Arrays.Hard.Search_In_Rotated_Sorted_Array;

import java.util.Scanner;

public class Brute_Force {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the array elemens: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the search element: ");
        int key = scanner.nextInt();
        System.out.println("Is the key element exists in the array?: " + searchInRotatedSortedArray(arr, key));
        scanner.close();
    }

    public static boolean searchInRotatedSortedArray(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return true;
            }
        }
        return false;
    }
}
