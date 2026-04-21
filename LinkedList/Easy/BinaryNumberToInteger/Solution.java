package LinkedList.Easy.BinaryNumberToInteger;

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
        System.out.println("The integer value is: " + convertBinaryToInteger(head));
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

    public static int convertBinaryToInteger(Node head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.val);
            head = head.next;
        }
        return convert(sb);
    }

    public static int convert(StringBuilder sb) {
        int num = 0, power = 0;
        for (int i = sb.length() - 1; i >= 0; i--) {
            char ch = sb.charAt(i);
            num += (ch - '0') * (1 << power);
            power++;
        }
        return num;
    }
}
