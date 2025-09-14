package RansomNote;

import java.util.HashMap;

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> stock = new HashMap<>();
        for(char c : magazine.toCharArray()) {
            stock.put(c, stock.getOrDefault(c, 0) + 1);
        }

        for(char c : ransomNote.toCharArray()) {
            int availableChars =  stock.getOrDefault(c, 0);
            if (availableChars == 0) {
                return false;
            }
            stock.put(c, availableChars - 1);
        }

        return true;
    }

    public boolean canConstruct2(String ransomNote, String magazine) {
        int[] stock = new int[26];
        for(char c : magazine.toCharArray()) {
           stock[c - 'a']++;
        }

        for(char c : ransomNote.toCharArray()) {
           if (stock[c - 'a'] == 0) {
               return false;
           }
           stock[c - 'a']--;
        }

        return true;
    }
}
