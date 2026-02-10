package One_Dimensional_Arrays.Hard.Find_Missing_Repeating_Number;

import java.util.Scanner;

public class Optimal_Approach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        int res[] = findMissingRepeatingElement(arr);
        System.out.println("The missing and repeating element are: " + res[0] + " and " + res[1] + " respectively");
        scanner.close();
    }

    private static int[] findMissingRepeatingElement(int[] arr) {
        int n = arr.length;
        int sum1 = (n * (n + 1)) / 2;
        int sqr1 = (n * (n + 1) * (2 * n + 1)) / 6;
        int sum2 = 0;
        int sqr2 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum2 += arr[i];
            sqr2 += (arr[i] * arr[i]);
        }
        int val1 = sum1 - sum2;
        int val2 = sqr1 - sqr2;
        int repeating = ((val2 / val1) + val1) / 2;
        int missing = ((val2 / val1) - val1) / 2;
        return new int[] { missing, repeating };
    }
}
