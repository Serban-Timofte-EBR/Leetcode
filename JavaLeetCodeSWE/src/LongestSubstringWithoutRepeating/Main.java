package LongestSubstringWithoutRepeating;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int total = 0, passed = 0;

        passed += run(s, "Ex1 - abcabcbb", "abcabcbb", 3); total++;
        passed += run(s, "Ex2 - bbbbb", "bbbbb", 1); total++;
        passed += run(s, "Ex3 - pwwkew", "pwwkew", 3); total++;

        // Edge cases
        passed += run(s, "Empty", "", 0); total++;
        passed += run(s, "Single space", " ", 1); total++;

        // Diverse
        passed += run(s, "All unique", "abcdef", 6); total++;
        passed += run(s, "abba", "abba", 2); total++;
        passed += run(s, "dvdf", "dvdf", 3); total++;
        passed += run(s, "tmmzuxt", "tmmzuxt", 5); total++;
        passed += run(s, "au", "au", 2); total++;
        passed += run(s, "anviaj", "anviaj", 5); total++;

        // Mix cu spații și simboluri
        passed += run(s, "a b c a b c", "a b c a b c", 3); total++;

        System.out.printf("%nSummary: %d/%d tests passed%n", passed, total);
    }

    private static int run(Solution s, String name, String input, int expected) {
        int actual = s.lengthOfLongestSubstring(input);
        boolean ok = (actual == expected);
        if (ok) {
            System.out.printf("[PASS] %-18s -> expected=%d, actual=%d%n", name, expected, actual);
            return 1;
        } else {
            System.out.printf("[FAIL] %-18s -> expected=%d, actual=%d, s=\"%s\"%n", name, expected, actual, input);
            return 0;
        }
    }
}
