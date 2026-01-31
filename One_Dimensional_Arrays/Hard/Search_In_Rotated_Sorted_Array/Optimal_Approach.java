package One_Dimensional_Arrays.Hard.Search_In_Rotated_Sorted_Array;

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
        System.out.println("Enter the search element: ");
        int key = scanner.nextInt();
        System.out.println("Is the search element present in the array?: " + searchElementInSortedArray(arr, key));
        scanner.close();
    }

    public static boolean searchElementInSortedArray(int arr[], int key) {
        int low = 0, high = arr.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                return true;
            } else if (arr[low] <= arr[mid]) {
                if (arr[low] <= key && key < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            else{
                if(arr[mid] < key && key <= arr[high]){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
        }
        return false;
    }
}
