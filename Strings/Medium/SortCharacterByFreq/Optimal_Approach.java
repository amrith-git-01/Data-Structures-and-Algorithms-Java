package Strings.Medium.SortCharacterByFreq;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Optimal_Approach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = scanner.next();
        System.out.println("The character sorted string is: " + sortCharsByFreq(str));
        scanner.close();
    }

    public static String sortCharsByFreq(String str) {
        StringBuilder sb = new StringBuilder();
        int hash[] = new int[256];
        for (int i = 0; i < str.length(); i++) {
            hash[str.charAt(i)]++;
        }

        List<List<Character>> buckets = new ArrayList<>();
        for (int i = 0; i <= str.length(); i++) {
            buckets.add(new ArrayList<>());
        }

        for (int i = 0; i < 256; i++) {
            if (hash[i] > 0) {
                buckets.get(hash[i]).add((char) i);
            }
        }

        for (int i = str.length(); i >= 1; i--) {
            for (char ch : buckets.get(i)) {
                for (int j = 0; j < i; j++) {
                    sb.append(ch);
                }
            }
        }

        return sb.toString();
    }
}
