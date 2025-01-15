# Problem 3: Merge Two Sorted Linked Lists

## Problem Statement:
You are given the heads of two sorted linked lists. Merge the two lists into one sorted linked list and return the merged list. The merged list should be made by splicing together the nodes of the two given lists.

## Constraints:
- The number of nodes in both lists is in the range `[0, 50]`.
- `-100 <= Node.val <= 100`.
- Both lists are sorted in non-decreasing order.

## Example:
### Example 1:
Input: list1 = [1, 2, 4], list2 = [1, 3, 4]

Output: [1, 1, 2, 3, 4, 4]

### Example 2:
Input: list1 = [], list2 = []

Output: []

### Example 3:
Input: list1 = [], list2 = [0]

Output: [0]