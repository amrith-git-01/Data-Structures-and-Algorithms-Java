package One_Dimensional_Arrays.Hard.Majority_Element_N_By_3_Times;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Better_Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("The majority elements are: " + findMajElements(arr));
        scanner.close();
    }

    public static List<Integer> findMajElements(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (int key : map.keySet()) {
            if (map.get(key) > arr.length / 3) {
                list.add(key);
            }
        }

        return list;
    }
}
