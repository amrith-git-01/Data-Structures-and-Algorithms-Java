package Basic_Maths.Program_22.Count_Set_Bits;

import java.util.Scanner;

public class Optimal_Approach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        System.out.println("The number of set bits in " + num + " is: " + countSetBits(num));
        scanner.close();
    }

    public static int countSetBits(int num) {
        int count = 0;
        while (num > 0) {
            num = num & (num - 1);
            count++;
        }
        return count;
    }
}
