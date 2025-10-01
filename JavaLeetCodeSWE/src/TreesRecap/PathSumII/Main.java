package TreesRecap.PathSumII;

import TreesRecap.Common.TreeNode;

import java.util.*;

public class Main {
    static int total = 0, passed = 0;

    static void assertCount(String name, List<List<Integer>> res, int expectedCount) {
        total++;
        int got = (res == null) ? -1 : res.size();
        if (got == expectedCount) {
            passed++; System.out.println("[PASS] " + name + " (count=" + got + ")");
        } else {
            System.out.println("[FAIL] " + name + " expectedCount=" + expectedCount + " got=" + got);
        }
    }

    // compară două liste de liste ca multimi (ignora ordinea drumurilor)
    static void assertPathsEquals(String name, List<List<Integer>> actual, List<List<Integer>> expected) {
        total++;
        if (equalsAsSets(actual, expected)) {
            passed++; System.out.println("[PASS] " + name);
        } else {
            System.out.println("[FAIL] " + name + "\n  expected=" + expected + "\n  actual  =" + actual);
        }
    }

    private static boolean equalsAsSets(List<List<Integer>> a, List<List<Integer>> b) {
        if (a == null || b == null) return a == b;
        if (a.size() != b.size()) return false;

        List<List<Integer>> aa = normalize(a);
        List<List<Integer>> bb = normalize(b);
        return aa.equals(bb);
    }

    private static List<List<Integer>> normalize(List<List<Integer>> lst) {
        List<List<Integer>> out = new ArrayList<>();
        for (List<Integer> path : lst) {
            List<Integer> copy = new ArrayList<>(path);
            // nu sortăm elementele din path (ordinea din drum contează),
            // doar păstrăm exact ordinea de parcurgere în path
            out.add(copy);
        }
        // sortăm lista de drumuri lexicografic pentru comparație independentă de ordinea în care au fost găsite
        out.sort((p1, p2) -> {
            int n = Math.min(p1.size(), p2.size());
            for (int i = 0; i < n; i++) {
                int cmp = Integer.compare(p1.get(i), p2.get(i));
                if (cmp != 0) return cmp;
            }
            return Integer.compare(p1.size(), p2.size());
        });
        return out;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        /*
                 5
                / \
               4   8
              /   / \
            11   13  4
           /  \      / \
          7    2    5   1
         target = 22
         căi valide:
           [5,4,11,2]
           [5,8,4,5]
        */
        TreeNode root = new TreeNode(5,
                new TreeNode(4,
                        new TreeNode(11, new TreeNode(7), new TreeNode(2)),
                        null),
                new TreeNode(8,
                        new TreeNode(13),
                        new TreeNode(4, new TreeNode(5), new TreeNode(1)))
        );

        List<List<Integer>> res1 = s.pathSum(root, 22);
        assertCount("PathSumII basic count", res1, 2);
        List<List<Integer>> expected1 = Arrays.asList(
                Arrays.asList(5, 4, 11, 2),
                Arrays.asList(5, 8, 4, 5)
        );
        assertPathsEquals("PathSumII basic paths", res1, expected1);

        // target care nu există -> listă goală
        List<List<Integer>> res2 = s.pathSum(root, 1000);
        assertCount("PathSumII no paths", res2, 0);

        // arbore gol -> listă goală
        List<List<Integer>> res3 = s.pathSum(null, 0);
        assertCount("PathSumII empty tree", res3, 0);

        // un singur nod, target egal cu valoarea nodului -> o singură cale
        TreeNode single = new TreeNode(7);
        List<List<Integer>> res4 = s.pathSum(single, 7);
        assertCount("PathSumII single node count", res4, 1);
        assertPathsEquals("PathSumII single node path", res4, Collections.singletonList(Collections.singletonList(7)));

        System.out.println("\nSummary: " + passed + "/" + total + " passed");
    }
}
