package Basic_Maths.Program_9.Perfect_Number;

import java.util.Scanner;

public class Optimal_Approach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int num = scanner.nextInt();
        System.out.println("Is the number pefect number?: " + checkPerfect(num));
        scanner.close();
    }

    public static boolean checkPerfect(int num) {
        int sum = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (num / i != num && num / i != i) {
                    sum += num / i;
                }
            }
        }
        return sum == num;
    }
}
