package LowestCommonAncestorOfABinarySearchTree;

import com.sun.source.tree.Tree;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int x) { val = x; }

    private static TreeNode insert(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (val < root.val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static TreeNode populateBST(int[] vals) {
        if (vals.length == 0) return null;

        TreeNode root = new TreeNode(vals[0]);
        for (int i = 1; i < vals.length; i++) {
            insert(root, vals[i]);
        }
        return root;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TreeNode{");
        sb.append("val=").append(val);
        sb.append('}');
        return sb.toString();
    }
}
