package BackspaceStringCompare;

import java.util.Stack;

public class Solution {
//    "y#fo##f", "y#f#o##f"
    public String writeStringInNotepad(String s) {
        Stack<Character> typingWord = new Stack<>();
//        y#f#o##f

        for(char c : s.toCharArray()) {
            if (c == '#') {
                if (typingWord.isEmpty()) continue;
                typingWord.pop();
            } else {
                typingWord.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        while(!typingWord.isEmpty()) {
            sb.append(typingWord.pop());
        }

        System.out.println(sb.toString());
        return sb.toString();
    }

    public boolean backspaceCompare(String s, String t) {
        return writeStringInNotepad(s).equals(writeStringInNotepad(t));
    }
}
