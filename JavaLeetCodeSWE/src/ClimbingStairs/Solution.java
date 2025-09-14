package ClimbingStairs;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private Map<Integer, Integer> memo = new HashMap<>();
    // climbStairs(n) = climbStairs(n-1) + climbStairs(n-2)
    public int climbStairs(int n) {
        if (n==1) return 1;
        if (n==2) return 2;

        if (memo.containsKey(n)) return memo.get(n);

        int res = climbStairs(n-1)+climbStairs(n-2);
        memo.put(n, res);
        return res;
    }
}
