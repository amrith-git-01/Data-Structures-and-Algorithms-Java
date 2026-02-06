package One_Dimensional_Arrays.Hard.Majority_Element_N_By_3_Times;

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
        System.out.println("The majority elements are: " + findMajElements(arr));
        scanner.close();
    }

    public static List<Integer> findMajElements(int arr[]) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count > arr.length / 3 && !list.contains(arr[i])) {
                list.add(arr[i]);
            }
        }
        return list;
    }
}
