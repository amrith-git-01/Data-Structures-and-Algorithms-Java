package One_Dimensional_Arrays.Hard.Three_Sum;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

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
        System.out.println("The triplets are: " + findThreeSum(arr));
        scanner.close();
    }

    public static List<List<Integer>> findThreeSum(int arr[]) {
        HashSet<List<Integer>> ans = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                List<Integer> list = new ArrayList<>();
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        list = Arrays.asList(arr[i], arr[j], arr[k]);
                        Collections.sort(list);
                        ans.add(list);
                    }
                }
            }
        }
        return new ArrayList<>(ans);
    }
}
