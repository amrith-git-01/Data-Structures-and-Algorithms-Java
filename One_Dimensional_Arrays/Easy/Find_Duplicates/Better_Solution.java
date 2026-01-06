package One_Dimensional_Arrays.Easy.Find_Duplicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
        System.out.println("The duplicates are: " + findDuplicates(arr));
        scanner.close();
    }

    public static List<Integer> findDuplicates(int arr[]) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1] && (list.isEmpty() || list.get(list.size() - 1) != arr[i])) {
                list.add(arr[i]);
            }
        }
        return list;
    }
}
