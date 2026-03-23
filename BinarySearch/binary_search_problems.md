# Binary Search — Complete Problem Sheet

> Curated from **Striver's A2Z DSA Sheet**, **LeetCode**, **GFG**, and other top sources.
> Organized by difficulty and pattern for structured practice.

---

## How to Identify a Binary Search Problem

| Signal | Example Keywords |
|--------|-----------------|
| Sorted array + search | "find target", "search in sorted" |
| Minimize the maximum | "minimum capacity such that..." |
| Maximize the minimum | "maximum speed such that..." |
| Monotonic condition | "first/last position where condition is true" |

---

## Patterns

| Pattern | Description |
|---------|-------------|
| **Classic BS** | Search for exact value in sorted array |
| **Boundary BS** | Find first/last position where condition holds |
| **BS on Answer** | Binary search on the answer range, not the array |
| **BS on 2D** | Apply binary search on rows/cols of matrix |

---

## Template Quick Reference

```java
// Classic
int lo = 0, hi = n - 1;
while (lo <= hi) {
    int mid = lo + (hi - lo) / 2;
    if (arr[mid] == target) return mid;
    else if (arr[mid] < target) lo = mid + 1;
    else hi = mid - 1;
}

// BS on Answer (minimise)
while (lo < hi) {
    int mid = lo + (hi - lo) / 2;
    if (canDo(mid)) hi = mid;
    else lo = mid + 1;
}
```

---

---

# 🟢 EASY

### Classic Binary Search

