package TreesRecap.Balanced;

import TreesRecap.Common.TreeNode;

public class Main {
    static int total=0, passed=0;
    static void assertEquals(String name, boolean exp, boolean act){
        total++; if(exp==act){passed++; System.out.println("[PASS] "+name);}
        else System.out.println("[FAIL] "+name+" exp="+exp+" got="+act);
    }
    public static void main(String[] args){
        Solution s = new Solution();

        TreeNode a = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        assertEquals("Balanced true", true, s.isBalanced(a));

        TreeNode b = new TreeNode(1,
                new TreeNode(2, new TreeNode(3,new TreeNode(4),new TreeNode(4)), new TreeNode(3)),
                new TreeNode(2));
        assertEquals("Balanced false", false, s.isBalanced(b));

        assertEquals("Balanced empty", true, s.isBalanced(null));
        System.out.println("\nSummary: "+passed+"/"+total+" passed");
    }
}
