import struct.ListNode;
import utils.Utils;

public class Main {
    public static void main(String[] args) {
        // Example 1: Merge two non-empty lists
        int[] values1 = {1, 2, 4};
        int[] values2 = {1, 3, 4};
        ListNode list1 = Utils.createLinkedList(values1);
        ListNode list2 = Utils.createLinkedList(values2);

        System.out.print("List 1: ");
        Utils.printLinkedList(list1);
        System.out.print("List 2: ");
        Utils.printLinkedList(list2);

        ListNode mergedList = Utils.mergeTwoLinkedLists(list1, list2);
        System.out.print("Merged List: ");
        Utils.printLinkedList(mergedList);

        // Example 2: Merge when one list is empty
        int[] values3 = {};
        int[] values4 = {0};
        ListNode list3 = Utils.createLinkedList(values3);
        ListNode list4 = Utils.createLinkedList(values4);

        System.out.print("List 3: \n");
        Utils.printLinkedList(list3);
        System.out.print("List 4: ");
        Utils.printLinkedList(list4);

        ListNode mergedList2 = Utils.mergeTwoLinkedLists(list3, list4);
        System.out.print("Merged List: ");
        Utils.printLinkedList(mergedList2);
    }
}