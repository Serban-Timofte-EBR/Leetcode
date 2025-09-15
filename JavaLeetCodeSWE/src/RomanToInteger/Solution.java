package RomanToInteger;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private Map<Character, Integer> dictionary = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
    );

    public int romanToInt(String s) {
        int total = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int current = dictionary.get(s.charAt(i));
            int next =  dictionary.get(s.charAt(i+1));

            if (current >= next) {
                total += current;
            } else {
                total -= current;
            }
        }

        total += dictionary.get(s.charAt(s.length() - 1));
        return total;
    }
}
