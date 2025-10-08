package LinkedListCycleII;

/**
 * Problem (LeetCode 142): Linked List Cycle II
 *
 * Given the head of a linked list, return the node where the cycle begins.
 * If there is no cycle, return null.
 * Floyd's Tortoise and Hare.
 */
public class Solution {
    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int v) { val = v; }
    }

    public ListNode detectCycle(ListNode head) {
        if (head == null ) return null;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                ListNode p = head;
                while (p != slow) {
                    p = p.next;
                    slow = slow.next;
                }
                return p;
            }
        }

        return null;
    }
}


// 1 -> 2 -> 3
// |         |
// 6 <- 5 <- 4

// Step     Slow    Fast
//   1        2       3
//  2         3       5
//  3         4       1
//  4         5       3
//  5         6       5
//  6         1       1
