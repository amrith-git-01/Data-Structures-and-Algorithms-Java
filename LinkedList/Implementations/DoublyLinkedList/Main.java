package LinkedList.Implementations.DoublyLinkedList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoublyLinkedList list = new DoublyLinkedList();

        while (true) {
            showMenu();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Value: ");
                    list.insertAtHead(scanner.nextInt());
                    System.out.println("Inserted!");
                }
                case 2 -> {
                    System.out.print("Value: ");
                    list.insertAtTail(scanner.nextInt());
                    System.out.println("Inserted!");
                }
                case 3 -> {
                    System.out.print("Value: ");
                    int v = scanner.nextInt();
                    System.out.print("Index: ");
                    list.insertAtIndex(v, scanner.nextInt());
                    System.out.println("Inserted!");
                }
                case 4 -> list.deleteAtHead();
                case 5 -> list.deleteAtTail();
                case 6 -> {
                    System.out.print("Index: ");
                    list.deleteAtIndex(scanner.nextInt());
                }
                case 7 -> {
                    System.out.print("Index: ");
                    int res = list.getElement(scanner.nextInt());
                    System.out.println(res == -1 ? "Out of bounds!" : "Element: " + res);
                }
                case 8 -> {
                    System.out.print("Value: ");
                    System.out.println(list.searchElement(scanner.nextInt()) ? "Found!" : "Not found!");
                }
                case 9 -> System.out.println("Length: " + list.size());
                case 10 -> System.out.println(list.isEmpty() ? "Empty!" : "Not empty!");
                case 11 -> {
                    int mid = list.findMiddle();
                    System.out.println(mid == -1 ? "List is empty!" : "Middle: " + mid);
                }
                case 12 -> {
                    list.reverse();
                    System.out.println(list);
                }
                case 13 -> System.out.println("Sort not yet implemented!");
                case 14 -> System.out.println(list);
                case 15 -> {
                    System.out.println("Exiting...");
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