package Basic_Maths.Program_8.Print_Divisors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Optimal_Approach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int num = scanner.nextInt();
        System.out.println("The divisors are: ");
        printDivisors(num);
        scanner.close();
    }

    public static void printDivisors(int num) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                list.add(i);
                if (num / i != i) {
                    list.add(num / i);
                }
            }
        }
        Collections.sort(list);
        System.out.println(list);
    }
}
