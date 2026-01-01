package Basic_Maths.Program_13.Factorial;

import java.util.Scanner;

public class Iterative_Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int num = scanner.nextInt();
        System.out.println("The factorial of " + num + " is: " + fact(num));
        scanner.close();
    }

    public static int fact(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        int res = 1;
        while (num > 0) {
            res *= num;
            num--;
        }
        return res;
    }
}
