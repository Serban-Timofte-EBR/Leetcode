import struct.ListNode;

import java.util.List;

public class Utils {
    // Create a cycle linked list
    public static ListNode createCycleLinkedList(int[] values, int cyclePos) {
        if (values == null || values.length == 0) {
            return null;
        }

        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        ListNode cycleNode = null;

        for (int i = 0; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;

            if (cyclePos == i) {
                cycleNode = current;
            }
        }

        if (cyclePos >= 0) {
            current.next = cycleNode;
        }

        return head;
    }

    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}
