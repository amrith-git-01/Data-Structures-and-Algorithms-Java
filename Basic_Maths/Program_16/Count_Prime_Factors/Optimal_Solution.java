package Basic_Maths.Program_16.Count_Prime_Factors;

import java.util.Scanner;

public class Optimal_Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        System.out.println("The number of prime factors for " + num + " is: " + countPrimeFactors(num));
        scanner.close();
    }

    public static int countPrimeFactors(int num) {
        if (num <= 1) {
            return 0;
        }
        int count = 0;
        if (num % 2 == 0) {
            count++;
            while (num % 2 == 0) {
                num /= 2;
            }
        }
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                count++;
                while (num % i == 0) {
                    num /= i;
                }
            }
        }
        if (num > 2) {
            count++;
        }
        return count;
    }
}
