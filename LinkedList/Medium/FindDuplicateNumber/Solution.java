import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = scanner.nextInt();
        int arr[] = new int[size + 1];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < size + 1; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("The dup number is: " + findDup(arr));
        scanner.close();
    }

    public static int findDup(int arr[]) {
        int slow = arr[0], fast = arr[0];

        do {
            slow = arr[slow];
            fast = arr[arr[fast]];
        } while (slow != fast);

        int ptr = arr[0];
        while (ptr != slow) {
            ptr = arr[ptr];
            slow = arr[slow];
        }

        return ptr;
    }
}
