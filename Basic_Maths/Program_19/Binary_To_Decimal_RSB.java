package Basic_Maths.Program_19;

import java.util.Scanner;

public class Binary_To_Decimal_RSB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the binary string: ");
        String binary = scanner.nextLine();
        System.out.println("The decimal value of " + binary + " is: " + binaryToDecimal(binary));
        scanner.close();
    }

    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        for (int i = 0; i < binary.length(); i++) {
            char bit = binary.charAt(i);
            if (bit == '1') {
                decimal = decimal * 2 + 1;
            } else {
                decimal = decimal * 2;
            }
        }
        return decimal;
    }
}
