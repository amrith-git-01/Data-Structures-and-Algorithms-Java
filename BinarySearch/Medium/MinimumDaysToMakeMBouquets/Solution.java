package BinarySearch.Medium.MinimumDaysToMakeMBouquets;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = scanner.nextInt();
        int bloomDay[] = new int[size];
        System.out.println("Enter the days: ");
        for (int i = 0; i < size; i++) {
            bloomDay[i] = scanner.nextInt();
        }
        System.out.println("Enter the m: ");
        int m = scanner.nextInt();
        System.out.println("Enter the k: ");
        int k = scanner.nextInt();
        int res = findResult(bloomDay, m, k);
        if (res == -1) {
            System.out.println("Not possible to construct bouquets");
        } else {
            System.out.println("Possible to construct bouquets in: " + res);
        }
        scanner.close();
    }

    public static int findResult(int bloomDay[], int m, int k) {
        if (m * k > bloomDay.length) {
            return -1;
        }
        int low = 0, high = 0;
        for (int day : bloomDay) {
            low = Math.min(low, day);
            high = Math.max(high, day);
        }

        int ans = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canContruct(bloomDay, m, k, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static boolean canContruct(int bloomDay[], int m, int k, int day) {
        int count = 0;
        int bouquet = 0;
        for (int num : bloomDay) {
            if (num <= day) {
                count++;
            } else {
                count = 0;
            }
            if (count == k) {
                bouquet++;
                count = 0;
            }
        }
        return bouquet >= m;
    }
}
