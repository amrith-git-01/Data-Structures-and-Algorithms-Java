package LinkedList.Hard.AllOneDS;

import java.util.HashSet;
import java.util.HashMap;

public class AllOne {
    class Bucket {
        int count;
        HashSet<String> keys;
        Bucket prev, next;

        Bucket(int count) {
            this.count = count;
            this.keys = new HashSet<>();
            this.prev = this.next = null;
        }
    }

    private Bucket head, tail;
    private HashMap<String, Bucket> keyMap;

    AllOne() {
        this.keyMap = new HashMap<>();
        this.head = new Bucket(0);
        this.tail = new Bucket(Integer.MAX_VALUE);
        this.head.next = this.tail;
        this.tail.prev = this.head;
    }

    private Bucket insertAfter(Bucket bucket, int count) {
        Bucket newBucket = new Bucket(count);
        newBucket.next = bucket.next;
        bucket.next.prev = newBucket;
        newBucket.prev = bucket;
        bucket.next = newBucket;
        return newBucket;
    }

    private void removeBucket(Bucket bucket) {
        bucket.next.prev = bucket.prev;
        bucket.prev.next = bucket.next;
    }

    public void inc(String key) {
        if (keyMap.containsKey(key)) {
            Bucket cur = keyMap.get(key);
            int newCount = cur.count + 1;
            Bucket next = cur.next;
            if (next.count != newCount) {
                next = insertAfter(cur, newCount);
            }
            cur.keys.remove(key);
            if (cur.keys.isEmpty()) {
                removeBucket(cur);
            }
            next.keys.add(key);
            keyMap.put(key, next);
        } else {
            Bucket first = head.next;
            if (first.count != 1) {
                first = insertAfter(head, 1);
            }
            first.keys.add(key);
            keyMap.put(key, first);
        }
    }

    public void dec(String key) {
        if (!keyMap.containsKey(key)) {
            return;
        }
        Bucket cur = keyMap.get(key);
        int newCount = cur.count - 1;
        if (newCount == 0) {
            keyMap.remove(key);
        } else {
            Bucket prev = cur.prev;
            if (prev.count != newCount) {
                prev = insertAfter(prev, newCount);
            }
            prev.keys.add(key);
            keyMap.put(key, prev);
        }
        cur.keys.remove(key);
        if (cur.keys.isEmpty()) {
            removeBucket(cur);
        }
    }

    public String getMaxKey() {
        if (tail.prev == head) {
            return "";
        }
        return tail.prev.keys.iterator().next();
    }

    public String getMinKey() {
        if (head.next == tail) {
            return "";
        }
        return head.next.keys.iterator().next();
    }
}
