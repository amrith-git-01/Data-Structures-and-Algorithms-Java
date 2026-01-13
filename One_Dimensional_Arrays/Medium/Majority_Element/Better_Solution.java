package One_Dimensional_Arrays.Medium.Majority_Element;

import java.util.HashMap;
import java.util.Scanner;

public class Better_Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = scanner.nextInt();
        System.out.println("Enter the array elements: ");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        int res = findMajorityElement(arr);
        if (res == -1) {
            System.out.println("No majority element");
        } else {
            System.out.println("The majority element is: " + res);
        }
        scanner.close();
    }

    public static int findMajorityElement(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            if (map.get(arr[i]) > arr.length / 2) {
                return arr[i];
            }
        }
        return -1;
    }
}
