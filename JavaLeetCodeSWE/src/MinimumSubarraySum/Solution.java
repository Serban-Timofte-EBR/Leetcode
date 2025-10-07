package MinimumSubarraySum;

/**
 * Problem (LeetCode 209): Minimum Size Subarray Sum
 *
 * Given an array of positive integers nums and a positive integer target,
 * return the minimal length of a contiguous subarray of which the sum is >= target.
 * If there is no such subarray, return 0.
 *
 * Constraints:
 * 1 <= target <= 10^9
 * 1 <= nums.length <= 10^5
 * 1 <= nums[i] <= 10^4
 */
public class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int best = Integer.MAX_VALUE;
        int sum = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum >= target) {
                best = Math.min(best, right - left + 1);
                sum -= nums[left++];
            }
        }

        return best == Integer.MAX_VALUE ? 0 : best;
    }
}
