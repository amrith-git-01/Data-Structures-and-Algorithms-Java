package Basic_Maths.Program_11.LCM;

import java.util.Scanner;

public class Better_Solution {
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
        return (num1 * num2) / gcd(num1, num2);
    }

    public static int gcd(int num1, int num2) {
        int num = num1 > num2 ? num2 : num1;
        while (num > 1) {
            if (num1 % num == 0 && num2 % num == 0) {
                return num;
            }
            num--;
        }
        return 1;
    }
}
