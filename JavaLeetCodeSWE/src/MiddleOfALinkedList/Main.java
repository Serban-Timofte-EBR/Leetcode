package MiddleOfALinkedList;

import CycledLinkList.ListNode;

public class Main {
    public static void main(String[] args) {
        ListNode head = ListNode.populateList(new int[]{1, 2, 3, 4, 5});

        Solution solution = new Solution();
        System.out.println(solution.middleNode(head));
    }
}
