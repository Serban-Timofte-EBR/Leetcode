package TreesRecap.PathSumI;

import TreesRecap.Common.TreeNode;

public class Main {
    static int total=0, passed=0;
    static void assertEquals(String name, boolean exp, boolean act){
        total++; if(exp==act){passed++; System.out.println("[PASS] "+name);}
        else System.out.println("[FAIL] "+name+" exp="+exp+" got="+act);
    }
    public static void main(String[] args){
        Solution s = new Solution();

        TreeNode t = new TreeNode(5,
                new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null),
                new TreeNode(8, new TreeNode(13), new TreeNode(4, null, new TreeNode(1))));
        assertEquals("PathSum true", true, s.hasPathSum(t, 22));

        assertEquals("PathSum false", false, s.hasPathSum(t, 28));

        assertEquals("PathSum empty", false, s.hasPathSum(null, 0));

        System.out.println("\nSummary: "+passed+"/"+total+" passed");
    }
}
