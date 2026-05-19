package LinkedList.Implementations.CircularLinkedList;

public class CircularLinkedList {
    class Node {
        Node next;
        int val;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    private Node head;
    private int size;

    public CircularLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void insertAtHead(int val) {
        Node newNode = new Node(val);
        if (isEmpty()) {
            head = newNode;
            head.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            newNode.next = head;
            head = newNode;
            temp.next = head;
        }
        size++;
    }

    public void insertAtTail(int val) {
        Node newNode = new Node(val);
        if (isEmpty()) {
            head = newNode;
            head.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
        size++;
    }

    public int insertAtIndex(int val, int index) {
        if (isEmpty()) {
            return -1;
        }
        if (index < 0 || index > size) {
            return -2;
        }
        if (index == 0) {
            insertAtHead(val);
        } else if (index == size) {
            insertAtTail(val);
        }
        Node temp = head, prev = null;
        Node newNode = new Node(val);
        while (index > 0) {
            prev = temp;
            temp = temp.next;
            index--;
        }
        newNode.next = temp;
        prev.next = newNode;
        size++;
        return 0;
    }

    public int deleteAtHead() {
        if (isEmpty()) {
            return -1;
        }
        if (head.next == head) {
            head = null;
            size--;
            return 0;
        }
        Node temp = head;
        do {
            temp = temp.next;
        } while (temp != head);
        temp.next = head = head.next;
        size--;
        return 0;
    }

    public int deleteAtTail() {
        if (isEmpty()) {
            return -1;
        }
        Node temp = head, prev = null;
        do {
            prev = temp;
            temp = temp.next;
        } while (temp != head);
        prev.next = temp.next;
        size--;
        return 0;
    }

    public int deleteAtIndex(int index) {
        if (isEmpty()) {
            return -1;
        }
        if (index < 0 || index > size) {
            return -2;
        }
        if (index == 0) {
            deleteAtHead();
        } else if (index == size) {
            deleteAtTail();
        }
        Node temp = head, prev = null;
        while (index > 0) {
            index--;
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
        return 0;
    }

    public int getElement(int index) {
        if (isEmpty()) {
            return -1;
        }
        if (index < 0 || index > size) {
            return -2;
        }
        Node temp = head;
        while (index > 0) {
            index--;
            temp = temp.next;
        }
        return temp.val;
    }

    public boolean searchElement(int el) {
        if (isEmpty()) {
            return false;
        }
        Node temp = head;
        do {
            if (temp.val == el) {
                return true;
            }
            temp = temp.next;
        } while (temp != head);
        return false;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int findMiddle() {
        if (isEmpty()) {
            return -1;
        }
        Node slow = head, fast = head;
        while (fast != head && fast.next == head) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.val;
    }

    public void reverse() {
        if (isEmpty()) {
            return;
        }
        Node cur = head, prev = null, next = null;
        Node prevHead = head;
        do {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        } while (cur != head);
        head = prev;
        prevHead.next = head;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node temp = head;
        do {
            sb.append(temp.val);
            sb.append(" -> ");
            temp = temp.next;
        } while (temp != head);
        sb.append("]");
        return sb.toString();
    }
}
