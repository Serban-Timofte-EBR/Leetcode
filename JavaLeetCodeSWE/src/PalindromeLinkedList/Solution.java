package PalindromeLinkedList;

import CycledLinkList.ListNode;

import java.util.Stack;

public class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> reverseList = new Stack<>();

        ListNode curr = head;
        while(curr != null) {
            System.out.println("Adding: " + curr.val);
            reverseList.push(curr.val);
            curr = curr.next;
        }

        curr = head;
        while(curr != null) {
            System.out.println("Comparing curr.val: " + curr.val + " with stack val: " + reverseList.pop());
//            if(curr.val != reverseList.pop()) return false;
            curr = curr.next;
        }

        return true;
    }
}
