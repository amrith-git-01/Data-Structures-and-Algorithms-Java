package Basic_Maths.Program_8.Print_Divisors;

import java.util.Scanner;

public class Better_Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int num = scanner.nextInt();
        System.out.println("The divisors are: ");
        printDivisors(num);
        scanner.close();
    }

    public static void printDivisors(int num) {
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
                if (num / i != i) {
                    System.out.print(num / i + " ");
                }
            }
        }
    }
}
