package CycledLinkList;

import java.util.List;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {}
    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    public static ListNode populateList(int[] vals) {
        ListNode head = null;
        for(int val : vals) {
            head = insert(head, val);
        }
        return head;
    }

    public static ListNode insert(ListNode head, int val) {
        if (head == null) return new ListNode(val);

        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = new ListNode(val);
        return head;
    }
}
