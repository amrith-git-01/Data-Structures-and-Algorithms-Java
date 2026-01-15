package One_Dimensional_Arrays.Medium.Equilibrium_Point;

import java.util.Scanner;

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
        int point = findEquilibriumPoint(arr);
        if (point == -1) {
            System.out.println("No equilibrium point exists");
        } else {
            System.out.println("The equilibrium point is: " + point);
        }
        scanner.close();
    }

    public static int findEquilibriumPoint(int arr[]) {
        int totalSum = 0, sum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        for (int i = 0; i < arr.length; i++) {
            int rightSum = totalSum - sum - arr[i];
            if (sum == rightSum) {
                return i;
            }
            sum += arr[i];
        }
        return -1;
    }
}
