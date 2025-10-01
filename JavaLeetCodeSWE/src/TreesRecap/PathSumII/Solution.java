package TreesRecap.PathSumII;

import TreesRecap.Common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private void dfs(TreeNode node, int targetSum, List<Integer> path, List<List<Integer>> res){
        if (node == null) return;

        path.add(node.val);

        if  (node.left == null && node.right == null && targetSum == node.val){
            res.add(new ArrayList<>(path));
        } else {
            int rem = targetSum - node.val;
            dfs(node.left,rem,path,res);
            dfs(node.right,rem,path,res);
        }

        path.removeLast();
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(root, targetSum, new ArrayList<>(), res);
        return res;
    }
}
