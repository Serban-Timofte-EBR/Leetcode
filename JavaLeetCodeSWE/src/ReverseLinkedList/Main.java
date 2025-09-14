package ReverseLinkedList;

import CycledLinkList.ListNode;

public class Main {
    public static void main(String[] args) {
        ListNode head = ListNode.populateList(new int[]{1, 2, 3, 4, 5});
        ListNode.printList(head);

        Solution solution = new Solution();

        ListNode headReverse = solution.reverseList(head);
        ListNode.printList(headReverse);
    }
}
