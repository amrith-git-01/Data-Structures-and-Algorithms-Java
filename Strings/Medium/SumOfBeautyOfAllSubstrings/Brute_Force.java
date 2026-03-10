package Strings.Medium.SumOfBeautyOfAllSubstrings;

import java.util.HashMap;
import java.util.Scanner;

public class Brute_Force {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = scanner.next();
        System.out.println("The sum is: " + sum(str));
        scanner.close();
    }

    public static int sum(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                sum += findSum(str, i, j);
            }
        }
        return sum;
    }

    public static int findSum(String str, int left, int right) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = left; i <= right; i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }
        for (char key : map.keySet()) {
            max = Math.max(max, map.get(key));
            min = Math.min(min, map.get(key));
        }
        return max - min;
    }
}
