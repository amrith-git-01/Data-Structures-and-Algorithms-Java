package Basic_Maths.Program_15.Perfect_Square;

import java.util.Scanner;

public class Optimal_Approach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        System.out.println("Is the number a perfect square?: " + findPerfectSquare(num));
        scanner.close();
    }

    public static boolean findPerfectSquare(int num) {
        if (num <= 1) {
            return true;
        }
        int left = 1, right = num;
        while (left <= right) {
            int mid = (left + right) / 2;
            int square = mid * mid;
            if (square == num) {
                return true;
            } else if (square < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
