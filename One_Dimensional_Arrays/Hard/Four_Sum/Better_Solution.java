package One_Dimensional_Arrays.Hard.Four_Sum;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;

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
        System.out.println("Enter the target: ");
        int target = scanner.nextInt();
        System.out.println("The quadruples are: " + findFourSum(arr, target));
        scanner.close();
    }

    public static List<List<Integer>> findFourSum(int arr[], int target) {
        HashSet<List<Integer>> ans = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                HashSet<Integer> set = new HashSet<>();
                for (int k = j + 1; k < arr.length; k++) {
                    int fourth = -(arr[i] + arr[j] + arr[k]);
                    if (set.contains(fourth)) {
                        List<Integer> list = Arrays.asList(arr[i], arr[j], arr[k], fourth);
                        Collections.sort(list);
                        ans.add(list);
                    }
                    set.add(arr[k]);
                }
            }
        }
        return new ArrayList<>(ans);
    }
}
