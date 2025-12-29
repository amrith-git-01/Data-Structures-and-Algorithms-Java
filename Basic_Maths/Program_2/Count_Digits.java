package Basic_Maths.Program_2;

import java.util.Scanner;

public class Count_Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        System.out.println("The number of digits are: " + numDigits(num));
        scanner.close();
    }

    public static int numDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }
}
