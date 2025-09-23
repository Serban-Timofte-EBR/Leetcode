package ReverseTreeNode;

public class Solution {
    private static int depth(Node x) {
        int d = 0;
        while (x != null && x.parent != null) {
            d++;
            x = x.parent;
        }
        return d;
    }

    public static boolean sameLevel(Node a, Node b) {
        if (a == null || b == null) return a == b;
        return depth(a) == depth(b);
    }
}
