package LinkedList.Easy.ReverseLinkedList;

import java.util.Scanner;

public class Solution {
    static class Node {
        Node next;
        int val;

        Node(int val) {
            this.next = null;
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = scanner.nextInt();
        Node head = createLL(size, scanner);
        System.out.println("Before reversing: ");
        printLL(head);
        head = reverseLL(head);
        System.out.println("\nAfter reversing: ");
        printLL(head);
        scanner.close();
    }

    public static Node createLL(int size, Scanner scanner) {
        Node head = null, temp = null;
        System.out.println("Enter the elements: ");
        for (int i = 0; i < size; i++) {
            int val = scanner.nextInt();
            if (head == null) {
                head = new Node(val);
                temp = head;
            } else {
                temp.next = new Node(val);
                temp = temp.next;
            }
        }
        return head;
    }

    public static void printLL(Node head) {
        System.out.println("The elements are: ");
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static Node reverseLL(Node head) {
        Node prev = null, cur = head, next = null;
        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}
