package Basic_Maths.Program_7.Check_Prime;

import java.util.Scanner;

public class Better_Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int num = scanner.nextInt();
        if (checkPrime(num)) {
            System.out.println("The number " + num + " is prime");
        } else {
            System.out.println("The number " + num + " is composite");
        }
        scanner.close();
    }

    public static boolean checkPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
