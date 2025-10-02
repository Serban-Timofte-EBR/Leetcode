package TreesRecap.LevelOrder;

import TreesRecap.Common.TreeNode;
import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/*
TODO (LC 102 - Binary Tree Level Order Traversal)
Cerință:
- Primești rădăcina unui arbore binar.
- Întoarce listele valorilor pe niveluri de sus în jos (fiecare nivel = o listă).
- Exemplu: pentru [3,9,20,null,null,15,7] -> [[3],[9,20],[15,7]]
- Folosește BFS (coadă) sau DFS care grupează pe nivel.
- Timp O(n), spațiu O(n) pentru rezultate și coadă.
*/
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root==null) return res;

        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> lvl = new ArrayList<>();

            for(int i=0;i<size;i++){
                TreeNode node = queue.poll();

                lvl.add(node.val);

                if(node.left!=null) queue.offer(node.left);
                if(node.right!=null) queue.offer(node.right);
            }

            res.add(lvl);
        }

        return res;
    }
}
