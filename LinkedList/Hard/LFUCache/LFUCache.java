package LinkedList.Hard.LFUCache;

import java.util.HashMap;

public class LFUCache {
    class Node {
        int val;
        int key;
        int freq;
        Node next, prev;

        Node(int key, int val) {
            this.key = key;
            this.val = val;
            this.freq = 1;
            this.next = this.prev = null;
        }
    }

    class DLL {
        Node head, tail;
        int size;

        DLL() {
            head = new Node(-1, -1);
            tail = new Node(-1, -1);
            size = 0;

            head.next = tail;
            tail.prev = head;
        }

        void insertAtFront(Node node) {
            node.next = head.next;
            node.prev = head;
            head.next.prev = node;
            head.next = node;
            size++;
        }

        void deleteNode(Node node) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
            size--;
        }

        Node deleteLast() {
            if (size == 0) {
                return null;
            }
            Node node = tail.prev;
            deleteNode(node);
            return node;
        }
    }

    private HashMap<Integer, Node> keyMap;
    private HashMap<Integer, DLL> freqMap;
    private int minFreq, capacity;

    public LFUCache(int capacity) {
        keyMap = new HashMap<>();
        freqMap = new HashMap<>();
        this.capacity = capacity;
        this.minFreq = 0;
    }

    public int get(int key) {
        if (!keyMap.containsKey(key)) {
            return -1;
        }
        Node node = keyMap.get(key);
        updateFreq(node);
        return node.val;
    }

    public void put(int key, int val) {
        if (capacity == 0) {
            return;
        }
        if (keyMap.containsKey(key)) {
            Node node = keyMap.get(key);
            node.val = val;
            updateFreq(node);
        } else {
            if (keyMap.size() == capacity) {
                DLL minDLL = freqMap.get(minFreq);
                Node evicted = minDLL.deleteLast();
                keyMap.remove(evicted.key);
            }
            Node node = new Node(key, val);
            keyMap.put(key, node);
            freqMap.computeIfAbsent(1, k -> new DLL()).insertAtFront(node);
            minFreq = 1;
        }
    }

    private void updateFreq(Node node) {
        int freq = node.freq;
        DLL oldDLL = freqMap.get(freq);
        oldDLL.deleteNode(node);

        if (oldDLL.size == 0 && freq == minFreq) {
            minFreq++;
        }
        node.freq++;
        freqMap.computeIfAbsent(node.freq, k -> new DLL()).insertAtFront(node);
    }
}
