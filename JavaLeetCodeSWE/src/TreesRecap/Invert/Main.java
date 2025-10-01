package TreesRecap.Invert;

import TreesRecap.Common.TreeNode;

public class Main {
    static int total=0, passed=0;
    static void assertEquals(String name, int expLeft, int expRight, TreeNode root){
        total++;
        int l = root.left!=null?root.left.val:Integer.MIN_VALUE;
        int r = root.right!=null?root.right.val:Integer.MIN_VALUE;
        boolean ok = (l==expLeft && r==expRight);
        if(ok){passed++; System.out.println("[PASS] "+name);}
        else System.out.println("[FAIL] "+name+" expL="+expLeft+" expR="+expRight+" gotL="+l+" gotR="+r);
    }
    public static void main(String[] args){
        Solution s = new Solution();

        TreeNode t = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        TreeNode inv = s.invertTree(t);
        assertEquals("Invert simple", 3, 1, inv);

        TreeNode single = new TreeNode(5);
        TreeNode inv2 = s.invertTree(single);
        total++; if(inv2.val==5 && inv2.left==null && inv2.right==null){passed++; System.out.println("[PASS] single");}
        else System.out.println("[FAIL] single");

        System.out.println("\nSummary: "+passed+"/"+total+" passed");
    }
}
