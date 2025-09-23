package LongestRepeatingCharacterReplacement;

import java.util.HashMap;
import java.util.Map;

// A A B A B B A -> vream sa cautam o relatie de tipul o litera este de n ori si cealalta de n - k  ori
// 0 1 2 3 4
// A A B A B  -> 4 - 0 + 1 - 3 = 2
public class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> counter = new HashMap<>();
        int left = 0;
        int ans = 0;
        int maxFreq = 0;

        for(int right = 0; right < s.length(); right++) {
            counter.put(s.charAt(right), counter.getOrDefault(s.charAt(right), 0) + 1);
            maxFreq = Math.max(maxFreq, counter.get(s.charAt(right)));

            while (right - left + 1 - maxFreq > k) {
                char lc =  s.charAt(left);
                counter.put(lc, counter.get(lc) - 1);
                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}
