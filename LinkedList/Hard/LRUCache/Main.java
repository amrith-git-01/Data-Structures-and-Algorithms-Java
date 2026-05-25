package LinkedList.Hard.LRUCache;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the capacity: ");
        int capacity = scanner.nextInt();
        LRUCache lru = new LRUCache(capacity);
        while (true) {
            showMenu();
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter the key: ");
                    int key = scanner.nextInt();
                    System.out.println("Enter the value: ");
                    int val = scanner.nextInt();
                    lru.put(key, val);
                }
                case 2 -> {
                    System.out.println("Enter the key: ");
                    int key = scanner.nextInt();
                    int res = lru.get(key);
                    if (res == -1) {
                        System.out.println("The key does not exists!");
                    } else {
                        System.out.println("The value is: " + res);
                    }
                }
                case 3 -> {
                    System.out.println("Exiting...");
                    scanner.close();
                    break;
                }
            }
        }
    }

    public static void showMenu() {
        System.out.println(
                """
                        1) Put
                        2) Get
                        3) Exit
                            """);
    }
}
