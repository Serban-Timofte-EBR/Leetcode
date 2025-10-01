package TreesRecap.PathSumI;

import TreesRecap.Common.TreeNode;

public class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;

        int rem =  targetSum - root.val;

        if (root.left == null && root.right == null && rem == 0) return true;

        return hasPathSum(root.left,rem) ||  hasPathSum(root.right,rem);
    }
}
