package BinarySearch.Easy.ValidPerfectSquare;

import java.util.Scanner;

public class Optimal_Approach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the x: ");
        int x = scanner.nextInt();
        System.out.println("Is this a perfect square?: " + findPerfectSquare(x));
        scanner.close();
    }

    public static boolean findPerfectSquare(int x) {
        int low = 1, high = x;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if(mid * mid == x){
                return true;
            }
            else if(mid * mid < x){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return false;
    }
}
