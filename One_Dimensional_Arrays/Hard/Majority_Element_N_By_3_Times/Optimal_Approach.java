package One_Dimensional_Arrays.Hard.Majority_Element_N_By_3_Times;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

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
        System.out.println("The majority elements are: " + findMajElements(arr));
        scanner.close();
    }

    public static List<Integer> findMajElements(int arr[]) {
        List<Integer> list = new ArrayList<>();
        int el1 = Integer.MIN_VALUE, el2 = Integer.MIN_VALUE, cnt1 = 0, cnt2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (cnt1 == 0 && el2 != arr[i]) {
                cnt1 = 1;
                el1 = arr[i];
            } else if (cnt2 == 0 && el1 != arr[i]) {
                cnt2 = 0;
                el2 = arr[i];
            } else if (arr[i] == el1) {
                cnt1++;
            } else if (arr[i] == el2) {
                cnt2++;
            } else {
                cnt1--;
                cnt2--;
            }
        }

        cnt1 = 0;
        cnt2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == el1)
                cnt1++;
            if (arr[i] == el2)
                cnt2++;
        }

        if (cnt1 > arr.length / 3)
            list.add(el1);
        if (cnt2 > arr.length / 3)
            list.add(el2);

        return list;
    }
}
