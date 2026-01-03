package Basic_Maths.Program_17.Print_Primes_Upto_N;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Optimal_Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n: ");
        int n = scanner.nextInt();
        List<Integer> primes = findPrimes(n);
        System.out.println("The primes are: ");
        System.out.println(primes);
        scanner.close();
    }

    public static List<Integer> findPrimes(int n) {
        List<Integer> primes = new ArrayList<>();
        if (n <= 1) {
            return primes;
        }
        boolean composite[] = new boolean[n + 1];
        composite[0] = true;
        composite[1] = true;

        for (int i = 2; i * i <= n; i++) {
            if (composite[i] == false) {
                for (int j = i * i; j <= n; j += i) {
                    composite[j] = true;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (composite[i] == false) {
                primes.add(i);
            }
        }

        return primes;
    }
}