| # | Problem | LC # | Pattern | Source |
|---|---------|------|---------|--------|
| 1 | [Binary Search](https://leetcode.com/problems/binary-search/) | 704 | Classic BS | LC + Striver |
| 2 | [Search Insert Position](https://leetcode.com/problems/search-insert-position/) | 35 | Boundary BS | LC + Striver |
| 3 | [Sqrt(x)](https://leetcode.com/problems/sqrtx/) | 69 | BS on Answer | LC + Striver |
| 4 | [Guess Number Higher or Lower](https://leetcode.com/problems/guess-number-higher-or-lower/) | 374 | Classic BS | LC |
| 5 | [First Bad Version](https://leetcode.com/problems/first-bad-version/) | 278 | Boundary BS | LC |
| 6 | [Two Sum II - Input Array is Sorted](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/) | 167 | Classic BS | LC |
| 7 | [Valid Perfect Square](https://leetcode.com/problems/valid-perfect-square/) | 367 | BS on Answer | LC |
| 8 | [Arranging Coins](https://leetcode.com/problems/arranging-coins/) | 441 | BS on Answer | LC |
| 9 | [Find Smallest Letter Greater Than Target](https://leetcode.com/problems/find-smallest-letter-greater-than-target/) | 744 | Boundary BS | LC + Striver |
| 10 | [Kth Missing Positive Number](https://leetcode.com/problems/kth-missing-positive-number/) | 1539 | BS on Answer | LC + Striver |
| 11 | [Count Negative Numbers in a Sorted Matrix](https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/) | 1351 | BS on 2D | LC |
| 12 | [Check if N and its Double Exist](https://leetcode.com/problems/check-if-n-and-its-double-exist/) | 1346 | Classic BS | LC |

### Striver A2Z Exclusives (Easy)

| # | Problem | Platform | Pattern |
|---|---------|----------|---------|
| 13 | [Implement Lower Bound](https://www.geeksforgeeks.org/lower_bound-in-cpp/) | GFG | Boundary BS |
| 14 | [Implement Upper Bound](https://www.geeksforgeeks.org/upper_bound-in-cpp/) | GFG | Boundary BS |
| 15 | [Floor and Ceil in Sorted Array](https://www.geeksforgeeks.org/floor-and-ceil-from-a-bst/) | GFG | Boundary BS |
| 16 | [Find the Nth Root of a Number](https://www.geeksforgeeks.org/n-th-root-of-a-number/) | GFG | BS on Answer |

---

---

# 🟡 MEDIUM

### BS on 1D Arrays

| # | Problem | LC # | Pattern | Source |
|---|---------|------|---------|--------|
| 1 | [Find First and Last Position of Element in Sorted Array](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/) | 34 | Boundary BS | LC + Striver |
| 2 | [Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/) | 33 | Classic BS | LC + Striver |
| 3 | [Find Minimum in Rotated Sorted Array](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/) | 153 | Classic BS | LC + Striver |
| 4 | [Single Element in a Sorted Array](https://leetcode.com/problems/single-element-in-a-sorted-array/) | 540 | Classic BS | LC + Striver |
| 5 | [Find Peak Element](https://leetcode.com/problems/find-peak-element/) | 162 | Boundary BS | LC + Striver |
| 6 | [Peak Index in a Mountain Array](https://leetcode.com/problems/peak-index-in-a-mountain-array/) | 852 | Boundary BS | LC |
| 7 | [Find Right Interval](https://leetcode.com/problems/find-right-interval/) | 436 | Classic BS | LC |
| 8 | [Time Based Key-Value Store](https://leetcode.com/problems/time-based-key-value-store/) | 981 | Boundary BS | LC |
| 9 | [Capacity to Ship Packages Within D Days](https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/) | 1011 | BS on Answer | LC + Striver |
| 10 | [Koko Eating Bananas](https://leetcode.com/problems/koko-eating-bananas/) | 875 | BS on Answer | LC + Striver |
| 11 | [Minimum Speed to Arrive on Time](https://leetcode.com/problems/minimum-speed-to-arrive-on-time/) | 1870 | BS on Answer | LC |
| 12 | [Find the Smallest Divisor Given a Threshold](https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/) | 1283 | BS on Answer | LC + Striver |
| 13 | [Minimum Number of Days to Make m Bouquets](https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/) | 1482 | BS on Answer | LC + Striver |
| 14 | [Maximum Value at a Given Index in a Bounded Array](https://leetcode.com/problems/maximum-value-at-a-given-index-in-a-bounded-array/) | 1802 | BS on Answer | LC |
| 15 | [Search a 2D Matrix](https://leetcode.com/problems/search-a-2d-matrix/) | 74 | BS on 2D | LC + Striver |
| 16 | [Search a 2D Matrix II](https://leetcode.com/problems/search-a-2d-matrix-ii/) | 240 | BS on 2D | LC + Striver |

### BS on Answer (Medium)

| # | Problem | LC # | Pattern | Source |
|---|---------|------|---------|--------|
| 17 | [Split Array Largest Sum](https://leetcode.com/problems/split-array-largest-sum/) | 410 | BS on Answer | LC + Striver |
| 18 | [EKO (Aggressive Cows variant)](https://www.spoj.com/problems/EKO/) | SPOJ | BS on Answer | Striver |
| 19 | [Sum of Mutated Array Closest to Target](https://leetcode.com/problems/sum-of-mutated-array-closest-to-target/) | 1300 | BS on Answer | LC |
| 20 | [H-Index II](https://leetcode.com/problems/h-index-ii/) | 275 | Boundary BS | LC |
| 21 | [Find K Closest Elements](https://leetcode.com/problems/find-k-closest-elements/) | 658 | Boundary BS | LC |
| 22 | [Magnetic Force Between Two Balls](https://leetcode.com/problems/magnetic-force-between-two-balls/) | 1552 | BS on Answer | LC |

### Striver A2Z Exclusives (Medium)

| # | Problem | Platform | Pattern |
|---|---------|----------|---------|
| 23 | [Aggressive Cows](https://www.geeksforgeeks.org/aggressive-cows/) | GFG | BS on Answer |
| 24 | [Book Allocation Problem](https://www.geeksforgeeks.org/allocate-minimum-number-pages/) | GFG | BS on Answer |
| 25 | [Painter's Partition Problem](https://www.geeksforgeeks.org/painters-partition-problem/) | GFG | BS on Answer |
| 26 | [Row with Maximum 1s](https://www.geeksforgeeks.org/find-the-row-with-maximum-number-1s/) | GFG | BS on 2D |
| 27 | [Count Occurrences in Sorted Array](https://www.geeksforgeeks.org/count-occurrences-of-a-given-number/) | GFG | Boundary BS |

---

---

# 🔴 HARD

### BS on 1D Arrays (Hard)

| # | Problem | LC # | Pattern | Source |
|---|---------|------|---------|--------|
| 1 | [Median of Two Sorted Arrays](https://leetcode.com/problems/median-of-two-sorted-arrays/) | 4 | Classic BS | LC + Striver |
| 2 | [Search in Rotated Sorted Array II](https://leetcode.com/problems/search-in-rotated-sorted-array-ii/) | 81 | Classic BS | LC + Striver |
| 3 | [Find Minimum in Rotated Sorted Array II](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/) | 154 | Classic BS | LC + Striver |
| 4 | [Find in Mountain Array](https://leetcode.com/problems/find-in-mountain-array/) | 1095 | Classic BS | LC |

### BS on Answer (Hard)

| # | Problem | LC # | Pattern | Source |
|---|---------|------|---------|--------|
| 5 | [Kth Smallest Number in Multiplication Table](https://leetcode.com/problems/kth-smallest-number-in-multiplication-table/) | 668 | BS on Answer | LC |
| 6 | [Find K-th Smallest Pair Distance](https://leetcode.com/problems/find-k-th-smallest-pair-distance/) | 719 | BS on Answer | LC |
| 7 | [Minimize Max Distance to Gas Station](https://leetcode.com/problems/minimize-max-distance-to-gas-station/) | 774 | BS on Answer | LC + Striver |
| 8 | [Kth Smallest Element in a Sorted Matrix](https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/) | 378 | BS on Answer | LC |
| 9 | [Find a Peak Element II](https://leetcode.com/problems/find-a-peak-element-ii/) | 1901 | BS on 2D | LC + Striver |
| 10 | [Russian Doll Envelopes](https://leetcode.com/problems/russian-doll-envelopes/) | 354 | BS + Greedy | LC |
| 11 | [Count of Range Sum](https://leetcode.com/problems/count-of-range-sum/) | 327 | BS + Merge Sort | LC |
| 12 | [Longest Increasing Subsequence (nlogn)](https://leetcode.com/problems/longest-increasing-subsequence/) | 300 | BS on Answer | LC |

### BS on 2D (Hard)

| # | Problem | LC # | Pattern | Source |
|---|---------|------|---------|--------|
| 13 | [Median in a Row-wise Sorted Matrix](https://www.geeksforgeeks.org/find-median-row-wise-sorted-matrix/) | GFG | BS on 2D | Striver |
| 14 | [Kth Element of Two Sorted Arrays](https://www.geeksforgeeks.org/k-th-element-of-two-sorted-arrays/) | GFG | Classic BS | Striver |
| 15 | [Max Average Subarray II](https://leetcode.com/problems/maximum-average-subarray-ii/) | 644 | BS on Answer | LC |
| 16 | [Split Array into Consecutive Subsequences](https://leetcode.com/problems/split-array-into-consecutive-subsequences/) | 659 | BS + Greedy | LC |

---

---

## Recommended Order of Practice

```
Week 1 — Foundation
  → All Easy problems (1-16)
  → LC 704, 35, 278, 374, 69

Week 2 — 1D Arrays + Rotated Arrays
  → LC 34, 33, 153, 540, 162
  → LC 81, 154 (Hard variants)

Week 3 — BS on Answer
  → LC 875, 1011, 1283, 1482, 410
  → GFG: Aggressive Cows, Book Allocation, Painter's Partition

Week 4 — 2D Arrays + Hard
  → LC 74, 240, 1901
  → GFG: Median in Row-wise Sorted Matrix
  → LC 4 (Median of Two Sorted Arrays)
  → LC 668, 719 (Ultimate BS on Answer)
```

---

## Key Patterns Summary

```
🟢 EASY   → Classic search, boundary, simple BS on answer
🟡 MEDIUM → Rotated arrays, BS on answer with feasibility check, 2D matrices
🔴 HARD   → Median problems, minimise/maximise over complex spaces, 2D peak
```

---

> **Pro tip:** Once you can solve Aggressive Cows, Book Allocation, and Painter's Partition,
> you can solve 90% of all BS on Answer problems — they all follow the same skeleton.
