import struct.ListNode;

public class Main {
    public static void main(String[] args) {
        int[] values = {3, 2, 0, -4};
        int cyclePos = 1; // Tail connects to node at index 1 (value = 2)
        ListNode cyclicList = Utils.createCycleLinkedList(values, cyclePos);
        System.out.println("Cycle detected (Example 1): " + Utils.hasCycle(cyclicList)); // true

        int[] valuesNoCycle = {1, 2};
        int noCyclePos = -1; // No cycle
        ListNode noCycleList = Utils.createCycleLinkedList(valuesNoCycle, noCyclePos);
        System.out.println("Cycle detected (Example 2): " + Utils.hasCycle(noCycleList)); // false
    }
}