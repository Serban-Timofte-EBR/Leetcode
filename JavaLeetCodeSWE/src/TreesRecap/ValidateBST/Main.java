package TreesRecap.ValidateBST;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int total = 0, passed = 0;

        // Test 1: valid small
        Solution.TreeNode t1 = n(2, n(1), n(3));
        passed += test(s, "Valid small", t1, true); total++;

        // Test 2: invalid nested bound
        //      5
        //     / \
        //    1   4
        //       / \
        //      3   6
        Solution.TreeNode t2 = n(5, n(1), n(4, n(3), n(6)));
        passed += test(s, "Invalid nested bound", t2, false); total++;

        // Test 3: duplicate on left
        Solution.TreeNode t3 = n(2, n(2), n(3));
        passed += test(s, "Duplicate on left", t3, false); total++;

        // Test 4: duplicate on right
        Solution.TreeNode t4 = n(2, n(1), n(2));
        passed += test(s, "Duplicate on right", t4, false); total++;

        // Test 5: right-skew valid
        Solution.TreeNode t5 = n(1, null, n(2, null, n(3, null, n(4))));
        passed += test(s, "Right skew valid", t5, true); total++;

        // Test 6: hidden violation
        //        10
        //       /  \
        //      5   15
        //         /  \
        //        6   20
        Solution.TreeNode t6 = n(10, n(5), n(15, n(6), n(20)));
        passed += test(s, "Hidden violation", t6, false); total++;

        // Test 7: min/max boundaries
        Solution.TreeNode t7 = n(Integer.MIN_VALUE, null, n(Integer.MAX_VALUE));
        passed += test(s, "Min/Max boundaries", t7, true); total++;

        System.out.printf("%nSummary: %d/%d tests passed%n", passed, total);
    }

    private static int test(Solution s, String name, Solution.TreeNode root, boolean expected) {
        boolean actual = s.isValidBST(root);
        boolean ok = (actual == expected);
        if (ok) {
            System.out.printf("[PASS] %-22s → expected=%s, actual=%s%n", name, expected, actual);
            return 1;
        } else {
            System.out.printf("[FAIL] %-22s → expected=%s, actual=%s%n", name, expected, actual);
            return 0;
        }
    }

    private static Solution.TreeNode n(int v) {
        return new Solution.TreeNode(v);
    }

    private static Solution.TreeNode n(int v, Solution.TreeNode l) {
        return new Solution.TreeNode(v, l, null);
    }

    private static Solution.TreeNode n(int v, Solution.TreeNode l, Solution.TreeNode r) {
        return new Solution.TreeNode(v, l, r);
    }
}
