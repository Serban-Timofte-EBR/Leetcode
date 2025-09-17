package LongestSubstring;

import java.util.TreeMap;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        TreeMap<Integer, String> map = new TreeMap<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (sb.indexOf(String.valueOf(ch)) != -1) {
                map.put(sb.length(), sb.toString());
                sb.setLength(0);
            }

            sb.append(ch);
        }

        if (sb.length() > 0) {
            map.put(sb.length(), sb.toString());
        }

        return map.lastEntry().getValue().length();
    }
}
