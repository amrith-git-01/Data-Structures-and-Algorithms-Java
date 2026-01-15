package One_Dimensional_Arrays.Medium.Equilibrium_Point;

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
        int point = findEquilibriumPoint(arr);
        if (point == -1) {
            System.out.println("No equilibrium point exists");
        } else {
            System.out.println("The equilibrium point is: " + point);
        }
        scanner.close();
    }

    public static int findEquilibriumPoint(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int leftSum = 0, rightSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }
            for (int j = i + 1; j < arr.length; j++) {
                rightSum += arr[j];
            }
            if (leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }
}
