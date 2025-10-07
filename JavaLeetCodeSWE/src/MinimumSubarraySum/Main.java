package MinimumSubarraySum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int total = 0, passed = 0;

        passed += run(s, "Ex1", 7, new int[]{2,3,1,2,4,3}, 2); total++;
        passed += run(s, "Ex2", 4, new int[]{1,4,4}, 1); total++;
        passed += run(s, "Ex3", 11, new int[]{1,1,1,1,1,1,1,1}, 0); total++;
        passed += run(s, "Exact hit", 6, new int[]{2,3,1}, 3); total++;
        passed += run(s, "Single element OK", 3, new int[]{1,2,3,4}, 1); total++;
        passed += run(s, "Large tail", 15, new int[]{5,1,3,5,10,7,4,9,2,8}, 2); total++;
        passed += run(s, "No solution", 100, new int[]{1,2,3,4,5}, 0); total++;

        System.out.printf("%nSummary: %d/%d tests passed%n", passed, total);
    }

    private static int run(Solution s, String name, int target, int[] nums, int expected) {
        int actual = s.minSubArrayLen(target, nums);
        boolean ok = (actual == expected);
        if (ok) {
            System.out.printf("[PASS] %-20s target=%d, nums=%s, expected=%d, actual=%d%n",
                    name, target, Arrays.toString(nums), expected, actual);
            return 1;
        } else {
            System.out.printf("[FAIL] %-20s target=%d, nums=%s, expected=%d, actual=%d%n",
                    name, target, Arrays.toString(nums), expected, actual);
            return 0;
        }
    }
}
