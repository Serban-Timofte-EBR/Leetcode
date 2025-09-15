package DiameterOfBinaryTree;

import LowestCommonAncestorOfABinarySearchTree.TreeNode;

public class Main {
    public static void main(String[] args) {
        TreeNode root = TreeNode.populateBST(new int[] {1,2,3,4,5});

        Solution s = new Solution();
        System.out.println(s.diameterOfBinaryTree(root));
    }
}
