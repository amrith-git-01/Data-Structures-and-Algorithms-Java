package One_Dimensional_Arrays.Easy.Union_Of_Two_Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size1: ");
        int size1 = scanner.nextInt();
        System.out.println("Enter the size2: ");
        int size2 = scanner.nextInt();
        int arr1[] = new int[size1];
        int arr2[] = new int[size2];
        System.out.println("Enter the array 1 elements: ");
        for (int i = 0; i < size1; i++) {
            arr1[i] = scanner.nextInt();
        }
        System.out.println("Enter the array 2 elements: ");
        for (int i = 0; i < size2; i++) {
            arr2[i] = scanner.nextInt();
        }
        System.out.println("The union of the arrays is: " + findUnion(arr1, arr2));
        scanner.close();
    }

    public static List<Integer> findUnion(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }
        return new ArrayList<>(set);
    }
}
