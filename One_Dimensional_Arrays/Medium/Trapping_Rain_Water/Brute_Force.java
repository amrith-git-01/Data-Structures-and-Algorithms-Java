import java.util.Scanner;

public class Brute_Force {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = scanner.nextInt();
        System.out.println("Enter the array elements: ");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("The trapped rainwater is: " + findTrappingRainwater(arr));
        scanner.close();
    }

    public static int findTrappingRainwater(int arr[]) {
        int water = 0;
        for (int i = 0; i < arr.length; i++) {
            int leftHigh = 0;
            int rightHigh = 0;
            for (int j = 0; j < i; j++) {
                leftHigh = Math.max(arr[j], leftHigh);
            }
            for (int j = i + 1; j < arr.length; j++) {
                rightHigh = Math.max(arr[j], rightHigh);
            }

            int trapped = Math.min(leftHigh, rightHigh) - arr[i];
            water += Math.max(0, trapped);
        }
        return water;
    }
}