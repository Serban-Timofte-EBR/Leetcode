package TreesRecap.Symmetric;

import TreesRecap.Common.TreeNode;

public class Main {
    static int total=0, passed=0;
    static void assertEquals(String name, boolean exp, boolean act){
        total++; if(exp==act){passed++; System.out.println("[PASS] "+name);}
        else System.out.println("[FAIL] "+name+" exp="+exp+" got="+act);
    }
    public static void main(String[] args){
        Solution s = new Solution();

        TreeNode sym = new TreeNode(1,
                new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(2, new TreeNode(4), new TreeNode(3)));
        assertEquals("Sym true", true, s.isSymmetric(sym));

        TreeNode ns = new TreeNode(1, new TreeNode(2,null,new TreeNode(3)), new TreeNode(2,null,new TreeNode(3)));
        assertEquals("Sym false", false, s.isSymmetric(ns));

        assertEquals("Sym empty", true, s.isSymmetric(null));
        System.out.println("\nSummary: "+passed+"/"+total+" passed");
    }
}
