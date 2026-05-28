package LinkedList.Hard.AllOneDS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AllOne allOne = new AllOne();
        while (true) {
            showMenu();
            System.out.println("Enter the choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter the key: ");
                    String key = scanner.nextLine();
                    allOne.inc(key);
                }
                case 2 -> {
                    System.out.println("Enter the key: ");
                    String key = scanner.nextLine();
                    allOne.dec(key);
                }
                case 3 -> {
                    System.out.println("The max key is: " + allOne.getMaxKey());
                }
                case 4 -> {
                    System.out.println("The max key is: " + allOne.getMinKey());
                }
                case 5 -> {
                    System.out.println("Exiting!!!");
                    scanner.close();
                    System.exit(0);
                }
                default -> {
                    System.out.println("Enter a Valid Option!");
                }
            }
        }
    }

    public static void showMenu() {
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("Menu: ");
        System.out.println("    1) Increment\n    2) Decrement\n    3) Get min key\n    4) Get max key\n    5) Exit");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }
}
