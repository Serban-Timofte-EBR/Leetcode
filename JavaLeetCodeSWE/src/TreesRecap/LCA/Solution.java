package TreesRecap.LCA;

import TreesRecap.Common.TreeNode;
import com.sun.source.tree.Tree;

/*
TODO (LC 236 - Lowest Common Ancestor of a Binary Tree)
Cerință:
- Primești rădăcina arborelui și două noduri p și q (referințe din arbore).
- Întoarce cel mai de jos strămoș comun (LCA) al lui p și q.
- Logică clasică DFS:
  - dacă root este null/p/q, întoarce root.
  - caută în stânga și dreapta: dacă ambele non-null -> root e LCA; altfel întoarce partea non-null.
- Timp O(n), spațiu O(h).

  p = 5   q = 1
        3
       / \
      5    1
     / \  / \
    6  2 0   8
      / \
     7   4

*/
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null) return root;
        return left != null ? left : right;
    }
}
