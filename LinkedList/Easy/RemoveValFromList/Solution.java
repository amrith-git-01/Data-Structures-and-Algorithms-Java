package LinkedList.Easy.RemoveValFromList;

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
        System.out.println("Enter the val: ");
        int val = scanner.nextInt();
        System.out.println("List before removing val: ");
        printLL(head);
        head = removeVal(head, val);
        System.out.println("\nList after removing val: ");
        printLL(head);
        scanner.close();
    }

    public static Node createLL(int size, Scanner scanner) {
        System.out.println("Enter the elements: ");
        Node head = null, temp = null;
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

    public static Node removeVal(Node head, int val) {
        if (head == null) {
            return head;
        }
        while (head != null && head.val == val) {
            head = head.next;
        }
        Node temp = head, prev = null;
        while (temp != null) {
            if (temp.val == val) {
                prev.next = temp.next;
            } else {
                prev = temp;
            }
            temp = temp.next;
        }
        return head;
    }

    public static void printLL(Node head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}
