package TreesRecap.Zigzag;

import TreesRecap.Common.TreeNode;

import java.util.*;

/*
TODO (LC 103 - Binary Tree Zigzag Level Order Traversal)
Cerință:
- Primești rădăcina unui arbore binar.
- Întoarce valorile pe niveluri alternând direcția:
  nivel 0: stânga -> dreapta, nivel 1: dreapta -> stânga, nivel 2: stânga -> dreapta, etc.
- Exemplu: [3,9,20,null,null,15,7] -> [[3],[20,9],[15,7]]
- Poți folosi BFS cu deque sau liste și inversare pe nivele impare.
- Timp O(n), spațiu O(n).
*/
public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (root == null) return res;

        Deque<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        int level = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean normalIteration = level % 2 == 0;
            List<Integer> lvl = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                if (normalIteration) {
                   TreeNode node = queue.pollFirst();
                   lvl.add(node.val);

                   if(node.left != null) queue.addLast(node.left);
                   if(node.right != null) queue.addLast(node.right);
                } else {
                    TreeNode node = queue.pollLast();
                    lvl.add(node.val);

                    if(node.left != null) queue.addFirst(node.left);
                    if(node.right != null) queue.addFirst(node.right);
                }
            }

            level++;
            res.add(lvl);
        }

        return res;
    }
}
