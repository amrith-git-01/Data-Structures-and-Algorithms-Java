package One_Dimensional_Arrays.Hard.Three_Sum;

import java.util.HashSet;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

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
        System.out.println("The triplets are: " + findThreeSum(arr));
        scanner.close();
    }

    public static List<List<Integer>> findThreeSum(int arr[]) {
        HashSet<List<Integer>> ans = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = i + 1; j < arr.length; j++) {
                int num = -(arr[i] + arr[j]);
                if (set.contains(num)) {
                    List<Integer> list = Arrays.asList(num, arr[i], arr[j]);
                    Collections.sort(list);
                    ans.add(list);
                }
                set.add(arr[j]);
            }
        }
        return new ArrayList<>(ans);
    }
}
