package TreesRecap.Zigzag;

import TreesRecap.Common.TreeNode;
import java.util.*;

public class Main {
    static int total=0, passed=0;

    static void assertRows(String name, List<List<Integer>> res, int expRows){
        total++;
        int got = (res==null) ? -1 : res.size();
        if (got == expRows) { passed++; System.out.println("[PASS] " + name); }
        else System.out.println("[FAIL] " + name + " expRows=" + expRows + " got=" + got);
    }

    public static void main(String[] args){
        Solution s = new Solution();

        TreeNode t = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)));

        assertRows("Zigzag basic rows", s.zigzagLevelOrder(t), 3);
        assertRows("Zigzag empty", s.zigzagLevelOrder(null), 0);
        assertRows("Zigzag single", s.zigzagLevelOrder(new TreeNode(1)), 1);

        System.out.println("\nSummary: " + passed + "/" + total + " passed");
    }
}
