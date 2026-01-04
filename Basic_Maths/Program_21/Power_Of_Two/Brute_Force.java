package Basic_Maths.Program_21.Power_Of_Two;

import java.util.Scanner;

public class Brute_Force {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        System.out.println("Is the number " + num + " a power of two?: " + isPowerOfTwo(num));
        scanner.close();
    }

    public static boolean isPowerOfTwo(int num) {
        if (num <= 0) {
            return false;
        }
        if (num == 1) {
            return true;
        }
        while (num > 1) {
            if (num % 2 != 0) {
                return false;
            }
            num /= 2;
        }
        return true;
    }
}
