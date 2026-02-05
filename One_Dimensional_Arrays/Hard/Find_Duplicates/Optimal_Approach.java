package One_Dimensional_Arrays.Hard.Find_Duplicates;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Optimal_Approach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = scanner.nextInt();
        System.out.println("Enter the elements: ");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("The duplicates are: " + findDuplicates(arr));
        scanner.close();
    }

    public static List<Integer> findDuplicates(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (int num : map.keySet()) {
            if (map.get(num) > 1) {
                list.add(num);
            }
        }
        return list;
    }
}
