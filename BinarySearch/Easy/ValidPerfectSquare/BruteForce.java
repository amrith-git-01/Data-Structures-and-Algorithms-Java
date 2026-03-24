package BinarySearch.Easy.ValidPerfectSquare;

import java.util.Scanner;

public class BruteForce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the x: ");
        int x = scanner.nextInt();
        System.out.println("Is this a perfect square?: " + findPerfectSquare(x));
        scanner.close();
    }

    public static boolean findPerfectSquare(int x) {
        for (int i = 1; i * i <= x; i++) {
            if (i * i == x) {
                return true;
            }
        }
        return false;
    }
}
