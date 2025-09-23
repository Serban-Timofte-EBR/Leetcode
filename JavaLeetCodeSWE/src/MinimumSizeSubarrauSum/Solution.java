package MinimumSizeSubarrauSum;

// Input: target = 7, nums = [2,3,1,2,4,3]
// Output: 2
// Explanation: The subarray [4,3] has the minimal length under the problem constraint.

// 2 + 3 = 5 < 7
// 2 + 3 + 1 = 6 < 7
// 2 + 3 + 1 + 2 = 8 > 7 -> save the option (target is the minimal value)
// 3 + 1 = 4 < 7
// 3 + 1 + 2 = 6 < 7
// 3 + 1 + 2 + 4 = 10 > 7
// 1 + 2 = 3 < 7
// 1 + 2 + 4 = 7 -> save te option
// 2 + 4 = 6 < 7
// 2 + 4 + 3 = 9 > 7
// 4 + 3 = 7 -> save the option

public class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int left = 0;
        int sum = 0;
        int ans = Integer.MAX_VALUE;

        for(int right = 0; right < n; right++) {
            sum += nums[right];
            while (sum >= target) {
                ans = Math.min(ans, right - left + 1);
                sum -= nums[left++];
            }
        }

        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}
