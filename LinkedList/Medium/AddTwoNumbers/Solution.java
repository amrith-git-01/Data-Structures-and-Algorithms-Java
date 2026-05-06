package LinkedList.Medium.AddTwoNumbers;

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
        System.out.println("Enter the size1: ");
        int size1 = scanner.nextInt();
        Node list1 = createLL(size1, scanner);
        System.out.println("Enter the size2: ");
        int size2 = scanner.nextInt();
        Node list2 = createLL(size2, scanner);
        Node head = addLL(list1, list2);
        System.out.println("The res linked list after addition is: ");
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

    public static Node addLL(Node list1, Node list2) {
        int carry = 0;
        Node dummy = new Node(-1), temp = dummy;
        while (list1 != null || list2 != null || carry != 0) {
            int num1 = list1 == null ? 0 : list1.val;
            int num2 = list2 == null ? 0 : list2.val;

            int sum = num1 + num2 + carry;
            carry = sum / 10;
            sum %= 10;

            temp.next = new Node(sum);
            temp = temp.next;
            list1 = list1 == null ? null : list1.next;
            list2 = list2 == null ? null : list2.next;
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
}
