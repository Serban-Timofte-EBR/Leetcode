package TreesRecap.MaximumDepth;

import TreesRecap.Common.TreeNode;

public class Main {
    static int total = 0, passed = 0;

    static void assertEquals(String name, int expected, int actual) {
        total++;
        if (expected == actual) {
            passed++;
            System.out.println("[PASS] " + name + " -> expected=" + expected + ", got=" + actual);
        } else {
            System.out.println("[FAIL] " + name + " -> expected=" + expected + ", got=" + actual);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test 1: [3,9,20,null,null,15,7] => 3
        TreeNode t1 = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7))
        );
        assertEquals("Depth basic", 3, solution.maxDepth(t1));

        // Test 2: arbore gol => 0
        assertEquals("Depth empty", 0, solution.maxDepth(null));

        // Test 3: lanț spre stânga => 4
        TreeNode t3 = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(3,
                                new TreeNode(4), null),
                        null),
                null
        );
        assertEquals("Depth left-skewed", 4, solution.maxDepth(t3));

        // Test 4: un singur nod => 1
        assertEquals("Depth single node", 1, solution.maxDepth(new TreeNode(42)));

        System.out.println("\nSummary: " + passed + " / " + total + " tests passed.");
    }
}
