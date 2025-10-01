package TreesRecap.SameTree;

import TreesRecap.Common.TreeNode;

public class Main {
    static int total=0, passed=0;
    static void assertEquals(String name, boolean exp, boolean act){
        total++; if(exp==act){passed++; System.out.println("[PASS] "+name);}
        else System.out.println("[FAIL] "+name+" exp="+exp+" got="+act);
    }
    public static void main(String[] args){
        Solution s = new Solution();

        TreeNode a1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode a2 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        assertEquals("Same true", true, s.isSameTree(a1, a2));

        TreeNode b1 = new TreeNode(1, new TreeNode(2), null);
        TreeNode b2 = new TreeNode(1, null, new TreeNode(2));
        assertEquals("Same false", false, s.isSameTree(b1, b2));

        assertEquals("Same both null", true, s.isSameTree(null, null));
        System.out.println("\nSummary: "+passed+"/"+total+" passed");
    }
}
