package One_Dimensional_Arrays.Hard.Maximum_Gap;

import java.util.Arrays;
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
        System.out.println("The maximum gap is: " + findMaxGap(arr));
        scanner.close();
    }

    public static int findMaxGap(int arr[]) {
        int n = arr.length;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (int num : arr) {
            min = Math.min(num, min);
            max = Math.max(num, max);
        }

        int gaps = n - 1;
        int bucketSize = (max - min) / gaps;
        int numBuckets = (max - min) / bucketSize + 1;

        int minBucket[] = new int[numBuckets];
        int maxBucket[] = new int[numBuckets];

        Arrays.fill(minBucket, Integer.MAX_VALUE);
        Arrays.fill(maxBucket, Integer.MIN_VALUE);

        for (int i = 0; i < n; i++) {
            int bucketIndex = (arr[i] - min) / bucketSize;
            minBucket[bucketIndex] = Math.min(minBucket[bucketIndex], arr[i]);
            maxBucket[bucketIndex] = Math.max(maxBucket[bucketIndex], arr[i]);
        }

        int maxGap = 0;
        int prevMax = min;

        for (int i = 0; i < n; i++) {
            if (minBucket[i] == Integer.MAX_VALUE) {
                continue;
            }

            maxGap = Math.max(maxGap, minBucket[i] - prevMax);
            prevMax = maxBucket[i];
        }

        return maxGap;
    }
}
