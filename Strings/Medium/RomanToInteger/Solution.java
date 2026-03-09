import java.util.HashMap;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the romans: ");
        String roman = scanner.next();
        System.out.println("The Integer conversion is: " + romanToInteger(roman));
        scanner.close();
    }

    public static int romanToInteger(String roman) {
        int res = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for (int i = 0; i < roman.length(); i++) {
            int cur = map.get(roman.charAt(i));
            int next = (i + 1 < roman.length()) ? map.get(roman.charAt(i + 1)) : 0;
            if (cur < next) {
                res -= cur;
            } else {
                res += cur;
            }
        }
        return res;
    }
}
