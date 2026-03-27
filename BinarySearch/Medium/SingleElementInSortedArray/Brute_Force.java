package BinarySearch.Medium.SingleElementInSortedArray;

import java.util.HashMap;
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
        System.out.println("The single element is: " + findSingleElement(arr));
        scanner.close();
    }

    public static int findSingleElement(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int el = -1;
        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                el = key;
            }
        }
        return el;
    }
}
