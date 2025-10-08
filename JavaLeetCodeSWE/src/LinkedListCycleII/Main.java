package LinkedListCycleII;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int total=0, passed=0;

        passed += run(s, "No cycle", arr(1,2,3,4), -1, null); total++;
        passed += run(s, "Cycle at 1 (0-based)", arr(3,2,0,-4), 1, 2); total++;   // expected entry val=2
        passed += run(s, "Cycle at 0", arr(1,2), 0, 1); total++;                  // entry val=1
        passed += run(s, "Single node no cycle", arr(1), -1, null); total++;

        System.out.printf("%nSummary: %d/%d passed%n", passed, total);
    }

    private static int run(Solution s, String name, Solution.ListNode head, int pos, Integer expVal) {
        Solution.ListNode cycled = makeCycle(head, pos);
        Solution.ListNode entry = s.detectCycle(cycled);
        Integer got = (entry == null) ? null : entry.val;
        boolean ok = (expVal == null && got == null) || (expVal != null && expVal.equals(got));
        System.out.printf("[%s] %-18s -> entry=%s%n", ok ? "PASS":"FAIL", name, String.valueOf(got));
        return ok ? 1 : 0;
    }

    private static Solution.ListNode arr(int... v) {
        if (v==null || v.length==0) return null;
        Solution.ListNode d=new Solution.ListNode(0), t=d;
        for (int x: v) { t.next=new Solution.ListNode(x); t=t.next; }
        return d.next;
    }
    // pos = index (0-based) where tail connects; -1 = no cycle
    private static Solution.ListNode makeCycle(Solution.ListNode head, int pos) {
        if (head==null || pos<0) return head;
        Solution.ListNode tail = head, entry = null;
        int idx = 0;
        while (tail.next != null) {
            if (idx == pos) entry = (entry==null? tail : entry);
            tail = tail.next; idx++;
        }
        if (idx == pos) entry = tail;
        if (entry != null) tail.next = entry;
        return head;
    }
}
