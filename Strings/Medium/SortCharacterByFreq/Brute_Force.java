package Strings.Medium.SortCharacterByFreq;

import java.util.Arrays;
import java.util.Scanner;

public class Brute_Force {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = scanner.next();
        System.out.println("The sorted freq string is: " + sortCharsByFreq(str));
        scanner.close();
    }

    public static String sortCharsByFreq(String str) {
        int hash[] = new int[256];
        for (int i = 0; i < str.length(); i++) {
            hash[str.charAt(i)]++;
        }
        Character[] arr = new Character[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }

        Arrays.sort(arr, (a, b) -> hash[b] - hash[a]);

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            res.append(arr[i]);
        }
        return res.toString();
    }
}
