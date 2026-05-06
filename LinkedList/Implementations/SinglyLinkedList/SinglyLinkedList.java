package LinkedList.Implementations.SinglyLinkedList;

public class SinglyLinkedList {
    private class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    private Node head;
    private int size;

    public SinglyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void addAtHead(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        size++;
    }

    public void addAtTail(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index < 1 || index > size + 1) {
            System.out.println("Index out of bounds!");
            return;
        }
        if (index == 1) {
            addAtHead(val);
            return;
        }
        Node node = new Node(val);
        Node temp = head;
        for (int i = 1; i < index - 1; i++)
            temp = temp.next;
        node.next = temp.next;
        temp.next = node;
        size++;
    }

    public void deleteAtHead() {
        if (isEmpty()) {
            System.out.println("List is empty!");
            return;
        }
        head = head.next;
        size--;
    }

    public void deleteAtTail() {
        if (isEmpty()) {
            System.out.println("List is empty!");
            return;
        }
        if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node temp = head;
        while (temp.next.next != null)
            temp = temp.next;
        temp.next = null;
        size--;
    }

    public void deleteAtIndex(int index) {
        if (isEmpty()) {
            System.out.println("List is empty!");
            return;
        }
        if (index < 1 || index > size) {
            System.out.println("Index out of bounds!");
            return;
        }
        if (index == 1) {
            head = head.next;
            size--;
            return;
        }
        Node temp = head;
        for (int i = 1; i < index - 1; i++)
            temp = temp.next;
        temp.next = temp.next.next;
        size--;
    }

    public int get(int index) {
        if (index < 1 || index > size)
            return -1;
        Node temp = head;
        for (int i = 1; i < index; i++)
            temp = temp.next;
        return temp.val;
    }

    public boolean search(int val) {
        Node temp = head;
        while (temp != null) {
            if (temp.val == val)
                return true;
            temp = temp.next;
        }
        return false;
    }

    public int length() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int middle() {
        if (isEmpty())
            return -1;
        Node slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.val;
    }

    public void reverse() {
        Node prev = null, cur = head, next = null;
        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        head = prev;
    }

    public void sort() {
        head = mergeSort(head);
    }

    private Node mergeSort(Node node) {
        if (node == null || node.next == null)
            return node;
        Node mid = findMiddle(node);
        Node right = mid.next;
        mid.next = null;
        return merge(mergeSort(node), mergeSort(right));
    }

    private Node findMiddle(Node node) {
        Node slow = node, fast = node.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Node merge(Node l1, Node l2) {
        Node dummy = new Node(-1), temp = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        temp.next = l1 != null ? l1 : l2;
        return dummy.next;
    }

    @Override
    public String toString() {
        if (isEmpty())
            return "[]";
        StringBuilder sb = new StringBuilder();
        Node temp = head;
        while (temp != null) {
            sb.append(temp.val);
            if (temp.next != null)
                sb.append(" -> ");
            temp = temp.next;
        }
        return sb.toString();
    }
}