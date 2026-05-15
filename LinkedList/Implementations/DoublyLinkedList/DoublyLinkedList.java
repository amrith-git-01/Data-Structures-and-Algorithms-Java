package LinkedList.Implementations.DoublyLinkedList;

public class DoublyLinkedList {
    class Node {
        int val;
        Node next, prev;

        Node(int val) {
            this.val = val;
            this.next = this.prev = null;
        }
    }

    private Node head, tail;
    private int size;

    DoublyLinkedList() {
        this.head = this.tail = null;
        this.size = 0;
    }

    public void insertAtHead(int val) {
        Node node = new Node(val);
        if (isEmpty()) {
            head = tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
        size++;
    }

    public void insertAtTail(int val) {
        Node node = new Node(val);
        if (isEmpty()) {
            head = tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        size++;
    }

    public void insertAtIndex(int val, int index) {
        if (index < 0 || index > size) {
            System.out.println("Index out of bounds!");
            return;
        }
        if (index == 0) {
            insertAtHead(val);
            return;
        }
        if (index == size) {
            insertAtTail(val);
            return;
        }
        Node node = new Node(val);
        Node temp = head;
        while (index > 0) {
            temp = temp.next;
            index--;
        }
        temp.prev.next = node;
        node.prev = temp.prev;
        node.next = temp;
        temp.prev = node;
        size++;
    }

    public void deleteAtHead() {
        if (isEmpty()) {
            System.out.println("Linked list is empty!");
            return;
        }
        if (head == tail) {
            head = tail = null;
            size--;
            return;
        }
        head = head.next;
        head.prev = null;
        size--;
    }

    public void deleteAtTail() {
        if (isEmpty()) {
            System.out.println("Linked list is empty!");
            return;
        }
        if (head == tail) {
            head = tail = null;
            size--;
            return;
        }
        tail = tail.prev;
        tail.next = null;
        size--;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index > size - 1) {
            System.out.println("Index out of bounds!");
            return;
        }
        if (index == 0) {
            deleteAtHead();
            return;
        }
        if (index == size - 1) {
            deleteAtTail();
            return;
        }
        Node temp = head;
        while (temp != null && index > 0) {
            temp = temp.next;
            index--;
        }
        temp.prev.next = temp.next;
        if (temp.next != null)
            temp.next.prev = temp.prev;
        size--;
    }

    public int getElement(int index) {
        if (index < 0 || index > size - 1)
            return -1;
        Node temp = head;
        while (temp != null && index > 0) {
            index--;
            temp = temp.next;
        }
        return temp.val;
    }

    public boolean searchElement(int val) {
        Node temp = head;
        while (temp != null) {
            if (temp.val == val)
                return true;
            temp = temp.next;
        }
        return false;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int findMiddle() {
        if (isEmpty())
            return -1;
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.val;
    }

    public void reverse() {
        if (isEmpty())
            return;
        Node oldHead = head;
        Node cur = head, next = null, prev = null;
        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            cur.prev = next;
            prev = cur;
            cur = next;
        }
        head = prev;
        head.prev = null;
        tail = oldHead;
        tail.next = null;
    }

    public int size() {
        return size;
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
                sb.append(" <-> ");
            temp = temp.next;
        }
        return sb.toString();
    }
}