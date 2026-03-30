package BinarySearch.Medium.MinimumDivisor;

import java.util.Scanner;

public class Brute_Force {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the threshold: ");
        int threshold = scanner.nextInt();
        System.out.println("The smallest divisor is: " + findSmallestDivisor(arr, threshold));
        scanner.close();
    }

    public static int findSmallestDivisor(int arr[], int threshold) {
        int low = 1, high = 0;
        for (int num : arr) {
            high = Math.max(high, num);
        }
        int ans = high;
        for (int i = low; i <= high; i++) {
            if (canDivide(arr, threshold, i)) {
                ans = i;
                break;
            }
        }
        return ans;
    }

    public static boolean canDivide(int arr[], int threshold, int div) {
        int sum = 0;
        for (int num : arr) {
            sum += Math.ceil((double) num / div);
        }
        return sum <= threshold;
    }
}
