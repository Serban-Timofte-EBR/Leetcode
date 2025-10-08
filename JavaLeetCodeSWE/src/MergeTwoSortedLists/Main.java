package MergeTwoSortedLists;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int total=0, passed=0;

        passed += run(s, "Ex1", arr(1,2,4), arr(1,3,4), arr(1,1,2,3,4,4)); total++;
        passed += run(s, "One empty", null, arr(0), arr(0)); total++;
        passed += run(s, "Both empty", null, null, null); total++;
        passed += run(s, "Negatives", arr(-3,-1,2), arr(-2,0,3), arr(-3,-2,-1,0,2,3)); total++;

        System.out.printf("%nSummary: %d/%d passed%n", passed, total);
    }

    private static int run(Solution s, String name, Solution.ListNode a, Solution.ListNode b, Solution.ListNode exp) {
        Solution.ListNode res = s.mergeTwoLists(a, b);
        boolean ok = Objects.equals(toList(res), toList(exp));
        System.out.printf("[%s] %-12s -> %s%n", ok ? "PASS":"FAIL", name, toList(res));
        return ok ? 1 : 0;
    }

    private static Solution.ListNode arr(int... v) {
        if (v == null || v.length==0) return null;
        Solution.ListNode dummy = new Solution.ListNode(0), t = dummy;
        for (int x: v) { t.next = new Solution.ListNode(x); t = t.next; }
        return dummy.next;
    }
    private static List<Integer> toList(Solution.ListNode h) {
        List<Integer> out = new ArrayList<>();
        while (h != null) { out.add(h.val); h = h.next; }
        return out;
    }
}
