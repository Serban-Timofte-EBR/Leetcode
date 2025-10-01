package TreesRecap.Balanced;

import TreesRecap.Common.TreeNode;

public class Solution {
    private int height(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int leftDepth = height(root.left);
        int rightDepth = height(root.right);
        if (Math.abs(leftDepth - rightDepth) > 1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
}
