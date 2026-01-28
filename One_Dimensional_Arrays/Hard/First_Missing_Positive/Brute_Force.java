package One_Dimensional_Arrays.Hard.First_Missing_Positive;

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
        System.out.println("The first missing positive number is: " + firstMissingPositive(arr));
        scanner.close();
    }

    public static int firstMissingPositive(int arr[]) {
        for (int i = 1; i <= arr.length + 1; i++) {
            boolean found = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    found = true;
                }
            }
            if (!found) {
                return i;
            }
        }
        return -1;
    }
}
