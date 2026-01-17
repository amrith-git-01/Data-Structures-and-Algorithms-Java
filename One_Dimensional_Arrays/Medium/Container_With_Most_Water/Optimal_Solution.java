package One_Dimensional_Arrays.Medium.Container_With_Most_Water;

import java.util.Scanner;

public class Optimal_Solution {
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
        int left = 0, right = arr.length - 1;
        int water = 0;
        while (left < right) {
            water = Math.max(water, Math.min(arr[left], arr[right]) * (right - left));
            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }
        return water;
    }
}
