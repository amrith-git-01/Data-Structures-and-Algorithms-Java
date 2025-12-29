package Basic_Maths.Program_4;

import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int num = scanner.nextInt();
        System.out.println("The number is a armstrong number?: " + checkArmstrong(num));
        scanner.close();
    }

    public static boolean checkArmstrong(int num) {
        int n = num;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit * digit;
            n /= 10;
        }
        return sum == num;
    }
}
