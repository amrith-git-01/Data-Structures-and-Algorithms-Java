package One_Dimensional_Arrays.Hard.Kth_Largest_Element;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Optimal_Solution {
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
        System.out.println("The kth largest elements is: " + findKthLargestElement(arr, k));
        scanner.close();
    }

    public static int findKthLargestElement(int arr[], int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < arr.length; i++){
            pq.offer(arr[i]);
            if(pq.size() > k){
                pq.poll();
            }
        }
        return pq.peek();
    }
}
