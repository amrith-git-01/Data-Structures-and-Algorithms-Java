package One_Dimensional_Arrays.Hard.Sliding_Window_Maximum;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
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
        System.out.println("Enter the k: ");
        int k = scanner.nextInt();
        int res[] = findSlidingWindowMax(arr, k);
        System.out.println("The resultant array is: ");
        System.out.println(Arrays.toString(res));
        scanner.close();
    }

    public static int[] findSlidingWindowMax(int arr[], int k) {
        int res[] = new int[arr.length - k + 1];
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i < arr.length; i++) {
            if (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
                dq.pollLast();
            }
            dq.offerLast(i);

            if (dq.peekFirst() == i - k) {
                dq.pollFirst();
            }

            if (i >= k - 1) {
                res[i - k + 1] = arr[dq.peekFirst()];
            }
        }
        return res;
    }
}
