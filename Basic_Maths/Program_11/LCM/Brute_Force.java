package Basic_Maths.Program_11.LCM;

import java.util.Scanner;

public class Brute_Force {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm(num1, num2));
        scanner.close();
    }

    public static int lcm(int num1, int num2) {
        int max = num1 > num2 ? num1 : num2;
        int lcm = max;
        while (true) {
            if (lcm % num1 == 0 && lcm % num2 == 0) {
                return lcm;
            }
            lcm += max;
        }
    }
}
