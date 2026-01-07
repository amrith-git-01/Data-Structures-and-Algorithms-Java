package One_Dimensional_Arrays.Easy.Sort_0s_1s_2s;

import java.util.Arrays;
import java.util.Scanner;

public class Better_Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Array before sorting: " + Arrays.toString(arr));
        sort0s1s2s(arr);
        System.out.println("Array after sorting: " + Arrays.toString(arr));
        scanner.close();
    }

    public static void sort0s1s2s(int arr[]) {
        int count0 = 0, count1 = 0;
        for (int i = 0; i < arr.length; i++) {
            count0 += arr[i] == 0 ? 1 : 0;
            count1 += arr[i] == 1 ? 1 : 0;
        }
        for (int i = 0; i < arr.length; i++) {
            if (i < count0) {
                arr[i] = 0;
            } else if (i < count1 + count0) {
                arr[i] = 1;
            } else {
                arr[i] = 2;
            }
        }
    }
}
