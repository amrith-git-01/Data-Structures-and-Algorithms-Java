package One_Dimensional_Arrays.Hard.Find_Missing_Repeating_Number;

import java.util.Scanner;

public class Better_Solution {
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
        int hash[] = new int[arr.length + 1];
        int res[] = new int[2];
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }

        for (int i = 1; i <= arr.length; i++) {
            if (hash[i] == 0) {
                res[0] = i;
            }
            if (hash[i] == 2) {
                res[1] = i;
            }
        }
        return res;
    }
}
