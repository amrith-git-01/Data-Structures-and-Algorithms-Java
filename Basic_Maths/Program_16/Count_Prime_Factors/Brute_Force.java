package Basic_Maths.Program_16.Count_Prime_Factors;

import java.util.Scanner;

public class Brute_Force {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        System.out.println("The number of prime factors of " + num + " is: " + countPrimeFactors(num));
        scanner.close();
    }

    public static int countPrimeFactors(int num) {
        if (num <= 1) {
            return 0;
        }
        int count = 0;
        for (int i = 2; i <= num; i++) {
            if (num % i == 0 && isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2 || num == 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
