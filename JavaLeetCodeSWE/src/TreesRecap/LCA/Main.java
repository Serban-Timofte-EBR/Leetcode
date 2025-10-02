package TreesRecap.LCA;

import TreesRecap.Common.TreeNode;

public class Main {
    static int total = 0, passed = 0;

    static void assertEquals(String name, int expected, TreeNode actual) {
        total++;
        if (actual != null && expected == actual.val) {
            passed++;
            System.out.println("[PASS] " + name + " -> expected=" + expected + ", got=" + actual.val);
        } else {
            System.out.println("[FAIL] " + name + " -> expected=" + expected + ", got=" + (actual == null ? "null" : actual.val));
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        /*
                 3
                / \
               5   1
              / \  / \
             6  2 0   8
               / \
              7   4
        */
        TreeNode root = new TreeNode(3,
                new TreeNode(5,
                        new TreeNode(6),
                        new TreeNode(2, new TreeNode(7), new TreeNode(4))
                ),
                new TreeNode(1,
                        new TreeNode(0),
                        new TreeNode(8)
                )
        );

        TreeNode n5 = root.left;              // 5
        TreeNode n1 = root.right;             // 1
        TreeNode n6 = root.left.left;         // 6
        TreeNode n4 = root.left.right.right;  // 4
        TreeNode n7 = root.left.right.left;   // 7
        TreeNode n8 = root.right.right;       // 8

        // Test 1: LCA(5,1) = 3
        assertEquals("LCA(5,1)", 3, sol.lowestCommonAncestor(root, n5, n1));

        // Test 2: LCA(6,4) = 5
        assertEquals("LCA(6,4)", 5, sol.lowestCommonAncestor(root, n6, n4));

        // Test 3: LCA(7,4) = 2
        assertEquals("LCA(7,4)", 2, sol.lowestCommonAncestor(root, n7, n4));

        // Test 4: LCA(6,8) = 3
        assertEquals("LCA(6,8)", 3, sol.lowestCommonAncestor(root, n6, n8));

        // Test 5: LCA(5,5) = 5 (same node)
        assertEquals("LCA(5,5)", 5, sol.lowestCommonAncestor(root, n5, n5));

        System.out.println("\nSummary: " + passed + "/" + total + " tests passed.");
    }
}
