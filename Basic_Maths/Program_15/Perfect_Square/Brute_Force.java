package Basic_Maths.Program_15.Perfect_Square;

import java.util.Scanner;

public class Brute_Force {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int num = scanner.nextInt();
        System.out.println("Is the number perfect square?: " + findPerfectSquare(num));
        scanner.close();
    }

    public static boolean findPerfectSquare(int num) {
        if (num == 0 || num == 1) {
            return true;
        }
        for (int i = 0; i <= num; i++) {
            if (i * i == num) {
                return true;
            }
            if (i * i > num) {
                return false;
            }
        }
        return false;
    }
}
