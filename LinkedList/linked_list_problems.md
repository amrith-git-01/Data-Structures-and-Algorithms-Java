# Linked List — Complete Problem Sheet

> Curated from **Striver's A2Z DSA Sheet**, **LeetCode**, **GFG**, and other top sources.
> Organized by **difficulty** and **pattern** for structured practice.

---

## Patterns Quick Reference

| Pattern | When to use |
|---------|-------------|
| **Dummy Node** | Insertion, deletion, merging — avoids edge cases at head |
| **Fast & Slow Pointers** | Cycle detection, middle of list, kth from end |
| **In-place Reversal** | Reverse whole or part of list without extra space |
| **Two Pointer** | Finding intersections, removing nth from end |
| **Merge** | Combining two or more sorted lists |
| **Recursion** | Elegant reversal, deep copy, flattening |
| **HashMap/Set** | Cycle detection, copy with random pointers |
| **Design** | LRU cache, browser history, custom data structures |

---

---

# 🟢 EASY

### Pattern — Basic Operations (must do first!)

| # | Problem | LC # | Pattern | Source |
|---|---------|------|---------|--------|
| 1 | [Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/) | 206 | In-place Reversal | LC + Striver |
| 2 | [Middle of the Linked List](https://leetcode.com/problems/middle-of-the-linked-list/) | 876 | Fast & Slow Pointers | LC + Striver |
| 3 | [Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/) | 21 | Merge + Dummy Node | LC + Striver |
| 4 | [Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/) | 141 | Fast & Slow Pointers | LC + Striver |
| 5 | [Palindrome Linked List](https://leetcode.com/problems/palindrome-linked-list/) | 234 | Fast & Slow + Reversal | LC + Striver |
| 6 | [Remove Duplicates from Sorted List](https://leetcode.com/problems/remove-duplicates-from-sorted-list/) | 83 | Basic Traversal | LC + Striver |
| 7 | [Remove Linked List Elements](https://leetcode.com/problems/remove-linked-list-elements/) | 203 | Dummy Node | LC |
| 8 | [Intersection of Two Linked Lists](https://leetcode.com/problems/intersection-of-two-linked-lists/) | 160 | Two Pointer | LC + Striver |
| 9 | [Convert Binary Number in Linked List to Integer](https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/) | 1290 | Basic Traversal | LC |
| 10 | [Delete Node in a Linked List](https://leetcode.com/problems/delete-node-in-a-linked-list/) | 237 | Basic Operation | LC |

### Pattern — Striver A2Z Exclusives (Easy)

| # | Problem | Platform | Pattern |
|---|---------|----------|---------|
| 11 | [Introduction to Linked List](https://www.geeksforgeeks.org/data-structures/linked-list/) | GFG | Basic |
| 12 | [Implement Singly Linked List](https://www.geeksforgeeks.org/linked-list-set-1-introduction/) | GFG | Design |
| 13 | [Implement Doubly Linked List](https://www.geeksforgeeks.org/doubly-linked-list/) | GFG | Design |
| 14 | [Count Nodes in Linked List](https://www.geeksforgeeks.org/find-length-of-a-linked-list-iterative-and-recursive/) | GFG | Basic Traversal |
| 15 | [Search an Element in Linked List](https://www.geeksforgeeks.org/search-an-element-in-a-linked-list-iterative-and-recursive/) | GFG | Basic Traversal |

---

---

# 🟡 MEDIUM

### Pattern 1 — Fast & Slow Pointers

| # | Problem | LC # | Key Idea | Source |
|---|---------|------|----------|--------|
| 1 | [Linked List Cycle II](https://leetcode.com/problems/linked-list-cycle-ii/) | 142 | Find cycle start | LC + Striver |
| 2 | [Find the Duplicate Number](https://leetcode.com/problems/find-the-duplicate-number/) | 287 | Floyd's cycle detection on array | LC + Striver |
| 3 | [Remove Nth Node From End of List](https://leetcode.com/problems/remove-nth-node-from-end-of-list/) | 19 | Two pointers n apart | LC + Striver |
| 4 | [Reorder List](https://leetcode.com/problems/reorder-list/) | 143 | Middle + Reverse + Merge | LC + Striver |

### Pattern 2 — In-place Reversal

| # | Problem | LC # | Key Idea | Source |
|---|---------|------|----------|--------|
| 5 | [Reverse Linked List II](https://leetcode.com/problems/reverse-linked-list-ii/) | 92 | Reverse between positions m and n | LC + Striver |
| 6 | [Reverse Nodes in k-Group](https://leetcode.com/problems/reverse-nodes-in-k-group/) | 25 | Reverse k nodes at a time | LC + Striver |
| 7 | [Swap Nodes in Pairs](https://leetcode.com/problems/swap-nodes-in-pairs/) | 24 | Reverse every 2 nodes | LC |
| 8 | [Rotate List](https://leetcode.com/problems/rotate-list/) | 61 | Find new tail, reconnect | LC + Striver |

### Pattern 3 — Merge & Sort

| # | Problem | LC # | Key Idea | Source |
|---|---------|------|----------|--------|
| 9 | [Sort List](https://leetcode.com/problems/sort-list/) | 148 | Merge sort on linked list | LC + Striver |
| 10 | [Remove Duplicates from Sorted List II](https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/) | 82 | Skip all duplicates | LC + Striver |
| 11 | [Partition List](https://leetcode.com/problems/partition-list/) | 86 | Two separate lists, rejoin | LC |
| 12 | [Odd Even Linked List](https://leetcode.com/problems/odd-even-linked-list/) | 328 | Separate odd/even, rejoin | LC + Striver |

### Pattern 4 — Two Pointer / HashMap

| # | Problem | LC # | Key Idea | Source |
|---|---------|------|----------|--------|
| 13 | [Copy List with Random Pointer](https://leetcode.com/problems/copy-list-with-random-pointer/) | 138 | HashMap old→new node | LC + Striver |
| 14 | [Add Two Numbers](https://leetcode.com/problems/add-two-numbers/) | 2 | Simulate addition with carry | LC + Striver |
| 15 | [Add Two Numbers II](https://leetcode.com/problems/add-two-numbers-ii/) | 445 | Stack or reverse first | LC |
| 16 | [Swapping Nodes in a Linked List](https://leetcode.com/problems/swapping-nodes-in-a-linked-list/) | 1721 | Two pointer kth from start/end | LC |

### Pattern 5 — Design

| # | Problem | LC # | Key Idea | Source |
|---|---------|------|----------|--------|
| 17 | [Design Linked List](https://leetcode.com/problems/design-linked-list/) | 707 | Implement all operations | LC + Striver |
| 18 | [Design Browser History](https://leetcode.com/problems/design-browser-history/) | 1472 | Doubly linked list | LC |
| 19 | [Design Phone Directory](https://leetcode.com/problems/design-phone-directory/) | 379 | LinkedList + Set | LC |

### Pattern 6 — Doubly Linked List (Striver Exclusives)

| # | Problem | Platform | Key Idea |
|---|---------|----------|----------|
| 20 | [Reverse a Doubly Linked List](https://www.geeksforgeeks.org/reverse-a-doubly-linked-list/) | GFG | Swap prev/next pointers |
| 21 | [Delete all occurrences of key in DLL](https://www.geeksforgeeks.org/delete-all-occurrences-of-a-given-key-in-a-doubly-linked-list/) | GFG | Traverse and delete |
| 22 | [Find pairs with given sum in DLL](https://www.geeksforgeeks.org/find-pairs-given-sum-doubly-linked-list/) | GFG | Two pointer on DLL |
| 23 | [Remove duplicates from sorted DLL](https://www.geeksforgeeks.org/remove-duplicates-unsorted-doubly-linked-list/) | GFG | Basic traversal |

### Pattern 7 — Circular Linked List (Striver Exclusives)

| # | Problem | Platform | Key Idea |
|---|---------|----------|----------|
| 24 | [Introduction to Circular LL](https://www.geeksforgeeks.org/circular-linked-list/) | GFG | Basic |
| 25 | [Insert in Circular LL](https://www.geeksforgeeks.org/circular-linked-list-set-2-traversal/) | GFG | Find tail, reconnect |
| 26 | [Delete in Circular LL](https://www.geeksforgeeks.org/deletion-circular-linked-list/) | GFG | Handle head/tail cases |

---

---

# 🔴 HARD

### Pattern 1 — Complex Reversal

| # | Problem | LC # | Key Idea | Source |
|---|---------|------|----------|--------|
| 1 | [Reverse Nodes in k-Group](https://leetcode.com/problems/reverse-nodes-in-k-group/) | 25 | Reverse k at a time recursively | LC + Striver |
| 2 | [Reverse Linked List II](https://leetcode.com/problems/reverse-linked-list-ii/) | 92 | One pass reversal between m,n | LC + Striver |

### Pattern 2 — Merge K Lists

| # | Problem | LC # | Key Idea | Source |
|---|---------|------|----------|--------|
| 3 | [Merge k Sorted Lists](https://leetcode.com/problems/merge-k-sorted-lists/) | 23 | Min heap or divide & conquer | LC + Striver |
| 4 | [Sort List](https://leetcode.com/problems/sort-list/) | 148 | Merge sort O(n log n) O(1) space | LC + Striver |

### Pattern 3 — Design (Hard)

| # | Problem | LC # | Key Idea | Source |
|---|---------|------|----------|--------|
| 5 | [LRU Cache](https://leetcode.com/problems/lru-cache/) | 146 | HashMap + Doubly LL | LC + Striver |
| 6 | [LFU Cache](https://leetcode.com/problems/lfu-cache/) | 460 | HashMap + Freq Map + DLL | LC |
| 7 | [All O(1) Data Structure](https://leetcode.com/problems/all-oone-data-structure/) | 432 | DLL + HashMap | LC |

### Pattern 4 — Flattening

| # | Problem | LC # | Key Idea | Source |
|---|---------|------|----------|--------|
| 8 | [Flatten a Multilevel Doubly Linked List](https://leetcode.com/problems/flatten-a-multilevel-doubly-linked-list/) | 430 | Stack or recursion | LC + Striver |
| 9 | [Flatten Linked List](https://www.geeksforgeeks.org/flattening-a-linked-list/) | GFG | Merge sort approach | Striver |

### Pattern 5 — Math & Simulation

| # | Problem | LC # | Key Idea | Source |
|---|---------|------|----------|--------|
| 10 | [Multiply Two Numbers as Linked List](https://www.geeksforgeeks.org/multiply-two-numbers-represented-linked-lists/) | GFG | Simulate multiplication | Striver |
| 11 | [Next Greater Node in Linked List](https://leetcode.com/problems/next-greater-node-in-linked-list/) | 1019 | Stack based | LC |
| 12 | [Maximum Twin Sum of a Linked List](https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/) | 2130 | Middle + Reverse + Two pointer | LC |

---

---

## Recommended Order of Practice

```
Week 1 — Foundation
  → All Easy problems (1-15)
  → Focus: traversal, basic operations, dummy node

Week 2 — Core Patterns
  → Fast & Slow Pointers (cycle, middle, nth from end)
  → In-place Reversal (reverse whole, reverse part)
  → LC 141, 142, 876, 206, 92, 19

Week 3 — Intermediate
  → Merge & Sort pattern
  → Copy with random pointer
  → Add two numbers
  → LC 21, 148, 143, 138, 2, 82

Week 4 — Advanced
  → Design problems (LRU Cache is must!)
  → Merge K lists
  → Flattening
  → LC 146, 23, 25, 430
```

---

## Key Patterns Summary

```
🟢 EASY   → basic traversal, dummy node, fast&slow intro
🟡 MEDIUM → reversal, merge, two pointer, design, DLL, circular
🔴 HARD   → LRU/LFU cache, merge k lists, flattening, complex math
```

---

## Must Know Before Starting

```java
// 1. Dummy node template
ListNode dummy = new ListNode(0);
dummy.next = head;

// 2. Fast & Slow pointer template
ListNode slow = head, fast = head;
while(fast != null && fast.next != null){
    slow = slow.next;
    fast = fast.next.next;
}

// 3. Reverse template
ListNode prev = null, curr = head;
while(curr != null){
    ListNode next = curr.next;
    curr.next = prev;
    prev = curr;
    curr = next;
}
```

---

> **Pro tip:** Master these 3 in order — Reverse LL (206), Middle of LL (876), Linked List Cycle II (142).
> These three unlock 80% of all linked list problems! 🚀
