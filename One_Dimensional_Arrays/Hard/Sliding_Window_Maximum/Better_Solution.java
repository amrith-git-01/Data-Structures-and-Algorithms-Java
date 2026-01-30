package One_Dimensional_Arrays.Hard.Sliding_Window_Maximum;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Better_Solution {
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
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);

        for (int i = 0; i < arr.length; i++) {
            pq.offer(new int[] { arr[i], i });

            if (i >= k - 1) {
                while (pq.peek()[1] <= i - k) {
                    pq.poll();
                }
                res[i - k + 1] = pq.peek()[0];
            }
        }
        return res;
    }
}
