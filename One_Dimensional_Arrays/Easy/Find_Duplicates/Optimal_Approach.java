package One_Dimensional_Arrays.Easy.Find_Duplicates;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Optimal_Approach {
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
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> dup = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (!seen.add(arr[i])) {
                dup.add(arr[i]);
            }
        }

        return new ArrayList<>(dup);
    }
}
