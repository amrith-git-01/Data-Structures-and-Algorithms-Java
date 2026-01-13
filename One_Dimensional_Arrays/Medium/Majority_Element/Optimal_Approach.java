package One_Dimensional_Arrays.Medium.Majority_Element;

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
        int res = findMajorityElement(arr);
        if (res == -1) {
            System.out.println("No majority element");
        } else {
            System.out.println("The majority element is: " + res);
        }
        scanner.close();
    }

    public static int findMajorityElement(int arr[]) {
        int candidate = arr[0], count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == candidate) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    candidate = arr[i];
                    count++;
                }
            }
        }
        return candidate;
    }
}
