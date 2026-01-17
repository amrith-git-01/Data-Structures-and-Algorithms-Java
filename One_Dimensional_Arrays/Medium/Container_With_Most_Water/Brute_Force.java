package One_Dimensional_Arrays.Medium.Container_With_Most_Water;

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
        System.out.println("The container with most water is: " + findContainerWithMostWater(arr));
        scanner.close();
    }

    public static int findContainerWithMostWater(int arr[]) {
        int water = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                water = Math.max(water, Math.min(arr[i], arr[j]) * (j - i));
            }
        }
        return water;
    }
}
