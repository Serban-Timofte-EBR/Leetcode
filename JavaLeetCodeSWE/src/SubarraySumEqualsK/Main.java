package SubarraySumEqualsK;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int total = 0, passed = 0;

        passed += runTest(s, "Ex1 - [1,1,1], k=2", new int[]{1,1,1}, 2, 2); total++;
        passed += runTest(s, "Ex2 - [1,2,3], k=3", new int[]{1,2,3}, 3, 2); total++;

        // Overlapping subarrays
        passed += runTest(s, "Overlap - [1,1,1,1], k=2", new int[]{1,1,1,1}, 2, 3); total++;

        // Negative numbers
        passed += runTest(s, "Negatives - [-1,-1,-1], k=-2", new int[]{-1,-1,-1}, -2, 2); total++;
        passed += runTest(s, "Mixed - [1,2,-2,3,-3], k=0", new int[]{1,2,-2,3,-3}, 0, 3); total++;

        // Zeros (important edge case)
        passed += runTest(s, "Zeros n=3 - [0,0,0], k=0", new int[]{0,0,0}, 0, 6); total++;     // 3*4/2
        passed += runTest(s, "Zeros n=4 - [0,0,0,0], k=0", new int[]{0,0,0,0}, 0, 10); total++; // 4*5/2

        // Classic mixed case
        passed += runTest(s, "Classic - [3,4,7,2,-3,1,4,2], k=7",
                new int[]{3,4,7,2,-3,1,4,2}, 7, 4); total++;

        // No subarray equals k
        passed += runTest(s, "No solution - [2,4,6], k=5", new int[]{2,4,6}, 5, 0); total++;

        // Single element
        passed += runTest(s, "Single hit - [3], k=3", new int[]{3}, 3, 1); total++;
        passed += runTest(s, "Single miss - [3], k=2", new int[]{3}, 2, 0); total++;

        // k = 0 with non-zero elements
        passed += runTest(s, "k=0 no zeros - [1,2,3], k=0", new int[]{1,2,3}, 0, 0); total++;

        // Alternating +1/-1 (many zero-sum subarrays)
        passed += runTest(s, "Alt +/-1 - [1,-1,1,-1,1], k=0",
                new int[]{1,-1,1,-1,1}, 0, 6); total++;

        System.out.printf("%nSummary: %d/%d tests passed%n", passed, total);
    }

    private static int runTest(Solution s, String name, int[] nums, int k, int expected) {
        int actual = s.subarraySum(nums, k);
        boolean ok = (actual == expected);
        if (ok) {
            System.out.printf("[PASS] %s -> expected=%d, actual=%d%n", name, expected, actual);
            return 1;
        } else {
            System.out.printf("[FAIL] %s -> expected=%d, actual=%d, nums=%s, k=%d%n",
                    name, expected, actual, Arrays.toString(nums), k);
            return 0;
        }
    }
}
