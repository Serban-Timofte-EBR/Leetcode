package TreesRecap.RightSideView;

import TreesRecap.Common.TreeNode;
import java.util.*;

public class Main {
    static int total=0, passed=0;

    static void assertSize(String name, List<Integer> res, int expSize){
        total++;
        int got = (res==null) ? -1 : res.size();
        if (got == expSize) { passed++; System.out.println("[PASS] " + name); }
        else System.out.println("[FAIL] " + name + " expSize=" + expSize + " got=" + got);
    }

    public static void main(String[] args){
        Solution s = new Solution();

        TreeNode t = new TreeNode(1,
                new TreeNode(2, null, new TreeNode(5)),
                new TreeNode(3, null, new TreeNode(4)));

        assertSize("RightSide basic size", s.rightSideView(t), 3);
        assertSize("RightSide empty", s.rightSideView(null), 0);
        assertSize("RightSide single", s.rightSideView(new TreeNode(10)), 1);

        System.out.println("\nSummary: " + passed + "/" + total + " passed");
    }
}
