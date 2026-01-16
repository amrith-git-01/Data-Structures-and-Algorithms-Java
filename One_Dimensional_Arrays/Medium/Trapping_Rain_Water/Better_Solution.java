import java.util.Scanner;

public class Better_Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("The trapped rainwater is: " + findTrappingRainwater(arr));
        scanner.close();
    }

    public static int findTrappingRainwater(int arr[]) {
        int water = 0;
        int leftMax[] = new int[arr.length];
        int rightMax[] = new int[arr.length];
        leftMax[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], arr[i]);
        }
        rightMax[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], arr[i]);
        }

        for(int i = 0; i < arr.length; i++){
            water += Math.min(leftMax[i], rightMax[i]) - arr[i];
        }
        return water;
    }
}
