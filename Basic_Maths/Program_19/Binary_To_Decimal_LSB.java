package Basic_Maths.Program_19;

import java.util.Scanner;

public class Binary_To_Decimal_LSB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the binary string: ");
        String binary = scanner.nextLine();
        System.out.println("The decimal value of " + binary + " is: " + binaryToDecimal(binary));
        scanner.close();
    }

    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 1;
        for (int i = binary.length() - 1; i >= 0; i--) {
            char bit = binary.charAt(i);
            if (bit == '1') {
                decimal += power;
            }
            power *= 2;
        }
        return decimal;
    }
}
