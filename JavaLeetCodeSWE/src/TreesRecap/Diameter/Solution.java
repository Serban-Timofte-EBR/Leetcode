package TreesRecap.Diameter;

import TreesRecap.Common.TreeNode;

public class Solution {
    private int depth = 0;

    private int height(TreeNode node) {
        if (node == null) return 0;
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        depth = Math.max(depth,  leftHeight + rightHeight);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        this.depth = 0;
        height(root);
        return this.depth;
    }
}
