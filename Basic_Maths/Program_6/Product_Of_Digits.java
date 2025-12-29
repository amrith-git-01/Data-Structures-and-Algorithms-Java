package Basic_Maths.Program_6;

import java.util.Scanner;

public class Product_Of_Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int num = scanner.nextInt();
        System.out.println("The digit product of " + num + " is: " + product(num));
        scanner.close();
    }

    public static long product(int num) {
        long product = 1;
        while (num > 0) {
            product *= num % 10;
            num /= 10;
        }
        return product;
    }
}
