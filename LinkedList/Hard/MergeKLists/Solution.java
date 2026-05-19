package LinkedList.Hard.MergeKLists;

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
        System.out.println("Enter the k: ");
        int k = scanner.nextInt();
        Node[] nodes = createList(scanner, k);
        Node head = mergeKLists(nodes);
        System.out.println("After merging: ");
        printLL(head);
        scanner.close();
    }

    public static Node[] createList(Scanner scanner, int k) {
        Node[] nodes = new Node[k];
        for (int i = 1; i <= k; i++) {
            System.out.println("Enter the size of list " + i + ": ");
            int size = scanner.nextInt();
            Node head = createLL(scanner, size);
            nodes[i - 1] = head;
        }
        return nodes;
    }

    public static Node createLL(Scanner scanner, int size) {
        Node head = null, temp = null;
        System.out.println("Enter the elements: ");
        for (int i = 0; i < size; i++) {
            int val = scanner.nextInt();
            Node node = new Node(val);
            if (head == null) {
                head = node;
                temp = head;
            } else {
                temp.next = node;
                temp = temp.next;
            }
        }
        return head;
    }

    public static Node mergeKLists(Node[] nodes) {
        if (nodes.length == 0) {
            return null;
        }
        return helper(nodes, 0, nodes.length - 1);
    }

    public static Node helper(Node[] nodes, int left, int right) {
        if (left == right) {
            return nodes[left];
        }
        int mid = (left + right) / 2;
        Node leftRes = helper(nodes, left, mid);
        Node rightRes = helper(nodes, mid + 1, right);
        return merge(leftRes, rightRes);
    }

    public static Node merge(Node first, Node second) {
        Node dummy = new Node(-1), temp = dummy;
        while (first != null && second != null) {
            if (first.val < second.val) {
                temp.next = first;
                first = first.next;
            } else {
                temp.next = second;
                second = second.next;
            }
            temp = temp.next;
        }
        temp.next = first != null ? first : second;
        return dummy.next;
    }

    public static void printLL(Node head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}
