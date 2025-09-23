package LongestRepeatingCharacterReplacement;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        test(sol, "ABAB", 2, 4);          // ex. clasic: devine "BBBB"
        test(sol, "AABABBA", 1, 4);       // ex. clasic: "AABB" / "ABBB"
        test(sol, "AAAA", 2, 4);          // deja toate egale
        test(sol, "BAAAB", 2, 5);         // poți face tot șirul
        test(sol, "ABC", 0, 1);           // fără înlocuiri
        test(sol, "A", 10, 1);            // un singur caracter
        test(sol, "ABBB", 2, 4);          // deja aproape uniform
        test(sol, "ABABBA", 3, 6);        // tot șirul cu 2 schimbări
        test(sol, "safdasf", 1, 2);       // case random (ex: "sas" / "afa" / "sfs")

        System.out.println("Done.");
    }

    private static void test(Solution sol, String s, int k, int expected) {
        int got = sol.characterReplacement(s, k);
        if (got == expected) {
            System.out.println("PASS  s=\"" + s + "\", k=" + k + " -> " + got);
        } else {
            System.out.println("FAIL  s=\"" + s + "\", k=" + k
                    + " expected=" + expected + " got=" + got);
        }
    }
}
