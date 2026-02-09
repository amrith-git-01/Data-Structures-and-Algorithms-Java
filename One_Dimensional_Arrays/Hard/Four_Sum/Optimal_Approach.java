package One_Dimensional_Arrays.Hard.Four_Sum;

import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;

public class Optimal_Approach {
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
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < arr.length; j++) {
                if (j > i + 1 && arr[j] == arr[j - 1]) {
                    continue;
                }

                int left = j + 1, right = arr.length - 1;
                while (left < right) {
                    int sum = arr[left] + arr[right] + arr[i] + arr[j];
                    if (sum == target) {
                        List<Integer> list = Arrays.asList(arr[i], arr[j], arr[left], arr[right]);
                        ans.add(list);
                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return new ArrayList<>(ans);
    }
}
