package Basic_Maths.Program_20.Decimal_To_Binary;

import java.util.Scanner;

public class Brute_Force {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the decimal: ");
        int decimal = scanner.nextInt();
        System.out.println("The binary value of " + decimal + " is: " + decimalToBinary(decimal));
        scanner.close();
    }

    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }
        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            int rem = decimal % 2;
            binary.append(rem);
            decimal /= 2;
        }

        return binary.reverse().toString();
    }
}
