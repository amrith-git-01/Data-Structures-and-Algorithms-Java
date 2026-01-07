package One_Dimensional_Arrays.Easy.Array_Leaders;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Optimal_Approach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = scanner.nextInt();
        System.out.println("Enter the array elements: ");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Leaders in the array are: " + findLeaders(arr));
        scanner.close();
    }

    public static List<Integer> findLeaders(int arr[]) {
        List<Integer> leaders = new ArrayList<>();
        int max = arr[arr.length - 1];
        leaders.add(max);

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                leaders.add(0, max);
            }
        }
        return leaders;
    }
}
