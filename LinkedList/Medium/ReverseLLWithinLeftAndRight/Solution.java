package LinkedList.Medium.ReverseLLWithinLeftAndRight;

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
        System.out.println("Enter the left: ");
        int left = scanner.nextInt();
        System.out.println("Enter the right: ");
        int right = scanner.nextInt();
        System.out.println("Before reversal: ");
        printLL(head);
        reverseLL(head, left, right);
        System.out.println("After reversal: ");
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
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static Node reverseLL(Node head, int left, int right) {
        Node dummy = new Node(-1), prev = dummy;
        dummy.next = head;
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        Node cur = prev.next;
        for (int i = 0; i < right - left; i++) {
            Node next = cur.next;
            cur.next = next.next;
            next.next = prev.next;
            prev.next = next;
        }

        return dummy.next;
    }
}
