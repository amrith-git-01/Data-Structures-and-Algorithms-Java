package Basic_Maths.Program_20.Decimal_To_Binary;

import java.util.Scanner;

public class Optimal_Approach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the decimal: ");
        int dec = scanner.nextInt();
        System.out.println("The binary value of " + dec + " is: " + decimalToBinary(dec));
        scanner.close();
    }

    public static String decimalToBinary(int dec) {
        if (dec == 0) {
            return "0";
        }
        StringBuilder binary = new StringBuilder();
        int highestBit = 31 - Integer.numberOfLeadingZeros(dec);

        for (int i = highestBit; i >= 0; i--) {
            int bit = (dec >> i) & 1;
            binary.append(bit);
        }
        return binary.toString();
    }
}
