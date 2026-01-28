package One_Dimensional_Arrays.Hard.First_Missing_Positive;

import java.util.HashSet;
import java.util.Scanner;

public class Better_Solution_HashSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Etner the size: ");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("The first missing positive is: " + firstMissingPositive(arr));
        scanner.close();
    }

    public static int firstMissingPositive(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        int missing = 0;
        for (int num : arr) {
            if (num > 0) {
                set.add(num);
            }
        }

        for (int i = 1; i <= arr.length + 1; i++) {
            if (!set.contains(i)) {
                missing = i;
                break;
            }
        }
        return missing;
    }
}
