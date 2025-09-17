package HahMapFrom0;

public class ListNode {
    public String val;
    public int key;
    public ListNode next;

    public ListNode(String val, int key) {
        this.val = val;
        this.key = key;
    }

    public ListNode insert(ListNode head, String val, int key) {
        if (head == null) return new  ListNode(val, key);

        ListNode curr = head;
        while(curr.next != null) {
            curr = curr.next;
        }

        curr.next = new ListNode(val, key);

        return head;
    }

    public boolean equals(ListNode node, int key) {
        return node.key == key;
    }
}
