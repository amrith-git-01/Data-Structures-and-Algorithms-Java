package LinkedList.Medium.RotateRight;

import java.util.Scanner;

public class Solution {
    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = scanner.nextInt();
        Node head = createLL(size, scanner);
        System.out.println("Enter the k: ");
        int k = scanner.nextInt();
        System.out.println("Before rotating: ");
        printLL(head);
        head = rotateLL(head, k);
        System.out.println("After rotating: ");
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

    public static Node rotateLL(Node head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        int len = 1;
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
            len++;
        }
        k = k % len;
        if (k == 0) {
            return head;
        }

        tail.next = head;
        Node newTail = head;
        for (int i = 0; i < len - k - 1; i++) {
            newTail = newTail.next;
        }
        Node newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }

    public static void printLL(Node head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}
