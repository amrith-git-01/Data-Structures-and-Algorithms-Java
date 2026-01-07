package One_Dimensional_Arrays.Easy.Array_Leaders;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Brute_Force {
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
        for (int i = 0; i < arr.length; i++) {
            boolean isLeader = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] <= arr[j]) {
                    isLeader = false;
                    break;
                }
            }
            if (isLeader) {
                leaders.add(arr[i]);
            }
        }
        return leaders;
    }
}
