package TreesRecap.Diameter;

import TreesRecap.Common.TreeNode;

public class Main {
    static int total=0, passed=0;
    static void assertEquals(String name, int exp, int act){
        total++; if(exp==act){passed++; System.out.println("[PASS] "+name);}
        else System.out.println("[FAIL] "+name+" exp="+exp+" got="+act);
    }
    public static void main(String[] args){
        Solution s = new Solution();

        TreeNode t = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3));
        assertEquals("Diameter classic", 3, s.diameterOfBinaryTree(t));

        assertEquals("Diameter single", 0, s.diameterOfBinaryTree(new TreeNode(7)));

        assertEquals("Diameter empty", 0, s.diameterOfBinaryTree(null));

        System.out.println("\nSummary: "+passed+"/"+total+" passed");
    }
}
