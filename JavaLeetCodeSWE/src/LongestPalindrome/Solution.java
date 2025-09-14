package LongestPalindrome;

import java.util.HashMap;

public class Solution {
    // abccccdd = 8
    // d = 2
    // c = 4
    // a = 1
    // b = 1
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> inventory = new HashMap<>();
        for(char c : s.toCharArray()) {
            inventory.put(c, inventory.getOrDefault(c, 0) + 1);
        }

        int longestPalindromLen = 0;
        boolean hasOdds = false;

        for(int counter : inventory.values()) {
           if (counter % 2 == 0) {
               longestPalindromLen += counter;
           } else {
               longestPalindromLen += counter - 1;
               hasOdds = true;
           }
        }

        return hasOdds ? longestPalindromLen + 1 : longestPalindromLen;
    }
}
