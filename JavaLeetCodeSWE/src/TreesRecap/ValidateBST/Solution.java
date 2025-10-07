package TreesRecap.ValidateBST;

import com.sun.source.tree.Tree;

import java.util.*;

/**
 * Problem (LeetCode 98): Validate Binary Search Tree
 *
 * Given the root of a binary tree, determine if it is a valid binary search tree (BST).
 *
 * A valid BST is defined as:
 * - The left subtree of a node contains only nodes with keys strictly less than the node's key.
 * - The right subtree contains only nodes with keys strictly greater than the node's key.
 * - Both left and right subtrees must also be BSTs.
 *
 * Constraints:
 * - The number of nodes in the tree is in the range [1, 10^4].
 * - -2^31 <= Node.val <= 2^31 - 1
 */
public class Solution {
    public static class TreeNode {
        public int val;
        public TreeNode left, right;
        public TreeNode(int v) { val = v; }
        public TreeNode(int v, TreeNode l, TreeNode r) { val = v; left = l; right = r; }
    }

    private boolean validateBST(TreeNode root, Long min, Long max) {
        if (root == null) return true;

        if (root.val <= min || root.val >= max) return false;

        return validateBST(root.left, min, (long) root.val) && validateBST(root.right, (long) root.val, max);
    }

    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        return validateBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}
