package Basic_Maths.Program_17.Print_Primes_Upto_N;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Brute_Force {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n: ");
        int n = scanner.nextInt();
        System.out.println("The primes are: ");
        List<Integer> primes = findPrimes(n);
        System.out.println(primes);
        scanner.close();
    }

    public static List<Integer> findPrimes(int n) {
        List<Integer> prime = new ArrayList<>();
        if (n <= 1) {
            return prime;
        }
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                prime.add(i);
            }
        }
        return prime;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
