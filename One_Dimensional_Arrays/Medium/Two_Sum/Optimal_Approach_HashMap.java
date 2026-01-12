package One_Dimensional_Arrays.Medium.Two_Sum;

import java.util.HashMap;
import java.util.Scanner;

public class Optimal_Approach_HashMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the target: ");
        int sum = scanner.nextInt();
        int res[] = twoSum(arr, sum);
        if (res[0] == -1) {
            System.out.println("The target sum do not exists");
        } else {
            System.out.println("The numbers' indices are: " + res[0] + " " + res[1]);
        }
        scanner.close();
    }

    public static int[] twoSum(int arr[], int sum) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(sum - arr[i])) {
                return new int[] { map.get(sum - arr[i]), i };
            } else {
                map.put(arr[i], i);
            }
        }
        return new int[] { -1, -1 };
    }
}
