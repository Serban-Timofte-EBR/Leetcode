package SubarraySumEqualsK;

import java.util.HashMap;

//Problem
//
//Given an integer array nums and an integer k, return the total number of continuous subarrays whose sum equals k.
//
//Example 1
//
//Input: nums = [1,1,1], k = 2
//Output: 2
//Explanation: Subarrays [1,1] (index 0..1) și [1,1] (index 1..2).
//
//Example 2
//
//Input: nums = [1,2,3], k = 3
//Output: 2
//Explanation: [1,2], [3].
//
//Constraints
//
//1 <= nums.length <= 2 * 10^4
//
//        -10^4 <= nums[i] <= 10^4
//
//        -10^7 <= k <= 10^7
public class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        freq.put(0, 1);

        int pref = 0;
        int count = 0;

        for(int num : nums){
            pref += num;
            count += freq.getOrDefault(pref - k, 0);
            freq.put(pref, freq.getOrDefault(pref, 0) + 1);
        }

        return count;
    }
}
