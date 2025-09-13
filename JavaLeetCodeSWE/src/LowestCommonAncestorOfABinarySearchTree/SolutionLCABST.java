package LowestCommonAncestorOfABinarySearchTree;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class SolutionLCABST {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> pathToP = new ArrayList<>();
        List<TreeNode> pathToQ = new ArrayList<>();
        // Road to P
        TreeNode curr = root;
        while (curr != null) {
            pathToP.add(curr);
            if(curr.val == p.val) break;
            curr = (curr.val < p.val) ? curr.left: curr.right;
        }

        curr = root;
        while (curr != null) {
            pathToQ.add(curr);
            if (curr.val == q.val) break;
            curr = (curr.val < q.val) ? curr.left: curr.right;
        }

        int lenCommonPath = Math.min(pathToQ.size(), pathToP.size());
        int index = 0;
        TreeNode lastCommonAncestor = null;
        while (index < lenCommonPath && pathToP.get(index) == pathToQ.get(index)) {
            lastCommonAncestor = pathToP.get(index);
            index++;
        }

        return lastCommonAncestor;
    }

    public boolean isBST(TreeNode root) {
        return validateBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public boolean validateBST(TreeNode node, int low, int high) {
        if (node == null) return true;

        if(node.val <= low || node.val >= high) return false;

        return validateBST(node.left, low, node.val)
                && validateBST(node.right, node.val, high);
    }
}
