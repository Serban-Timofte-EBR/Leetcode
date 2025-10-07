package LongestSubstringWithoutRepeating;

import java.util.*;

/**
 * Problem (LeetCode 3): Longest Substring Without Repeating Characters
 *
 * Given a string s, find the length of the longest substring without repeating characters.
 *
 * Examples
 * Input: s = "abcabcbb"   Output: 3   Explanation: "abc"
 * Input: s = "bbbbb"      Output: 1   Explanation: "b"
 * Input: s = "pwwkew"     Output: 3   Explanation: "wke"
 *
 * Constraints:
 * 0 <= s.length <= 5 * 10^4
 * s consists of English letters, digits, symbols and spaces.
 */
public class Solution {

    // pwwkew
    // pww -> conflict
    // wkew -> conflict
    // kew
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty())
            return 0;

        int best = 0;
        int left = 0;

        int[] last = new int[128];
        Arrays.fill(last, -1);

        for (int i = 0; i < s.length(); i++) {
            char ch  = s.charAt(i);
            int prev = last[ch];

            if (prev >= left) {
                left = prev + 1;
            }

            last[ch] = i;
            best = Math.max(best, i - left + 1);
        }

        return best;
    }
}
