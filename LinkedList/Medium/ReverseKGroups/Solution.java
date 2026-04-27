package LinkedList.Medium.ReverseKGroups;

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
        System.out.println("Before reversing: ");
        printLL(head);
        head = reverseLLByKGroups(head, k);
        System.out.println("After reversing: ");
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

    public static Node reverseLLByKGroups(Node head, int k) {
        Node dummy = new Node(-1), prev = dummy;
        dummy.next = head;

        while (true) {
            Node groupStart = prev.next;
            Node groupEnd = findKthNode(prev, k);

            if (groupEnd == null) {
                break;
            }

            Node next = groupEnd.next;
            groupEnd.next = null;

            reverseLL(groupStart);

            prev.next = groupEnd;
            groupStart.next = next;
            prev = groupStart;
        }

        return dummy.next;
    }

    public static void printLL(Node head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static Node reverseLL(Node head) {
        Node cur = head, prev = null, next = null;

        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        return prev;
    }

    public static Node findKthNode(Node head, int k) {
        while (head != null && k > 0) {
            head = head.next;
            k--;
        }
        return head;
    }
}
