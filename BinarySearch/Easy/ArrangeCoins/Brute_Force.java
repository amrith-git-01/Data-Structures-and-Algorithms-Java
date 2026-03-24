package BinarySearch.Easy.ArrangeCoins;

import java.util.Scanner;

public class Brute_Force {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n: ");
        int n = scanner.nextInt();
        System.out.println("The max number of complete rows is: " + findRows(n));
        scanner.close();
    }

    public static int findRows(int n) {
        int k = 1;
        while (n > 0) {
            n -= k;
            if (n > 0) {
                k++;
            }
        }
        return n < 0 ? k - 1 : k;
    }
}
