package MinimumSizeSubarrauSum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        test(sol, 7,  new int[]{2,3,1,2,4,3}, 2); // exemplu 1
        test(sol, 4,  new int[]{1,4,4},        1); // exemplu 2
        test(sol, 11, new int[]{1,1,1,1,1,1,1,1}, 0); // exemplu 3

        // edge cases & extra
        test(sol, 7,  new int[]{8},            1); // single element >= target
        test(sol, 5,  new int[]{2,3},          2); // exact sum egal cu target
        test(sol, 6,  new int[]{2,2,2},        3); // sum minim cu toate elementele
        test(sol, 7,  new int[]{2,8,3},        1); // > target pe un singur element
        test(sol, 3,  new int[]{1,1},          0); // imposibil

        System.out.println("Done.");
    }

    private static void test(Solution sol, int target, int[] nums, int expected) {
        int got = sol.minSubArrayLen(target, nums);
        if (got == expected) {
            System.out.println("PASS  target=" + target
                    + " nums=" + Arrays.toString(nums)
                    + " -> " + got);
        } else {
            System.out.println("FAIL  target=" + target
                    + " nums=" + Arrays.toString(nums)
                    + " expected=" + expected
                    + " got=" + got);
        }
    }
}
