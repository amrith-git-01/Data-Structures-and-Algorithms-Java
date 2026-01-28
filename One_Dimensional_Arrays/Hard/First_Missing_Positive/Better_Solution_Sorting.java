package One_Dimensional_Arrays.Hard.First_Missing_Positive;

import java.util.Arrays;
import java.util.Scanner;

public class Better_Solution_Sorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("The first missiong positive number is: " + firstMissingPositive(arr));
        scanner.close();
    }

    public static int firstMissingPositive(int arr[]) {
        Arrays.sort(arr);
        int expected = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 0) {
                continue;
            }
            if (arr[i] == expected) {
                expected++;
            } else {
                break;
            }
        }
        return expected;
    }
}
