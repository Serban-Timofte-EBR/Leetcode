package DFSListofListofTreeNodes;

import LowestCommonAncestorOfABinarySearchTree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public void levelOrder(TreeNode root) {
        Queue<TreeNode> visitors = new LinkedList<>();

        visitors.add(root);

        while(!visitors.isEmpty()) {
            TreeNode curr = visitors.poll();
            System.out.printf(curr.val + " ");
            if(curr.left != null) visitors.add(curr.left);
            if(curr.right != null) visitors.add(curr.right);
        }
    }
}
