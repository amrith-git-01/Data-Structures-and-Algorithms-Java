package LinkedList.Medium.ReorderList;

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
        System.out.println("Before reordering: ");
        printLL(head);
        head = reorderList(head);
        System.out.println("After reordering: ");
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

    public static Node reorderList(Node head) {
        Node dummy = new Node(-1);
        Node temp = dummy;

        Node middle = findMiddle(head);
        Node left = head, right = reverseLL(middle.next);
        middle.next = null;
        int index = 0;

        while (left != null && right != null) {
            if (index % 2 == 0) {
                temp.next = left;
                left = left.next;
                temp = temp.next;
            } else {
                temp.next = right;
                temp = temp.next;
                right = right.next;
            }
            index++;
        }
        if (left != null) {
            temp.next = left;
        }
        if (right != null) {
            temp.next = right;
        }
        return dummy.next;
    }

    public static Node findMiddle(Node head) {
        Node slow = head, fast = head, prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        return fast == null ? prev : slow;
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

    public static void printLL(Node head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}
