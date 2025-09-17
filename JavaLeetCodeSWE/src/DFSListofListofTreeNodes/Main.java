package DFSListofListofTreeNodes;

import LowestCommonAncestorOfABinarySearchTree.TreeNode;

public class Main {
    public static void main(String[] args) {
        TreeNode root = TreeNode.populateBST(new int[] {9,3,20,15,7});

        Solution solution = new Solution();
        solution.levelOrder(root);
    }
}
