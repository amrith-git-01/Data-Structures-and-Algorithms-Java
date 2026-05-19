package LinkedList.Implementations.CircularLinkedList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CircularLinkedList list = new CircularLinkedList();
        while (true) {
            showMenu();
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter the value: ");
                    int val = scanner.nextInt();
                    list.insertAtHead(val);
                    System.out.println("Element inserted successfully!");
                }
                case 2 -> {
                    System.out.println("Enter the value: ");
                    int val = scanner.nextInt();
                    list.insertAtTail(val);
                    System.out.println("Element inserted successfully!");
                }
                case 3 -> {
                    System.out.println("Enter the value: ");
                    int val = scanner.nextInt();
                    System.out.println("Enter the index: ");
                    int index = scanner.nextInt();
                    int res = list.insertAtIndex(val, index);
                    if (res == -1) {
                        System.out.println("Index out of bounds!");
                    } else {
                        System.out.println("Element inserted successfully!");
                    }
                }
                case 4 -> {
                    int res = list.deleteAtHead();
                    if (res == -1) {
                        System.out.println("Linkedlist is empty!");
                    } else {
                        System.out.println("Element deleted successfully!");
                    }
                }
                case 5 -> {
                    int res = list.deleteAtTail();
                    if (res == -1) {
                        System.out.println("Linkedlist is empty!");
                    } else {
                        System.out.println("Element deleted successfully!");
                    }
                }
                case 6 -> {
                    System.out.println("Enter the index: ");
                    int index = scanner.nextInt();
                    int res = list.deleteAtIndex(index);
                    if (res == -1) {
                        System.out.println("Linkedlist is empty!");
                    } else if (res == -2) {
                        System.out.println("Index is out of bounds!");
                    } else {
                        System.out.println("Element deleted successfully!");
                    }
                }
                case 7 -> {
                    System.out.println("Enter the index: ");
                    int index = scanner.nextInt();
                    int res = list.getElement(index);
                    if (res == -1) {
                        System.out.println("Linkedlist is empty!");
                    } else if (res == -2) {
                        System.out.println("Index is out of bounds!");
                    } else {
                        System.out.println("The element is: " + res);
                    }
                }
                case 8 -> {
                    System.out.println("Enter the element: ");
                    int el = scanner.nextInt();
                    boolean res = list.searchElement(el);
                    if (res) {
                        System.out.println("Element is present!");
                    } else {
                        System.out.println("Element is not present!");
                    }
                }
                case 9 -> {
                    System.out.println("The length is the linkedlist is: " + list.size());
                }
                case 10 -> {
                    System.out.println(list.isEmpty() ? "The linkedlist is empty!" : "The linkedlist is not empty!");
                }
                case 11 -> {
                    int res = list.findMiddle();
                    if (res == -1) {
                        System.out.println("Linkedlist is empty!");
                    } else {
                        System.out.println("The middle element is: " + res);
                    }
                }
                case 12 -> {
                    System.out.println("Before reversing: ");
                    System.out.println(list);
                    list.reverse();
                    System.out.println("After reversing: ");
                    System.out.println(list);
                }
                case 13 -> {
                    System.out.println("The linkedlist is: ");
                    System.out.println(list);
                }
                case 14 -> {
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                }
            }
        }
    }

    public static void showMenu() {
        System.out.println("""
                1) Insert at head    2) Insert at tail    3) Insert at index
                4) Delete at head    5) Delete at tail    6) Delete at index
                7) Get element       8) Search            9) Length
                10) Is empty         11) Middle           12) Reverse
                13) Print             14) Exit
                """);
    }
}
