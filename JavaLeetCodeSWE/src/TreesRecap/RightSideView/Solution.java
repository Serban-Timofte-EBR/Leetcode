package TreesRecap.RightSideView;

import TreesRecap.Common.TreeNode;
import com.sun.source.tree.Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/*
TODO (LC 199 - Binary Tree Right Side View)
Cerință:
- Primești rădăcina unui arbore binar.
- Întoarce lista valorilor "vizibile din dreapta" (un singur nod per nivel).
- Idei:
  - BFS pe niveluri: la fiecare nivel, ia ultimul nod procesat.
  - Sau DFS (preorder) cu prioritate pe dreapta și inserezi primul nod întâlnit pe acel nivel.
- Timp O(n), spațiu O(n).
*/
public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;

        Deque<TreeNode> visingQueue = new ArrayDeque<>();
        visingQueue.offer(root);

        while (!visingQueue.isEmpty()) {
            int size = visingQueue.size();
            int counter = 0;

            for (int i = 0; i < size; i++) {
                TreeNode curr = visingQueue.poll();

                if (counter == size - 1) res.add(curr.val);

                if (curr.left != null) visingQueue.offer(curr.left);
                if (curr.right != null) visingQueue.offer(curr.right);
                counter++;
            }
        }

        return res;
    }
}
