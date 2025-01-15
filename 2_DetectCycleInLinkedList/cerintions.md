# Problem 2: Detect a Cycle in a Linked List

## Problem Statement:
Given the `head` of a singly linked list, determine if the linked list has a cycle in it. A cycle occurs when a node's next pointer points back to a previous node in the list.

## Constraints:
- The number of nodes in the list is in the range `[0, 10^4]`.
- `-10^5 <= Node.val <= 10^5`.
- The linked list may not be empty.

## Examples:
### Example 1:
**Input**: head = [3, 2, 0, -4], pos = 1

Explanation: The tail node (-4) connects to the node at index 1 (value = 2).

**Output**: true

### Example 2:
**Input**: head = [1, 2], pos = 0

Explanation: The tail node (2) connects to the head node (1).

**Output**: true

### Example 3:
**Input**: head = [1], pos = -1

Explanation: The tail node (1) does not form a cycle.

**Output**: false