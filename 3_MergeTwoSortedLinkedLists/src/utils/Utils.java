package utils;

import struct.ListNode;

public class Utils {
    public static ListNode createLinkedList(int[] values) {
        if (values == null || values.length == 0) {
            return null;
        }

        ListNode head = new ListNode(values[0]);
        ListNode current = head;

        for (int i = 0; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }

        return head;
    }

    public static ListNode mergeTwoLinkedLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        }

        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        return dummy.next;
    }

    public static void printLinkedList(ListNode head) {
        ListNode current = head;

        while (current != null) {
            if (current.next == null) {
                System.out.print(current.val + "\n");
            }
            else {
                System.out.print(current.val + " - ");
            }
            current = current.next;
        }
    }
}
