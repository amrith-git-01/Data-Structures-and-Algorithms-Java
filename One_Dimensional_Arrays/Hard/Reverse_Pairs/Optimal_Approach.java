package One_Dimensional_Arrays.Hard.Reverse_Pairs;

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
        System.out.println("The count of reverse pairs are: " + countReversePairs(arr, 0, arr.length - 1));
        scanner.close();
    }

    public static int countReversePairs(int arr[], int low, int high) {
        int count = 0;
        if (low < high) {
            int mid = low + (high - low) / 2;
            count += countReversePairs(arr, low, mid);
            count += countReversePairs(arr, mid + 1, high);
            count += countPairs(arr, low, mid, high);
            merge(arr, low, mid, high);
        }
        return count;
    }

    public static int countPairs(int arr[], int low, int mid, int high) {
        int right = mid + 1;
        int count = 0;

        for (int i = low; i <= mid; i++) {
            while (right <= high && (long) arr[i] > 2L * arr[right]) {
                right++;
            }
            count += (right - (mid + 1));
        }
        return count;
    }

    public static void merge(int arr[], int low, int mid, int high) {
        int left = low, right = mid + 1;
        int temp[] = new int[high - low + 1];
        int index = 0;

        while (left <= mid && right <= high) {
            if (arr[left] < arr[right]) {
                temp[index++] = arr[left++];
            } else {
                temp[index++] = arr[right++];
            }
        }

        while (left <= mid) {
            temp[index++] = arr[left++];
        }

        while (right <= high) {
            temp[index++] = arr[right++];
        }

        for (int i = 0; i < index; i++) {
            arr[low + i] = temp[i];
        }
    }
}
