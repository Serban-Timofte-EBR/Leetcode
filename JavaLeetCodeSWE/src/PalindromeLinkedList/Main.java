package PalindromeLinkedList;

import CycledLinkList.ListNode;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListNode head = ListNode.populateList(new int[]{1, 2, 2, 1});
        Solution solution = new Solution();
        solution.isPalindrome(head);
    }
}
