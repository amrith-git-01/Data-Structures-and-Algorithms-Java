package LinkedList.Implementations.SinglyLinkedList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SinglyLinkedList list = new SinglyLinkedList();

        while (true) {
            showMenu();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Value: ");
                    list.addAtHead(scanner.nextInt());
                }
                case 2 -> {
                    System.out.print("Value: ");
                    list.addAtTail(scanner.nextInt());
                }
                case 3 -> {
                    System.out.print("Index: ");
                    int i = scanner.nextInt();
                    System.out.print("Value: ");
                    list.addAtIndex(i, scanner.nextInt());
                }
                case 4 -> list.deleteAtHead();
                case 5 -> list.deleteAtTail();
                case 6 -> {
                    System.out.print("Index: ");
                    list.deleteAtIndex(scanner.nextInt());
                }
                case 7 -> {
                    System.out.print("Index: ");
                    System.out.println("Element: " + list.get(scanner.nextInt()));
                }
                case 8 -> {
                    System.out.print("Value: ");
                    System.out.println(list.search(scanner.nextInt()) ? "Found!" : "Not found!");
                }
                case 9 -> System.out.println("Length: " + list.length());
                case 10 -> System.out.println(list.isEmpty() ? "Empty!" : "Not empty!");
                case 11 -> System.out.println("Middle: " + list.middle());
                case 12 -> {
                    list.reverse();
                    System.out.println(list);
                }
                case 13 -> {
                    list.sort();
                    System.out.println(list);
                }
                case 14 -> System.out.println(list);
                case 15 -> {
                    scanner.close();
                    System.exit(0);
                }
                default -> System.out.println("Invalid option!");
            }
        }
    }

    public static void showMenu() {
        System.out.println("""
                1) Insert at head    2) Insert at tail    3) Insert at index
                4) Delete at head    5) Delete at tail    6) Delete at index
                7) Get element       8) Search            9) Length
                10) Is empty         11) Middle           12) Reverse
                13) Sort             14) Print            15) Exit
                """);
    }
}