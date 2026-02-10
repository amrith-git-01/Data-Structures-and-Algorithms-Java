package One_Dimensional_Arrays.Hard.Find_Missing_Repeating_Number;

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
        int res[] = findMissingRepatingElement(arr);
        System.out.println("The missing and repeating element are: " + res[0] + " and " + res[1] + " respectively");
        scanner.close();
    }

    public static int[] findMissingRepatingElement(int arr[]) {
        int missing = -1, repeating = -1;
        for (int i = 1; i <= arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    count++;
                }
            }
            if (count == 0)
                missing = i;
            if (count == 2)
                repeating = i;

            if (missing != -1 && repeating != -1) {
                break;
            }
        }
        return new int[] { missing, repeating };
    }
}
