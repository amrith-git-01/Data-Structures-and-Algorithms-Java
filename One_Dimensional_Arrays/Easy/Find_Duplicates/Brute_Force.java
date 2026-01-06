package One_Dimensional_Arrays.Easy.Find_Duplicates;

import java.util.ArrayList;
import java.util.List;
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
        List<Integer> dup = findDuplicates(arr);
        System.out.println("The duplicates are: " + dup);
        scanner.close();
    }

    public static List<Integer> findDuplicates(int arr[]) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && !list.contains(arr[i])) {
                    list.add(arr[i]);
                }
            }
        }
        return list;
    }
}
